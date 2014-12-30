package com.glacier.frame.util;

import java.lang.reflect.Method;
import java.sql.ResultSet;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.apache.shiro.SecurityUtils;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import com.glacier.basic.util.DBHelper;
import com.glacier.basic.util.RandomGUID;
import com.glacier.jqueryui.util.JqReturnJson;
import com.glacier.frame.entity.system.Action;
import com.glacier.frame.entity.system.User;

@Aspect
@Component
public class MethodLogAspectJ {

    Map<String, Action> panelActionIndexMap = new HashMap<String, Action>();

    /**
     * 
     * @Title: compentConstruct
     * @Description: TODO(初始化该组件的时候自动调用，进行方法的初始化)
     * @param
     * @throws 备注
     *             <p>
     *             已检查测试:Green
     *             <p>
     */
    @PostConstruct
    public void compentConstruct() {

        StringBuilder sqlStr = new StringBuilder();
        sqlStr.append("select ");
        sqlStr.append("temp_action.action_id as temp_action_action_id, temp_action.menu_id as temp_action_menu_id, ");
        sqlStr.append("temp_action.panel_id as temp_action_panel_id, ");
        sqlStr.append("temp_action.action_cn_name as temp_action_action_cn_name, ");
        sqlStr.append("temp_action.action_en_name as temp_action_action_en_name, temp_action.icon_cls as temp_action_icon_cls, ");
        sqlStr.append("temp_action.type as temp_action_type, temp_action.disabled as temp_action_disabled, ");
        sqlStr.append("temp_action.method as temp_action_method, temp_action.order_num as temp_action_order_num, ");
        sqlStr.append("temp_action.remark as temp_action_remark ");
        sqlStr.append(",temp_menu.menu_en_name as temp_action_menuEnName ");
        sqlStr.append(",temp_menu.menu_cn_name as temp_action_menuCnName ");
        sqlStr.append(",temp_panel.panel_cn_name as temp_action_panel_cn_name ");
        sqlStr.append(",temp_panel.panel_en_name as temp_action_panel_en_name ");
        sqlStr.append("from t_action temp_action INNER JOIN t_menu temp_menu ON temp_action.menu_id = temp_menu.menu_id INNER JOIN t_panel temp_panel ON temp_action.panel_id = temp_panel.panel_id ORDER BY temp_action.order_num ASC");

        ResultSet rs = DBHelper.executeQuery(sqlStr.toString());// 为了提高性能，同时解除Web和Bean的耦合，这里使用了jdbc方式进行数据获取

        try {
            while (rs.next()) {// 遍历返回数据，进行字符串构造
                Action actionTemp = new Action();
                // actionTemp.setActionId(rs.getString("temp_action_action_id"));
                // actionTemp.setMenuId(rs.getString("temp_action_menu_id"));
                actionTemp.setActionCnName(rs.getString("temp_action_action_cn_name"));
                actionTemp.setActionEnName(rs.getString("temp_action_action_en_name"));
                actionTemp.setMenuEnName(rs.getString("temp_action_menuEnName"));
                actionTemp.setMenuCnName(rs.getString("temp_action_menuCnName"));
                actionTemp.setPanelCnName(rs.getString("temp_action_panel_cn_name"));
                actionTemp.setPanelEnName(rs.getString("temp_action_panel_en_name"));
                // actionTemp.setIconCls(rs.getString("temp_action_icon_cls"));
                // actionTemp.setType(ActionType.valueOf(rs.getString("temp_action_type")));
                // actionTemp.setDisabled(ActionDisabled.valueOf(rs.getString("temp_action_disabled")));
                // actionTemp.setMethod(rs.getString("temp_action_method"));
                // actionTemp.setOrderNum(rs.getInt("temp_action_order_num"));
                // actionTemp.setRemark(rs.getString("temp_action_remark"));
                String permissionStr = actionTemp.getPanelEnName() + "_" + actionTemp.getActionEnName();
                panelActionIndexMap.put(permissionStr, actionTemp);
            }
            DBHelper.free(rs);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Pointcut("@annotation(com.glacier.frame.util.MethodLog)")
    public void methodCachePointcut() {
    }

    /**
     * 
     * @Title: methodCacheHold
     * @Description: TODO(此方法后期用来记录用户的操作日志)
     * @param @param joinPoint
     * @param @return
     * @param @throws Throwable
     * @return Object
     * @throws
     */
    @SuppressWarnings("rawtypes")
    @Around("methodCachePointcut()")
    public Object methodCacheHold(ProceedingJoinPoint joinPoint) throws Throwable {
        try {
            Object result = null;// 方法执行结果
            result = joinPoint.proceed();// 处理完毕，进行日志写入
            String targetName = joinPoint.getTarget().getClass().getName();// 目标类
            String methodName = joinPoint.getSignature().getName();// 目标方法
            boolean success = false;// 操作结果
            String operaInfo = "";// 通知
            String methode = "";// 操作描述
            String operator = ((User) SecurityUtils.getSubject().getPrincipal()).getUserCnName();
            Object[] arguments = joinPoint.getArgs();
            Class targetClass = Class.forName(targetName);
            Method[] method = targetClass.getMethods();
            for (Method m : method) {
                if (m.getName().equals(methodName)) {
                    Class[] tmpCs = m.getParameterTypes();
                    if (tmpCs.length == arguments.length) {
                        MethodLog methodCache = m.getAnnotation(MethodLog.class);
                        methode = methodCache.opera();
                        break;
                    }
                }
            }
            if (result instanceof JqReturnJson) {
                success = ((JqReturnJson) result).isSuccess();
                operaInfo = ((JqReturnJson) result).getMsg();
            }
            if (panelActionIndexMap.containsKey(methode)) {
                Action action = panelActionIndexMap.get(methode);
                StringBuilder insertSql = new StringBuilder();

                insertSql.append("insert into t_operalog (operalog_id, opera_menu, opera_penal, ");
                insertSql.append(" opera_method, opera_result, opera_desc, ");
                insertSql.append(" opera_class, opera_md, opera_key, ");
                insertSql.append(" operator, opera_time)");
                insertSql.append(" values (?,?,?,?,?,?,?,?,?,?,?)");

                DBHelper.executeNonQuery(insertSql.toString(), RandomGUID.getRandomGUID(), action.getMenuCnName(), action.getPanelCnName(), action.getActionCnName(), success, operaInfo, targetName,
                        methodName, methode, operator, new Date());
            }

            return result;
        } catch (Exception e) {
            // 异常处理记录日志..log.error(e);
            throw e;
        }
    }
}

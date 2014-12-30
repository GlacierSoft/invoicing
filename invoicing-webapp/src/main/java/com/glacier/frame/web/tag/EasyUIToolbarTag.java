/**
 * @author xichao.dong   
 * @email 406592176@qq.com
 * @date 2014-8-15 上午8:50:38 
 * @company (开发公司)    珠海市冰川软件有限公司
 * @copyright (版权)    本文件归属珠海市冰川软件有限公司所有
 * @version V1.0
 * @modify (修改) : 2014-8-15 上午8:50:38  xichao.dong 
 * @Review (审核人) ：xichao.dong 
 */
package com.glacier.frame.web.tag;

import java.sql.ResultSet;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;

import com.glacier.basic.util.DBHelper;
import com.glacier.frame.entity.common.util.CommonStatus;
import com.glacier.frame.entity.system.Action;
import com.glacier.frame.entity.system.util.ActionType;

/**
 * @ClassName: EasyUIToolbarTag 
 * @Description: TODO(通过Shiro控制EasyUI显示内容，自定义标签根据用户权限获取页面数据) 
 * @author xichao.dong	
 * @email 406592176@qq.com
 * @date 2014-8-28 下午5:36:05
 */
public class EasyUIToolbarTag extends TagSupport {

    private static final long serialVersionUID = 435348957983475982L;

    /**
     * 生成的toolbar div 的唯一Id
     */
    private String toolbarId;

    /**
     * 用户调用的页面menuEnName
     */
    private String menuEnName;

    /**
     * 操作所在面板英文名称
     */
    private String panelEnName;

    public String getToolbarId() {
        return toolbarId;
    }

    public void setToolbarId(String toolbarId) {
        this.toolbarId = toolbarId;
    }

    public String getMenuEnName() {
        return menuEnName;
    }

    public void setMenuEnName(String menuEnName) {
        this.menuEnName = menuEnName;
    }

    

    public String getPanelEnName() {
        return panelEnName;
    }

    public void setPanelEnName(String panelEnName) {
        this.panelEnName = panelEnName;
    }

    @Override
    public int doStartTag() throws JspException {
        try {
            Subject subject = SecurityUtils.getSubject();// 获取通过认证主体

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
            sqlStr.append(",temp_panel.panel_cn_name as temp_action_panel_cn_name ");
            sqlStr.append(",temp_panel.panel_en_name as temp_action_panel_en_name ");
            sqlStr.append("from t_action temp_action INNER JOIN t_menu temp_menu ON temp_action.menu_id = temp_menu.menu_id INNER JOIN t_panel temp_panel ON temp_action.panel_id = temp_panel.panel_id WHERE temp_menu.menu_en_name = ? AND temp_panel.panel_en_name = ? ORDER BY temp_action.order_num ASC");

            Object[] obj = new Object[]{menuEnName,panelEnName};
            
            ResultSet rs = DBHelper.executeQuery(sqlStr.toString(), obj);// 为了提高性能，同时解除Web和Bean的耦合，这里使用了jdbc方式进行数据获取

            StringBuilder returnStr = new StringBuilder("<div id=\"" + this.toolbarId + "\" class=\"easyui-toolbar\">");

            while (rs.next()) {// 遍历返回数据，进行字符串构造
                
                Action actionTemp = new Action();
                actionTemp.setActionId(rs.getString("temp_action_action_id"));
                actionTemp.setMenuId(rs.getString("temp_action_menu_id"));
                actionTemp.setActionCnName(rs.getString("temp_action_action_cn_name"));
                actionTemp.setActionEnName(rs.getString("temp_action_action_en_name"));
                actionTemp.setPanelCnName(rs.getString("temp_action_panel_cn_name"));
                actionTemp.setPanelEnName(rs.getString("temp_action_panel_en_name"));
                actionTemp.setIconCls(rs.getString("temp_action_icon_cls"));
                actionTemp.setType(ActionType.valueOf(rs.getString("temp_action_type")));
                actionTemp.setDisabled(CommonStatus.valueOf(rs.getString("temp_action_disabled")));
                actionTemp.setMethod(rs.getString("temp_action_method"));
                actionTemp.setOrderNum(rs.getInt("temp_action_order_num"));
                actionTemp.setRemark(rs.getString("temp_action_remark"));
                actionTemp.setMenuEnName(rs.getString("temp_action_menuEnName"));
                String permissionStr = actionTemp.getMenuEnName() + ":" + actionTemp.getPanelEnName()+"_"+actionTemp.getActionEnName();
                if (subject.isPermitted(permissionStr)) {// 权限验证通过
                    returnStr.append("<a id=\"" + actionTemp.getMenuEnName() + "_btn_" + actionTemp.getPanelEnName() + "_" + actionTemp.getActionEnName() + "\" class=\"easyui-linkbutton\" data-options=\"plain:true");
                    returnStr.append(",disabled:" + actionTemp.getDisabled().getValue());
                    if (!"".equals(actionTemp.getIconCls())) {
                        returnStr.append(",iconCls:'" + actionTemp.getIconCls() + "'\"");
                    }
                    if (ActionType.Button.equals(actionTemp.getType()) && !"".equals(actionTemp.getMethod())) {
                        returnStr.append(" onclick=\"" + actionTemp.getMethod() + "\" href=\"javascript:void(0);\"");
                    } else if (ActionType.Link.equals(actionTemp.getType()) && !"".equals(actionTemp.getMethod())) {
                        returnStr.append(" href=\"" + actionTemp.getMethod() + "\"");
                    }

                    returnStr.append(" >"+actionTemp.getActionCnName()+" </a><div class=\"dialog-tool-separator\"></div>");
                }
            }
            returnStr.append(" </div>");
            this.pageContext.getOut().println(returnStr.toString().toCharArray());// 输出到页面
            DBHelper.free(rs);// 关闭链接
        } catch (Exception e) {
            e.printStackTrace();
        }
        return SKIP_BODY;
    }
}

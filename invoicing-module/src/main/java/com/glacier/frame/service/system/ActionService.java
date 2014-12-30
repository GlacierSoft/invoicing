/**
 * @Title: ActionService.java 
 * @Package com.glacier.frame.service.system 
 * @author songjundong   
 * @email 985776597@qq.com
 * @date 2014-8-18  下午4:53:05
 * @company (开发公司)    珠海市冰川软件有限公司
 * @copyright (版权)    本文件归属珠海市冰川软件有限公司所有
 * @version V1.0
 * @modify (修改) 
 *        	<p>
				第一次修改：
				时间：2014-8-18
				修改人：songjundong 
				修改内容简介 ：
			</p>              
 * @Review (审核人) ：songjundong
 * 
 */
package com.glacier.frame.service.system;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.glacier.basic.util.CollectionsUtil;
import com.glacier.basic.util.RandomGUID;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.jqueryui.util.JqReturnJson;
import com.glacier.frame.dao.system.ActionMapper;
import com.glacier.frame.dao.system.AuthorityMapper;
import com.glacier.frame.entity.system.Action;
import com.glacier.frame.entity.system.ActionExample;
import com.glacier.frame.entity.system.ActionExample.Criteria;
import com.glacier.frame.util.MethodLog;

/*** 
 * @ClassName:  ActionService
 * @Description: TODO(操作管理)
 * @author songjundong
 * @email 985776597@QQ.com
 * @date 2014-8-18  下午4:53:05
 */

@Service
@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
public class ActionService {

    @Autowired
    private ActionMapper actionMapper;

    @Autowired
    private AuthorityMapper authorityMapper;

    /** 
     * @Title: listAsGrid
     * @Description: TODO(以组表格结构展示操作列表，操作中必须定义getGroup()方法)
     * @param @param menuId 动作对应的菜单Id
     * @param @param pager 分页参数
     * @param @return 设定文件
     * @return Object 返回类型
     * @throws
     */
    public Object listAsGrid(String menuId, String panenId, JqPager pager) {
        JqGridReturn returnResult = new JqGridReturn();
        if (StringUtils.isNotBlank(menuId)) {// 当菜单对应的menuId有意义的时候，才会进行数据库查询
            ActionExample actionExample = new ActionExample();
            Criteria actionCriteria = actionExample.createCriteria();
            actionCriteria.andMenuIdEqualTo(menuId);
            if (StringUtils.isNotBlank(panenId)) {
                actionCriteria.andPanelIdEqualTo(panenId);
            }
            if (null != pager.getPage() && null != pager.getRows()) {// 设置排序信息
                actionExample.setLimitStart((pager.getPage() - 1) * pager.getRows());
                actionExample.setLimitEnd(pager.getRows());
            }
            if (StringUtils.isNotBlank(pager.getSort()) && StringUtils.isNotBlank(pager.getOrder())) {// 设置排序信息
                actionExample.setOrderByClause("temp_panel.order_num ASC," + pager.getOrderBy("temp_action_"));// 必须外键inner
            }
            List<Action> actions = actionMapper.selectByExample(actionExample); // 查询所有操作列表
            int total = actionMapper.countByExample(actionExample); // 查询总页数
            returnResult.setRows(actions);
            returnResult.setTotal(total);
        }
        return returnResult;// 返回ExtGrid表
    }

    /**
     * @Title: addAction
     * @Description: TODO(增加操作)
     * @param @param action
     * @param @return 设定文件
     * @return Object 返回类型
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "ActionList_add")
    public Object addAction(Action action) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        ActionExample actionExample = new ActionExample();
        int count = 0;
        // 防止操作名称重复
        actionExample.createCriteria().andActionCnNameEqualTo(action.getActionCnName()).andMenuIdEqualTo(action.getMenuId()).andPanelIdEqualTo(action.getPanelId());
        count = actionMapper.countByExample(actionExample);// 查找相同中文名称的菜单数量
        if (count > 0) {
            returnResult.setMsg("操作名称重复");
            return returnResult;
        }
        // 防止英文名称重复
        actionExample.clear();
        actionExample.createCriteria().andActionEnNameEqualTo(action.getActionEnName()).andMenuIdEqualTo(action.getMenuId()).andPanelIdEqualTo(action.getPanelId());
        count = actionMapper.countByExample(actionExample);// 查找相同英文名称的菜单数量
        if (count > 0) {
            returnResult.setMsg("操作名称重复");
            return returnResult;
        }
        action.setActionId(RandomGUID.getRandomGUID());
        count = actionMapper.insert(action);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + action.getActionCnName() + "] 操作信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，操作信息保存失败");
        }
        return returnResult;
    }

    /**
     * @Title: editAction
     * @Description: TODO(修改操作)
     * @param @param action
     * @param @return 设定文件
     * @return Object 返回类型
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "ActionList_edit")
    public Object editAction(Action action) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        ActionExample actionExample = new ActionExample();
        int count = 0;
        // 防止操作名称重复
        actionExample.createCriteria().andActionIdNotEqualTo(action.getActionId()).andActionCnNameEqualTo(action.getActionCnName()).andMenuIdEqualTo(action.getMenuId())
                .andPanelIdEqualTo(action.getPanelId());
        count = actionMapper.countByExample(actionExample);// 查找相同中文名称的菜单数量
        if (count > 0) {
            returnResult.setMsg("操作名称重复");
            return returnResult;
        }
        // 防止英文名称重复
        actionExample.clear();
        actionExample.createCriteria().andActionIdNotEqualTo(action.getActionId()).andActionEnNameEqualTo(action.getActionEnName()).andMenuIdEqualTo(action.getMenuId())
                .andPanelIdEqualTo(action.getPanelId());
        count = actionMapper.countByExample(actionExample);// 查找相同英文名称的菜单数量
        if (count > 0) {
            returnResult.setMsg("操作名称重复");
            return returnResult;
        }
        count = actionMapper.updateByPrimaryKey(action);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + action.getActionCnName() + "] 操作信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，操作信息保存失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: delAction
     * @Description: TODO(删除操作)
     * @param @param action
     * @param @return 设定文件
     * @return Object 返回类型
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "ActionList_del")
    public Object delActions(List<String> actionIds, List<String> actionCnNames) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        if (actionIds.size() > 0) {
            ActionExample actionExample = new ActionExample();
            actionExample.createCriteria().andActionIdIn(actionIds);
            // 方便操作日志记录
            count = actionMapper.deleteByExample(actionExample);
            if (count > 0) {
                returnResult.setSuccess(true);
                returnResult.setMsg("成功删除了[ " + CollectionsUtil.convertToString(actionCnNames, ",") + " ]操作!");
            } else {
                returnResult.setMsg("发生未知错误，操作删除失败");
            }
        }
        return returnResult;
    }
}

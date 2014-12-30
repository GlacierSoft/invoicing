/**
 * @Title: PanelService.java 
 * @Package com.glacier.permissions.service 
 * @author zhenfei.zhang   
 * @email 289556866@qq.com
 * @date 2014-8-18 下午4:00:46 
 * @company (开发公司)    珠海市冰川软件有限公司
 * @copyright (版权)    本文件归属珠海市冰川软件有限公司所有
 * @version V1.0
 * @modify (修改) 
 *        	<p>
				第一次修改：
				时间：2014-8-18
				修改人：zhenfei.zhang 
				修改内容简介 ：新建面板业务类
			</p>              
 * @Review (审核人) ：zhenfei.zhang
 * 
 */
package com.glacier.frame.service.system;

import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.glacier.basic.util.RandomGUID;
import com.glacier.jqueryui.util.Item;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.jqueryui.util.JqReturnJson;
import com.glacier.frame.dao.system.ActionMapper;
import com.glacier.frame.dao.system.PanelMapper;
import com.glacier.frame.entity.system.ActionExample;
import com.glacier.frame.entity.system.Panel;
import com.glacier.frame.entity.system.PanelExample;
import com.glacier.frame.util.MethodLog;

/**
 * @ClassName: PanelService
 * @Description: TODO(面板业务类：为控制器提供服务)
 * @author zhenfei.zhang
 * @email 289556866@qq.com
 * @date 2014-8-18 下午4:00:46
 */
@Service
@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
public class PanelService {

    @Autowired
    private PanelMapper panelMapper;
    
    @Autowired
    private ActionMapper actionMapper;

    /**
     * @Title: listAsGrid
     * @Description: TODO(以Grid结构展示面板列表)
     * @param @param menuId 面板对应的菜单Id
     * @param @param pager 分页参数
     * @param @return 设定文件
     * @return Object 返回类型
     * @throws
     */
    public Object listAsGrid(String menuId, JqPager pager) {
        JqGridReturn returnResult = new JqGridReturn();
        if (StringUtils.isNotBlank(menuId)) {// 当面板对应的menuId有意义的时候，才会进行数据库查询
            PanelExample panelExample = new PanelExample();
            panelExample.createCriteria().andMenuIdEqualTo(menuId);
            if (null != pager.getPage() && null != pager.getRows()) {// 设置排序信息
                panelExample.setLimitStart((pager.getPage() - 1) * pager.getRows());
                panelExample.setLimitEnd(pager.getRows());
            }
            if (StringUtils.isNotBlank(pager.getSort()) && StringUtils.isNotBlank(pager.getOrder())) {// 设置排序信息
                panelExample.setOrderByClause(pager.getOrderBy("temp_panel_"));
            }
            List<Panel> panels = panelMapper.selectByExample(panelExample); // 查询所有操作列表
            int total = panelMapper.countByExample(panelExample); // 查询总页数
            returnResult.setRows(panels);
            returnResult.setTotal(total);
        }
        return returnResult;// 返回ExtGrid表
    }

    /**
     * @Title: getPanelsByMenuId
     * @Description: TODO(根据菜单ID获取面板数据)
     * @param @param menuId
     * @param @return 符合Item的Combobox的面板数据
     * @throws 备注
     * <p>
     * 已检查测试:Green
     * <p>
     */
    public Object getPanelsByMenuId(String menuId) {
        if (StringUtils.isNotBlank(menuId)) {
            PanelExample panelExample = new PanelExample();
            panelExample.createCriteria().andMenuIdEqualTo(menuId);
            panelExample.setOrderByClause("temp_panel_order_num ASC");
            List<Panel> panels = panelMapper.selectByExample(panelExample);
            List<Item> returnObject = new ArrayList<Item>();
            for (int i = 0; i < panels.size(); i++) {
                Item item = new Item();
                item.setLabel(panels.get(i).getPanelId());
                item.setValue(panels.get(i).getPanelCnName());
                returnObject.add(item);
            }
            return returnObject;
        }
        return "";
    }

    /**
     * @Title: addPanel
     * @Description: TODO(增加面板)
     * @param @param panel
     * @param @return
     * @throws 备注
     * <p>
     * 已检查测试:Green
     * <p>
     */
    @Transactional(readOnly = false)
    @MethodLog(opera ="PanelList_add")
    public Object addPanel(Panel panel) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        PanelExample panelExample = new PanelExample();
        int count = 0;
        // 防止面板名称重复
        panelExample.createCriteria().andPanelCnNameEqualTo(panel.getPanelCnName());
        count = panelMapper.countByExample(panelExample);// 查找相同中文名称的面板数量
        if (count > 0) {
            returnResult.setMsg("面板名称重复，请重新填写!");
            return returnResult;
        }
        // 防止英文名称重复
        panelExample.clear();
        panelExample.createCriteria().andPanelEnNameEqualTo(panel.getPanelEnName());
        count = panelMapper.countByExample(panelExample);// 查找相同英文名称的菜单数量
        if (count > 0) {
            returnResult.setMsg("英文名称重复，请重新填写!");
            return returnResult;
        }
        panel.setPanelId(RandomGUID.getRandomGUID());
        count = panelMapper.insert(panel);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + panel.getPanelCnName() + "] 面板信息已保存");
        } else {
            returnResult.setMsg("面板信息保存失败，请联系管理员!");
        }
        return returnResult;
    }

    /**
     * @Title: editPanel
     * @Description: TODO(修改面板)
     * @param @param panel
     * @param @return
     * @throws 备注
     * <p>
     * 已检查测试:Green
     * <p>
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "PanelList_edit")
    public Object editPanel(Panel panel) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        PanelExample panelExample = new PanelExample();
        int count = 0;
        // 防止面板名称重复
        panelExample.createCriteria().andPanelIdNotEqualTo(panel.getPanelId()).andPanelCnNameEqualTo(panel.getPanelCnName());
        count = panelMapper.countByExample(panelExample);// 查找相同中文名称的面板数量
        if (count > 0) {
            returnResult.setMsg("面板名称重复，请重新填写!");
            return returnResult;
        }
        // 防止英文名称重复
        panelExample.clear();
        panelExample.createCriteria().andPanelIdNotEqualTo(panel.getPanelId()).andPanelEnNameEqualTo(panel.getPanelEnName());
        count = panelMapper.countByExample(panelExample);// 查找相同英文名称的菜单数量
        if (count > 0) {
            returnResult.setMsg("英文名称重复，请重新填写!");
            return returnResult;
        }
        count = panelMapper.updateByPrimaryKey(panel);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + panel.getPanelCnName() + "] 面板信息已保存");
        } else {
            returnResult.setMsg("面板信息保存失败，请联系管理员!");
        }
        return returnResult;
    } 
    
    /*** 
     * @Title: delPanel  
     * @Description: TODO(删除面板)  
     * @param @param panel
     * @param @return    设定文件  
     * @return Object    返回类型  
     * @throws
     */ 
    @Transactional(readOnly = false)
    @MethodLog(opera = "PanelList_del")
    public Object delPanel(Panel panel){
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        //删除面板必须先删除面板对应的操作
        ActionExample actionExample = new ActionExample();
        actionExample.createCriteria().andPanelIdEqualTo(panel.getPanelId());
        count = actionMapper.countByExample(actionExample);
        if (count > 0) {
            returnResult.setSuccess(false);
            returnResult.setMsg("该面板下存在对应的操作，请先删除其操作再尝试!");
            return returnResult;
        }
        //删除面板
        count = panelMapper.deleteByPrimaryKey(panel.getPanelId());
        if (count > 0) {
            returnResult.setSuccess(true);
            returnResult.setMsg("成功删除名称为：[ "+panel.getPanelCnName()+" ]面板");
            return returnResult;
        }
        returnResult.setMsg("发生未知错误，[ "+panel.getPanelCnName()+" ]面板删除失败");
        return returnResult;
    }
}

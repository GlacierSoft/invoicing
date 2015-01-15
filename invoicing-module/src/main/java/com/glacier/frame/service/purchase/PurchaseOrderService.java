/**
 * @Title: PurchaseOrderService.java 
 * @Package com.glacier.frame.service.purchase 
 * @author song.jundong   
 * @email 985776597@qq.com
 * @date 2015-1-15 上午11:28:58 
 * @company (开发公司)    珠海市冰川软件有限公司
 * @copyright (版权)    本文件归属珠海市冰川软件有限公司所有
 * @version V1.0
 * @modify (修改) 
 *        	<p>
				第一次修改：
				时间：2015-1-15
				修改人：song.jundong 
				修改内容简介 ：
			</p>              
 * @Review (审核人) ：song.jundong 
 * 
 */
package com.glacier.frame.service.purchase;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.glacier.basic.util.CollectionsUtil;
import com.glacier.basic.util.RandomGUID; 
import com.glacier.frame.dao.purchase.PurchaseOrderMapper;
import com.glacier.frame.dto.query.purchase.PurchaseOrderQueryDTO;
import com.glacier.frame.entity.purchase.PurchaseOrder;
import com.glacier.frame.entity.purchase.PurchaseOrderExample;
import com.glacier.frame.entity.purchase.PurchaseOrderExample.Criteria;
import com.glacier.frame.entity.system.User;
import com.glacier.frame.util.MethodLog;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.jqueryui.util.JqReturnJson;

/**
 * @ClassName:  PurchaseOrderService
 * @Description: TODO(采购合同service)
 * @author songjundong
 * @email 985776597@QQ.com
 * @date 2015-1-15  上午11:28:58
 */ 
@Service
@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
public class PurchaseOrderService {

	 
	@Autowired
    private PurchaseOrderMapper chaseOrderMapper;
	 
	 /***
	  * @Title: getPurchaseOrder  
	  * @Description: TODO(根据id获取采购订购合同)  
	  * @param @param purchaseOrderId
	  * @param @return    设定文件  
	  * @return Object    返回类型  
	  * @throws
	  */
    public Object getPurchaseOrder(String purchaseOrderId) {
        return chaseOrderMapper.selectByPrimaryKey(purchaseOrderId);
    } 
      
    /**
     * @Title: listAsGrid
     * @Description: TODO(获取所有采购订购合同信息)
     * @param @param optgroupId
     * @param @param pager
     * @param @return 设定文件
     * @return Object 返回类型
     * @throws
     */ 
    public Object listAsGrid(JqPager jqPager, PurchaseOrderQueryDTO purchaseOrderQueryDTO) {
        JqGridReturn returnResult = new JqGridReturn();
        PurchaseOrderExample purchaseOrderExample = new PurchaseOrderExample(); 
        Criteria queryCriteria = purchaseOrderExample.createCriteria();
        purchaseOrderQueryDTO.setQueryCondition(queryCriteria);
        if (null != jqPager.getPage() && null != jqPager.getRows()) {// 设置排序信息 
        	purchaseOrderExample.setLimitStart((jqPager.getPage() - 1) * jqPager.getRows());
        	purchaseOrderExample.setLimitEnd(jqPager.getRows());
        }
         if (StringUtils.isNotBlank(jqPager.getSort()) && StringUtils.isNotBlank(jqPager.getOrder())) {// 设置排序信息
        	 purchaseOrderExample.setOrderByClause(jqPager.getOrderBy("temp_purchaseOrder_"));
        } 
        List<PurchaseOrder>  carrierCarTypeList = chaseOrderMapper.selectByExample(purchaseOrderExample); // 查询所有列表
        int total = chaseOrderMapper.countByExample(purchaseOrderExample); // 查询总页数
        returnResult.setRows(carrierCarTypeList);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }
    
     /**
      * 
      * @Title: addPurchaseOrder  
      * @Description: TODO(新增采购订购合同)  
      * @param @param Suppliers
      * @param @return    设定文件  
      * @return Object    返回类型  
      * @throws
      */
    @Transactional(readOnly = false)
    @MethodLog(opera = "PurchaseOrderList_add")
    public Object addPurchaseOrder(PurchaseOrder purchaseOrder) {
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false 
        int count = 0; 
        SimpleDateFormat sf=new SimpleDateFormat("dd-hh-ss");
        purchaseOrder.setSupplierId(RandomGUID.getRandomGUID()); 
        purchaseOrder.setOrderCode("CGDD-"+sf.format(new Date()));
        purchaseOrder.setAuditState("authstr");
        purchaseOrder.setEnabled("enable");
        purchaseOrder.setCreater(pricipalUser.getUserCnName());
        purchaseOrder.setCreateTime(new Date());
        purchaseOrder.setUpdater(pricipalUser.getUserCnName());
        purchaseOrder.setUpdateTime(new Date());
        count = chaseOrderMapper.insert(purchaseOrder);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，信息保存失败");
        }
        return returnResult;
    }
      
     /** 
      * @Title: editPurchaseOrder  
      * @Description: TODO(这修改采购订购合同信息)  
      * @param @param purchaseOrder
      * @param @return    设定文件  
      * @return Object    返回类型  
      * @throws
      */
    @Transactional(readOnly = false) 
    @MethodLog(opera = "PurchaseOrderList_edit")
    public Object editPurchaseOrder(PurchaseOrder purchaseOrder) {
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false 
        int count = 0;  
        purchaseOrder.setUpdater(pricipalUser.getUserCnName());
        purchaseOrder.setUpdateTime(new Date());
        count = chaseOrderMapper.updateByPrimaryKeySelective(purchaseOrder);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，信息保存失败");
        }
        return returnResult;
    }
    
    /** 
     * @Title: delPurchaseOrder  
     * @Description: TODO(删除采购订购合同信息)  
     * @param @param purchaseOrderIds
     * @param @param names
     * @param @return    设定文件  
     * @return Object    返回类型  
     * @throws
     */
    @Transactional(readOnly = false) 
    @MethodLog(opera = "PurchaseOrderList_del")
    public Object delPurchaseOrder(List<String> purchaseOrderIds, List<String> names) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        if (purchaseOrderIds.size() > 0) {
        	PurchaseOrderExample purchaseOrderExample = new PurchaseOrderExample();
        	purchaseOrderExample.createCriteria().andPurOrderIdIn(purchaseOrderIds);
            count = chaseOrderMapper.deleteByExample(purchaseOrderExample);
            if (count > 0) {
                returnResult.setSuccess(true);
                returnResult.setMsg("成功删除了采购订购合同为:[ " + CollectionsUtil.convertToString(names, ",") + " ]的信息");
            } else {
                returnResult.setMsg("发生未知错误，信息删除失败");
            }
        }
        return returnResult;
    } 


}

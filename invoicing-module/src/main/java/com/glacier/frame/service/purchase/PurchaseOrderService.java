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

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
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
import com.glacier.frame.dao.purchase.PurchaseOrderDetailMapper;
import com.glacier.frame.dto.query.purchase.PurchaseOrderQueryDTO;
import com.glacier.frame.entity.purchase.PurchaseOrder;
import com.glacier.frame.entity.purchase.PurchaseOrderDetail;
import com.glacier.frame.entity.purchase.PurchaseOrderDetailExample;
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
	 
	@Autowired
    private PurchaseOrderDetailMapper chaseOrderDetailMapper;
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
    public Object addPurchaseOrder(PurchaseOrder purchaseOrder,List<PurchaseOrderDetail> list) {
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false 
        int count = 0; 
        SimpleDateFormat sf=new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss");
        purchaseOrder.setPurOrderId(RandomGUID.getRandomGUID()); 
        if(purchaseOrder.getInvoice().equals("启用")){
        	purchaseOrder.setInvoice("yes");
        }else{
        	purchaseOrder.setInvoice("no");
        } 
        purchaseOrder.setOrderCode("CGDD-"+sf.format(new Date()));//采购订单编号
        purchaseOrder.setOrderState("exeIng");//合同状态，默认执行中
        purchaseOrder.setArrState("noneArr");//到货状态，默认未到货
        purchaseOrder.setPayState("nonePay");//付款状态，默认未付款
        purchaseOrder.setInvState("noneInv");//开票状态，默认未开票
        purchaseOrder.setNotArrAmo(purchaseOrder.getTotalAmount());//未到货金额
        purchaseOrder.setAlrArrAmo(new BigDecimal(0));//已到货金额
        purchaseOrder.setNotPayAmo(purchaseOrder.getTotalAmount());//未付款金额
        purchaseOrder.setAlrPayAmo(new BigDecimal(0));//已付款金额
        purchaseOrder.setNotInvAmo(purchaseOrder.getTotalAmount());//未开发票金额
        purchaseOrder.setAlrInvAmo(new BigDecimal(0));//已开发票金额
        purchaseOrder.setAuditState("authstr");
        purchaseOrder.setEnabled("enable");
        purchaseOrder.setCreater(pricipalUser.getUserCnName());
        purchaseOrder.setCreateTime(new Date());
        purchaseOrder.setUpdater(pricipalUser.getUserCnName());
        purchaseOrder.setUpdateTime(new Date());
        count = chaseOrderMapper.insert(purchaseOrder); 
        //添加合同明细
        for (PurchaseOrderDetail detail : list) {
        	detail.setPurOrderDetId(RandomGUID.getRandomGUID());
        	detail.setPurOrderId(purchaseOrder.getPurOrderId());//订购合同id
        	detail.setNotArrNum(0);//未到货数量
        	detail.setAlrArrNum(0);//已到货数量
        	detail.setNotPayNum(0);//未付款数量
        	detail.setAlrPayNum(0);//已付款数量
        	detail.setNotInvNum(0);//未开票数量
        	detail.setAlrInvNum(0);//已开票数量
        	detail.setNotTerNum(0);//未终止数量
        	detail.setAlrTerNum(0);//已终止数量
        	detail.setNotTerMoney(new BigDecimal(0));//未终止金额
        	detail.setAlrTerMoney(new BigDecimal(0));//已终止金额
        	chaseOrderDetailMapper.insert(detail);
		}
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
    public Object editPurchaseOrder(PurchaseOrder purchaseOrder,List<PurchaseOrderDetail> list) {
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal(); 
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false 
        int count = 0;  
        purchaseOrder.setUpdater(pricipalUser.getUserCnName());
        purchaseOrder.setUpdateTime(new Date());
        count = chaseOrderMapper.updateByPrimaryKeySelective(purchaseOrder);
        //查询出该合同的所有明细信息
        PurchaseOrderDetailExample chaseOrderDetailExample=new PurchaseOrderDetailExample();
        chaseOrderDetailExample.createCriteria().andPurOrderIdEqualTo(purchaseOrder.getPurOrderId());
        List<PurchaseOrderDetail> detailList=chaseOrderDetailMapper.selectByExample(chaseOrderDetailExample); 
        List<String> orderDetailList=new ArrayList<String>();//用于存放删除了的id 
        //用迭代器挑选出前台删除了的货物，然后在数据库清除多余的数据
        Iterator<PurchaseOrderDetail> iterOne = detailList.iterator(); //后台原有的数据 
        while(iterOne.hasNext()){  
        	PurchaseOrderDetail order = iterOne.next();  
        	for (PurchaseOrderDetail str : list) {
        		if(order.getPurOrderDetId().equals(str.getPurOrderDetId())){  
        			iterOne.remove();  
                }
			} 
        }    
      	//如何集合里还有数据，就说明删除了数据
      	if(detailList.size()>0){
      		//把删除了货品明细id存放在集合里
      		for (PurchaseOrderDetail ord : detailList) { 
          		orderDetailList.add(ord.getPurOrderDetId()); 
    		}
      		//执行批量删除，提高效率
      		PurchaseOrderDetailExample detailExample = new PurchaseOrderDetailExample();
      		detailExample.createCriteria().andPurOrderDetIdIn(orderDetailList); 
            chaseOrderDetailMapper.deleteByExample(detailExample); 
      	} 
        //修改合同明细  
        for (PurchaseOrderDetail detail : list) {    
        	 //存在id就修改
        	if(detail.getPurOrderDetId()!=null){   
        		chaseOrderDetailMapper.updateByPrimaryKeySelective(detail);
        	}else{ //不存在id就新增  
        		detail.setPurOrderDetId(RandomGUID.getRandomGUID());
            	detail.setPurOrderId(purchaseOrder.getPurOrderId());//订购合同id
            	detail.setNotArrNum(0);//未到货数量
            	detail.setAlrArrNum(0);//已到货数量
            	detail.setNotPayNum(0);//未付款数量
            	detail.setAlrPayNum(0);//已付款数量
            	detail.setNotInvNum(0);//未开票数量
            	detail.setAlrInvNum(0);//已开票数量
            	detail.setNotTerNum(0);//未终止数量
            	detail.setAlrTerNum(0);//已终止数量
            	detail.setNotTerMoney(new BigDecimal(0));//未终止金额
            	detail.setAlrTerMoney(new BigDecimal(0));//已终止金额
            	chaseOrderDetailMapper.insert(detail);
        	} 
		}  
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
        	for (String id : purchaseOrderIds) {
        		PurchaseOrderDetailExample purchaseOrderDetailExample=new PurchaseOrderDetailExample();
        		purchaseOrderDetailExample.createCriteria().andPurOrderIdEqualTo(id); 
        		chaseOrderDetailMapper.deleteByExample(purchaseOrderDetailExample);
			} 
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
    
    /** 
     * @Title: enablePurchaseOrder  
     * @Description: TODO(启用订购合同)  
     * @param @return    设定文件  
     * @return Object    返回类型  
     * @throws
     */
    @Transactional(readOnly = false) 
    @MethodLog(opera = "PurchaseOrderList_enable")
    public Object enablePurchaseOrder(List<String> purchaseOrderIds){
    	  JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
    	  Subject pricipalSubject = SecurityUtils.getSubject();
          User pricipalUser = (User) pricipalSubject.getPrincipal(); 
    	  int count=0;
    	  if (purchaseOrderIds.size() > 0) {
          	for (String id : purchaseOrderIds) {
          		PurchaseOrder order=chaseOrderMapper.selectByPrimaryKey(id);
          		order.setEnabled("enable"); 
          		order.setUpdater(pricipalUser.getUserCnName());
          		order.setUpdateTime(new Date());
                count = chaseOrderMapper.updateByPrimaryKeySelective(order);
  			} 
            if (count > 0) {
                returnResult.setSuccess(true);
                returnResult.setMsg("订购合同启用成功！");
            } else {
                returnResult.setMsg("发生未知错误，启用操作失败");
            }
          }
    	  return returnResult; 
    } 
    
    /** 
     * @Title: disablePurchaseOrder  
     * @Description: TODO(禁用订购合同)  
     * @param @return    设定文件  
     * @return Object    返回类型  
     * @throws
     */
    @Transactional(readOnly = false) 
    @MethodLog(opera = "PurchaseOrderList_disable")
    public Object disablePurchaseOrder(List<String> purchaseOrderIds){
    	  JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
    	  Subject pricipalSubject = SecurityUtils.getSubject();
          User pricipalUser = (User) pricipalSubject.getPrincipal(); 
    	  int count=0;
    	  if (purchaseOrderIds.size() > 0) {
          	for (String id : purchaseOrderIds) {
          		PurchaseOrder order=chaseOrderMapper.selectByPrimaryKey(id);
          		order.setEnabled("disable"); 
          		order.setUpdater(pricipalUser.getUserCnName());
          		order.setUpdateTime(new Date());
                count = chaseOrderMapper.updateByPrimaryKeySelective(order);
  			} 
            if (count > 0) {
                returnResult.setSuccess(true);
                returnResult.setMsg("订购合同禁用成功！");
            } else {
                returnResult.setMsg("发生未知错误，禁用操作失败");
            }
          }
    	  return returnResult; 
    }
     
    /** 
     * @Title: auditPurchaseOrder  
     * @Description: TODO(审核)  
     * @param @param purchaseOrderIds
     * @param @return    设定文件  
     * @return Object    返回类型  
     * @throws
     */ 
    @Transactional(readOnly = false) 
    @MethodLog(opera = "PurchaseOrderList_audit")
    public Object auditPurchaseOrder(PurchaseOrder purchaseOrder){
  	  JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
  	  Subject pricipalSubject = SecurityUtils.getSubject();
      User pricipalUser = (User) pricipalSubject.getPrincipal(); 
  	  int count=0;
  	  PurchaseOrder order=chaseOrderMapper.selectByPrimaryKey(purchaseOrder.getPurOrderId());
  	  if(purchaseOrder.getAuditState().equals("authstr")){
  		  returnResult.setMsg("审核状态不能为审核中！");
  		  return returnResult; 
  	  }
	  if(order.getAuditState().equals("authstr")){ 
		  order.setAuditState(purchaseOrder.getAuditState());
		  order.setAuditor(pricipalUser.getUserCnName());
		  order.setAuditRemark(purchaseOrder.getAuditRemark());
		  order.setAuditDate(new Date());
		  count = chaseOrderMapper.updateByPrimaryKeySelective(order);
	  }else{
		  returnResult.setMsg("该订单已经进行过审核操作！");
  		  return returnResult; 
	  }  
      if (count > 0) {
          returnResult.setSuccess(true);
          returnResult.setMsg("订购合同审核操作成功！");
      } else {
          returnResult.setMsg("发生未知错误，审核操作失败");
      }  
  	  return returnResult; 
  }
    
    /** 
     * @Title: cancelAuditPurchaseOrder  
     * @Description: TODO(取消审核)  
     * @param @param purchaseOrderIds
     * @param @return    设定文件  
     * @return Object    返回类型  
     * @throws
     */ 
    @Transactional(readOnly = false) 
    @MethodLog(opera = "PurchaseOrderList_cancelAudit")
    public Object cancelAuditPurchaseOrder(String purchaseOrderId){
  	  JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
      int count=0;
  	  PurchaseOrder order=chaseOrderMapper.selectByPrimaryKey(purchaseOrderId);
      order.setAuditState("authstr");
	  order.setAuditor("");
	  order.setAuditRemark(""); 
	  Date time=null;
	  order.setAuditDate(time);
	  count = chaseOrderMapper.updateByPrimaryKey(order); 
      if (count > 0) {
          returnResult.setSuccess(true);
          returnResult.setMsg("取消订购合同审核操作成功！");
      } else {
          returnResult.setMsg("发生未知错误，取消审核操作失败");
      }  
  	  return returnResult; 
  }
    
}

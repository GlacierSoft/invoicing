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
import com.glacier.frame.dao.purchase.PurchaseArrivalDetailMapper;
import com.glacier.frame.dao.purchase.PurchaseArrivalMapper;
import com.glacier.frame.dao.purchase.PurchaseOrderMapper;
import com.glacier.frame.dao.purchase.PurchaseOrderDetailMapper;
import com.glacier.frame.dto.query.purchase.PurchaseOrderQueryDTO;
import com.glacier.frame.entity.purchase.PurchaseArrival;
import com.glacier.frame.entity.purchase.PurchaseArrivalDetail;
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
	private PurchaseArrivalMapper purchaseArrivalMapper;
	
	@Autowired
	private PurchaseArrivalDetailMapper purchaseArrivalDetailMapper;
	
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
     * @Title: getGoodsId  
     * @Description: TODO(通过订购id获取属于该合同的商品id)  
     * @param @param purchaseOrderId
     * @param @return    设定文件  
     * @return Object    返回类型  
     * @throws
     */
   public Object getGoodsId(String purchaseOrderId) { 
	   PurchaseOrderDetailExample purchaseOrderDetailExample=new PurchaseOrderDetailExample();
	   purchaseOrderDetailExample.createCriteria().andPurOrderIdEqualTo(purchaseOrderId);
	   List<PurchaseOrderDetail> list=chaseOrderDetailMapper.selectByExample(purchaseOrderDetailExample);
	   List<String> goodsId=new ArrayList<String>();
	   if(list.size()>0){
		   for (PurchaseOrderDetail detail : list) {
			   goodsId.add(detail.getGoodsId());
		   }
	   } 
       return goodsId;
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
        purchaseOrder.setAuditState("pass");//添加成功就默认为审核通过
        purchaseOrder.setAuditDate(new Date()); 
        purchaseOrder.setAuditor(pricipalUser.getUserCnName());
        count = chaseOrderMapper.insert(purchaseOrder); 
        //添加合同明细
        for (PurchaseOrderDetail detail : list) {
        	detail.setPurOrderDetId(RandomGUID.getRandomGUID());
        	detail.setPurOrderId(purchaseOrder.getPurOrderId());//订购合同id
        	detail.setNotArrNum(detail.getQuantity());//未到货数量
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
     
    /** 
     * @Title: auditPurchaseOrderList  
     * @Description: TODO(批量审核)  
     * @param @param purchaseOrder,list
     * @param @return    设定文件  
     * @return Object    返回类型  
     * @throws
     */ 
    @Transactional(readOnly = false) 
    @MethodLog(opera = "PurchaseOrderList_batchAudit")
    public Object auditPurchaseOrderList(PurchaseOrder purchaseOrder,List<String> list){
  	  JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
  	  Subject pricipalSubject = SecurityUtils.getSubject();
      User pricipalUser = (User) pricipalSubject.getPrincipal();  
  	  int count=0; 
  	  for (String id : list) {
  		 PurchaseOrder order=chaseOrderMapper.selectByPrimaryKey(id);
  		 order.setAuditState(purchaseOrder.getAuditState());
		 order.setAuditor(pricipalUser.getUserCnName());
		 order.setAuditRemark(purchaseOrder.getAuditRemark());
		 order.setAuditDate(new Date());
		 count = chaseOrderMapper.updateByPrimaryKeySelective(order);
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
     * @Title: batchCancelAudit  
     * @Description: TODO(取消审核)  
     * @param @param purchaseOrderIds
     * @param @return    设定文件  
     * @return Object    返回类型  
     * @throws
     */ 
    @Transactional(readOnly = false) 
    @MethodLog(opera = "PurchaseOrderList_cancelAudit")
    public Object batchCancelAudit(List<String> list){
  	  JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
      int count=0;
      for (String id : list) {
    	  PurchaseOrder order=chaseOrderMapper.selectByPrimaryKey(id);
          order.setAuditState("authstr");
    	  order.setAuditor("");
    	  order.setAuditRemark(""); 
    	  Date time=null;
    	  order.setAuditDate(time);
    	  count = chaseOrderMapper.updateByPrimaryKey(order); 
	  } 
      if (count > 0) {
          returnResult.setSuccess(true);
          returnResult.setMsg("取消订购合同审核操作成功！");
      } else {
          returnResult.setMsg("发生未知错误，取消审核操作失败");
      }  
  	  return returnResult; 
  } 
    /** 
     * @Title: addPurchaseArr  
     * @Description: TODO(订购合同，进行到货操作)  
     * @param @param arr
     * @param @param list
     * @param @return    设定文件  
     * @return Object    返回类型  
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "PurchaseOrderList_arr")
    public Object addPurchaseArr(PurchaseArrival purchaseArrival,List<PurchaseOrderDetail> list) {
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false 
        int count = 0;    
        //采购到货编号格式:表名_年_月_日_分_秒
        SimpleDateFormat formatDate = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss");
        purchaseArrival.setPurArrivalId(RandomGUID.getRandomGUID());
        purchaseArrival.setDerateMoney(new BigDecimal(0));//应付减免金额
        purchaseArrival.setAlrPayAmo(new BigDecimal(0));//已付款金额 
        purchaseArrival.setNotInvAmo(new BigDecimal(0));//未开票金额 
        purchaseArrival.setAlrReturnAmo(new BigDecimal(0));//已退货金额 
        purchaseArrival.setReturnState("noneCancel");//退货状态
        purchaseArrival.setPayState("nonePay");//付款状态 
        purchaseArrival.setAuditState("authstr");//审核状态
        purchaseArrival.setInvState("noneInv");//开票状态
        purchaseArrival.setTailAfterStatus("storage");//入库状态
        purchaseArrival.setArrivalCode("arrival"+formatDate.format(new Date()));
        purchaseArrival.setCreater(pricipalUser.getUserCnName());
        purchaseArrival.setCreateTime(new Date());
        purchaseArrival.setUpdater(pricipalUser.getUserCnName());
        purchaseArrival.setUpdateTime(new Date());
        count = purchaseArrivalMapper.insert(purchaseArrival); //新增到货单 
        int notArrNum=0;//计算未到货数量。如果未到货数量大于零，则更改该合同 到货状态 
        BigDecimal alrArrAmo=new BigDecimal(0);//计算已到货金额 
        if (count == 1) {
        	 for (PurchaseOrderDetail purchaseOrderDetail : list) {
        		 PurchaseArrivalDetail arrivalDetail=new PurchaseArrivalDetail();
        	  	   //采购到货详情信息增加 
        		   arrivalDetail.setPurArrivalDetId(RandomGUID.getRandomGUID());
        		   arrivalDetail.setPurArrivalId(purchaseArrival.getPurArrivalId());
        		   arrivalDetail.setGoodsId(purchaseOrderDetail.getGoodsId());//商品id
        		   arrivalDetail.setGoodsCode(purchaseOrderDetail.getGoodsCode());//商品编码
        		   arrivalDetail.setGoodsName(purchaseOrderDetail.getGoodsName());//商品名称
        		   arrivalDetail.setGoodsModel(purchaseOrderDetail.getGoodsModel());//规格型号
        		   arrivalDetail.setGoodsUnit(purchaseOrderDetail.getGoodsUnit());//单位 
        		   arrivalDetail.setQuantity(purchaseOrderDetail.getQuantity());//订购数量
        		   arrivalDetail.setPrice(purchaseOrderDetail.getPrice());//单价
        		   arrivalDetail.setGoodsMoney(purchaseOrderDetail.getMoney());//商品金额
        		   arrivalDetail.setDeadline(purchaseOrderDetail.getDeadline());//交货期限
        		   arrivalDetail.setNotReturnNum(0);//未退货数量
        		   arrivalDetail.setAlrReturnNum(0);//已退货数量
        		   arrivalDetail.setNotPayNum(purchaseOrderDetail.getDelivery());//未付款数量=收货数量
        		   arrivalDetail.setAlrPayNum(0);//已付款数量
        		   arrivalDetail.setNotInvNum(purchaseOrderDetail.getDelivery());//未开票数量
        		   arrivalDetail.setAlrInvNum(0);//已开票数量
        		   arrivalDetail.setBrand(purchaseOrderDetail.getBrand());//品牌
        		   arrivalDetail.setPlaceOfOrigin(purchaseOrderDetail.getPlaceOfOrigin());//产地
        		   arrivalDetail.setBatchInformation(purchaseOrderDetail.getBatchInformation());//批次信息
        		   arrivalDetail.setArrival(purchaseOrderDetail.getArrival());//到货数量
        		   arrivalDetail.setDelivery(purchaseOrderDetail.getDelivery());//收货数量
        		   arrivalDetail.setRejection(purchaseOrderDetail.getRejection());//拒收数量
        		   arrivalDetail.setOriginalCost(purchaseOrderDetail.getPrimeCost());//原价
        		   arrivalDetail.setDepositRate(purchaseOrderDetail.getDiscount());//折扣率
        		   arrivalDetail.setPutstorage(purchaseOrderDetail.getDelivery());//已入库数量
        		   arrivalDetail.setTakestorage(0);//未入库数量
        		   arrivalDetail.setRemark(purchaseOrderDetail.getRemark());//备注  
        		   purchaseArrivalDetailMapper.insert(arrivalDetail);//执行增加到货明细操作 
        		   //同时修改原来的订购合同明细状态 
        		   purchaseOrderDetail.setNotArrNum(purchaseOrderDetail.getQuantity()-purchaseOrderDetail.getDelivery());//未到货数量=订购数量减去收货数量
        		   purchaseOrderDetail.setAlrArrNum(purchaseOrderDetail.getDelivery());//已到货数量=收货数量 
        		   
        		   chaseOrderDetailMapper.updateByPrimaryKeySelective(purchaseOrderDetail);
        		   //计算------------- 
        		   alrArrAmo=alrArrAmo.add(purchaseOrderDetail.getMoney());//计算收货金额
        		   notArrNum+=purchaseOrderDetail.getNotArrNum();//未到货数量  
			} 
        	 //查询出订购合同
        	 PurchaseOrder ord= chaseOrderMapper.selectByPrimaryKey(list.get(0).getPurOrderId());
        	//更改订购合同收货金额等、未收货金额等数量
        	 if(notArrNum>0){ //未到货数量大于0 
        		 ord.setArrState("portionArr");//到货状态为部分到货
        		 ord.setAlrArrAmo(alrArrAmo);//到货金额
        		 ord.setNotPayAmo(alrArrAmo);//未付款金额
        		 ord.setNotArrAmo(ord.getTotalAmount().subtract(alrArrAmo));//未到货金额=总额-收货金额
        		 ord.setNotInvAmo(alrArrAmo);//未开发票金额
        		 ord.setOrderState("exeIng");//合同状态为执行中 
        	 }else{ //未到货数量为0,就是全部到货
        		 ord.setArrState("allArr");//到货状态为全部分到货
        		 ord.setAlrArrAmo(alrArrAmo);//到货金额
        		 ord.setNotPayAmo(alrArrAmo);//未付款金额
        		 ord.setAlrArrAmo(ord.getTotalAmount().subtract(alrArrAmo));//已到货金额=总额-已到货金额
        		 ord.setNotInvAmo(alrArrAmo);//未开发票金额
        		 ord.setOrderState("exeIng");//合同状态为执行中 
        	 }
        	 chaseOrderMapper.updateByPrimaryKeySelective(ord);//更新订购合同的信息数据 
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + purchaseArrival.getArrivalCode() + "] 采购到货信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，采购到货信息保存失败");
        }
        //调用到货单审核方法
        
        return returnResult; 
}}

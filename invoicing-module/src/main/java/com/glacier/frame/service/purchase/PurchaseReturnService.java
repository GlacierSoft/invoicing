/**
 * @Title: PurchaseReturnService.java 
 * @Package com.glacier.frame.service.purchase 
 * @author junjie.zheng  
 * @email 1203807137@qq.com
 * @date 2015-1-16 下午3:22:49 
 * @company (开发公司)    珠海市冰川软件有限公司
 * @copyright (版权)    本文件归属珠海市冰川软件有限公司所有
 * @version V1.0
 * @modify (修改) 
 *        	<p>
				第一次修改：
				时间：2015-1-16
				修改人：xichao.dong 
				修改内容简介 ：
			</p>              
 * @Review (审核人) ：xichao.dong
 * 
 */
package com.glacier.frame.service.purchase;

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

import com.glacier.basic.util.RandomGUID;
import com.glacier.frame.dao.purchase.PurchaseReturnDetailMapper;
import com.glacier.frame.dao.purchase.PurchaseReturnMapper;
import com.glacier.frame.dto.query.purchase.PurchaseReturnQueryDTO;
import com.glacier.frame.entity.purchase.PurchaseReturn;
import com.glacier.frame.entity.purchase.PurchaseReturnDetail;
import com.glacier.frame.entity.purchase.PurchaseReturnDetailExample;
import com.glacier.frame.entity.purchase.PurchaseReturnExample;
import com.glacier.frame.entity.purchase.PurchaseReturnExample.Criteria;
import com.glacier.frame.entity.system.User;
import com.glacier.frame.util.MethodLog;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.jqueryui.util.JqReturnJson;

/**
 * @ClassName: PurchaseReturnService 
 * @Description: TODO(采购退货业务层) 
 * @author junjie.zheng
 * @email 1203807137@qq.com
 * @date 2015-1-16 下午3:22:49
 */
@Service
@Transactional(readOnly = true ,propagation = Propagation.REQUIRED)
public class PurchaseReturnService {
	
	@Autowired
	private PurchaseReturnMapper purchaseReturnMapper;
	
	@Autowired
	private PurchaseReturnDetailMapper purchaseReturnDetailMapper;

	/**
	 * @Title: listAsGrid
	 * @Description: TODO(获取采购退货记录信息)
	 * @param @param pager
	 * @param @return 设定文件
	 * @return Object 返回类型
	 * @throws
	 */

	public Object listAsGrid(JqPager jqPager,PurchaseReturnQueryDTO purchaseReturnQueryDTO) {
		JqGridReturn returnResult = new JqGridReturn();
		PurchaseReturnExample purchaseReturnExample = new PurchaseReturnExample();
		Criteria queryCriteria = purchaseReturnExample.createCriteria();
		purchaseReturnQueryDTO.setQueryCondition(queryCriteria);
		if (null != jqPager.getPage() && null != jqPager.getRows()) {// 设置排序信息
			purchaseReturnExample.setLimitStart((jqPager.getPage() - 1)* jqPager.getRows());
			purchaseReturnExample.setLimitEnd(jqPager.getRows());
		}
		if (StringUtils.isNotBlank(jqPager.getSort())&& StringUtils.isNotBlank(jqPager.getOrder())) {// 设置排序信息
			purchaseReturnExample.setOrderByClause(jqPager.getOrderBy("temp_purchase_return_"));
		}
		List<PurchaseReturn> purchaseReturnList = purchaseReturnMapper.selectByExample(purchaseReturnExample); // 查询所有采购退货记录信息
		int total = purchaseReturnMapper.countByExample(purchaseReturnExample); // 查询总页数
		returnResult.setRows(purchaseReturnList);
		returnResult.setTotal(total);
		return returnResult;// 返回ExtGrid表
	}

	/**
	 * @Title: getPurchaseReturn
	 * @Description: TODO(获取采购退货对象)
	 * @param @param purReturnId
	 * @param @return 设定文件
	 * @return Object 返回类型
	 * @throws
	 */
	public Object getPurchaseReturn(String purReturnId) {
		PurchaseReturn purchaseReturn = purchaseReturnMapper.selectByPrimaryKey(purReturnId);
		return purchaseReturn;
	}

	/**
	 * @Title: addPurchaseReturn
	 * @Description: TODO(新增采购退货信息)
	 * @param @param parWarGoodsType
	 * @param @return 设定文件
	 * @return Object 返回类型
	 * @throws
	 */
	@Transactional(readOnly = false)
	@MethodLog(opera = "PurchaseReturn_add")
	public Object addPurchaseReturn(PurchaseReturn purchaseReturn,List<PurchaseReturnDetail> list) {
		Subject pricipalSubject = SecurityUtils.getSubject();
		User pricipalUser = (User) pricipalSubject.getPrincipal();
		JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
		int count = 0;
	    purchaseReturn.setPurReturnId(RandomGUID.getRandomGUID());
		purchaseReturn.setReturnCode("PRC_"+(int)(Math.random()*9000+1000));
		purchaseReturn.setAuditor(pricipalUser.getUserCnName());
		purchaseReturn.setAuditState("authstr");
		purchaseReturn.setAuditDate(new Date());
		purchaseReturn.setEnabled("enable");
		purchaseReturn.setCreater(pricipalUser.getUserCnName());
		purchaseReturn.setCreateTime(new Date());
		purchaseReturn.setUpdater(pricipalUser.getUserCnName());
		purchaseReturn.setUpdateTime(new Date());
		count = purchaseReturnMapper.insert(purchaseReturn);
		//添加退货明细
		for(PurchaseReturnDetail returndetail:list){
			returndetail.setPurReturnDetId(RandomGUID.getRandomGUID());
			returndetail.setPurReturnId(purchaseReturn.getPurReturnId());
			returndetail.setNotPayNum(0);//未付款数量
			returndetail.setAlrPayNum(0);//已付款数量
			returndetail.setNotInvNum(0);//未开票数量
			returndetail.setAlrInvNum(0);//已开票数量
			purchaseReturnDetailMapper.insert(returndetail);
		}		
		if (count == 1) {
			returnResult.setSuccess(true);
			returnResult.setMsg("【" + purchaseReturn.getReturnCode()+ "】采购退货信息已保存");
		} else {
			returnResult.setMsg("发生未知错误，采购退货信息保存失败");
		}
		return returnResult;
	}

	/**
	 * @Title: editPurchaseReturn
	 * @Description: TODO(修改采购退货信息)
	 * @param @param purchaseReturn
	 * @param @return 设定文件
	 * @return Object 返回类型
	 * @throws
	 */
   @Transactional(readOnly = false) 
   @MethodLog(opera = "PurchaseReturn_edit")
   public Object editPurchaseReturn(PurchaseReturn purchaseReturn,List<PurchaseReturnDetail> list) {
       Subject pricipalSubject = SecurityUtils.getSubject();
       User pricipalUser = (User) pricipalSubject.getPrincipal(); 
       JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false 
       int count = 0;  
       purchaseReturn.setUpdater(pricipalUser.getUserCnName());
       purchaseReturn.setUpdateTime(new Date());
       count = purchaseReturnMapper.updateByPrimaryKeySelective(purchaseReturn);
       //查询出该合同的所有明细信息
       PurchaseReturnDetailExample purchaseReturnDetailExample=new PurchaseReturnDetailExample();
       purchaseReturnDetailExample.createCriteria().andPurReturnIdEqualTo(purchaseReturn.getPurReturnId());
       List<PurchaseReturnDetail> detailList=purchaseReturnDetailMapper.selectByExample(purchaseReturnDetailExample); 
       //用于存放删除了的id
       List<String> orderDetailList=new ArrayList<String>(); 
       //后台原有的数据 
       Iterator<PurchaseReturnDetail> iterOne = detailList.iterator(); 
       //用迭代器挑选出前台删除了的货物，然后在数据库清除多余的数据
       while(iterOne.hasNext()){  
    	PurchaseReturnDetail order = iterOne.next();  
       	for (PurchaseReturnDetail str : list) {
       		if(order.getPurReturnDetId().equals(str.getPurReturnDetId())){  
       			iterOne.remove();  
               }
			} 
       }    
     	//如何集合里还有数据，就说明删除了数据
     	if(detailList.size()>0){
     		//把删除了货品明细id存放在集合里
     		for (PurchaseReturnDetail ord : detailList) { 
         		orderDetailList.add(ord.getPurReturnDetId()); 
   		}
     	  //执行批量删除，提高效率
     	  PurchaseReturnDetailExample detailExample = new PurchaseReturnDetailExample();
     	  detailExample.createCriteria().andPurReturnDetIdIn(orderDetailList);
     	  purchaseReturnDetailMapper.deleteByExample(detailExample); 
     	} 
       //修改合同明细  
       for (PurchaseReturnDetail detail : list) {    
       	 //存在id就修改
       	if(detail.getPurReturnDetId()!=null){   
       		purchaseReturnDetailMapper.updateByPrimaryKeySelective(detail);
       	}else{ //不存在id就新增  
       		purchaseReturnDetailMapper.insert(detail);
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
	 * @Title: delPurchaseReturn
	 * @Description: TODO(删除采购退货信息)
	 * @param @param purReturnIds
	 * @param @return 设定文件
	 * @return Object 返回类型
	 * @throws
	 */
	@Transactional(readOnly = false)
	@MethodLog(opera = "PurchaseReturn_del")
	public Object delPurchaseReturn(List<String> purReturnIds) {
		JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
		int count = 0;
		if (purReturnIds.size() > 0) {
			//删除退货明细信息
			for (String id : purReturnIds) {
				PurchaseReturnDetailExample purchaseReturnDetailExample=new PurchaseReturnDetailExample();
				purchaseReturnDetailExample.createCriteria().andPurReturnIdEqualTo(id);
				purchaseReturnDetailMapper.deleteByExample(purchaseReturnDetailExample);
			} 
			//删除采购退货单
			PurchaseReturnExample purchaseReturnExample = new PurchaseReturnExample();
			purchaseReturnExample.createCriteria().andPurReturnIdIn(purReturnIds);
			count = purchaseReturnMapper.deleteByExample(purchaseReturnExample);
			if (count > 0) {
				returnResult.setSuccess(true);
				returnResult.setMsg("成功删除了【 " + count+ " 】条采购退货信息");
			} else {
				returnResult.setMsg("发生未知错误，采购退货删除失败");
			}
		}
		return returnResult;
	}
}

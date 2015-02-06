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

import java.util.Date;
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
		purchaseReturn.setAuditState("pass");
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
	public Object editPurchaseReturn(PurchaseReturn purchaseReturn) {
		Subject pricipalSubject = SecurityUtils.getSubject();
		User pricipalUser = (User) pricipalSubject.getPrincipal();
		JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
		purchaseReturn.setUpdater(pricipalUser.getUserCnName());
		purchaseReturn.setUpdateTime(new Date());
		int count=0;
		count = purchaseReturnMapper.updateByPrimaryKeySelective(purchaseReturn);
		if (count == 1) {
			returnResult.setSuccess(true);
			returnResult.setMsg("【" + purchaseReturn.getReturnCode()+ "】采购退货信息已保存");
		} else {
			returnResult.setMsg("发生未知错误，采购退货信息保存失败");
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

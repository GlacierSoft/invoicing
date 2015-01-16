/**
 * @Title: PurchaseOrderDetailService.java 
 * @Package com.glacier.frame.service.purchase 
 * @author song.jundong   
 * @email 985776597@qq.com
 * @date 2015-1-16 上午10:38:58 
 * @company (开发公司)    珠海市冰川软件有限公司
 * @copyright (版权)    本文件归属珠海市冰川软件有限公司所有
 * @version V1.0
 * @modify (修改) 
 *        	<p>
				第一次修改：
				时间：2015-1-16
				修改人：song.jundong 
				修改内容简介 ：
			</p>              
 * @Review (审核人) ：song.jundong 
 * 
 */
package com.glacier.frame.service.purchase;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.glacier.frame.dao.purchase.PurchaseOrderDetailMapper;
import com.glacier.frame.dto.query.purchase.PurchaseOrderDetailQueryDTO; 
import com.glacier.frame.entity.purchase.PurchaseOrderDetail;
import com.glacier.frame.entity.purchase.PurchaseOrderDetailExample;
import com.glacier.frame.entity.purchase.PurchaseOrderDetailExample.Criteria;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;

/**
 * @ClassName: PurchaseOrderDetailService
 * @Description: TODO(订购合同明细service)
 * @author songjundong
 * @email 985776597@QQ.com
 * @date 2015-1-16 上午10:38:58
 */
@Service
@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
public class PurchaseOrderDetailService {

	@Autowired
	private PurchaseOrderDetailMapper purchaseOrderDetailMapper;

	/**
	 * 
	 * @Title: listAsGrid
	 * @Description: TODO(订购合同详细信息)
	 * @param @param jqPager
	 * @param @param purchaseOrderDetailDTO
	 * @param @return 设定文件
	 * @return Object 返回类型
	 * @throws
	 */
	 public Object listAsGrid(JqPager jqPager,PurchaseOrderDetailQueryDTO purchaseOrderDetailDTO) { 
		JqGridReturn returnResult = new JqGridReturn();
		PurchaseOrderDetailExample purchaseOrderDetailExample = new PurchaseOrderDetailExample();
		Criteria queryCriteria = purchaseOrderDetailExample.createCriteria();
		purchaseOrderDetailDTO.setQueryCondition(queryCriteria);
		if (null != jqPager.getPage() && null != jqPager.getRows()) {// 设置排序信息
			purchaseOrderDetailExample.setLimitStart((jqPager.getPage() - 1)* jqPager.getRows());
			purchaseOrderDetailExample.setLimitEnd(jqPager.getRows());
		}
		if (StringUtils.isNotBlank(jqPager.getSort())&& StringUtils.isNotBlank(jqPager.getOrder())) {// 设置排序信息
			purchaseOrderDetailExample.setOrderByClause(jqPager.getOrderBy("temp_purchaseOrder_detail_"));
		}
		List<PurchaseOrderDetail> carrierCarTypeList = purchaseOrderDetailMapper.selectByExample(purchaseOrderDetailExample); // 查询所有列表
		int total = purchaseOrderDetailMapper.countByExample(purchaseOrderDetailExample); // 查询总页数
		returnResult.setRows(carrierCarTypeList);
		returnResult.setTotal(total);
		return returnResult;// 返回ExtGrid表
	}
 
	 /** 
	  * @Title: getPurchaseOrderDetail  
	  * @Description: TODO(订购合同详细信息)  
	  * @param @param purchaseOrderDetailId
	  * @param @return    设定文件  
	  * @return Object    返回类型  
	  * @throws
	  */
	 public Object getPurchaseOrderDetail(String purchaseOrderDetailId) {
	     return purchaseOrderDetailMapper.selectByPrimaryKey(purchaseOrderDetailId);
	 } 
}

/**
 * @Title: PurchaseReturnDetailService.java 
 * @Package com.glacier.frame.service.purchase 
 * @author junjie.zheng  
 * @email 1203807137@qq.com
 * @date 2015-2-6 上午10:02:24 
 * @company (开发公司)    珠海市冰川软件有限公司
 * @copyright (版权)    本文件归属珠海市冰川软件有限公司所有
 * @version V1.0
 * @modify (修改) 
 *        	<p>
				第一次修改：
				时间：2015-2-6
				修改人：xichao.dong 
				修改内容简介 ：
			</p>              
 * @Review (审核人) ：xichao.dong
 * 
 */
package com.glacier.frame.service.purchase;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.glacier.frame.dao.purchase.PurchaseReturnDetailMapper;
import com.glacier.frame.dto.query.purchase.PurchaseReturnDetailQueryDTO;
import com.glacier.frame.entity.purchase.PurchaseReturnDetail;
import com.glacier.frame.entity.purchase.PurchaseReturnDetailExample;
import com.glacier.frame.entity.purchase.PurchaseReturnDetailExample.Criteria;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;

/**
 * @ClassName: PurchaseReturnDetailService 
 * @Description: TODO(退货明细业务层) 
 * @author junjie.zheng
 * @email 1203807137@qq.com
 * @date 2015-2-6 上午10:02:24
 */
@Service
@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
public class PurchaseReturnDetailService {
  
	@Autowired
	private PurchaseReturnDetailMapper purchaseReturnDetailMapper;

	/**
	 * 
	 * @Title: listAsGrid
	 * @Description: TODO(采购退货详细信息)
	 * @param @param jqPager
	 * @param @param purchaseReturnDetailDTO
	 * @param @return 设定文件
	 * @return Object 返回类型
	 * @throws
	 */
	 public Object listAsGrid(JqPager jqPager,PurchaseReturnDetailQueryDTO purchaseReturnDetailDTO) { 
		JqGridReturn returnResult = new JqGridReturn();
		PurchaseReturnDetailExample purchaseReturnDetailExample = new PurchaseReturnDetailExample();
		Criteria queryCriteria = purchaseReturnDetailExample.createCriteria();
		purchaseReturnDetailDTO.setQueryCondition(queryCriteria);
		if (null != jqPager.getPage() && null != jqPager.getRows()) {// 设置排序信息
			purchaseReturnDetailExample.setLimitStart((jqPager.getPage() - 1)* jqPager.getRows());
			purchaseReturnDetailExample.setLimitEnd(jqPager.getRows());
		}
		if (StringUtils.isNotBlank(jqPager.getSort())&& StringUtils.isNotBlank(jqPager.getOrder())) {// 设置排序信息
			purchaseReturnDetailExample.setOrderByClause(jqPager.getOrderBy("temp_purchase_return_detail_"));
		}
		List<PurchaseReturnDetail> purchaseReturnDetailList = purchaseReturnDetailMapper.selectByExample(purchaseReturnDetailExample); // 查询所有列表
		int total = purchaseReturnDetailMapper.countByExample(purchaseReturnDetailExample); // 查询总页数
		returnResult.setRows(purchaseReturnDetailList);
		returnResult.setTotal(total);
		return returnResult;// 返回ExtGrid表
	}
 
	 /** 
	  * @Title: getPurchaseOrderDetail  
	  * @Description: TODO(采购退货明细)  
	  * @param @param purReturnDetId
	  * @param @return    设定文件  
	  * @return Object    返回类型  
	  * @throws
	  */
	 public Object getPurchaseRetunDetail(String purReturnDetId) {
	     return purchaseReturnDetailMapper.selectByPrimaryKey(purReturnDetId);
	 } 
}

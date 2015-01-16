/**
 * @Title: PurchaseOrderDetailQueryDTO.java 
 * @Package com.glacier.frame.dto.query.purchase 
 * @author song.jundong   
 * @email 985776597@qq.com
 * @date 2015-1-16 上午10:35:36 
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
package com.glacier.frame.dto.query.purchase;
 
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import com.glacier.frame.entity.purchase.PurchaseOrderDetail; 
import com.glacier.frame.entity.purchase.PurchaseOrderDetailExample.Criteria;

/**
 * @ClassName:  PurchaseOrderDetailQueryDTO
 * @Description: TODO(订购合同明细DTO)
 * @author songjundong
 * @email 985776597@QQ.com
 * @date 2015-1-16  上午10:35:36
 */
public class PurchaseOrderDetailQueryDTO extends PurchaseOrderDetail{
  
	public void setQueryCondition(Criteria queryCriteria) { 
		// 合同编号查询
		if (null != this.getPurOrderId()&& StringUtils.isNotBlank(this.getPurOrderId())) {
			queryCriteria.andPurOrderIdEqualTo(this.getPurOrderId());
		}  
	}

	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}


}

/**
 * @Title: PurchaseOrderQueryDTO.java 
 * @Package com.glacier.frame.dto.query.purchase 
 * @author song.jundong   
 * @email 985776597@qq.com
 * @date 2015-1-15 上午11:16:25 
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
package com.glacier.frame.dto.query.purchase;

import java.util.Date;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import com.glacier.frame.entity.purchase.PurchaseOrder;
import com.glacier.frame.entity.purchase.PurchaseOrderExample.Criteria;

/**
 * @ClassName: PurchaseOrderQueryDTO
 * @Description: TODO(采购订购合同DTP)
 * @author songjundong
 * @email 985776597@QQ.com
 * @date 2015-1-15 上午11:16:25
 */
public class PurchaseOrderQueryDTO extends PurchaseOrder {

	private Date createStartTime;

	private Date createEndTime;

	public Date getCreateStartTime() {
		return createStartTime;
	}

	public void setCreateStartTime(Date createStartTime) {
		this.createStartTime = createStartTime;
	}

	public Date getCreateEndTime() {
		return createEndTime;
	}

	public void setCreateEndTime(Date createEndTime) {
		this.createEndTime = createEndTime;
	}

	public void setQueryCondition(Criteria queryCriteria) {
		
		// 合同编号Like查询
		if (null != this.getOrderCode()
				&& StringUtils.isNotBlank(this.getOrderCode())) {
			queryCriteria.andOrderCodeLike("%" + this.getOrderCode() + "%");
		} 
		
		// 状态Enum查询
		if (null != this.getEnabled()) {
			queryCriteria.andEnabledEqualTo(this.getEnabled().toString());
		}
		
		// 创建时间段查询
		if (null != createStartTime && null != createEndTime) {
			queryCriteria.andCreateTimeBetween(createStartTime, createEndTime);
		} else {
			if (null != createStartTime) {
				queryCriteria
						.andCreateTimeGreaterThanOrEqualTo(createStartTime);
			}
			if (null != createEndTime) {
				queryCriteria.andCreateTimeLessThanOrEqualTo(createEndTime);
			}
		}
	}

	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}

}

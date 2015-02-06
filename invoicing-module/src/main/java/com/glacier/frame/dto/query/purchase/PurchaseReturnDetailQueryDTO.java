package com.glacier.frame.dto.query.purchase;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import com.glacier.frame.entity.purchase.PurchaseReturnDetail;
import com.glacier.frame.entity.purchase.PurchaseReturnDetailExample.Criteria;

public class PurchaseReturnDetailQueryDTO  extends PurchaseReturnDetail{
	
	public void setQueryCondition(Criteria queryCriteria){
		 if(this.getPurReturnId()!=null&&StringUtils.isNotBlank(this.getPurReturnId())){
			 queryCriteria.andPurReturnIdEqualTo(this.getPurReturnId());
		 }
		 
		 if(this.getGoodsName()!=null&&StringUtils.isNotBlank(this.getGoodsName())){
			 queryCriteria.andGoodsNameLike("%"+this.getGoodsName()+"%");
		 }
		 
	}
	
	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}
}

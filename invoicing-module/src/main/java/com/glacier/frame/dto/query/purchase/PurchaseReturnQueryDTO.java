package com.glacier.frame.dto.query.purchase;

import java.util.Date;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import com.glacier.frame.entity.purchase.PurchaseReturn;
import com.glacier.frame.entity.purchase.PurchaseReturnExample.Criteria;

public class PurchaseReturnQueryDTO extends PurchaseReturn {
   
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
	    
     public void setQueryCondition(Criteria queryCriteria){
	   	 if(null != this.getReturnCode() && StringUtils.isNotBlank(this.getReturnCode())){//车辆类型名称Like查询
	            queryCriteria.andReturnCodeLike("%" + this.getReturnCode() + "%");
	        }  
	   	 if(null != this.getEnabled()){//状态Enum查询
	        queryCriteria.andEnabledEqualTo(this.getEnabled().toString());
	   	 	}
	     if(null != createStartTime && null != createEndTime){//创建时间段查询
	           queryCriteria.andCreateTimeBetween(createStartTime, createEndTime); 
	     }else{
	          if(null != createStartTime){
	              queryCriteria.andCreateTimeGreaterThanOrEqualTo(createStartTime);
	          }
	          if(null != createEndTime){
	              queryCriteria.andCreateTimeLessThanOrEqualTo(createEndTime);
	          } 
	       }
	    }
	   
	   @Override
	   public String toString() {
	       return ReflectionToStringBuilder.toString(this);
	   } 
}

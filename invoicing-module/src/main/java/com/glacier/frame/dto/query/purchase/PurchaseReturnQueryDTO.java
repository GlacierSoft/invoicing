package com.glacier.frame.dto.query.purchase;

import java.util.Date;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import com.glacier.frame.entity.purchase.PurchaseReturn;
import com.glacier.frame.entity.purchase.PurchaseReturnExample.Criteria;

public class PurchaseReturnQueryDTO extends PurchaseReturn {
   
private Date createStartTime;
	
	private Date createEndTime;
	    
	private String sta;
	
    
	public String getSta() {
		return sta;
	}

	public void setSta(String sta) {
		this.sta = sta;
	}

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
   	
     //供应商
     if(null!=this.getSupplierIdDisplay()&& StringUtils.isNotBlank(this.getSupplierIdDisplay())){
          queryCriteria.andSupplierIdDisplayLike("%"+this.getSupplierIdDisplay()+"%");
     }
        	
     //仓库
     if(null!=this.getStorageDisplay()&&StringUtils.isNotBlank(this.getStorageDisplay())){
    	  queryCriteria.andStorageDisplayLike("%"+this.getStorageDisplay()+"%");
     }
     
     //审核
     if(null!=this.getAuditState()&&StringUtils.isNotBlank(this.getAuditState())){
    	 queryCriteria.andAuditStateEqualTo(this.getAuditState().toString());
     }
        
     //取消审核
     if(null!=sta){
    	 queryCriteria.andAuditStateNotEqualTo("authstr"); 
     }
     
     //启用禁用
     if(null!=this.getEnabled()&&StringUtils.isNotBlank(this.getEnabled())){
    	 queryCriteria.andEnabledEqualTo(this.getEnabled());
     }
     
     
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

/*
 * @(#)PurchaseArrivalQueryDTO.java
 * @author wuting
 * Copyright (c) 2015 Glacier SoftWare Company Limited. All Rights Reserved.
 */
package com.glacier.frame.dto.query.purchase;
import java.util.Date;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder; 
import com.glacier.frame.entity.purchase.PurchaseArrival;
import com.glacier.frame.entity.purchase.PurchaseArrivalExample.Criteria;

/**
 * @ClassName: PurchaseArrivalQueryDTO 
 * @Description: TODO(采购到货查询DTO) 
 * @author wuting
 * @email 920339213@QQ.com
 * @date 2015-1-15
 */
public class PurchaseArrivalQueryDTO extends PurchaseArrival{
	private Date createStartTime;

    private Date createEndTime;
    
    private Date lastStartLoginTime;
    
    private Date lastEndLoginTime;
    
    private String loginStartCount;
    
    private String loginEndCount;
    
    private String authstr;
    

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
    
    public Date getLastStartLoginTime() {
		return lastStartLoginTime;
	}

	public void setLastStartLoginTime(Date lastStartLoginTime) {
		this.lastStartLoginTime = lastStartLoginTime;
	}

	public Date getLastEndLoginTime() {
		return lastEndLoginTime;
	}

	public void setLastEndLoginTime(Date lastEndLoginTime) {
		this.lastEndLoginTime = lastEndLoginTime;
	}

   public String getLoginStartCount() {
		return loginStartCount;
	}

	public void setLoginStartCount(String loginStartCount) {
		this.loginStartCount = loginStartCount;
	}

	public String getLoginEndCount() {
		return loginEndCount;
	}

	public void setLoginEndCount(String loginEndCount) {
		this.loginEndCount = loginEndCount;
	}
	
	public String getAuthstr() {
		return authstr;
	}

	public void setAuthstr(String authstr) {
		this.authstr = authstr;
	}

	public void setQueryCondition(Criteria queryCriteria){
	  if(null != authstr){
		  queryCriteria.andAuditStateNotEqualTo(authstr);
	  }
	  if(null != this.getAuditState()){
		  queryCriteria.andAuditStateEqualTo(this.getAuditState());
	  }
   	  if(null != this.getArrivalCode() && StringUtils.isNotBlank(this.getArrivalCode())){//采购到货单号Like查询
            queryCriteria.andArrivalCodeLike("%" + this.getArrivalCode() + "%");
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

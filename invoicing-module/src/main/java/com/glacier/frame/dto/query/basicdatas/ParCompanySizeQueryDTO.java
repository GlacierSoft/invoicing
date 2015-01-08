/*
 * @(#)ParCompanySizeQueryDTO.java
 * @author songjundong
 * Copyright (c) 2015 Glacier SoftWare Company Limited. All Rights Reserved.
 */
package com.glacier.frame.dto.query.basicdatas;

import java.util.Date;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;  
import com.glacier.frame.entity.basicdatas.ParCompanySize; 
import com.glacier.frame.entity.basicdatas.ParCompanySizeExample.Criteria;

/**
 * 
 * @ClassName:  ParCompanySizeQueryDTO
 * @Description: TODO(公司性质DTO)
 * @author songjundong
 * @email 985776597@QQ.com
 * @date 2015-1-8  上午9:40:36
 */
public class ParCompanySizeQueryDTO extends ParCompanySize{
	private Date createStartTime;

    private Date createEndTime;
    
    private Date lastStartLoginTime;
    
    private Date lastEndLoginTime;
      
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

	public void setQueryCondition(Criteria queryCriteria){
   	 if(null != this.getCompanySizeName() && StringUtils.isNotBlank(this.getCompanySizeName())){//性质名称Like查询
            queryCriteria.andCompanySizeNameLike("%" + this.getCompanySizeName() + "%");
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

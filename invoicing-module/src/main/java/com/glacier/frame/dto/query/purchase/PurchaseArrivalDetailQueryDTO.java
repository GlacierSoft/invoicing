/*
 * @(#)PurchaseArrivalDetailQueryDTO.java
 * @author wuting
 * Copyright (c) 2015 Glacier SoftWare Company Limited. All Rights Reserved.
 */
package com.glacier.frame.dto.query.purchase;
import java.util.Date;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder; 
import com.glacier.frame.entity.purchase.PurchaseArrivalDetail;
import com.glacier.frame.entity.purchase.PurchaseArrivalDetailExample.Criteria;

/**
 * @ClassName: PurchaseArrivalDetailQueryDTO 
 * @Description: TODO(采购到货查询DTO) 
 * @author wuting
 * @email 920339213@QQ.com
 * @date 2015-1-15
 */
public class PurchaseArrivalDetailQueryDTO extends PurchaseArrivalDetail{
	private Date createStartTime;

    private Date createEndTime;
    
    private Date lastStartLoginTime;
    
    private Date lastEndLoginTime;
    
    private String loginStartCount;
    
    private String loginEndCount;
    

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

	public void setQueryCondition(Criteria queryCriteria){
   	 if(null != this.getPurArrivalId() && StringUtils.isNotBlank(this.getPurArrivalId())){//采购到货名称Like查询
            queryCriteria.andPurArrivalIdLike("%" + this.getPurArrivalId() + "%");
        }
    }
   
   @Override
   public String toString() {
       return ReflectionToStringBuilder.toString(this);
   } 
}

package com.glacier.frame.dto.query.basicdatas;

import java.util.Date;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import com.glacier.frame.entity.basicdatas.GoodsList;
import com.glacier.frame.entity.basicdatas.GoodsListExample.Criteria;

public class GoodsListQueryDTO extends GoodsList{
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
	   	 if(null != this.getGoodsName() && StringUtils.isNotBlank(this.getGoodsName())){//车辆类型名称Like查询
	            queryCriteria.andGoodsNameLike("%" + this.getGoodsName() + "%");
	        }  
	   	 
	   	if(null != this.getGoodsTypeId() && StringUtils.isNotBlank(this.getGoodsTypeId())){//车辆类型名称Like查询
            queryCriteria.andGoodsTypeIdLike("%" + this.getGoodsTypeId() + "%");
        } 
	   	
	   	if(null!=this.getWarehouseTypeDisplay()){
	   	 queryCriteria.andWarehouseTypeDisplayEqual(this.getWarehouseTypeDisplay().toString());
	   	}
	   	
	   	if(null!=this.getGoodsSortDisplay()){
	   	   queryCriteria.andGoodsSortDisplayEqual(this.getGoodsSortDisplay().toString());
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
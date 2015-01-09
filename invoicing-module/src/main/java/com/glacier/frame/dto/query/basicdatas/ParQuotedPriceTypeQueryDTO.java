/**
 * @Title: ParQuotedPriceTypeQueryDTO.java 
 * @Package com.glacier.frame.dto.query.basicdatas 
 * @author song.jundong   
 * @email 985776597@qq.com
 * @date 2015-1-9 上午8:59:27 
 * @company (开发公司)    珠海市冰川软件有限公司
 * @copyright (版权)    本文件归属珠海市冰川软件有限公司所有
 * @version V1.0
 * @modify (修改) 
 *        	<p>
				第一次修改：
				时间：2015-1-9
				修改人：song.jundong 
				修改内容简介 ：
			</p>              
 * @Review (审核人) ：song.jundong 
 * 
 */
package com.glacier.frame.dto.query.basicdatas;

import java.util.Date;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import com.glacier.frame.entity.basicdatas.ParQuotedPriceType; 
import com.glacier.frame.entity.basicdatas.ParQuotedPriceTypeExample.Criteria;

/**
 * @ClassName:  ParQuotedPriceTypeQueryDTO
 * @Description: TODO(报价类型DTO)
 * @author songjundong
 * @email 985776597@QQ.com
 * @date 2015-1-9  上午8:59:27
 */
public class ParQuotedPriceTypeQueryDTO extends ParQuotedPriceType{


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
   	 if(null != this.getName() && StringUtils.isNotBlank(this.getName())){//性质名称Like查询
            queryCriteria.andNameLike("%" + this.getName() + "%");
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

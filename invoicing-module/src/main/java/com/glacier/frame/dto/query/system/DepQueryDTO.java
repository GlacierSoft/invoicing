/**
 * @Title: DepQueryDTO.java 
 * @Package com.glacier.frame.dto.query.system 
 * @author zhenfei.zhang   
 * @email 289556866@qq.com
 * @date 2014-2-20 下午2:26:17 
 * @company (开发公司)    珠海市冰川软件有限公司
 * @copyright (版权)    本文件归属珠海市冰川软件有限公司所有
 * @version V1.0
 * @modify (修改) 
 *        	<p>
				第一次修改：
				时间：2014-2-20
				修改人：zhenfei.zhang 
				修改内容简介 ：
			</p>              
 * @Review (审核人) ：zhenfei.zhang
 * 
 */
package com.glacier.frame.dto.query.system;

import java.util.Date;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import com.glacier.frame.entity.system.Dep;
import com.glacier.frame.entity.system.DepExample.Criteria;

/**
 * @ClassName: DepQueryDTO 
 * @Description: TODO(部门查询DTO) 
 * @author zhenfei.zhang
 * @email 289556866@qq.com
 * @date 2014-2-20 下午2:26:17
 */
public class DepQueryDTO extends Dep {
    
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
        if(null != this.getCnName() && StringUtils.isNotBlank(this.getCnName())){//部门中文名Like查询
            queryCriteria.andCnNameLike("%" + this.getCnName() + "%");
        }
        if(null != this.getEnName() && StringUtils.isNotBlank(this.getEnName())){//部门英文名Like查询
            queryCriteria.andEnNameLike("%" + this.getEnName() + "%");
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

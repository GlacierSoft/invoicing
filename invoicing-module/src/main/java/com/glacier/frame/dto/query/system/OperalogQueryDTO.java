/**
 * @Title: RoleQueryDTO.java 
 * @Package com.glacier.frame.dto.query.system 
 * @author zhenfei.zhang   
 * @email 289556866@qq.com
 * @date 2014-2-15 下午3:48:39 
 * @company (开发公司)    珠海市冰川软件有限公司
 * @copyright (版权)    本文件归属珠海市冰川软件有限公司所有
 * @version V1.0
 * @modify (修改) 
 *        	<p>
				第一次修改：
				时间：2014-2-15
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
import com.glacier.frame.entity.system.OperaLog;
import com.glacier.frame.entity.system.OperaLogExample.Criteria;

/**
 * @ClassName: LoginlogQueryDTO 
 * @Description: TODO(登录日志查询DTO) 
 * @author yuzexu
 * @email 804346249@QQ.com
 * @date 2014-2-19下午2:48:42
 */
public class OperalogQueryDTO extends OperaLog {

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
    	 if(null != this.getOperaPenal() && StringUtils.isNotBlank(this.getOperaPenal())){//操作面板Like查询
             queryCriteria.andOperaPenalLike("%" + this.getOperaPenal() + "%");
         }
    	 if(null != this.getOperaMenu() && StringUtils.isNotBlank(this.getOperaMenu())){//操作菜单Like查询
             queryCriteria.andOperaMenuLike("%" + this.getOperaMenu() + "%");
         }
    	 if(null != this.getOperaMethod() && StringUtils.isNotBlank(this.getOperaMethod())){//操作方法Like查询
             queryCriteria.andOperaMethodLike("%" + this.getOperaMethod() + "%");
         }
    	 if(null != this.getOperaMd() && StringUtils.isNotBlank(this.getOperaMd())){//调用方法Like查询
             queryCriteria.andOperaMdLike("%" + this.getOperaMd() + "%");
         }
        if(null != this.getOperator() && StringUtils.isNotBlank(this.getOperator())){//操作人Like查询
            queryCriteria.andOperatorLike("%" + this.getOperator() + "%");
        }
        if(null != createStartTime && null != createEndTime){//创建时间段查询
            queryCriteria.andOperaTimeBetween(createStartTime, createEndTime); 
        }else{
            if(null != createStartTime){
                queryCriteria.andOperaTimeGreaterThanOrEqualTo(createStartTime);
            }
            if(null != createEndTime){
                queryCriteria.andOperaTimeLessThanOrEqualTo(createEndTime);
            }
            
        }
    }
    
    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }

}

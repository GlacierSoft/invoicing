/**
 * @Title: UserQueryDTO.java 
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
import com.glacier.frame.entity.system.User;
import com.glacier.frame.entity.system.UserExample.Criteria;

/**
 * @ClassName: UserQueryDTO 
 * @Description: TODO(用户查询DTO) 
 * @author zhenfei.zhang
 * @email 289556866@qq.com
 * @date 2014-2-20 下午2:26:17
 */
@SuppressWarnings("serial")
public class UserQueryDTO extends User {
    
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
        if(null != this.getUsername() && StringUtils.isNotBlank(this.getUsername())){//用户名Like查询
            queryCriteria.andUsernameLike("%" + this.getUsername() + "%");
        }
        if(null != this.getUserCnName() && StringUtils.isNotBlank(this.getUserCnName())){//用户姓名Like查询
            queryCriteria.andUserCnNameLike("%" + this.getUserCnName() + "%");
        }
        if(null != this.getEmail() && StringUtils.isNotBlank(this.getEmail())){//用户姓名Like查询
            queryCriteria.andEmailLike("%" + this.getEmail() + "%");
        }
        if(null != this.getBuiltin()){//用户类型Enum查询
            queryCriteria.andBuiltinEqualTo(this.getBuiltin().toString());
        }
        if(null != this.getStatus()){//用户状态Enum查询
            queryCriteria.andStatusEqualTo(this.getStatus().toString());
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

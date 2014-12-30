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

import com.glacier.frame.entity.system.Role;
import com.glacier.frame.entity.system.RoleExample.Criteria;

/**
 * @ClassName: RoleQueryDTO
 * @Description: TODO(角色查询DTO)
 * @author zhenfei.zhang
 * @email 289556866@qq.com
 * @date 2014-2-15 下午3:48:39
 */
public class RoleQueryDTO extends Role {

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
        if(null != this.getRoleCnName() && StringUtils.isNotBlank(this.getRoleCnName())){//角色名Like查询
            queryCriteria.andRoleCnNameLike("%" + this.getRoleCnName() + "%");
        }
        if(null != this.getRoleEnName() && StringUtils.isNotBlank(this.getRoleEnName())){//角色英文名Like查询
            queryCriteria.andRoleEnNameLike("%" + this.getRoleEnName() + "%");
        }
        if(null != this.getBuiltin()){//是否内置Enum查询
            queryCriteria.andBuiltinEqualTo(this.getBuiltin().toString());
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

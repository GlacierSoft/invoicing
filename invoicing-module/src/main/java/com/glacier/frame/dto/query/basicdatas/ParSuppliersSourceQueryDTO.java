/**
 * @Title: ParSuppliersSourceQueryDTO.java 
 * @Package com.glacier.frame.dto.query.basicdatas 
 * @author song.jundong   
 * @email 985776597@qq.com
 * @date 2015-1-13 下午1:23:28 
 * @company (开发公司)    珠海市冰川软件有限公司
 * @copyright (版权)    本文件归属珠海市冰川软件有限公司所有
 * @version V1.0
 * @modify (修改) 
 *        	<p>
				第一次修改：
				时间：2015-1-13
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

import com.glacier.frame.entity.basicdatas.ParSuppliersSource;
import com.glacier.frame.entity.basicdatas.ParSuppliersSourceExample.Criteria;

/**
 * @ClassName: ParSuppliersSourceQueryDTO
 * @Description: TODO(供应商来源信息DTO)
 * @author songjundong
 * @email 985776597@QQ.com
 * @date 2015-1-13 下午1:23:28
 */
public class ParSuppliersSourceQueryDTO extends ParSuppliersSource {

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

	public void setQueryCondition(Criteria queryCriteria) {
		if (null != this.getSourceName()
				&& StringUtils.isNotBlank(this.getSourceName())) {// 名称Like查询
			queryCriteria.andSourceNameLike("%" + this.getSourceName() + "%");
		}
		if (null != this.getEnabled()) {// 状态Enum查询
			queryCriteria.andEnabledEqualTo(this.getEnabled().toString());
		}
		if (null != createStartTime && null != createEndTime) {// 创建时间段查询
			queryCriteria.andCreateTimeBetween(createStartTime, createEndTime);
		} else {
			if (null != createStartTime) {
				queryCriteria
						.andCreateTimeGreaterThanOrEqualTo(createStartTime);
			}
			if (null != createEndTime) {
				queryCriteria.andCreateTimeLessThanOrEqualTo(createEndTime);
			}
		}
	}

	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}

}

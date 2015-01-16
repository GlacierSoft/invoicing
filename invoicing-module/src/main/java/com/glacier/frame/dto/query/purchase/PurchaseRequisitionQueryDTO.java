/**
 * @Title: PurchaseRequisitionQueryDTO.java 
 * @Package com.glacier.frame.dto.query.purchase 
 * @author xichao.dong   
 * @email 406592176@qq.com
 * @date 2015-1-15 上午10:37:32 
 * @company (开发公司)    珠海市冰川软件有限公司
 * @copyright (版权)    本文件归属珠海市冰川软件有限公司所有
 * @version V1.0
 * @modify (修改) 
 *        	<p>
				第一次修改：
				时间：2015-1-15
				修改人：xichao.dong 
				修改内容简介 ：
			</p>              
 * @Review (审核人) ：xichao.dong
 * 
 */
package com.glacier.frame.dto.query.purchase;

import java.util.Date;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import com.glacier.frame.entity.purchase.PurchaseRequisitionExample.Criteria;
import com.glacier.frame.entity.purchase.PurchaseRequisition;

/**
 * @ClassName: PurchaseRequisitionQueryDTO 
 * @Description: TODO(采购申请的查询DTO) 
 * @author xichao.dong	
 * @email 406592176@qq.com
 * @date 2015-1-16 下午5:01:33
 */
public class PurchaseRequisitionQueryDTO extends PurchaseRequisition {

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
        
        // 合同编号Like查询
        if (null != this.getReqCode()
                && StringUtils.isNotBlank(this.getReqCode())) {
            queryCriteria.andReqCodeLike("%" + this.getReqCode() + "%");
        } 
        
        // 状态Enum查询
        if (null != this.getEnabled()) {
            queryCriteria.andEnabledEqualTo(this.getEnabled().toString());
        }
        
        // 创建时间段查询
        if (null != createStartTime && null != createEndTime) {
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
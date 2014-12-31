package com.glacier.frame.entity.basicdatas;

import java.util.Date;

import javax.validation.constraints.Max;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;

import com.alibaba.fastjson.annotation.JSONField;

public class ParameterOptgroupValue {
    private String optgroupValueId;

    private String optgroupId;
    
    /**
     * 自定义字段
     */
    private String optgroupCode;

    @Pattern(regexp = "^[a-zA-Z]{2,20}$", message = "{ParameterOptgroupValue.optgroupValueCode.illegal}")
    private String optgroupValueCode;

    @Pattern(regexp = "^[\u0391-\uFFE5A-Z]{1,10}$", message = "{ParameterOptgroupValue.optgroupValueName.illegal}")
    private String optgroupValueName;

    private String status;

    private String statusName;
    
    public String getStatusName() {
		return statusName;
	}

	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}

	@Max(value = 99, message = "{ParameterOptgroupValue.optgroupValueNum.illegal}")
	private Integer optgroupValueNum;

	@Length(max = 255, message = "{ParameterOptgroupValue.remark.illegal}")
    private String remark;

    private String creater;
    
    /**
     * 自定义字段,显示创建人真实名字
     */
    private String createrDisplay;

    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    private String updater;
    
    /**
     * 自定义字段，显示更新人真实名字
     */
    private String updaterDisplay;

    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date updateTime;

    public String getOptgroupValueId() {
        return optgroupValueId;
    }

    public void setOptgroupValueId(String optgroupValueId) {
        this.optgroupValueId = optgroupValueId;
    }

    public String getOptgroupId() {
        return optgroupId;
    }

    public void setOptgroupId(String optgroupId) {
        this.optgroupId = optgroupId;
    }

    public String getOptgroupCode() {
        return optgroupCode;
    }

    public void setOptgroupCode(String optgroupCode) {
        this.optgroupCode = optgroupCode;
    }

    public String getOptgroupValueCode() {
        return optgroupValueCode;
    }

    public void setOptgroupValueCode(String optgroupValueCode) {
        this.optgroupValueCode = optgroupValueCode;
    }

    public String getOptgroupValueName() {
        return optgroupValueName;
    }

    public void setOptgroupValueName(String optgroupValueName) {
        this.optgroupValueName = optgroupValueName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getOptgroupValueNum() {
        return optgroupValueNum;
    }

    public void setOptgroupValueNum(Integer optgroupValueNum) {
        this.optgroupValueNum = optgroupValueNum;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUpdater() {
        return updater;
    }

    public void setUpdater(String updater) {
        this.updater = updater;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
    
    public String getCreaterDisplay() {
        return createrDisplay;
    }

    public void setCreaterDisplay(String createrDisplay) {
        this.createrDisplay = createrDisplay;
    }

    public String getUpdaterDisplay() {
        return updaterDisplay;
    }

    public void setUpdaterDisplay(String updaterDisplay) {
        this.updaterDisplay = updaterDisplay;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        ParameterOptgroupValue other = (ParameterOptgroupValue) that;
        return (this.getOptgroupValueId() == null ? other.getOptgroupValueId() == null : this.getOptgroupValueId().equals(other.getOptgroupValueId()))
            && (this.getOptgroupId() == null ? other.getOptgroupId() == null : this.getOptgroupId().equals(other.getOptgroupId()))
            && (this.getOptgroupValueCode() == null ? other.getOptgroupValueCode() == null : this.getOptgroupValueCode().equals(other.getOptgroupValueCode()))
            && (this.getOptgroupValueName() == null ? other.getOptgroupValueName() == null : this.getOptgroupValueName().equals(other.getOptgroupValueName()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getOptgroupValueNum() == null ? other.getOptgroupValueNum() == null : this.getOptgroupValueNum().equals(other.getOptgroupValueNum()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getCreater() == null ? other.getCreater() == null : this.getCreater().equals(other.getCreater()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdater() == null ? other.getUpdater() == null : this.getUpdater().equals(other.getUpdater()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOptgroupValueId() == null) ? 0 : getOptgroupValueId().hashCode());
        result = prime * result + ((getOptgroupId() == null) ? 0 : getOptgroupId().hashCode());
        result = prime * result + ((getOptgroupValueCode() == null) ? 0 : getOptgroupValueCode().hashCode());
        result = prime * result + ((getOptgroupValueName() == null) ? 0 : getOptgroupValueName().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getOptgroupValueNum() == null) ? 0 : getOptgroupValueNum().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getCreater() == null) ? 0 : getCreater().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdater() == null) ? 0 : getUpdater().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }
}
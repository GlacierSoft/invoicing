package com.glacier.frame.entity.basicdatas;

import java.util.Date;

public class ParCreditGrade {
    private String creditId;

    private String code;

    private String creditName;

    private Integer creditBeginIntegral;

    private Integer creditEndIntegral;

    private String creditPhoto;

    private Integer sequenced;

    private String enabled;

    private String remark;

    private String creater;

    private Date createTime;

    private String updater;

    private Date updateTime;

    public String getCreditId() {
        return creditId;
    }

    public void setCreditId(String creditId) {
        this.creditId = creditId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCreditName() {
        return creditName;
    }

    public void setCreditName(String creditName) {
        this.creditName = creditName;
    }

    public Integer getCreditBeginIntegral() {
        return creditBeginIntegral;
    }

    public void setCreditBeginIntegral(Integer creditBeginIntegral) {
        this.creditBeginIntegral = creditBeginIntegral;
    }

    public Integer getCreditEndIntegral() {
        return creditEndIntegral;
    }

    public void setCreditEndIntegral(Integer creditEndIntegral) {
        this.creditEndIntegral = creditEndIntegral;
    }

    public String getCreditPhoto() {
        return creditPhoto;
    }

    public void setCreditPhoto(String creditPhoto) {
        this.creditPhoto = creditPhoto;
    }

    public Integer getSequenced() {
        return sequenced;
    }

    public void setSequenced(Integer sequenced) {
        this.sequenced = sequenced;
    }

    public String getEnabled() {
        return enabled;
    }

    public void setEnabled(String enabled) {
        this.enabled = enabled;
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
        ParCreditGrade other = (ParCreditGrade) that;
        return (this.getCreditId() == null ? other.getCreditId() == null : this.getCreditId().equals(other.getCreditId()))
            && (this.getCode() == null ? other.getCode() == null : this.getCode().equals(other.getCode()))
            && (this.getCreditName() == null ? other.getCreditName() == null : this.getCreditName().equals(other.getCreditName()))
            && (this.getCreditBeginIntegral() == null ? other.getCreditBeginIntegral() == null : this.getCreditBeginIntegral().equals(other.getCreditBeginIntegral()))
            && (this.getCreditEndIntegral() == null ? other.getCreditEndIntegral() == null : this.getCreditEndIntegral().equals(other.getCreditEndIntegral()))
            && (this.getCreditPhoto() == null ? other.getCreditPhoto() == null : this.getCreditPhoto().equals(other.getCreditPhoto()))
            && (this.getSequenced() == null ? other.getSequenced() == null : this.getSequenced().equals(other.getSequenced()))
            && (this.getEnabled() == null ? other.getEnabled() == null : this.getEnabled().equals(other.getEnabled()))
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
        result = prime * result + ((getCreditId() == null) ? 0 : getCreditId().hashCode());
        result = prime * result + ((getCode() == null) ? 0 : getCode().hashCode());
        result = prime * result + ((getCreditName() == null) ? 0 : getCreditName().hashCode());
        result = prime * result + ((getCreditBeginIntegral() == null) ? 0 : getCreditBeginIntegral().hashCode());
        result = prime * result + ((getCreditEndIntegral() == null) ? 0 : getCreditEndIntegral().hashCode());
        result = prime * result + ((getCreditPhoto() == null) ? 0 : getCreditPhoto().hashCode());
        result = prime * result + ((getSequenced() == null) ? 0 : getSequenced().hashCode());
        result = prime * result + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getCreater() == null) ? 0 : getCreater().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdater() == null) ? 0 : getUpdater().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }
}
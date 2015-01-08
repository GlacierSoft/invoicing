package com.glacier.frame.entity.basicdatas;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class ParCompanySize {
    private String companySizeId;

    private String code;

    private String companySizeName;

    private Integer sequenced;

    private String enabled;

    private String creater;

    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    private String updater;

    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date updateTime;

    public String getCompanySizeId() {
        return companySizeId;
    }

    public void setCompanySizeId(String companySizeId) {
        this.companySizeId = companySizeId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCompanySizeName() {
        return companySizeName;
    }

    public void setCompanySizeName(String companySizeName) {
        this.companySizeName = companySizeName;
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
        ParCompanySize other = (ParCompanySize) that;
        return (this.getCompanySizeId() == null ? other.getCompanySizeId() == null : this.getCompanySizeId().equals(other.getCompanySizeId()))
            && (this.getCode() == null ? other.getCode() == null : this.getCode().equals(other.getCode()))
            && (this.getCompanySizeName() == null ? other.getCompanySizeName() == null : this.getCompanySizeName().equals(other.getCompanySizeName()))
            && (this.getSequenced() == null ? other.getSequenced() == null : this.getSequenced().equals(other.getSequenced()))
            && (this.getEnabled() == null ? other.getEnabled() == null : this.getEnabled().equals(other.getEnabled()))
            && (this.getCreater() == null ? other.getCreater() == null : this.getCreater().equals(other.getCreater()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdater() == null ? other.getUpdater() == null : this.getUpdater().equals(other.getUpdater()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCompanySizeId() == null) ? 0 : getCompanySizeId().hashCode());
        result = prime * result + ((getCode() == null) ? 0 : getCode().hashCode());
        result = prime * result + ((getCompanySizeName() == null) ? 0 : getCompanySizeName().hashCode());
        result = prime * result + ((getSequenced() == null) ? 0 : getSequenced().hashCode());
        result = prime * result + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        result = prime * result + ((getCreater() == null) ? 0 : getCreater().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdater() == null) ? 0 : getUpdater().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }
}
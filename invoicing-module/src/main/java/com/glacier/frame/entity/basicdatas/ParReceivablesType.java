package com.glacier.frame.entity.basicdatas;

import java.util.Date;

public class ParReceivablesType {
    private String receivablesTypeId;

    private String code;

    private String receivablesTypeName;

    private Integer sequenced;

    private String enabled;

    private String creater;

    private Date createTime;

    private String updater;

    private Date updateTime;

    public String getReceivablesTypeId() {
        return receivablesTypeId;
    }

    public void setReceivablesTypeId(String receivablesTypeId) {
        this.receivablesTypeId = receivablesTypeId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getReceivablesTypeName() {
        return receivablesTypeName;
    }

    public void setReceivablesTypeName(String receivablesTypeName) {
        this.receivablesTypeName = receivablesTypeName;
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
        ParReceivablesType other = (ParReceivablesType) that;
        return (this.getReceivablesTypeId() == null ? other.getReceivablesTypeId() == null : this.getReceivablesTypeId().equals(other.getReceivablesTypeId()))
            && (this.getCode() == null ? other.getCode() == null : this.getCode().equals(other.getCode()))
            && (this.getReceivablesTypeName() == null ? other.getReceivablesTypeName() == null : this.getReceivablesTypeName().equals(other.getReceivablesTypeName()))
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
        result = prime * result + ((getReceivablesTypeId() == null) ? 0 : getReceivablesTypeId().hashCode());
        result = prime * result + ((getCode() == null) ? 0 : getCode().hashCode());
        result = prime * result + ((getReceivablesTypeName() == null) ? 0 : getReceivablesTypeName().hashCode());
        result = prime * result + ((getSequenced() == null) ? 0 : getSequenced().hashCode());
        result = prime * result + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        result = prime * result + ((getCreater() == null) ? 0 : getCreater().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdater() == null) ? 0 : getUpdater().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }
}
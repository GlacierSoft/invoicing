package com.glacier.frame.entity.basicdatas;

import java.util.Date;

public class ParWarDeployType {
    private String deployTypeId;

    private Integer orderNum;

    private String deployTypeState;

    private String deployTypeName;

    private String enabled;

    private String creater;

    private Date createTime;

    private String updater;

    private Date updateTime;

    public String getDeployTypeId() {
        return deployTypeId;
    }

    public void setDeployTypeId(String deployTypeId) {
        this.deployTypeId = deployTypeId;
    }

    public Integer getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    public String getDeployTypeState() {
        return deployTypeState;
    }

    public void setDeployTypeState(String deployTypeState) {
        this.deployTypeState = deployTypeState;
    }

    public String getDeployTypeName() {
        return deployTypeName;
    }

    public void setDeployTypeName(String deployTypeName) {
        this.deployTypeName = deployTypeName;
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
        ParWarDeployType other = (ParWarDeployType) that;
        return (this.getDeployTypeId() == null ? other.getDeployTypeId() == null : this.getDeployTypeId().equals(other.getDeployTypeId()))
            && (this.getOrderNum() == null ? other.getOrderNum() == null : this.getOrderNum().equals(other.getOrderNum()))
            && (this.getDeployTypeState() == null ? other.getDeployTypeState() == null : this.getDeployTypeState().equals(other.getDeployTypeState()))
            && (this.getDeployTypeName() == null ? other.getDeployTypeName() == null : this.getDeployTypeName().equals(other.getDeployTypeName()))
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
        result = prime * result + ((getDeployTypeId() == null) ? 0 : getDeployTypeId().hashCode());
        result = prime * result + ((getOrderNum() == null) ? 0 : getOrderNum().hashCode());
        result = prime * result + ((getDeployTypeState() == null) ? 0 : getDeployTypeState().hashCode());
        result = prime * result + ((getDeployTypeName() == null) ? 0 : getDeployTypeName().hashCode());
        result = prime * result + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        result = prime * result + ((getCreater() == null) ? 0 : getCreater().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdater() == null) ? 0 : getUpdater().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }
}
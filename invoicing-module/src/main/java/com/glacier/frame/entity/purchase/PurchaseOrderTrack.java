package com.glacier.frame.entity.purchase;

import java.util.Date;

public class PurchaseOrderTrack {
    private String purOrderTraId;

    private String orderTrackCode;

    private String purOrderId;

    private String trackTheme;

    private String supplierId;

    private String trackContent;

    private String linkman;

    private String phone;

    private String accessory;

    private String remark;

    private String creater;

    private Date createTime;

    private String updater;

    private Date updateTime;

    public String getPurOrderTraId() {
        return purOrderTraId;
    }

    public void setPurOrderTraId(String purOrderTraId) {
        this.purOrderTraId = purOrderTraId;
    }

    public String getOrderTrackCode() {
        return orderTrackCode;
    }

    public void setOrderTrackCode(String orderTrackCode) {
        this.orderTrackCode = orderTrackCode;
    }

    public String getPurOrderId() {
        return purOrderId;
    }

    public void setPurOrderId(String purOrderId) {
        this.purOrderId = purOrderId;
    }

    public String getTrackTheme() {
        return trackTheme;
    }

    public void setTrackTheme(String trackTheme) {
        this.trackTheme = trackTheme;
    }

    public String getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }

    public String getTrackContent() {
        return trackContent;
    }

    public void setTrackContent(String trackContent) {
        this.trackContent = trackContent;
    }

    public String getLinkman() {
        return linkman;
    }

    public void setLinkman(String linkman) {
        this.linkman = linkman;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAccessory() {
        return accessory;
    }

    public void setAccessory(String accessory) {
        this.accessory = accessory;
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
        PurchaseOrderTrack other = (PurchaseOrderTrack) that;
        return (this.getPurOrderTraId() == null ? other.getPurOrderTraId() == null : this.getPurOrderTraId().equals(other.getPurOrderTraId()))
            && (this.getOrderTrackCode() == null ? other.getOrderTrackCode() == null : this.getOrderTrackCode().equals(other.getOrderTrackCode()))
            && (this.getPurOrderId() == null ? other.getPurOrderId() == null : this.getPurOrderId().equals(other.getPurOrderId()))
            && (this.getTrackTheme() == null ? other.getTrackTheme() == null : this.getTrackTheme().equals(other.getTrackTheme()))
            && (this.getSupplierId() == null ? other.getSupplierId() == null : this.getSupplierId().equals(other.getSupplierId()))
            && (this.getTrackContent() == null ? other.getTrackContent() == null : this.getTrackContent().equals(other.getTrackContent()))
            && (this.getLinkman() == null ? other.getLinkman() == null : this.getLinkman().equals(other.getLinkman()))
            && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()))
            && (this.getAccessory() == null ? other.getAccessory() == null : this.getAccessory().equals(other.getAccessory()))
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
        result = prime * result + ((getPurOrderTraId() == null) ? 0 : getPurOrderTraId().hashCode());
        result = prime * result + ((getOrderTrackCode() == null) ? 0 : getOrderTrackCode().hashCode());
        result = prime * result + ((getPurOrderId() == null) ? 0 : getPurOrderId().hashCode());
        result = prime * result + ((getTrackTheme() == null) ? 0 : getTrackTheme().hashCode());
        result = prime * result + ((getSupplierId() == null) ? 0 : getSupplierId().hashCode());
        result = prime * result + ((getTrackContent() == null) ? 0 : getTrackContent().hashCode());
        result = prime * result + ((getLinkman() == null) ? 0 : getLinkman().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
        result = prime * result + ((getAccessory() == null) ? 0 : getAccessory().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getCreater() == null) ? 0 : getCreater().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdater() == null) ? 0 : getUpdater().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }
}
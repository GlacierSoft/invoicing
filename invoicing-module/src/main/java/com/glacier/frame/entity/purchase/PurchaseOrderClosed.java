package com.glacier.frame.entity.purchase;

import java.util.Date;

public class PurchaseOrderClosed {
    private String purOrderColId;

    private String orderCloCode;

    private String purOrderId;

    private String content;

    private String operatorDep;

    private String creater;

    private Date createTime;

    public String getPurOrderColId() {
        return purOrderColId;
    }

    public void setPurOrderColId(String purOrderColId) {
        this.purOrderColId = purOrderColId;
    }

    public String getOrderCloCode() {
        return orderCloCode;
    }

    public void setOrderCloCode(String orderCloCode) {
        this.orderCloCode = orderCloCode;
    }

    public String getPurOrderId() {
        return purOrderId;
    }

    public void setPurOrderId(String purOrderId) {
        this.purOrderId = purOrderId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getOperatorDep() {
        return operatorDep;
    }

    public void setOperatorDep(String operatorDep) {
        this.operatorDep = operatorDep;
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
        PurchaseOrderClosed other = (PurchaseOrderClosed) that;
        return (this.getPurOrderColId() == null ? other.getPurOrderColId() == null : this.getPurOrderColId().equals(other.getPurOrderColId()))
            && (this.getOrderCloCode() == null ? other.getOrderCloCode() == null : this.getOrderCloCode().equals(other.getOrderCloCode()))
            && (this.getPurOrderId() == null ? other.getPurOrderId() == null : this.getPurOrderId().equals(other.getPurOrderId()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()))
            && (this.getOperatorDep() == null ? other.getOperatorDep() == null : this.getOperatorDep().equals(other.getOperatorDep()))
            && (this.getCreater() == null ? other.getCreater() == null : this.getCreater().equals(other.getCreater()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPurOrderColId() == null) ? 0 : getPurOrderColId().hashCode());
        result = prime * result + ((getOrderCloCode() == null) ? 0 : getOrderCloCode().hashCode());
        result = prime * result + ((getPurOrderId() == null) ? 0 : getPurOrderId().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        result = prime * result + ((getOperatorDep() == null) ? 0 : getOperatorDep().hashCode());
        result = prime * result + ((getCreater() == null) ? 0 : getCreater().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        return result;
    }
}
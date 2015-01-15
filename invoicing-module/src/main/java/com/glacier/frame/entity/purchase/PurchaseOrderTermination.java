package com.glacier.frame.entity.purchase;

import java.math.BigDecimal;
import java.util.Date;

public class PurchaseOrderTermination {
    private String purOrderTerId;

    private String purOrderId;

    private String terminationCode;

    private String content;

    private String accessory;

    private BigDecimal amount;

    private String operatorDep;

    private String creater;

    private Date createTime;

    private String remark;

    public String getPurOrderTerId() {
        return purOrderTerId;
    }

    public void setPurOrderTerId(String purOrderTerId) {
        this.purOrderTerId = purOrderTerId;
    }

    public String getPurOrderId() {
        return purOrderId;
    }

    public void setPurOrderId(String purOrderId) {
        this.purOrderId = purOrderId;
    }

    public String getTerminationCode() {
        return terminationCode;
    }

    public void setTerminationCode(String terminationCode) {
        this.terminationCode = terminationCode;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAccessory() {
        return accessory;
    }

    public void setAccessory(String accessory) {
        this.accessory = accessory;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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
        PurchaseOrderTermination other = (PurchaseOrderTermination) that;
        return (this.getPurOrderTerId() == null ? other.getPurOrderTerId() == null : this.getPurOrderTerId().equals(other.getPurOrderTerId()))
            && (this.getPurOrderId() == null ? other.getPurOrderId() == null : this.getPurOrderId().equals(other.getPurOrderId()))
            && (this.getTerminationCode() == null ? other.getTerminationCode() == null : this.getTerminationCode().equals(other.getTerminationCode()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()))
            && (this.getAccessory() == null ? other.getAccessory() == null : this.getAccessory().equals(other.getAccessory()))
            && (this.getAmount() == null ? other.getAmount() == null : this.getAmount().equals(other.getAmount()))
            && (this.getOperatorDep() == null ? other.getOperatorDep() == null : this.getOperatorDep().equals(other.getOperatorDep()))
            && (this.getCreater() == null ? other.getCreater() == null : this.getCreater().equals(other.getCreater()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPurOrderTerId() == null) ? 0 : getPurOrderTerId().hashCode());
        result = prime * result + ((getPurOrderId() == null) ? 0 : getPurOrderId().hashCode());
        result = prime * result + ((getTerminationCode() == null) ? 0 : getTerminationCode().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        result = prime * result + ((getAccessory() == null) ? 0 : getAccessory().hashCode());
        result = prime * result + ((getAmount() == null) ? 0 : getAmount().hashCode());
        result = prime * result + ((getOperatorDep() == null) ? 0 : getOperatorDep().hashCode());
        result = prime * result + ((getCreater() == null) ? 0 : getCreater().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        return result;
    }
}
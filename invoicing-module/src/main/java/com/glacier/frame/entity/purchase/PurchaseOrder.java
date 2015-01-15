package com.glacier.frame.entity.purchase;

import java.math.BigDecimal;
import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class PurchaseOrder {
    private String purOrderId;

    private String orderCode;

    private String contractCode;

    private String orderState;

    private String purchaseTypeId;

    @JSONField(format="yyyy-MM-dd")
    private Date orderDate;

    private String storage;

    private String supplierCode;

    private String supplierId;

    private String supplierAdd;

    private String linkman;

    private String phone;

    private String fax;

    private String paymentTypeId;

    private String paymentAgrId;

    private String deliveryType;

    @JSONField(format="yyyy-MM-dd")
    private Date deliveryDadlines;

    private String deliveryAdd;

    private String invoice;

    private String invoiceTypeId;

    private String invState;

    private BigDecimal totalAmount;

    private String arrState;

    private String payState;

    private BigDecimal notArrAmo;

    private BigDecimal alrArrAmo;

    private BigDecimal notPayAmo;

    private BigDecimal alrPayAmo;

    private BigDecimal notInvAmo;

    private BigDecimal alrInvAmo;

    private String accessory;

    private String sharedPeopleId;

    private String auditState;

    private String auditor;

    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date auditDate;

    private String auditRemark;

    private String enabled;

    private String operators;

    private String operatorDep;

    private String remark;

    private String creater;

    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    private String updater;

    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date updateTime;

    private String contractTerms;

    public String getPurOrderId() {
        return purOrderId;
    }

    public void setPurOrderId(String purOrderId) {
        this.purOrderId = purOrderId;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public String getContractCode() {
        return contractCode;
    }

    public void setContractCode(String contractCode) {
        this.contractCode = contractCode;
    }

    public String getOrderState() {
        return orderState;
    }

    public void setOrderState(String orderState) {
        this.orderState = orderState;
    }

    public String getPurchaseTypeId() {
        return purchaseTypeId;
    }

    public void setPurchaseTypeId(String purchaseTypeId) {
        this.purchaseTypeId = purchaseTypeId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public String getSupplierCode() {
        return supplierCode;
    }

    public void setSupplierCode(String supplierCode) {
        this.supplierCode = supplierCode;
    }

    public String getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }

    public String getSupplierAdd() {
        return supplierAdd;
    }

    public void setSupplierAdd(String supplierAdd) {
        this.supplierAdd = supplierAdd;
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

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getPaymentTypeId() {
        return paymentTypeId;
    }

    public void setPaymentTypeId(String paymentTypeId) {
        this.paymentTypeId = paymentTypeId;
    }

    public String getPaymentAgrId() {
        return paymentAgrId;
    }

    public void setPaymentAgrId(String paymentAgrId) {
        this.paymentAgrId = paymentAgrId;
    }

    public String getDeliveryType() {
        return deliveryType;
    }

    public void setDeliveryType(String deliveryType) {
        this.deliveryType = deliveryType;
    }

    public Date getDeliveryDadlines() {
        return deliveryDadlines;
    }

    public void setDeliveryDadlines(Date deliveryDadlines) {
        this.deliveryDadlines = deliveryDadlines;
    }

    public String getDeliveryAdd() {
        return deliveryAdd;
    }

    public void setDeliveryAdd(String deliveryAdd) {
        this.deliveryAdd = deliveryAdd;
    }

    public String getInvoice() {
        return invoice;
    }

    public void setInvoice(String invoice) {
        this.invoice = invoice;
    }

    public String getInvoiceTypeId() {
        return invoiceTypeId;
    }

    public void setInvoiceTypeId(String invoiceTypeId) {
        this.invoiceTypeId = invoiceTypeId;
    }

    public String getInvState() {
        return invState;
    }

    public void setInvState(String invState) {
        this.invState = invState;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getArrState() {
        return arrState;
    }

    public void setArrState(String arrState) {
        this.arrState = arrState;
    }

    public String getPayState() {
        return payState;
    }

    public void setPayState(String payState) {
        this.payState = payState;
    }

    public BigDecimal getNotArrAmo() {
        return notArrAmo;
    }

    public void setNotArrAmo(BigDecimal notArrAmo) {
        this.notArrAmo = notArrAmo;
    }

    public BigDecimal getAlrArrAmo() {
        return alrArrAmo;
    }

    public void setAlrArrAmo(BigDecimal alrArrAmo) {
        this.alrArrAmo = alrArrAmo;
    }

    public BigDecimal getNotPayAmo() {
        return notPayAmo;
    }

    public void setNotPayAmo(BigDecimal notPayAmo) {
        this.notPayAmo = notPayAmo;
    }

    public BigDecimal getAlrPayAmo() {
        return alrPayAmo;
    }

    public void setAlrPayAmo(BigDecimal alrPayAmo) {
        this.alrPayAmo = alrPayAmo;
    }

    public BigDecimal getNotInvAmo() {
        return notInvAmo;
    }

    public void setNotInvAmo(BigDecimal notInvAmo) {
        this.notInvAmo = notInvAmo;
    }

    public BigDecimal getAlrInvAmo() {
        return alrInvAmo;
    }

    public void setAlrInvAmo(BigDecimal alrInvAmo) {
        this.alrInvAmo = alrInvAmo;
    }

    public String getAccessory() {
        return accessory;
    }

    public void setAccessory(String accessory) {
        this.accessory = accessory;
    }

    public String getSharedPeopleId() {
        return sharedPeopleId;
    }

    public void setSharedPeopleId(String sharedPeopleId) {
        this.sharedPeopleId = sharedPeopleId;
    }

    public String getAuditState() {
        return auditState;
    }

    public void setAuditState(String auditState) {
        this.auditState = auditState;
    }

    public String getAuditor() {
        return auditor;
    }

    public void setAuditor(String auditor) {
        this.auditor = auditor;
    }

    public Date getAuditDate() {
        return auditDate;
    }

    public void setAuditDate(Date auditDate) {
        this.auditDate = auditDate;
    }

    public String getAuditRemark() {
        return auditRemark;
    }

    public void setAuditRemark(String auditRemark) {
        this.auditRemark = auditRemark;
    }

    public String getEnabled() {
        return enabled;
    }

    public void setEnabled(String enabled) {
        this.enabled = enabled;
    }

    public String getOperators() {
        return operators;
    }

    public void setOperators(String operators) {
        this.operators = operators;
    }

    public String getOperatorDep() {
        return operatorDep;
    }

    public void setOperatorDep(String operatorDep) {
        this.operatorDep = operatorDep;
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

    public String getContractTerms() {
        return contractTerms;
    }

    public void setContractTerms(String contractTerms) {
        this.contractTerms = contractTerms;
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
        PurchaseOrder other = (PurchaseOrder) that;
        return (this.getPurOrderId() == null ? other.getPurOrderId() == null : this.getPurOrderId().equals(other.getPurOrderId()))
            && (this.getOrderCode() == null ? other.getOrderCode() == null : this.getOrderCode().equals(other.getOrderCode()))
            && (this.getContractCode() == null ? other.getContractCode() == null : this.getContractCode().equals(other.getContractCode()))
            && (this.getOrderState() == null ? other.getOrderState() == null : this.getOrderState().equals(other.getOrderState()))
            && (this.getPurchaseTypeId() == null ? other.getPurchaseTypeId() == null : this.getPurchaseTypeId().equals(other.getPurchaseTypeId()))
            && (this.getOrderDate() == null ? other.getOrderDate() == null : this.getOrderDate().equals(other.getOrderDate()))
            && (this.getStorage() == null ? other.getStorage() == null : this.getStorage().equals(other.getStorage()))
            && (this.getSupplierCode() == null ? other.getSupplierCode() == null : this.getSupplierCode().equals(other.getSupplierCode()))
            && (this.getSupplierId() == null ? other.getSupplierId() == null : this.getSupplierId().equals(other.getSupplierId()))
            && (this.getSupplierAdd() == null ? other.getSupplierAdd() == null : this.getSupplierAdd().equals(other.getSupplierAdd()))
            && (this.getLinkman() == null ? other.getLinkman() == null : this.getLinkman().equals(other.getLinkman()))
            && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()))
            && (this.getFax() == null ? other.getFax() == null : this.getFax().equals(other.getFax()))
            && (this.getPaymentTypeId() == null ? other.getPaymentTypeId() == null : this.getPaymentTypeId().equals(other.getPaymentTypeId()))
            && (this.getPaymentAgrId() == null ? other.getPaymentAgrId() == null : this.getPaymentAgrId().equals(other.getPaymentAgrId()))
            && (this.getDeliveryType() == null ? other.getDeliveryType() == null : this.getDeliveryType().equals(other.getDeliveryType()))
            && (this.getDeliveryDadlines() == null ? other.getDeliveryDadlines() == null : this.getDeliveryDadlines().equals(other.getDeliveryDadlines()))
            && (this.getDeliveryAdd() == null ? other.getDeliveryAdd() == null : this.getDeliveryAdd().equals(other.getDeliveryAdd()))
            && (this.getInvoice() == null ? other.getInvoice() == null : this.getInvoice().equals(other.getInvoice()))
            && (this.getInvoiceTypeId() == null ? other.getInvoiceTypeId() == null : this.getInvoiceTypeId().equals(other.getInvoiceTypeId()))
            && (this.getInvState() == null ? other.getInvState() == null : this.getInvState().equals(other.getInvState()))
            && (this.getTotalAmount() == null ? other.getTotalAmount() == null : this.getTotalAmount().equals(other.getTotalAmount()))
            && (this.getArrState() == null ? other.getArrState() == null : this.getArrState().equals(other.getArrState()))
            && (this.getPayState() == null ? other.getPayState() == null : this.getPayState().equals(other.getPayState()))
            && (this.getNotArrAmo() == null ? other.getNotArrAmo() == null : this.getNotArrAmo().equals(other.getNotArrAmo()))
            && (this.getAlrArrAmo() == null ? other.getAlrArrAmo() == null : this.getAlrArrAmo().equals(other.getAlrArrAmo()))
            && (this.getNotPayAmo() == null ? other.getNotPayAmo() == null : this.getNotPayAmo().equals(other.getNotPayAmo()))
            && (this.getAlrPayAmo() == null ? other.getAlrPayAmo() == null : this.getAlrPayAmo().equals(other.getAlrPayAmo()))
            && (this.getNotInvAmo() == null ? other.getNotInvAmo() == null : this.getNotInvAmo().equals(other.getNotInvAmo()))
            && (this.getAlrInvAmo() == null ? other.getAlrInvAmo() == null : this.getAlrInvAmo().equals(other.getAlrInvAmo()))
            && (this.getAccessory() == null ? other.getAccessory() == null : this.getAccessory().equals(other.getAccessory()))
            && (this.getSharedPeopleId() == null ? other.getSharedPeopleId() == null : this.getSharedPeopleId().equals(other.getSharedPeopleId()))
            && (this.getAuditState() == null ? other.getAuditState() == null : this.getAuditState().equals(other.getAuditState()))
            && (this.getAuditor() == null ? other.getAuditor() == null : this.getAuditor().equals(other.getAuditor()))
            && (this.getAuditDate() == null ? other.getAuditDate() == null : this.getAuditDate().equals(other.getAuditDate()))
            && (this.getAuditRemark() == null ? other.getAuditRemark() == null : this.getAuditRemark().equals(other.getAuditRemark()))
            && (this.getEnabled() == null ? other.getEnabled() == null : this.getEnabled().equals(other.getEnabled()))
            && (this.getOperators() == null ? other.getOperators() == null : this.getOperators().equals(other.getOperators()))
            && (this.getOperatorDep() == null ? other.getOperatorDep() == null : this.getOperatorDep().equals(other.getOperatorDep()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getCreater() == null ? other.getCreater() == null : this.getCreater().equals(other.getCreater()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdater() == null ? other.getUpdater() == null : this.getUpdater().equals(other.getUpdater()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getContractTerms() == null ? other.getContractTerms() == null : this.getContractTerms().equals(other.getContractTerms()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPurOrderId() == null) ? 0 : getPurOrderId().hashCode());
        result = prime * result + ((getOrderCode() == null) ? 0 : getOrderCode().hashCode());
        result = prime * result + ((getContractCode() == null) ? 0 : getContractCode().hashCode());
        result = prime * result + ((getOrderState() == null) ? 0 : getOrderState().hashCode());
        result = prime * result + ((getPurchaseTypeId() == null) ? 0 : getPurchaseTypeId().hashCode());
        result = prime * result + ((getOrderDate() == null) ? 0 : getOrderDate().hashCode());
        result = prime * result + ((getStorage() == null) ? 0 : getStorage().hashCode());
        result = prime * result + ((getSupplierCode() == null) ? 0 : getSupplierCode().hashCode());
        result = prime * result + ((getSupplierId() == null) ? 0 : getSupplierId().hashCode());
        result = prime * result + ((getSupplierAdd() == null) ? 0 : getSupplierAdd().hashCode());
        result = prime * result + ((getLinkman() == null) ? 0 : getLinkman().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
        result = prime * result + ((getFax() == null) ? 0 : getFax().hashCode());
        result = prime * result + ((getPaymentTypeId() == null) ? 0 : getPaymentTypeId().hashCode());
        result = prime * result + ((getPaymentAgrId() == null) ? 0 : getPaymentAgrId().hashCode());
        result = prime * result + ((getDeliveryType() == null) ? 0 : getDeliveryType().hashCode());
        result = prime * result + ((getDeliveryDadlines() == null) ? 0 : getDeliveryDadlines().hashCode());
        result = prime * result + ((getDeliveryAdd() == null) ? 0 : getDeliveryAdd().hashCode());
        result = prime * result + ((getInvoice() == null) ? 0 : getInvoice().hashCode());
        result = prime * result + ((getInvoiceTypeId() == null) ? 0 : getInvoiceTypeId().hashCode());
        result = prime * result + ((getInvState() == null) ? 0 : getInvState().hashCode());
        result = prime * result + ((getTotalAmount() == null) ? 0 : getTotalAmount().hashCode());
        result = prime * result + ((getArrState() == null) ? 0 : getArrState().hashCode());
        result = prime * result + ((getPayState() == null) ? 0 : getPayState().hashCode());
        result = prime * result + ((getNotArrAmo() == null) ? 0 : getNotArrAmo().hashCode());
        result = prime * result + ((getAlrArrAmo() == null) ? 0 : getAlrArrAmo().hashCode());
        result = prime * result + ((getNotPayAmo() == null) ? 0 : getNotPayAmo().hashCode());
        result = prime * result + ((getAlrPayAmo() == null) ? 0 : getAlrPayAmo().hashCode());
        result = prime * result + ((getNotInvAmo() == null) ? 0 : getNotInvAmo().hashCode());
        result = prime * result + ((getAlrInvAmo() == null) ? 0 : getAlrInvAmo().hashCode());
        result = prime * result + ((getAccessory() == null) ? 0 : getAccessory().hashCode());
        result = prime * result + ((getSharedPeopleId() == null) ? 0 : getSharedPeopleId().hashCode());
        result = prime * result + ((getAuditState() == null) ? 0 : getAuditState().hashCode());
        result = prime * result + ((getAuditor() == null) ? 0 : getAuditor().hashCode());
        result = prime * result + ((getAuditDate() == null) ? 0 : getAuditDate().hashCode());
        result = prime * result + ((getAuditRemark() == null) ? 0 : getAuditRemark().hashCode());
        result = prime * result + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        result = prime * result + ((getOperators() == null) ? 0 : getOperators().hashCode());
        result = prime * result + ((getOperatorDep() == null) ? 0 : getOperatorDep().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getCreater() == null) ? 0 : getCreater().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdater() == null) ? 0 : getUpdater().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getContractTerms() == null) ? 0 : getContractTerms().hashCode());
        return result;
    }
}
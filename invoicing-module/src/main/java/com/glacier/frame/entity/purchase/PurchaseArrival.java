package com.glacier.frame.entity.purchase;

import java.math.BigDecimal;
import java.util.Date;

public class PurchaseArrival {
    private String purArrivalId;

    private String purchaseTypeId;//采购类型

    private String arrivalCode;//到货单号

    private String contractCode;//合同编号

    private String supplierId;//供应商编号

    private String fax;//传真

    private String linkman;//联系人

    private String phone;//联系电话

    private String supplierAdd;//供应商地址

    private String storage;//仓库

    private String deliveryType;//交货方式

    private Date deliveryDead;//交货期限

    private String paymentAgrId;//付款约定ID

    private String deliveryAdd;//交货地址

    private String invoice;//是否开票

    private String invoiceTypeId;//发票类别

    private String paymentTypeId;//支付方式

    private String logSettlementId;//运费结算方式ID

    private String logCode;//运单号

    private BigDecimal logTotalTmount;//运费总额

    private String logCompany;//物流公司ID

    private String logLinkman;//物流联系人

    private String logPhone;//物流联系电话

    private BigDecimal totalAmount;//总金额

    private BigDecimal derateMoney;//应付减免金额

    private Date arrivalDate;//到货时间

    private String acceptor;//验收人

    private String accessory;//附件

    private BigDecimal notPayAmo;//未付款金额

    private BigDecimal alrPayAmo;//已付款金额

    private String invState;//开票状态

    private BigDecimal notInvAmo;//为开票金额

    private BigDecimal alrInvAmo;//已开票金额

    private String returnState;//退货状态

    private BigDecimal notReturnAmo;//未退货金额

    private BigDecimal alrReturnAmo;//已退货金额

    private String payState;//付款状态

    private String auditState;

    private String auditor;

    private Date auditDate;

    private String auditRemark;

    private String enabled;

    private String operators;//经办人

    private String operatorDep;//经办部分

    private String confirmor;//运费确认人

    private String confirmorDepartment;//运费确认部门

    private Date confirmorTime;//确认日期

    private String tailAfterStatus;//货物跟踪状态

    private String summary;//物品摘要

    private String remark;

    private String creater;

    private Date createTime;

    private String updater;

    private Date updateTime;
    
    //自定义字段
    private String purchaseTypeDisplay;
    
    private String storageDisplay;
    
    private String supplierDisplay;
    
    private String operatorsDisplay;
    
    private String paymentTypeDisplay;

    public String getPurArrivalId() {
        return purArrivalId;
    }

    public void setPurArrivalId(String purArrivalId) {
        this.purArrivalId = purArrivalId;
    }

    public String getPurchaseTypeId() {
        return purchaseTypeId;
    }

    public void setPurchaseTypeId(String purchaseTypeId) {
        this.purchaseTypeId = purchaseTypeId;
    }

    public String getArrivalCode() {
        return arrivalCode;
    }

    public void setArrivalCode(String arrivalCode) {
        this.arrivalCode = arrivalCode;
    }

    public String getContractCode() {
        return contractCode;
    }

    public void setContractCode(String contractCode) {
        this.contractCode = contractCode;
    }

    public String getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
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

    public String getSupplierAdd() {
        return supplierAdd;
    }

    public void setSupplierAdd(String supplierAdd) {
        this.supplierAdd = supplierAdd;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public String getDeliveryType() {
        return deliveryType;
    }

    public void setDeliveryType(String deliveryType) {
        this.deliveryType = deliveryType;
    }

    public Date getDeliveryDead() {
        return deliveryDead;
    }

    public void setDeliveryDead(Date deliveryDead) {
        this.deliveryDead = deliveryDead;
    }

    public String getPaymentAgrId() {
        return paymentAgrId;
    }

    public void setPaymentAgrId(String paymentAgrId) {
        this.paymentAgrId = paymentAgrId;
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

    public String getPaymentTypeId() {
        return paymentTypeId;
    }

    public void setPaymentTypeId(String paymentTypeId) {
        this.paymentTypeId = paymentTypeId;
    }

    public String getLogSettlementId() {
        return logSettlementId;
    }

    public void setLogSettlementId(String logSettlementId) {
        this.logSettlementId = logSettlementId;
    }

    public String getLogCode() {
        return logCode;
    }

    public void setLogCode(String logCode) {
        this.logCode = logCode;
    }

    public BigDecimal getLogTotalTmount() {
        return logTotalTmount;
    }

    public void setLogTotalTmount(BigDecimal logTotalTmount) {
        this.logTotalTmount = logTotalTmount;
    }

    public String getLogCompany() {
        return logCompany;
    }

    public void setLogCompany(String logCompany) {
        this.logCompany = logCompany;
    }

    public String getLogLinkman() {
        return logLinkman;
    }

    public void setLogLinkman(String logLinkman) {
        this.logLinkman = logLinkman;
    }

    public String getLogPhone() {
        return logPhone;
    }

    public void setLogPhone(String logPhone) {
        this.logPhone = logPhone;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public BigDecimal getDerateMoney() {
        return derateMoney;
    }

    public void setDerateMoney(BigDecimal derateMoney) {
        this.derateMoney = derateMoney;
    }

    public Date getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(Date arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public String getAcceptor() {
        return acceptor;
    }

    public void setAcceptor(String acceptor) {
        this.acceptor = acceptor;
    }

    public String getAccessory() {
        return accessory;
    }

    public void setAccessory(String accessory) {
        this.accessory = accessory;
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

    public String getInvState() {
        return invState;
    }

    public void setInvState(String invState) {
        this.invState = invState;
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

    public String getReturnState() {
        return returnState;
    }

    public void setReturnState(String returnState) {
        this.returnState = returnState;
    }

    public BigDecimal getNotReturnAmo() {
        return notReturnAmo;
    }

    public void setNotReturnAmo(BigDecimal notReturnAmo) {
        this.notReturnAmo = notReturnAmo;
    }

    public BigDecimal getAlrReturnAmo() {
        return alrReturnAmo;
    }

    public void setAlrReturnAmo(BigDecimal alrReturnAmo) {
        this.alrReturnAmo = alrReturnAmo;
    }

    public String getPayState() {
        return payState;
    }

    public void setPayState(String payState) {
        this.payState = payState;
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

    public String getConfirmor() {
        return confirmor;
    }

    public void setConfirmor(String confirmor) {
        this.confirmor = confirmor;
    }

    public String getConfirmorDepartment() {
        return confirmorDepartment;
    }

    public void setConfirmorDepartment(String confirmorDepartment) {
        this.confirmorDepartment = confirmorDepartment;
    }

    public Date getConfirmorTime() {
        return confirmorTime;
    }

    public void setConfirmorTime(Date confirmorTime) {
        this.confirmorTime = confirmorTime;
    }

    public String getTailAfterStatus() {
        return tailAfterStatus;
    }

    public void setTailAfterStatus(String tailAfterStatus) {
        this.tailAfterStatus = tailAfterStatus;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
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
    
    public String getPurchaseTypeDisplay() {
		return purchaseTypeDisplay;
	}

	public void setPurchaseTypeDisplay(String purchaseTypeDisplay) {
		this.purchaseTypeDisplay = purchaseTypeDisplay;
	}

	public String getStorageDisplay() {
		return storageDisplay;
	}

	public void setStorageDisplay(String storageDisplay) {
		this.storageDisplay = storageDisplay;
	}

	public String getSupplierDisplay() {
		return supplierDisplay;
	}

	public void setSupplierDisplay(String supplierDisplay) {
		this.supplierDisplay = supplierDisplay;
	}

	public String getOperatorsDisplay() {
		return operatorsDisplay;
	}

	public void setOperatorsDisplay(String operatorsDisplay) {
		this.operatorsDisplay = operatorsDisplay;
	}

	public String getPaymentTypeDisplay() {
		return paymentTypeDisplay;
	}

	public void setPaymentTypeDisplay(String paymentTypeDisplay) {
		this.paymentTypeDisplay = paymentTypeDisplay;
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
        PurchaseArrival other = (PurchaseArrival) that;
        return (this.getPurArrivalId() == null ? other.getPurArrivalId() == null : this.getPurArrivalId().equals(other.getPurArrivalId()))
            && (this.getPurchaseTypeId() == null ? other.getPurchaseTypeId() == null : this.getPurchaseTypeId().equals(other.getPurchaseTypeId()))
            && (this.getArrivalCode() == null ? other.getArrivalCode() == null : this.getArrivalCode().equals(other.getArrivalCode()))
            && (this.getContractCode() == null ? other.getContractCode() == null : this.getContractCode().equals(other.getContractCode()))
            && (this.getSupplierId() == null ? other.getSupplierId() == null : this.getSupplierId().equals(other.getSupplierId()))
            && (this.getFax() == null ? other.getFax() == null : this.getFax().equals(other.getFax()))
            && (this.getLinkman() == null ? other.getLinkman() == null : this.getLinkman().equals(other.getLinkman()))
            && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()))
            && (this.getSupplierAdd() == null ? other.getSupplierAdd() == null : this.getSupplierAdd().equals(other.getSupplierAdd()))
            && (this.getStorage() == null ? other.getStorage() == null : this.getStorage().equals(other.getStorage()))
            && (this.getDeliveryType() == null ? other.getDeliveryType() == null : this.getDeliveryType().equals(other.getDeliveryType()))
            && (this.getDeliveryDead() == null ? other.getDeliveryDead() == null : this.getDeliveryDead().equals(other.getDeliveryDead()))
            && (this.getPaymentAgrId() == null ? other.getPaymentAgrId() == null : this.getPaymentAgrId().equals(other.getPaymentAgrId()))
            && (this.getDeliveryAdd() == null ? other.getDeliveryAdd() == null : this.getDeliveryAdd().equals(other.getDeliveryAdd()))
            && (this.getInvoice() == null ? other.getInvoice() == null : this.getInvoice().equals(other.getInvoice()))
            && (this.getInvoiceTypeId() == null ? other.getInvoiceTypeId() == null : this.getInvoiceTypeId().equals(other.getInvoiceTypeId()))
            && (this.getPaymentTypeId() == null ? other.getPaymentTypeId() == null : this.getPaymentTypeId().equals(other.getPaymentTypeId()))
            && (this.getLogSettlementId() == null ? other.getLogSettlementId() == null : this.getLogSettlementId().equals(other.getLogSettlementId()))
            && (this.getLogCode() == null ? other.getLogCode() == null : this.getLogCode().equals(other.getLogCode()))
            && (this.getLogTotalTmount() == null ? other.getLogTotalTmount() == null : this.getLogTotalTmount().equals(other.getLogTotalTmount()))
            && (this.getLogCompany() == null ? other.getLogCompany() == null : this.getLogCompany().equals(other.getLogCompany()))
            && (this.getLogLinkman() == null ? other.getLogLinkman() == null : this.getLogLinkman().equals(other.getLogLinkman()))
            && (this.getLogPhone() == null ? other.getLogPhone() == null : this.getLogPhone().equals(other.getLogPhone()))
            && (this.getTotalAmount() == null ? other.getTotalAmount() == null : this.getTotalAmount().equals(other.getTotalAmount()))
            && (this.getDerateMoney() == null ? other.getDerateMoney() == null : this.getDerateMoney().equals(other.getDerateMoney()))
            && (this.getArrivalDate() == null ? other.getArrivalDate() == null : this.getArrivalDate().equals(other.getArrivalDate()))
            && (this.getAcceptor() == null ? other.getAcceptor() == null : this.getAcceptor().equals(other.getAcceptor()))
            && (this.getAccessory() == null ? other.getAccessory() == null : this.getAccessory().equals(other.getAccessory()))
            && (this.getNotPayAmo() == null ? other.getNotPayAmo() == null : this.getNotPayAmo().equals(other.getNotPayAmo()))
            && (this.getAlrPayAmo() == null ? other.getAlrPayAmo() == null : this.getAlrPayAmo().equals(other.getAlrPayAmo()))
            && (this.getInvState() == null ? other.getInvState() == null : this.getInvState().equals(other.getInvState()))
            && (this.getNotInvAmo() == null ? other.getNotInvAmo() == null : this.getNotInvAmo().equals(other.getNotInvAmo()))
            && (this.getAlrInvAmo() == null ? other.getAlrInvAmo() == null : this.getAlrInvAmo().equals(other.getAlrInvAmo()))
            && (this.getReturnState() == null ? other.getReturnState() == null : this.getReturnState().equals(other.getReturnState()))
            && (this.getNotReturnAmo() == null ? other.getNotReturnAmo() == null : this.getNotReturnAmo().equals(other.getNotReturnAmo()))
            && (this.getAlrReturnAmo() == null ? other.getAlrReturnAmo() == null : this.getAlrReturnAmo().equals(other.getAlrReturnAmo()))
            && (this.getPayState() == null ? other.getPayState() == null : this.getPayState().equals(other.getPayState()))
            && (this.getAuditState() == null ? other.getAuditState() == null : this.getAuditState().equals(other.getAuditState()))
            && (this.getAuditor() == null ? other.getAuditor() == null : this.getAuditor().equals(other.getAuditor()))
            && (this.getAuditDate() == null ? other.getAuditDate() == null : this.getAuditDate().equals(other.getAuditDate()))
            && (this.getAuditRemark() == null ? other.getAuditRemark() == null : this.getAuditRemark().equals(other.getAuditRemark()))
            && (this.getEnabled() == null ? other.getEnabled() == null : this.getEnabled().equals(other.getEnabled()))
            && (this.getOperators() == null ? other.getOperators() == null : this.getOperators().equals(other.getOperators()))
            && (this.getOperatorDep() == null ? other.getOperatorDep() == null : this.getOperatorDep().equals(other.getOperatorDep()))
            && (this.getConfirmor() == null ? other.getConfirmor() == null : this.getConfirmor().equals(other.getConfirmor()))
            && (this.getConfirmorDepartment() == null ? other.getConfirmorDepartment() == null : this.getConfirmorDepartment().equals(other.getConfirmorDepartment()))
            && (this.getConfirmorTime() == null ? other.getConfirmorTime() == null : this.getConfirmorTime().equals(other.getConfirmorTime()))
            && (this.getTailAfterStatus() == null ? other.getTailAfterStatus() == null : this.getTailAfterStatus().equals(other.getTailAfterStatus()))
            && (this.getSummary() == null ? other.getSummary() == null : this.getSummary().equals(other.getSummary()))
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
        result = prime * result + ((getPurArrivalId() == null) ? 0 : getPurArrivalId().hashCode());
        result = prime * result + ((getPurchaseTypeId() == null) ? 0 : getPurchaseTypeId().hashCode());
        result = prime * result + ((getArrivalCode() == null) ? 0 : getArrivalCode().hashCode());
        result = prime * result + ((getContractCode() == null) ? 0 : getContractCode().hashCode());
        result = prime * result + ((getSupplierId() == null) ? 0 : getSupplierId().hashCode());
        result = prime * result + ((getFax() == null) ? 0 : getFax().hashCode());
        result = prime * result + ((getLinkman() == null) ? 0 : getLinkman().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
        result = prime * result + ((getSupplierAdd() == null) ? 0 : getSupplierAdd().hashCode());
        result = prime * result + ((getStorage() == null) ? 0 : getStorage().hashCode());
        result = prime * result + ((getDeliveryType() == null) ? 0 : getDeliveryType().hashCode());
        result = prime * result + ((getDeliveryDead() == null) ? 0 : getDeliveryDead().hashCode());
        result = prime * result + ((getPaymentAgrId() == null) ? 0 : getPaymentAgrId().hashCode());
        result = prime * result + ((getDeliveryAdd() == null) ? 0 : getDeliveryAdd().hashCode());
        result = prime * result + ((getInvoice() == null) ? 0 : getInvoice().hashCode());
        result = prime * result + ((getInvoiceTypeId() == null) ? 0 : getInvoiceTypeId().hashCode());
        result = prime * result + ((getPaymentTypeId() == null) ? 0 : getPaymentTypeId().hashCode());
        result = prime * result + ((getLogSettlementId() == null) ? 0 : getLogSettlementId().hashCode());
        result = prime * result + ((getLogCode() == null) ? 0 : getLogCode().hashCode());
        result = prime * result + ((getLogTotalTmount() == null) ? 0 : getLogTotalTmount().hashCode());
        result = prime * result + ((getLogCompany() == null) ? 0 : getLogCompany().hashCode());
        result = prime * result + ((getLogLinkman() == null) ? 0 : getLogLinkman().hashCode());
        result = prime * result + ((getLogPhone() == null) ? 0 : getLogPhone().hashCode());
        result = prime * result + ((getTotalAmount() == null) ? 0 : getTotalAmount().hashCode());
        result = prime * result + ((getDerateMoney() == null) ? 0 : getDerateMoney().hashCode());
        result = prime * result + ((getArrivalDate() == null) ? 0 : getArrivalDate().hashCode());
        result = prime * result + ((getAcceptor() == null) ? 0 : getAcceptor().hashCode());
        result = prime * result + ((getAccessory() == null) ? 0 : getAccessory().hashCode());
        result = prime * result + ((getNotPayAmo() == null) ? 0 : getNotPayAmo().hashCode());
        result = prime * result + ((getAlrPayAmo() == null) ? 0 : getAlrPayAmo().hashCode());
        result = prime * result + ((getInvState() == null) ? 0 : getInvState().hashCode());
        result = prime * result + ((getNotInvAmo() == null) ? 0 : getNotInvAmo().hashCode());
        result = prime * result + ((getAlrInvAmo() == null) ? 0 : getAlrInvAmo().hashCode());
        result = prime * result + ((getReturnState() == null) ? 0 : getReturnState().hashCode());
        result = prime * result + ((getNotReturnAmo() == null) ? 0 : getNotReturnAmo().hashCode());
        result = prime * result + ((getAlrReturnAmo() == null) ? 0 : getAlrReturnAmo().hashCode());
        result = prime * result + ((getPayState() == null) ? 0 : getPayState().hashCode());
        result = prime * result + ((getAuditState() == null) ? 0 : getAuditState().hashCode());
        result = prime * result + ((getAuditor() == null) ? 0 : getAuditor().hashCode());
        result = prime * result + ((getAuditDate() == null) ? 0 : getAuditDate().hashCode());
        result = prime * result + ((getAuditRemark() == null) ? 0 : getAuditRemark().hashCode());
        result = prime * result + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        result = prime * result + ((getOperators() == null) ? 0 : getOperators().hashCode());
        result = prime * result + ((getOperatorDep() == null) ? 0 : getOperatorDep().hashCode());
        result = prime * result + ((getConfirmor() == null) ? 0 : getConfirmor().hashCode());
        result = prime * result + ((getConfirmorDepartment() == null) ? 0 : getConfirmorDepartment().hashCode());
        result = prime * result + ((getConfirmorTime() == null) ? 0 : getConfirmorTime().hashCode());
        result = prime * result + ((getTailAfterStatus() == null) ? 0 : getTailAfterStatus().hashCode());
        result = prime * result + ((getSummary() == null) ? 0 : getSummary().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getCreater() == null) ? 0 : getCreater().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdater() == null) ? 0 : getUpdater().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }
}
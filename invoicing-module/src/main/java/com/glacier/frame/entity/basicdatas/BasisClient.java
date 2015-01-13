package com.glacier.frame.entity.basicdatas;

import java.math.BigDecimal;
import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class BasisClient {
    private String clientId;

    private String clientCode;

    private String clientTypeId;

    private String clientName;

    private String clientGrade;//客户级别-

    private String clientSource;//客户来源-

    private String provinceManager;//省经理

    private String serviceManager;//业务经理

    private String companyScale;//公司规模

    private String marketingDepartment;//销售部门

    private String companyPhone;//客户档案手机-

    private String companyFax;//客户档案传真-

    private String companyWebsite;//客户档案网站-

    private String companyEmail;//客户档案邮箱-

    private String province;//省-

    private String city;//城市-

    private String adress;//地址-

    private String zipCode;//邮编-

    private String pricePolicy;//价格政策-

    private Integer contactCycle;//联系周期-

    private String companyNatureId;//公司性质-

    private String mainBusiness;//主营业务-

    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date openedYear;//开业年份-

    private BigDecimal registeredCapital;//注册资金-

    private String corporate;//公司法人-

    private String creditLevelId;//信用等级

    private String clientIntegral;//信用积分

    private String bank;//开户银行

    private String bankAccount;//银行账户

    private String tariff;//税号-

    private String controlCredit;//是否控制信用-

    private BigDecimal limitCredit;//信用额度

    private BigDecimal presentCredit;//当前信用额度

    private BigDecimal presentDebt;//当前欠款

    private BigDecimal advancesReceived;//预收款余额
    
    private String setupPerson;//调整人

    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date setupTime;//调整时间

    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date clientCreate;//客户建立日期

    private String superiorClientId;//所属上级客户

    private String accessory;//附件

    private String staffId;//销售代表

    private String enabled;//是否启用

    private String remark;//备注

    private String auditState;//审核状态

    private String auditor;//审核人

    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date auditDate;

    private String auditRemark;//审核备注

    private String creater;

    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    private String updater;

    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date updateTime;

    //自定义字段
    private String clientTypeDisplay;
    
    private String clientGradeDisplay;
    
    private String clientSourceDisplay;
    
    private String userDisplay;
    
    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getClientCode() {
        return clientCode;
    }

    public void setClientCode(String clientCode) {
        this.clientCode = clientCode;
    }

    public String getClientTypeId() {
        return clientTypeId;
    }

    public void setClientTypeId(String clientTypeId) {
        this.clientTypeId = clientTypeId;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientGrade() {
        return clientGrade;
    }

    public void setClientGrade(String clientGrade) {
        this.clientGrade = clientGrade;
    }

    public String getClientSource() {
        return clientSource;
    }

    public void setClientSource(String clientSource) {
        this.clientSource = clientSource;
    }

    public String getProvinceManager() {
        return provinceManager;
    }

    public void setProvinceManager(String provinceManager) {
        this.provinceManager = provinceManager;
    }

    public String getServiceManager() {
        return serviceManager;
    }

    public void setServiceManager(String serviceManager) {
        this.serviceManager = serviceManager;
    }

    public String getCompanyScale() {
        return companyScale;
    }

    public void setCompanyScale(String companyScale) {
        this.companyScale = companyScale;
    }

    public String getMarketingDepartment() {
        return marketingDepartment;
    }

    public void setMarketingDepartment(String marketingDepartment) {
        this.marketingDepartment = marketingDepartment;
    }

    public String getCompanyPhone() {
        return companyPhone;
    }

    public void setCompanyPhone(String companyPhone) {
        this.companyPhone = companyPhone;
    }

    public String getCompanyFax() {
        return companyFax;
    }

    public void setCompanyFax(String companyFax) {
        this.companyFax = companyFax;
    }

    public String getCompanyWebsite() {
        return companyWebsite;
    }

    public void setCompanyWebsite(String companyWebsite) {
        this.companyWebsite = companyWebsite;
    }

    public String getCompanyEmail() {
        return companyEmail;
    }

    public void setCompanyEmail(String companyEmail) {
        this.companyEmail = companyEmail;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getPricePolicy() {
        return pricePolicy;
    }

    public void setPricePolicy(String pricePolicy) {
        this.pricePolicy = pricePolicy;
    }

    public Integer getContactCycle() {
        return contactCycle;
    }

    public void setContactCycle(Integer contactCycle) {
        this.contactCycle = contactCycle;
    }

    public String getCompanyNatureId() {
        return companyNatureId;
    }

    public void setCompanyNatureId(String companyNatureId) {
        this.companyNatureId = companyNatureId;
    }

    public String getMainBusiness() {
        return mainBusiness;
    }

    public void setMainBusiness(String mainBusiness) {
        this.mainBusiness = mainBusiness;
    }

    public Date getOpenedYear() {
        return openedYear;
    }

    public void setOpenedYear(Date openedYear) {
        this.openedYear = openedYear;
    }

    public BigDecimal getRegisteredCapital() {
        return registeredCapital;
    }

    public void setRegisteredCapital(BigDecimal registeredCapital) {
        this.registeredCapital = registeredCapital;
    }

    public String getCorporate() {
        return corporate;
    }

    public void setCorporate(String corporate) {
        this.corporate = corporate;
    }

    public String getCreditLevelId() {
        return creditLevelId;
    }

    public void setCreditLevelId(String creditLevelId) {
        this.creditLevelId = creditLevelId;
    }

    public String getClientIntegral() {
        return clientIntegral;
    }

    public void setClientIntegral(String clientIntegral) {
        this.clientIntegral = clientIntegral;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    public String getTariff() {
        return tariff;
    }

    public void setTariff(String tariff) {
        this.tariff = tariff;
    }

    public String getControlCredit() {
        return controlCredit;
    }

    public void setControlCredit(String controlCredit) {
        this.controlCredit = controlCredit;
    }

    public BigDecimal getLimitCredit() {
        return limitCredit;
    }

    public void setLimitCredit(BigDecimal limitCredit) {
        this.limitCredit = limitCredit;
    }

    public BigDecimal getPresentCredit() {
        return presentCredit;
    }

    public void setPresentCredit(BigDecimal presentCredit) {
        this.presentCredit = presentCredit;
    }

    public BigDecimal getPresentDebt() {
        return presentDebt;
    }

    public void setPresentDebt(BigDecimal presentDebt) {
        this.presentDebt = presentDebt;
    }

    public BigDecimal getAdvancesReceived() {
        return advancesReceived;
    }

    public void setAdvancesReceived(BigDecimal advancesReceived) {
        this.advancesReceived = advancesReceived;
    }

    public String getSetupPerson() {
        return setupPerson;
    }

    public void setSetupPerson(String setupPerson) {
        this.setupPerson = setupPerson;
    }

    public Date getSetupTime() {
        return setupTime;
    }

    public void setSetupTime(Date setupTime) {
        this.setupTime = setupTime;
    }

    public Date getClientCreate() {
        return clientCreate;
    }

    public void setClientCreate(Date clientCreate) {
        this.clientCreate = clientCreate;
    }

    public String getSuperiorClientId() {
        return superiorClientId;
    }

    public void setSuperiorClientId(String superiorClientId) {
        this.superiorClientId = superiorClientId;
    }

    public String getAccessory() {
        return accessory;
    }

    public void setAccessory(String accessory) {
        this.accessory = accessory;
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
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

	public String getClientTypeDisplay() {
		return clientTypeDisplay;
	}

	public void setClientTypeDisplay(String clientTypeDisplay) {
		this.clientTypeDisplay = clientTypeDisplay;
	}

	public String getClientGradeDisplay() {
		return clientGradeDisplay;
	}

	public void setClientGradeDisplay(String clientGradeDisplay) {
		this.clientGradeDisplay = clientGradeDisplay;
	}

	public String getClientSourceDisplay() {
		return clientSourceDisplay;
	}

	public void setClientSourceDisplay(String clientSourceDisplay) {
		this.clientSourceDisplay = clientSourceDisplay;
	}

	public String getUserDisplay() {
		return userDisplay;
	}

	public void setUserDisplay(String userDisplay) {
		this.userDisplay = userDisplay;
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
        BasisClient other = (BasisClient) that;
        return (this.getClientId() == null ? other.getClientId() == null : this.getClientId().equals(other.getClientId()))
            && (this.getClientCode() == null ? other.getClientCode() == null : this.getClientCode().equals(other.getClientCode()))
            && (this.getClientTypeId() == null ? other.getClientTypeId() == null : this.getClientTypeId().equals(other.getClientTypeId()))
            && (this.getClientName() == null ? other.getClientName() == null : this.getClientName().equals(other.getClientName()))
            && (this.getClientGrade() == null ? other.getClientGrade() == null : this.getClientGrade().equals(other.getClientGrade()))
            && (this.getClientSource() == null ? other.getClientSource() == null : this.getClientSource().equals(other.getClientSource()))
            && (this.getProvinceManager() == null ? other.getProvinceManager() == null : this.getProvinceManager().equals(other.getProvinceManager()))
            && (this.getServiceManager() == null ? other.getServiceManager() == null : this.getServiceManager().equals(other.getServiceManager()))
            && (this.getCompanyScale() == null ? other.getCompanyScale() == null : this.getCompanyScale().equals(other.getCompanyScale()))
            && (this.getMarketingDepartment() == null ? other.getMarketingDepartment() == null : this.getMarketingDepartment().equals(other.getMarketingDepartment()))
            && (this.getCompanyPhone() == null ? other.getCompanyPhone() == null : this.getCompanyPhone().equals(other.getCompanyPhone()))
            && (this.getCompanyFax() == null ? other.getCompanyFax() == null : this.getCompanyFax().equals(other.getCompanyFax()))
            && (this.getCompanyWebsite() == null ? other.getCompanyWebsite() == null : this.getCompanyWebsite().equals(other.getCompanyWebsite()))
            && (this.getCompanyEmail() == null ? other.getCompanyEmail() == null : this.getCompanyEmail().equals(other.getCompanyEmail()))
            && (this.getProvince() == null ? other.getProvince() == null : this.getProvince().equals(other.getProvince()))
            && (this.getCity() == null ? other.getCity() == null : this.getCity().equals(other.getCity()))
            && (this.getAdress() == null ? other.getAdress() == null : this.getAdress().equals(other.getAdress()))
            && (this.getZipCode() == null ? other.getZipCode() == null : this.getZipCode().equals(other.getZipCode()))
            && (this.getPricePolicy() == null ? other.getPricePolicy() == null : this.getPricePolicy().equals(other.getPricePolicy()))
            && (this.getContactCycle() == null ? other.getContactCycle() == null : this.getContactCycle().equals(other.getContactCycle()))
            && (this.getCompanyNatureId() == null ? other.getCompanyNatureId() == null : this.getCompanyNatureId().equals(other.getCompanyNatureId()))
            && (this.getMainBusiness() == null ? other.getMainBusiness() == null : this.getMainBusiness().equals(other.getMainBusiness()))
            && (this.getOpenedYear() == null ? other.getOpenedYear() == null : this.getOpenedYear().equals(other.getOpenedYear()))
            && (this.getRegisteredCapital() == null ? other.getRegisteredCapital() == null : this.getRegisteredCapital().equals(other.getRegisteredCapital()))
            && (this.getCorporate() == null ? other.getCorporate() == null : this.getCorporate().equals(other.getCorporate()))
            && (this.getCreditLevelId() == null ? other.getCreditLevelId() == null : this.getCreditLevelId().equals(other.getCreditLevelId()))
            && (this.getClientIntegral() == null ? other.getClientIntegral() == null : this.getClientIntegral().equals(other.getClientIntegral()))
            && (this.getBank() == null ? other.getBank() == null : this.getBank().equals(other.getBank()))
            && (this.getBankAccount() == null ? other.getBankAccount() == null : this.getBankAccount().equals(other.getBankAccount()))
            && (this.getTariff() == null ? other.getTariff() == null : this.getTariff().equals(other.getTariff()))
            && (this.getControlCredit() == null ? other.getControlCredit() == null : this.getControlCredit().equals(other.getControlCredit()))
            && (this.getLimitCredit() == null ? other.getLimitCredit() == null : this.getLimitCredit().equals(other.getLimitCredit()))
            && (this.getPresentCredit() == null ? other.getPresentCredit() == null : this.getPresentCredit().equals(other.getPresentCredit()))
            && (this.getPresentDebt() == null ? other.getPresentDebt() == null : this.getPresentDebt().equals(other.getPresentDebt()))
            && (this.getAdvancesReceived() == null ? other.getAdvancesReceived() == null : this.getAdvancesReceived().equals(other.getAdvancesReceived()))
            && (this.getSetupPerson() == null ? other.getSetupPerson() == null : this.getSetupPerson().equals(other.getSetupPerson()))
            && (this.getSetupTime() == null ? other.getSetupTime() == null : this.getSetupTime().equals(other.getSetupTime()))
            && (this.getClientCreate() == null ? other.getClientCreate() == null : this.getClientCreate().equals(other.getClientCreate()))
            && (this.getSuperiorClientId() == null ? other.getSuperiorClientId() == null : this.getSuperiorClientId().equals(other.getSuperiorClientId()))
            && (this.getAccessory() == null ? other.getAccessory() == null : this.getAccessory().equals(other.getAccessory()))
            && (this.getStaffId() == null ? other.getStaffId() == null : this.getStaffId().equals(other.getStaffId()))
            && (this.getEnabled() == null ? other.getEnabled() == null : this.getEnabled().equals(other.getEnabled()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getAuditState() == null ? other.getAuditState() == null : this.getAuditState().equals(other.getAuditState()))
            && (this.getAuditor() == null ? other.getAuditor() == null : this.getAuditor().equals(other.getAuditor()))
            && (this.getAuditDate() == null ? other.getAuditDate() == null : this.getAuditDate().equals(other.getAuditDate()))
            && (this.getAuditRemark() == null ? other.getAuditRemark() == null : this.getAuditRemark().equals(other.getAuditRemark()))
            && (this.getCreater() == null ? other.getCreater() == null : this.getCreater().equals(other.getCreater()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdater() == null ? other.getUpdater() == null : this.getUpdater().equals(other.getUpdater()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getClientId() == null) ? 0 : getClientId().hashCode());
        result = prime * result + ((getClientCode() == null) ? 0 : getClientCode().hashCode());
        result = prime * result + ((getClientTypeId() == null) ? 0 : getClientTypeId().hashCode());
        result = prime * result + ((getClientName() == null) ? 0 : getClientName().hashCode());
        result = prime * result + ((getClientGrade() == null) ? 0 : getClientGrade().hashCode());
        result = prime * result + ((getClientSource() == null) ? 0 : getClientSource().hashCode());
        result = prime * result + ((getProvinceManager() == null) ? 0 : getProvinceManager().hashCode());
        result = prime * result + ((getServiceManager() == null) ? 0 : getServiceManager().hashCode());
        result = prime * result + ((getCompanyScale() == null) ? 0 : getCompanyScale().hashCode());
        result = prime * result + ((getMarketingDepartment() == null) ? 0 : getMarketingDepartment().hashCode());
        result = prime * result + ((getCompanyPhone() == null) ? 0 : getCompanyPhone().hashCode());
        result = prime * result + ((getCompanyFax() == null) ? 0 : getCompanyFax().hashCode());
        result = prime * result + ((getCompanyWebsite() == null) ? 0 : getCompanyWebsite().hashCode());
        result = prime * result + ((getCompanyEmail() == null) ? 0 : getCompanyEmail().hashCode());
        result = prime * result + ((getProvince() == null) ? 0 : getProvince().hashCode());
        result = prime * result + ((getCity() == null) ? 0 : getCity().hashCode());
        result = prime * result + ((getAdress() == null) ? 0 : getAdress().hashCode());
        result = prime * result + ((getZipCode() == null) ? 0 : getZipCode().hashCode());
        result = prime * result + ((getPricePolicy() == null) ? 0 : getPricePolicy().hashCode());
        result = prime * result + ((getContactCycle() == null) ? 0 : getContactCycle().hashCode());
        result = prime * result + ((getCompanyNatureId() == null) ? 0 : getCompanyNatureId().hashCode());
        result = prime * result + ((getMainBusiness() == null) ? 0 : getMainBusiness().hashCode());
        result = prime * result + ((getOpenedYear() == null) ? 0 : getOpenedYear().hashCode());
        result = prime * result + ((getRegisteredCapital() == null) ? 0 : getRegisteredCapital().hashCode());
        result = prime * result + ((getCorporate() == null) ? 0 : getCorporate().hashCode());
        result = prime * result + ((getCreditLevelId() == null) ? 0 : getCreditLevelId().hashCode());
        result = prime * result + ((getClientIntegral() == null) ? 0 : getClientIntegral().hashCode());
        result = prime * result + ((getBank() == null) ? 0 : getBank().hashCode());
        result = prime * result + ((getBankAccount() == null) ? 0 : getBankAccount().hashCode());
        result = prime * result + ((getTariff() == null) ? 0 : getTariff().hashCode());
        result = prime * result + ((getControlCredit() == null) ? 0 : getControlCredit().hashCode());
        result = prime * result + ((getLimitCredit() == null) ? 0 : getLimitCredit().hashCode());
        result = prime * result + ((getPresentCredit() == null) ? 0 : getPresentCredit().hashCode());
        result = prime * result + ((getPresentDebt() == null) ? 0 : getPresentDebt().hashCode());
        result = prime * result + ((getAdvancesReceived() == null) ? 0 : getAdvancesReceived().hashCode());
        result = prime * result + ((getSetupPerson() == null) ? 0 : getSetupPerson().hashCode());
        result = prime * result + ((getSetupTime() == null) ? 0 : getSetupTime().hashCode());
        result = prime * result + ((getClientCreate() == null) ? 0 : getClientCreate().hashCode());
        result = prime * result + ((getSuperiorClientId() == null) ? 0 : getSuperiorClientId().hashCode());
        result = prime * result + ((getAccessory() == null) ? 0 : getAccessory().hashCode());
        result = prime * result + ((getStaffId() == null) ? 0 : getStaffId().hashCode());
        result = prime * result + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getAuditState() == null) ? 0 : getAuditState().hashCode());
        result = prime * result + ((getAuditor() == null) ? 0 : getAuditor().hashCode());
        result = prime * result + ((getAuditDate() == null) ? 0 : getAuditDate().hashCode());
        result = prime * result + ((getAuditRemark() == null) ? 0 : getAuditRemark().hashCode());
        result = prime * result + ((getCreater() == null) ? 0 : getCreater().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdater() == null) ? 0 : getUpdater().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }
}
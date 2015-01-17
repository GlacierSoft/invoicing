package com.glacier.frame.entity.basicdatas;

import java.math.BigDecimal;
import java.util.Date; 

import com.alibaba.fastjson.annotation.JSONField;

public class Suppliers {
    private String supplierId;

    private String supplierNumber;

    private String supplierProvince;

    private BigDecimal prepaidBalance;

    private String suppliersName;

    private String typeId;

    private String companyPhone;

    private String companyFax;

    private String companyUrls;

    private String companyEmail;

    private String city;

    private String adress;

    private String postcode;

    private String supplierLevel;

    private String sourceId;

    private String natureId;

    private String industryId;

    private String mainBusiness;

    private String sizeId;

    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date openedYear;

    private BigDecimal registeredCapital;

    private String companyLegal;

    private String gradeId;

    private String bank;

    private String bankAccount;

    private String taxId;

    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date supplierDate;

    private String supplierType;

    private String enabled;

    private String auditorId;

    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date auditorDate;

    private String auditState;

    private String auditRemark;

    private String remark;

    private String creater;

    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    private String updater;

    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date updateTime;
   
    //自定义名称字段
    private String suppliersTypeName; //供应商类型
    
    private String suppliersGradeName;//供应商级别
    
    private String suppliersSourceName;//供应商来源
     
    private String suppliersNatureName;//公司性质 

    private String suppliersIndustryeName;//行业名称

    private String suppliersPanySizeName;//公司规模
      
    private String suppliersUpName;//上级供应商 
    
    private String suppliersTypeId;//供应商类型Id
    
    public String getSuppliersUpName() {
		return suppliersUpName;
	}

	public void setSuppliersUpName(String suppliersUpName) {
		this.suppliersUpName = suppliersUpName;
	}

	public String getSuppliersTypeName() {
		return suppliersTypeName;
	}

	public void setSuppliersTypeName(String suppliersTypeName) {
		this.suppliersTypeName = suppliersTypeName;
	}

	public String getSuppliersGradeName() {
		return suppliersGradeName;
	}

	public void setSuppliersGradeName(String suppliersGradeName) {
		this.suppliersGradeName = suppliersGradeName;
	}

	public String getSuppliersSourceName() {
		return suppliersSourceName;
	}

	public void setSuppliersSourceName(String suppliersSourceName) {
		this.suppliersSourceName = suppliersSourceName;
	}

	public String getSuppliersNatureName() {
		return suppliersNatureName;
	}

	public void setSuppliersNatureName(String suppliersNatureName) {
		this.suppliersNatureName = suppliersNatureName;
	}

	public String getSuppliersIndustryeName() {
		return suppliersIndustryeName;
	}

	public void setSuppliersIndustryeName(String suppliersIndustryeName) {
		this.suppliersIndustryeName = suppliersIndustryeName;
	}

	public String getSuppliersPanySizeName() {
		return suppliersPanySizeName;
	}

	public void setSuppliersPanySizeName(String suppliersPanySizeName) {
		this.suppliersPanySizeName = suppliersPanySizeName;
	}

	public String getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }

    public String getSupplierNumber() {
        return supplierNumber;
    }

    public void setSupplierNumber(String supplierNumber) {
        this.supplierNumber = supplierNumber;
    }

    public String getSupplierProvince() {
        return supplierProvince;
    }

    public void setSupplierProvince(String supplierProvince) {
        this.supplierProvince = supplierProvince;
    }

    public BigDecimal getPrepaidBalance() {
        return prepaidBalance;
    }

    public void setPrepaidBalance(BigDecimal prepaidBalance) {
        this.prepaidBalance = prepaidBalance;
    }

    public String getSuppliersName() {
        return suppliersName;
    }

    public void setSuppliersName(String suppliersName) {
        this.suppliersName = suppliersName;
    }

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
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

    public String getCompanyUrls() {
        return companyUrls;
    }

    public void setCompanyUrls(String companyUrls) {
        this.companyUrls = companyUrls;
    }

    public String getCompanyEmail() {
        return companyEmail;
    }

    public void setCompanyEmail(String companyEmail) {
        this.companyEmail = companyEmail;
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

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getSupplierLevel() {
        return supplierLevel;
    }

    public void setSupplierLevel(String supplierLevel) {
        this.supplierLevel = supplierLevel;
    }

    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    public String getNatureId() {
        return natureId;
    }

    public void setNatureId(String natureId) {
        this.natureId = natureId;
    }

    public String getIndustryId() {
        return industryId;
    }

    public void setIndustryId(String industryId) {
        this.industryId = industryId;
    }

    public String getMainBusiness() {
        return mainBusiness;
    }

    public void setMainBusiness(String mainBusiness) {
        this.mainBusiness = mainBusiness;
    }

    public String getSizeId() {
        return sizeId;
    }

    public void setSizeId(String sizeId) {
        this.sizeId = sizeId;
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

    public String getCompanyLegal() {
        return companyLegal;
    }

    public void setCompanyLegal(String companyLegal) {
        this.companyLegal = companyLegal;
    }

    public String getGradeId() {
        return gradeId;
    }

    public void setGradeId(String gradeId) {
        this.gradeId = gradeId;
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

    public String getTaxId() {
        return taxId;
    }

    public void setTaxId(String taxId) {
        this.taxId = taxId;
    }

    public Date getSupplierDate() {
        return supplierDate;
    }

    public void setSupplierDate(Date supplierDate) {
        this.supplierDate = supplierDate;
    }

    public String getSupplierType() {
        return supplierType;
    }

    public void setSupplierType(String supplierType) {
        this.supplierType = supplierType;
    }

    public String getEnabled() {
        return enabled;
    }

    public void setEnabled(String enabled) {
        this.enabled = enabled;
    }

    public String getAuditorId() {
        return auditorId;
    }

    public void setAuditorId(String auditorId) {
        this.auditorId = auditorId;
    }

    public Date getAuditorDate() {
        return auditorDate;
    }

    public void setAuditorDate(Date auditorDate) {
        this.auditorDate = auditorDate;
    }

    public String getAuditState() {
        return auditState;
    }

    public void setAuditState(String auditState) {
        this.auditState = auditState;
    }

    public String getAuditRemark() {
        return auditRemark;
    }

    public void setAuditRemark(String auditRemark) {
        this.auditRemark = auditRemark;
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
    
    public String getSuppliersTypeId() {
		return suppliersTypeId;
	}

	public void setSuppliersTypeId(String suppliersTypeId) {
		this.suppliersTypeId = suppliersTypeId;
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
        Suppliers other = (Suppliers) that;
        return (this.getSupplierId() == null ? other.getSupplierId() == null : this.getSupplierId().equals(other.getSupplierId()))
            && (this.getSupplierNumber() == null ? other.getSupplierNumber() == null : this.getSupplierNumber().equals(other.getSupplierNumber()))
            && (this.getSupplierProvince() == null ? other.getSupplierProvince() == null : this.getSupplierProvince().equals(other.getSupplierProvince()))
            && (this.getPrepaidBalance() == null ? other.getPrepaidBalance() == null : this.getPrepaidBalance().equals(other.getPrepaidBalance()))
            && (this.getSuppliersName() == null ? other.getSuppliersName() == null : this.getSuppliersName().equals(other.getSuppliersName()))
            && (this.getTypeId() == null ? other.getTypeId() == null : this.getTypeId().equals(other.getTypeId()))
            && (this.getCompanyPhone() == null ? other.getCompanyPhone() == null : this.getCompanyPhone().equals(other.getCompanyPhone()))
            && (this.getCompanyFax() == null ? other.getCompanyFax() == null : this.getCompanyFax().equals(other.getCompanyFax()))
            && (this.getCompanyUrls() == null ? other.getCompanyUrls() == null : this.getCompanyUrls().equals(other.getCompanyUrls()))
            && (this.getCompanyEmail() == null ? other.getCompanyEmail() == null : this.getCompanyEmail().equals(other.getCompanyEmail()))
            && (this.getCity() == null ? other.getCity() == null : this.getCity().equals(other.getCity()))
            && (this.getAdress() == null ? other.getAdress() == null : this.getAdress().equals(other.getAdress()))
            && (this.getPostcode() == null ? other.getPostcode() == null : this.getPostcode().equals(other.getPostcode()))
            && (this.getSupplierLevel() == null ? other.getSupplierLevel() == null : this.getSupplierLevel().equals(other.getSupplierLevel()))
            && (this.getSourceId() == null ? other.getSourceId() == null : this.getSourceId().equals(other.getSourceId()))
            && (this.getNatureId() == null ? other.getNatureId() == null : this.getNatureId().equals(other.getNatureId()))
            && (this.getIndustryId() == null ? other.getIndustryId() == null : this.getIndustryId().equals(other.getIndustryId()))
            && (this.getMainBusiness() == null ? other.getMainBusiness() == null : this.getMainBusiness().equals(other.getMainBusiness()))
            && (this.getSizeId() == null ? other.getSizeId() == null : this.getSizeId().equals(other.getSizeId()))
            && (this.getOpenedYear() == null ? other.getOpenedYear() == null : this.getOpenedYear().equals(other.getOpenedYear()))
            && (this.getRegisteredCapital() == null ? other.getRegisteredCapital() == null : this.getRegisteredCapital().equals(other.getRegisteredCapital()))
            && (this.getCompanyLegal() == null ? other.getCompanyLegal() == null : this.getCompanyLegal().equals(other.getCompanyLegal()))
            && (this.getGradeId() == null ? other.getGradeId() == null : this.getGradeId().equals(other.getGradeId()))
            && (this.getBank() == null ? other.getBank() == null : this.getBank().equals(other.getBank()))
            && (this.getBankAccount() == null ? other.getBankAccount() == null : this.getBankAccount().equals(other.getBankAccount()))
            && (this.getTaxId() == null ? other.getTaxId() == null : this.getTaxId().equals(other.getTaxId()))
            && (this.getSupplierDate() == null ? other.getSupplierDate() == null : this.getSupplierDate().equals(other.getSupplierDate()))
            && (this.getSupplierType() == null ? other.getSupplierType() == null : this.getSupplierType().equals(other.getSupplierType()))
            && (this.getEnabled() == null ? other.getEnabled() == null : this.getEnabled().equals(other.getEnabled()))
            && (this.getAuditorId() == null ? other.getAuditorId() == null : this.getAuditorId().equals(other.getAuditorId()))
            && (this.getAuditorDate() == null ? other.getAuditorDate() == null : this.getAuditorDate().equals(other.getAuditorDate()))
            && (this.getAuditState() == null ? other.getAuditState() == null : this.getAuditState().equals(other.getAuditState()))
            && (this.getAuditRemark() == null ? other.getAuditRemark() == null : this.getAuditRemark().equals(other.getAuditRemark()))
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
        result = prime * result + ((getSupplierId() == null) ? 0 : getSupplierId().hashCode());
        result = prime * result + ((getSupplierNumber() == null) ? 0 : getSupplierNumber().hashCode());
        result = prime * result + ((getSupplierProvince() == null) ? 0 : getSupplierProvince().hashCode());
        result = prime * result + ((getPrepaidBalance() == null) ? 0 : getPrepaidBalance().hashCode());
        result = prime * result + ((getSuppliersName() == null) ? 0 : getSuppliersName().hashCode());
        result = prime * result + ((getTypeId() == null) ? 0 : getTypeId().hashCode());
        result = prime * result + ((getCompanyPhone() == null) ? 0 : getCompanyPhone().hashCode());
        result = prime * result + ((getCompanyFax() == null) ? 0 : getCompanyFax().hashCode());
        result = prime * result + ((getCompanyUrls() == null) ? 0 : getCompanyUrls().hashCode());
        result = prime * result + ((getCompanyEmail() == null) ? 0 : getCompanyEmail().hashCode());
        result = prime * result + ((getCity() == null) ? 0 : getCity().hashCode());
        result = prime * result + ((getAdress() == null) ? 0 : getAdress().hashCode());
        result = prime * result + ((getPostcode() == null) ? 0 : getPostcode().hashCode());
        result = prime * result + ((getSupplierLevel() == null) ? 0 : getSupplierLevel().hashCode());
        result = prime * result + ((getSourceId() == null) ? 0 : getSourceId().hashCode());
        result = prime * result + ((getNatureId() == null) ? 0 : getNatureId().hashCode());
        result = prime * result + ((getIndustryId() == null) ? 0 : getIndustryId().hashCode());
        result = prime * result + ((getMainBusiness() == null) ? 0 : getMainBusiness().hashCode());
        result = prime * result + ((getSizeId() == null) ? 0 : getSizeId().hashCode());
        result = prime * result + ((getOpenedYear() == null) ? 0 : getOpenedYear().hashCode());
        result = prime * result + ((getRegisteredCapital() == null) ? 0 : getRegisteredCapital().hashCode());
        result = prime * result + ((getCompanyLegal() == null) ? 0 : getCompanyLegal().hashCode());
        result = prime * result + ((getGradeId() == null) ? 0 : getGradeId().hashCode());
        result = prime * result + ((getBank() == null) ? 0 : getBank().hashCode());
        result = prime * result + ((getBankAccount() == null) ? 0 : getBankAccount().hashCode());
        result = prime * result + ((getTaxId() == null) ? 0 : getTaxId().hashCode());
        result = prime * result + ((getSupplierDate() == null) ? 0 : getSupplierDate().hashCode());
        result = prime * result + ((getSupplierType() == null) ? 0 : getSupplierType().hashCode());
        result = prime * result + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        result = prime * result + ((getAuditorId() == null) ? 0 : getAuditorId().hashCode());
        result = prime * result + ((getAuditorDate() == null) ? 0 : getAuditorDate().hashCode());
        result = prime * result + ((getAuditState() == null) ? 0 : getAuditState().hashCode());
        result = prime * result + ((getAuditRemark() == null) ? 0 : getAuditRemark().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getCreater() == null) ? 0 : getCreater().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdater() == null) ? 0 : getUpdater().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }
}
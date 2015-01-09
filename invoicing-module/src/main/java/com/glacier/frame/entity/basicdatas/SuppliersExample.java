package com.glacier.frame.entity.basicdatas;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SuppliersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public SuppliersExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setLimitStart(int limitStart) {
        this.limitStart=limitStart;
    }

    public int getLimitStart() {
        return limitStart;
    }

    public void setLimitEnd(int limitEnd) {
        this.limitEnd=limitEnd;
    }

    public int getLimitEnd() {
        return limitEnd;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andSupplierIdIsNull() {
            addCriterion("temp_suppliers.supplier_id is null");
            return (Criteria) this;
        }

        public Criteria andSupplierIdIsNotNull() {
            addCriterion("temp_suppliers.supplier_id is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierIdEqualTo(String value) {
            addCriterion("temp_suppliers.supplier_id =", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotEqualTo(String value) {
            addCriterion("temp_suppliers.supplier_id <>", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdGreaterThan(String value) {
            addCriterion("temp_suppliers.supplier_id >", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_suppliers.supplier_id >=", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdLessThan(String value) {
            addCriterion("temp_suppliers.supplier_id <", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdLessThanOrEqualTo(String value) {
            addCriterion("temp_suppliers.supplier_id <=", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdLike(String value) {
            addCriterion("temp_suppliers.supplier_id like", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotLike(String value) {
            addCriterion("temp_suppliers.supplier_id not like", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdIn(List<String> values) {
            addCriterion("temp_suppliers.supplier_id in", values, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotIn(List<String> values) {
            addCriterion("temp_suppliers.supplier_id not in", values, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdBetween(String value1, String value2) {
            addCriterion("temp_suppliers.supplier_id between", value1, value2, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotBetween(String value1, String value2) {
            addCriterion("temp_suppliers.supplier_id not between", value1, value2, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierNumberIsNull() {
            addCriterion("temp_suppliers.supplier_number is null");
            return (Criteria) this;
        }

        public Criteria andSupplierNumberIsNotNull() {
            addCriterion("temp_suppliers.supplier_number is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierNumberEqualTo(String value) {
            addCriterion("temp_suppliers.supplier_number =", value, "supplierNumber");
            return (Criteria) this;
        }

        public Criteria andSupplierNumberNotEqualTo(String value) {
            addCriterion("temp_suppliers.supplier_number <>", value, "supplierNumber");
            return (Criteria) this;
        }

        public Criteria andSupplierNumberGreaterThan(String value) {
            addCriterion("temp_suppliers.supplier_number >", value, "supplierNumber");
            return (Criteria) this;
        }

        public Criteria andSupplierNumberGreaterThanOrEqualTo(String value) {
            addCriterion("temp_suppliers.supplier_number >=", value, "supplierNumber");
            return (Criteria) this;
        }

        public Criteria andSupplierNumberLessThan(String value) {
            addCriterion("temp_suppliers.supplier_number <", value, "supplierNumber");
            return (Criteria) this;
        }

        public Criteria andSupplierNumberLessThanOrEqualTo(String value) {
            addCriterion("temp_suppliers.supplier_number <=", value, "supplierNumber");
            return (Criteria) this;
        }

        public Criteria andSupplierNumberLike(String value) {
            addCriterion("temp_suppliers.supplier_number like", value, "supplierNumber");
            return (Criteria) this;
        }

        public Criteria andSupplierNumberNotLike(String value) {
            addCriterion("temp_suppliers.supplier_number not like", value, "supplierNumber");
            return (Criteria) this;
        }

        public Criteria andSupplierNumberIn(List<String> values) {
            addCriterion("temp_suppliers.supplier_number in", values, "supplierNumber");
            return (Criteria) this;
        }

        public Criteria andSupplierNumberNotIn(List<String> values) {
            addCriterion("temp_suppliers.supplier_number not in", values, "supplierNumber");
            return (Criteria) this;
        }

        public Criteria andSupplierNumberBetween(String value1, String value2) {
            addCriterion("temp_suppliers.supplier_number between", value1, value2, "supplierNumber");
            return (Criteria) this;
        }

        public Criteria andSupplierNumberNotBetween(String value1, String value2) {
            addCriterion("temp_suppliers.supplier_number not between", value1, value2, "supplierNumber");
            return (Criteria) this;
        }

        public Criteria andSupplierProvinceIsNull() {
            addCriterion("temp_suppliers.supplier_province is null");
            return (Criteria) this;
        }

        public Criteria andSupplierProvinceIsNotNull() {
            addCriterion("temp_suppliers.supplier_province is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierProvinceEqualTo(String value) {
            addCriterion("temp_suppliers.supplier_province =", value, "supplierProvince");
            return (Criteria) this;
        }

        public Criteria andSupplierProvinceNotEqualTo(String value) {
            addCriterion("temp_suppliers.supplier_province <>", value, "supplierProvince");
            return (Criteria) this;
        }

        public Criteria andSupplierProvinceGreaterThan(String value) {
            addCriterion("temp_suppliers.supplier_province >", value, "supplierProvince");
            return (Criteria) this;
        }

        public Criteria andSupplierProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("temp_suppliers.supplier_province >=", value, "supplierProvince");
            return (Criteria) this;
        }

        public Criteria andSupplierProvinceLessThan(String value) {
            addCriterion("temp_suppliers.supplier_province <", value, "supplierProvince");
            return (Criteria) this;
        }

        public Criteria andSupplierProvinceLessThanOrEqualTo(String value) {
            addCriterion("temp_suppliers.supplier_province <=", value, "supplierProvince");
            return (Criteria) this;
        }

        public Criteria andSupplierProvinceLike(String value) {
            addCriterion("temp_suppliers.supplier_province like", value, "supplierProvince");
            return (Criteria) this;
        }

        public Criteria andSupplierProvinceNotLike(String value) {
            addCriterion("temp_suppliers.supplier_province not like", value, "supplierProvince");
            return (Criteria) this;
        }

        public Criteria andSupplierProvinceIn(List<String> values) {
            addCriterion("temp_suppliers.supplier_province in", values, "supplierProvince");
            return (Criteria) this;
        }

        public Criteria andSupplierProvinceNotIn(List<String> values) {
            addCriterion("temp_suppliers.supplier_province not in", values, "supplierProvince");
            return (Criteria) this;
        }

        public Criteria andSupplierProvinceBetween(String value1, String value2) {
            addCriterion("temp_suppliers.supplier_province between", value1, value2, "supplierProvince");
            return (Criteria) this;
        }

        public Criteria andSupplierProvinceNotBetween(String value1, String value2) {
            addCriterion("temp_suppliers.supplier_province not between", value1, value2, "supplierProvince");
            return (Criteria) this;
        }

        public Criteria andPrepaidBalanceIsNull() {
            addCriterion("temp_suppliers.prepaid_balance is null");
            return (Criteria) this;
        }

        public Criteria andPrepaidBalanceIsNotNull() {
            addCriterion("temp_suppliers.prepaid_balance is not null");
            return (Criteria) this;
        }

        public Criteria andPrepaidBalanceEqualTo(BigDecimal value) {
            addCriterion("temp_suppliers.prepaid_balance =", value, "prepaidBalance");
            return (Criteria) this;
        }

        public Criteria andPrepaidBalanceNotEqualTo(BigDecimal value) {
            addCriterion("temp_suppliers.prepaid_balance <>", value, "prepaidBalance");
            return (Criteria) this;
        }

        public Criteria andPrepaidBalanceGreaterThan(BigDecimal value) {
            addCriterion("temp_suppliers.prepaid_balance >", value, "prepaidBalance");
            return (Criteria) this;
        }

        public Criteria andPrepaidBalanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_suppliers.prepaid_balance >=", value, "prepaidBalance");
            return (Criteria) this;
        }

        public Criteria andPrepaidBalanceLessThan(BigDecimal value) {
            addCriterion("temp_suppliers.prepaid_balance <", value, "prepaidBalance");
            return (Criteria) this;
        }

        public Criteria andPrepaidBalanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_suppliers.prepaid_balance <=", value, "prepaidBalance");
            return (Criteria) this;
        }

        public Criteria andPrepaidBalanceIn(List<BigDecimal> values) {
            addCriterion("temp_suppliers.prepaid_balance in", values, "prepaidBalance");
            return (Criteria) this;
        }

        public Criteria andPrepaidBalanceNotIn(List<BigDecimal> values) {
            addCriterion("temp_suppliers.prepaid_balance not in", values, "prepaidBalance");
            return (Criteria) this;
        }

        public Criteria andPrepaidBalanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_suppliers.prepaid_balance between", value1, value2, "prepaidBalance");
            return (Criteria) this;
        }

        public Criteria andPrepaidBalanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_suppliers.prepaid_balance not between", value1, value2, "prepaidBalance");
            return (Criteria) this;
        }

        public Criteria andSuppliersNameIsNull() {
            addCriterion("temp_suppliers.suppliers_name is null");
            return (Criteria) this;
        }

        public Criteria andSuppliersNameIsNotNull() {
            addCriterion("temp_suppliers.suppliers_name is not null");
            return (Criteria) this;
        }

        public Criteria andSuppliersNameEqualTo(String value) {
            addCriterion("temp_suppliers.suppliers_name =", value, "suppliersName");
            return (Criteria) this;
        }

        public Criteria andSuppliersNameNotEqualTo(String value) {
            addCriterion("temp_suppliers.suppliers_name <>", value, "suppliersName");
            return (Criteria) this;
        }

        public Criteria andSuppliersNameGreaterThan(String value) {
            addCriterion("temp_suppliers.suppliers_name >", value, "suppliersName");
            return (Criteria) this;
        }

        public Criteria andSuppliersNameGreaterThanOrEqualTo(String value) {
            addCriterion("temp_suppliers.suppliers_name >=", value, "suppliersName");
            return (Criteria) this;
        }

        public Criteria andSuppliersNameLessThan(String value) {
            addCriterion("temp_suppliers.suppliers_name <", value, "suppliersName");
            return (Criteria) this;
        }

        public Criteria andSuppliersNameLessThanOrEqualTo(String value) {
            addCriterion("temp_suppliers.suppliers_name <=", value, "suppliersName");
            return (Criteria) this;
        }

        public Criteria andSuppliersNameLike(String value) {
            addCriterion("temp_suppliers.suppliers_name like", value, "suppliersName");
            return (Criteria) this;
        }

        public Criteria andSuppliersNameNotLike(String value) {
            addCriterion("temp_suppliers.suppliers_name not like", value, "suppliersName");
            return (Criteria) this;
        }

        public Criteria andSuppliersNameIn(List<String> values) {
            addCriterion("temp_suppliers.suppliers_name in", values, "suppliersName");
            return (Criteria) this;
        }

        public Criteria andSuppliersNameNotIn(List<String> values) {
            addCriterion("temp_suppliers.suppliers_name not in", values, "suppliersName");
            return (Criteria) this;
        }

        public Criteria andSuppliersNameBetween(String value1, String value2) {
            addCriterion("temp_suppliers.suppliers_name between", value1, value2, "suppliersName");
            return (Criteria) this;
        }

        public Criteria andSuppliersNameNotBetween(String value1, String value2) {
            addCriterion("temp_suppliers.suppliers_name not between", value1, value2, "suppliersName");
            return (Criteria) this;
        }

        public Criteria andTypeIdIsNull() {
            addCriterion("temp_suppliers.type_id is null");
            return (Criteria) this;
        }

        public Criteria andTypeIdIsNotNull() {
            addCriterion("temp_suppliers.type_id is not null");
            return (Criteria) this;
        }

        public Criteria andTypeIdEqualTo(String value) {
            addCriterion("temp_suppliers.type_id =", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotEqualTo(String value) {
            addCriterion("temp_suppliers.type_id <>", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThan(String value) {
            addCriterion("temp_suppliers.type_id >", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_suppliers.type_id >=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThan(String value) {
            addCriterion("temp_suppliers.type_id <", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThanOrEqualTo(String value) {
            addCriterion("temp_suppliers.type_id <=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLike(String value) {
            addCriterion("temp_suppliers.type_id like", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotLike(String value) {
            addCriterion("temp_suppliers.type_id not like", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdIn(List<String> values) {
            addCriterion("temp_suppliers.type_id in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotIn(List<String> values) {
            addCriterion("temp_suppliers.type_id not in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdBetween(String value1, String value2) {
            addCriterion("temp_suppliers.type_id between", value1, value2, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotBetween(String value1, String value2) {
            addCriterion("temp_suppliers.type_id not between", value1, value2, "typeId");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneIsNull() {
            addCriterion("temp_suppliers.company_phone is null");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneIsNotNull() {
            addCriterion("temp_suppliers.company_phone is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneEqualTo(String value) {
            addCriterion("temp_suppliers.company_phone =", value, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneNotEqualTo(String value) {
            addCriterion("temp_suppliers.company_phone <>", value, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneGreaterThan(String value) {
            addCriterion("temp_suppliers.company_phone >", value, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("temp_suppliers.company_phone >=", value, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneLessThan(String value) {
            addCriterion("temp_suppliers.company_phone <", value, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneLessThanOrEqualTo(String value) {
            addCriterion("temp_suppliers.company_phone <=", value, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneLike(String value) {
            addCriterion("temp_suppliers.company_phone like", value, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneNotLike(String value) {
            addCriterion("temp_suppliers.company_phone not like", value, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneIn(List<String> values) {
            addCriterion("temp_suppliers.company_phone in", values, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneNotIn(List<String> values) {
            addCriterion("temp_suppliers.company_phone not in", values, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneBetween(String value1, String value2) {
            addCriterion("temp_suppliers.company_phone between", value1, value2, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneNotBetween(String value1, String value2) {
            addCriterion("temp_suppliers.company_phone not between", value1, value2, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyFaxIsNull() {
            addCriterion("temp_suppliers.company_fax is null");
            return (Criteria) this;
        }

        public Criteria andCompanyFaxIsNotNull() {
            addCriterion("temp_suppliers.company_fax is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyFaxEqualTo(String value) {
            addCriterion("temp_suppliers.company_fax =", value, "companyFax");
            return (Criteria) this;
        }

        public Criteria andCompanyFaxNotEqualTo(String value) {
            addCriterion("temp_suppliers.company_fax <>", value, "companyFax");
            return (Criteria) this;
        }

        public Criteria andCompanyFaxGreaterThan(String value) {
            addCriterion("temp_suppliers.company_fax >", value, "companyFax");
            return (Criteria) this;
        }

        public Criteria andCompanyFaxGreaterThanOrEqualTo(String value) {
            addCriterion("temp_suppliers.company_fax >=", value, "companyFax");
            return (Criteria) this;
        }

        public Criteria andCompanyFaxLessThan(String value) {
            addCriterion("temp_suppliers.company_fax <", value, "companyFax");
            return (Criteria) this;
        }

        public Criteria andCompanyFaxLessThanOrEqualTo(String value) {
            addCriterion("temp_suppliers.company_fax <=", value, "companyFax");
            return (Criteria) this;
        }

        public Criteria andCompanyFaxLike(String value) {
            addCriterion("temp_suppliers.company_fax like", value, "companyFax");
            return (Criteria) this;
        }

        public Criteria andCompanyFaxNotLike(String value) {
            addCriterion("temp_suppliers.company_fax not like", value, "companyFax");
            return (Criteria) this;
        }

        public Criteria andCompanyFaxIn(List<String> values) {
            addCriterion("temp_suppliers.company_fax in", values, "companyFax");
            return (Criteria) this;
        }

        public Criteria andCompanyFaxNotIn(List<String> values) {
            addCriterion("temp_suppliers.company_fax not in", values, "companyFax");
            return (Criteria) this;
        }

        public Criteria andCompanyFaxBetween(String value1, String value2) {
            addCriterion("temp_suppliers.company_fax between", value1, value2, "companyFax");
            return (Criteria) this;
        }

        public Criteria andCompanyFaxNotBetween(String value1, String value2) {
            addCriterion("temp_suppliers.company_fax not between", value1, value2, "companyFax");
            return (Criteria) this;
        }

        public Criteria andCompanyUrlsIsNull() {
            addCriterion("temp_suppliers.company_urls is null");
            return (Criteria) this;
        }

        public Criteria andCompanyUrlsIsNotNull() {
            addCriterion("temp_suppliers.company_urls is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyUrlsEqualTo(String value) {
            addCriterion("temp_suppliers.company_urls =", value, "companyUrls");
            return (Criteria) this;
        }

        public Criteria andCompanyUrlsNotEqualTo(String value) {
            addCriterion("temp_suppliers.company_urls <>", value, "companyUrls");
            return (Criteria) this;
        }

        public Criteria andCompanyUrlsGreaterThan(String value) {
            addCriterion("temp_suppliers.company_urls >", value, "companyUrls");
            return (Criteria) this;
        }

        public Criteria andCompanyUrlsGreaterThanOrEqualTo(String value) {
            addCriterion("temp_suppliers.company_urls >=", value, "companyUrls");
            return (Criteria) this;
        }

        public Criteria andCompanyUrlsLessThan(String value) {
            addCriterion("temp_suppliers.company_urls <", value, "companyUrls");
            return (Criteria) this;
        }

        public Criteria andCompanyUrlsLessThanOrEqualTo(String value) {
            addCriterion("temp_suppliers.company_urls <=", value, "companyUrls");
            return (Criteria) this;
        }

        public Criteria andCompanyUrlsLike(String value) {
            addCriterion("temp_suppliers.company_urls like", value, "companyUrls");
            return (Criteria) this;
        }

        public Criteria andCompanyUrlsNotLike(String value) {
            addCriterion("temp_suppliers.company_urls not like", value, "companyUrls");
            return (Criteria) this;
        }

        public Criteria andCompanyUrlsIn(List<String> values) {
            addCriterion("temp_suppliers.company_urls in", values, "companyUrls");
            return (Criteria) this;
        }

        public Criteria andCompanyUrlsNotIn(List<String> values) {
            addCriterion("temp_suppliers.company_urls not in", values, "companyUrls");
            return (Criteria) this;
        }

        public Criteria andCompanyUrlsBetween(String value1, String value2) {
            addCriterion("temp_suppliers.company_urls between", value1, value2, "companyUrls");
            return (Criteria) this;
        }

        public Criteria andCompanyUrlsNotBetween(String value1, String value2) {
            addCriterion("temp_suppliers.company_urls not between", value1, value2, "companyUrls");
            return (Criteria) this;
        }

        public Criteria andCompanyEmailIsNull() {
            addCriterion("temp_suppliers.company_email is null");
            return (Criteria) this;
        }

        public Criteria andCompanyEmailIsNotNull() {
            addCriterion("temp_suppliers.company_email is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyEmailEqualTo(String value) {
            addCriterion("temp_suppliers.company_email =", value, "companyEmail");
            return (Criteria) this;
        }

        public Criteria andCompanyEmailNotEqualTo(String value) {
            addCriterion("temp_suppliers.company_email <>", value, "companyEmail");
            return (Criteria) this;
        }

        public Criteria andCompanyEmailGreaterThan(String value) {
            addCriterion("temp_suppliers.company_email >", value, "companyEmail");
            return (Criteria) this;
        }

        public Criteria andCompanyEmailGreaterThanOrEqualTo(String value) {
            addCriterion("temp_suppliers.company_email >=", value, "companyEmail");
            return (Criteria) this;
        }

        public Criteria andCompanyEmailLessThan(String value) {
            addCriterion("temp_suppliers.company_email <", value, "companyEmail");
            return (Criteria) this;
        }

        public Criteria andCompanyEmailLessThanOrEqualTo(String value) {
            addCriterion("temp_suppliers.company_email <=", value, "companyEmail");
            return (Criteria) this;
        }

        public Criteria andCompanyEmailLike(String value) {
            addCriterion("temp_suppliers.company_email like", value, "companyEmail");
            return (Criteria) this;
        }

        public Criteria andCompanyEmailNotLike(String value) {
            addCriterion("temp_suppliers.company_email not like", value, "companyEmail");
            return (Criteria) this;
        }

        public Criteria andCompanyEmailIn(List<String> values) {
            addCriterion("temp_suppliers.company_email in", values, "companyEmail");
            return (Criteria) this;
        }

        public Criteria andCompanyEmailNotIn(List<String> values) {
            addCriterion("temp_suppliers.company_email not in", values, "companyEmail");
            return (Criteria) this;
        }

        public Criteria andCompanyEmailBetween(String value1, String value2) {
            addCriterion("temp_suppliers.company_email between", value1, value2, "companyEmail");
            return (Criteria) this;
        }

        public Criteria andCompanyEmailNotBetween(String value1, String value2) {
            addCriterion("temp_suppliers.company_email not between", value1, value2, "companyEmail");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("temp_suppliers.city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("temp_suppliers.city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("temp_suppliers.city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("temp_suppliers.city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("temp_suppliers.city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("temp_suppliers.city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("temp_suppliers.city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("temp_suppliers.city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("temp_suppliers.city like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("temp_suppliers.city not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("temp_suppliers.city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("temp_suppliers.city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("temp_suppliers.city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("temp_suppliers.city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andAdressIsNull() {
            addCriterion("temp_suppliers.adress is null");
            return (Criteria) this;
        }

        public Criteria andAdressIsNotNull() {
            addCriterion("temp_suppliers.adress is not null");
            return (Criteria) this;
        }

        public Criteria andAdressEqualTo(String value) {
            addCriterion("temp_suppliers.adress =", value, "adress");
            return (Criteria) this;
        }

        public Criteria andAdressNotEqualTo(String value) {
            addCriterion("temp_suppliers.adress <>", value, "adress");
            return (Criteria) this;
        }

        public Criteria andAdressGreaterThan(String value) {
            addCriterion("temp_suppliers.adress >", value, "adress");
            return (Criteria) this;
        }

        public Criteria andAdressGreaterThanOrEqualTo(String value) {
            addCriterion("temp_suppliers.adress >=", value, "adress");
            return (Criteria) this;
        }

        public Criteria andAdressLessThan(String value) {
            addCriterion("temp_suppliers.adress <", value, "adress");
            return (Criteria) this;
        }

        public Criteria andAdressLessThanOrEqualTo(String value) {
            addCriterion("temp_suppliers.adress <=", value, "adress");
            return (Criteria) this;
        }

        public Criteria andAdressLike(String value) {
            addCriterion("temp_suppliers.adress like", value, "adress");
            return (Criteria) this;
        }

        public Criteria andAdressNotLike(String value) {
            addCriterion("temp_suppliers.adress not like", value, "adress");
            return (Criteria) this;
        }

        public Criteria andAdressIn(List<String> values) {
            addCriterion("temp_suppliers.adress in", values, "adress");
            return (Criteria) this;
        }

        public Criteria andAdressNotIn(List<String> values) {
            addCriterion("temp_suppliers.adress not in", values, "adress");
            return (Criteria) this;
        }

        public Criteria andAdressBetween(String value1, String value2) {
            addCriterion("temp_suppliers.adress between", value1, value2, "adress");
            return (Criteria) this;
        }

        public Criteria andAdressNotBetween(String value1, String value2) {
            addCriterion("temp_suppliers.adress not between", value1, value2, "adress");
            return (Criteria) this;
        }

        public Criteria andPostcodeIsNull() {
            addCriterion("temp_suppliers.postcode is null");
            return (Criteria) this;
        }

        public Criteria andPostcodeIsNotNull() {
            addCriterion("temp_suppliers.postcode is not null");
            return (Criteria) this;
        }

        public Criteria andPostcodeEqualTo(String value) {
            addCriterion("temp_suppliers.postcode =", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotEqualTo(String value) {
            addCriterion("temp_suppliers.postcode <>", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeGreaterThan(String value) {
            addCriterion("temp_suppliers.postcode >", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeGreaterThanOrEqualTo(String value) {
            addCriterion("temp_suppliers.postcode >=", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeLessThan(String value) {
            addCriterion("temp_suppliers.postcode <", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeLessThanOrEqualTo(String value) {
            addCriterion("temp_suppliers.postcode <=", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeLike(String value) {
            addCriterion("temp_suppliers.postcode like", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotLike(String value) {
            addCriterion("temp_suppliers.postcode not like", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeIn(List<String> values) {
            addCriterion("temp_suppliers.postcode in", values, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotIn(List<String> values) {
            addCriterion("temp_suppliers.postcode not in", values, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeBetween(String value1, String value2) {
            addCriterion("temp_suppliers.postcode between", value1, value2, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotBetween(String value1, String value2) {
            addCriterion("temp_suppliers.postcode not between", value1, value2, "postcode");
            return (Criteria) this;
        }

        public Criteria andSupplierLevelIsNull() {
            addCriterion("temp_suppliers.supplier_level is null");
            return (Criteria) this;
        }

        public Criteria andSupplierLevelIsNotNull() {
            addCriterion("temp_suppliers.supplier_level is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierLevelEqualTo(String value) {
            addCriterion("temp_suppliers.supplier_level =", value, "supplierLevel");
            return (Criteria) this;
        }

        public Criteria andSupplierLevelNotEqualTo(String value) {
            addCriterion("temp_suppliers.supplier_level <>", value, "supplierLevel");
            return (Criteria) this;
        }

        public Criteria andSupplierLevelGreaterThan(String value) {
            addCriterion("temp_suppliers.supplier_level >", value, "supplierLevel");
            return (Criteria) this;
        }

        public Criteria andSupplierLevelGreaterThanOrEqualTo(String value) {
            addCriterion("temp_suppliers.supplier_level >=", value, "supplierLevel");
            return (Criteria) this;
        }

        public Criteria andSupplierLevelLessThan(String value) {
            addCriterion("temp_suppliers.supplier_level <", value, "supplierLevel");
            return (Criteria) this;
        }

        public Criteria andSupplierLevelLessThanOrEqualTo(String value) {
            addCriterion("temp_suppliers.supplier_level <=", value, "supplierLevel");
            return (Criteria) this;
        }

        public Criteria andSupplierLevelLike(String value) {
            addCriterion("temp_suppliers.supplier_level like", value, "supplierLevel");
            return (Criteria) this;
        }

        public Criteria andSupplierLevelNotLike(String value) {
            addCriterion("temp_suppliers.supplier_level not like", value, "supplierLevel");
            return (Criteria) this;
        }

        public Criteria andSupplierLevelIn(List<String> values) {
            addCriterion("temp_suppliers.supplier_level in", values, "supplierLevel");
            return (Criteria) this;
        }

        public Criteria andSupplierLevelNotIn(List<String> values) {
            addCriterion("temp_suppliers.supplier_level not in", values, "supplierLevel");
            return (Criteria) this;
        }

        public Criteria andSupplierLevelBetween(String value1, String value2) {
            addCriterion("temp_suppliers.supplier_level between", value1, value2, "supplierLevel");
            return (Criteria) this;
        }

        public Criteria andSupplierLevelNotBetween(String value1, String value2) {
            addCriterion("temp_suppliers.supplier_level not between", value1, value2, "supplierLevel");
            return (Criteria) this;
        }

        public Criteria andSourceIdIsNull() {
            addCriterion("temp_suppliers.source_id is null");
            return (Criteria) this;
        }

        public Criteria andSourceIdIsNotNull() {
            addCriterion("temp_suppliers.source_id is not null");
            return (Criteria) this;
        }

        public Criteria andSourceIdEqualTo(String value) {
            addCriterion("temp_suppliers.source_id =", value, "sourceId");
            return (Criteria) this;
        }

        public Criteria andSourceIdNotEqualTo(String value) {
            addCriterion("temp_suppliers.source_id <>", value, "sourceId");
            return (Criteria) this;
        }

        public Criteria andSourceIdGreaterThan(String value) {
            addCriterion("temp_suppliers.source_id >", value, "sourceId");
            return (Criteria) this;
        }

        public Criteria andSourceIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_suppliers.source_id >=", value, "sourceId");
            return (Criteria) this;
        }

        public Criteria andSourceIdLessThan(String value) {
            addCriterion("temp_suppliers.source_id <", value, "sourceId");
            return (Criteria) this;
        }

        public Criteria andSourceIdLessThanOrEqualTo(String value) {
            addCriterion("temp_suppliers.source_id <=", value, "sourceId");
            return (Criteria) this;
        }

        public Criteria andSourceIdLike(String value) {
            addCriterion("temp_suppliers.source_id like", value, "sourceId");
            return (Criteria) this;
        }

        public Criteria andSourceIdNotLike(String value) {
            addCriterion("temp_suppliers.source_id not like", value, "sourceId");
            return (Criteria) this;
        }

        public Criteria andSourceIdIn(List<String> values) {
            addCriterion("temp_suppliers.source_id in", values, "sourceId");
            return (Criteria) this;
        }

        public Criteria andSourceIdNotIn(List<String> values) {
            addCriterion("temp_suppliers.source_id not in", values, "sourceId");
            return (Criteria) this;
        }

        public Criteria andSourceIdBetween(String value1, String value2) {
            addCriterion("temp_suppliers.source_id between", value1, value2, "sourceId");
            return (Criteria) this;
        }

        public Criteria andSourceIdNotBetween(String value1, String value2) {
            addCriterion("temp_suppliers.source_id not between", value1, value2, "sourceId");
            return (Criteria) this;
        }

        public Criteria andNatureIdIsNull() {
            addCriterion("temp_suppliers.nature_id is null");
            return (Criteria) this;
        }

        public Criteria andNatureIdIsNotNull() {
            addCriterion("temp_suppliers.nature_id is not null");
            return (Criteria) this;
        }

        public Criteria andNatureIdEqualTo(String value) {
            addCriterion("temp_suppliers.nature_id =", value, "natureId");
            return (Criteria) this;
        }

        public Criteria andNatureIdNotEqualTo(String value) {
            addCriterion("temp_suppliers.nature_id <>", value, "natureId");
            return (Criteria) this;
        }

        public Criteria andNatureIdGreaterThan(String value) {
            addCriterion("temp_suppliers.nature_id >", value, "natureId");
            return (Criteria) this;
        }

        public Criteria andNatureIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_suppliers.nature_id >=", value, "natureId");
            return (Criteria) this;
        }

        public Criteria andNatureIdLessThan(String value) {
            addCriterion("temp_suppliers.nature_id <", value, "natureId");
            return (Criteria) this;
        }

        public Criteria andNatureIdLessThanOrEqualTo(String value) {
            addCriterion("temp_suppliers.nature_id <=", value, "natureId");
            return (Criteria) this;
        }

        public Criteria andNatureIdLike(String value) {
            addCriterion("temp_suppliers.nature_id like", value, "natureId");
            return (Criteria) this;
        }

        public Criteria andNatureIdNotLike(String value) {
            addCriterion("temp_suppliers.nature_id not like", value, "natureId");
            return (Criteria) this;
        }

        public Criteria andNatureIdIn(List<String> values) {
            addCriterion("temp_suppliers.nature_id in", values, "natureId");
            return (Criteria) this;
        }

        public Criteria andNatureIdNotIn(List<String> values) {
            addCriterion("temp_suppliers.nature_id not in", values, "natureId");
            return (Criteria) this;
        }

        public Criteria andNatureIdBetween(String value1, String value2) {
            addCriterion("temp_suppliers.nature_id between", value1, value2, "natureId");
            return (Criteria) this;
        }

        public Criteria andNatureIdNotBetween(String value1, String value2) {
            addCriterion("temp_suppliers.nature_id not between", value1, value2, "natureId");
            return (Criteria) this;
        }

        public Criteria andIndustryIdIsNull() {
            addCriterion("temp_suppliers.industry_id is null");
            return (Criteria) this;
        }

        public Criteria andIndustryIdIsNotNull() {
            addCriterion("temp_suppliers.industry_id is not null");
            return (Criteria) this;
        }

        public Criteria andIndustryIdEqualTo(String value) {
            addCriterion("temp_suppliers.industry_id =", value, "industryId");
            return (Criteria) this;
        }

        public Criteria andIndustryIdNotEqualTo(String value) {
            addCriterion("temp_suppliers.industry_id <>", value, "industryId");
            return (Criteria) this;
        }

        public Criteria andIndustryIdGreaterThan(String value) {
            addCriterion("temp_suppliers.industry_id >", value, "industryId");
            return (Criteria) this;
        }

        public Criteria andIndustryIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_suppliers.industry_id >=", value, "industryId");
            return (Criteria) this;
        }

        public Criteria andIndustryIdLessThan(String value) {
            addCriterion("temp_suppliers.industry_id <", value, "industryId");
            return (Criteria) this;
        }

        public Criteria andIndustryIdLessThanOrEqualTo(String value) {
            addCriterion("temp_suppliers.industry_id <=", value, "industryId");
            return (Criteria) this;
        }

        public Criteria andIndustryIdLike(String value) {
            addCriterion("temp_suppliers.industry_id like", value, "industryId");
            return (Criteria) this;
        }

        public Criteria andIndustryIdNotLike(String value) {
            addCriterion("temp_suppliers.industry_id not like", value, "industryId");
            return (Criteria) this;
        }

        public Criteria andIndustryIdIn(List<String> values) {
            addCriterion("temp_suppliers.industry_id in", values, "industryId");
            return (Criteria) this;
        }

        public Criteria andIndustryIdNotIn(List<String> values) {
            addCriterion("temp_suppliers.industry_id not in", values, "industryId");
            return (Criteria) this;
        }

        public Criteria andIndustryIdBetween(String value1, String value2) {
            addCriterion("temp_suppliers.industry_id between", value1, value2, "industryId");
            return (Criteria) this;
        }

        public Criteria andIndustryIdNotBetween(String value1, String value2) {
            addCriterion("temp_suppliers.industry_id not between", value1, value2, "industryId");
            return (Criteria) this;
        }

        public Criteria andMainBusinessIsNull() {
            addCriterion("temp_suppliers.main_business is null");
            return (Criteria) this;
        }

        public Criteria andMainBusinessIsNotNull() {
            addCriterion("temp_suppliers.main_business is not null");
            return (Criteria) this;
        }

        public Criteria andMainBusinessEqualTo(String value) {
            addCriterion("temp_suppliers.main_business =", value, "mainBusiness");
            return (Criteria) this;
        }

        public Criteria andMainBusinessNotEqualTo(String value) {
            addCriterion("temp_suppliers.main_business <>", value, "mainBusiness");
            return (Criteria) this;
        }

        public Criteria andMainBusinessGreaterThan(String value) {
            addCriterion("temp_suppliers.main_business >", value, "mainBusiness");
            return (Criteria) this;
        }

        public Criteria andMainBusinessGreaterThanOrEqualTo(String value) {
            addCriterion("temp_suppliers.main_business >=", value, "mainBusiness");
            return (Criteria) this;
        }

        public Criteria andMainBusinessLessThan(String value) {
            addCriterion("temp_suppliers.main_business <", value, "mainBusiness");
            return (Criteria) this;
        }

        public Criteria andMainBusinessLessThanOrEqualTo(String value) {
            addCriterion("temp_suppliers.main_business <=", value, "mainBusiness");
            return (Criteria) this;
        }

        public Criteria andMainBusinessLike(String value) {
            addCriterion("temp_suppliers.main_business like", value, "mainBusiness");
            return (Criteria) this;
        }

        public Criteria andMainBusinessNotLike(String value) {
            addCriterion("temp_suppliers.main_business not like", value, "mainBusiness");
            return (Criteria) this;
        }

        public Criteria andMainBusinessIn(List<String> values) {
            addCriterion("temp_suppliers.main_business in", values, "mainBusiness");
            return (Criteria) this;
        }

        public Criteria andMainBusinessNotIn(List<String> values) {
            addCriterion("temp_suppliers.main_business not in", values, "mainBusiness");
            return (Criteria) this;
        }

        public Criteria andMainBusinessBetween(String value1, String value2) {
            addCriterion("temp_suppliers.main_business between", value1, value2, "mainBusiness");
            return (Criteria) this;
        }

        public Criteria andMainBusinessNotBetween(String value1, String value2) {
            addCriterion("temp_suppliers.main_business not between", value1, value2, "mainBusiness");
            return (Criteria) this;
        }

        public Criteria andSizeIdIsNull() {
            addCriterion("temp_suppliers.size_id is null");
            return (Criteria) this;
        }

        public Criteria andSizeIdIsNotNull() {
            addCriterion("temp_suppliers.size_id is not null");
            return (Criteria) this;
        }

        public Criteria andSizeIdEqualTo(String value) {
            addCriterion("temp_suppliers.size_id =", value, "sizeId");
            return (Criteria) this;
        }

        public Criteria andSizeIdNotEqualTo(String value) {
            addCriterion("temp_suppliers.size_id <>", value, "sizeId");
            return (Criteria) this;
        }

        public Criteria andSizeIdGreaterThan(String value) {
            addCriterion("temp_suppliers.size_id >", value, "sizeId");
            return (Criteria) this;
        }

        public Criteria andSizeIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_suppliers.size_id >=", value, "sizeId");
            return (Criteria) this;
        }

        public Criteria andSizeIdLessThan(String value) {
            addCriterion("temp_suppliers.size_id <", value, "sizeId");
            return (Criteria) this;
        }

        public Criteria andSizeIdLessThanOrEqualTo(String value) {
            addCriterion("temp_suppliers.size_id <=", value, "sizeId");
            return (Criteria) this;
        }

        public Criteria andSizeIdLike(String value) {
            addCriterion("temp_suppliers.size_id like", value, "sizeId");
            return (Criteria) this;
        }

        public Criteria andSizeIdNotLike(String value) {
            addCriterion("temp_suppliers.size_id not like", value, "sizeId");
            return (Criteria) this;
        }

        public Criteria andSizeIdIn(List<String> values) {
            addCriterion("temp_suppliers.size_id in", values, "sizeId");
            return (Criteria) this;
        }

        public Criteria andSizeIdNotIn(List<String> values) {
            addCriterion("temp_suppliers.size_id not in", values, "sizeId");
            return (Criteria) this;
        }

        public Criteria andSizeIdBetween(String value1, String value2) {
            addCriterion("temp_suppliers.size_id between", value1, value2, "sizeId");
            return (Criteria) this;
        }

        public Criteria andSizeIdNotBetween(String value1, String value2) {
            addCriterion("temp_suppliers.size_id not between", value1, value2, "sizeId");
            return (Criteria) this;
        }

        public Criteria andOpenedYearIsNull() {
            addCriterion("temp_suppliers.opened_year is null");
            return (Criteria) this;
        }

        public Criteria andOpenedYearIsNotNull() {
            addCriterion("temp_suppliers.opened_year is not null");
            return (Criteria) this;
        }

        public Criteria andOpenedYearEqualTo(Date value) {
            addCriterion("temp_suppliers.opened_year =", value, "openedYear");
            return (Criteria) this;
        }

        public Criteria andOpenedYearNotEqualTo(Date value) {
            addCriterion("temp_suppliers.opened_year <>", value, "openedYear");
            return (Criteria) this;
        }

        public Criteria andOpenedYearGreaterThan(Date value) {
            addCriterion("temp_suppliers.opened_year >", value, "openedYear");
            return (Criteria) this;
        }

        public Criteria andOpenedYearGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_suppliers.opened_year >=", value, "openedYear");
            return (Criteria) this;
        }

        public Criteria andOpenedYearLessThan(Date value) {
            addCriterion("temp_suppliers.opened_year <", value, "openedYear");
            return (Criteria) this;
        }

        public Criteria andOpenedYearLessThanOrEqualTo(Date value) {
            addCriterion("temp_suppliers.opened_year <=", value, "openedYear");
            return (Criteria) this;
        }

        public Criteria andOpenedYearIn(List<Date> values) {
            addCriterion("temp_suppliers.opened_year in", values, "openedYear");
            return (Criteria) this;
        }

        public Criteria andOpenedYearNotIn(List<Date> values) {
            addCriterion("temp_suppliers.opened_year not in", values, "openedYear");
            return (Criteria) this;
        }

        public Criteria andOpenedYearBetween(Date value1, Date value2) {
            addCriterion("temp_suppliers.opened_year between", value1, value2, "openedYear");
            return (Criteria) this;
        }

        public Criteria andOpenedYearNotBetween(Date value1, Date value2) {
            addCriterion("temp_suppliers.opened_year not between", value1, value2, "openedYear");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalIsNull() {
            addCriterion("temp_suppliers.registered_capital is null");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalIsNotNull() {
            addCriterion("temp_suppliers.registered_capital is not null");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalEqualTo(BigDecimal value) {
            addCriterion("temp_suppliers.registered_capital =", value, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalNotEqualTo(BigDecimal value) {
            addCriterion("temp_suppliers.registered_capital <>", value, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalGreaterThan(BigDecimal value) {
            addCriterion("temp_suppliers.registered_capital >", value, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_suppliers.registered_capital >=", value, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalLessThan(BigDecimal value) {
            addCriterion("temp_suppliers.registered_capital <", value, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_suppliers.registered_capital <=", value, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalIn(List<BigDecimal> values) {
            addCriterion("temp_suppliers.registered_capital in", values, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalNotIn(List<BigDecimal> values) {
            addCriterion("temp_suppliers.registered_capital not in", values, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_suppliers.registered_capital between", value1, value2, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_suppliers.registered_capital not between", value1, value2, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andCompanyLegalIsNull() {
            addCriterion("temp_suppliers.company_legal is null");
            return (Criteria) this;
        }

        public Criteria andCompanyLegalIsNotNull() {
            addCriterion("temp_suppliers.company_legal is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyLegalEqualTo(String value) {
            addCriterion("temp_suppliers.company_legal =", value, "companyLegal");
            return (Criteria) this;
        }

        public Criteria andCompanyLegalNotEqualTo(String value) {
            addCriterion("temp_suppliers.company_legal <>", value, "companyLegal");
            return (Criteria) this;
        }

        public Criteria andCompanyLegalGreaterThan(String value) {
            addCriterion("temp_suppliers.company_legal >", value, "companyLegal");
            return (Criteria) this;
        }

        public Criteria andCompanyLegalGreaterThanOrEqualTo(String value) {
            addCriterion("temp_suppliers.company_legal >=", value, "companyLegal");
            return (Criteria) this;
        }

        public Criteria andCompanyLegalLessThan(String value) {
            addCriterion("temp_suppliers.company_legal <", value, "companyLegal");
            return (Criteria) this;
        }

        public Criteria andCompanyLegalLessThanOrEqualTo(String value) {
            addCriterion("temp_suppliers.company_legal <=", value, "companyLegal");
            return (Criteria) this;
        }

        public Criteria andCompanyLegalLike(String value) {
            addCriterion("temp_suppliers.company_legal like", value, "companyLegal");
            return (Criteria) this;
        }

        public Criteria andCompanyLegalNotLike(String value) {
            addCriterion("temp_suppliers.company_legal not like", value, "companyLegal");
            return (Criteria) this;
        }

        public Criteria andCompanyLegalIn(List<String> values) {
            addCriterion("temp_suppliers.company_legal in", values, "companyLegal");
            return (Criteria) this;
        }

        public Criteria andCompanyLegalNotIn(List<String> values) {
            addCriterion("temp_suppliers.company_legal not in", values, "companyLegal");
            return (Criteria) this;
        }

        public Criteria andCompanyLegalBetween(String value1, String value2) {
            addCriterion("temp_suppliers.company_legal between", value1, value2, "companyLegal");
            return (Criteria) this;
        }

        public Criteria andCompanyLegalNotBetween(String value1, String value2) {
            addCriterion("temp_suppliers.company_legal not between", value1, value2, "companyLegal");
            return (Criteria) this;
        }

        public Criteria andGradeIdIsNull() {
            addCriterion("temp_suppliers.grade_id is null");
            return (Criteria) this;
        }

        public Criteria andGradeIdIsNotNull() {
            addCriterion("temp_suppliers.grade_id is not null");
            return (Criteria) this;
        }

        public Criteria andGradeIdEqualTo(String value) {
            addCriterion("temp_suppliers.grade_id =", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdNotEqualTo(String value) {
            addCriterion("temp_suppliers.grade_id <>", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdGreaterThan(String value) {
            addCriterion("temp_suppliers.grade_id >", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_suppliers.grade_id >=", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdLessThan(String value) {
            addCriterion("temp_suppliers.grade_id <", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdLessThanOrEqualTo(String value) {
            addCriterion("temp_suppliers.grade_id <=", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdLike(String value) {
            addCriterion("temp_suppliers.grade_id like", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdNotLike(String value) {
            addCriterion("temp_suppliers.grade_id not like", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdIn(List<String> values) {
            addCriterion("temp_suppliers.grade_id in", values, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdNotIn(List<String> values) {
            addCriterion("temp_suppliers.grade_id not in", values, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdBetween(String value1, String value2) {
            addCriterion("temp_suppliers.grade_id between", value1, value2, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdNotBetween(String value1, String value2) {
            addCriterion("temp_suppliers.grade_id not between", value1, value2, "gradeId");
            return (Criteria) this;
        }

        public Criteria andBankIsNull() {
            addCriterion("temp_suppliers.bank is null");
            return (Criteria) this;
        }

        public Criteria andBankIsNotNull() {
            addCriterion("temp_suppliers.bank is not null");
            return (Criteria) this;
        }

        public Criteria andBankEqualTo(String value) {
            addCriterion("temp_suppliers.bank =", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotEqualTo(String value) {
            addCriterion("temp_suppliers.bank <>", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankGreaterThan(String value) {
            addCriterion("temp_suppliers.bank >", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankGreaterThanOrEqualTo(String value) {
            addCriterion("temp_suppliers.bank >=", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankLessThan(String value) {
            addCriterion("temp_suppliers.bank <", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankLessThanOrEqualTo(String value) {
            addCriterion("temp_suppliers.bank <=", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankLike(String value) {
            addCriterion("temp_suppliers.bank like", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotLike(String value) {
            addCriterion("temp_suppliers.bank not like", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankIn(List<String> values) {
            addCriterion("temp_suppliers.bank in", values, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotIn(List<String> values) {
            addCriterion("temp_suppliers.bank not in", values, "bank");
            return (Criteria) this;
        }

        public Criteria andBankBetween(String value1, String value2) {
            addCriterion("temp_suppliers.bank between", value1, value2, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotBetween(String value1, String value2) {
            addCriterion("temp_suppliers.bank not between", value1, value2, "bank");
            return (Criteria) this;
        }

        public Criteria andBankAccountIsNull() {
            addCriterion("temp_suppliers.bank_account is null");
            return (Criteria) this;
        }

        public Criteria andBankAccountIsNotNull() {
            addCriterion("temp_suppliers.bank_account is not null");
            return (Criteria) this;
        }

        public Criteria andBankAccountEqualTo(String value) {
            addCriterion("temp_suppliers.bank_account =", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountNotEqualTo(String value) {
            addCriterion("temp_suppliers.bank_account <>", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountGreaterThan(String value) {
            addCriterion("temp_suppliers.bank_account >", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountGreaterThanOrEqualTo(String value) {
            addCriterion("temp_suppliers.bank_account >=", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountLessThan(String value) {
            addCriterion("temp_suppliers.bank_account <", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountLessThanOrEqualTo(String value) {
            addCriterion("temp_suppliers.bank_account <=", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountLike(String value) {
            addCriterion("temp_suppliers.bank_account like", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountNotLike(String value) {
            addCriterion("temp_suppliers.bank_account not like", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountIn(List<String> values) {
            addCriterion("temp_suppliers.bank_account in", values, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountNotIn(List<String> values) {
            addCriterion("temp_suppliers.bank_account not in", values, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountBetween(String value1, String value2) {
            addCriterion("temp_suppliers.bank_account between", value1, value2, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountNotBetween(String value1, String value2) {
            addCriterion("temp_suppliers.bank_account not between", value1, value2, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andTaxIdIsNull() {
            addCriterion("temp_suppliers.tax_id is null");
            return (Criteria) this;
        }

        public Criteria andTaxIdIsNotNull() {
            addCriterion("temp_suppliers.tax_id is not null");
            return (Criteria) this;
        }

        public Criteria andTaxIdEqualTo(String value) {
            addCriterion("temp_suppliers.tax_id =", value, "taxId");
            return (Criteria) this;
        }

        public Criteria andTaxIdNotEqualTo(String value) {
            addCriterion("temp_suppliers.tax_id <>", value, "taxId");
            return (Criteria) this;
        }

        public Criteria andTaxIdGreaterThan(String value) {
            addCriterion("temp_suppliers.tax_id >", value, "taxId");
            return (Criteria) this;
        }

        public Criteria andTaxIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_suppliers.tax_id >=", value, "taxId");
            return (Criteria) this;
        }

        public Criteria andTaxIdLessThan(String value) {
            addCriterion("temp_suppliers.tax_id <", value, "taxId");
            return (Criteria) this;
        }

        public Criteria andTaxIdLessThanOrEqualTo(String value) {
            addCriterion("temp_suppliers.tax_id <=", value, "taxId");
            return (Criteria) this;
        }

        public Criteria andTaxIdLike(String value) {
            addCriterion("temp_suppliers.tax_id like", value, "taxId");
            return (Criteria) this;
        }

        public Criteria andTaxIdNotLike(String value) {
            addCriterion("temp_suppliers.tax_id not like", value, "taxId");
            return (Criteria) this;
        }

        public Criteria andTaxIdIn(List<String> values) {
            addCriterion("temp_suppliers.tax_id in", values, "taxId");
            return (Criteria) this;
        }

        public Criteria andTaxIdNotIn(List<String> values) {
            addCriterion("temp_suppliers.tax_id not in", values, "taxId");
            return (Criteria) this;
        }

        public Criteria andTaxIdBetween(String value1, String value2) {
            addCriterion("temp_suppliers.tax_id between", value1, value2, "taxId");
            return (Criteria) this;
        }

        public Criteria andTaxIdNotBetween(String value1, String value2) {
            addCriterion("temp_suppliers.tax_id not between", value1, value2, "taxId");
            return (Criteria) this;
        }

        public Criteria andSupplierDateIsNull() {
            addCriterion("temp_suppliers.supplier_date is null");
            return (Criteria) this;
        }

        public Criteria andSupplierDateIsNotNull() {
            addCriterion("temp_suppliers.supplier_date is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierDateEqualTo(Date value) {
            addCriterion("temp_suppliers.supplier_date =", value, "supplierDate");
            return (Criteria) this;
        }

        public Criteria andSupplierDateNotEqualTo(Date value) {
            addCriterion("temp_suppliers.supplier_date <>", value, "supplierDate");
            return (Criteria) this;
        }

        public Criteria andSupplierDateGreaterThan(Date value) {
            addCriterion("temp_suppliers.supplier_date >", value, "supplierDate");
            return (Criteria) this;
        }

        public Criteria andSupplierDateGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_suppliers.supplier_date >=", value, "supplierDate");
            return (Criteria) this;
        }

        public Criteria andSupplierDateLessThan(Date value) {
            addCriterion("temp_suppliers.supplier_date <", value, "supplierDate");
            return (Criteria) this;
        }

        public Criteria andSupplierDateLessThanOrEqualTo(Date value) {
            addCriterion("temp_suppliers.supplier_date <=", value, "supplierDate");
            return (Criteria) this;
        }

        public Criteria andSupplierDateIn(List<Date> values) {
            addCriterion("temp_suppliers.supplier_date in", values, "supplierDate");
            return (Criteria) this;
        }

        public Criteria andSupplierDateNotIn(List<Date> values) {
            addCriterion("temp_suppliers.supplier_date not in", values, "supplierDate");
            return (Criteria) this;
        }

        public Criteria andSupplierDateBetween(Date value1, Date value2) {
            addCriterion("temp_suppliers.supplier_date between", value1, value2, "supplierDate");
            return (Criteria) this;
        }

        public Criteria andSupplierDateNotBetween(Date value1, Date value2) {
            addCriterion("temp_suppliers.supplier_date not between", value1, value2, "supplierDate");
            return (Criteria) this;
        }

        public Criteria andSupplierTypeIsNull() {
            addCriterion("temp_suppliers.supplier_type is null");
            return (Criteria) this;
        }

        public Criteria andSupplierTypeIsNotNull() {
            addCriterion("temp_suppliers.supplier_type is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierTypeEqualTo(String value) {
            addCriterion("temp_suppliers.supplier_type =", value, "supplierType");
            return (Criteria) this;
        }

        public Criteria andSupplierTypeNotEqualTo(String value) {
            addCriterion("temp_suppliers.supplier_type <>", value, "supplierType");
            return (Criteria) this;
        }

        public Criteria andSupplierTypeGreaterThan(String value) {
            addCriterion("temp_suppliers.supplier_type >", value, "supplierType");
            return (Criteria) this;
        }

        public Criteria andSupplierTypeGreaterThanOrEqualTo(String value) {
            addCriterion("temp_suppliers.supplier_type >=", value, "supplierType");
            return (Criteria) this;
        }

        public Criteria andSupplierTypeLessThan(String value) {
            addCriterion("temp_suppliers.supplier_type <", value, "supplierType");
            return (Criteria) this;
        }

        public Criteria andSupplierTypeLessThanOrEqualTo(String value) {
            addCriterion("temp_suppliers.supplier_type <=", value, "supplierType");
            return (Criteria) this;
        }

        public Criteria andSupplierTypeLike(String value) {
            addCriterion("temp_suppliers.supplier_type like", value, "supplierType");
            return (Criteria) this;
        }

        public Criteria andSupplierTypeNotLike(String value) {
            addCriterion("temp_suppliers.supplier_type not like", value, "supplierType");
            return (Criteria) this;
        }

        public Criteria andSupplierTypeIn(List<String> values) {
            addCriterion("temp_suppliers.supplier_type in", values, "supplierType");
            return (Criteria) this;
        }

        public Criteria andSupplierTypeNotIn(List<String> values) {
            addCriterion("temp_suppliers.supplier_type not in", values, "supplierType");
            return (Criteria) this;
        }

        public Criteria andSupplierTypeBetween(String value1, String value2) {
            addCriterion("temp_suppliers.supplier_type between", value1, value2, "supplierType");
            return (Criteria) this;
        }

        public Criteria andSupplierTypeNotBetween(String value1, String value2) {
            addCriterion("temp_suppliers.supplier_type not between", value1, value2, "supplierType");
            return (Criteria) this;
        }

        public Criteria andEnabledIsNull() {
            addCriterion("temp_suppliers.enabled is null");
            return (Criteria) this;
        }

        public Criteria andEnabledIsNotNull() {
            addCriterion("temp_suppliers.enabled is not null");
            return (Criteria) this;
        }

        public Criteria andEnabledEqualTo(String value) {
            addCriterion("temp_suppliers.enabled =", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotEqualTo(String value) {
            addCriterion("temp_suppliers.enabled <>", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledGreaterThan(String value) {
            addCriterion("temp_suppliers.enabled >", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledGreaterThanOrEqualTo(String value) {
            addCriterion("temp_suppliers.enabled >=", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledLessThan(String value) {
            addCriterion("temp_suppliers.enabled <", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledLessThanOrEqualTo(String value) {
            addCriterion("temp_suppliers.enabled <=", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledLike(String value) {
            addCriterion("temp_suppliers.enabled like", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotLike(String value) {
            addCriterion("temp_suppliers.enabled not like", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledIn(List<String> values) {
            addCriterion("temp_suppliers.enabled in", values, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotIn(List<String> values) {
            addCriterion("temp_suppliers.enabled not in", values, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledBetween(String value1, String value2) {
            addCriterion("temp_suppliers.enabled between", value1, value2, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotBetween(String value1, String value2) {
            addCriterion("temp_suppliers.enabled not between", value1, value2, "enabled");
            return (Criteria) this;
        }

        public Criteria andAuditorIdIsNull() {
            addCriterion("temp_suppliers.auditor_id is null");
            return (Criteria) this;
        }

        public Criteria andAuditorIdIsNotNull() {
            addCriterion("temp_suppliers.auditor_id is not null");
            return (Criteria) this;
        }

        public Criteria andAuditorIdEqualTo(String value) {
            addCriterion("temp_suppliers.auditor_id =", value, "auditorId");
            return (Criteria) this;
        }

        public Criteria andAuditorIdNotEqualTo(String value) {
            addCriterion("temp_suppliers.auditor_id <>", value, "auditorId");
            return (Criteria) this;
        }

        public Criteria andAuditorIdGreaterThan(String value) {
            addCriterion("temp_suppliers.auditor_id >", value, "auditorId");
            return (Criteria) this;
        }

        public Criteria andAuditorIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_suppliers.auditor_id >=", value, "auditorId");
            return (Criteria) this;
        }

        public Criteria andAuditorIdLessThan(String value) {
            addCriterion("temp_suppliers.auditor_id <", value, "auditorId");
            return (Criteria) this;
        }

        public Criteria andAuditorIdLessThanOrEqualTo(String value) {
            addCriterion("temp_suppliers.auditor_id <=", value, "auditorId");
            return (Criteria) this;
        }

        public Criteria andAuditorIdLike(String value) {
            addCriterion("temp_suppliers.auditor_id like", value, "auditorId");
            return (Criteria) this;
        }

        public Criteria andAuditorIdNotLike(String value) {
            addCriterion("temp_suppliers.auditor_id not like", value, "auditorId");
            return (Criteria) this;
        }

        public Criteria andAuditorIdIn(List<String> values) {
            addCriterion("temp_suppliers.auditor_id in", values, "auditorId");
            return (Criteria) this;
        }

        public Criteria andAuditorIdNotIn(List<String> values) {
            addCriterion("temp_suppliers.auditor_id not in", values, "auditorId");
            return (Criteria) this;
        }

        public Criteria andAuditorIdBetween(String value1, String value2) {
            addCriterion("temp_suppliers.auditor_id between", value1, value2, "auditorId");
            return (Criteria) this;
        }

        public Criteria andAuditorIdNotBetween(String value1, String value2) {
            addCriterion("temp_suppliers.auditor_id not between", value1, value2, "auditorId");
            return (Criteria) this;
        }

        public Criteria andAuditorDateIsNull() {
            addCriterion("temp_suppliers.auditor_date is null");
            return (Criteria) this;
        }

        public Criteria andAuditorDateIsNotNull() {
            addCriterion("temp_suppliers.auditor_date is not null");
            return (Criteria) this;
        }

        public Criteria andAuditorDateEqualTo(Date value) {
            addCriterion("temp_suppliers.auditor_date =", value, "auditorDate");
            return (Criteria) this;
        }

        public Criteria andAuditorDateNotEqualTo(Date value) {
            addCriterion("temp_suppliers.auditor_date <>", value, "auditorDate");
            return (Criteria) this;
        }

        public Criteria andAuditorDateGreaterThan(Date value) {
            addCriterion("temp_suppliers.auditor_date >", value, "auditorDate");
            return (Criteria) this;
        }

        public Criteria andAuditorDateGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_suppliers.auditor_date >=", value, "auditorDate");
            return (Criteria) this;
        }

        public Criteria andAuditorDateLessThan(Date value) {
            addCriterion("temp_suppliers.auditor_date <", value, "auditorDate");
            return (Criteria) this;
        }

        public Criteria andAuditorDateLessThanOrEqualTo(Date value) {
            addCriterion("temp_suppliers.auditor_date <=", value, "auditorDate");
            return (Criteria) this;
        }

        public Criteria andAuditorDateIn(List<Date> values) {
            addCriterion("temp_suppliers.auditor_date in", values, "auditorDate");
            return (Criteria) this;
        }

        public Criteria andAuditorDateNotIn(List<Date> values) {
            addCriterion("temp_suppliers.auditor_date not in", values, "auditorDate");
            return (Criteria) this;
        }

        public Criteria andAuditorDateBetween(Date value1, Date value2) {
            addCriterion("temp_suppliers.auditor_date between", value1, value2, "auditorDate");
            return (Criteria) this;
        }

        public Criteria andAuditorDateNotBetween(Date value1, Date value2) {
            addCriterion("temp_suppliers.auditor_date not between", value1, value2, "auditorDate");
            return (Criteria) this;
        }

        public Criteria andAuditStateIsNull() {
            addCriterion("temp_suppliers.audit_state is null");
            return (Criteria) this;
        }

        public Criteria andAuditStateIsNotNull() {
            addCriterion("temp_suppliers.audit_state is not null");
            return (Criteria) this;
        }

        public Criteria andAuditStateEqualTo(String value) {
            addCriterion("temp_suppliers.audit_state =", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateNotEqualTo(String value) {
            addCriterion("temp_suppliers.audit_state <>", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateGreaterThan(String value) {
            addCriterion("temp_suppliers.audit_state >", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateGreaterThanOrEqualTo(String value) {
            addCriterion("temp_suppliers.audit_state >=", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateLessThan(String value) {
            addCriterion("temp_suppliers.audit_state <", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateLessThanOrEqualTo(String value) {
            addCriterion("temp_suppliers.audit_state <=", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateLike(String value) {
            addCriterion("temp_suppliers.audit_state like", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateNotLike(String value) {
            addCriterion("temp_suppliers.audit_state not like", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateIn(List<String> values) {
            addCriterion("temp_suppliers.audit_state in", values, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateNotIn(List<String> values) {
            addCriterion("temp_suppliers.audit_state not in", values, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateBetween(String value1, String value2) {
            addCriterion("temp_suppliers.audit_state between", value1, value2, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateNotBetween(String value1, String value2) {
            addCriterion("temp_suppliers.audit_state not between", value1, value2, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkIsNull() {
            addCriterion("temp_suppliers.audit_remark is null");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkIsNotNull() {
            addCriterion("temp_suppliers.audit_remark is not null");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkEqualTo(String value) {
            addCriterion("temp_suppliers.audit_remark =", value, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkNotEqualTo(String value) {
            addCriterion("temp_suppliers.audit_remark <>", value, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkGreaterThan(String value) {
            addCriterion("temp_suppliers.audit_remark >", value, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("temp_suppliers.audit_remark >=", value, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkLessThan(String value) {
            addCriterion("temp_suppliers.audit_remark <", value, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkLessThanOrEqualTo(String value) {
            addCriterion("temp_suppliers.audit_remark <=", value, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkLike(String value) {
            addCriterion("temp_suppliers.audit_remark like", value, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkNotLike(String value) {
            addCriterion("temp_suppliers.audit_remark not like", value, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkIn(List<String> values) {
            addCriterion("temp_suppliers.audit_remark in", values, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkNotIn(List<String> values) {
            addCriterion("temp_suppliers.audit_remark not in", values, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkBetween(String value1, String value2) {
            addCriterion("temp_suppliers.audit_remark between", value1, value2, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkNotBetween(String value1, String value2) {
            addCriterion("temp_suppliers.audit_remark not between", value1, value2, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("temp_suppliers.remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("temp_suppliers.remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("temp_suppliers.remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("temp_suppliers.remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("temp_suppliers.remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("temp_suppliers.remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("temp_suppliers.remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("temp_suppliers.remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("temp_suppliers.remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("temp_suppliers.remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("temp_suppliers.remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("temp_suppliers.remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("temp_suppliers.remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("temp_suppliers.remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNull() {
            addCriterion("temp_suppliers.creater is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNotNull() {
            addCriterion("temp_suppliers.creater is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterEqualTo(String value) {
            addCriterion("temp_suppliers.creater =", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotEqualTo(String value) {
            addCriterion("temp_suppliers.creater <>", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThan(String value) {
            addCriterion("temp_suppliers.creater >", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_suppliers.creater >=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThan(String value) {
            addCriterion("temp_suppliers.creater <", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThanOrEqualTo(String value) {
            addCriterion("temp_suppliers.creater <=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLike(String value) {
            addCriterion("temp_suppliers.creater like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotLike(String value) {
            addCriterion("temp_suppliers.creater not like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterIn(List<String> values) {
            addCriterion("temp_suppliers.creater in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotIn(List<String> values) {
            addCriterion("temp_suppliers.creater not in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterBetween(String value1, String value2) {
            addCriterion("temp_suppliers.creater between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotBetween(String value1, String value2) {
            addCriterion("temp_suppliers.creater not between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("temp_suppliers.create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("temp_suppliers.create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("temp_suppliers.create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("temp_suppliers.create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("temp_suppliers.create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_suppliers.create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("temp_suppliers.create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_suppliers.create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("temp_suppliers.create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("temp_suppliers.create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_suppliers.create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_suppliers.create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNull() {
            addCriterion("temp_suppliers.updater is null");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNotNull() {
            addCriterion("temp_suppliers.updater is not null");
            return (Criteria) this;
        }

        public Criteria andUpdaterEqualTo(String value) {
            addCriterion("temp_suppliers.updater =", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotEqualTo(String value) {
            addCriterion("temp_suppliers.updater <>", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThan(String value) {
            addCriterion("temp_suppliers.updater >", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_suppliers.updater >=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThan(String value) {
            addCriterion("temp_suppliers.updater <", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThanOrEqualTo(String value) {
            addCriterion("temp_suppliers.updater <=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLike(String value) {
            addCriterion("temp_suppliers.updater like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotLike(String value) {
            addCriterion("temp_suppliers.updater not like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterIn(List<String> values) {
            addCriterion("temp_suppliers.updater in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotIn(List<String> values) {
            addCriterion("temp_suppliers.updater not in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterBetween(String value1, String value2) {
            addCriterion("temp_suppliers.updater between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotBetween(String value1, String value2) {
            addCriterion("temp_suppliers.updater not between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("temp_suppliers.update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("temp_suppliers.update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("temp_suppliers.update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("temp_suppliers.update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("temp_suppliers.update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_suppliers.update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("temp_suppliers.update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_suppliers.update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("temp_suppliers.update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("temp_suppliers.update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_suppliers.update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_suppliers.update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}
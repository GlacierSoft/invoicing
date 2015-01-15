package com.glacier.frame.entity.purchase;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PurchaseArrivalExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public PurchaseArrivalExample() {
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

        public Criteria andPurArrivalIdIsNull() {
            addCriterion("temp_purchase_arrival.pur_arrival_id is null");
            return (Criteria) this;
        }

        public Criteria andPurArrivalIdIsNotNull() {
            addCriterion("temp_purchase_arrival.pur_arrival_id is not null");
            return (Criteria) this;
        }

        public Criteria andPurArrivalIdEqualTo(String value) {
            addCriterion("temp_purchase_arrival.pur_arrival_id =", value, "purArrivalId");
            return (Criteria) this;
        }

        public Criteria andPurArrivalIdNotEqualTo(String value) {
            addCriterion("temp_purchase_arrival.pur_arrival_id <>", value, "purArrivalId");
            return (Criteria) this;
        }

        public Criteria andPurArrivalIdGreaterThan(String value) {
            addCriterion("temp_purchase_arrival.pur_arrival_id >", value, "purArrivalId");
            return (Criteria) this;
        }

        public Criteria andPurArrivalIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_arrival.pur_arrival_id >=", value, "purArrivalId");
            return (Criteria) this;
        }

        public Criteria andPurArrivalIdLessThan(String value) {
            addCriterion("temp_purchase_arrival.pur_arrival_id <", value, "purArrivalId");
            return (Criteria) this;
        }

        public Criteria andPurArrivalIdLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_arrival.pur_arrival_id <=", value, "purArrivalId");
            return (Criteria) this;
        }

        public Criteria andPurArrivalIdLike(String value) {
            addCriterion("temp_purchase_arrival.pur_arrival_id like", value, "purArrivalId");
            return (Criteria) this;
        }

        public Criteria andPurArrivalIdNotLike(String value) {
            addCriterion("temp_purchase_arrival.pur_arrival_id not like", value, "purArrivalId");
            return (Criteria) this;
        }

        public Criteria andPurArrivalIdIn(List<String> values) {
            addCriterion("temp_purchase_arrival.pur_arrival_id in", values, "purArrivalId");
            return (Criteria) this;
        }

        public Criteria andPurArrivalIdNotIn(List<String> values) {
            addCriterion("temp_purchase_arrival.pur_arrival_id not in", values, "purArrivalId");
            return (Criteria) this;
        }

        public Criteria andPurArrivalIdBetween(String value1, String value2) {
            addCriterion("temp_purchase_arrival.pur_arrival_id between", value1, value2, "purArrivalId");
            return (Criteria) this;
        }

        public Criteria andPurArrivalIdNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_arrival.pur_arrival_id not between", value1, value2, "purArrivalId");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeIdIsNull() {
            addCriterion("temp_purchase_arrival.purchase_type_id is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeIdIsNotNull() {
            addCriterion("temp_purchase_arrival.purchase_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeIdEqualTo(String value) {
            addCriterion("temp_purchase_arrival.purchase_type_id =", value, "purchaseTypeId");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeIdNotEqualTo(String value) {
            addCriterion("temp_purchase_arrival.purchase_type_id <>", value, "purchaseTypeId");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeIdGreaterThan(String value) {
            addCriterion("temp_purchase_arrival.purchase_type_id >", value, "purchaseTypeId");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_arrival.purchase_type_id >=", value, "purchaseTypeId");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeIdLessThan(String value) {
            addCriterion("temp_purchase_arrival.purchase_type_id <", value, "purchaseTypeId");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeIdLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_arrival.purchase_type_id <=", value, "purchaseTypeId");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeIdLike(String value) {
            addCriterion("temp_purchase_arrival.purchase_type_id like", value, "purchaseTypeId");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeIdNotLike(String value) {
            addCriterion("temp_purchase_arrival.purchase_type_id not like", value, "purchaseTypeId");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeIdIn(List<String> values) {
            addCriterion("temp_purchase_arrival.purchase_type_id in", values, "purchaseTypeId");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeIdNotIn(List<String> values) {
            addCriterion("temp_purchase_arrival.purchase_type_id not in", values, "purchaseTypeId");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeIdBetween(String value1, String value2) {
            addCriterion("temp_purchase_arrival.purchase_type_id between", value1, value2, "purchaseTypeId");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeIdNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_arrival.purchase_type_id not between", value1, value2, "purchaseTypeId");
            return (Criteria) this;
        }

        public Criteria andArrivalCodeIsNull() {
            addCriterion("temp_purchase_arrival.arrival_code is null");
            return (Criteria) this;
        }

        public Criteria andArrivalCodeIsNotNull() {
            addCriterion("temp_purchase_arrival.arrival_code is not null");
            return (Criteria) this;
        }

        public Criteria andArrivalCodeEqualTo(String value) {
            addCriterion("temp_purchase_arrival.arrival_code =", value, "arrivalCode");
            return (Criteria) this;
        }

        public Criteria andArrivalCodeNotEqualTo(String value) {
            addCriterion("temp_purchase_arrival.arrival_code <>", value, "arrivalCode");
            return (Criteria) this;
        }

        public Criteria andArrivalCodeGreaterThan(String value) {
            addCriterion("temp_purchase_arrival.arrival_code >", value, "arrivalCode");
            return (Criteria) this;
        }

        public Criteria andArrivalCodeGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_arrival.arrival_code >=", value, "arrivalCode");
            return (Criteria) this;
        }

        public Criteria andArrivalCodeLessThan(String value) {
            addCriterion("temp_purchase_arrival.arrival_code <", value, "arrivalCode");
            return (Criteria) this;
        }

        public Criteria andArrivalCodeLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_arrival.arrival_code <=", value, "arrivalCode");
            return (Criteria) this;
        }

        public Criteria andArrivalCodeLike(String value) {
            addCriterion("temp_purchase_arrival.arrival_code like", value, "arrivalCode");
            return (Criteria) this;
        }

        public Criteria andArrivalCodeNotLike(String value) {
            addCriterion("temp_purchase_arrival.arrival_code not like", value, "arrivalCode");
            return (Criteria) this;
        }

        public Criteria andArrivalCodeIn(List<String> values) {
            addCriterion("temp_purchase_arrival.arrival_code in", values, "arrivalCode");
            return (Criteria) this;
        }

        public Criteria andArrivalCodeNotIn(List<String> values) {
            addCriterion("temp_purchase_arrival.arrival_code not in", values, "arrivalCode");
            return (Criteria) this;
        }

        public Criteria andArrivalCodeBetween(String value1, String value2) {
            addCriterion("temp_purchase_arrival.arrival_code between", value1, value2, "arrivalCode");
            return (Criteria) this;
        }

        public Criteria andArrivalCodeNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_arrival.arrival_code not between", value1, value2, "arrivalCode");
            return (Criteria) this;
        }

        public Criteria andContractCodeIsNull() {
            addCriterion("temp_purchase_arrival.contract_code is null");
            return (Criteria) this;
        }

        public Criteria andContractCodeIsNotNull() {
            addCriterion("temp_purchase_arrival.contract_code is not null");
            return (Criteria) this;
        }

        public Criteria andContractCodeEqualTo(String value) {
            addCriterion("temp_purchase_arrival.contract_code =", value, "contractCode");
            return (Criteria) this;
        }

        public Criteria andContractCodeNotEqualTo(String value) {
            addCriterion("temp_purchase_arrival.contract_code <>", value, "contractCode");
            return (Criteria) this;
        }

        public Criteria andContractCodeGreaterThan(String value) {
            addCriterion("temp_purchase_arrival.contract_code >", value, "contractCode");
            return (Criteria) this;
        }

        public Criteria andContractCodeGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_arrival.contract_code >=", value, "contractCode");
            return (Criteria) this;
        }

        public Criteria andContractCodeLessThan(String value) {
            addCriterion("temp_purchase_arrival.contract_code <", value, "contractCode");
            return (Criteria) this;
        }

        public Criteria andContractCodeLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_arrival.contract_code <=", value, "contractCode");
            return (Criteria) this;
        }

        public Criteria andContractCodeLike(String value) {
            addCriterion("temp_purchase_arrival.contract_code like", value, "contractCode");
            return (Criteria) this;
        }

        public Criteria andContractCodeNotLike(String value) {
            addCriterion("temp_purchase_arrival.contract_code not like", value, "contractCode");
            return (Criteria) this;
        }

        public Criteria andContractCodeIn(List<String> values) {
            addCriterion("temp_purchase_arrival.contract_code in", values, "contractCode");
            return (Criteria) this;
        }

        public Criteria andContractCodeNotIn(List<String> values) {
            addCriterion("temp_purchase_arrival.contract_code not in", values, "contractCode");
            return (Criteria) this;
        }

        public Criteria andContractCodeBetween(String value1, String value2) {
            addCriterion("temp_purchase_arrival.contract_code between", value1, value2, "contractCode");
            return (Criteria) this;
        }

        public Criteria andContractCodeNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_arrival.contract_code not between", value1, value2, "contractCode");
            return (Criteria) this;
        }

        public Criteria andSupplierIdIsNull() {
            addCriterion("temp_purchase_arrival.supplier_id is null");
            return (Criteria) this;
        }

        public Criteria andSupplierIdIsNotNull() {
            addCriterion("temp_purchase_arrival.supplier_id is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierIdEqualTo(String value) {
            addCriterion("temp_purchase_arrival.supplier_id =", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotEqualTo(String value) {
            addCriterion("temp_purchase_arrival.supplier_id <>", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdGreaterThan(String value) {
            addCriterion("temp_purchase_arrival.supplier_id >", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_arrival.supplier_id >=", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdLessThan(String value) {
            addCriterion("temp_purchase_arrival.supplier_id <", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_arrival.supplier_id <=", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdLike(String value) {
            addCriterion("temp_purchase_arrival.supplier_id like", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotLike(String value) {
            addCriterion("temp_purchase_arrival.supplier_id not like", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdIn(List<String> values) {
            addCriterion("temp_purchase_arrival.supplier_id in", values, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotIn(List<String> values) {
            addCriterion("temp_purchase_arrival.supplier_id not in", values, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdBetween(String value1, String value2) {
            addCriterion("temp_purchase_arrival.supplier_id between", value1, value2, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_arrival.supplier_id not between", value1, value2, "supplierId");
            return (Criteria) this;
        }

        public Criteria andFaxIsNull() {
            addCriterion("temp_purchase_arrival.fax is null");
            return (Criteria) this;
        }

        public Criteria andFaxIsNotNull() {
            addCriterion("temp_purchase_arrival.fax is not null");
            return (Criteria) this;
        }

        public Criteria andFaxEqualTo(String value) {
            addCriterion("temp_purchase_arrival.fax =", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotEqualTo(String value) {
            addCriterion("temp_purchase_arrival.fax <>", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxGreaterThan(String value) {
            addCriterion("temp_purchase_arrival.fax >", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_arrival.fax >=", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLessThan(String value) {
            addCriterion("temp_purchase_arrival.fax <", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_arrival.fax <=", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLike(String value) {
            addCriterion("temp_purchase_arrival.fax like", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotLike(String value) {
            addCriterion("temp_purchase_arrival.fax not like", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxIn(List<String> values) {
            addCriterion("temp_purchase_arrival.fax in", values, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotIn(List<String> values) {
            addCriterion("temp_purchase_arrival.fax not in", values, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxBetween(String value1, String value2) {
            addCriterion("temp_purchase_arrival.fax between", value1, value2, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_arrival.fax not between", value1, value2, "fax");
            return (Criteria) this;
        }

        public Criteria andLinkmanIsNull() {
            addCriterion("temp_purchase_arrival.linkman is null");
            return (Criteria) this;
        }

        public Criteria andLinkmanIsNotNull() {
            addCriterion("temp_purchase_arrival.linkman is not null");
            return (Criteria) this;
        }

        public Criteria andLinkmanEqualTo(String value) {
            addCriterion("temp_purchase_arrival.linkman =", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanNotEqualTo(String value) {
            addCriterion("temp_purchase_arrival.linkman <>", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanGreaterThan(String value) {
            addCriterion("temp_purchase_arrival.linkman >", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_arrival.linkman >=", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanLessThan(String value) {
            addCriterion("temp_purchase_arrival.linkman <", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_arrival.linkman <=", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanLike(String value) {
            addCriterion("temp_purchase_arrival.linkman like", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanNotLike(String value) {
            addCriterion("temp_purchase_arrival.linkman not like", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanIn(List<String> values) {
            addCriterion("temp_purchase_arrival.linkman in", values, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanNotIn(List<String> values) {
            addCriterion("temp_purchase_arrival.linkman not in", values, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanBetween(String value1, String value2) {
            addCriterion("temp_purchase_arrival.linkman between", value1, value2, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_arrival.linkman not between", value1, value2, "linkman");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("temp_purchase_arrival.phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("temp_purchase_arrival.phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("temp_purchase_arrival.phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("temp_purchase_arrival.phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("temp_purchase_arrival.phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_arrival.phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("temp_purchase_arrival.phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_arrival.phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("temp_purchase_arrival.phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("temp_purchase_arrival.phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("temp_purchase_arrival.phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("temp_purchase_arrival.phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("temp_purchase_arrival.phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_arrival.phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andSupplierAddIsNull() {
            addCriterion("temp_purchase_arrival.supplier_add is null");
            return (Criteria) this;
        }

        public Criteria andSupplierAddIsNotNull() {
            addCriterion("temp_purchase_arrival.supplier_add is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierAddEqualTo(String value) {
            addCriterion("temp_purchase_arrival.supplier_add =", value, "supplierAdd");
            return (Criteria) this;
        }

        public Criteria andSupplierAddNotEqualTo(String value) {
            addCriterion("temp_purchase_arrival.supplier_add <>", value, "supplierAdd");
            return (Criteria) this;
        }

        public Criteria andSupplierAddGreaterThan(String value) {
            addCriterion("temp_purchase_arrival.supplier_add >", value, "supplierAdd");
            return (Criteria) this;
        }

        public Criteria andSupplierAddGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_arrival.supplier_add >=", value, "supplierAdd");
            return (Criteria) this;
        }

        public Criteria andSupplierAddLessThan(String value) {
            addCriterion("temp_purchase_arrival.supplier_add <", value, "supplierAdd");
            return (Criteria) this;
        }

        public Criteria andSupplierAddLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_arrival.supplier_add <=", value, "supplierAdd");
            return (Criteria) this;
        }

        public Criteria andSupplierAddLike(String value) {
            addCriterion("temp_purchase_arrival.supplier_add like", value, "supplierAdd");
            return (Criteria) this;
        }

        public Criteria andSupplierAddNotLike(String value) {
            addCriterion("temp_purchase_arrival.supplier_add not like", value, "supplierAdd");
            return (Criteria) this;
        }

        public Criteria andSupplierAddIn(List<String> values) {
            addCriterion("temp_purchase_arrival.supplier_add in", values, "supplierAdd");
            return (Criteria) this;
        }

        public Criteria andSupplierAddNotIn(List<String> values) {
            addCriterion("temp_purchase_arrival.supplier_add not in", values, "supplierAdd");
            return (Criteria) this;
        }

        public Criteria andSupplierAddBetween(String value1, String value2) {
            addCriterion("temp_purchase_arrival.supplier_add between", value1, value2, "supplierAdd");
            return (Criteria) this;
        }

        public Criteria andSupplierAddNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_arrival.supplier_add not between", value1, value2, "supplierAdd");
            return (Criteria) this;
        }

        public Criteria andStorageIsNull() {
            addCriterion("temp_purchase_arrival.storage is null");
            return (Criteria) this;
        }

        public Criteria andStorageIsNotNull() {
            addCriterion("temp_purchase_arrival.storage is not null");
            return (Criteria) this;
        }

        public Criteria andStorageEqualTo(String value) {
            addCriterion("temp_purchase_arrival.storage =", value, "storage");
            return (Criteria) this;
        }

        public Criteria andStorageNotEqualTo(String value) {
            addCriterion("temp_purchase_arrival.storage <>", value, "storage");
            return (Criteria) this;
        }

        public Criteria andStorageGreaterThan(String value) {
            addCriterion("temp_purchase_arrival.storage >", value, "storage");
            return (Criteria) this;
        }

        public Criteria andStorageGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_arrival.storage >=", value, "storage");
            return (Criteria) this;
        }

        public Criteria andStorageLessThan(String value) {
            addCriterion("temp_purchase_arrival.storage <", value, "storage");
            return (Criteria) this;
        }

        public Criteria andStorageLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_arrival.storage <=", value, "storage");
            return (Criteria) this;
        }

        public Criteria andStorageLike(String value) {
            addCriterion("temp_purchase_arrival.storage like", value, "storage");
            return (Criteria) this;
        }

        public Criteria andStorageNotLike(String value) {
            addCriterion("temp_purchase_arrival.storage not like", value, "storage");
            return (Criteria) this;
        }

        public Criteria andStorageIn(List<String> values) {
            addCriterion("temp_purchase_arrival.storage in", values, "storage");
            return (Criteria) this;
        }

        public Criteria andStorageNotIn(List<String> values) {
            addCriterion("temp_purchase_arrival.storage not in", values, "storage");
            return (Criteria) this;
        }

        public Criteria andStorageBetween(String value1, String value2) {
            addCriterion("temp_purchase_arrival.storage between", value1, value2, "storage");
            return (Criteria) this;
        }

        public Criteria andStorageNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_arrival.storage not between", value1, value2, "storage");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeIsNull() {
            addCriterion("temp_purchase_arrival.delivery_type is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeIsNotNull() {
            addCriterion("temp_purchase_arrival.delivery_type is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeEqualTo(String value) {
            addCriterion("temp_purchase_arrival.delivery_type =", value, "deliveryType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeNotEqualTo(String value) {
            addCriterion("temp_purchase_arrival.delivery_type <>", value, "deliveryType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeGreaterThan(String value) {
            addCriterion("temp_purchase_arrival.delivery_type >", value, "deliveryType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_arrival.delivery_type >=", value, "deliveryType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeLessThan(String value) {
            addCriterion("temp_purchase_arrival.delivery_type <", value, "deliveryType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_arrival.delivery_type <=", value, "deliveryType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeLike(String value) {
            addCriterion("temp_purchase_arrival.delivery_type like", value, "deliveryType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeNotLike(String value) {
            addCriterion("temp_purchase_arrival.delivery_type not like", value, "deliveryType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeIn(List<String> values) {
            addCriterion("temp_purchase_arrival.delivery_type in", values, "deliveryType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeNotIn(List<String> values) {
            addCriterion("temp_purchase_arrival.delivery_type not in", values, "deliveryType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeBetween(String value1, String value2) {
            addCriterion("temp_purchase_arrival.delivery_type between", value1, value2, "deliveryType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_arrival.delivery_type not between", value1, value2, "deliveryType");
            return (Criteria) this;
        }

        public Criteria andDeliveryDeadIsNull() {
            addCriterion("temp_purchase_arrival.delivery_dead is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryDeadIsNotNull() {
            addCriterion("temp_purchase_arrival.delivery_dead is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryDeadEqualTo(Date value) {
            addCriterion("temp_purchase_arrival.delivery_dead =", value, "deliveryDead");
            return (Criteria) this;
        }

        public Criteria andDeliveryDeadNotEqualTo(Date value) {
            addCriterion("temp_purchase_arrival.delivery_dead <>", value, "deliveryDead");
            return (Criteria) this;
        }

        public Criteria andDeliveryDeadGreaterThan(Date value) {
            addCriterion("temp_purchase_arrival.delivery_dead >", value, "deliveryDead");
            return (Criteria) this;
        }

        public Criteria andDeliveryDeadGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_purchase_arrival.delivery_dead >=", value, "deliveryDead");
            return (Criteria) this;
        }

        public Criteria andDeliveryDeadLessThan(Date value) {
            addCriterion("temp_purchase_arrival.delivery_dead <", value, "deliveryDead");
            return (Criteria) this;
        }

        public Criteria andDeliveryDeadLessThanOrEqualTo(Date value) {
            addCriterion("temp_purchase_arrival.delivery_dead <=", value, "deliveryDead");
            return (Criteria) this;
        }

        public Criteria andDeliveryDeadIn(List<Date> values) {
            addCriterion("temp_purchase_arrival.delivery_dead in", values, "deliveryDead");
            return (Criteria) this;
        }

        public Criteria andDeliveryDeadNotIn(List<Date> values) {
            addCriterion("temp_purchase_arrival.delivery_dead not in", values, "deliveryDead");
            return (Criteria) this;
        }

        public Criteria andDeliveryDeadBetween(Date value1, Date value2) {
            addCriterion("temp_purchase_arrival.delivery_dead between", value1, value2, "deliveryDead");
            return (Criteria) this;
        }

        public Criteria andDeliveryDeadNotBetween(Date value1, Date value2) {
            addCriterion("temp_purchase_arrival.delivery_dead not between", value1, value2, "deliveryDead");
            return (Criteria) this;
        }

        public Criteria andPaymentAgrIdIsNull() {
            addCriterion("temp_purchase_arrival.payment_agr_id is null");
            return (Criteria) this;
        }

        public Criteria andPaymentAgrIdIsNotNull() {
            addCriterion("temp_purchase_arrival.payment_agr_id is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentAgrIdEqualTo(String value) {
            addCriterion("temp_purchase_arrival.payment_agr_id =", value, "paymentAgrId");
            return (Criteria) this;
        }

        public Criteria andPaymentAgrIdNotEqualTo(String value) {
            addCriterion("temp_purchase_arrival.payment_agr_id <>", value, "paymentAgrId");
            return (Criteria) this;
        }

        public Criteria andPaymentAgrIdGreaterThan(String value) {
            addCriterion("temp_purchase_arrival.payment_agr_id >", value, "paymentAgrId");
            return (Criteria) this;
        }

        public Criteria andPaymentAgrIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_arrival.payment_agr_id >=", value, "paymentAgrId");
            return (Criteria) this;
        }

        public Criteria andPaymentAgrIdLessThan(String value) {
            addCriterion("temp_purchase_arrival.payment_agr_id <", value, "paymentAgrId");
            return (Criteria) this;
        }

        public Criteria andPaymentAgrIdLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_arrival.payment_agr_id <=", value, "paymentAgrId");
            return (Criteria) this;
        }

        public Criteria andPaymentAgrIdLike(String value) {
            addCriterion("temp_purchase_arrival.payment_agr_id like", value, "paymentAgrId");
            return (Criteria) this;
        }

        public Criteria andPaymentAgrIdNotLike(String value) {
            addCriterion("temp_purchase_arrival.payment_agr_id not like", value, "paymentAgrId");
            return (Criteria) this;
        }

        public Criteria andPaymentAgrIdIn(List<String> values) {
            addCriterion("temp_purchase_arrival.payment_agr_id in", values, "paymentAgrId");
            return (Criteria) this;
        }

        public Criteria andPaymentAgrIdNotIn(List<String> values) {
            addCriterion("temp_purchase_arrival.payment_agr_id not in", values, "paymentAgrId");
            return (Criteria) this;
        }

        public Criteria andPaymentAgrIdBetween(String value1, String value2) {
            addCriterion("temp_purchase_arrival.payment_agr_id between", value1, value2, "paymentAgrId");
            return (Criteria) this;
        }

        public Criteria andPaymentAgrIdNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_arrival.payment_agr_id not between", value1, value2, "paymentAgrId");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddIsNull() {
            addCriterion("temp_purchase_arrival.delivery_add is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddIsNotNull() {
            addCriterion("temp_purchase_arrival.delivery_add is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddEqualTo(String value) {
            addCriterion("temp_purchase_arrival.delivery_add =", value, "deliveryAdd");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddNotEqualTo(String value) {
            addCriterion("temp_purchase_arrival.delivery_add <>", value, "deliveryAdd");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddGreaterThan(String value) {
            addCriterion("temp_purchase_arrival.delivery_add >", value, "deliveryAdd");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_arrival.delivery_add >=", value, "deliveryAdd");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddLessThan(String value) {
            addCriterion("temp_purchase_arrival.delivery_add <", value, "deliveryAdd");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_arrival.delivery_add <=", value, "deliveryAdd");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddLike(String value) {
            addCriterion("temp_purchase_arrival.delivery_add like", value, "deliveryAdd");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddNotLike(String value) {
            addCriterion("temp_purchase_arrival.delivery_add not like", value, "deliveryAdd");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddIn(List<String> values) {
            addCriterion("temp_purchase_arrival.delivery_add in", values, "deliveryAdd");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddNotIn(List<String> values) {
            addCriterion("temp_purchase_arrival.delivery_add not in", values, "deliveryAdd");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddBetween(String value1, String value2) {
            addCriterion("temp_purchase_arrival.delivery_add between", value1, value2, "deliveryAdd");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_arrival.delivery_add not between", value1, value2, "deliveryAdd");
            return (Criteria) this;
        }

        public Criteria andInvoiceIsNull() {
            addCriterion("temp_purchase_arrival.invoice is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceIsNotNull() {
            addCriterion("temp_purchase_arrival.invoice is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceEqualTo(String value) {
            addCriterion("temp_purchase_arrival.invoice =", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceNotEqualTo(String value) {
            addCriterion("temp_purchase_arrival.invoice <>", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceGreaterThan(String value) {
            addCriterion("temp_purchase_arrival.invoice >", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_arrival.invoice >=", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceLessThan(String value) {
            addCriterion("temp_purchase_arrival.invoice <", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_arrival.invoice <=", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceLike(String value) {
            addCriterion("temp_purchase_arrival.invoice like", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceNotLike(String value) {
            addCriterion("temp_purchase_arrival.invoice not like", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceIn(List<String> values) {
            addCriterion("temp_purchase_arrival.invoice in", values, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceNotIn(List<String> values) {
            addCriterion("temp_purchase_arrival.invoice not in", values, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceBetween(String value1, String value2) {
            addCriterion("temp_purchase_arrival.invoice between", value1, value2, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_arrival.invoice not between", value1, value2, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeIdIsNull() {
            addCriterion("temp_purchase_arrival.invoice_type_id is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeIdIsNotNull() {
            addCriterion("temp_purchase_arrival.invoice_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeIdEqualTo(String value) {
            addCriterion("temp_purchase_arrival.invoice_type_id =", value, "invoiceTypeId");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeIdNotEqualTo(String value) {
            addCriterion("temp_purchase_arrival.invoice_type_id <>", value, "invoiceTypeId");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeIdGreaterThan(String value) {
            addCriterion("temp_purchase_arrival.invoice_type_id >", value, "invoiceTypeId");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_arrival.invoice_type_id >=", value, "invoiceTypeId");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeIdLessThan(String value) {
            addCriterion("temp_purchase_arrival.invoice_type_id <", value, "invoiceTypeId");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeIdLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_arrival.invoice_type_id <=", value, "invoiceTypeId");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeIdLike(String value) {
            addCriterion("temp_purchase_arrival.invoice_type_id like", value, "invoiceTypeId");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeIdNotLike(String value) {
            addCriterion("temp_purchase_arrival.invoice_type_id not like", value, "invoiceTypeId");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeIdIn(List<String> values) {
            addCriterion("temp_purchase_arrival.invoice_type_id in", values, "invoiceTypeId");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeIdNotIn(List<String> values) {
            addCriterion("temp_purchase_arrival.invoice_type_id not in", values, "invoiceTypeId");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeIdBetween(String value1, String value2) {
            addCriterion("temp_purchase_arrival.invoice_type_id between", value1, value2, "invoiceTypeId");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeIdNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_arrival.invoice_type_id not between", value1, value2, "invoiceTypeId");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIdIsNull() {
            addCriterion("temp_purchase_arrival.payment_type_id is null");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIdIsNotNull() {
            addCriterion("temp_purchase_arrival.payment_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIdEqualTo(String value) {
            addCriterion("temp_purchase_arrival.payment_type_id =", value, "paymentTypeId");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIdNotEqualTo(String value) {
            addCriterion("temp_purchase_arrival.payment_type_id <>", value, "paymentTypeId");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIdGreaterThan(String value) {
            addCriterion("temp_purchase_arrival.payment_type_id >", value, "paymentTypeId");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_arrival.payment_type_id >=", value, "paymentTypeId");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIdLessThan(String value) {
            addCriterion("temp_purchase_arrival.payment_type_id <", value, "paymentTypeId");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIdLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_arrival.payment_type_id <=", value, "paymentTypeId");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIdLike(String value) {
            addCriterion("temp_purchase_arrival.payment_type_id like", value, "paymentTypeId");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIdNotLike(String value) {
            addCriterion("temp_purchase_arrival.payment_type_id not like", value, "paymentTypeId");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIdIn(List<String> values) {
            addCriterion("temp_purchase_arrival.payment_type_id in", values, "paymentTypeId");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIdNotIn(List<String> values) {
            addCriterion("temp_purchase_arrival.payment_type_id not in", values, "paymentTypeId");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIdBetween(String value1, String value2) {
            addCriterion("temp_purchase_arrival.payment_type_id between", value1, value2, "paymentTypeId");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIdNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_arrival.payment_type_id not between", value1, value2, "paymentTypeId");
            return (Criteria) this;
        }

        public Criteria andLogSettlementIdIsNull() {
            addCriterion("temp_purchase_arrival.log_settlement_id is null");
            return (Criteria) this;
        }

        public Criteria andLogSettlementIdIsNotNull() {
            addCriterion("temp_purchase_arrival.log_settlement_id is not null");
            return (Criteria) this;
        }

        public Criteria andLogSettlementIdEqualTo(String value) {
            addCriterion("temp_purchase_arrival.log_settlement_id =", value, "logSettlementId");
            return (Criteria) this;
        }

        public Criteria andLogSettlementIdNotEqualTo(String value) {
            addCriterion("temp_purchase_arrival.log_settlement_id <>", value, "logSettlementId");
            return (Criteria) this;
        }

        public Criteria andLogSettlementIdGreaterThan(String value) {
            addCriterion("temp_purchase_arrival.log_settlement_id >", value, "logSettlementId");
            return (Criteria) this;
        }

        public Criteria andLogSettlementIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_arrival.log_settlement_id >=", value, "logSettlementId");
            return (Criteria) this;
        }

        public Criteria andLogSettlementIdLessThan(String value) {
            addCriterion("temp_purchase_arrival.log_settlement_id <", value, "logSettlementId");
            return (Criteria) this;
        }

        public Criteria andLogSettlementIdLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_arrival.log_settlement_id <=", value, "logSettlementId");
            return (Criteria) this;
        }

        public Criteria andLogSettlementIdLike(String value) {
            addCriterion("temp_purchase_arrival.log_settlement_id like", value, "logSettlementId");
            return (Criteria) this;
        }

        public Criteria andLogSettlementIdNotLike(String value) {
            addCriterion("temp_purchase_arrival.log_settlement_id not like", value, "logSettlementId");
            return (Criteria) this;
        }

        public Criteria andLogSettlementIdIn(List<String> values) {
            addCriterion("temp_purchase_arrival.log_settlement_id in", values, "logSettlementId");
            return (Criteria) this;
        }

        public Criteria andLogSettlementIdNotIn(List<String> values) {
            addCriterion("temp_purchase_arrival.log_settlement_id not in", values, "logSettlementId");
            return (Criteria) this;
        }

        public Criteria andLogSettlementIdBetween(String value1, String value2) {
            addCriterion("temp_purchase_arrival.log_settlement_id between", value1, value2, "logSettlementId");
            return (Criteria) this;
        }

        public Criteria andLogSettlementIdNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_arrival.log_settlement_id not between", value1, value2, "logSettlementId");
            return (Criteria) this;
        }

        public Criteria andLogCodeIsNull() {
            addCriterion("temp_purchase_arrival.log_code is null");
            return (Criteria) this;
        }

        public Criteria andLogCodeIsNotNull() {
            addCriterion("temp_purchase_arrival.log_code is not null");
            return (Criteria) this;
        }

        public Criteria andLogCodeEqualTo(String value) {
            addCriterion("temp_purchase_arrival.log_code =", value, "logCode");
            return (Criteria) this;
        }

        public Criteria andLogCodeNotEqualTo(String value) {
            addCriterion("temp_purchase_arrival.log_code <>", value, "logCode");
            return (Criteria) this;
        }

        public Criteria andLogCodeGreaterThan(String value) {
            addCriterion("temp_purchase_arrival.log_code >", value, "logCode");
            return (Criteria) this;
        }

        public Criteria andLogCodeGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_arrival.log_code >=", value, "logCode");
            return (Criteria) this;
        }

        public Criteria andLogCodeLessThan(String value) {
            addCriterion("temp_purchase_arrival.log_code <", value, "logCode");
            return (Criteria) this;
        }

        public Criteria andLogCodeLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_arrival.log_code <=", value, "logCode");
            return (Criteria) this;
        }

        public Criteria andLogCodeLike(String value) {
            addCriterion("temp_purchase_arrival.log_code like", value, "logCode");
            return (Criteria) this;
        }

        public Criteria andLogCodeNotLike(String value) {
            addCriterion("temp_purchase_arrival.log_code not like", value, "logCode");
            return (Criteria) this;
        }

        public Criteria andLogCodeIn(List<String> values) {
            addCriterion("temp_purchase_arrival.log_code in", values, "logCode");
            return (Criteria) this;
        }

        public Criteria andLogCodeNotIn(List<String> values) {
            addCriterion("temp_purchase_arrival.log_code not in", values, "logCode");
            return (Criteria) this;
        }

        public Criteria andLogCodeBetween(String value1, String value2) {
            addCriterion("temp_purchase_arrival.log_code between", value1, value2, "logCode");
            return (Criteria) this;
        }

        public Criteria andLogCodeNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_arrival.log_code not between", value1, value2, "logCode");
            return (Criteria) this;
        }

        public Criteria andLogTotalTmountIsNull() {
            addCriterion("temp_purchase_arrival.log_total_tmount is null");
            return (Criteria) this;
        }

        public Criteria andLogTotalTmountIsNotNull() {
            addCriterion("temp_purchase_arrival.log_total_tmount is not null");
            return (Criteria) this;
        }

        public Criteria andLogTotalTmountEqualTo(BigDecimal value) {
            addCriterion("temp_purchase_arrival.log_total_tmount =", value, "logTotalTmount");
            return (Criteria) this;
        }

        public Criteria andLogTotalTmountNotEqualTo(BigDecimal value) {
            addCriterion("temp_purchase_arrival.log_total_tmount <>", value, "logTotalTmount");
            return (Criteria) this;
        }

        public Criteria andLogTotalTmountGreaterThan(BigDecimal value) {
            addCriterion("temp_purchase_arrival.log_total_tmount >", value, "logTotalTmount");
            return (Criteria) this;
        }

        public Criteria andLogTotalTmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_purchase_arrival.log_total_tmount >=", value, "logTotalTmount");
            return (Criteria) this;
        }

        public Criteria andLogTotalTmountLessThan(BigDecimal value) {
            addCriterion("temp_purchase_arrival.log_total_tmount <", value, "logTotalTmount");
            return (Criteria) this;
        }

        public Criteria andLogTotalTmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_purchase_arrival.log_total_tmount <=", value, "logTotalTmount");
            return (Criteria) this;
        }

        public Criteria andLogTotalTmountIn(List<BigDecimal> values) {
            addCriterion("temp_purchase_arrival.log_total_tmount in", values, "logTotalTmount");
            return (Criteria) this;
        }

        public Criteria andLogTotalTmountNotIn(List<BigDecimal> values) {
            addCriterion("temp_purchase_arrival.log_total_tmount not in", values, "logTotalTmount");
            return (Criteria) this;
        }

        public Criteria andLogTotalTmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_purchase_arrival.log_total_tmount between", value1, value2, "logTotalTmount");
            return (Criteria) this;
        }

        public Criteria andLogTotalTmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_purchase_arrival.log_total_tmount not between", value1, value2, "logTotalTmount");
            return (Criteria) this;
        }

        public Criteria andLogCompanyIsNull() {
            addCriterion("temp_purchase_arrival.log_company is null");
            return (Criteria) this;
        }

        public Criteria andLogCompanyIsNotNull() {
            addCriterion("temp_purchase_arrival.log_company is not null");
            return (Criteria) this;
        }

        public Criteria andLogCompanyEqualTo(String value) {
            addCriterion("temp_purchase_arrival.log_company =", value, "logCompany");
            return (Criteria) this;
        }

        public Criteria andLogCompanyNotEqualTo(String value) {
            addCriterion("temp_purchase_arrival.log_company <>", value, "logCompany");
            return (Criteria) this;
        }

        public Criteria andLogCompanyGreaterThan(String value) {
            addCriterion("temp_purchase_arrival.log_company >", value, "logCompany");
            return (Criteria) this;
        }

        public Criteria andLogCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_arrival.log_company >=", value, "logCompany");
            return (Criteria) this;
        }

        public Criteria andLogCompanyLessThan(String value) {
            addCriterion("temp_purchase_arrival.log_company <", value, "logCompany");
            return (Criteria) this;
        }

        public Criteria andLogCompanyLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_arrival.log_company <=", value, "logCompany");
            return (Criteria) this;
        }

        public Criteria andLogCompanyLike(String value) {
            addCriterion("temp_purchase_arrival.log_company like", value, "logCompany");
            return (Criteria) this;
        }

        public Criteria andLogCompanyNotLike(String value) {
            addCriterion("temp_purchase_arrival.log_company not like", value, "logCompany");
            return (Criteria) this;
        }

        public Criteria andLogCompanyIn(List<String> values) {
            addCriterion("temp_purchase_arrival.log_company in", values, "logCompany");
            return (Criteria) this;
        }

        public Criteria andLogCompanyNotIn(List<String> values) {
            addCriterion("temp_purchase_arrival.log_company not in", values, "logCompany");
            return (Criteria) this;
        }

        public Criteria andLogCompanyBetween(String value1, String value2) {
            addCriterion("temp_purchase_arrival.log_company between", value1, value2, "logCompany");
            return (Criteria) this;
        }

        public Criteria andLogCompanyNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_arrival.log_company not between", value1, value2, "logCompany");
            return (Criteria) this;
        }

        public Criteria andLogLinkmanIsNull() {
            addCriterion("temp_purchase_arrival.log_linkman is null");
            return (Criteria) this;
        }

        public Criteria andLogLinkmanIsNotNull() {
            addCriterion("temp_purchase_arrival.log_linkman is not null");
            return (Criteria) this;
        }

        public Criteria andLogLinkmanEqualTo(String value) {
            addCriterion("temp_purchase_arrival.log_linkman =", value, "logLinkman");
            return (Criteria) this;
        }

        public Criteria andLogLinkmanNotEqualTo(String value) {
            addCriterion("temp_purchase_arrival.log_linkman <>", value, "logLinkman");
            return (Criteria) this;
        }

        public Criteria andLogLinkmanGreaterThan(String value) {
            addCriterion("temp_purchase_arrival.log_linkman >", value, "logLinkman");
            return (Criteria) this;
        }

        public Criteria andLogLinkmanGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_arrival.log_linkman >=", value, "logLinkman");
            return (Criteria) this;
        }

        public Criteria andLogLinkmanLessThan(String value) {
            addCriterion("temp_purchase_arrival.log_linkman <", value, "logLinkman");
            return (Criteria) this;
        }

        public Criteria andLogLinkmanLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_arrival.log_linkman <=", value, "logLinkman");
            return (Criteria) this;
        }

        public Criteria andLogLinkmanLike(String value) {
            addCriterion("temp_purchase_arrival.log_linkman like", value, "logLinkman");
            return (Criteria) this;
        }

        public Criteria andLogLinkmanNotLike(String value) {
            addCriterion("temp_purchase_arrival.log_linkman not like", value, "logLinkman");
            return (Criteria) this;
        }

        public Criteria andLogLinkmanIn(List<String> values) {
            addCriterion("temp_purchase_arrival.log_linkman in", values, "logLinkman");
            return (Criteria) this;
        }

        public Criteria andLogLinkmanNotIn(List<String> values) {
            addCriterion("temp_purchase_arrival.log_linkman not in", values, "logLinkman");
            return (Criteria) this;
        }

        public Criteria andLogLinkmanBetween(String value1, String value2) {
            addCriterion("temp_purchase_arrival.log_linkman between", value1, value2, "logLinkman");
            return (Criteria) this;
        }

        public Criteria andLogLinkmanNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_arrival.log_linkman not between", value1, value2, "logLinkman");
            return (Criteria) this;
        }

        public Criteria andLogPhoneIsNull() {
            addCriterion("temp_purchase_arrival.log_phone is null");
            return (Criteria) this;
        }

        public Criteria andLogPhoneIsNotNull() {
            addCriterion("temp_purchase_arrival.log_phone is not null");
            return (Criteria) this;
        }

        public Criteria andLogPhoneEqualTo(String value) {
            addCriterion("temp_purchase_arrival.log_phone =", value, "logPhone");
            return (Criteria) this;
        }

        public Criteria andLogPhoneNotEqualTo(String value) {
            addCriterion("temp_purchase_arrival.log_phone <>", value, "logPhone");
            return (Criteria) this;
        }

        public Criteria andLogPhoneGreaterThan(String value) {
            addCriterion("temp_purchase_arrival.log_phone >", value, "logPhone");
            return (Criteria) this;
        }

        public Criteria andLogPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_arrival.log_phone >=", value, "logPhone");
            return (Criteria) this;
        }

        public Criteria andLogPhoneLessThan(String value) {
            addCriterion("temp_purchase_arrival.log_phone <", value, "logPhone");
            return (Criteria) this;
        }

        public Criteria andLogPhoneLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_arrival.log_phone <=", value, "logPhone");
            return (Criteria) this;
        }

        public Criteria andLogPhoneLike(String value) {
            addCriterion("temp_purchase_arrival.log_phone like", value, "logPhone");
            return (Criteria) this;
        }

        public Criteria andLogPhoneNotLike(String value) {
            addCriterion("temp_purchase_arrival.log_phone not like", value, "logPhone");
            return (Criteria) this;
        }

        public Criteria andLogPhoneIn(List<String> values) {
            addCriterion("temp_purchase_arrival.log_phone in", values, "logPhone");
            return (Criteria) this;
        }

        public Criteria andLogPhoneNotIn(List<String> values) {
            addCriterion("temp_purchase_arrival.log_phone not in", values, "logPhone");
            return (Criteria) this;
        }

        public Criteria andLogPhoneBetween(String value1, String value2) {
            addCriterion("temp_purchase_arrival.log_phone between", value1, value2, "logPhone");
            return (Criteria) this;
        }

        public Criteria andLogPhoneNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_arrival.log_phone not between", value1, value2, "logPhone");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIsNull() {
            addCriterion("temp_purchase_arrival.total_amount is null");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIsNotNull() {
            addCriterion("temp_purchase_arrival.total_amount is not null");
            return (Criteria) this;
        }

        public Criteria andTotalAmountEqualTo(BigDecimal value) {
            addCriterion("temp_purchase_arrival.total_amount =", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotEqualTo(BigDecimal value) {
            addCriterion("temp_purchase_arrival.total_amount <>", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountGreaterThan(BigDecimal value) {
            addCriterion("temp_purchase_arrival.total_amount >", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_purchase_arrival.total_amount >=", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountLessThan(BigDecimal value) {
            addCriterion("temp_purchase_arrival.total_amount <", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_purchase_arrival.total_amount <=", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIn(List<BigDecimal> values) {
            addCriterion("temp_purchase_arrival.total_amount in", values, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotIn(List<BigDecimal> values) {
            addCriterion("temp_purchase_arrival.total_amount not in", values, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_purchase_arrival.total_amount between", value1, value2, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_purchase_arrival.total_amount not between", value1, value2, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andDerateMoneyIsNull() {
            addCriterion("temp_purchase_arrival.derate_money is null");
            return (Criteria) this;
        }

        public Criteria andDerateMoneyIsNotNull() {
            addCriterion("temp_purchase_arrival.derate_money is not null");
            return (Criteria) this;
        }

        public Criteria andDerateMoneyEqualTo(BigDecimal value) {
            addCriterion("temp_purchase_arrival.derate_money =", value, "derateMoney");
            return (Criteria) this;
        }

        public Criteria andDerateMoneyNotEqualTo(BigDecimal value) {
            addCriterion("temp_purchase_arrival.derate_money <>", value, "derateMoney");
            return (Criteria) this;
        }

        public Criteria andDerateMoneyGreaterThan(BigDecimal value) {
            addCriterion("temp_purchase_arrival.derate_money >", value, "derateMoney");
            return (Criteria) this;
        }

        public Criteria andDerateMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_purchase_arrival.derate_money >=", value, "derateMoney");
            return (Criteria) this;
        }

        public Criteria andDerateMoneyLessThan(BigDecimal value) {
            addCriterion("temp_purchase_arrival.derate_money <", value, "derateMoney");
            return (Criteria) this;
        }

        public Criteria andDerateMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_purchase_arrival.derate_money <=", value, "derateMoney");
            return (Criteria) this;
        }

        public Criteria andDerateMoneyIn(List<BigDecimal> values) {
            addCriterion("temp_purchase_arrival.derate_money in", values, "derateMoney");
            return (Criteria) this;
        }

        public Criteria andDerateMoneyNotIn(List<BigDecimal> values) {
            addCriterion("temp_purchase_arrival.derate_money not in", values, "derateMoney");
            return (Criteria) this;
        }

        public Criteria andDerateMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_purchase_arrival.derate_money between", value1, value2, "derateMoney");
            return (Criteria) this;
        }

        public Criteria andDerateMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_purchase_arrival.derate_money not between", value1, value2, "derateMoney");
            return (Criteria) this;
        }

        public Criteria andArrivalDateIsNull() {
            addCriterion("temp_purchase_arrival.arrival_date is null");
            return (Criteria) this;
        }

        public Criteria andArrivalDateIsNotNull() {
            addCriterion("temp_purchase_arrival.arrival_date is not null");
            return (Criteria) this;
        }

        public Criteria andArrivalDateEqualTo(Date value) {
            addCriterion("temp_purchase_arrival.arrival_date =", value, "arrivalDate");
            return (Criteria) this;
        }

        public Criteria andArrivalDateNotEqualTo(Date value) {
            addCriterion("temp_purchase_arrival.arrival_date <>", value, "arrivalDate");
            return (Criteria) this;
        }

        public Criteria andArrivalDateGreaterThan(Date value) {
            addCriterion("temp_purchase_arrival.arrival_date >", value, "arrivalDate");
            return (Criteria) this;
        }

        public Criteria andArrivalDateGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_purchase_arrival.arrival_date >=", value, "arrivalDate");
            return (Criteria) this;
        }

        public Criteria andArrivalDateLessThan(Date value) {
            addCriterion("temp_purchase_arrival.arrival_date <", value, "arrivalDate");
            return (Criteria) this;
        }

        public Criteria andArrivalDateLessThanOrEqualTo(Date value) {
            addCriterion("temp_purchase_arrival.arrival_date <=", value, "arrivalDate");
            return (Criteria) this;
        }

        public Criteria andArrivalDateIn(List<Date> values) {
            addCriterion("temp_purchase_arrival.arrival_date in", values, "arrivalDate");
            return (Criteria) this;
        }

        public Criteria andArrivalDateNotIn(List<Date> values) {
            addCriterion("temp_purchase_arrival.arrival_date not in", values, "arrivalDate");
            return (Criteria) this;
        }

        public Criteria andArrivalDateBetween(Date value1, Date value2) {
            addCriterion("temp_purchase_arrival.arrival_date between", value1, value2, "arrivalDate");
            return (Criteria) this;
        }

        public Criteria andArrivalDateNotBetween(Date value1, Date value2) {
            addCriterion("temp_purchase_arrival.arrival_date not between", value1, value2, "arrivalDate");
            return (Criteria) this;
        }

        public Criteria andAcceptorIsNull() {
            addCriterion("temp_purchase_arrival.acceptor is null");
            return (Criteria) this;
        }

        public Criteria andAcceptorIsNotNull() {
            addCriterion("temp_purchase_arrival.acceptor is not null");
            return (Criteria) this;
        }

        public Criteria andAcceptorEqualTo(String value) {
            addCriterion("temp_purchase_arrival.acceptor =", value, "acceptor");
            return (Criteria) this;
        }

        public Criteria andAcceptorNotEqualTo(String value) {
            addCriterion("temp_purchase_arrival.acceptor <>", value, "acceptor");
            return (Criteria) this;
        }

        public Criteria andAcceptorGreaterThan(String value) {
            addCriterion("temp_purchase_arrival.acceptor >", value, "acceptor");
            return (Criteria) this;
        }

        public Criteria andAcceptorGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_arrival.acceptor >=", value, "acceptor");
            return (Criteria) this;
        }

        public Criteria andAcceptorLessThan(String value) {
            addCriterion("temp_purchase_arrival.acceptor <", value, "acceptor");
            return (Criteria) this;
        }

        public Criteria andAcceptorLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_arrival.acceptor <=", value, "acceptor");
            return (Criteria) this;
        }

        public Criteria andAcceptorLike(String value) {
            addCriterion("temp_purchase_arrival.acceptor like", value, "acceptor");
            return (Criteria) this;
        }

        public Criteria andAcceptorNotLike(String value) {
            addCriterion("temp_purchase_arrival.acceptor not like", value, "acceptor");
            return (Criteria) this;
        }

        public Criteria andAcceptorIn(List<String> values) {
            addCriterion("temp_purchase_arrival.acceptor in", values, "acceptor");
            return (Criteria) this;
        }

        public Criteria andAcceptorNotIn(List<String> values) {
            addCriterion("temp_purchase_arrival.acceptor not in", values, "acceptor");
            return (Criteria) this;
        }

        public Criteria andAcceptorBetween(String value1, String value2) {
            addCriterion("temp_purchase_arrival.acceptor between", value1, value2, "acceptor");
            return (Criteria) this;
        }

        public Criteria andAcceptorNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_arrival.acceptor not between", value1, value2, "acceptor");
            return (Criteria) this;
        }

        public Criteria andAccessoryIsNull() {
            addCriterion("temp_purchase_arrival.accessory is null");
            return (Criteria) this;
        }

        public Criteria andAccessoryIsNotNull() {
            addCriterion("temp_purchase_arrival.accessory is not null");
            return (Criteria) this;
        }

        public Criteria andAccessoryEqualTo(String value) {
            addCriterion("temp_purchase_arrival.accessory =", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryNotEqualTo(String value) {
            addCriterion("temp_purchase_arrival.accessory <>", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryGreaterThan(String value) {
            addCriterion("temp_purchase_arrival.accessory >", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_arrival.accessory >=", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryLessThan(String value) {
            addCriterion("temp_purchase_arrival.accessory <", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_arrival.accessory <=", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryLike(String value) {
            addCriterion("temp_purchase_arrival.accessory like", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryNotLike(String value) {
            addCriterion("temp_purchase_arrival.accessory not like", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryIn(List<String> values) {
            addCriterion("temp_purchase_arrival.accessory in", values, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryNotIn(List<String> values) {
            addCriterion("temp_purchase_arrival.accessory not in", values, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryBetween(String value1, String value2) {
            addCriterion("temp_purchase_arrival.accessory between", value1, value2, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_arrival.accessory not between", value1, value2, "accessory");
            return (Criteria) this;
        }

        public Criteria andNotPayAmoIsNull() {
            addCriterion("temp_purchase_arrival.not_pay_amo is null");
            return (Criteria) this;
        }

        public Criteria andNotPayAmoIsNotNull() {
            addCriterion("temp_purchase_arrival.not_pay_amo is not null");
            return (Criteria) this;
        }

        public Criteria andNotPayAmoEqualTo(BigDecimal value) {
            addCriterion("temp_purchase_arrival.not_pay_amo =", value, "notPayAmo");
            return (Criteria) this;
        }

        public Criteria andNotPayAmoNotEqualTo(BigDecimal value) {
            addCriterion("temp_purchase_arrival.not_pay_amo <>", value, "notPayAmo");
            return (Criteria) this;
        }

        public Criteria andNotPayAmoGreaterThan(BigDecimal value) {
            addCriterion("temp_purchase_arrival.not_pay_amo >", value, "notPayAmo");
            return (Criteria) this;
        }

        public Criteria andNotPayAmoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_purchase_arrival.not_pay_amo >=", value, "notPayAmo");
            return (Criteria) this;
        }

        public Criteria andNotPayAmoLessThan(BigDecimal value) {
            addCriterion("temp_purchase_arrival.not_pay_amo <", value, "notPayAmo");
            return (Criteria) this;
        }

        public Criteria andNotPayAmoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_purchase_arrival.not_pay_amo <=", value, "notPayAmo");
            return (Criteria) this;
        }

        public Criteria andNotPayAmoIn(List<BigDecimal> values) {
            addCriterion("temp_purchase_arrival.not_pay_amo in", values, "notPayAmo");
            return (Criteria) this;
        }

        public Criteria andNotPayAmoNotIn(List<BigDecimal> values) {
            addCriterion("temp_purchase_arrival.not_pay_amo not in", values, "notPayAmo");
            return (Criteria) this;
        }

        public Criteria andNotPayAmoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_purchase_arrival.not_pay_amo between", value1, value2, "notPayAmo");
            return (Criteria) this;
        }

        public Criteria andNotPayAmoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_purchase_arrival.not_pay_amo not between", value1, value2, "notPayAmo");
            return (Criteria) this;
        }

        public Criteria andAlrPayAmoIsNull() {
            addCriterion("temp_purchase_arrival.alr_pay_amo is null");
            return (Criteria) this;
        }

        public Criteria andAlrPayAmoIsNotNull() {
            addCriterion("temp_purchase_arrival.alr_pay_amo is not null");
            return (Criteria) this;
        }

        public Criteria andAlrPayAmoEqualTo(BigDecimal value) {
            addCriterion("temp_purchase_arrival.alr_pay_amo =", value, "alrPayAmo");
            return (Criteria) this;
        }

        public Criteria andAlrPayAmoNotEqualTo(BigDecimal value) {
            addCriterion("temp_purchase_arrival.alr_pay_amo <>", value, "alrPayAmo");
            return (Criteria) this;
        }

        public Criteria andAlrPayAmoGreaterThan(BigDecimal value) {
            addCriterion("temp_purchase_arrival.alr_pay_amo >", value, "alrPayAmo");
            return (Criteria) this;
        }

        public Criteria andAlrPayAmoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_purchase_arrival.alr_pay_amo >=", value, "alrPayAmo");
            return (Criteria) this;
        }

        public Criteria andAlrPayAmoLessThan(BigDecimal value) {
            addCriterion("temp_purchase_arrival.alr_pay_amo <", value, "alrPayAmo");
            return (Criteria) this;
        }

        public Criteria andAlrPayAmoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_purchase_arrival.alr_pay_amo <=", value, "alrPayAmo");
            return (Criteria) this;
        }

        public Criteria andAlrPayAmoIn(List<BigDecimal> values) {
            addCriterion("temp_purchase_arrival.alr_pay_amo in", values, "alrPayAmo");
            return (Criteria) this;
        }

        public Criteria andAlrPayAmoNotIn(List<BigDecimal> values) {
            addCriterion("temp_purchase_arrival.alr_pay_amo not in", values, "alrPayAmo");
            return (Criteria) this;
        }

        public Criteria andAlrPayAmoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_purchase_arrival.alr_pay_amo between", value1, value2, "alrPayAmo");
            return (Criteria) this;
        }

        public Criteria andAlrPayAmoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_purchase_arrival.alr_pay_amo not between", value1, value2, "alrPayAmo");
            return (Criteria) this;
        }

        public Criteria andInvStateIsNull() {
            addCriterion("temp_purchase_arrival.inv_state is null");
            return (Criteria) this;
        }

        public Criteria andInvStateIsNotNull() {
            addCriterion("temp_purchase_arrival.inv_state is not null");
            return (Criteria) this;
        }

        public Criteria andInvStateEqualTo(String value) {
            addCriterion("temp_purchase_arrival.inv_state =", value, "invState");
            return (Criteria) this;
        }

        public Criteria andInvStateNotEqualTo(String value) {
            addCriterion("temp_purchase_arrival.inv_state <>", value, "invState");
            return (Criteria) this;
        }

        public Criteria andInvStateGreaterThan(String value) {
            addCriterion("temp_purchase_arrival.inv_state >", value, "invState");
            return (Criteria) this;
        }

        public Criteria andInvStateGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_arrival.inv_state >=", value, "invState");
            return (Criteria) this;
        }

        public Criteria andInvStateLessThan(String value) {
            addCriterion("temp_purchase_arrival.inv_state <", value, "invState");
            return (Criteria) this;
        }

        public Criteria andInvStateLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_arrival.inv_state <=", value, "invState");
            return (Criteria) this;
        }

        public Criteria andInvStateLike(String value) {
            addCriterion("temp_purchase_arrival.inv_state like", value, "invState");
            return (Criteria) this;
        }

        public Criteria andInvStateNotLike(String value) {
            addCriterion("temp_purchase_arrival.inv_state not like", value, "invState");
            return (Criteria) this;
        }

        public Criteria andInvStateIn(List<String> values) {
            addCriterion("temp_purchase_arrival.inv_state in", values, "invState");
            return (Criteria) this;
        }

        public Criteria andInvStateNotIn(List<String> values) {
            addCriterion("temp_purchase_arrival.inv_state not in", values, "invState");
            return (Criteria) this;
        }

        public Criteria andInvStateBetween(String value1, String value2) {
            addCriterion("temp_purchase_arrival.inv_state between", value1, value2, "invState");
            return (Criteria) this;
        }

        public Criteria andInvStateNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_arrival.inv_state not between", value1, value2, "invState");
            return (Criteria) this;
        }

        public Criteria andNotInvAmoIsNull() {
            addCriterion("temp_purchase_arrival.not_inv_amo is null");
            return (Criteria) this;
        }

        public Criteria andNotInvAmoIsNotNull() {
            addCriterion("temp_purchase_arrival.not_inv_amo is not null");
            return (Criteria) this;
        }

        public Criteria andNotInvAmoEqualTo(BigDecimal value) {
            addCriterion("temp_purchase_arrival.not_inv_amo =", value, "notInvAmo");
            return (Criteria) this;
        }

        public Criteria andNotInvAmoNotEqualTo(BigDecimal value) {
            addCriterion("temp_purchase_arrival.not_inv_amo <>", value, "notInvAmo");
            return (Criteria) this;
        }

        public Criteria andNotInvAmoGreaterThan(BigDecimal value) {
            addCriterion("temp_purchase_arrival.not_inv_amo >", value, "notInvAmo");
            return (Criteria) this;
        }

        public Criteria andNotInvAmoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_purchase_arrival.not_inv_amo >=", value, "notInvAmo");
            return (Criteria) this;
        }

        public Criteria andNotInvAmoLessThan(BigDecimal value) {
            addCriterion("temp_purchase_arrival.not_inv_amo <", value, "notInvAmo");
            return (Criteria) this;
        }

        public Criteria andNotInvAmoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_purchase_arrival.not_inv_amo <=", value, "notInvAmo");
            return (Criteria) this;
        }

        public Criteria andNotInvAmoIn(List<BigDecimal> values) {
            addCriterion("temp_purchase_arrival.not_inv_amo in", values, "notInvAmo");
            return (Criteria) this;
        }

        public Criteria andNotInvAmoNotIn(List<BigDecimal> values) {
            addCriterion("temp_purchase_arrival.not_inv_amo not in", values, "notInvAmo");
            return (Criteria) this;
        }

        public Criteria andNotInvAmoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_purchase_arrival.not_inv_amo between", value1, value2, "notInvAmo");
            return (Criteria) this;
        }

        public Criteria andNotInvAmoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_purchase_arrival.not_inv_amo not between", value1, value2, "notInvAmo");
            return (Criteria) this;
        }

        public Criteria andAlrInvAmoIsNull() {
            addCriterion("temp_purchase_arrival.alr_inv_amo is null");
            return (Criteria) this;
        }

        public Criteria andAlrInvAmoIsNotNull() {
            addCriterion("temp_purchase_arrival.alr_inv_amo is not null");
            return (Criteria) this;
        }

        public Criteria andAlrInvAmoEqualTo(BigDecimal value) {
            addCriterion("temp_purchase_arrival.alr_inv_amo =", value, "alrInvAmo");
            return (Criteria) this;
        }

        public Criteria andAlrInvAmoNotEqualTo(BigDecimal value) {
            addCriterion("temp_purchase_arrival.alr_inv_amo <>", value, "alrInvAmo");
            return (Criteria) this;
        }

        public Criteria andAlrInvAmoGreaterThan(BigDecimal value) {
            addCriterion("temp_purchase_arrival.alr_inv_amo >", value, "alrInvAmo");
            return (Criteria) this;
        }

        public Criteria andAlrInvAmoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_purchase_arrival.alr_inv_amo >=", value, "alrInvAmo");
            return (Criteria) this;
        }

        public Criteria andAlrInvAmoLessThan(BigDecimal value) {
            addCriterion("temp_purchase_arrival.alr_inv_amo <", value, "alrInvAmo");
            return (Criteria) this;
        }

        public Criteria andAlrInvAmoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_purchase_arrival.alr_inv_amo <=", value, "alrInvAmo");
            return (Criteria) this;
        }

        public Criteria andAlrInvAmoIn(List<BigDecimal> values) {
            addCriterion("temp_purchase_arrival.alr_inv_amo in", values, "alrInvAmo");
            return (Criteria) this;
        }

        public Criteria andAlrInvAmoNotIn(List<BigDecimal> values) {
            addCriterion("temp_purchase_arrival.alr_inv_amo not in", values, "alrInvAmo");
            return (Criteria) this;
        }

        public Criteria andAlrInvAmoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_purchase_arrival.alr_inv_amo between", value1, value2, "alrInvAmo");
            return (Criteria) this;
        }

        public Criteria andAlrInvAmoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_purchase_arrival.alr_inv_amo not between", value1, value2, "alrInvAmo");
            return (Criteria) this;
        }

        public Criteria andReturnStateIsNull() {
            addCriterion("temp_purchase_arrival.return_state is null");
            return (Criteria) this;
        }

        public Criteria andReturnStateIsNotNull() {
            addCriterion("temp_purchase_arrival.return_state is not null");
            return (Criteria) this;
        }

        public Criteria andReturnStateEqualTo(String value) {
            addCriterion("temp_purchase_arrival.return_state =", value, "returnState");
            return (Criteria) this;
        }

        public Criteria andReturnStateNotEqualTo(String value) {
            addCriterion("temp_purchase_arrival.return_state <>", value, "returnState");
            return (Criteria) this;
        }

        public Criteria andReturnStateGreaterThan(String value) {
            addCriterion("temp_purchase_arrival.return_state >", value, "returnState");
            return (Criteria) this;
        }

        public Criteria andReturnStateGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_arrival.return_state >=", value, "returnState");
            return (Criteria) this;
        }

        public Criteria andReturnStateLessThan(String value) {
            addCriterion("temp_purchase_arrival.return_state <", value, "returnState");
            return (Criteria) this;
        }

        public Criteria andReturnStateLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_arrival.return_state <=", value, "returnState");
            return (Criteria) this;
        }

        public Criteria andReturnStateLike(String value) {
            addCriterion("temp_purchase_arrival.return_state like", value, "returnState");
            return (Criteria) this;
        }

        public Criteria andReturnStateNotLike(String value) {
            addCriterion("temp_purchase_arrival.return_state not like", value, "returnState");
            return (Criteria) this;
        }

        public Criteria andReturnStateIn(List<String> values) {
            addCriterion("temp_purchase_arrival.return_state in", values, "returnState");
            return (Criteria) this;
        }

        public Criteria andReturnStateNotIn(List<String> values) {
            addCriterion("temp_purchase_arrival.return_state not in", values, "returnState");
            return (Criteria) this;
        }

        public Criteria andReturnStateBetween(String value1, String value2) {
            addCriterion("temp_purchase_arrival.return_state between", value1, value2, "returnState");
            return (Criteria) this;
        }

        public Criteria andReturnStateNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_arrival.return_state not between", value1, value2, "returnState");
            return (Criteria) this;
        }

        public Criteria andNotReturnAmoIsNull() {
            addCriterion("temp_purchase_arrival.not_return_amo is null");
            return (Criteria) this;
        }

        public Criteria andNotReturnAmoIsNotNull() {
            addCriterion("temp_purchase_arrival.not_return_amo is not null");
            return (Criteria) this;
        }

        public Criteria andNotReturnAmoEqualTo(BigDecimal value) {
            addCriterion("temp_purchase_arrival.not_return_amo =", value, "notReturnAmo");
            return (Criteria) this;
        }

        public Criteria andNotReturnAmoNotEqualTo(BigDecimal value) {
            addCriterion("temp_purchase_arrival.not_return_amo <>", value, "notReturnAmo");
            return (Criteria) this;
        }

        public Criteria andNotReturnAmoGreaterThan(BigDecimal value) {
            addCriterion("temp_purchase_arrival.not_return_amo >", value, "notReturnAmo");
            return (Criteria) this;
        }

        public Criteria andNotReturnAmoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_purchase_arrival.not_return_amo >=", value, "notReturnAmo");
            return (Criteria) this;
        }

        public Criteria andNotReturnAmoLessThan(BigDecimal value) {
            addCriterion("temp_purchase_arrival.not_return_amo <", value, "notReturnAmo");
            return (Criteria) this;
        }

        public Criteria andNotReturnAmoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_purchase_arrival.not_return_amo <=", value, "notReturnAmo");
            return (Criteria) this;
        }

        public Criteria andNotReturnAmoIn(List<BigDecimal> values) {
            addCriterion("temp_purchase_arrival.not_return_amo in", values, "notReturnAmo");
            return (Criteria) this;
        }

        public Criteria andNotReturnAmoNotIn(List<BigDecimal> values) {
            addCriterion("temp_purchase_arrival.not_return_amo not in", values, "notReturnAmo");
            return (Criteria) this;
        }

        public Criteria andNotReturnAmoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_purchase_arrival.not_return_amo between", value1, value2, "notReturnAmo");
            return (Criteria) this;
        }

        public Criteria andNotReturnAmoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_purchase_arrival.not_return_amo not between", value1, value2, "notReturnAmo");
            return (Criteria) this;
        }

        public Criteria andAlrReturnAmoIsNull() {
            addCriterion("temp_purchase_arrival.alr_return_amo is null");
            return (Criteria) this;
        }

        public Criteria andAlrReturnAmoIsNotNull() {
            addCriterion("temp_purchase_arrival.alr_return_amo is not null");
            return (Criteria) this;
        }

        public Criteria andAlrReturnAmoEqualTo(BigDecimal value) {
            addCriterion("temp_purchase_arrival.alr_return_amo =", value, "alrReturnAmo");
            return (Criteria) this;
        }

        public Criteria andAlrReturnAmoNotEqualTo(BigDecimal value) {
            addCriterion("temp_purchase_arrival.alr_return_amo <>", value, "alrReturnAmo");
            return (Criteria) this;
        }

        public Criteria andAlrReturnAmoGreaterThan(BigDecimal value) {
            addCriterion("temp_purchase_arrival.alr_return_amo >", value, "alrReturnAmo");
            return (Criteria) this;
        }

        public Criteria andAlrReturnAmoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_purchase_arrival.alr_return_amo >=", value, "alrReturnAmo");
            return (Criteria) this;
        }

        public Criteria andAlrReturnAmoLessThan(BigDecimal value) {
            addCriterion("temp_purchase_arrival.alr_return_amo <", value, "alrReturnAmo");
            return (Criteria) this;
        }

        public Criteria andAlrReturnAmoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_purchase_arrival.alr_return_amo <=", value, "alrReturnAmo");
            return (Criteria) this;
        }

        public Criteria andAlrReturnAmoIn(List<BigDecimal> values) {
            addCriterion("temp_purchase_arrival.alr_return_amo in", values, "alrReturnAmo");
            return (Criteria) this;
        }

        public Criteria andAlrReturnAmoNotIn(List<BigDecimal> values) {
            addCriterion("temp_purchase_arrival.alr_return_amo not in", values, "alrReturnAmo");
            return (Criteria) this;
        }

        public Criteria andAlrReturnAmoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_purchase_arrival.alr_return_amo between", value1, value2, "alrReturnAmo");
            return (Criteria) this;
        }

        public Criteria andAlrReturnAmoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_purchase_arrival.alr_return_amo not between", value1, value2, "alrReturnAmo");
            return (Criteria) this;
        }

        public Criteria andPayStateIsNull() {
            addCriterion("temp_purchase_arrival.pay_state is null");
            return (Criteria) this;
        }

        public Criteria andPayStateIsNotNull() {
            addCriterion("temp_purchase_arrival.pay_state is not null");
            return (Criteria) this;
        }

        public Criteria andPayStateEqualTo(String value) {
            addCriterion("temp_purchase_arrival.pay_state =", value, "payState");
            return (Criteria) this;
        }

        public Criteria andPayStateNotEqualTo(String value) {
            addCriterion("temp_purchase_arrival.pay_state <>", value, "payState");
            return (Criteria) this;
        }

        public Criteria andPayStateGreaterThan(String value) {
            addCriterion("temp_purchase_arrival.pay_state >", value, "payState");
            return (Criteria) this;
        }

        public Criteria andPayStateGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_arrival.pay_state >=", value, "payState");
            return (Criteria) this;
        }

        public Criteria andPayStateLessThan(String value) {
            addCriterion("temp_purchase_arrival.pay_state <", value, "payState");
            return (Criteria) this;
        }

        public Criteria andPayStateLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_arrival.pay_state <=", value, "payState");
            return (Criteria) this;
        }

        public Criteria andPayStateLike(String value) {
            addCriterion("temp_purchase_arrival.pay_state like", value, "payState");
            return (Criteria) this;
        }

        public Criteria andPayStateNotLike(String value) {
            addCriterion("temp_purchase_arrival.pay_state not like", value, "payState");
            return (Criteria) this;
        }

        public Criteria andPayStateIn(List<String> values) {
            addCriterion("temp_purchase_arrival.pay_state in", values, "payState");
            return (Criteria) this;
        }

        public Criteria andPayStateNotIn(List<String> values) {
            addCriterion("temp_purchase_arrival.pay_state not in", values, "payState");
            return (Criteria) this;
        }

        public Criteria andPayStateBetween(String value1, String value2) {
            addCriterion("temp_purchase_arrival.pay_state between", value1, value2, "payState");
            return (Criteria) this;
        }

        public Criteria andPayStateNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_arrival.pay_state not between", value1, value2, "payState");
            return (Criteria) this;
        }

        public Criteria andAuditStateIsNull() {
            addCriterion("temp_purchase_arrival.audit_state is null");
            return (Criteria) this;
        }

        public Criteria andAuditStateIsNotNull() {
            addCriterion("temp_purchase_arrival.audit_state is not null");
            return (Criteria) this;
        }

        public Criteria andAuditStateEqualTo(String value) {
            addCriterion("temp_purchase_arrival.audit_state =", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateNotEqualTo(String value) {
            addCriterion("temp_purchase_arrival.audit_state <>", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateGreaterThan(String value) {
            addCriterion("temp_purchase_arrival.audit_state >", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_arrival.audit_state >=", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateLessThan(String value) {
            addCriterion("temp_purchase_arrival.audit_state <", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_arrival.audit_state <=", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateLike(String value) {
            addCriterion("temp_purchase_arrival.audit_state like", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateNotLike(String value) {
            addCriterion("temp_purchase_arrival.audit_state not like", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateIn(List<String> values) {
            addCriterion("temp_purchase_arrival.audit_state in", values, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateNotIn(List<String> values) {
            addCriterion("temp_purchase_arrival.audit_state not in", values, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateBetween(String value1, String value2) {
            addCriterion("temp_purchase_arrival.audit_state between", value1, value2, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_arrival.audit_state not between", value1, value2, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditorIsNull() {
            addCriterion("temp_purchase_arrival.auditor is null");
            return (Criteria) this;
        }

        public Criteria andAuditorIsNotNull() {
            addCriterion("temp_purchase_arrival.auditor is not null");
            return (Criteria) this;
        }

        public Criteria andAuditorEqualTo(String value) {
            addCriterion("temp_purchase_arrival.auditor =", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotEqualTo(String value) {
            addCriterion("temp_purchase_arrival.auditor <>", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorGreaterThan(String value) {
            addCriterion("temp_purchase_arrival.auditor >", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_arrival.auditor >=", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorLessThan(String value) {
            addCriterion("temp_purchase_arrival.auditor <", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_arrival.auditor <=", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorLike(String value) {
            addCriterion("temp_purchase_arrival.auditor like", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotLike(String value) {
            addCriterion("temp_purchase_arrival.auditor not like", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorIn(List<String> values) {
            addCriterion("temp_purchase_arrival.auditor in", values, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotIn(List<String> values) {
            addCriterion("temp_purchase_arrival.auditor not in", values, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorBetween(String value1, String value2) {
            addCriterion("temp_purchase_arrival.auditor between", value1, value2, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_arrival.auditor not between", value1, value2, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditDateIsNull() {
            addCriterion("temp_purchase_arrival.audit_date is null");
            return (Criteria) this;
        }

        public Criteria andAuditDateIsNotNull() {
            addCriterion("temp_purchase_arrival.audit_date is not null");
            return (Criteria) this;
        }

        public Criteria andAuditDateEqualTo(Date value) {
            addCriterion("temp_purchase_arrival.audit_date =", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateNotEqualTo(Date value) {
            addCriterion("temp_purchase_arrival.audit_date <>", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateGreaterThan(Date value) {
            addCriterion("temp_purchase_arrival.audit_date >", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_purchase_arrival.audit_date >=", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateLessThan(Date value) {
            addCriterion("temp_purchase_arrival.audit_date <", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateLessThanOrEqualTo(Date value) {
            addCriterion("temp_purchase_arrival.audit_date <=", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateIn(List<Date> values) {
            addCriterion("temp_purchase_arrival.audit_date in", values, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateNotIn(List<Date> values) {
            addCriterion("temp_purchase_arrival.audit_date not in", values, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateBetween(Date value1, Date value2) {
            addCriterion("temp_purchase_arrival.audit_date between", value1, value2, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateNotBetween(Date value1, Date value2) {
            addCriterion("temp_purchase_arrival.audit_date not between", value1, value2, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkIsNull() {
            addCriterion("temp_purchase_arrival.audit_remark is null");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkIsNotNull() {
            addCriterion("temp_purchase_arrival.audit_remark is not null");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkEqualTo(String value) {
            addCriterion("temp_purchase_arrival.audit_remark =", value, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkNotEqualTo(String value) {
            addCriterion("temp_purchase_arrival.audit_remark <>", value, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkGreaterThan(String value) {
            addCriterion("temp_purchase_arrival.audit_remark >", value, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_arrival.audit_remark >=", value, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkLessThan(String value) {
            addCriterion("temp_purchase_arrival.audit_remark <", value, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_arrival.audit_remark <=", value, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkLike(String value) {
            addCriterion("temp_purchase_arrival.audit_remark like", value, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkNotLike(String value) {
            addCriterion("temp_purchase_arrival.audit_remark not like", value, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkIn(List<String> values) {
            addCriterion("temp_purchase_arrival.audit_remark in", values, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkNotIn(List<String> values) {
            addCriterion("temp_purchase_arrival.audit_remark not in", values, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkBetween(String value1, String value2) {
            addCriterion("temp_purchase_arrival.audit_remark between", value1, value2, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_arrival.audit_remark not between", value1, value2, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andEnabledIsNull() {
            addCriterion("temp_purchase_arrival.enabled is null");
            return (Criteria) this;
        }

        public Criteria andEnabledIsNotNull() {
            addCriterion("temp_purchase_arrival.enabled is not null");
            return (Criteria) this;
        }

        public Criteria andEnabledEqualTo(String value) {
            addCriterion("temp_purchase_arrival.enabled =", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotEqualTo(String value) {
            addCriterion("temp_purchase_arrival.enabled <>", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledGreaterThan(String value) {
            addCriterion("temp_purchase_arrival.enabled >", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_arrival.enabled >=", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledLessThan(String value) {
            addCriterion("temp_purchase_arrival.enabled <", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_arrival.enabled <=", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledLike(String value) {
            addCriterion("temp_purchase_arrival.enabled like", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotLike(String value) {
            addCriterion("temp_purchase_arrival.enabled not like", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledIn(List<String> values) {
            addCriterion("temp_purchase_arrival.enabled in", values, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotIn(List<String> values) {
            addCriterion("temp_purchase_arrival.enabled not in", values, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledBetween(String value1, String value2) {
            addCriterion("temp_purchase_arrival.enabled between", value1, value2, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_arrival.enabled not between", value1, value2, "enabled");
            return (Criteria) this;
        }

        public Criteria andOperatorsIsNull() {
            addCriterion("temp_purchase_arrival.operators is null");
            return (Criteria) this;
        }

        public Criteria andOperatorsIsNotNull() {
            addCriterion("temp_purchase_arrival.operators is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorsEqualTo(String value) {
            addCriterion("temp_purchase_arrival.operators =", value, "operators");
            return (Criteria) this;
        }

        public Criteria andOperatorsNotEqualTo(String value) {
            addCriterion("temp_purchase_arrival.operators <>", value, "operators");
            return (Criteria) this;
        }

        public Criteria andOperatorsGreaterThan(String value) {
            addCriterion("temp_purchase_arrival.operators >", value, "operators");
            return (Criteria) this;
        }

        public Criteria andOperatorsGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_arrival.operators >=", value, "operators");
            return (Criteria) this;
        }

        public Criteria andOperatorsLessThan(String value) {
            addCriterion("temp_purchase_arrival.operators <", value, "operators");
            return (Criteria) this;
        }

        public Criteria andOperatorsLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_arrival.operators <=", value, "operators");
            return (Criteria) this;
        }

        public Criteria andOperatorsLike(String value) {
            addCriterion("temp_purchase_arrival.operators like", value, "operators");
            return (Criteria) this;
        }

        public Criteria andOperatorsNotLike(String value) {
            addCriterion("temp_purchase_arrival.operators not like", value, "operators");
            return (Criteria) this;
        }

        public Criteria andOperatorsIn(List<String> values) {
            addCriterion("temp_purchase_arrival.operators in", values, "operators");
            return (Criteria) this;
        }

        public Criteria andOperatorsNotIn(List<String> values) {
            addCriterion("temp_purchase_arrival.operators not in", values, "operators");
            return (Criteria) this;
        }

        public Criteria andOperatorsBetween(String value1, String value2) {
            addCriterion("temp_purchase_arrival.operators between", value1, value2, "operators");
            return (Criteria) this;
        }

        public Criteria andOperatorsNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_arrival.operators not between", value1, value2, "operators");
            return (Criteria) this;
        }

        public Criteria andOperatorDepIsNull() {
            addCriterion("temp_purchase_arrival.operator_dep is null");
            return (Criteria) this;
        }

        public Criteria andOperatorDepIsNotNull() {
            addCriterion("temp_purchase_arrival.operator_dep is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorDepEqualTo(String value) {
            addCriterion("temp_purchase_arrival.operator_dep =", value, "operatorDep");
            return (Criteria) this;
        }

        public Criteria andOperatorDepNotEqualTo(String value) {
            addCriterion("temp_purchase_arrival.operator_dep <>", value, "operatorDep");
            return (Criteria) this;
        }

        public Criteria andOperatorDepGreaterThan(String value) {
            addCriterion("temp_purchase_arrival.operator_dep >", value, "operatorDep");
            return (Criteria) this;
        }

        public Criteria andOperatorDepGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_arrival.operator_dep >=", value, "operatorDep");
            return (Criteria) this;
        }

        public Criteria andOperatorDepLessThan(String value) {
            addCriterion("temp_purchase_arrival.operator_dep <", value, "operatorDep");
            return (Criteria) this;
        }

        public Criteria andOperatorDepLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_arrival.operator_dep <=", value, "operatorDep");
            return (Criteria) this;
        }

        public Criteria andOperatorDepLike(String value) {
            addCriterion("temp_purchase_arrival.operator_dep like", value, "operatorDep");
            return (Criteria) this;
        }

        public Criteria andOperatorDepNotLike(String value) {
            addCriterion("temp_purchase_arrival.operator_dep not like", value, "operatorDep");
            return (Criteria) this;
        }

        public Criteria andOperatorDepIn(List<String> values) {
            addCriterion("temp_purchase_arrival.operator_dep in", values, "operatorDep");
            return (Criteria) this;
        }

        public Criteria andOperatorDepNotIn(List<String> values) {
            addCriterion("temp_purchase_arrival.operator_dep not in", values, "operatorDep");
            return (Criteria) this;
        }

        public Criteria andOperatorDepBetween(String value1, String value2) {
            addCriterion("temp_purchase_arrival.operator_dep between", value1, value2, "operatorDep");
            return (Criteria) this;
        }

        public Criteria andOperatorDepNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_arrival.operator_dep not between", value1, value2, "operatorDep");
            return (Criteria) this;
        }

        public Criteria andConfirmorIsNull() {
            addCriterion("temp_purchase_arrival.confirmor is null");
            return (Criteria) this;
        }

        public Criteria andConfirmorIsNotNull() {
            addCriterion("temp_purchase_arrival.confirmor is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmorEqualTo(String value) {
            addCriterion("temp_purchase_arrival.confirmor =", value, "confirmor");
            return (Criteria) this;
        }

        public Criteria andConfirmorNotEqualTo(String value) {
            addCriterion("temp_purchase_arrival.confirmor <>", value, "confirmor");
            return (Criteria) this;
        }

        public Criteria andConfirmorGreaterThan(String value) {
            addCriterion("temp_purchase_arrival.confirmor >", value, "confirmor");
            return (Criteria) this;
        }

        public Criteria andConfirmorGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_arrival.confirmor >=", value, "confirmor");
            return (Criteria) this;
        }

        public Criteria andConfirmorLessThan(String value) {
            addCriterion("temp_purchase_arrival.confirmor <", value, "confirmor");
            return (Criteria) this;
        }

        public Criteria andConfirmorLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_arrival.confirmor <=", value, "confirmor");
            return (Criteria) this;
        }

        public Criteria andConfirmorLike(String value) {
            addCriterion("temp_purchase_arrival.confirmor like", value, "confirmor");
            return (Criteria) this;
        }

        public Criteria andConfirmorNotLike(String value) {
            addCriterion("temp_purchase_arrival.confirmor not like", value, "confirmor");
            return (Criteria) this;
        }

        public Criteria andConfirmorIn(List<String> values) {
            addCriterion("temp_purchase_arrival.confirmor in", values, "confirmor");
            return (Criteria) this;
        }

        public Criteria andConfirmorNotIn(List<String> values) {
            addCriterion("temp_purchase_arrival.confirmor not in", values, "confirmor");
            return (Criteria) this;
        }

        public Criteria andConfirmorBetween(String value1, String value2) {
            addCriterion("temp_purchase_arrival.confirmor between", value1, value2, "confirmor");
            return (Criteria) this;
        }

        public Criteria andConfirmorNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_arrival.confirmor not between", value1, value2, "confirmor");
            return (Criteria) this;
        }

        public Criteria andConfirmorDepartmentIsNull() {
            addCriterion("temp_purchase_arrival.confirmor_department is null");
            return (Criteria) this;
        }

        public Criteria andConfirmorDepartmentIsNotNull() {
            addCriterion("temp_purchase_arrival.confirmor_department is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmorDepartmentEqualTo(String value) {
            addCriterion("temp_purchase_arrival.confirmor_department =", value, "confirmorDepartment");
            return (Criteria) this;
        }

        public Criteria andConfirmorDepartmentNotEqualTo(String value) {
            addCriterion("temp_purchase_arrival.confirmor_department <>", value, "confirmorDepartment");
            return (Criteria) this;
        }

        public Criteria andConfirmorDepartmentGreaterThan(String value) {
            addCriterion("temp_purchase_arrival.confirmor_department >", value, "confirmorDepartment");
            return (Criteria) this;
        }

        public Criteria andConfirmorDepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_arrival.confirmor_department >=", value, "confirmorDepartment");
            return (Criteria) this;
        }

        public Criteria andConfirmorDepartmentLessThan(String value) {
            addCriterion("temp_purchase_arrival.confirmor_department <", value, "confirmorDepartment");
            return (Criteria) this;
        }

        public Criteria andConfirmorDepartmentLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_arrival.confirmor_department <=", value, "confirmorDepartment");
            return (Criteria) this;
        }

        public Criteria andConfirmorDepartmentLike(String value) {
            addCriterion("temp_purchase_arrival.confirmor_department like", value, "confirmorDepartment");
            return (Criteria) this;
        }

        public Criteria andConfirmorDepartmentNotLike(String value) {
            addCriterion("temp_purchase_arrival.confirmor_department not like", value, "confirmorDepartment");
            return (Criteria) this;
        }

        public Criteria andConfirmorDepartmentIn(List<String> values) {
            addCriterion("temp_purchase_arrival.confirmor_department in", values, "confirmorDepartment");
            return (Criteria) this;
        }

        public Criteria andConfirmorDepartmentNotIn(List<String> values) {
            addCriterion("temp_purchase_arrival.confirmor_department not in", values, "confirmorDepartment");
            return (Criteria) this;
        }

        public Criteria andConfirmorDepartmentBetween(String value1, String value2) {
            addCriterion("temp_purchase_arrival.confirmor_department between", value1, value2, "confirmorDepartment");
            return (Criteria) this;
        }

        public Criteria andConfirmorDepartmentNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_arrival.confirmor_department not between", value1, value2, "confirmorDepartment");
            return (Criteria) this;
        }

        public Criteria andConfirmorTimeIsNull() {
            addCriterion("temp_purchase_arrival.confirmor_time is null");
            return (Criteria) this;
        }

        public Criteria andConfirmorTimeIsNotNull() {
            addCriterion("temp_purchase_arrival.confirmor_time is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmorTimeEqualTo(Date value) {
            addCriterion("temp_purchase_arrival.confirmor_time =", value, "confirmorTime");
            return (Criteria) this;
        }

        public Criteria andConfirmorTimeNotEqualTo(Date value) {
            addCriterion("temp_purchase_arrival.confirmor_time <>", value, "confirmorTime");
            return (Criteria) this;
        }

        public Criteria andConfirmorTimeGreaterThan(Date value) {
            addCriterion("temp_purchase_arrival.confirmor_time >", value, "confirmorTime");
            return (Criteria) this;
        }

        public Criteria andConfirmorTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_purchase_arrival.confirmor_time >=", value, "confirmorTime");
            return (Criteria) this;
        }

        public Criteria andConfirmorTimeLessThan(Date value) {
            addCriterion("temp_purchase_arrival.confirmor_time <", value, "confirmorTime");
            return (Criteria) this;
        }

        public Criteria andConfirmorTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_purchase_arrival.confirmor_time <=", value, "confirmorTime");
            return (Criteria) this;
        }

        public Criteria andConfirmorTimeIn(List<Date> values) {
            addCriterion("temp_purchase_arrival.confirmor_time in", values, "confirmorTime");
            return (Criteria) this;
        }

        public Criteria andConfirmorTimeNotIn(List<Date> values) {
            addCriterion("temp_purchase_arrival.confirmor_time not in", values, "confirmorTime");
            return (Criteria) this;
        }

        public Criteria andConfirmorTimeBetween(Date value1, Date value2) {
            addCriterion("temp_purchase_arrival.confirmor_time between", value1, value2, "confirmorTime");
            return (Criteria) this;
        }

        public Criteria andConfirmorTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_purchase_arrival.confirmor_time not between", value1, value2, "confirmorTime");
            return (Criteria) this;
        }

        public Criteria andTailAfterStatusIsNull() {
            addCriterion("temp_purchase_arrival.tail_after_status is null");
            return (Criteria) this;
        }

        public Criteria andTailAfterStatusIsNotNull() {
            addCriterion("temp_purchase_arrival.tail_after_status is not null");
            return (Criteria) this;
        }

        public Criteria andTailAfterStatusEqualTo(String value) {
            addCriterion("temp_purchase_arrival.tail_after_status =", value, "tailAfterStatus");
            return (Criteria) this;
        }

        public Criteria andTailAfterStatusNotEqualTo(String value) {
            addCriterion("temp_purchase_arrival.tail_after_status <>", value, "tailAfterStatus");
            return (Criteria) this;
        }

        public Criteria andTailAfterStatusGreaterThan(String value) {
            addCriterion("temp_purchase_arrival.tail_after_status >", value, "tailAfterStatus");
            return (Criteria) this;
        }

        public Criteria andTailAfterStatusGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_arrival.tail_after_status >=", value, "tailAfterStatus");
            return (Criteria) this;
        }

        public Criteria andTailAfterStatusLessThan(String value) {
            addCriterion("temp_purchase_arrival.tail_after_status <", value, "tailAfterStatus");
            return (Criteria) this;
        }

        public Criteria andTailAfterStatusLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_arrival.tail_after_status <=", value, "tailAfterStatus");
            return (Criteria) this;
        }

        public Criteria andTailAfterStatusLike(String value) {
            addCriterion("temp_purchase_arrival.tail_after_status like", value, "tailAfterStatus");
            return (Criteria) this;
        }

        public Criteria andTailAfterStatusNotLike(String value) {
            addCriterion("temp_purchase_arrival.tail_after_status not like", value, "tailAfterStatus");
            return (Criteria) this;
        }

        public Criteria andTailAfterStatusIn(List<String> values) {
            addCriterion("temp_purchase_arrival.tail_after_status in", values, "tailAfterStatus");
            return (Criteria) this;
        }

        public Criteria andTailAfterStatusNotIn(List<String> values) {
            addCriterion("temp_purchase_arrival.tail_after_status not in", values, "tailAfterStatus");
            return (Criteria) this;
        }

        public Criteria andTailAfterStatusBetween(String value1, String value2) {
            addCriterion("temp_purchase_arrival.tail_after_status between", value1, value2, "tailAfterStatus");
            return (Criteria) this;
        }

        public Criteria andTailAfterStatusNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_arrival.tail_after_status not between", value1, value2, "tailAfterStatus");
            return (Criteria) this;
        }

        public Criteria andSummaryIsNull() {
            addCriterion("temp_purchase_arrival.summary is null");
            return (Criteria) this;
        }

        public Criteria andSummaryIsNotNull() {
            addCriterion("temp_purchase_arrival.summary is not null");
            return (Criteria) this;
        }

        public Criteria andSummaryEqualTo(String value) {
            addCriterion("temp_purchase_arrival.summary =", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryNotEqualTo(String value) {
            addCriterion("temp_purchase_arrival.summary <>", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryGreaterThan(String value) {
            addCriterion("temp_purchase_arrival.summary >", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_arrival.summary >=", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryLessThan(String value) {
            addCriterion("temp_purchase_arrival.summary <", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_arrival.summary <=", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryLike(String value) {
            addCriterion("temp_purchase_arrival.summary like", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryNotLike(String value) {
            addCriterion("temp_purchase_arrival.summary not like", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryIn(List<String> values) {
            addCriterion("temp_purchase_arrival.summary in", values, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryNotIn(List<String> values) {
            addCriterion("temp_purchase_arrival.summary not in", values, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryBetween(String value1, String value2) {
            addCriterion("temp_purchase_arrival.summary between", value1, value2, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_arrival.summary not between", value1, value2, "summary");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("temp_purchase_arrival.remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("temp_purchase_arrival.remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("temp_purchase_arrival.remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("temp_purchase_arrival.remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("temp_purchase_arrival.remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_arrival.remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("temp_purchase_arrival.remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_arrival.remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("temp_purchase_arrival.remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("temp_purchase_arrival.remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("temp_purchase_arrival.remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("temp_purchase_arrival.remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("temp_purchase_arrival.remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_arrival.remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNull() {
            addCriterion("temp_purchase_arrival.creater is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNotNull() {
            addCriterion("temp_purchase_arrival.creater is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterEqualTo(String value) {
            addCriterion("temp_purchase_arrival.creater =", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotEqualTo(String value) {
            addCriterion("temp_purchase_arrival.creater <>", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThan(String value) {
            addCriterion("temp_purchase_arrival.creater >", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_arrival.creater >=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThan(String value) {
            addCriterion("temp_purchase_arrival.creater <", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_arrival.creater <=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLike(String value) {
            addCriterion("temp_purchase_arrival.creater like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotLike(String value) {
            addCriterion("temp_purchase_arrival.creater not like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterIn(List<String> values) {
            addCriterion("temp_purchase_arrival.creater in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotIn(List<String> values) {
            addCriterion("temp_purchase_arrival.creater not in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterBetween(String value1, String value2) {
            addCriterion("temp_purchase_arrival.creater between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_arrival.creater not between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("temp_purchase_arrival.create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("temp_purchase_arrival.create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("temp_purchase_arrival.create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("temp_purchase_arrival.create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("temp_purchase_arrival.create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_purchase_arrival.create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("temp_purchase_arrival.create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_purchase_arrival.create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("temp_purchase_arrival.create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("temp_purchase_arrival.create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_purchase_arrival.create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_purchase_arrival.create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNull() {
            addCriterion("temp_purchase_arrival.updater is null");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNotNull() {
            addCriterion("temp_purchase_arrival.updater is not null");
            return (Criteria) this;
        }

        public Criteria andUpdaterEqualTo(String value) {
            addCriterion("temp_purchase_arrival.updater =", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotEqualTo(String value) {
            addCriterion("temp_purchase_arrival.updater <>", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThan(String value) {
            addCriterion("temp_purchase_arrival.updater >", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_arrival.updater >=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThan(String value) {
            addCriterion("temp_purchase_arrival.updater <", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_arrival.updater <=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLike(String value) {
            addCriterion("temp_purchase_arrival.updater like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotLike(String value) {
            addCriterion("temp_purchase_arrival.updater not like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterIn(List<String> values) {
            addCriterion("temp_purchase_arrival.updater in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotIn(List<String> values) {
            addCriterion("temp_purchase_arrival.updater not in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterBetween(String value1, String value2) {
            addCriterion("temp_purchase_arrival.updater between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_arrival.updater not between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("temp_purchase_arrival.update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("temp_purchase_arrival.update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("temp_purchase_arrival.update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("temp_purchase_arrival.update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("temp_purchase_arrival.update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_purchase_arrival.update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("temp_purchase_arrival.update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_purchase_arrival.update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("temp_purchase_arrival.update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("temp_purchase_arrival.update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_purchase_arrival.update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_purchase_arrival.update_time not between", value1, value2, "updateTime");
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
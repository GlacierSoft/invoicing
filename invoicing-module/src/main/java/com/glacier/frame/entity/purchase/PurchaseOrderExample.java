package com.glacier.frame.entity.purchase;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PurchaseOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public PurchaseOrderExample() {
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

        public Criteria andPurOrderIdIsNull() {
            addCriterion("temp_purchase_order.pur_order_id is null");
            return (Criteria) this;
        }

        public Criteria andPurOrderIdIsNotNull() {
            addCriterion("temp_purchase_order.pur_order_id is not null");
            return (Criteria) this;
        }

        public Criteria andPurOrderIdEqualTo(String value) {
            addCriterion("temp_purchase_order.pur_order_id =", value, "purOrderId");
            return (Criteria) this;
        }

        public Criteria andPurOrderIdNotEqualTo(String value) {
            addCriterion("temp_purchase_order.pur_order_id <>", value, "purOrderId");
            return (Criteria) this;
        }

        public Criteria andPurOrderIdGreaterThan(String value) {
            addCriterion("temp_purchase_order.pur_order_id >", value, "purOrderId");
            return (Criteria) this;
        }

        public Criteria andPurOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_order.pur_order_id >=", value, "purOrderId");
            return (Criteria) this;
        }

        public Criteria andPurOrderIdLessThan(String value) {
            addCriterion("temp_purchase_order.pur_order_id <", value, "purOrderId");
            return (Criteria) this;
        }

        public Criteria andPurOrderIdLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_order.pur_order_id <=", value, "purOrderId");
            return (Criteria) this;
        }

        public Criteria andPurOrderIdLike(String value) {
            addCriterion("temp_purchase_order.pur_order_id like", value, "purOrderId");
            return (Criteria) this;
        }

        public Criteria andPurOrderIdNotLike(String value) {
            addCriterion("temp_purchase_order.pur_order_id not like", value, "purOrderId");
            return (Criteria) this;
        }

        public Criteria andPurOrderIdIn(List<String> values) {
            addCriterion("temp_purchase_order.pur_order_id in", values, "purOrderId");
            return (Criteria) this;
        }

        public Criteria andPurOrderIdNotIn(List<String> values) {
            addCriterion("temp_purchase_order.pur_order_id not in", values, "purOrderId");
            return (Criteria) this;
        }

        public Criteria andPurOrderIdBetween(String value1, String value2) {
            addCriterion("temp_purchase_order.pur_order_id between", value1, value2, "purOrderId");
            return (Criteria) this;
        }

        public Criteria andPurOrderIdNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_order.pur_order_id not between", value1, value2, "purOrderId");
            return (Criteria) this;
        }

        public Criteria andOrderCodeIsNull() {
            addCriterion("temp_purchase_order.order_code is null");
            return (Criteria) this;
        }

        public Criteria andOrderCodeIsNotNull() {
            addCriterion("temp_purchase_order.order_code is not null");
            return (Criteria) this;
        }

        public Criteria andOrderCodeEqualTo(String value) {
            addCriterion("temp_purchase_order.order_code =", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeNotEqualTo(String value) {
            addCriterion("temp_purchase_order.order_code <>", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeGreaterThan(String value) {
            addCriterion("temp_purchase_order.order_code >", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_order.order_code >=", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeLessThan(String value) {
            addCriterion("temp_purchase_order.order_code <", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_order.order_code <=", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeLike(String value) {
            addCriterion("temp_purchase_order.order_code like", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeNotLike(String value) {
            addCriterion("temp_purchase_order.order_code not like", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeIn(List<String> values) {
            addCriterion("temp_purchase_order.order_code in", values, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeNotIn(List<String> values) {
            addCriterion("temp_purchase_order.order_code not in", values, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeBetween(String value1, String value2) {
            addCriterion("temp_purchase_order.order_code between", value1, value2, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_order.order_code not between", value1, value2, "orderCode");
            return (Criteria) this;
        }

        public Criteria andContractCodeIsNull() {
            addCriterion("temp_purchase_order.contract_code is null");
            return (Criteria) this;
        }

        public Criteria andContractCodeIsNotNull() {
            addCriterion("temp_purchase_order.contract_code is not null");
            return (Criteria) this;
        }

        public Criteria andContractCodeEqualTo(String value) {
            addCriterion("temp_purchase_order.contract_code =", value, "contractCode");
            return (Criteria) this;
        }

        public Criteria andContractCodeNotEqualTo(String value) {
            addCriterion("temp_purchase_order.contract_code <>", value, "contractCode");
            return (Criteria) this;
        }

        public Criteria andContractCodeGreaterThan(String value) {
            addCriterion("temp_purchase_order.contract_code >", value, "contractCode");
            return (Criteria) this;
        }

        public Criteria andContractCodeGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_order.contract_code >=", value, "contractCode");
            return (Criteria) this;
        }

        public Criteria andContractCodeLessThan(String value) {
            addCriterion("temp_purchase_order.contract_code <", value, "contractCode");
            return (Criteria) this;
        }

        public Criteria andContractCodeLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_order.contract_code <=", value, "contractCode");
            return (Criteria) this;
        }

        public Criteria andContractCodeLike(String value) {
            addCriterion("temp_purchase_order.contract_code like", value, "contractCode");
            return (Criteria) this;
        }

        public Criteria andContractCodeNotLike(String value) {
            addCriterion("temp_purchase_order.contract_code not like", value, "contractCode");
            return (Criteria) this;
        }

        public Criteria andContractCodeIn(List<String> values) {
            addCriterion("temp_purchase_order.contract_code in", values, "contractCode");
            return (Criteria) this;
        }

        public Criteria andContractCodeNotIn(List<String> values) {
            addCriterion("temp_purchase_order.contract_code not in", values, "contractCode");
            return (Criteria) this;
        }

        public Criteria andContractCodeBetween(String value1, String value2) {
            addCriterion("temp_purchase_order.contract_code between", value1, value2, "contractCode");
            return (Criteria) this;
        }

        public Criteria andContractCodeNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_order.contract_code not between", value1, value2, "contractCode");
            return (Criteria) this;
        }

        public Criteria andOrderStateIsNull() {
            addCriterion("temp_purchase_order.order_state is null");
            return (Criteria) this;
        }

        public Criteria andOrderStateIsNotNull() {
            addCriterion("temp_purchase_order.order_state is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStateEqualTo(String value) {
            addCriterion("temp_purchase_order.order_state =", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateNotEqualTo(String value) {
            addCriterion("temp_purchase_order.order_state <>", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateGreaterThan(String value) {
            addCriterion("temp_purchase_order.order_state >", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_order.order_state >=", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateLessThan(String value) {
            addCriterion("temp_purchase_order.order_state <", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_order.order_state <=", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateLike(String value) {
            addCriterion("temp_purchase_order.order_state like", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateNotLike(String value) {
            addCriterion("temp_purchase_order.order_state not like", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateIn(List<String> values) {
            addCriterion("temp_purchase_order.order_state in", values, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateNotIn(List<String> values) {
            addCriterion("temp_purchase_order.order_state not in", values, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateBetween(String value1, String value2) {
            addCriterion("temp_purchase_order.order_state between", value1, value2, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_order.order_state not between", value1, value2, "orderState");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeIdIsNull() {
            addCriterion("temp_purchase_order.purchase_type_id is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeIdIsNotNull() {
            addCriterion("temp_purchase_order.purchase_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeIdEqualTo(String value) {
            addCriterion("temp_purchase_order.purchase_type_id =", value, "purchaseTypeId");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeIdNotEqualTo(String value) {
            addCriterion("temp_purchase_order.purchase_type_id <>", value, "purchaseTypeId");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeIdGreaterThan(String value) {
            addCriterion("temp_purchase_order.purchase_type_id >", value, "purchaseTypeId");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_order.purchase_type_id >=", value, "purchaseTypeId");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeIdLessThan(String value) {
            addCriterion("temp_purchase_order.purchase_type_id <", value, "purchaseTypeId");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeIdLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_order.purchase_type_id <=", value, "purchaseTypeId");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeIdLike(String value) {
            addCriterion("temp_purchase_order.purchase_type_id like", value, "purchaseTypeId");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeIdNotLike(String value) {
            addCriterion("temp_purchase_order.purchase_type_id not like", value, "purchaseTypeId");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeIdIn(List<String> values) {
            addCriterion("temp_purchase_order.purchase_type_id in", values, "purchaseTypeId");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeIdNotIn(List<String> values) {
            addCriterion("temp_purchase_order.purchase_type_id not in", values, "purchaseTypeId");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeIdBetween(String value1, String value2) {
            addCriterion("temp_purchase_order.purchase_type_id between", value1, value2, "purchaseTypeId");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeIdNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_order.purchase_type_id not between", value1, value2, "purchaseTypeId");
            return (Criteria) this;
        }

        public Criteria andOrderDateIsNull() {
            addCriterion("temp_purchase_order.order_date is null");
            return (Criteria) this;
        }

        public Criteria andOrderDateIsNotNull() {
            addCriterion("temp_purchase_order.order_date is not null");
            return (Criteria) this;
        }

        public Criteria andOrderDateEqualTo(Date value) {
            addCriterion("temp_purchase_order.order_date =", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateNotEqualTo(Date value) {
            addCriterion("temp_purchase_order.order_date <>", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateGreaterThan(Date value) {
            addCriterion("temp_purchase_order.order_date >", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_purchase_order.order_date >=", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateLessThan(Date value) {
            addCriterion("temp_purchase_order.order_date <", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateLessThanOrEqualTo(Date value) {
            addCriterion("temp_purchase_order.order_date <=", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateIn(List<Date> values) {
            addCriterion("temp_purchase_order.order_date in", values, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateNotIn(List<Date> values) {
            addCriterion("temp_purchase_order.order_date not in", values, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateBetween(Date value1, Date value2) {
            addCriterion("temp_purchase_order.order_date between", value1, value2, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateNotBetween(Date value1, Date value2) {
            addCriterion("temp_purchase_order.order_date not between", value1, value2, "orderDate");
            return (Criteria) this;
        }

        public Criteria andStorageIsNull() {
            addCriterion("temp_purchase_order.storage is null");
            return (Criteria) this;
        }

        public Criteria andStorageIsNotNull() {
            addCriterion("temp_purchase_order.storage is not null");
            return (Criteria) this;
        }

        public Criteria andStorageEqualTo(String value) {
            addCriterion("temp_purchase_order.storage =", value, "storage");
            return (Criteria) this;
        }

        public Criteria andStorageNotEqualTo(String value) {
            addCriterion("temp_purchase_order.storage <>", value, "storage");
            return (Criteria) this;
        }

        public Criteria andStorageGreaterThan(String value) {
            addCriterion("temp_purchase_order.storage >", value, "storage");
            return (Criteria) this;
        }

        public Criteria andStorageGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_order.storage >=", value, "storage");
            return (Criteria) this;
        }

        public Criteria andStorageLessThan(String value) {
            addCriterion("temp_purchase_order.storage <", value, "storage");
            return (Criteria) this;
        }

        public Criteria andStorageLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_order.storage <=", value, "storage");
            return (Criteria) this;
        }

        public Criteria andStorageLike(String value) {
            addCriterion("temp_purchase_order.storage like", value, "storage");
            return (Criteria) this;
        }

        public Criteria andStorageNotLike(String value) {
            addCriterion("temp_purchase_order.storage not like", value, "storage");
            return (Criteria) this;
        }

        public Criteria andStorageIn(List<String> values) {
            addCriterion("temp_purchase_order.storage in", values, "storage");
            return (Criteria) this;
        }

        public Criteria andStorageNotIn(List<String> values) {
            addCriterion("temp_purchase_order.storage not in", values, "storage");
            return (Criteria) this;
        }

        public Criteria andStorageBetween(String value1, String value2) {
            addCriterion("temp_purchase_order.storage between", value1, value2, "storage");
            return (Criteria) this;
        }

        public Criteria andStorageNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_order.storage not between", value1, value2, "storage");
            return (Criteria) this;
        }

        public Criteria andSupplierCodeIsNull() {
            addCriterion("temp_purchase_order.supplier_code is null");
            return (Criteria) this;
        }

        public Criteria andSupplierCodeIsNotNull() {
            addCriterion("temp_purchase_order.supplier_code is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierCodeEqualTo(String value) {
            addCriterion("temp_purchase_order.supplier_code =", value, "supplierCode");
            return (Criteria) this;
        }

        public Criteria andSupplierCodeNotEqualTo(String value) {
            addCriterion("temp_purchase_order.supplier_code <>", value, "supplierCode");
            return (Criteria) this;
        }

        public Criteria andSupplierCodeGreaterThan(String value) {
            addCriterion("temp_purchase_order.supplier_code >", value, "supplierCode");
            return (Criteria) this;
        }

        public Criteria andSupplierCodeGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_order.supplier_code >=", value, "supplierCode");
            return (Criteria) this;
        }

        public Criteria andSupplierCodeLessThan(String value) {
            addCriterion("temp_purchase_order.supplier_code <", value, "supplierCode");
            return (Criteria) this;
        }

        public Criteria andSupplierCodeLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_order.supplier_code <=", value, "supplierCode");
            return (Criteria) this;
        }

        public Criteria andSupplierCodeLike(String value) {
            addCriterion("temp_purchase_order.supplier_code like", value, "supplierCode");
            return (Criteria) this;
        }

        public Criteria andSupplierCodeNotLike(String value) {
            addCriterion("temp_purchase_order.supplier_code not like", value, "supplierCode");
            return (Criteria) this;
        }

        public Criteria andSupplierCodeIn(List<String> values) {
            addCriterion("temp_purchase_order.supplier_code in", values, "supplierCode");
            return (Criteria) this;
        }

        public Criteria andSupplierCodeNotIn(List<String> values) {
            addCriterion("temp_purchase_order.supplier_code not in", values, "supplierCode");
            return (Criteria) this;
        }

        public Criteria andSupplierCodeBetween(String value1, String value2) {
            addCriterion("temp_purchase_order.supplier_code between", value1, value2, "supplierCode");
            return (Criteria) this;
        }

        public Criteria andSupplierCodeNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_order.supplier_code not between", value1, value2, "supplierCode");
            return (Criteria) this;
        }

        public Criteria andSupplierIdIsNull() {
            addCriterion("temp_purchase_order.supplier_id is null");
            return (Criteria) this;
        }

        public Criteria andSupplierIdIsNotNull() {
            addCriterion("temp_purchase_order.supplier_id is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierIdEqualTo(String value) {
            addCriterion("temp_purchase_order.supplier_id =", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotEqualTo(String value) {
            addCriterion("temp_purchase_order.supplier_id <>", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdGreaterThan(String value) {
            addCriterion("temp_purchase_order.supplier_id >", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_order.supplier_id >=", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdLessThan(String value) {
            addCriterion("temp_purchase_order.supplier_id <", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_order.supplier_id <=", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdLike(String value) {
            addCriterion("temp_purchase_order.supplier_id like", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotLike(String value) {
            addCriterion("temp_purchase_order.supplier_id not like", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdIn(List<String> values) {
            addCriterion("temp_purchase_order.supplier_id in", values, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotIn(List<String> values) {
            addCriterion("temp_purchase_order.supplier_id not in", values, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdBetween(String value1, String value2) {
            addCriterion("temp_purchase_order.supplier_id between", value1, value2, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_order.supplier_id not between", value1, value2, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierAddIsNull() {
            addCriterion("temp_purchase_order.supplier_add is null");
            return (Criteria) this;
        }

        public Criteria andSupplierAddIsNotNull() {
            addCriterion("temp_purchase_order.supplier_add is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierAddEqualTo(String value) {
            addCriterion("temp_purchase_order.supplier_add =", value, "supplierAdd");
            return (Criteria) this;
        }

        public Criteria andSupplierAddNotEqualTo(String value) {
            addCriterion("temp_purchase_order.supplier_add <>", value, "supplierAdd");
            return (Criteria) this;
        }

        public Criteria andSupplierAddGreaterThan(String value) {
            addCriterion("temp_purchase_order.supplier_add >", value, "supplierAdd");
            return (Criteria) this;
        }

        public Criteria andSupplierAddGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_order.supplier_add >=", value, "supplierAdd");
            return (Criteria) this;
        }

        public Criteria andSupplierAddLessThan(String value) {
            addCriterion("temp_purchase_order.supplier_add <", value, "supplierAdd");
            return (Criteria) this;
        }

        public Criteria andSupplierAddLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_order.supplier_add <=", value, "supplierAdd");
            return (Criteria) this;
        }

        public Criteria andSupplierAddLike(String value) {
            addCriterion("temp_purchase_order.supplier_add like", value, "supplierAdd");
            return (Criteria) this;
        }

        public Criteria andSupplierAddNotLike(String value) {
            addCriterion("temp_purchase_order.supplier_add not like", value, "supplierAdd");
            return (Criteria) this;
        }

        public Criteria andSupplierAddIn(List<String> values) {
            addCriterion("temp_purchase_order.supplier_add in", values, "supplierAdd");
            return (Criteria) this;
        }

        public Criteria andSupplierAddNotIn(List<String> values) {
            addCriterion("temp_purchase_order.supplier_add not in", values, "supplierAdd");
            return (Criteria) this;
        }

        public Criteria andSupplierAddBetween(String value1, String value2) {
            addCriterion("temp_purchase_order.supplier_add between", value1, value2, "supplierAdd");
            return (Criteria) this;
        }

        public Criteria andSupplierAddNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_order.supplier_add not between", value1, value2, "supplierAdd");
            return (Criteria) this;
        }

        public Criteria andLinkmanIsNull() {
            addCriterion("temp_purchase_order.linkman is null");
            return (Criteria) this;
        }

        public Criteria andLinkmanIsNotNull() {
            addCriterion("temp_purchase_order.linkman is not null");
            return (Criteria) this;
        }

        public Criteria andLinkmanEqualTo(String value) {
            addCriterion("temp_purchase_order.linkman =", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanNotEqualTo(String value) {
            addCriterion("temp_purchase_order.linkman <>", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanGreaterThan(String value) {
            addCriterion("temp_purchase_order.linkman >", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_order.linkman >=", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanLessThan(String value) {
            addCriterion("temp_purchase_order.linkman <", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_order.linkman <=", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanLike(String value) {
            addCriterion("temp_purchase_order.linkman like", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanNotLike(String value) {
            addCriterion("temp_purchase_order.linkman not like", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanIn(List<String> values) {
            addCriterion("temp_purchase_order.linkman in", values, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanNotIn(List<String> values) {
            addCriterion("temp_purchase_order.linkman not in", values, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanBetween(String value1, String value2) {
            addCriterion("temp_purchase_order.linkman between", value1, value2, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_order.linkman not between", value1, value2, "linkman");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("temp_purchase_order.phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("temp_purchase_order.phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("temp_purchase_order.phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("temp_purchase_order.phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("temp_purchase_order.phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_order.phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("temp_purchase_order.phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_order.phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("temp_purchase_order.phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("temp_purchase_order.phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("temp_purchase_order.phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("temp_purchase_order.phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("temp_purchase_order.phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_order.phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andFaxIsNull() {
            addCriterion("temp_purchase_order.fax is null");
            return (Criteria) this;
        }

        public Criteria andFaxIsNotNull() {
            addCriterion("temp_purchase_order.fax is not null");
            return (Criteria) this;
        }

        public Criteria andFaxEqualTo(String value) {
            addCriterion("temp_purchase_order.fax =", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotEqualTo(String value) {
            addCriterion("temp_purchase_order.fax <>", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxGreaterThan(String value) {
            addCriterion("temp_purchase_order.fax >", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_order.fax >=", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLessThan(String value) {
            addCriterion("temp_purchase_order.fax <", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_order.fax <=", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLike(String value) {
            addCriterion("temp_purchase_order.fax like", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotLike(String value) {
            addCriterion("temp_purchase_order.fax not like", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxIn(List<String> values) {
            addCriterion("temp_purchase_order.fax in", values, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotIn(List<String> values) {
            addCriterion("temp_purchase_order.fax not in", values, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxBetween(String value1, String value2) {
            addCriterion("temp_purchase_order.fax between", value1, value2, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_order.fax not between", value1, value2, "fax");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIdIsNull() {
            addCriterion("temp_purchase_order.payment_type_id is null");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIdIsNotNull() {
            addCriterion("temp_purchase_order.payment_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIdEqualTo(String value) {
            addCriterion("temp_purchase_order.payment_type_id =", value, "paymentTypeId");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIdNotEqualTo(String value) {
            addCriterion("temp_purchase_order.payment_type_id <>", value, "paymentTypeId");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIdGreaterThan(String value) {
            addCriterion("temp_purchase_order.payment_type_id >", value, "paymentTypeId");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_order.payment_type_id >=", value, "paymentTypeId");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIdLessThan(String value) {
            addCriterion("temp_purchase_order.payment_type_id <", value, "paymentTypeId");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIdLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_order.payment_type_id <=", value, "paymentTypeId");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIdLike(String value) {
            addCriterion("temp_purchase_order.payment_type_id like", value, "paymentTypeId");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIdNotLike(String value) {
            addCriterion("temp_purchase_order.payment_type_id not like", value, "paymentTypeId");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIdIn(List<String> values) {
            addCriterion("temp_purchase_order.payment_type_id in", values, "paymentTypeId");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIdNotIn(List<String> values) {
            addCriterion("temp_purchase_order.payment_type_id not in", values, "paymentTypeId");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIdBetween(String value1, String value2) {
            addCriterion("temp_purchase_order.payment_type_id between", value1, value2, "paymentTypeId");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIdNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_order.payment_type_id not between", value1, value2, "paymentTypeId");
            return (Criteria) this;
        }

        public Criteria andPaymentAgrIdIsNull() {
            addCriterion("temp_purchase_order.payment_agr_id is null");
            return (Criteria) this;
        }

        public Criteria andPaymentAgrIdIsNotNull() {
            addCriterion("temp_purchase_order.payment_agr_id is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentAgrIdEqualTo(String value) {
            addCriterion("temp_purchase_order.payment_agr_id =", value, "paymentAgrId");
            return (Criteria) this;
        }

        public Criteria andPaymentAgrIdNotEqualTo(String value) {
            addCriterion("temp_purchase_order.payment_agr_id <>", value, "paymentAgrId");
            return (Criteria) this;
        }

        public Criteria andPaymentAgrIdGreaterThan(String value) {
            addCriterion("temp_purchase_order.payment_agr_id >", value, "paymentAgrId");
            return (Criteria) this;
        }

        public Criteria andPaymentAgrIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_order.payment_agr_id >=", value, "paymentAgrId");
            return (Criteria) this;
        }

        public Criteria andPaymentAgrIdLessThan(String value) {
            addCriterion("temp_purchase_order.payment_agr_id <", value, "paymentAgrId");
            return (Criteria) this;
        }

        public Criteria andPaymentAgrIdLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_order.payment_agr_id <=", value, "paymentAgrId");
            return (Criteria) this;
        }

        public Criteria andPaymentAgrIdLike(String value) {
            addCriterion("temp_purchase_order.payment_agr_id like", value, "paymentAgrId");
            return (Criteria) this;
        }

        public Criteria andPaymentAgrIdNotLike(String value) {
            addCriterion("temp_purchase_order.payment_agr_id not like", value, "paymentAgrId");
            return (Criteria) this;
        }

        public Criteria andPaymentAgrIdIn(List<String> values) {
            addCriterion("temp_purchase_order.payment_agr_id in", values, "paymentAgrId");
            return (Criteria) this;
        }

        public Criteria andPaymentAgrIdNotIn(List<String> values) {
            addCriterion("temp_purchase_order.payment_agr_id not in", values, "paymentAgrId");
            return (Criteria) this;
        }

        public Criteria andPaymentAgrIdBetween(String value1, String value2) {
            addCriterion("temp_purchase_order.payment_agr_id between", value1, value2, "paymentAgrId");
            return (Criteria) this;
        }

        public Criteria andPaymentAgrIdNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_order.payment_agr_id not between", value1, value2, "paymentAgrId");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeIsNull() {
            addCriterion("temp_purchase_order.delivery_type is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeIsNotNull() {
            addCriterion("temp_purchase_order.delivery_type is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeEqualTo(String value) {
            addCriterion("temp_purchase_order.delivery_type =", value, "deliveryType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeNotEqualTo(String value) {
            addCriterion("temp_purchase_order.delivery_type <>", value, "deliveryType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeGreaterThan(String value) {
            addCriterion("temp_purchase_order.delivery_type >", value, "deliveryType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_order.delivery_type >=", value, "deliveryType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeLessThan(String value) {
            addCriterion("temp_purchase_order.delivery_type <", value, "deliveryType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_order.delivery_type <=", value, "deliveryType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeLike(String value) {
            addCriterion("temp_purchase_order.delivery_type like", value, "deliveryType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeNotLike(String value) {
            addCriterion("temp_purchase_order.delivery_type not like", value, "deliveryType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeIn(List<String> values) {
            addCriterion("temp_purchase_order.delivery_type in", values, "deliveryType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeNotIn(List<String> values) {
            addCriterion("temp_purchase_order.delivery_type not in", values, "deliveryType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeBetween(String value1, String value2) {
            addCriterion("temp_purchase_order.delivery_type between", value1, value2, "deliveryType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_order.delivery_type not between", value1, value2, "deliveryType");
            return (Criteria) this;
        }

        public Criteria andDeliveryDadlinesIsNull() {
            addCriterion("temp_purchase_order.delivery_dadlines is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryDadlinesIsNotNull() {
            addCriterion("temp_purchase_order.delivery_dadlines is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryDadlinesEqualTo(Date value) {
            addCriterion("temp_purchase_order.delivery_dadlines =", value, "deliveryDadlines");
            return (Criteria) this;
        }

        public Criteria andDeliveryDadlinesNotEqualTo(Date value) {
            addCriterion("temp_purchase_order.delivery_dadlines <>", value, "deliveryDadlines");
            return (Criteria) this;
        }

        public Criteria andDeliveryDadlinesGreaterThan(Date value) {
            addCriterion("temp_purchase_order.delivery_dadlines >", value, "deliveryDadlines");
            return (Criteria) this;
        }

        public Criteria andDeliveryDadlinesGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_purchase_order.delivery_dadlines >=", value, "deliveryDadlines");
            return (Criteria) this;
        }

        public Criteria andDeliveryDadlinesLessThan(Date value) {
            addCriterion("temp_purchase_order.delivery_dadlines <", value, "deliveryDadlines");
            return (Criteria) this;
        }

        public Criteria andDeliveryDadlinesLessThanOrEqualTo(Date value) {
            addCriterion("temp_purchase_order.delivery_dadlines <=", value, "deliveryDadlines");
            return (Criteria) this;
        }

        public Criteria andDeliveryDadlinesIn(List<Date> values) {
            addCriterion("temp_purchase_order.delivery_dadlines in", values, "deliveryDadlines");
            return (Criteria) this;
        }

        public Criteria andDeliveryDadlinesNotIn(List<Date> values) {
            addCriterion("temp_purchase_order.delivery_dadlines not in", values, "deliveryDadlines");
            return (Criteria) this;
        }

        public Criteria andDeliveryDadlinesBetween(Date value1, Date value2) {
            addCriterion("temp_purchase_order.delivery_dadlines between", value1, value2, "deliveryDadlines");
            return (Criteria) this;
        }

        public Criteria andDeliveryDadlinesNotBetween(Date value1, Date value2) {
            addCriterion("temp_purchase_order.delivery_dadlines not between", value1, value2, "deliveryDadlines");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddIsNull() {
            addCriterion("temp_purchase_order.delivery_add is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddIsNotNull() {
            addCriterion("temp_purchase_order.delivery_add is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddEqualTo(String value) {
            addCriterion("temp_purchase_order.delivery_add =", value, "deliveryAdd");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddNotEqualTo(String value) {
            addCriterion("temp_purchase_order.delivery_add <>", value, "deliveryAdd");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddGreaterThan(String value) {
            addCriterion("temp_purchase_order.delivery_add >", value, "deliveryAdd");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_order.delivery_add >=", value, "deliveryAdd");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddLessThan(String value) {
            addCriterion("temp_purchase_order.delivery_add <", value, "deliveryAdd");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_order.delivery_add <=", value, "deliveryAdd");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddLike(String value) {
            addCriterion("temp_purchase_order.delivery_add like", value, "deliveryAdd");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddNotLike(String value) {
            addCriterion("temp_purchase_order.delivery_add not like", value, "deliveryAdd");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddIn(List<String> values) {
            addCriterion("temp_purchase_order.delivery_add in", values, "deliveryAdd");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddNotIn(List<String> values) {
            addCriterion("temp_purchase_order.delivery_add not in", values, "deliveryAdd");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddBetween(String value1, String value2) {
            addCriterion("temp_purchase_order.delivery_add between", value1, value2, "deliveryAdd");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_order.delivery_add not between", value1, value2, "deliveryAdd");
            return (Criteria) this;
        }

        public Criteria andInvoiceIsNull() {
            addCriterion("temp_purchase_order.invoice is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceIsNotNull() {
            addCriterion("temp_purchase_order.invoice is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceEqualTo(String value) {
            addCriterion("temp_purchase_order.invoice =", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceNotEqualTo(String value) {
            addCriterion("temp_purchase_order.invoice <>", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceGreaterThan(String value) {
            addCriterion("temp_purchase_order.invoice >", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_order.invoice >=", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceLessThan(String value) {
            addCriterion("temp_purchase_order.invoice <", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_order.invoice <=", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceLike(String value) {
            addCriterion("temp_purchase_order.invoice like", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceNotLike(String value) {
            addCriterion("temp_purchase_order.invoice not like", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceIn(List<String> values) {
            addCriterion("temp_purchase_order.invoice in", values, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceNotIn(List<String> values) {
            addCriterion("temp_purchase_order.invoice not in", values, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceBetween(String value1, String value2) {
            addCriterion("temp_purchase_order.invoice between", value1, value2, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_order.invoice not between", value1, value2, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeIdIsNull() {
            addCriterion("temp_purchase_order.invoice_type_id is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeIdIsNotNull() {
            addCriterion("temp_purchase_order.invoice_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeIdEqualTo(String value) {
            addCriterion("temp_purchase_order.invoice_type_id =", value, "invoiceTypeId");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeIdNotEqualTo(String value) {
            addCriterion("temp_purchase_order.invoice_type_id <>", value, "invoiceTypeId");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeIdGreaterThan(String value) {
            addCriterion("temp_purchase_order.invoice_type_id >", value, "invoiceTypeId");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_order.invoice_type_id >=", value, "invoiceTypeId");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeIdLessThan(String value) {
            addCriterion("temp_purchase_order.invoice_type_id <", value, "invoiceTypeId");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeIdLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_order.invoice_type_id <=", value, "invoiceTypeId");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeIdLike(String value) {
            addCriterion("temp_purchase_order.invoice_type_id like", value, "invoiceTypeId");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeIdNotLike(String value) {
            addCriterion("temp_purchase_order.invoice_type_id not like", value, "invoiceTypeId");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeIdIn(List<String> values) {
            addCriterion("temp_purchase_order.invoice_type_id in", values, "invoiceTypeId");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeIdNotIn(List<String> values) {
            addCriterion("temp_purchase_order.invoice_type_id not in", values, "invoiceTypeId");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeIdBetween(String value1, String value2) {
            addCriterion("temp_purchase_order.invoice_type_id between", value1, value2, "invoiceTypeId");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeIdNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_order.invoice_type_id not between", value1, value2, "invoiceTypeId");
            return (Criteria) this;
        }

        public Criteria andInvStateIsNull() {
            addCriterion("temp_purchase_order.inv_state is null");
            return (Criteria) this;
        }

        public Criteria andInvStateIsNotNull() {
            addCriterion("temp_purchase_order.inv_state is not null");
            return (Criteria) this;
        }

        public Criteria andInvStateEqualTo(String value) {
            addCriterion("temp_purchase_order.inv_state =", value, "invState");
            return (Criteria) this;
        }

        public Criteria andInvStateNotEqualTo(String value) {
            addCriterion("temp_purchase_order.inv_state <>", value, "invState");
            return (Criteria) this;
        }

        public Criteria andInvStateGreaterThan(String value) {
            addCriterion("temp_purchase_order.inv_state >", value, "invState");
            return (Criteria) this;
        }

        public Criteria andInvStateGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_order.inv_state >=", value, "invState");
            return (Criteria) this;
        }

        public Criteria andInvStateLessThan(String value) {
            addCriterion("temp_purchase_order.inv_state <", value, "invState");
            return (Criteria) this;
        }

        public Criteria andInvStateLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_order.inv_state <=", value, "invState");
            return (Criteria) this;
        }

        public Criteria andInvStateLike(String value) {
            addCriterion("temp_purchase_order.inv_state like", value, "invState");
            return (Criteria) this;
        }

        public Criteria andInvStateNotLike(String value) {
            addCriterion("temp_purchase_order.inv_state not like", value, "invState");
            return (Criteria) this;
        }

        public Criteria andInvStateIn(List<String> values) {
            addCriterion("temp_purchase_order.inv_state in", values, "invState");
            return (Criteria) this;
        }

        public Criteria andInvStateNotIn(List<String> values) {
            addCriterion("temp_purchase_order.inv_state not in", values, "invState");
            return (Criteria) this;
        }

        public Criteria andInvStateBetween(String value1, String value2) {
            addCriterion("temp_purchase_order.inv_state between", value1, value2, "invState");
            return (Criteria) this;
        }

        public Criteria andInvStateNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_order.inv_state not between", value1, value2, "invState");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIsNull() {
            addCriterion("temp_purchase_order.total_amount is null");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIsNotNull() {
            addCriterion("temp_purchase_order.total_amount is not null");
            return (Criteria) this;
        }

        public Criteria andTotalAmountEqualTo(BigDecimal value) {
            addCriterion("temp_purchase_order.total_amount =", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotEqualTo(BigDecimal value) {
            addCriterion("temp_purchase_order.total_amount <>", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountGreaterThan(BigDecimal value) {
            addCriterion("temp_purchase_order.total_amount >", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_purchase_order.total_amount >=", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountLessThan(BigDecimal value) {
            addCriterion("temp_purchase_order.total_amount <", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_purchase_order.total_amount <=", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIn(List<BigDecimal> values) {
            addCriterion("temp_purchase_order.total_amount in", values, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotIn(List<BigDecimal> values) {
            addCriterion("temp_purchase_order.total_amount not in", values, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_purchase_order.total_amount between", value1, value2, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_purchase_order.total_amount not between", value1, value2, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andArrStateIsNull() {
            addCriterion("temp_purchase_order.arr_state is null");
            return (Criteria) this;
        }

        public Criteria andArrStateIsNotNull() {
            addCriterion("temp_purchase_order.arr_state is not null");
            return (Criteria) this;
        }

        public Criteria andArrStateEqualTo(String value) {
            addCriterion("temp_purchase_order.arr_state =", value, "arrState");
            return (Criteria) this;
        }

        public Criteria andArrStateNotEqualTo(String value) {
            addCriterion("temp_purchase_order.arr_state <>", value, "arrState");
            return (Criteria) this;
        }

        public Criteria andArrStateGreaterThan(String value) {
            addCriterion("temp_purchase_order.arr_state >", value, "arrState");
            return (Criteria) this;
        }

        public Criteria andArrStateGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_order.arr_state >=", value, "arrState");
            return (Criteria) this;
        }

        public Criteria andArrStateLessThan(String value) {
            addCriterion("temp_purchase_order.arr_state <", value, "arrState");
            return (Criteria) this;
        }

        public Criteria andArrStateLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_order.arr_state <=", value, "arrState");
            return (Criteria) this;
        }

        public Criteria andArrStateLike(String value) {
            addCriterion("temp_purchase_order.arr_state like", value, "arrState");
            return (Criteria) this;
        }

        public Criteria andArrStateNotLike(String value) {
            addCriterion("temp_purchase_order.arr_state not like", value, "arrState");
            return (Criteria) this;
        }

        public Criteria andArrStateIn(List<String> values) {
            addCriterion("temp_purchase_order.arr_state in", values, "arrState");
            return (Criteria) this;
        }

        public Criteria andArrStateNotIn(List<String> values) {
            addCriterion("temp_purchase_order.arr_state not in", values, "arrState");
            return (Criteria) this;
        }

        public Criteria andArrStateBetween(String value1, String value2) {
            addCriterion("temp_purchase_order.arr_state between", value1, value2, "arrState");
            return (Criteria) this;
        }

        public Criteria andArrStateNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_order.arr_state not between", value1, value2, "arrState");
            return (Criteria) this;
        }

        public Criteria andPayStateIsNull() {
            addCriterion("temp_purchase_order.pay_state is null");
            return (Criteria) this;
        }

        public Criteria andPayStateIsNotNull() {
            addCriterion("temp_purchase_order.pay_state is not null");
            return (Criteria) this;
        }

        public Criteria andPayStateEqualTo(String value) {
            addCriterion("temp_purchase_order.pay_state =", value, "payState");
            return (Criteria) this;
        }

        public Criteria andPayStateNotEqualTo(String value) {
            addCriterion("temp_purchase_order.pay_state <>", value, "payState");
            return (Criteria) this;
        }

        public Criteria andPayStateGreaterThan(String value) {
            addCriterion("temp_purchase_order.pay_state >", value, "payState");
            return (Criteria) this;
        }

        public Criteria andPayStateGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_order.pay_state >=", value, "payState");
            return (Criteria) this;
        }

        public Criteria andPayStateLessThan(String value) {
            addCriterion("temp_purchase_order.pay_state <", value, "payState");
            return (Criteria) this;
        }

        public Criteria andPayStateLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_order.pay_state <=", value, "payState");
            return (Criteria) this;
        }

        public Criteria andPayStateLike(String value) {
            addCriterion("temp_purchase_order.pay_state like", value, "payState");
            return (Criteria) this;
        }

        public Criteria andPayStateNotLike(String value) {
            addCriterion("temp_purchase_order.pay_state not like", value, "payState");
            return (Criteria) this;
        }

        public Criteria andPayStateIn(List<String> values) {
            addCriterion("temp_purchase_order.pay_state in", values, "payState");
            return (Criteria) this;
        }

        public Criteria andPayStateNotIn(List<String> values) {
            addCriterion("temp_purchase_order.pay_state not in", values, "payState");
            return (Criteria) this;
        }

        public Criteria andPayStateBetween(String value1, String value2) {
            addCriterion("temp_purchase_order.pay_state between", value1, value2, "payState");
            return (Criteria) this;
        }

        public Criteria andPayStateNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_order.pay_state not between", value1, value2, "payState");
            return (Criteria) this;
        }

        public Criteria andNotArrAmoIsNull() {
            addCriterion("temp_purchase_order.not_arr_amo is null");
            return (Criteria) this;
        }

        public Criteria andNotArrAmoIsNotNull() {
            addCriterion("temp_purchase_order.not_arr_amo is not null");
            return (Criteria) this;
        }

        public Criteria andNotArrAmoEqualTo(BigDecimal value) {
            addCriterion("temp_purchase_order.not_arr_amo =", value, "notArrAmo");
            return (Criteria) this;
        }

        public Criteria andNotArrAmoNotEqualTo(BigDecimal value) {
            addCriterion("temp_purchase_order.not_arr_amo <>", value, "notArrAmo");
            return (Criteria) this;
        }

        public Criteria andNotArrAmoGreaterThan(BigDecimal value) {
            addCriterion("temp_purchase_order.not_arr_amo >", value, "notArrAmo");
            return (Criteria) this;
        }

        public Criteria andNotArrAmoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_purchase_order.not_arr_amo >=", value, "notArrAmo");
            return (Criteria) this;
        }

        public Criteria andNotArrAmoLessThan(BigDecimal value) {
            addCriterion("temp_purchase_order.not_arr_amo <", value, "notArrAmo");
            return (Criteria) this;
        }

        public Criteria andNotArrAmoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_purchase_order.not_arr_amo <=", value, "notArrAmo");
            return (Criteria) this;
        }

        public Criteria andNotArrAmoIn(List<BigDecimal> values) {
            addCriterion("temp_purchase_order.not_arr_amo in", values, "notArrAmo");
            return (Criteria) this;
        }

        public Criteria andNotArrAmoNotIn(List<BigDecimal> values) {
            addCriterion("temp_purchase_order.not_arr_amo not in", values, "notArrAmo");
            return (Criteria) this;
        }

        public Criteria andNotArrAmoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_purchase_order.not_arr_amo between", value1, value2, "notArrAmo");
            return (Criteria) this;
        }

        public Criteria andNotArrAmoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_purchase_order.not_arr_amo not between", value1, value2, "notArrAmo");
            return (Criteria) this;
        }

        public Criteria andAlrArrAmoIsNull() {
            addCriterion("temp_purchase_order.alr_arr_amo is null");
            return (Criteria) this;
        }

        public Criteria andAlrArrAmoIsNotNull() {
            addCriterion("temp_purchase_order.alr_arr_amo is not null");
            return (Criteria) this;
        }

        public Criteria andAlrArrAmoEqualTo(BigDecimal value) {
            addCriterion("temp_purchase_order.alr_arr_amo =", value, "alrArrAmo");
            return (Criteria) this;
        }

        public Criteria andAlrArrAmoNotEqualTo(BigDecimal value) {
            addCriterion("temp_purchase_order.alr_arr_amo <>", value, "alrArrAmo");
            return (Criteria) this;
        }

        public Criteria andAlrArrAmoGreaterThan(BigDecimal value) {
            addCriterion("temp_purchase_order.alr_arr_amo >", value, "alrArrAmo");
            return (Criteria) this;
        }

        public Criteria andAlrArrAmoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_purchase_order.alr_arr_amo >=", value, "alrArrAmo");
            return (Criteria) this;
        }

        public Criteria andAlrArrAmoLessThan(BigDecimal value) {
            addCriterion("temp_purchase_order.alr_arr_amo <", value, "alrArrAmo");
            return (Criteria) this;
        }

        public Criteria andAlrArrAmoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_purchase_order.alr_arr_amo <=", value, "alrArrAmo");
            return (Criteria) this;
        }

        public Criteria andAlrArrAmoIn(List<BigDecimal> values) {
            addCriterion("temp_purchase_order.alr_arr_amo in", values, "alrArrAmo");
            return (Criteria) this;
        }

        public Criteria andAlrArrAmoNotIn(List<BigDecimal> values) {
            addCriterion("temp_purchase_order.alr_arr_amo not in", values, "alrArrAmo");
            return (Criteria) this;
        }

        public Criteria andAlrArrAmoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_purchase_order.alr_arr_amo between", value1, value2, "alrArrAmo");
            return (Criteria) this;
        }

        public Criteria andAlrArrAmoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_purchase_order.alr_arr_amo not between", value1, value2, "alrArrAmo");
            return (Criteria) this;
        }

        public Criteria andNotPayAmoIsNull() {
            addCriterion("temp_purchase_order.not_pay_amo is null");
            return (Criteria) this;
        }

        public Criteria andNotPayAmoIsNotNull() {
            addCriterion("temp_purchase_order.not_pay_amo is not null");
            return (Criteria) this;
        }

        public Criteria andNotPayAmoEqualTo(BigDecimal value) {
            addCriterion("temp_purchase_order.not_pay_amo =", value, "notPayAmo");
            return (Criteria) this;
        }

        public Criteria andNotPayAmoNotEqualTo(BigDecimal value) {
            addCriterion("temp_purchase_order.not_pay_amo <>", value, "notPayAmo");
            return (Criteria) this;
        }

        public Criteria andNotPayAmoGreaterThan(BigDecimal value) {
            addCriterion("temp_purchase_order.not_pay_amo >", value, "notPayAmo");
            return (Criteria) this;
        }

        public Criteria andNotPayAmoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_purchase_order.not_pay_amo >=", value, "notPayAmo");
            return (Criteria) this;
        }

        public Criteria andNotPayAmoLessThan(BigDecimal value) {
            addCriterion("temp_purchase_order.not_pay_amo <", value, "notPayAmo");
            return (Criteria) this;
        }

        public Criteria andNotPayAmoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_purchase_order.not_pay_amo <=", value, "notPayAmo");
            return (Criteria) this;
        }

        public Criteria andNotPayAmoIn(List<BigDecimal> values) {
            addCriterion("temp_purchase_order.not_pay_amo in", values, "notPayAmo");
            return (Criteria) this;
        }

        public Criteria andNotPayAmoNotIn(List<BigDecimal> values) {
            addCriterion("temp_purchase_order.not_pay_amo not in", values, "notPayAmo");
            return (Criteria) this;
        }

        public Criteria andNotPayAmoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_purchase_order.not_pay_amo between", value1, value2, "notPayAmo");
            return (Criteria) this;
        }

        public Criteria andNotPayAmoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_purchase_order.not_pay_amo not between", value1, value2, "notPayAmo");
            return (Criteria) this;
        }

        public Criteria andAlrPayAmoIsNull() {
            addCriterion("temp_purchase_order.alr_pay_amo is null");
            return (Criteria) this;
        }

        public Criteria andAlrPayAmoIsNotNull() {
            addCriterion("temp_purchase_order.alr_pay_amo is not null");
            return (Criteria) this;
        }

        public Criteria andAlrPayAmoEqualTo(BigDecimal value) {
            addCriterion("temp_purchase_order.alr_pay_amo =", value, "alrPayAmo");
            return (Criteria) this;
        }

        public Criteria andAlrPayAmoNotEqualTo(BigDecimal value) {
            addCriterion("temp_purchase_order.alr_pay_amo <>", value, "alrPayAmo");
            return (Criteria) this;
        }

        public Criteria andAlrPayAmoGreaterThan(BigDecimal value) {
            addCriterion("temp_purchase_order.alr_pay_amo >", value, "alrPayAmo");
            return (Criteria) this;
        }

        public Criteria andAlrPayAmoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_purchase_order.alr_pay_amo >=", value, "alrPayAmo");
            return (Criteria) this;
        }

        public Criteria andAlrPayAmoLessThan(BigDecimal value) {
            addCriterion("temp_purchase_order.alr_pay_amo <", value, "alrPayAmo");
            return (Criteria) this;
        }

        public Criteria andAlrPayAmoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_purchase_order.alr_pay_amo <=", value, "alrPayAmo");
            return (Criteria) this;
        }

        public Criteria andAlrPayAmoIn(List<BigDecimal> values) {
            addCriterion("temp_purchase_order.alr_pay_amo in", values, "alrPayAmo");
            return (Criteria) this;
        }

        public Criteria andAlrPayAmoNotIn(List<BigDecimal> values) {
            addCriterion("temp_purchase_order.alr_pay_amo not in", values, "alrPayAmo");
            return (Criteria) this;
        }

        public Criteria andAlrPayAmoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_purchase_order.alr_pay_amo between", value1, value2, "alrPayAmo");
            return (Criteria) this;
        }

        public Criteria andAlrPayAmoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_purchase_order.alr_pay_amo not between", value1, value2, "alrPayAmo");
            return (Criteria) this;
        }

        public Criteria andNotInvAmoIsNull() {
            addCriterion("temp_purchase_order.not_inv_amo is null");
            return (Criteria) this;
        }

        public Criteria andNotInvAmoIsNotNull() {
            addCriterion("temp_purchase_order.not_inv_amo is not null");
            return (Criteria) this;
        }

        public Criteria andNotInvAmoEqualTo(BigDecimal value) {
            addCriterion("temp_purchase_order.not_inv_amo =", value, "notInvAmo");
            return (Criteria) this;
        }

        public Criteria andNotInvAmoNotEqualTo(BigDecimal value) {
            addCriterion("temp_purchase_order.not_inv_amo <>", value, "notInvAmo");
            return (Criteria) this;
        }

        public Criteria andNotInvAmoGreaterThan(BigDecimal value) {
            addCriterion("temp_purchase_order.not_inv_amo >", value, "notInvAmo");
            return (Criteria) this;
        }

        public Criteria andNotInvAmoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_purchase_order.not_inv_amo >=", value, "notInvAmo");
            return (Criteria) this;
        }

        public Criteria andNotInvAmoLessThan(BigDecimal value) {
            addCriterion("temp_purchase_order.not_inv_amo <", value, "notInvAmo");
            return (Criteria) this;
        }

        public Criteria andNotInvAmoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_purchase_order.not_inv_amo <=", value, "notInvAmo");
            return (Criteria) this;
        }

        public Criteria andNotInvAmoIn(List<BigDecimal> values) {
            addCriterion("temp_purchase_order.not_inv_amo in", values, "notInvAmo");
            return (Criteria) this;
        }

        public Criteria andNotInvAmoNotIn(List<BigDecimal> values) {
            addCriterion("temp_purchase_order.not_inv_amo not in", values, "notInvAmo");
            return (Criteria) this;
        }

        public Criteria andNotInvAmoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_purchase_order.not_inv_amo between", value1, value2, "notInvAmo");
            return (Criteria) this;
        }

        public Criteria andNotInvAmoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_purchase_order.not_inv_amo not between", value1, value2, "notInvAmo");
            return (Criteria) this;
        }

        public Criteria andAlrInvAmoIsNull() {
            addCriterion("temp_purchase_order.alr_inv_amo is null");
            return (Criteria) this;
        }

        public Criteria andAlrInvAmoIsNotNull() {
            addCriterion("temp_purchase_order.alr_inv_amo is not null");
            return (Criteria) this;
        }

        public Criteria andAlrInvAmoEqualTo(BigDecimal value) {
            addCriterion("temp_purchase_order.alr_inv_amo =", value, "alrInvAmo");
            return (Criteria) this;
        }

        public Criteria andAlrInvAmoNotEqualTo(BigDecimal value) {
            addCriterion("temp_purchase_order.alr_inv_amo <>", value, "alrInvAmo");
            return (Criteria) this;
        }

        public Criteria andAlrInvAmoGreaterThan(BigDecimal value) {
            addCriterion("temp_purchase_order.alr_inv_amo >", value, "alrInvAmo");
            return (Criteria) this;
        }

        public Criteria andAlrInvAmoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_purchase_order.alr_inv_amo >=", value, "alrInvAmo");
            return (Criteria) this;
        }

        public Criteria andAlrInvAmoLessThan(BigDecimal value) {
            addCriterion("temp_purchase_order.alr_inv_amo <", value, "alrInvAmo");
            return (Criteria) this;
        }

        public Criteria andAlrInvAmoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_purchase_order.alr_inv_amo <=", value, "alrInvAmo");
            return (Criteria) this;
        }

        public Criteria andAlrInvAmoIn(List<BigDecimal> values) {
            addCriterion("temp_purchase_order.alr_inv_amo in", values, "alrInvAmo");
            return (Criteria) this;
        }

        public Criteria andAlrInvAmoNotIn(List<BigDecimal> values) {
            addCriterion("temp_purchase_order.alr_inv_amo not in", values, "alrInvAmo");
            return (Criteria) this;
        }

        public Criteria andAlrInvAmoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_purchase_order.alr_inv_amo between", value1, value2, "alrInvAmo");
            return (Criteria) this;
        }

        public Criteria andAlrInvAmoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_purchase_order.alr_inv_amo not between", value1, value2, "alrInvAmo");
            return (Criteria) this;
        }

        public Criteria andAccessoryIsNull() {
            addCriterion("temp_purchase_order.accessory is null");
            return (Criteria) this;
        }

        public Criteria andAccessoryIsNotNull() {
            addCriterion("temp_purchase_order.accessory is not null");
            return (Criteria) this;
        }

        public Criteria andAccessoryEqualTo(String value) {
            addCriterion("temp_purchase_order.accessory =", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryNotEqualTo(String value) {
            addCriterion("temp_purchase_order.accessory <>", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryGreaterThan(String value) {
            addCriterion("temp_purchase_order.accessory >", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_order.accessory >=", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryLessThan(String value) {
            addCriterion("temp_purchase_order.accessory <", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_order.accessory <=", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryLike(String value) {
            addCriterion("temp_purchase_order.accessory like", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryNotLike(String value) {
            addCriterion("temp_purchase_order.accessory not like", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryIn(List<String> values) {
            addCriterion("temp_purchase_order.accessory in", values, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryNotIn(List<String> values) {
            addCriterion("temp_purchase_order.accessory not in", values, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryBetween(String value1, String value2) {
            addCriterion("temp_purchase_order.accessory between", value1, value2, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_order.accessory not between", value1, value2, "accessory");
            return (Criteria) this;
        }

        public Criteria andSharedPeopleIdIsNull() {
            addCriterion("temp_purchase_order.shared_people_id is null");
            return (Criteria) this;
        }

        public Criteria andSharedPeopleIdIsNotNull() {
            addCriterion("temp_purchase_order.shared_people_id is not null");
            return (Criteria) this;
        }

        public Criteria andSharedPeopleIdEqualTo(String value) {
            addCriterion("temp_purchase_order.shared_people_id =", value, "sharedPeopleId");
            return (Criteria) this;
        }

        public Criteria andSharedPeopleIdNotEqualTo(String value) {
            addCriterion("temp_purchase_order.shared_people_id <>", value, "sharedPeopleId");
            return (Criteria) this;
        }

        public Criteria andSharedPeopleIdGreaterThan(String value) {
            addCriterion("temp_purchase_order.shared_people_id >", value, "sharedPeopleId");
            return (Criteria) this;
        }

        public Criteria andSharedPeopleIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_order.shared_people_id >=", value, "sharedPeopleId");
            return (Criteria) this;
        }

        public Criteria andSharedPeopleIdLessThan(String value) {
            addCriterion("temp_purchase_order.shared_people_id <", value, "sharedPeopleId");
            return (Criteria) this;
        }

        public Criteria andSharedPeopleIdLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_order.shared_people_id <=", value, "sharedPeopleId");
            return (Criteria) this;
        }

        public Criteria andSharedPeopleIdLike(String value) {
            addCriterion("temp_purchase_order.shared_people_id like", value, "sharedPeopleId");
            return (Criteria) this;
        }

        public Criteria andSharedPeopleIdNotLike(String value) {
            addCriterion("temp_purchase_order.shared_people_id not like", value, "sharedPeopleId");
            return (Criteria) this;
        }

        public Criteria andSharedPeopleIdIn(List<String> values) {
            addCriterion("temp_purchase_order.shared_people_id in", values, "sharedPeopleId");
            return (Criteria) this;
        }

        public Criteria andSharedPeopleIdNotIn(List<String> values) {
            addCriterion("temp_purchase_order.shared_people_id not in", values, "sharedPeopleId");
            return (Criteria) this;
        }

        public Criteria andSharedPeopleIdBetween(String value1, String value2) {
            addCriterion("temp_purchase_order.shared_people_id between", value1, value2, "sharedPeopleId");
            return (Criteria) this;
        }

        public Criteria andSharedPeopleIdNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_order.shared_people_id not between", value1, value2, "sharedPeopleId");
            return (Criteria) this;
        }

        public Criteria andAuditStateIsNull() {
            addCriterion("temp_purchase_order.audit_state is null");
            return (Criteria) this;
        }

        public Criteria andAuditStateIsNotNull() {
            addCriterion("temp_purchase_order.audit_state is not null");
            return (Criteria) this;
        }

        public Criteria andAuditStateEqualTo(String value) {
            addCriterion("temp_purchase_order.audit_state =", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateNotEqualTo(String value) {
            addCriterion("temp_purchase_order.audit_state <>", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateGreaterThan(String value) {
            addCriterion("temp_purchase_order.audit_state >", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_order.audit_state >=", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateLessThan(String value) {
            addCriterion("temp_purchase_order.audit_state <", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_order.audit_state <=", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateLike(String value) {
            addCriterion("temp_purchase_order.audit_state like", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateNotLike(String value) {
            addCriterion("temp_purchase_order.audit_state not like", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateIn(List<String> values) {
            addCriterion("temp_purchase_order.audit_state in", values, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateNotIn(List<String> values) {
            addCriterion("temp_purchase_order.audit_state not in", values, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateBetween(String value1, String value2) {
            addCriterion("temp_purchase_order.audit_state between", value1, value2, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_order.audit_state not between", value1, value2, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditorIsNull() {
            addCriterion("temp_purchase_order.auditor is null");
            return (Criteria) this;
        }

        public Criteria andAuditorIsNotNull() {
            addCriterion("temp_purchase_order.auditor is not null");
            return (Criteria) this;
        }

        public Criteria andAuditorEqualTo(String value) {
            addCriterion("temp_purchase_order.auditor =", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotEqualTo(String value) {
            addCriterion("temp_purchase_order.auditor <>", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorGreaterThan(String value) {
            addCriterion("temp_purchase_order.auditor >", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_order.auditor >=", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorLessThan(String value) {
            addCriterion("temp_purchase_order.auditor <", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_order.auditor <=", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorLike(String value) {
            addCriterion("temp_purchase_order.auditor like", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotLike(String value) {
            addCriterion("temp_purchase_order.auditor not like", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorIn(List<String> values) {
            addCriterion("temp_purchase_order.auditor in", values, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotIn(List<String> values) {
            addCriterion("temp_purchase_order.auditor not in", values, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorBetween(String value1, String value2) {
            addCriterion("temp_purchase_order.auditor between", value1, value2, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_order.auditor not between", value1, value2, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditDateIsNull() {
            addCriterion("temp_purchase_order.audit_date is null");
            return (Criteria) this;
        }

        public Criteria andAuditDateIsNotNull() {
            addCriterion("temp_purchase_order.audit_date is not null");
            return (Criteria) this;
        }

        public Criteria andAuditDateEqualTo(Date value) {
            addCriterion("temp_purchase_order.audit_date =", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateNotEqualTo(Date value) {
            addCriterion("temp_purchase_order.audit_date <>", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateGreaterThan(Date value) {
            addCriterion("temp_purchase_order.audit_date >", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_purchase_order.audit_date >=", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateLessThan(Date value) {
            addCriterion("temp_purchase_order.audit_date <", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateLessThanOrEqualTo(Date value) {
            addCriterion("temp_purchase_order.audit_date <=", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateIn(List<Date> values) {
            addCriterion("temp_purchase_order.audit_date in", values, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateNotIn(List<Date> values) {
            addCriterion("temp_purchase_order.audit_date not in", values, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateBetween(Date value1, Date value2) {
            addCriterion("temp_purchase_order.audit_date between", value1, value2, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateNotBetween(Date value1, Date value2) {
            addCriterion("temp_purchase_order.audit_date not between", value1, value2, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkIsNull() {
            addCriterion("temp_purchase_order.audit_remark is null");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkIsNotNull() {
            addCriterion("temp_purchase_order.audit_remark is not null");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkEqualTo(String value) {
            addCriterion("temp_purchase_order.audit_remark =", value, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkNotEqualTo(String value) {
            addCriterion("temp_purchase_order.audit_remark <>", value, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkGreaterThan(String value) {
            addCriterion("temp_purchase_order.audit_remark >", value, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_order.audit_remark >=", value, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkLessThan(String value) {
            addCriterion("temp_purchase_order.audit_remark <", value, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_order.audit_remark <=", value, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkLike(String value) {
            addCriterion("temp_purchase_order.audit_remark like", value, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkNotLike(String value) {
            addCriterion("temp_purchase_order.audit_remark not like", value, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkIn(List<String> values) {
            addCriterion("temp_purchase_order.audit_remark in", values, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkNotIn(List<String> values) {
            addCriterion("temp_purchase_order.audit_remark not in", values, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkBetween(String value1, String value2) {
            addCriterion("temp_purchase_order.audit_remark between", value1, value2, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_order.audit_remark not between", value1, value2, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andEnabledIsNull() {
            addCriterion("temp_purchase_order.enabled is null");
            return (Criteria) this;
        }

        public Criteria andEnabledIsNotNull() {
            addCriterion("temp_purchase_order.enabled is not null");
            return (Criteria) this;
        }

        public Criteria andEnabledEqualTo(String value) {
            addCriterion("temp_purchase_order.enabled =", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotEqualTo(String value) {
            addCriterion("temp_purchase_order.enabled <>", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledGreaterThan(String value) {
            addCriterion("temp_purchase_order.enabled >", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_order.enabled >=", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledLessThan(String value) {
            addCriterion("temp_purchase_order.enabled <", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_order.enabled <=", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledLike(String value) {
            addCriterion("temp_purchase_order.enabled like", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotLike(String value) {
            addCriterion("temp_purchase_order.enabled not like", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledIn(List<String> values) {
            addCriterion("temp_purchase_order.enabled in", values, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotIn(List<String> values) {
            addCriterion("temp_purchase_order.enabled not in", values, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledBetween(String value1, String value2) {
            addCriterion("temp_purchase_order.enabled between", value1, value2, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_order.enabled not between", value1, value2, "enabled");
            return (Criteria) this;
        }

        public Criteria andOperatorsIsNull() {
            addCriterion("temp_purchase_order.operators is null");
            return (Criteria) this;
        }

        public Criteria andOperatorsIsNotNull() {
            addCriterion("temp_purchase_order.operators is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorsEqualTo(String value) {
            addCriterion("temp_purchase_order.operators =", value, "operators");
            return (Criteria) this;
        }

        public Criteria andOperatorsNotEqualTo(String value) {
            addCriterion("temp_purchase_order.operators <>", value, "operators");
            return (Criteria) this;
        }

        public Criteria andOperatorsGreaterThan(String value) {
            addCriterion("temp_purchase_order.operators >", value, "operators");
            return (Criteria) this;
        }

        public Criteria andOperatorsGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_order.operators >=", value, "operators");
            return (Criteria) this;
        }

        public Criteria andOperatorsLessThan(String value) {
            addCriterion("temp_purchase_order.operators <", value, "operators");
            return (Criteria) this;
        }

        public Criteria andOperatorsLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_order.operators <=", value, "operators");
            return (Criteria) this;
        }

        public Criteria andOperatorsLike(String value) {
            addCriterion("temp_purchase_order.operators like", value, "operators");
            return (Criteria) this;
        }

        public Criteria andOperatorsNotLike(String value) {
            addCriterion("temp_purchase_order.operators not like", value, "operators");
            return (Criteria) this;
        }

        public Criteria andOperatorsIn(List<String> values) {
            addCriterion("temp_purchase_order.operators in", values, "operators");
            return (Criteria) this;
        }

        public Criteria andOperatorsNotIn(List<String> values) {
            addCriterion("temp_purchase_order.operators not in", values, "operators");
            return (Criteria) this;
        }

        public Criteria andOperatorsBetween(String value1, String value2) {
            addCriterion("temp_purchase_order.operators between", value1, value2, "operators");
            return (Criteria) this;
        }

        public Criteria andOperatorsNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_order.operators not between", value1, value2, "operators");
            return (Criteria) this;
        }

        public Criteria andOperatorDepIsNull() {
            addCriterion("temp_purchase_order.operator_dep is null");
            return (Criteria) this;
        }

        public Criteria andOperatorDepIsNotNull() {
            addCriterion("temp_purchase_order.operator_dep is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorDepEqualTo(String value) {
            addCriterion("temp_purchase_order.operator_dep =", value, "operatorDep");
            return (Criteria) this;
        }

        public Criteria andOperatorDepNotEqualTo(String value) {
            addCriterion("temp_purchase_order.operator_dep <>", value, "operatorDep");
            return (Criteria) this;
        }

        public Criteria andOperatorDepGreaterThan(String value) {
            addCriterion("temp_purchase_order.operator_dep >", value, "operatorDep");
            return (Criteria) this;
        }

        public Criteria andOperatorDepGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_order.operator_dep >=", value, "operatorDep");
            return (Criteria) this;
        }

        public Criteria andOperatorDepLessThan(String value) {
            addCriterion("temp_purchase_order.operator_dep <", value, "operatorDep");
            return (Criteria) this;
        }

        public Criteria andOperatorDepLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_order.operator_dep <=", value, "operatorDep");
            return (Criteria) this;
        }

        public Criteria andOperatorDepLike(String value) {
            addCriterion("temp_purchase_order.operator_dep like", value, "operatorDep");
            return (Criteria) this;
        }

        public Criteria andOperatorDepNotLike(String value) {
            addCriterion("temp_purchase_order.operator_dep not like", value, "operatorDep");
            return (Criteria) this;
        }

        public Criteria andOperatorDepIn(List<String> values) {
            addCriterion("temp_purchase_order.operator_dep in", values, "operatorDep");
            return (Criteria) this;
        }

        public Criteria andOperatorDepNotIn(List<String> values) {
            addCriterion("temp_purchase_order.operator_dep not in", values, "operatorDep");
            return (Criteria) this;
        }

        public Criteria andOperatorDepBetween(String value1, String value2) {
            addCriterion("temp_purchase_order.operator_dep between", value1, value2, "operatorDep");
            return (Criteria) this;
        }

        public Criteria andOperatorDepNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_order.operator_dep not between", value1, value2, "operatorDep");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("temp_purchase_order.remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("temp_purchase_order.remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("temp_purchase_order.remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("temp_purchase_order.remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("temp_purchase_order.remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_order.remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("temp_purchase_order.remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_order.remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("temp_purchase_order.remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("temp_purchase_order.remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("temp_purchase_order.remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("temp_purchase_order.remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("temp_purchase_order.remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_order.remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNull() {
            addCriterion("temp_purchase_order.creater is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNotNull() {
            addCriterion("temp_purchase_order.creater is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterEqualTo(String value) {
            addCriterion("temp_purchase_order.creater =", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotEqualTo(String value) {
            addCriterion("temp_purchase_order.creater <>", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThan(String value) {
            addCriterion("temp_purchase_order.creater >", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_order.creater >=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThan(String value) {
            addCriterion("temp_purchase_order.creater <", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_order.creater <=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLike(String value) {
            addCriterion("temp_purchase_order.creater like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotLike(String value) {
            addCriterion("temp_purchase_order.creater not like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterIn(List<String> values) {
            addCriterion("temp_purchase_order.creater in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotIn(List<String> values) {
            addCriterion("temp_purchase_order.creater not in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterBetween(String value1, String value2) {
            addCriterion("temp_purchase_order.creater between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_order.creater not between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("temp_purchase_order.create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("temp_purchase_order.create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("temp_purchase_order.create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("temp_purchase_order.create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("temp_purchase_order.create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_purchase_order.create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("temp_purchase_order.create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_purchase_order.create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("temp_purchase_order.create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("temp_purchase_order.create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_purchase_order.create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_purchase_order.create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNull() {
            addCriterion("temp_purchase_order.updater is null");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNotNull() {
            addCriterion("temp_purchase_order.updater is not null");
            return (Criteria) this;
        }

        public Criteria andUpdaterEqualTo(String value) {
            addCriterion("temp_purchase_order.updater =", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotEqualTo(String value) {
            addCriterion("temp_purchase_order.updater <>", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThan(String value) {
            addCriterion("temp_purchase_order.updater >", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_order.updater >=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThan(String value) {
            addCriterion("temp_purchase_order.updater <", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_order.updater <=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLike(String value) {
            addCriterion("temp_purchase_order.updater like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotLike(String value) {
            addCriterion("temp_purchase_order.updater not like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterIn(List<String> values) {
            addCriterion("temp_purchase_order.updater in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotIn(List<String> values) {
            addCriterion("temp_purchase_order.updater not in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterBetween(String value1, String value2) {
            addCriterion("temp_purchase_order.updater between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_order.updater not between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("temp_purchase_order.update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("temp_purchase_order.update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("temp_purchase_order.update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("temp_purchase_order.update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("temp_purchase_order.update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_purchase_order.update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("temp_purchase_order.update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_purchase_order.update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("temp_purchase_order.update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("temp_purchase_order.update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_purchase_order.update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_purchase_order.update_time not between", value1, value2, "updateTime");
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
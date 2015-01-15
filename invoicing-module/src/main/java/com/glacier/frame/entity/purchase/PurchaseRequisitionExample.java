package com.glacier.frame.entity.purchase;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PurchaseRequisitionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public PurchaseRequisitionExample() {
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

        public Criteria andPurReqIdIsNull() {
            addCriterion("temp_purchase_requisition.pur_req_id is null");
            return (Criteria) this;
        }

        public Criteria andPurReqIdIsNotNull() {
            addCriterion("temp_purchase_requisition.pur_req_id is not null");
            return (Criteria) this;
        }

        public Criteria andPurReqIdEqualTo(String value) {
            addCriterion("temp_purchase_requisition.pur_req_id =", value, "purReqId");
            return (Criteria) this;
        }

        public Criteria andPurReqIdNotEqualTo(String value) {
            addCriterion("temp_purchase_requisition.pur_req_id <>", value, "purReqId");
            return (Criteria) this;
        }

        public Criteria andPurReqIdGreaterThan(String value) {
            addCriterion("temp_purchase_requisition.pur_req_id >", value, "purReqId");
            return (Criteria) this;
        }

        public Criteria andPurReqIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_requisition.pur_req_id >=", value, "purReqId");
            return (Criteria) this;
        }

        public Criteria andPurReqIdLessThan(String value) {
            addCriterion("temp_purchase_requisition.pur_req_id <", value, "purReqId");
            return (Criteria) this;
        }

        public Criteria andPurReqIdLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_requisition.pur_req_id <=", value, "purReqId");
            return (Criteria) this;
        }

        public Criteria andPurReqIdLike(String value) {
            addCriterion("temp_purchase_requisition.pur_req_id like", value, "purReqId");
            return (Criteria) this;
        }

        public Criteria andPurReqIdNotLike(String value) {
            addCriterion("temp_purchase_requisition.pur_req_id not like", value, "purReqId");
            return (Criteria) this;
        }

        public Criteria andPurReqIdIn(List<String> values) {
            addCriterion("temp_purchase_requisition.pur_req_id in", values, "purReqId");
            return (Criteria) this;
        }

        public Criteria andPurReqIdNotIn(List<String> values) {
            addCriterion("temp_purchase_requisition.pur_req_id not in", values, "purReqId");
            return (Criteria) this;
        }

        public Criteria andPurReqIdBetween(String value1, String value2) {
            addCriterion("temp_purchase_requisition.pur_req_id between", value1, value2, "purReqId");
            return (Criteria) this;
        }

        public Criteria andPurReqIdNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_requisition.pur_req_id not between", value1, value2, "purReqId");
            return (Criteria) this;
        }

        public Criteria andReqCodeIsNull() {
            addCriterion("temp_purchase_requisition.req_code is null");
            return (Criteria) this;
        }

        public Criteria andReqCodeIsNotNull() {
            addCriterion("temp_purchase_requisition.req_code is not null");
            return (Criteria) this;
        }

        public Criteria andReqCodeEqualTo(String value) {
            addCriterion("temp_purchase_requisition.req_code =", value, "reqCode");
            return (Criteria) this;
        }

        public Criteria andReqCodeNotEqualTo(String value) {
            addCriterion("temp_purchase_requisition.req_code <>", value, "reqCode");
            return (Criteria) this;
        }

        public Criteria andReqCodeGreaterThan(String value) {
            addCriterion("temp_purchase_requisition.req_code >", value, "reqCode");
            return (Criteria) this;
        }

        public Criteria andReqCodeGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_requisition.req_code >=", value, "reqCode");
            return (Criteria) this;
        }

        public Criteria andReqCodeLessThan(String value) {
            addCriterion("temp_purchase_requisition.req_code <", value, "reqCode");
            return (Criteria) this;
        }

        public Criteria andReqCodeLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_requisition.req_code <=", value, "reqCode");
            return (Criteria) this;
        }

        public Criteria andReqCodeLike(String value) {
            addCriterion("temp_purchase_requisition.req_code like", value, "reqCode");
            return (Criteria) this;
        }

        public Criteria andReqCodeNotLike(String value) {
            addCriterion("temp_purchase_requisition.req_code not like", value, "reqCode");
            return (Criteria) this;
        }

        public Criteria andReqCodeIn(List<String> values) {
            addCriterion("temp_purchase_requisition.req_code in", values, "reqCode");
            return (Criteria) this;
        }

        public Criteria andReqCodeNotIn(List<String> values) {
            addCriterion("temp_purchase_requisition.req_code not in", values, "reqCode");
            return (Criteria) this;
        }

        public Criteria andReqCodeBetween(String value1, String value2) {
            addCriterion("temp_purchase_requisition.req_code between", value1, value2, "reqCode");
            return (Criteria) this;
        }

        public Criteria andReqCodeNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_requisition.req_code not between", value1, value2, "reqCode");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeIdIsNull() {
            addCriterion("temp_purchase_requisition.purchase_type_id is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeIdIsNotNull() {
            addCriterion("temp_purchase_requisition.purchase_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeIdEqualTo(String value) {
            addCriterion("temp_purchase_requisition.purchase_type_id =", value, "purchaseTypeId");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeIdNotEqualTo(String value) {
            addCriterion("temp_purchase_requisition.purchase_type_id <>", value, "purchaseTypeId");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeIdGreaterThan(String value) {
            addCriterion("temp_purchase_requisition.purchase_type_id >", value, "purchaseTypeId");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_requisition.purchase_type_id >=", value, "purchaseTypeId");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeIdLessThan(String value) {
            addCriterion("temp_purchase_requisition.purchase_type_id <", value, "purchaseTypeId");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeIdLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_requisition.purchase_type_id <=", value, "purchaseTypeId");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeIdLike(String value) {
            addCriterion("temp_purchase_requisition.purchase_type_id like", value, "purchaseTypeId");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeIdNotLike(String value) {
            addCriterion("temp_purchase_requisition.purchase_type_id not like", value, "purchaseTypeId");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeIdIn(List<String> values) {
            addCriterion("temp_purchase_requisition.purchase_type_id in", values, "purchaseTypeId");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeIdNotIn(List<String> values) {
            addCriterion("temp_purchase_requisition.purchase_type_id not in", values, "purchaseTypeId");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeIdBetween(String value1, String value2) {
            addCriterion("temp_purchase_requisition.purchase_type_id between", value1, value2, "purchaseTypeId");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeIdNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_requisition.purchase_type_id not between", value1, value2, "purchaseTypeId");
            return (Criteria) this;
        }

        public Criteria andReqDateIsNull() {
            addCriterion("temp_purchase_requisition.req_date is null");
            return (Criteria) this;
        }

        public Criteria andReqDateIsNotNull() {
            addCriterion("temp_purchase_requisition.req_date is not null");
            return (Criteria) this;
        }

        public Criteria andReqDateEqualTo(Date value) {
            addCriterion("temp_purchase_requisition.req_date =", value, "reqDate");
            return (Criteria) this;
        }

        public Criteria andReqDateNotEqualTo(Date value) {
            addCriterion("temp_purchase_requisition.req_date <>", value, "reqDate");
            return (Criteria) this;
        }

        public Criteria andReqDateGreaterThan(Date value) {
            addCriterion("temp_purchase_requisition.req_date >", value, "reqDate");
            return (Criteria) this;
        }

        public Criteria andReqDateGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_purchase_requisition.req_date >=", value, "reqDate");
            return (Criteria) this;
        }

        public Criteria andReqDateLessThan(Date value) {
            addCriterion("temp_purchase_requisition.req_date <", value, "reqDate");
            return (Criteria) this;
        }

        public Criteria andReqDateLessThanOrEqualTo(Date value) {
            addCriterion("temp_purchase_requisition.req_date <=", value, "reqDate");
            return (Criteria) this;
        }

        public Criteria andReqDateIn(List<Date> values) {
            addCriterion("temp_purchase_requisition.req_date in", values, "reqDate");
            return (Criteria) this;
        }

        public Criteria andReqDateNotIn(List<Date> values) {
            addCriterion("temp_purchase_requisition.req_date not in", values, "reqDate");
            return (Criteria) this;
        }

        public Criteria andReqDateBetween(Date value1, Date value2) {
            addCriterion("temp_purchase_requisition.req_date between", value1, value2, "reqDate");
            return (Criteria) this;
        }

        public Criteria andReqDateNotBetween(Date value1, Date value2) {
            addCriterion("temp_purchase_requisition.req_date not between", value1, value2, "reqDate");
            return (Criteria) this;
        }

        public Criteria andStorageIsNull() {
            addCriterion("temp_purchase_requisition.storage is null");
            return (Criteria) this;
        }

        public Criteria andStorageIsNotNull() {
            addCriterion("temp_purchase_requisition.storage is not null");
            return (Criteria) this;
        }

        public Criteria andStorageEqualTo(String value) {
            addCriterion("temp_purchase_requisition.storage =", value, "storage");
            return (Criteria) this;
        }

        public Criteria andStorageNotEqualTo(String value) {
            addCriterion("temp_purchase_requisition.storage <>", value, "storage");
            return (Criteria) this;
        }

        public Criteria andStorageGreaterThan(String value) {
            addCriterion("temp_purchase_requisition.storage >", value, "storage");
            return (Criteria) this;
        }

        public Criteria andStorageGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_requisition.storage >=", value, "storage");
            return (Criteria) this;
        }

        public Criteria andStorageLessThan(String value) {
            addCriterion("temp_purchase_requisition.storage <", value, "storage");
            return (Criteria) this;
        }

        public Criteria andStorageLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_requisition.storage <=", value, "storage");
            return (Criteria) this;
        }

        public Criteria andStorageLike(String value) {
            addCriterion("temp_purchase_requisition.storage like", value, "storage");
            return (Criteria) this;
        }

        public Criteria andStorageNotLike(String value) {
            addCriterion("temp_purchase_requisition.storage not like", value, "storage");
            return (Criteria) this;
        }

        public Criteria andStorageIn(List<String> values) {
            addCriterion("temp_purchase_requisition.storage in", values, "storage");
            return (Criteria) this;
        }

        public Criteria andStorageNotIn(List<String> values) {
            addCriterion("temp_purchase_requisition.storage not in", values, "storage");
            return (Criteria) this;
        }

        public Criteria andStorageBetween(String value1, String value2) {
            addCriterion("temp_purchase_requisition.storage between", value1, value2, "storage");
            return (Criteria) this;
        }

        public Criteria andStorageNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_requisition.storage not between", value1, value2, "storage");
            return (Criteria) this;
        }

        public Criteria andOrderStateIsNull() {
            addCriterion("temp_purchase_requisition.order_state is null");
            return (Criteria) this;
        }

        public Criteria andOrderStateIsNotNull() {
            addCriterion("temp_purchase_requisition.order_state is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStateEqualTo(String value) {
            addCriterion("temp_purchase_requisition.order_state =", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateNotEqualTo(String value) {
            addCriterion("temp_purchase_requisition.order_state <>", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateGreaterThan(String value) {
            addCriterion("temp_purchase_requisition.order_state >", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_requisition.order_state >=", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateLessThan(String value) {
            addCriterion("temp_purchase_requisition.order_state <", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_requisition.order_state <=", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateLike(String value) {
            addCriterion("temp_purchase_requisition.order_state like", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateNotLike(String value) {
            addCriterion("temp_purchase_requisition.order_state not like", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateIn(List<String> values) {
            addCriterion("temp_purchase_requisition.order_state in", values, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateNotIn(List<String> values) {
            addCriterion("temp_purchase_requisition.order_state not in", values, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateBetween(String value1, String value2) {
            addCriterion("temp_purchase_requisition.order_state between", value1, value2, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_requisition.order_state not between", value1, value2, "orderState");
            return (Criteria) this;
        }

        public Criteria andOperatorsIsNull() {
            addCriterion("temp_purchase_requisition.operators is null");
            return (Criteria) this;
        }

        public Criteria andOperatorsIsNotNull() {
            addCriterion("temp_purchase_requisition.operators is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorsEqualTo(String value) {
            addCriterion("temp_purchase_requisition.operators =", value, "operators");
            return (Criteria) this;
        }

        public Criteria andOperatorsNotEqualTo(String value) {
            addCriterion("temp_purchase_requisition.operators <>", value, "operators");
            return (Criteria) this;
        }

        public Criteria andOperatorsGreaterThan(String value) {
            addCriterion("temp_purchase_requisition.operators >", value, "operators");
            return (Criteria) this;
        }

        public Criteria andOperatorsGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_requisition.operators >=", value, "operators");
            return (Criteria) this;
        }

        public Criteria andOperatorsLessThan(String value) {
            addCriterion("temp_purchase_requisition.operators <", value, "operators");
            return (Criteria) this;
        }

        public Criteria andOperatorsLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_requisition.operators <=", value, "operators");
            return (Criteria) this;
        }

        public Criteria andOperatorsLike(String value) {
            addCriterion("temp_purchase_requisition.operators like", value, "operators");
            return (Criteria) this;
        }

        public Criteria andOperatorsNotLike(String value) {
            addCriterion("temp_purchase_requisition.operators not like", value, "operators");
            return (Criteria) this;
        }

        public Criteria andOperatorsIn(List<String> values) {
            addCriterion("temp_purchase_requisition.operators in", values, "operators");
            return (Criteria) this;
        }

        public Criteria andOperatorsNotIn(List<String> values) {
            addCriterion("temp_purchase_requisition.operators not in", values, "operators");
            return (Criteria) this;
        }

        public Criteria andOperatorsBetween(String value1, String value2) {
            addCriterion("temp_purchase_requisition.operators between", value1, value2, "operators");
            return (Criteria) this;
        }

        public Criteria andOperatorsNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_requisition.operators not between", value1, value2, "operators");
            return (Criteria) this;
        }

        public Criteria andOperatorDepIsNull() {
            addCriterion("temp_purchase_requisition.operator_dep is null");
            return (Criteria) this;
        }

        public Criteria andOperatorDepIsNotNull() {
            addCriterion("temp_purchase_requisition.operator_dep is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorDepEqualTo(String value) {
            addCriterion("temp_purchase_requisition.operator_dep =", value, "operatorDep");
            return (Criteria) this;
        }

        public Criteria andOperatorDepNotEqualTo(String value) {
            addCriterion("temp_purchase_requisition.operator_dep <>", value, "operatorDep");
            return (Criteria) this;
        }

        public Criteria andOperatorDepGreaterThan(String value) {
            addCriterion("temp_purchase_requisition.operator_dep >", value, "operatorDep");
            return (Criteria) this;
        }

        public Criteria andOperatorDepGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_requisition.operator_dep >=", value, "operatorDep");
            return (Criteria) this;
        }

        public Criteria andOperatorDepLessThan(String value) {
            addCriterion("temp_purchase_requisition.operator_dep <", value, "operatorDep");
            return (Criteria) this;
        }

        public Criteria andOperatorDepLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_requisition.operator_dep <=", value, "operatorDep");
            return (Criteria) this;
        }

        public Criteria andOperatorDepLike(String value) {
            addCriterion("temp_purchase_requisition.operator_dep like", value, "operatorDep");
            return (Criteria) this;
        }

        public Criteria andOperatorDepNotLike(String value) {
            addCriterion("temp_purchase_requisition.operator_dep not like", value, "operatorDep");
            return (Criteria) this;
        }

        public Criteria andOperatorDepIn(List<String> values) {
            addCriterion("temp_purchase_requisition.operator_dep in", values, "operatorDep");
            return (Criteria) this;
        }

        public Criteria andOperatorDepNotIn(List<String> values) {
            addCriterion("temp_purchase_requisition.operator_dep not in", values, "operatorDep");
            return (Criteria) this;
        }

        public Criteria andOperatorDepBetween(String value1, String value2) {
            addCriterion("temp_purchase_requisition.operator_dep between", value1, value2, "operatorDep");
            return (Criteria) this;
        }

        public Criteria andOperatorDepNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_requisition.operator_dep not between", value1, value2, "operatorDep");
            return (Criteria) this;
        }

        public Criteria andTotalIsNull() {
            addCriterion("temp_purchase_requisition.total is null");
            return (Criteria) this;
        }

        public Criteria andTotalIsNotNull() {
            addCriterion("temp_purchase_requisition.total is not null");
            return (Criteria) this;
        }

        public Criteria andTotalEqualTo(BigDecimal value) {
            addCriterion("temp_purchase_requisition.total =", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotEqualTo(BigDecimal value) {
            addCriterion("temp_purchase_requisition.total <>", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThan(BigDecimal value) {
            addCriterion("temp_purchase_requisition.total >", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_purchase_requisition.total >=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThan(BigDecimal value) {
            addCriterion("temp_purchase_requisition.total <", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_purchase_requisition.total <=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalIn(List<BigDecimal> values) {
            addCriterion("temp_purchase_requisition.total in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotIn(List<BigDecimal> values) {
            addCriterion("temp_purchase_requisition.total not in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_purchase_requisition.total between", value1, value2, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_purchase_requisition.total not between", value1, value2, "total");
            return (Criteria) this;
        }

        public Criteria andAccessoryIsNull() {
            addCriterion("temp_purchase_requisition.accessory is null");
            return (Criteria) this;
        }

        public Criteria andAccessoryIsNotNull() {
            addCriterion("temp_purchase_requisition.accessory is not null");
            return (Criteria) this;
        }

        public Criteria andAccessoryEqualTo(String value) {
            addCriterion("temp_purchase_requisition.accessory =", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryNotEqualTo(String value) {
            addCriterion("temp_purchase_requisition.accessory <>", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryGreaterThan(String value) {
            addCriterion("temp_purchase_requisition.accessory >", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_requisition.accessory >=", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryLessThan(String value) {
            addCriterion("temp_purchase_requisition.accessory <", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_requisition.accessory <=", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryLike(String value) {
            addCriterion("temp_purchase_requisition.accessory like", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryNotLike(String value) {
            addCriterion("temp_purchase_requisition.accessory not like", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryIn(List<String> values) {
            addCriterion("temp_purchase_requisition.accessory in", values, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryNotIn(List<String> values) {
            addCriterion("temp_purchase_requisition.accessory not in", values, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryBetween(String value1, String value2) {
            addCriterion("temp_purchase_requisition.accessory between", value1, value2, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_requisition.accessory not between", value1, value2, "accessory");
            return (Criteria) this;
        }

        public Criteria andAuditStateIsNull() {
            addCriterion("temp_purchase_requisition.audit_state is null");
            return (Criteria) this;
        }

        public Criteria andAuditStateIsNotNull() {
            addCriterion("temp_purchase_requisition.audit_state is not null");
            return (Criteria) this;
        }

        public Criteria andAuditStateEqualTo(String value) {
            addCriterion("temp_purchase_requisition.audit_state =", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateNotEqualTo(String value) {
            addCriterion("temp_purchase_requisition.audit_state <>", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateGreaterThan(String value) {
            addCriterion("temp_purchase_requisition.audit_state >", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_requisition.audit_state >=", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateLessThan(String value) {
            addCriterion("temp_purchase_requisition.audit_state <", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_requisition.audit_state <=", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateLike(String value) {
            addCriterion("temp_purchase_requisition.audit_state like", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateNotLike(String value) {
            addCriterion("temp_purchase_requisition.audit_state not like", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateIn(List<String> values) {
            addCriterion("temp_purchase_requisition.audit_state in", values, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateNotIn(List<String> values) {
            addCriterion("temp_purchase_requisition.audit_state not in", values, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateBetween(String value1, String value2) {
            addCriterion("temp_purchase_requisition.audit_state between", value1, value2, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_requisition.audit_state not between", value1, value2, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditorIsNull() {
            addCriterion("temp_purchase_requisition.auditor is null");
            return (Criteria) this;
        }

        public Criteria andAuditorIsNotNull() {
            addCriterion("temp_purchase_requisition.auditor is not null");
            return (Criteria) this;
        }

        public Criteria andAuditorEqualTo(String value) {
            addCriterion("temp_purchase_requisition.auditor =", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotEqualTo(String value) {
            addCriterion("temp_purchase_requisition.auditor <>", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorGreaterThan(String value) {
            addCriterion("temp_purchase_requisition.auditor >", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_requisition.auditor >=", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorLessThan(String value) {
            addCriterion("temp_purchase_requisition.auditor <", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_requisition.auditor <=", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorLike(String value) {
            addCriterion("temp_purchase_requisition.auditor like", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotLike(String value) {
            addCriterion("temp_purchase_requisition.auditor not like", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorIn(List<String> values) {
            addCriterion("temp_purchase_requisition.auditor in", values, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotIn(List<String> values) {
            addCriterion("temp_purchase_requisition.auditor not in", values, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorBetween(String value1, String value2) {
            addCriterion("temp_purchase_requisition.auditor between", value1, value2, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_requisition.auditor not between", value1, value2, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditDateIsNull() {
            addCriterion("temp_purchase_requisition.audit_date is null");
            return (Criteria) this;
        }

        public Criteria andAuditDateIsNotNull() {
            addCriterion("temp_purchase_requisition.audit_date is not null");
            return (Criteria) this;
        }

        public Criteria andAuditDateEqualTo(Date value) {
            addCriterion("temp_purchase_requisition.audit_date =", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateNotEqualTo(Date value) {
            addCriterion("temp_purchase_requisition.audit_date <>", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateGreaterThan(Date value) {
            addCriterion("temp_purchase_requisition.audit_date >", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_purchase_requisition.audit_date >=", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateLessThan(Date value) {
            addCriterion("temp_purchase_requisition.audit_date <", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateLessThanOrEqualTo(Date value) {
            addCriterion("temp_purchase_requisition.audit_date <=", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateIn(List<Date> values) {
            addCriterion("temp_purchase_requisition.audit_date in", values, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateNotIn(List<Date> values) {
            addCriterion("temp_purchase_requisition.audit_date not in", values, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateBetween(Date value1, Date value2) {
            addCriterion("temp_purchase_requisition.audit_date between", value1, value2, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateNotBetween(Date value1, Date value2) {
            addCriterion("temp_purchase_requisition.audit_date not between", value1, value2, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkIsNull() {
            addCriterion("temp_purchase_requisition.audit_remark is null");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkIsNotNull() {
            addCriterion("temp_purchase_requisition.audit_remark is not null");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkEqualTo(String value) {
            addCriterion("temp_purchase_requisition.audit_remark =", value, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkNotEqualTo(String value) {
            addCriterion("temp_purchase_requisition.audit_remark <>", value, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkGreaterThan(String value) {
            addCriterion("temp_purchase_requisition.audit_remark >", value, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_requisition.audit_remark >=", value, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkLessThan(String value) {
            addCriterion("temp_purchase_requisition.audit_remark <", value, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_requisition.audit_remark <=", value, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkLike(String value) {
            addCriterion("temp_purchase_requisition.audit_remark like", value, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkNotLike(String value) {
            addCriterion("temp_purchase_requisition.audit_remark not like", value, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkIn(List<String> values) {
            addCriterion("temp_purchase_requisition.audit_remark in", values, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkNotIn(List<String> values) {
            addCriterion("temp_purchase_requisition.audit_remark not in", values, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkBetween(String value1, String value2) {
            addCriterion("temp_purchase_requisition.audit_remark between", value1, value2, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_requisition.audit_remark not between", value1, value2, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andEnabledIsNull() {
            addCriterion("temp_purchase_requisition.enabled is null");
            return (Criteria) this;
        }

        public Criteria andEnabledIsNotNull() {
            addCriterion("temp_purchase_requisition.enabled is not null");
            return (Criteria) this;
        }

        public Criteria andEnabledEqualTo(String value) {
            addCriterion("temp_purchase_requisition.enabled =", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotEqualTo(String value) {
            addCriterion("temp_purchase_requisition.enabled <>", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledGreaterThan(String value) {
            addCriterion("temp_purchase_requisition.enabled >", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_requisition.enabled >=", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledLessThan(String value) {
            addCriterion("temp_purchase_requisition.enabled <", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_requisition.enabled <=", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledLike(String value) {
            addCriterion("temp_purchase_requisition.enabled like", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotLike(String value) {
            addCriterion("temp_purchase_requisition.enabled not like", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledIn(List<String> values) {
            addCriterion("temp_purchase_requisition.enabled in", values, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotIn(List<String> values) {
            addCriterion("temp_purchase_requisition.enabled not in", values, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledBetween(String value1, String value2) {
            addCriterion("temp_purchase_requisition.enabled between", value1, value2, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_requisition.enabled not between", value1, value2, "enabled");
            return (Criteria) this;
        }

        public Criteria andSummaryIsNull() {
            addCriterion("temp_purchase_requisition.summary is null");
            return (Criteria) this;
        }

        public Criteria andSummaryIsNotNull() {
            addCriterion("temp_purchase_requisition.summary is not null");
            return (Criteria) this;
        }

        public Criteria andSummaryEqualTo(String value) {
            addCriterion("temp_purchase_requisition.summary =", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryNotEqualTo(String value) {
            addCriterion("temp_purchase_requisition.summary <>", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryGreaterThan(String value) {
            addCriterion("temp_purchase_requisition.summary >", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_requisition.summary >=", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryLessThan(String value) {
            addCriterion("temp_purchase_requisition.summary <", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_requisition.summary <=", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryLike(String value) {
            addCriterion("temp_purchase_requisition.summary like", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryNotLike(String value) {
            addCriterion("temp_purchase_requisition.summary not like", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryIn(List<String> values) {
            addCriterion("temp_purchase_requisition.summary in", values, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryNotIn(List<String> values) {
            addCriterion("temp_purchase_requisition.summary not in", values, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryBetween(String value1, String value2) {
            addCriterion("temp_purchase_requisition.summary between", value1, value2, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_requisition.summary not between", value1, value2, "summary");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("temp_purchase_requisition.remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("temp_purchase_requisition.remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("temp_purchase_requisition.remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("temp_purchase_requisition.remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("temp_purchase_requisition.remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_requisition.remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("temp_purchase_requisition.remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_requisition.remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("temp_purchase_requisition.remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("temp_purchase_requisition.remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("temp_purchase_requisition.remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("temp_purchase_requisition.remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("temp_purchase_requisition.remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_requisition.remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNull() {
            addCriterion("temp_purchase_requisition.creater is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNotNull() {
            addCriterion("temp_purchase_requisition.creater is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterEqualTo(String value) {
            addCriterion("temp_purchase_requisition.creater =", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotEqualTo(String value) {
            addCriterion("temp_purchase_requisition.creater <>", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThan(String value) {
            addCriterion("temp_purchase_requisition.creater >", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_requisition.creater >=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThan(String value) {
            addCriterion("temp_purchase_requisition.creater <", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_requisition.creater <=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLike(String value) {
            addCriterion("temp_purchase_requisition.creater like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotLike(String value) {
            addCriterion("temp_purchase_requisition.creater not like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterIn(List<String> values) {
            addCriterion("temp_purchase_requisition.creater in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotIn(List<String> values) {
            addCriterion("temp_purchase_requisition.creater not in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterBetween(String value1, String value2) {
            addCriterion("temp_purchase_requisition.creater between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_requisition.creater not between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("temp_purchase_requisition.create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("temp_purchase_requisition.create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("temp_purchase_requisition.create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("temp_purchase_requisition.create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("temp_purchase_requisition.create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_purchase_requisition.create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("temp_purchase_requisition.create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_purchase_requisition.create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("temp_purchase_requisition.create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("temp_purchase_requisition.create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_purchase_requisition.create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_purchase_requisition.create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNull() {
            addCriterion("temp_purchase_requisition.updater is null");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNotNull() {
            addCriterion("temp_purchase_requisition.updater is not null");
            return (Criteria) this;
        }

        public Criteria andUpdaterEqualTo(String value) {
            addCriterion("temp_purchase_requisition.updater =", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotEqualTo(String value) {
            addCriterion("temp_purchase_requisition.updater <>", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThan(String value) {
            addCriterion("temp_purchase_requisition.updater >", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_requisition.updater >=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThan(String value) {
            addCriterion("temp_purchase_requisition.updater <", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_requisition.updater <=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLike(String value) {
            addCriterion("temp_purchase_requisition.updater like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotLike(String value) {
            addCriterion("temp_purchase_requisition.updater not like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterIn(List<String> values) {
            addCriterion("temp_purchase_requisition.updater in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotIn(List<String> values) {
            addCriterion("temp_purchase_requisition.updater not in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterBetween(String value1, String value2) {
            addCriterion("temp_purchase_requisition.updater between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_requisition.updater not between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("temp_purchase_requisition.update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("temp_purchase_requisition.update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("temp_purchase_requisition.update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("temp_purchase_requisition.update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("temp_purchase_requisition.update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_purchase_requisition.update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("temp_purchase_requisition.update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_purchase_requisition.update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("temp_purchase_requisition.update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("temp_purchase_requisition.update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_purchase_requisition.update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_purchase_requisition.update_time not between", value1, value2, "updateTime");
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
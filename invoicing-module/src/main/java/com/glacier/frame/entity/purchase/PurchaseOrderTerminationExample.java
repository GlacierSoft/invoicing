package com.glacier.frame.entity.purchase;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PurchaseOrderTerminationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public PurchaseOrderTerminationExample() {
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

        public Criteria andPurOrderTerIdIsNull() {
            addCriterion("temp_purchase_order_termination.pur_order_ter_id is null");
            return (Criteria) this;
        }

        public Criteria andPurOrderTerIdIsNotNull() {
            addCriterion("temp_purchase_order_termination.pur_order_ter_id is not null");
            return (Criteria) this;
        }

        public Criteria andPurOrderTerIdEqualTo(String value) {
            addCriterion("temp_purchase_order_termination.pur_order_ter_id =", value, "purOrderTerId");
            return (Criteria) this;
        }

        public Criteria andPurOrderTerIdNotEqualTo(String value) {
            addCriterion("temp_purchase_order_termination.pur_order_ter_id <>", value, "purOrderTerId");
            return (Criteria) this;
        }

        public Criteria andPurOrderTerIdGreaterThan(String value) {
            addCriterion("temp_purchase_order_termination.pur_order_ter_id >", value, "purOrderTerId");
            return (Criteria) this;
        }

        public Criteria andPurOrderTerIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_order_termination.pur_order_ter_id >=", value, "purOrderTerId");
            return (Criteria) this;
        }

        public Criteria andPurOrderTerIdLessThan(String value) {
            addCriterion("temp_purchase_order_termination.pur_order_ter_id <", value, "purOrderTerId");
            return (Criteria) this;
        }

        public Criteria andPurOrderTerIdLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_order_termination.pur_order_ter_id <=", value, "purOrderTerId");
            return (Criteria) this;
        }

        public Criteria andPurOrderTerIdLike(String value) {
            addCriterion("temp_purchase_order_termination.pur_order_ter_id like", value, "purOrderTerId");
            return (Criteria) this;
        }

        public Criteria andPurOrderTerIdNotLike(String value) {
            addCriterion("temp_purchase_order_termination.pur_order_ter_id not like", value, "purOrderTerId");
            return (Criteria) this;
        }

        public Criteria andPurOrderTerIdIn(List<String> values) {
            addCriterion("temp_purchase_order_termination.pur_order_ter_id in", values, "purOrderTerId");
            return (Criteria) this;
        }

        public Criteria andPurOrderTerIdNotIn(List<String> values) {
            addCriterion("temp_purchase_order_termination.pur_order_ter_id not in", values, "purOrderTerId");
            return (Criteria) this;
        }

        public Criteria andPurOrderTerIdBetween(String value1, String value2) {
            addCriterion("temp_purchase_order_termination.pur_order_ter_id between", value1, value2, "purOrderTerId");
            return (Criteria) this;
        }

        public Criteria andPurOrderTerIdNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_order_termination.pur_order_ter_id not between", value1, value2, "purOrderTerId");
            return (Criteria) this;
        }

        public Criteria andPurOrderIdIsNull() {
            addCriterion("temp_purchase_order_termination.pur_order_id is null");
            return (Criteria) this;
        }

        public Criteria andPurOrderIdIsNotNull() {
            addCriterion("temp_purchase_order_termination.pur_order_id is not null");
            return (Criteria) this;
        }

        public Criteria andPurOrderIdEqualTo(String value) {
            addCriterion("temp_purchase_order_termination.pur_order_id =", value, "purOrderId");
            return (Criteria) this;
        }

        public Criteria andPurOrderIdNotEqualTo(String value) {
            addCriterion("temp_purchase_order_termination.pur_order_id <>", value, "purOrderId");
            return (Criteria) this;
        }

        public Criteria andPurOrderIdGreaterThan(String value) {
            addCriterion("temp_purchase_order_termination.pur_order_id >", value, "purOrderId");
            return (Criteria) this;
        }

        public Criteria andPurOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_order_termination.pur_order_id >=", value, "purOrderId");
            return (Criteria) this;
        }

        public Criteria andPurOrderIdLessThan(String value) {
            addCriterion("temp_purchase_order_termination.pur_order_id <", value, "purOrderId");
            return (Criteria) this;
        }

        public Criteria andPurOrderIdLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_order_termination.pur_order_id <=", value, "purOrderId");
            return (Criteria) this;
        }

        public Criteria andPurOrderIdLike(String value) {
            addCriterion("temp_purchase_order_termination.pur_order_id like", value, "purOrderId");
            return (Criteria) this;
        }

        public Criteria andPurOrderIdNotLike(String value) {
            addCriterion("temp_purchase_order_termination.pur_order_id not like", value, "purOrderId");
            return (Criteria) this;
        }

        public Criteria andPurOrderIdIn(List<String> values) {
            addCriterion("temp_purchase_order_termination.pur_order_id in", values, "purOrderId");
            return (Criteria) this;
        }

        public Criteria andPurOrderIdNotIn(List<String> values) {
            addCriterion("temp_purchase_order_termination.pur_order_id not in", values, "purOrderId");
            return (Criteria) this;
        }

        public Criteria andPurOrderIdBetween(String value1, String value2) {
            addCriterion("temp_purchase_order_termination.pur_order_id between", value1, value2, "purOrderId");
            return (Criteria) this;
        }

        public Criteria andPurOrderIdNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_order_termination.pur_order_id not between", value1, value2, "purOrderId");
            return (Criteria) this;
        }

        public Criteria andTerminationCodeIsNull() {
            addCriterion("temp_purchase_order_termination.termination_code is null");
            return (Criteria) this;
        }

        public Criteria andTerminationCodeIsNotNull() {
            addCriterion("temp_purchase_order_termination.termination_code is not null");
            return (Criteria) this;
        }

        public Criteria andTerminationCodeEqualTo(String value) {
            addCriterion("temp_purchase_order_termination.termination_code =", value, "terminationCode");
            return (Criteria) this;
        }

        public Criteria andTerminationCodeNotEqualTo(String value) {
            addCriterion("temp_purchase_order_termination.termination_code <>", value, "terminationCode");
            return (Criteria) this;
        }

        public Criteria andTerminationCodeGreaterThan(String value) {
            addCriterion("temp_purchase_order_termination.termination_code >", value, "terminationCode");
            return (Criteria) this;
        }

        public Criteria andTerminationCodeGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_order_termination.termination_code >=", value, "terminationCode");
            return (Criteria) this;
        }

        public Criteria andTerminationCodeLessThan(String value) {
            addCriterion("temp_purchase_order_termination.termination_code <", value, "terminationCode");
            return (Criteria) this;
        }

        public Criteria andTerminationCodeLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_order_termination.termination_code <=", value, "terminationCode");
            return (Criteria) this;
        }

        public Criteria andTerminationCodeLike(String value) {
            addCriterion("temp_purchase_order_termination.termination_code like", value, "terminationCode");
            return (Criteria) this;
        }

        public Criteria andTerminationCodeNotLike(String value) {
            addCriterion("temp_purchase_order_termination.termination_code not like", value, "terminationCode");
            return (Criteria) this;
        }

        public Criteria andTerminationCodeIn(List<String> values) {
            addCriterion("temp_purchase_order_termination.termination_code in", values, "terminationCode");
            return (Criteria) this;
        }

        public Criteria andTerminationCodeNotIn(List<String> values) {
            addCriterion("temp_purchase_order_termination.termination_code not in", values, "terminationCode");
            return (Criteria) this;
        }

        public Criteria andTerminationCodeBetween(String value1, String value2) {
            addCriterion("temp_purchase_order_termination.termination_code between", value1, value2, "terminationCode");
            return (Criteria) this;
        }

        public Criteria andTerminationCodeNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_order_termination.termination_code not between", value1, value2, "terminationCode");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("temp_purchase_order_termination.content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("temp_purchase_order_termination.content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("temp_purchase_order_termination.content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("temp_purchase_order_termination.content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("temp_purchase_order_termination.content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_order_termination.content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("temp_purchase_order_termination.content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_order_termination.content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("temp_purchase_order_termination.content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("temp_purchase_order_termination.content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("temp_purchase_order_termination.content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("temp_purchase_order_termination.content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("temp_purchase_order_termination.content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_order_termination.content not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andAccessoryIsNull() {
            addCriterion("temp_purchase_order_termination.accessory is null");
            return (Criteria) this;
        }

        public Criteria andAccessoryIsNotNull() {
            addCriterion("temp_purchase_order_termination.accessory is not null");
            return (Criteria) this;
        }

        public Criteria andAccessoryEqualTo(String value) {
            addCriterion("temp_purchase_order_termination.accessory =", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryNotEqualTo(String value) {
            addCriterion("temp_purchase_order_termination.accessory <>", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryGreaterThan(String value) {
            addCriterion("temp_purchase_order_termination.accessory >", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_order_termination.accessory >=", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryLessThan(String value) {
            addCriterion("temp_purchase_order_termination.accessory <", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_order_termination.accessory <=", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryLike(String value) {
            addCriterion("temp_purchase_order_termination.accessory like", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryNotLike(String value) {
            addCriterion("temp_purchase_order_termination.accessory not like", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryIn(List<String> values) {
            addCriterion("temp_purchase_order_termination.accessory in", values, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryNotIn(List<String> values) {
            addCriterion("temp_purchase_order_termination.accessory not in", values, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryBetween(String value1, String value2) {
            addCriterion("temp_purchase_order_termination.accessory between", value1, value2, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_order_termination.accessory not between", value1, value2, "accessory");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("temp_purchase_order_termination.amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("temp_purchase_order_termination.amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(BigDecimal value) {
            addCriterion("temp_purchase_order_termination.amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(BigDecimal value) {
            addCriterion("temp_purchase_order_termination.amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(BigDecimal value) {
            addCriterion("temp_purchase_order_termination.amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_purchase_order_termination.amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(BigDecimal value) {
            addCriterion("temp_purchase_order_termination.amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_purchase_order_termination.amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<BigDecimal> values) {
            addCriterion("temp_purchase_order_termination.amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<BigDecimal> values) {
            addCriterion("temp_purchase_order_termination.amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_purchase_order_termination.amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_purchase_order_termination.amount not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andOperatorDepIsNull() {
            addCriterion("temp_purchase_order_termination.operator_dep is null");
            return (Criteria) this;
        }

        public Criteria andOperatorDepIsNotNull() {
            addCriterion("temp_purchase_order_termination.operator_dep is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorDepEqualTo(String value) {
            addCriterion("temp_purchase_order_termination.operator_dep =", value, "operatorDep");
            return (Criteria) this;
        }

        public Criteria andOperatorDepNotEqualTo(String value) {
            addCriterion("temp_purchase_order_termination.operator_dep <>", value, "operatorDep");
            return (Criteria) this;
        }

        public Criteria andOperatorDepGreaterThan(String value) {
            addCriterion("temp_purchase_order_termination.operator_dep >", value, "operatorDep");
            return (Criteria) this;
        }

        public Criteria andOperatorDepGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_order_termination.operator_dep >=", value, "operatorDep");
            return (Criteria) this;
        }

        public Criteria andOperatorDepLessThan(String value) {
            addCriterion("temp_purchase_order_termination.operator_dep <", value, "operatorDep");
            return (Criteria) this;
        }

        public Criteria andOperatorDepLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_order_termination.operator_dep <=", value, "operatorDep");
            return (Criteria) this;
        }

        public Criteria andOperatorDepLike(String value) {
            addCriterion("temp_purchase_order_termination.operator_dep like", value, "operatorDep");
            return (Criteria) this;
        }

        public Criteria andOperatorDepNotLike(String value) {
            addCriterion("temp_purchase_order_termination.operator_dep not like", value, "operatorDep");
            return (Criteria) this;
        }

        public Criteria andOperatorDepIn(List<String> values) {
            addCriterion("temp_purchase_order_termination.operator_dep in", values, "operatorDep");
            return (Criteria) this;
        }

        public Criteria andOperatorDepNotIn(List<String> values) {
            addCriterion("temp_purchase_order_termination.operator_dep not in", values, "operatorDep");
            return (Criteria) this;
        }

        public Criteria andOperatorDepBetween(String value1, String value2) {
            addCriterion("temp_purchase_order_termination.operator_dep between", value1, value2, "operatorDep");
            return (Criteria) this;
        }

        public Criteria andOperatorDepNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_order_termination.operator_dep not between", value1, value2, "operatorDep");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNull() {
            addCriterion("temp_purchase_order_termination.creater is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNotNull() {
            addCriterion("temp_purchase_order_termination.creater is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterEqualTo(String value) {
            addCriterion("temp_purchase_order_termination.creater =", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotEqualTo(String value) {
            addCriterion("temp_purchase_order_termination.creater <>", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThan(String value) {
            addCriterion("temp_purchase_order_termination.creater >", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_order_termination.creater >=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThan(String value) {
            addCriterion("temp_purchase_order_termination.creater <", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_order_termination.creater <=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLike(String value) {
            addCriterion("temp_purchase_order_termination.creater like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotLike(String value) {
            addCriterion("temp_purchase_order_termination.creater not like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterIn(List<String> values) {
            addCriterion("temp_purchase_order_termination.creater in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotIn(List<String> values) {
            addCriterion("temp_purchase_order_termination.creater not in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterBetween(String value1, String value2) {
            addCriterion("temp_purchase_order_termination.creater between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_order_termination.creater not between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("temp_purchase_order_termination.create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("temp_purchase_order_termination.create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("temp_purchase_order_termination.create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("temp_purchase_order_termination.create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("temp_purchase_order_termination.create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_purchase_order_termination.create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("temp_purchase_order_termination.create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_purchase_order_termination.create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("temp_purchase_order_termination.create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("temp_purchase_order_termination.create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_purchase_order_termination.create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_purchase_order_termination.create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("temp_purchase_order_termination.remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("temp_purchase_order_termination.remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("temp_purchase_order_termination.remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("temp_purchase_order_termination.remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("temp_purchase_order_termination.remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_order_termination.remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("temp_purchase_order_termination.remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_order_termination.remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("temp_purchase_order_termination.remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("temp_purchase_order_termination.remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("temp_purchase_order_termination.remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("temp_purchase_order_termination.remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("temp_purchase_order_termination.remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_order_termination.remark not between", value1, value2, "remark");
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
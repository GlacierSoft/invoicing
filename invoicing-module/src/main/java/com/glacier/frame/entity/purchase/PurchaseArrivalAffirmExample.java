package com.glacier.frame.entity.purchase;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PurchaseArrivalAffirmExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public PurchaseArrivalAffirmExample() {
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

        public Criteria andPurArrAffIdIsNull() {
            addCriterion("temp_purchase_arrival_affirm.pur_arr_aff_id is null");
            return (Criteria) this;
        }

        public Criteria andPurArrAffIdIsNotNull() {
            addCriterion("temp_purchase_arrival_affirm.pur_arr_aff_id is not null");
            return (Criteria) this;
        }

        public Criteria andPurArrAffIdEqualTo(String value) {
            addCriterion("temp_purchase_arrival_affirm.pur_arr_aff_id =", value, "purArrAffId");
            return (Criteria) this;
        }

        public Criteria andPurArrAffIdNotEqualTo(String value) {
            addCriterion("temp_purchase_arrival_affirm.pur_arr_aff_id <>", value, "purArrAffId");
            return (Criteria) this;
        }

        public Criteria andPurArrAffIdGreaterThan(String value) {
            addCriterion("temp_purchase_arrival_affirm.pur_arr_aff_id >", value, "purArrAffId");
            return (Criteria) this;
        }

        public Criteria andPurArrAffIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_arrival_affirm.pur_arr_aff_id >=", value, "purArrAffId");
            return (Criteria) this;
        }

        public Criteria andPurArrAffIdLessThan(String value) {
            addCriterion("temp_purchase_arrival_affirm.pur_arr_aff_id <", value, "purArrAffId");
            return (Criteria) this;
        }

        public Criteria andPurArrAffIdLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_arrival_affirm.pur_arr_aff_id <=", value, "purArrAffId");
            return (Criteria) this;
        }

        public Criteria andPurArrAffIdLike(String value) {
            addCriterion("temp_purchase_arrival_affirm.pur_arr_aff_id like", value, "purArrAffId");
            return (Criteria) this;
        }

        public Criteria andPurArrAffIdNotLike(String value) {
            addCriterion("temp_purchase_arrival_affirm.pur_arr_aff_id not like", value, "purArrAffId");
            return (Criteria) this;
        }

        public Criteria andPurArrAffIdIn(List<String> values) {
            addCriterion("temp_purchase_arrival_affirm.pur_arr_aff_id in", values, "purArrAffId");
            return (Criteria) this;
        }

        public Criteria andPurArrAffIdNotIn(List<String> values) {
            addCriterion("temp_purchase_arrival_affirm.pur_arr_aff_id not in", values, "purArrAffId");
            return (Criteria) this;
        }

        public Criteria andPurArrAffIdBetween(String value1, String value2) {
            addCriterion("temp_purchase_arrival_affirm.pur_arr_aff_id between", value1, value2, "purArrAffId");
            return (Criteria) this;
        }

        public Criteria andPurArrAffIdNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_arrival_affirm.pur_arr_aff_id not between", value1, value2, "purArrAffId");
            return (Criteria) this;
        }

        public Criteria andPurArrivalIdIsNull() {
            addCriterion("temp_purchase_arrival_affirm.pur_arrival_id is null");
            return (Criteria) this;
        }

        public Criteria andPurArrivalIdIsNotNull() {
            addCriterion("temp_purchase_arrival_affirm.pur_arrival_id is not null");
            return (Criteria) this;
        }

        public Criteria andPurArrivalIdEqualTo(String value) {
            addCriterion("temp_purchase_arrival_affirm.pur_arrival_id =", value, "purArrivalId");
            return (Criteria) this;
        }

        public Criteria andPurArrivalIdNotEqualTo(String value) {
            addCriterion("temp_purchase_arrival_affirm.pur_arrival_id <>", value, "purArrivalId");
            return (Criteria) this;
        }

        public Criteria andPurArrivalIdGreaterThan(String value) {
            addCriterion("temp_purchase_arrival_affirm.pur_arrival_id >", value, "purArrivalId");
            return (Criteria) this;
        }

        public Criteria andPurArrivalIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_arrival_affirm.pur_arrival_id >=", value, "purArrivalId");
            return (Criteria) this;
        }

        public Criteria andPurArrivalIdLessThan(String value) {
            addCriterion("temp_purchase_arrival_affirm.pur_arrival_id <", value, "purArrivalId");
            return (Criteria) this;
        }

        public Criteria andPurArrivalIdLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_arrival_affirm.pur_arrival_id <=", value, "purArrivalId");
            return (Criteria) this;
        }

        public Criteria andPurArrivalIdLike(String value) {
            addCriterion("temp_purchase_arrival_affirm.pur_arrival_id like", value, "purArrivalId");
            return (Criteria) this;
        }

        public Criteria andPurArrivalIdNotLike(String value) {
            addCriterion("temp_purchase_arrival_affirm.pur_arrival_id not like", value, "purArrivalId");
            return (Criteria) this;
        }

        public Criteria andPurArrivalIdIn(List<String> values) {
            addCriterion("temp_purchase_arrival_affirm.pur_arrival_id in", values, "purArrivalId");
            return (Criteria) this;
        }

        public Criteria andPurArrivalIdNotIn(List<String> values) {
            addCriterion("temp_purchase_arrival_affirm.pur_arrival_id not in", values, "purArrivalId");
            return (Criteria) this;
        }

        public Criteria andPurArrivalIdBetween(String value1, String value2) {
            addCriterion("temp_purchase_arrival_affirm.pur_arrival_id between", value1, value2, "purArrivalId");
            return (Criteria) this;
        }

        public Criteria andPurArrivalIdNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_arrival_affirm.pur_arrival_id not between", value1, value2, "purArrivalId");
            return (Criteria) this;
        }

        public Criteria andSignDateIsNull() {
            addCriterion("temp_purchase_arrival_affirm.sign_date is null");
            return (Criteria) this;
        }

        public Criteria andSignDateIsNotNull() {
            addCriterion("temp_purchase_arrival_affirm.sign_date is not null");
            return (Criteria) this;
        }

        public Criteria andSignDateEqualTo(Date value) {
            addCriterion("temp_purchase_arrival_affirm.sign_date =", value, "signDate");
            return (Criteria) this;
        }

        public Criteria andSignDateNotEqualTo(Date value) {
            addCriterion("temp_purchase_arrival_affirm.sign_date <>", value, "signDate");
            return (Criteria) this;
        }

        public Criteria andSignDateGreaterThan(Date value) {
            addCriterion("temp_purchase_arrival_affirm.sign_date >", value, "signDate");
            return (Criteria) this;
        }

        public Criteria andSignDateGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_purchase_arrival_affirm.sign_date >=", value, "signDate");
            return (Criteria) this;
        }

        public Criteria andSignDateLessThan(Date value) {
            addCriterion("temp_purchase_arrival_affirm.sign_date <", value, "signDate");
            return (Criteria) this;
        }

        public Criteria andSignDateLessThanOrEqualTo(Date value) {
            addCriterion("temp_purchase_arrival_affirm.sign_date <=", value, "signDate");
            return (Criteria) this;
        }

        public Criteria andSignDateIn(List<Date> values) {
            addCriterion("temp_purchase_arrival_affirm.sign_date in", values, "signDate");
            return (Criteria) this;
        }

        public Criteria andSignDateNotIn(List<Date> values) {
            addCriterion("temp_purchase_arrival_affirm.sign_date not in", values, "signDate");
            return (Criteria) this;
        }

        public Criteria andSignDateBetween(Date value1, Date value2) {
            addCriterion("temp_purchase_arrival_affirm.sign_date between", value1, value2, "signDate");
            return (Criteria) this;
        }

        public Criteria andSignDateNotBetween(Date value1, Date value2) {
            addCriterion("temp_purchase_arrival_affirm.sign_date not between", value1, value2, "signDate");
            return (Criteria) this;
        }

        public Criteria andSignPersonIsNull() {
            addCriterion("temp_purchase_arrival_affirm.sign_person is null");
            return (Criteria) this;
        }

        public Criteria andSignPersonIsNotNull() {
            addCriterion("temp_purchase_arrival_affirm.sign_person is not null");
            return (Criteria) this;
        }

        public Criteria andSignPersonEqualTo(String value) {
            addCriterion("temp_purchase_arrival_affirm.sign_person =", value, "signPerson");
            return (Criteria) this;
        }

        public Criteria andSignPersonNotEqualTo(String value) {
            addCriterion("temp_purchase_arrival_affirm.sign_person <>", value, "signPerson");
            return (Criteria) this;
        }

        public Criteria andSignPersonGreaterThan(String value) {
            addCriterion("temp_purchase_arrival_affirm.sign_person >", value, "signPerson");
            return (Criteria) this;
        }

        public Criteria andSignPersonGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_arrival_affirm.sign_person >=", value, "signPerson");
            return (Criteria) this;
        }

        public Criteria andSignPersonLessThan(String value) {
            addCriterion("temp_purchase_arrival_affirm.sign_person <", value, "signPerson");
            return (Criteria) this;
        }

        public Criteria andSignPersonLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_arrival_affirm.sign_person <=", value, "signPerson");
            return (Criteria) this;
        }

        public Criteria andSignPersonLike(String value) {
            addCriterion("temp_purchase_arrival_affirm.sign_person like", value, "signPerson");
            return (Criteria) this;
        }

        public Criteria andSignPersonNotLike(String value) {
            addCriterion("temp_purchase_arrival_affirm.sign_person not like", value, "signPerson");
            return (Criteria) this;
        }

        public Criteria andSignPersonIn(List<String> values) {
            addCriterion("temp_purchase_arrival_affirm.sign_person in", values, "signPerson");
            return (Criteria) this;
        }

        public Criteria andSignPersonNotIn(List<String> values) {
            addCriterion("temp_purchase_arrival_affirm.sign_person not in", values, "signPerson");
            return (Criteria) this;
        }

        public Criteria andSignPersonBetween(String value1, String value2) {
            addCriterion("temp_purchase_arrival_affirm.sign_person between", value1, value2, "signPerson");
            return (Criteria) this;
        }

        public Criteria andSignPersonNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_arrival_affirm.sign_person not between", value1, value2, "signPerson");
            return (Criteria) this;
        }

        public Criteria andAffirmDateIsNull() {
            addCriterion("temp_purchase_arrival_affirm.affirm_date is null");
            return (Criteria) this;
        }

        public Criteria andAffirmDateIsNotNull() {
            addCriterion("temp_purchase_arrival_affirm.affirm_date is not null");
            return (Criteria) this;
        }

        public Criteria andAffirmDateEqualTo(Date value) {
            addCriterion("temp_purchase_arrival_affirm.affirm_date =", value, "affirmDate");
            return (Criteria) this;
        }

        public Criteria andAffirmDateNotEqualTo(Date value) {
            addCriterion("temp_purchase_arrival_affirm.affirm_date <>", value, "affirmDate");
            return (Criteria) this;
        }

        public Criteria andAffirmDateGreaterThan(Date value) {
            addCriterion("temp_purchase_arrival_affirm.affirm_date >", value, "affirmDate");
            return (Criteria) this;
        }

        public Criteria andAffirmDateGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_purchase_arrival_affirm.affirm_date >=", value, "affirmDate");
            return (Criteria) this;
        }

        public Criteria andAffirmDateLessThan(Date value) {
            addCriterion("temp_purchase_arrival_affirm.affirm_date <", value, "affirmDate");
            return (Criteria) this;
        }

        public Criteria andAffirmDateLessThanOrEqualTo(Date value) {
            addCriterion("temp_purchase_arrival_affirm.affirm_date <=", value, "affirmDate");
            return (Criteria) this;
        }

        public Criteria andAffirmDateIn(List<Date> values) {
            addCriterion("temp_purchase_arrival_affirm.affirm_date in", values, "affirmDate");
            return (Criteria) this;
        }

        public Criteria andAffirmDateNotIn(List<Date> values) {
            addCriterion("temp_purchase_arrival_affirm.affirm_date not in", values, "affirmDate");
            return (Criteria) this;
        }

        public Criteria andAffirmDateBetween(Date value1, Date value2) {
            addCriterion("temp_purchase_arrival_affirm.affirm_date between", value1, value2, "affirmDate");
            return (Criteria) this;
        }

        public Criteria andAffirmDateNotBetween(Date value1, Date value2) {
            addCriterion("temp_purchase_arrival_affirm.affirm_date not between", value1, value2, "affirmDate");
            return (Criteria) this;
        }

        public Criteria andAffirmPersonIsNull() {
            addCriterion("temp_purchase_arrival_affirm.affirm_person is null");
            return (Criteria) this;
        }

        public Criteria andAffirmPersonIsNotNull() {
            addCriterion("temp_purchase_arrival_affirm.affirm_person is not null");
            return (Criteria) this;
        }

        public Criteria andAffirmPersonEqualTo(String value) {
            addCriterion("temp_purchase_arrival_affirm.affirm_person =", value, "affirmPerson");
            return (Criteria) this;
        }

        public Criteria andAffirmPersonNotEqualTo(String value) {
            addCriterion("temp_purchase_arrival_affirm.affirm_person <>", value, "affirmPerson");
            return (Criteria) this;
        }

        public Criteria andAffirmPersonGreaterThan(String value) {
            addCriterion("temp_purchase_arrival_affirm.affirm_person >", value, "affirmPerson");
            return (Criteria) this;
        }

        public Criteria andAffirmPersonGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_arrival_affirm.affirm_person >=", value, "affirmPerson");
            return (Criteria) this;
        }

        public Criteria andAffirmPersonLessThan(String value) {
            addCriterion("temp_purchase_arrival_affirm.affirm_person <", value, "affirmPerson");
            return (Criteria) this;
        }

        public Criteria andAffirmPersonLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_arrival_affirm.affirm_person <=", value, "affirmPerson");
            return (Criteria) this;
        }

        public Criteria andAffirmPersonLike(String value) {
            addCriterion("temp_purchase_arrival_affirm.affirm_person like", value, "affirmPerson");
            return (Criteria) this;
        }

        public Criteria andAffirmPersonNotLike(String value) {
            addCriterion("temp_purchase_arrival_affirm.affirm_person not like", value, "affirmPerson");
            return (Criteria) this;
        }

        public Criteria andAffirmPersonIn(List<String> values) {
            addCriterion("temp_purchase_arrival_affirm.affirm_person in", values, "affirmPerson");
            return (Criteria) this;
        }

        public Criteria andAffirmPersonNotIn(List<String> values) {
            addCriterion("temp_purchase_arrival_affirm.affirm_person not in", values, "affirmPerson");
            return (Criteria) this;
        }

        public Criteria andAffirmPersonBetween(String value1, String value2) {
            addCriterion("temp_purchase_arrival_affirm.affirm_person between", value1, value2, "affirmPerson");
            return (Criteria) this;
        }

        public Criteria andAffirmPersonNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_arrival_affirm.affirm_person not between", value1, value2, "affirmPerson");
            return (Criteria) this;
        }

        public Criteria andAffirmDepIsNull() {
            addCriterion("temp_purchase_arrival_affirm.affirm_dep is null");
            return (Criteria) this;
        }

        public Criteria andAffirmDepIsNotNull() {
            addCriterion("temp_purchase_arrival_affirm.affirm_dep is not null");
            return (Criteria) this;
        }

        public Criteria andAffirmDepEqualTo(String value) {
            addCriterion("temp_purchase_arrival_affirm.affirm_dep =", value, "affirmDep");
            return (Criteria) this;
        }

        public Criteria andAffirmDepNotEqualTo(String value) {
            addCriterion("temp_purchase_arrival_affirm.affirm_dep <>", value, "affirmDep");
            return (Criteria) this;
        }

        public Criteria andAffirmDepGreaterThan(String value) {
            addCriterion("temp_purchase_arrival_affirm.affirm_dep >", value, "affirmDep");
            return (Criteria) this;
        }

        public Criteria andAffirmDepGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_arrival_affirm.affirm_dep >=", value, "affirmDep");
            return (Criteria) this;
        }

        public Criteria andAffirmDepLessThan(String value) {
            addCriterion("temp_purchase_arrival_affirm.affirm_dep <", value, "affirmDep");
            return (Criteria) this;
        }

        public Criteria andAffirmDepLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_arrival_affirm.affirm_dep <=", value, "affirmDep");
            return (Criteria) this;
        }

        public Criteria andAffirmDepLike(String value) {
            addCriterion("temp_purchase_arrival_affirm.affirm_dep like", value, "affirmDep");
            return (Criteria) this;
        }

        public Criteria andAffirmDepNotLike(String value) {
            addCriterion("temp_purchase_arrival_affirm.affirm_dep not like", value, "affirmDep");
            return (Criteria) this;
        }

        public Criteria andAffirmDepIn(List<String> values) {
            addCriterion("temp_purchase_arrival_affirm.affirm_dep in", values, "affirmDep");
            return (Criteria) this;
        }

        public Criteria andAffirmDepNotIn(List<String> values) {
            addCriterion("temp_purchase_arrival_affirm.affirm_dep not in", values, "affirmDep");
            return (Criteria) this;
        }

        public Criteria andAffirmDepBetween(String value1, String value2) {
            addCriterion("temp_purchase_arrival_affirm.affirm_dep between", value1, value2, "affirmDep");
            return (Criteria) this;
        }

        public Criteria andAffirmDepNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_arrival_affirm.affirm_dep not between", value1, value2, "affirmDep");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("temp_purchase_arrival_affirm.remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("temp_purchase_arrival_affirm.remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("temp_purchase_arrival_affirm.remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("temp_purchase_arrival_affirm.remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("temp_purchase_arrival_affirm.remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_arrival_affirm.remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("temp_purchase_arrival_affirm.remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_arrival_affirm.remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("temp_purchase_arrival_affirm.remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("temp_purchase_arrival_affirm.remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("temp_purchase_arrival_affirm.remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("temp_purchase_arrival_affirm.remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("temp_purchase_arrival_affirm.remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_arrival_affirm.remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNull() {
            addCriterion("temp_purchase_arrival_affirm.creater is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNotNull() {
            addCriterion("temp_purchase_arrival_affirm.creater is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterEqualTo(String value) {
            addCriterion("temp_purchase_arrival_affirm.creater =", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotEqualTo(String value) {
            addCriterion("temp_purchase_arrival_affirm.creater <>", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThan(String value) {
            addCriterion("temp_purchase_arrival_affirm.creater >", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_arrival_affirm.creater >=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThan(String value) {
            addCriterion("temp_purchase_arrival_affirm.creater <", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_arrival_affirm.creater <=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLike(String value) {
            addCriterion("temp_purchase_arrival_affirm.creater like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotLike(String value) {
            addCriterion("temp_purchase_arrival_affirm.creater not like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterIn(List<String> values) {
            addCriterion("temp_purchase_arrival_affirm.creater in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotIn(List<String> values) {
            addCriterion("temp_purchase_arrival_affirm.creater not in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterBetween(String value1, String value2) {
            addCriterion("temp_purchase_arrival_affirm.creater between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_arrival_affirm.creater not between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("temp_purchase_arrival_affirm.create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("temp_purchase_arrival_affirm.create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("temp_purchase_arrival_affirm.create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("temp_purchase_arrival_affirm.create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("temp_purchase_arrival_affirm.create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_purchase_arrival_affirm.create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("temp_purchase_arrival_affirm.create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_purchase_arrival_affirm.create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("temp_purchase_arrival_affirm.create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("temp_purchase_arrival_affirm.create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_purchase_arrival_affirm.create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_purchase_arrival_affirm.create_time not between", value1, value2, "createTime");
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
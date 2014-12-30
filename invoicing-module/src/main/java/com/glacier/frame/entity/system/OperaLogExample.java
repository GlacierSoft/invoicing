package com.glacier.frame.entity.system;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OperaLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public OperaLogExample() {
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

        public Criteria andOperalogIdIsNull() {
            addCriterion("temp_operalog.operalog_id is null");
            return (Criteria) this;
        }

        public Criteria andOperalogIdIsNotNull() {
            addCriterion("temp_operalog.operalog_id is not null");
            return (Criteria) this;
        }

        public Criteria andOperalogIdEqualTo(String value) {
            addCriterion("temp_operalog.operalog_id =", value, "operalogId");
            return (Criteria) this;
        }

        public Criteria andOperalogIdNotEqualTo(String value) {
            addCriterion("temp_operalog.operalog_id <>", value, "operalogId");
            return (Criteria) this;
        }

        public Criteria andOperalogIdGreaterThan(String value) {
            addCriterion("temp_operalog.operalog_id >", value, "operalogId");
            return (Criteria) this;
        }

        public Criteria andOperalogIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_operalog.operalog_id >=", value, "operalogId");
            return (Criteria) this;
        }

        public Criteria andOperalogIdLessThan(String value) {
            addCriterion("temp_operalog.operalog_id <", value, "operalogId");
            return (Criteria) this;
        }

        public Criteria andOperalogIdLessThanOrEqualTo(String value) {
            addCriterion("temp_operalog.operalog_id <=", value, "operalogId");
            return (Criteria) this;
        }

        public Criteria andOperalogIdLike(String value) {
            addCriterion("temp_operalog.operalog_id like", value, "operalogId");
            return (Criteria) this;
        }

        public Criteria andOperalogIdNotLike(String value) {
            addCriterion("temp_operalog.operalog_id not like", value, "operalogId");
            return (Criteria) this;
        }

        public Criteria andOperalogIdIn(List<String> values) {
            addCriterion("temp_operalog.operalog_id in", values, "operalogId");
            return (Criteria) this;
        }

        public Criteria andOperalogIdNotIn(List<String> values) {
            addCriterion("temp_operalog.operalog_id not in", values, "operalogId");
            return (Criteria) this;
        }

        public Criteria andOperalogIdBetween(String value1, String value2) {
            addCriterion("temp_operalog.operalog_id between", value1, value2, "operalogId");
            return (Criteria) this;
        }

        public Criteria andOperalogIdNotBetween(String value1, String value2) {
            addCriterion("temp_operalog.operalog_id not between", value1, value2, "operalogId");
            return (Criteria) this;
        }

        public Criteria andOperaMenuIsNull() {
            addCriterion("temp_operalog.opera_menu is null");
            return (Criteria) this;
        }

        public Criteria andOperaMenuIsNotNull() {
            addCriterion("temp_operalog.opera_menu is not null");
            return (Criteria) this;
        }

        public Criteria andOperaMenuEqualTo(String value) {
            addCriterion("temp_operalog.opera_menu =", value, "operaMenu");
            return (Criteria) this;
        }

        public Criteria andOperaMenuNotEqualTo(String value) {
            addCriterion("temp_operalog.opera_menu <>", value, "operaMenu");
            return (Criteria) this;
        }

        public Criteria andOperaMenuGreaterThan(String value) {
            addCriterion("temp_operalog.opera_menu >", value, "operaMenu");
            return (Criteria) this;
        }

        public Criteria andOperaMenuGreaterThanOrEqualTo(String value) {
            addCriterion("temp_operalog.opera_menu >=", value, "operaMenu");
            return (Criteria) this;
        }

        public Criteria andOperaMenuLessThan(String value) {
            addCriterion("temp_operalog.opera_menu <", value, "operaMenu");
            return (Criteria) this;
        }

        public Criteria andOperaMenuLessThanOrEqualTo(String value) {
            addCriterion("temp_operalog.opera_menu <=", value, "operaMenu");
            return (Criteria) this;
        }

        public Criteria andOperaMenuLike(String value) {
            addCriterion("temp_operalog.opera_menu like", value, "operaMenu");
            return (Criteria) this;
        }

        public Criteria andOperaMenuNotLike(String value) {
            addCriterion("temp_operalog.opera_menu not like", value, "operaMenu");
            return (Criteria) this;
        }

        public Criteria andOperaMenuIn(List<String> values) {
            addCriterion("temp_operalog.opera_menu in", values, "operaMenu");
            return (Criteria) this;
        }

        public Criteria andOperaMenuNotIn(List<String> values) {
            addCriterion("temp_operalog.opera_menu not in", values, "operaMenu");
            return (Criteria) this;
        }

        public Criteria andOperaMenuBetween(String value1, String value2) {
            addCriterion("temp_operalog.opera_menu between", value1, value2, "operaMenu");
            return (Criteria) this;
        }

        public Criteria andOperaMenuNotBetween(String value1, String value2) {
            addCriterion("temp_operalog.opera_menu not between", value1, value2, "operaMenu");
            return (Criteria) this;
        }

        public Criteria andOperaPenalIsNull() {
            addCriterion("temp_operalog.opera_penal is null");
            return (Criteria) this;
        }

        public Criteria andOperaPenalIsNotNull() {
            addCriterion("temp_operalog.opera_penal is not null");
            return (Criteria) this;
        }

        public Criteria andOperaPenalEqualTo(String value) {
            addCriterion("temp_operalog.opera_penal =", value, "operaPenal");
            return (Criteria) this;
        }

        public Criteria andOperaPenalNotEqualTo(String value) {
            addCriterion("temp_operalog.opera_penal <>", value, "operaPenal");
            return (Criteria) this;
        }

        public Criteria andOperaPenalGreaterThan(String value) {
            addCriterion("temp_operalog.opera_penal >", value, "operaPenal");
            return (Criteria) this;
        }

        public Criteria andOperaPenalGreaterThanOrEqualTo(String value) {
            addCriterion("temp_operalog.opera_penal >=", value, "operaPenal");
            return (Criteria) this;
        }

        public Criteria andOperaPenalLessThan(String value) {
            addCriterion("temp_operalog.opera_penal <", value, "operaPenal");
            return (Criteria) this;
        }

        public Criteria andOperaPenalLessThanOrEqualTo(String value) {
            addCriterion("temp_operalog.opera_penal <=", value, "operaPenal");
            return (Criteria) this;
        }

        public Criteria andOperaPenalLike(String value) {
            addCriterion("temp_operalog.opera_penal like", value, "operaPenal");
            return (Criteria) this;
        }

        public Criteria andOperaPenalNotLike(String value) {
            addCriterion("temp_operalog.opera_penal not like", value, "operaPenal");
            return (Criteria) this;
        }

        public Criteria andOperaPenalIn(List<String> values) {
            addCriterion("temp_operalog.opera_penal in", values, "operaPenal");
            return (Criteria) this;
        }

        public Criteria andOperaPenalNotIn(List<String> values) {
            addCriterion("temp_operalog.opera_penal not in", values, "operaPenal");
            return (Criteria) this;
        }

        public Criteria andOperaPenalBetween(String value1, String value2) {
            addCriterion("temp_operalog.opera_penal between", value1, value2, "operaPenal");
            return (Criteria) this;
        }

        public Criteria andOperaPenalNotBetween(String value1, String value2) {
            addCriterion("temp_operalog.opera_penal not between", value1, value2, "operaPenal");
            return (Criteria) this;
        }

        public Criteria andOperaMethodIsNull() {
            addCriterion("temp_operalog.opera_method is null");
            return (Criteria) this;
        }

        public Criteria andOperaMethodIsNotNull() {
            addCriterion("temp_operalog.opera_method is not null");
            return (Criteria) this;
        }

        public Criteria andOperaMethodEqualTo(String value) {
            addCriterion("temp_operalog.opera_method =", value, "operaMethod");
            return (Criteria) this;
        }

        public Criteria andOperaMethodNotEqualTo(String value) {
            addCriterion("temp_operalog.opera_method <>", value, "operaMethod");
            return (Criteria) this;
        }

        public Criteria andOperaMethodGreaterThan(String value) {
            addCriterion("temp_operalog.opera_method >", value, "operaMethod");
            return (Criteria) this;
        }

        public Criteria andOperaMethodGreaterThanOrEqualTo(String value) {
            addCriterion("temp_operalog.opera_method >=", value, "operaMethod");
            return (Criteria) this;
        }

        public Criteria andOperaMethodLessThan(String value) {
            addCriterion("temp_operalog.opera_method <", value, "operaMethod");
            return (Criteria) this;
        }

        public Criteria andOperaMethodLessThanOrEqualTo(String value) {
            addCriterion("temp_operalog.opera_method <=", value, "operaMethod");
            return (Criteria) this;
        }

        public Criteria andOperaMethodLike(String value) {
            addCriterion("temp_operalog.opera_method like", value, "operaMethod");
            return (Criteria) this;
        }

        public Criteria andOperaMethodNotLike(String value) {
            addCriterion("temp_operalog.opera_method not like", value, "operaMethod");
            return (Criteria) this;
        }

        public Criteria andOperaMethodIn(List<String> values) {
            addCriterion("temp_operalog.opera_method in", values, "operaMethod");
            return (Criteria) this;
        }

        public Criteria andOperaMethodNotIn(List<String> values) {
            addCriterion("temp_operalog.opera_method not in", values, "operaMethod");
            return (Criteria) this;
        }

        public Criteria andOperaMethodBetween(String value1, String value2) {
            addCriterion("temp_operalog.opera_method between", value1, value2, "operaMethod");
            return (Criteria) this;
        }

        public Criteria andOperaMethodNotBetween(String value1, String value2) {
            addCriterion("temp_operalog.opera_method not between", value1, value2, "operaMethod");
            return (Criteria) this;
        }

        public Criteria andOperaResultIsNull() {
            addCriterion("temp_operalog.opera_result is null");
            return (Criteria) this;
        }

        public Criteria andOperaResultIsNotNull() {
            addCriterion("temp_operalog.opera_result is not null");
            return (Criteria) this;
        }

        public Criteria andOperaResultEqualTo(String value) {
            addCriterion("temp_operalog.opera_result =", value, "operaResult");
            return (Criteria) this;
        }

        public Criteria andOperaResultNotEqualTo(String value) {
            addCriterion("temp_operalog.opera_result <>", value, "operaResult");
            return (Criteria) this;
        }

        public Criteria andOperaResultGreaterThan(String value) {
            addCriterion("temp_operalog.opera_result >", value, "operaResult");
            return (Criteria) this;
        }

        public Criteria andOperaResultGreaterThanOrEqualTo(String value) {
            addCriterion("temp_operalog.opera_result >=", value, "operaResult");
            return (Criteria) this;
        }

        public Criteria andOperaResultLessThan(String value) {
            addCriterion("temp_operalog.opera_result <", value, "operaResult");
            return (Criteria) this;
        }

        public Criteria andOperaResultLessThanOrEqualTo(String value) {
            addCriterion("temp_operalog.opera_result <=", value, "operaResult");
            return (Criteria) this;
        }

        public Criteria andOperaResultLike(String value) {
            addCriterion("temp_operalog.opera_result like", value, "operaResult");
            return (Criteria) this;
        }

        public Criteria andOperaResultNotLike(String value) {
            addCriterion("temp_operalog.opera_result not like", value, "operaResult");
            return (Criteria) this;
        }

        public Criteria andOperaResultIn(List<String> values) {
            addCriterion("temp_operalog.opera_result in", values, "operaResult");
            return (Criteria) this;
        }

        public Criteria andOperaResultNotIn(List<String> values) {
            addCriterion("temp_operalog.opera_result not in", values, "operaResult");
            return (Criteria) this;
        }

        public Criteria andOperaResultBetween(String value1, String value2) {
            addCriterion("temp_operalog.opera_result between", value1, value2, "operaResult");
            return (Criteria) this;
        }

        public Criteria andOperaResultNotBetween(String value1, String value2) {
            addCriterion("temp_operalog.opera_result not between", value1, value2, "operaResult");
            return (Criteria) this;
        }

        public Criteria andOperaDescIsNull() {
            addCriterion("temp_operalog.opera_desc is null");
            return (Criteria) this;
        }

        public Criteria andOperaDescIsNotNull() {
            addCriterion("temp_operalog.opera_desc is not null");
            return (Criteria) this;
        }

        public Criteria andOperaDescEqualTo(String value) {
            addCriterion("temp_operalog.opera_desc =", value, "operaDesc");
            return (Criteria) this;
        }

        public Criteria andOperaDescNotEqualTo(String value) {
            addCriterion("temp_operalog.opera_desc <>", value, "operaDesc");
            return (Criteria) this;
        }

        public Criteria andOperaDescGreaterThan(String value) {
            addCriterion("temp_operalog.opera_desc >", value, "operaDesc");
            return (Criteria) this;
        }

        public Criteria andOperaDescGreaterThanOrEqualTo(String value) {
            addCriterion("temp_operalog.opera_desc >=", value, "operaDesc");
            return (Criteria) this;
        }

        public Criteria andOperaDescLessThan(String value) {
            addCriterion("temp_operalog.opera_desc <", value, "operaDesc");
            return (Criteria) this;
        }

        public Criteria andOperaDescLessThanOrEqualTo(String value) {
            addCriterion("temp_operalog.opera_desc <=", value, "operaDesc");
            return (Criteria) this;
        }

        public Criteria andOperaDescLike(String value) {
            addCriterion("temp_operalog.opera_desc like", value, "operaDesc");
            return (Criteria) this;
        }

        public Criteria andOperaDescNotLike(String value) {
            addCriterion("temp_operalog.opera_desc not like", value, "operaDesc");
            return (Criteria) this;
        }

        public Criteria andOperaDescIn(List<String> values) {
            addCriterion("temp_operalog.opera_desc in", values, "operaDesc");
            return (Criteria) this;
        }

        public Criteria andOperaDescNotIn(List<String> values) {
            addCriterion("temp_operalog.opera_desc not in", values, "operaDesc");
            return (Criteria) this;
        }

        public Criteria andOperaDescBetween(String value1, String value2) {
            addCriterion("temp_operalog.opera_desc between", value1, value2, "operaDesc");
            return (Criteria) this;
        }

        public Criteria andOperaDescNotBetween(String value1, String value2) {
            addCriterion("temp_operalog.opera_desc not between", value1, value2, "operaDesc");
            return (Criteria) this;
        }

        public Criteria andOperaClassIsNull() {
            addCriterion("temp_operalog.opera_class is null");
            return (Criteria) this;
        }

        public Criteria andOperaClassIsNotNull() {
            addCriterion("temp_operalog.opera_class is not null");
            return (Criteria) this;
        }

        public Criteria andOperaClassEqualTo(String value) {
            addCriterion("temp_operalog.opera_class =", value, "operaClass");
            return (Criteria) this;
        }

        public Criteria andOperaClassNotEqualTo(String value) {
            addCriterion("temp_operalog.opera_class <>", value, "operaClass");
            return (Criteria) this;
        }

        public Criteria andOperaClassGreaterThan(String value) {
            addCriterion("temp_operalog.opera_class >", value, "operaClass");
            return (Criteria) this;
        }

        public Criteria andOperaClassGreaterThanOrEqualTo(String value) {
            addCriterion("temp_operalog.opera_class >=", value, "operaClass");
            return (Criteria) this;
        }

        public Criteria andOperaClassLessThan(String value) {
            addCriterion("temp_operalog.opera_class <", value, "operaClass");
            return (Criteria) this;
        }

        public Criteria andOperaClassLessThanOrEqualTo(String value) {
            addCriterion("temp_operalog.opera_class <=", value, "operaClass");
            return (Criteria) this;
        }

        public Criteria andOperaClassLike(String value) {
            addCriterion("temp_operalog.opera_class like", value, "operaClass");
            return (Criteria) this;
        }

        public Criteria andOperaClassNotLike(String value) {
            addCriterion("temp_operalog.opera_class not like", value, "operaClass");
            return (Criteria) this;
        }

        public Criteria andOperaClassIn(List<String> values) {
            addCriterion("temp_operalog.opera_class in", values, "operaClass");
            return (Criteria) this;
        }

        public Criteria andOperaClassNotIn(List<String> values) {
            addCriterion("temp_operalog.opera_class not in", values, "operaClass");
            return (Criteria) this;
        }

        public Criteria andOperaClassBetween(String value1, String value2) {
            addCriterion("temp_operalog.opera_class between", value1, value2, "operaClass");
            return (Criteria) this;
        }

        public Criteria andOperaClassNotBetween(String value1, String value2) {
            addCriterion("temp_operalog.opera_class not between", value1, value2, "operaClass");
            return (Criteria) this;
        }

        public Criteria andOperaMdIsNull() {
            addCriterion("temp_operalog.opera_md is null");
            return (Criteria) this;
        }

        public Criteria andOperaMdIsNotNull() {
            addCriterion("temp_operalog.opera_md is not null");
            return (Criteria) this;
        }

        public Criteria andOperaMdEqualTo(String value) {
            addCriterion("temp_operalog.opera_md =", value, "operaMd");
            return (Criteria) this;
        }

        public Criteria andOperaMdNotEqualTo(String value) {
            addCriterion("temp_operalog.opera_md <>", value, "operaMd");
            return (Criteria) this;
        }

        public Criteria andOperaMdGreaterThan(String value) {
            addCriterion("temp_operalog.opera_md >", value, "operaMd");
            return (Criteria) this;
        }

        public Criteria andOperaMdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_operalog.opera_md >=", value, "operaMd");
            return (Criteria) this;
        }

        public Criteria andOperaMdLessThan(String value) {
            addCriterion("temp_operalog.opera_md <", value, "operaMd");
            return (Criteria) this;
        }

        public Criteria andOperaMdLessThanOrEqualTo(String value) {
            addCriterion("temp_operalog.opera_md <=", value, "operaMd");
            return (Criteria) this;
        }

        public Criteria andOperaMdLike(String value) {
            addCriterion("temp_operalog.opera_md like", value, "operaMd");
            return (Criteria) this;
        }

        public Criteria andOperaMdNotLike(String value) {
            addCriterion("temp_operalog.opera_md not like", value, "operaMd");
            return (Criteria) this;
        }

        public Criteria andOperaMdIn(List<String> values) {
            addCriterion("temp_operalog.opera_md in", values, "operaMd");
            return (Criteria) this;
        }

        public Criteria andOperaMdNotIn(List<String> values) {
            addCriterion("temp_operalog.opera_md not in", values, "operaMd");
            return (Criteria) this;
        }

        public Criteria andOperaMdBetween(String value1, String value2) {
            addCriterion("temp_operalog.opera_md between", value1, value2, "operaMd");
            return (Criteria) this;
        }

        public Criteria andOperaMdNotBetween(String value1, String value2) {
            addCriterion("temp_operalog.opera_md not between", value1, value2, "operaMd");
            return (Criteria) this;
        }

        public Criteria andOperaKeyIsNull() {
            addCriterion("temp_operalog.opera_key is null");
            return (Criteria) this;
        }

        public Criteria andOperaKeyIsNotNull() {
            addCriterion("temp_operalog.opera_key is not null");
            return (Criteria) this;
        }

        public Criteria andOperaKeyEqualTo(String value) {
            addCriterion("temp_operalog.opera_key =", value, "operaKey");
            return (Criteria) this;
        }

        public Criteria andOperaKeyNotEqualTo(String value) {
            addCriterion("temp_operalog.opera_key <>", value, "operaKey");
            return (Criteria) this;
        }

        public Criteria andOperaKeyGreaterThan(String value) {
            addCriterion("temp_operalog.opera_key >", value, "operaKey");
            return (Criteria) this;
        }

        public Criteria andOperaKeyGreaterThanOrEqualTo(String value) {
            addCriterion("temp_operalog.opera_key >=", value, "operaKey");
            return (Criteria) this;
        }

        public Criteria andOperaKeyLessThan(String value) {
            addCriterion("temp_operalog.opera_key <", value, "operaKey");
            return (Criteria) this;
        }

        public Criteria andOperaKeyLessThanOrEqualTo(String value) {
            addCriterion("temp_operalog.opera_key <=", value, "operaKey");
            return (Criteria) this;
        }

        public Criteria andOperaKeyLike(String value) {
            addCriterion("temp_operalog.opera_key like", value, "operaKey");
            return (Criteria) this;
        }

        public Criteria andOperaKeyNotLike(String value) {
            addCriterion("temp_operalog.opera_key not like", value, "operaKey");
            return (Criteria) this;
        }

        public Criteria andOperaKeyIn(List<String> values) {
            addCriterion("temp_operalog.opera_key in", values, "operaKey");
            return (Criteria) this;
        }

        public Criteria andOperaKeyNotIn(List<String> values) {
            addCriterion("temp_operalog.opera_key not in", values, "operaKey");
            return (Criteria) this;
        }

        public Criteria andOperaKeyBetween(String value1, String value2) {
            addCriterion("temp_operalog.opera_key between", value1, value2, "operaKey");
            return (Criteria) this;
        }

        public Criteria andOperaKeyNotBetween(String value1, String value2) {
            addCriterion("temp_operalog.opera_key not between", value1, value2, "operaKey");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNull() {
            addCriterion("temp_operalog.operator is null");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNotNull() {
            addCriterion("temp_operalog.operator is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorEqualTo(String value) {
            addCriterion("temp_operalog.operator =", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotEqualTo(String value) {
            addCriterion("temp_operalog.operator <>", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThan(String value) {
            addCriterion("temp_operalog.operator >", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThanOrEqualTo(String value) {
            addCriterion("temp_operalog.operator >=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThan(String value) {
            addCriterion("temp_operalog.operator <", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThanOrEqualTo(String value) {
            addCriterion("temp_operalog.operator <=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLike(String value) {
            addCriterion("temp_operalog.operator like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotLike(String value) {
            addCriterion("temp_operalog.operator not like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorIn(List<String> values) {
            addCriterion("temp_operalog.operator in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotIn(List<String> values) {
            addCriterion("temp_operalog.operator not in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorBetween(String value1, String value2) {
            addCriterion("temp_operalog.operator between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotBetween(String value1, String value2) {
            addCriterion("temp_operalog.operator not between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andOperaTimeIsNull() {
            addCriterion("temp_operalog.opera_time is null");
            return (Criteria) this;
        }

        public Criteria andOperaTimeIsNotNull() {
            addCriterion("temp_operalog.opera_time is not null");
            return (Criteria) this;
        }

        public Criteria andOperaTimeEqualTo(Date value) {
            addCriterion("temp_operalog.opera_time =", value, "operaTime");
            return (Criteria) this;
        }

        public Criteria andOperaTimeNotEqualTo(Date value) {
            addCriterion("temp_operalog.opera_time <>", value, "operaTime");
            return (Criteria) this;
        }

        public Criteria andOperaTimeGreaterThan(Date value) {
            addCriterion("temp_operalog.opera_time >", value, "operaTime");
            return (Criteria) this;
        }

        public Criteria andOperaTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_operalog.opera_time >=", value, "operaTime");
            return (Criteria) this;
        }

        public Criteria andOperaTimeLessThan(Date value) {
            addCriterion("temp_operalog.opera_time <", value, "operaTime");
            return (Criteria) this;
        }

        public Criteria andOperaTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_operalog.opera_time <=", value, "operaTime");
            return (Criteria) this;
        }

        public Criteria andOperaTimeIn(List<Date> values) {
            addCriterion("temp_operalog.opera_time in", values, "operaTime");
            return (Criteria) this;
        }

        public Criteria andOperaTimeNotIn(List<Date> values) {
            addCriterion("temp_operalog.opera_time not in", values, "operaTime");
            return (Criteria) this;
        }

        public Criteria andOperaTimeBetween(Date value1, Date value2) {
            addCriterion("temp_operalog.opera_time between", value1, value2, "operaTime");
            return (Criteria) this;
        }

        public Criteria andOperaTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_operalog.opera_time not between", value1, value2, "operaTime");
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
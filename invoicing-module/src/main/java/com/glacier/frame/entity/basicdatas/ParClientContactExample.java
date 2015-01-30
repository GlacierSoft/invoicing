package com.glacier.frame.entity.basicdatas;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ParClientContactExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public ParClientContactExample() {
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

        public Criteria andClientContactIdIsNull() {
            addCriterion("temp_par_client_contact.client_contact_id is null");
            return (Criteria) this;
        }

        public Criteria andClientContactIdIsNotNull() {
            addCriterion("temp_par_client_contact.client_contact_id is not null");
            return (Criteria) this;
        }

        public Criteria andClientContactIdEqualTo(String value) {
            addCriterion("temp_par_client_contact.client_contact_id =", value, "clientContactId");
            return (Criteria) this;
        }

        public Criteria andClientContactIdNotEqualTo(String value) {
            addCriterion("temp_par_client_contact.client_contact_id <>", value, "clientContactId");
            return (Criteria) this;
        }

        public Criteria andClientContactIdGreaterThan(String value) {
            addCriterion("temp_par_client_contact.client_contact_id >", value, "clientContactId");
            return (Criteria) this;
        }

        public Criteria andClientContactIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_par_client_contact.client_contact_id >=", value, "clientContactId");
            return (Criteria) this;
        }

        public Criteria andClientContactIdLessThan(String value) {
            addCriterion("temp_par_client_contact.client_contact_id <", value, "clientContactId");
            return (Criteria) this;
        }

        public Criteria andClientContactIdLessThanOrEqualTo(String value) {
            addCriterion("temp_par_client_contact.client_contact_id <=", value, "clientContactId");
            return (Criteria) this;
        }

        public Criteria andClientContactIdLike(String value) {
            addCriterion("temp_par_client_contact.client_contact_id like", value, "clientContactId");
            return (Criteria) this;
        }

        public Criteria andClientContactIdNotLike(String value) {
            addCriterion("temp_par_client_contact.client_contact_id not like", value, "clientContactId");
            return (Criteria) this;
        }

        public Criteria andClientContactIdIn(List<String> values) {
            addCriterion("temp_par_client_contact.client_contact_id in", values, "clientContactId");
            return (Criteria) this;
        }

        public Criteria andClientContactIdNotIn(List<String> values) {
            addCriterion("temp_par_client_contact.client_contact_id not in", values, "clientContactId");
            return (Criteria) this;
        }

        public Criteria andClientContactIdBetween(String value1, String value2) {
            addCriterion("temp_par_client_contact.client_contact_id between", value1, value2, "clientContactId");
            return (Criteria) this;
        }

        public Criteria andClientContactIdNotBetween(String value1, String value2) {
            addCriterion("temp_par_client_contact.client_contact_id not between", value1, value2, "clientContactId");
            return (Criteria) this;
        }

        public Criteria andClientIdIsNull() {
            addCriterion("temp_par_client_contact.client_id is null");
            return (Criteria) this;
        }

        public Criteria andClientIdIsNotNull() {
            addCriterion("temp_par_client_contact.client_id is not null");
            return (Criteria) this;
        }

        public Criteria andClientIdEqualTo(String value) {
            addCriterion("temp_par_client_contact.client_id =", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdNotEqualTo(String value) {
            addCriterion("temp_par_client_contact.client_id <>", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdGreaterThan(String value) {
            addCriterion("temp_par_client_contact.client_id >", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_par_client_contact.client_id >=", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdLessThan(String value) {
            addCriterion("temp_par_client_contact.client_id <", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdLessThanOrEqualTo(String value) {
            addCriterion("temp_par_client_contact.client_id <=", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdLike(String value) {
            addCriterion("temp_par_client_contact.client_id like", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdNotLike(String value) {
            addCriterion("temp_par_client_contact.client_id not like", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdIn(List<String> values) {
            addCriterion("temp_par_client_contact.client_id in", values, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdNotIn(List<String> values) {
            addCriterion("temp_par_client_contact.client_id not in", values, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdBetween(String value1, String value2) {
            addCriterion("temp_par_client_contact.client_id between", value1, value2, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdNotBetween(String value1, String value2) {
            addCriterion("temp_par_client_contact.client_id not between", value1, value2, "clientId");
            return (Criteria) this;
        }

        public Criteria andContactTypeIdIsNull() {
            addCriterion("temp_par_client_contact.contact_type_id is null");
            return (Criteria) this;
        }

        public Criteria andContactTypeIdIsNotNull() {
            addCriterion("temp_par_client_contact.contact_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andContactTypeIdEqualTo(String value) {
            addCriterion("temp_par_client_contact.contact_type_id =", value, "contactTypeId");
            return (Criteria) this;
        }

        public Criteria andContactTypeIdNotEqualTo(String value) {
            addCriterion("temp_par_client_contact.contact_type_id <>", value, "contactTypeId");
            return (Criteria) this;
        }

        public Criteria andContactTypeIdGreaterThan(String value) {
            addCriterion("temp_par_client_contact.contact_type_id >", value, "contactTypeId");
            return (Criteria) this;
        }

        public Criteria andContactTypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_par_client_contact.contact_type_id >=", value, "contactTypeId");
            return (Criteria) this;
        }

        public Criteria andContactTypeIdLessThan(String value) {
            addCriterion("temp_par_client_contact.contact_type_id <", value, "contactTypeId");
            return (Criteria) this;
        }

        public Criteria andContactTypeIdLessThanOrEqualTo(String value) {
            addCriterion("temp_par_client_contact.contact_type_id <=", value, "contactTypeId");
            return (Criteria) this;
        }

        public Criteria andContactTypeIdLike(String value) {
            addCriterion("temp_par_client_contact.contact_type_id like", value, "contactTypeId");
            return (Criteria) this;
        }

        public Criteria andContactTypeIdNotLike(String value) {
            addCriterion("temp_par_client_contact.contact_type_id not like", value, "contactTypeId");
            return (Criteria) this;
        }

        public Criteria andContactTypeIdIn(List<String> values) {
            addCriterion("temp_par_client_contact.contact_type_id in", values, "contactTypeId");
            return (Criteria) this;
        }

        public Criteria andContactTypeIdNotIn(List<String> values) {
            addCriterion("temp_par_client_contact.contact_type_id not in", values, "contactTypeId");
            return (Criteria) this;
        }

        public Criteria andContactTypeIdBetween(String value1, String value2) {
            addCriterion("temp_par_client_contact.contact_type_id between", value1, value2, "contactTypeId");
            return (Criteria) this;
        }

        public Criteria andContactTypeIdNotBetween(String value1, String value2) {
            addCriterion("temp_par_client_contact.contact_type_id not between", value1, value2, "contactTypeId");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("temp_par_client_contact.name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("temp_par_client_contact.name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("temp_par_client_contact.name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("temp_par_client_contact.name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("temp_par_client_contact.name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("temp_par_client_contact.name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("temp_par_client_contact.name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("temp_par_client_contact.name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("temp_par_client_contact.name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("temp_par_client_contact.name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("temp_par_client_contact.name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("temp_par_client_contact.name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("temp_par_client_contact.name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("temp_par_client_contact.name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("temp_par_client_contact.sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("temp_par_client_contact.sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("temp_par_client_contact.sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("temp_par_client_contact.sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("temp_par_client_contact.sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("temp_par_client_contact.sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("temp_par_client_contact.sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("temp_par_client_contact.sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("temp_par_client_contact.sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("temp_par_client_contact.sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("temp_par_client_contact.sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("temp_par_client_contact.sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("temp_par_client_contact.sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("temp_par_client_contact.sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNull() {
            addCriterion("temp_par_client_contact.department is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNotNull() {
            addCriterion("temp_par_client_contact.department is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentEqualTo(String value) {
            addCriterion("temp_par_client_contact.department =", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotEqualTo(String value) {
            addCriterion("temp_par_client_contact.department <>", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThan(String value) {
            addCriterion("temp_par_client_contact.department >", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("temp_par_client_contact.department >=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThan(String value) {
            addCriterion("temp_par_client_contact.department <", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThanOrEqualTo(String value) {
            addCriterion("temp_par_client_contact.department <=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLike(String value) {
            addCriterion("temp_par_client_contact.department like", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotLike(String value) {
            addCriterion("temp_par_client_contact.department not like", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentIn(List<String> values) {
            addCriterion("temp_par_client_contact.department in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotIn(List<String> values) {
            addCriterion("temp_par_client_contact.department not in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentBetween(String value1, String value2) {
            addCriterion("temp_par_client_contact.department between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotBetween(String value1, String value2) {
            addCriterion("temp_par_client_contact.department not between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andPostIsNull() {
            addCriterion("temp_par_client_contact.post is null");
            return (Criteria) this;
        }

        public Criteria andPostIsNotNull() {
            addCriterion("temp_par_client_contact.post is not null");
            return (Criteria) this;
        }

        public Criteria andPostEqualTo(String value) {
            addCriterion("temp_par_client_contact.post =", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostNotEqualTo(String value) {
            addCriterion("temp_par_client_contact.post <>", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostGreaterThan(String value) {
            addCriterion("temp_par_client_contact.post >", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostGreaterThanOrEqualTo(String value) {
            addCriterion("temp_par_client_contact.post >=", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostLessThan(String value) {
            addCriterion("temp_par_client_contact.post <", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostLessThanOrEqualTo(String value) {
            addCriterion("temp_par_client_contact.post <=", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostLike(String value) {
            addCriterion("temp_par_client_contact.post like", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostNotLike(String value) {
            addCriterion("temp_par_client_contact.post not like", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostIn(List<String> values) {
            addCriterion("temp_par_client_contact.post in", values, "post");
            return (Criteria) this;
        }

        public Criteria andPostNotIn(List<String> values) {
            addCriterion("temp_par_client_contact.post not in", values, "post");
            return (Criteria) this;
        }

        public Criteria andPostBetween(String value1, String value2) {
            addCriterion("temp_par_client_contact.post between", value1, value2, "post");
            return (Criteria) this;
        }

        public Criteria andPostNotBetween(String value1, String value2) {
            addCriterion("temp_par_client_contact.post not between", value1, value2, "post");
            return (Criteria) this;
        }

        public Criteria andBusinessIsNull() {
            addCriterion("temp_par_client_contact.business is null");
            return (Criteria) this;
        }

        public Criteria andBusinessIsNotNull() {
            addCriterion("temp_par_client_contact.business is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessEqualTo(String value) {
            addCriterion("temp_par_client_contact.business =", value, "business");
            return (Criteria) this;
        }

        public Criteria andBusinessNotEqualTo(String value) {
            addCriterion("temp_par_client_contact.business <>", value, "business");
            return (Criteria) this;
        }

        public Criteria andBusinessGreaterThan(String value) {
            addCriterion("temp_par_client_contact.business >", value, "business");
            return (Criteria) this;
        }

        public Criteria andBusinessGreaterThanOrEqualTo(String value) {
            addCriterion("temp_par_client_contact.business >=", value, "business");
            return (Criteria) this;
        }

        public Criteria andBusinessLessThan(String value) {
            addCriterion("temp_par_client_contact.business <", value, "business");
            return (Criteria) this;
        }

        public Criteria andBusinessLessThanOrEqualTo(String value) {
            addCriterion("temp_par_client_contact.business <=", value, "business");
            return (Criteria) this;
        }

        public Criteria andBusinessLike(String value) {
            addCriterion("temp_par_client_contact.business like", value, "business");
            return (Criteria) this;
        }

        public Criteria andBusinessNotLike(String value) {
            addCriterion("temp_par_client_contact.business not like", value, "business");
            return (Criteria) this;
        }

        public Criteria andBusinessIn(List<String> values) {
            addCriterion("temp_par_client_contact.business in", values, "business");
            return (Criteria) this;
        }

        public Criteria andBusinessNotIn(List<String> values) {
            addCriterion("temp_par_client_contact.business not in", values, "business");
            return (Criteria) this;
        }

        public Criteria andBusinessBetween(String value1, String value2) {
            addCriterion("temp_par_client_contact.business between", value1, value2, "business");
            return (Criteria) this;
        }

        public Criteria andBusinessNotBetween(String value1, String value2) {
            addCriterion("temp_par_client_contact.business not between", value1, value2, "business");
            return (Criteria) this;
        }

        public Criteria andWorkPhoneIsNull() {
            addCriterion("temp_par_client_contact.work_phone is null");
            return (Criteria) this;
        }

        public Criteria andWorkPhoneIsNotNull() {
            addCriterion("temp_par_client_contact.work_phone is not null");
            return (Criteria) this;
        }

        public Criteria andWorkPhoneEqualTo(String value) {
            addCriterion("temp_par_client_contact.work_phone =", value, "workPhone");
            return (Criteria) this;
        }

        public Criteria andWorkPhoneNotEqualTo(String value) {
            addCriterion("temp_par_client_contact.work_phone <>", value, "workPhone");
            return (Criteria) this;
        }

        public Criteria andWorkPhoneGreaterThan(String value) {
            addCriterion("temp_par_client_contact.work_phone >", value, "workPhone");
            return (Criteria) this;
        }

        public Criteria andWorkPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("temp_par_client_contact.work_phone >=", value, "workPhone");
            return (Criteria) this;
        }

        public Criteria andWorkPhoneLessThan(String value) {
            addCriterion("temp_par_client_contact.work_phone <", value, "workPhone");
            return (Criteria) this;
        }

        public Criteria andWorkPhoneLessThanOrEqualTo(String value) {
            addCriterion("temp_par_client_contact.work_phone <=", value, "workPhone");
            return (Criteria) this;
        }

        public Criteria andWorkPhoneLike(String value) {
            addCriterion("temp_par_client_contact.work_phone like", value, "workPhone");
            return (Criteria) this;
        }

        public Criteria andWorkPhoneNotLike(String value) {
            addCriterion("temp_par_client_contact.work_phone not like", value, "workPhone");
            return (Criteria) this;
        }

        public Criteria andWorkPhoneIn(List<String> values) {
            addCriterion("temp_par_client_contact.work_phone in", values, "workPhone");
            return (Criteria) this;
        }

        public Criteria andWorkPhoneNotIn(List<String> values) {
            addCriterion("temp_par_client_contact.work_phone not in", values, "workPhone");
            return (Criteria) this;
        }

        public Criteria andWorkPhoneBetween(String value1, String value2) {
            addCriterion("temp_par_client_contact.work_phone between", value1, value2, "workPhone");
            return (Criteria) this;
        }

        public Criteria andWorkPhoneNotBetween(String value1, String value2) {
            addCriterion("temp_par_client_contact.work_phone not between", value1, value2, "workPhone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneIsNull() {
            addCriterion("temp_par_client_contact.mobilephone is null");
            return (Criteria) this;
        }

        public Criteria andMobilephoneIsNotNull() {
            addCriterion("temp_par_client_contact.mobilephone is not null");
            return (Criteria) this;
        }

        public Criteria andMobilephoneEqualTo(String value) {
            addCriterion("temp_par_client_contact.mobilephone =", value, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneNotEqualTo(String value) {
            addCriterion("temp_par_client_contact.mobilephone <>", value, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneGreaterThan(String value) {
            addCriterion("temp_par_client_contact.mobilephone >", value, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneGreaterThanOrEqualTo(String value) {
            addCriterion("temp_par_client_contact.mobilephone >=", value, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneLessThan(String value) {
            addCriterion("temp_par_client_contact.mobilephone <", value, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneLessThanOrEqualTo(String value) {
            addCriterion("temp_par_client_contact.mobilephone <=", value, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneLike(String value) {
            addCriterion("temp_par_client_contact.mobilephone like", value, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneNotLike(String value) {
            addCriterion("temp_par_client_contact.mobilephone not like", value, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneIn(List<String> values) {
            addCriterion("temp_par_client_contact.mobilephone in", values, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneNotIn(List<String> values) {
            addCriterion("temp_par_client_contact.mobilephone not in", values, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneBetween(String value1, String value2) {
            addCriterion("temp_par_client_contact.mobilephone between", value1, value2, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneNotBetween(String value1, String value2) {
            addCriterion("temp_par_client_contact.mobilephone not between", value1, value2, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andFoxIsNull() {
            addCriterion("temp_par_client_contact.fox is null");
            return (Criteria) this;
        }

        public Criteria andFoxIsNotNull() {
            addCriterion("temp_par_client_contact.fox is not null");
            return (Criteria) this;
        }

        public Criteria andFoxEqualTo(String value) {
            addCriterion("temp_par_client_contact.fox =", value, "fox");
            return (Criteria) this;
        }

        public Criteria andFoxNotEqualTo(String value) {
            addCriterion("temp_par_client_contact.fox <>", value, "fox");
            return (Criteria) this;
        }

        public Criteria andFoxGreaterThan(String value) {
            addCriterion("temp_par_client_contact.fox >", value, "fox");
            return (Criteria) this;
        }

        public Criteria andFoxGreaterThanOrEqualTo(String value) {
            addCriterion("temp_par_client_contact.fox >=", value, "fox");
            return (Criteria) this;
        }

        public Criteria andFoxLessThan(String value) {
            addCriterion("temp_par_client_contact.fox <", value, "fox");
            return (Criteria) this;
        }

        public Criteria andFoxLessThanOrEqualTo(String value) {
            addCriterion("temp_par_client_contact.fox <=", value, "fox");
            return (Criteria) this;
        }

        public Criteria andFoxLike(String value) {
            addCriterion("temp_par_client_contact.fox like", value, "fox");
            return (Criteria) this;
        }

        public Criteria andFoxNotLike(String value) {
            addCriterion("temp_par_client_contact.fox not like", value, "fox");
            return (Criteria) this;
        }

        public Criteria andFoxIn(List<String> values) {
            addCriterion("temp_par_client_contact.fox in", values, "fox");
            return (Criteria) this;
        }

        public Criteria andFoxNotIn(List<String> values) {
            addCriterion("temp_par_client_contact.fox not in", values, "fox");
            return (Criteria) this;
        }

        public Criteria andFoxBetween(String value1, String value2) {
            addCriterion("temp_par_client_contact.fox between", value1, value2, "fox");
            return (Criteria) this;
        }

        public Criteria andFoxNotBetween(String value1, String value2) {
            addCriterion("temp_par_client_contact.fox not between", value1, value2, "fox");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("temp_par_client_contact.email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("temp_par_client_contact.email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("temp_par_client_contact.email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("temp_par_client_contact.email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("temp_par_client_contact.email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("temp_par_client_contact.email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("temp_par_client_contact.email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("temp_par_client_contact.email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("temp_par_client_contact.email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("temp_par_client_contact.email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("temp_par_client_contact.email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("temp_par_client_contact.email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("temp_par_client_contact.email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("temp_par_client_contact.email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andHomePhoneIsNull() {
            addCriterion("temp_par_client_contact.home_phone is null");
            return (Criteria) this;
        }

        public Criteria andHomePhoneIsNotNull() {
            addCriterion("temp_par_client_contact.home_phone is not null");
            return (Criteria) this;
        }

        public Criteria andHomePhoneEqualTo(String value) {
            addCriterion("temp_par_client_contact.home_phone =", value, "homePhone");
            return (Criteria) this;
        }

        public Criteria andHomePhoneNotEqualTo(String value) {
            addCriterion("temp_par_client_contact.home_phone <>", value, "homePhone");
            return (Criteria) this;
        }

        public Criteria andHomePhoneGreaterThan(String value) {
            addCriterion("temp_par_client_contact.home_phone >", value, "homePhone");
            return (Criteria) this;
        }

        public Criteria andHomePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("temp_par_client_contact.home_phone >=", value, "homePhone");
            return (Criteria) this;
        }

        public Criteria andHomePhoneLessThan(String value) {
            addCriterion("temp_par_client_contact.home_phone <", value, "homePhone");
            return (Criteria) this;
        }

        public Criteria andHomePhoneLessThanOrEqualTo(String value) {
            addCriterion("temp_par_client_contact.home_phone <=", value, "homePhone");
            return (Criteria) this;
        }

        public Criteria andHomePhoneLike(String value) {
            addCriterion("temp_par_client_contact.home_phone like", value, "homePhone");
            return (Criteria) this;
        }

        public Criteria andHomePhoneNotLike(String value) {
            addCriterion("temp_par_client_contact.home_phone not like", value, "homePhone");
            return (Criteria) this;
        }

        public Criteria andHomePhoneIn(List<String> values) {
            addCriterion("temp_par_client_contact.home_phone in", values, "homePhone");
            return (Criteria) this;
        }

        public Criteria andHomePhoneNotIn(List<String> values) {
            addCriterion("temp_par_client_contact.home_phone not in", values, "homePhone");
            return (Criteria) this;
        }

        public Criteria andHomePhoneBetween(String value1, String value2) {
            addCriterion("temp_par_client_contact.home_phone between", value1, value2, "homePhone");
            return (Criteria) this;
        }

        public Criteria andHomePhoneNotBetween(String value1, String value2) {
            addCriterion("temp_par_client_contact.home_phone not between", value1, value2, "homePhone");
            return (Criteria) this;
        }

        public Criteria andAdrressIsNull() {
            addCriterion("temp_par_client_contact.adrress is null");
            return (Criteria) this;
        }

        public Criteria andAdrressIsNotNull() {
            addCriterion("temp_par_client_contact.adrress is not null");
            return (Criteria) this;
        }

        public Criteria andAdrressEqualTo(String value) {
            addCriterion("temp_par_client_contact.adrress =", value, "adrress");
            return (Criteria) this;
        }

        public Criteria andAdrressNotEqualTo(String value) {
            addCriterion("temp_par_client_contact.adrress <>", value, "adrress");
            return (Criteria) this;
        }

        public Criteria andAdrressGreaterThan(String value) {
            addCriterion("temp_par_client_contact.adrress >", value, "adrress");
            return (Criteria) this;
        }

        public Criteria andAdrressGreaterThanOrEqualTo(String value) {
            addCriterion("temp_par_client_contact.adrress >=", value, "adrress");
            return (Criteria) this;
        }

        public Criteria andAdrressLessThan(String value) {
            addCriterion("temp_par_client_contact.adrress <", value, "adrress");
            return (Criteria) this;
        }

        public Criteria andAdrressLessThanOrEqualTo(String value) {
            addCriterion("temp_par_client_contact.adrress <=", value, "adrress");
            return (Criteria) this;
        }

        public Criteria andAdrressLike(String value) {
            addCriterion("temp_par_client_contact.adrress like", value, "adrress");
            return (Criteria) this;
        }

        public Criteria andAdrressNotLike(String value) {
            addCriterion("temp_par_client_contact.adrress not like", value, "adrress");
            return (Criteria) this;
        }

        public Criteria andAdrressIn(List<String> values) {
            addCriterion("temp_par_client_contact.adrress in", values, "adrress");
            return (Criteria) this;
        }

        public Criteria andAdrressNotIn(List<String> values) {
            addCriterion("temp_par_client_contact.adrress not in", values, "adrress");
            return (Criteria) this;
        }

        public Criteria andAdrressBetween(String value1, String value2) {
            addCriterion("temp_par_client_contact.adrress between", value1, value2, "adrress");
            return (Criteria) this;
        }

        public Criteria andAdrressNotBetween(String value1, String value2) {
            addCriterion("temp_par_client_contact.adrress not between", value1, value2, "adrress");
            return (Criteria) this;
        }

        public Criteria andCommunicationsIsNull() {
            addCriterion("temp_par_client_contact.communications is null");
            return (Criteria) this;
        }

        public Criteria andCommunicationsIsNotNull() {
            addCriterion("temp_par_client_contact.communications is not null");
            return (Criteria) this;
        }

        public Criteria andCommunicationsEqualTo(String value) {
            addCriterion("temp_par_client_contact.communications =", value, "communications");
            return (Criteria) this;
        }

        public Criteria andCommunicationsNotEqualTo(String value) {
            addCriterion("temp_par_client_contact.communications <>", value, "communications");
            return (Criteria) this;
        }

        public Criteria andCommunicationsGreaterThan(String value) {
            addCriterion("temp_par_client_contact.communications >", value, "communications");
            return (Criteria) this;
        }

        public Criteria andCommunicationsGreaterThanOrEqualTo(String value) {
            addCriterion("temp_par_client_contact.communications >=", value, "communications");
            return (Criteria) this;
        }

        public Criteria andCommunicationsLessThan(String value) {
            addCriterion("temp_par_client_contact.communications <", value, "communications");
            return (Criteria) this;
        }

        public Criteria andCommunicationsLessThanOrEqualTo(String value) {
            addCriterion("temp_par_client_contact.communications <=", value, "communications");
            return (Criteria) this;
        }

        public Criteria andCommunicationsLike(String value) {
            addCriterion("temp_par_client_contact.communications like", value, "communications");
            return (Criteria) this;
        }

        public Criteria andCommunicationsNotLike(String value) {
            addCriterion("temp_par_client_contact.communications not like", value, "communications");
            return (Criteria) this;
        }

        public Criteria andCommunicationsIn(List<String> values) {
            addCriterion("temp_par_client_contact.communications in", values, "communications");
            return (Criteria) this;
        }

        public Criteria andCommunicationsNotIn(List<String> values) {
            addCriterion("temp_par_client_contact.communications not in", values, "communications");
            return (Criteria) this;
        }

        public Criteria andCommunicationsBetween(String value1, String value2) {
            addCriterion("temp_par_client_contact.communications between", value1, value2, "communications");
            return (Criteria) this;
        }

        public Criteria andCommunicationsNotBetween(String value1, String value2) {
            addCriterion("temp_par_client_contact.communications not between", value1, value2, "communications");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("temp_par_client_contact.birthday is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("temp_par_client_contact.birthday is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(Date value) {
            addCriterion("temp_par_client_contact.birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(Date value) {
            addCriterion("temp_par_client_contact.birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(Date value) {
            addCriterion("temp_par_client_contact.birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_par_client_contact.birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(Date value) {
            addCriterion("temp_par_client_contact.birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(Date value) {
            addCriterion("temp_par_client_contact.birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<Date> values) {
            addCriterion("temp_par_client_contact.birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<Date> values) {
            addCriterion("temp_par_client_contact.birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(Date value1, Date value2) {
            addCriterion("temp_par_client_contact.birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(Date value1, Date value2) {
            addCriterion("temp_par_client_contact.birthday not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andHobbyIsNull() {
            addCriterion("temp_par_client_contact.hobby is null");
            return (Criteria) this;
        }

        public Criteria andHobbyIsNotNull() {
            addCriterion("temp_par_client_contact.hobby is not null");
            return (Criteria) this;
        }

        public Criteria andHobbyEqualTo(String value) {
            addCriterion("temp_par_client_contact.hobby =", value, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyNotEqualTo(String value) {
            addCriterion("temp_par_client_contact.hobby <>", value, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyGreaterThan(String value) {
            addCriterion("temp_par_client_contact.hobby >", value, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyGreaterThanOrEqualTo(String value) {
            addCriterion("temp_par_client_contact.hobby >=", value, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyLessThan(String value) {
            addCriterion("temp_par_client_contact.hobby <", value, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyLessThanOrEqualTo(String value) {
            addCriterion("temp_par_client_contact.hobby <=", value, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyLike(String value) {
            addCriterion("temp_par_client_contact.hobby like", value, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyNotLike(String value) {
            addCriterion("temp_par_client_contact.hobby not like", value, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyIn(List<String> values) {
            addCriterion("temp_par_client_contact.hobby in", values, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyNotIn(List<String> values) {
            addCriterion("temp_par_client_contact.hobby not in", values, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyBetween(String value1, String value2) {
            addCriterion("temp_par_client_contact.hobby between", value1, value2, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyNotBetween(String value1, String value2) {
            addCriterion("temp_par_client_contact.hobby not between", value1, value2, "hobby");
            return (Criteria) this;
        }

        public Criteria andNumberIsNull() {
            addCriterion("temp_par_client_contact.number is null");
            return (Criteria) this;
        }

        public Criteria andNumberIsNotNull() {
            addCriterion("temp_par_client_contact.number is not null");
            return (Criteria) this;
        }

        public Criteria andNumberEqualTo(String value) {
            addCriterion("temp_par_client_contact.number =", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotEqualTo(String value) {
            addCriterion("temp_par_client_contact.number <>", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThan(String value) {
            addCriterion("temp_par_client_contact.number >", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThanOrEqualTo(String value) {
            addCriterion("temp_par_client_contact.number >=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThan(String value) {
            addCriterion("temp_par_client_contact.number <", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThanOrEqualTo(String value) {
            addCriterion("temp_par_client_contact.number <=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLike(String value) {
            addCriterion("temp_par_client_contact.number like", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotLike(String value) {
            addCriterion("temp_par_client_contact.number not like", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberIn(List<String> values) {
            addCriterion("temp_par_client_contact.number in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotIn(List<String> values) {
            addCriterion("temp_par_client_contact.number not in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberBetween(String value1, String value2) {
            addCriterion("temp_par_client_contact.number between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotBetween(String value1, String value2) {
            addCriterion("temp_par_client_contact.number not between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("temp_par_client_contact.remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("temp_par_client_contact.remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("temp_par_client_contact.remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("temp_par_client_contact.remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("temp_par_client_contact.remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("temp_par_client_contact.remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("temp_par_client_contact.remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("temp_par_client_contact.remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("temp_par_client_contact.remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("temp_par_client_contact.remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("temp_par_client_contact.remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("temp_par_client_contact.remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("temp_par_client_contact.remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("temp_par_client_contact.remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andEnabledIsNull() {
            addCriterion("temp_par_client_contact.enabled is null");
            return (Criteria) this;
        }

        public Criteria andEnabledIsNotNull() {
            addCriterion("temp_par_client_contact.enabled is not null");
            return (Criteria) this;
        }

        public Criteria andEnabledEqualTo(String value) {
            addCriterion("temp_par_client_contact.enabled =", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotEqualTo(String value) {
            addCriterion("temp_par_client_contact.enabled <>", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledGreaterThan(String value) {
            addCriterion("temp_par_client_contact.enabled >", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledGreaterThanOrEqualTo(String value) {
            addCriterion("temp_par_client_contact.enabled >=", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledLessThan(String value) {
            addCriterion("temp_par_client_contact.enabled <", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledLessThanOrEqualTo(String value) {
            addCriterion("temp_par_client_contact.enabled <=", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledLike(String value) {
            addCriterion("temp_par_client_contact.enabled like", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotLike(String value) {
            addCriterion("temp_par_client_contact.enabled not like", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledIn(List<String> values) {
            addCriterion("temp_par_client_contact.enabled in", values, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotIn(List<String> values) {
            addCriterion("temp_par_client_contact.enabled not in", values, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledBetween(String value1, String value2) {
            addCriterion("temp_par_client_contact.enabled between", value1, value2, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotBetween(String value1, String value2) {
            addCriterion("temp_par_client_contact.enabled not between", value1, value2, "enabled");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNull() {
            addCriterion("temp_par_client_contact.creater is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNotNull() {
            addCriterion("temp_par_client_contact.creater is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterEqualTo(String value) {
            addCriterion("temp_par_client_contact.creater =", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotEqualTo(String value) {
            addCriterion("temp_par_client_contact.creater <>", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThan(String value) {
            addCriterion("temp_par_client_contact.creater >", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_par_client_contact.creater >=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThan(String value) {
            addCriterion("temp_par_client_contact.creater <", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThanOrEqualTo(String value) {
            addCriterion("temp_par_client_contact.creater <=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLike(String value) {
            addCriterion("temp_par_client_contact.creater like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotLike(String value) {
            addCriterion("temp_par_client_contact.creater not like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterIn(List<String> values) {
            addCriterion("temp_par_client_contact.creater in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotIn(List<String> values) {
            addCriterion("temp_par_client_contact.creater not in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterBetween(String value1, String value2) {
            addCriterion("temp_par_client_contact.creater between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotBetween(String value1, String value2) {
            addCriterion("temp_par_client_contact.creater not between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("temp_par_client_contact.create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("temp_par_client_contact.create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("temp_par_client_contact.create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("temp_par_client_contact.create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("temp_par_client_contact.create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_par_client_contact.create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("temp_par_client_contact.create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_par_client_contact.create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("temp_par_client_contact.create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("temp_par_client_contact.create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_par_client_contact.create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_par_client_contact.create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNull() {
            addCriterion("temp_par_client_contact.updater is null");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNotNull() {
            addCriterion("temp_par_client_contact.updater is not null");
            return (Criteria) this;
        }

        public Criteria andUpdaterEqualTo(String value) {
            addCriterion("temp_par_client_contact.updater =", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotEqualTo(String value) {
            addCriterion("temp_par_client_contact.updater <>", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThan(String value) {
            addCriterion("temp_par_client_contact.updater >", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_par_client_contact.updater >=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThan(String value) {
            addCriterion("temp_par_client_contact.updater <", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThanOrEqualTo(String value) {
            addCriterion("temp_par_client_contact.updater <=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLike(String value) {
            addCriterion("temp_par_client_contact.updater like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotLike(String value) {
            addCriterion("temp_par_client_contact.updater not like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterIn(List<String> values) {
            addCriterion("temp_par_client_contact.updater in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotIn(List<String> values) {
            addCriterion("temp_par_client_contact.updater not in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterBetween(String value1, String value2) {
            addCriterion("temp_par_client_contact.updater between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotBetween(String value1, String value2) {
            addCriterion("temp_par_client_contact.updater not between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("temp_par_client_contact.update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("temp_par_client_contact.update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("temp_par_client_contact.update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("temp_par_client_contact.update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("temp_par_client_contact.update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_par_client_contact.update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("temp_par_client_contact.update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_par_client_contact.update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("temp_par_client_contact.update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("temp_par_client_contact.update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_par_client_contact.update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_par_client_contact.update_time not between", value1, value2, "updateTime");
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
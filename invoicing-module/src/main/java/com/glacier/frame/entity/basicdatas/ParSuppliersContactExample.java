package com.glacier.frame.entity.basicdatas;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ParSuppliersContactExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public ParSuppliersContactExample() {
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

        public Criteria andSupplierContactIdIsNull() {
            addCriterion("temp_par_suppliers_contact.supplier_contact_id is null");
            return (Criteria) this;
        }

        public Criteria andSupplierContactIdIsNotNull() {
            addCriterion("temp_par_suppliers_contact.supplier_contact_id is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierContactIdEqualTo(String value) {
            addCriterion("temp_par_suppliers_contact.supplier_contact_id =", value, "supplierContactId");
            return (Criteria) this;
        }

        public Criteria andSupplierContactIdNotEqualTo(String value) {
            addCriterion("temp_par_suppliers_contact.supplier_contact_id <>", value, "supplierContactId");
            return (Criteria) this;
        }

        public Criteria andSupplierContactIdGreaterThan(String value) {
            addCriterion("temp_par_suppliers_contact.supplier_contact_id >", value, "supplierContactId");
            return (Criteria) this;
        }

        public Criteria andSupplierContactIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_par_suppliers_contact.supplier_contact_id >=", value, "supplierContactId");
            return (Criteria) this;
        }

        public Criteria andSupplierContactIdLessThan(String value) {
            addCriterion("temp_par_suppliers_contact.supplier_contact_id <", value, "supplierContactId");
            return (Criteria) this;
        }

        public Criteria andSupplierContactIdLessThanOrEqualTo(String value) {
            addCriterion("temp_par_suppliers_contact.supplier_contact_id <=", value, "supplierContactId");
            return (Criteria) this;
        }

        public Criteria andSupplierContactIdLike(String value) {
            addCriterion("temp_par_suppliers_contact.supplier_contact_id like", value, "supplierContactId");
            return (Criteria) this;
        }

        public Criteria andSupplierContactIdNotLike(String value) {
            addCriterion("temp_par_suppliers_contact.supplier_contact_id not like", value, "supplierContactId");
            return (Criteria) this;
        }

        public Criteria andSupplierContactIdIn(List<String> values) {
            addCriterion("temp_par_suppliers_contact.supplier_contact_id in", values, "supplierContactId");
            return (Criteria) this;
        }

        public Criteria andSupplierContactIdNotIn(List<String> values) {
            addCriterion("temp_par_suppliers_contact.supplier_contact_id not in", values, "supplierContactId");
            return (Criteria) this;
        }

        public Criteria andSupplierContactIdBetween(String value1, String value2) {
            addCriterion("temp_par_suppliers_contact.supplier_contact_id between", value1, value2, "supplierContactId");
            return (Criteria) this;
        }

        public Criteria andSupplierContactIdNotBetween(String value1, String value2) {
            addCriterion("temp_par_suppliers_contact.supplier_contact_id not between", value1, value2, "supplierContactId");
            return (Criteria) this;
        }

        public Criteria andContactTypeIdIsNull() {
            addCriterion("temp_par_suppliers_contact.contact_type_id is null");
            return (Criteria) this;
        }

        public Criteria andContactTypeIdIsNotNull() {
            addCriterion("temp_par_suppliers_contact.contact_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andContactTypeIdEqualTo(String value) {
            addCriterion("temp_par_suppliers_contact.contact_type_id =", value, "contactTypeId");
            return (Criteria) this;
        }

        public Criteria andContactTypeIdNotEqualTo(String value) {
            addCriterion("temp_par_suppliers_contact.contact_type_id <>", value, "contactTypeId");
            return (Criteria) this;
        }

        public Criteria andContactTypeIdGreaterThan(String value) {
            addCriterion("temp_par_suppliers_contact.contact_type_id >", value, "contactTypeId");
            return (Criteria) this;
        }

        public Criteria andContactTypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_par_suppliers_contact.contact_type_id >=", value, "contactTypeId");
            return (Criteria) this;
        }

        public Criteria andContactTypeIdLessThan(String value) {
            addCriterion("temp_par_suppliers_contact.contact_type_id <", value, "contactTypeId");
            return (Criteria) this;
        }

        public Criteria andContactTypeIdLessThanOrEqualTo(String value) {
            addCriterion("temp_par_suppliers_contact.contact_type_id <=", value, "contactTypeId");
            return (Criteria) this;
        }

        public Criteria andContactTypeIdLike(String value) {
            addCriterion("temp_par_suppliers_contact.contact_type_id like", value, "contactTypeId");
            return (Criteria) this;
        }

        public Criteria andContactTypeIdNotLike(String value) {
            addCriterion("temp_par_suppliers_contact.contact_type_id not like", value, "contactTypeId");
            return (Criteria) this;
        }

        public Criteria andContactTypeIdIn(List<String> values) {
            addCriterion("temp_par_suppliers_contact.contact_type_id in", values, "contactTypeId");
            return (Criteria) this;
        }

        public Criteria andContactTypeIdNotIn(List<String> values) {
            addCriterion("temp_par_suppliers_contact.contact_type_id not in", values, "contactTypeId");
            return (Criteria) this;
        }

        public Criteria andContactTypeIdBetween(String value1, String value2) {
            addCriterion("temp_par_suppliers_contact.contact_type_id between", value1, value2, "contactTypeId");
            return (Criteria) this;
        }

        public Criteria andContactTypeIdNotBetween(String value1, String value2) {
            addCriterion("temp_par_suppliers_contact.contact_type_id not between", value1, value2, "contactTypeId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdIsNull() {
            addCriterion("temp_par_suppliers_contact.supplier_id is null");
            return (Criteria) this;
        }

        public Criteria andSupplierIdIsNotNull() {
            addCriterion("temp_par_suppliers_contact.supplier_id is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierIdEqualTo(String value) {
            addCriterion("temp_par_suppliers_contact.supplier_id =", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotEqualTo(String value) {
            addCriterion("temp_par_suppliers_contact.supplier_id <>", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdGreaterThan(String value) {
            addCriterion("temp_par_suppliers_contact.supplier_id >", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_par_suppliers_contact.supplier_id >=", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdLessThan(String value) {
            addCriterion("temp_par_suppliers_contact.supplier_id <", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdLessThanOrEqualTo(String value) {
            addCriterion("temp_par_suppliers_contact.supplier_id <=", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdLike(String value) {
            addCriterion("temp_par_suppliers_contact.supplier_id like", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotLike(String value) {
            addCriterion("temp_par_suppliers_contact.supplier_id not like", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdIn(List<String> values) {
            addCriterion("temp_par_suppliers_contact.supplier_id in", values, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotIn(List<String> values) {
            addCriterion("temp_par_suppliers_contact.supplier_id not in", values, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdBetween(String value1, String value2) {
            addCriterion("temp_par_suppliers_contact.supplier_id between", value1, value2, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotBetween(String value1, String value2) {
            addCriterion("temp_par_suppliers_contact.supplier_id not between", value1, value2, "supplierId");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("temp_par_suppliers_contact.name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("temp_par_suppliers_contact.name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("temp_par_suppliers_contact.name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("temp_par_suppliers_contact.name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("temp_par_suppliers_contact.name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("temp_par_suppliers_contact.name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("temp_par_suppliers_contact.name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("temp_par_suppliers_contact.name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("temp_par_suppliers_contact.name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("temp_par_suppliers_contact.name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("temp_par_suppliers_contact.name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("temp_par_suppliers_contact.name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("temp_par_suppliers_contact.name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("temp_par_suppliers_contact.name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("temp_par_suppliers_contact.sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("temp_par_suppliers_contact.sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("temp_par_suppliers_contact.sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("temp_par_suppliers_contact.sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("temp_par_suppliers_contact.sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("temp_par_suppliers_contact.sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("temp_par_suppliers_contact.sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("temp_par_suppliers_contact.sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("temp_par_suppliers_contact.sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("temp_par_suppliers_contact.sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("temp_par_suppliers_contact.sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("temp_par_suppliers_contact.sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("temp_par_suppliers_contact.sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("temp_par_suppliers_contact.sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNull() {
            addCriterion("temp_par_suppliers_contact.department is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNotNull() {
            addCriterion("temp_par_suppliers_contact.department is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentEqualTo(String value) {
            addCriterion("temp_par_suppliers_contact.department =", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotEqualTo(String value) {
            addCriterion("temp_par_suppliers_contact.department <>", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThan(String value) {
            addCriterion("temp_par_suppliers_contact.department >", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("temp_par_suppliers_contact.department >=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThan(String value) {
            addCriterion("temp_par_suppliers_contact.department <", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThanOrEqualTo(String value) {
            addCriterion("temp_par_suppliers_contact.department <=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLike(String value) {
            addCriterion("temp_par_suppliers_contact.department like", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotLike(String value) {
            addCriterion("temp_par_suppliers_contact.department not like", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentIn(List<String> values) {
            addCriterion("temp_par_suppliers_contact.department in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotIn(List<String> values) {
            addCriterion("temp_par_suppliers_contact.department not in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentBetween(String value1, String value2) {
            addCriterion("temp_par_suppliers_contact.department between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotBetween(String value1, String value2) {
            addCriterion("temp_par_suppliers_contact.department not between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andPostIsNull() {
            addCriterion("temp_par_suppliers_contact.post is null");
            return (Criteria) this;
        }

        public Criteria andPostIsNotNull() {
            addCriterion("temp_par_suppliers_contact.post is not null");
            return (Criteria) this;
        }

        public Criteria andPostEqualTo(String value) {
            addCriterion("temp_par_suppliers_contact.post =", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostNotEqualTo(String value) {
            addCriterion("temp_par_suppliers_contact.post <>", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostGreaterThan(String value) {
            addCriterion("temp_par_suppliers_contact.post >", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostGreaterThanOrEqualTo(String value) {
            addCriterion("temp_par_suppliers_contact.post >=", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostLessThan(String value) {
            addCriterion("temp_par_suppliers_contact.post <", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostLessThanOrEqualTo(String value) {
            addCriterion("temp_par_suppliers_contact.post <=", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostLike(String value) {
            addCriterion("temp_par_suppliers_contact.post like", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostNotLike(String value) {
            addCriterion("temp_par_suppliers_contact.post not like", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostIn(List<String> values) {
            addCriterion("temp_par_suppliers_contact.post in", values, "post");
            return (Criteria) this;
        }

        public Criteria andPostNotIn(List<String> values) {
            addCriterion("temp_par_suppliers_contact.post not in", values, "post");
            return (Criteria) this;
        }

        public Criteria andPostBetween(String value1, String value2) {
            addCriterion("temp_par_suppliers_contact.post between", value1, value2, "post");
            return (Criteria) this;
        }

        public Criteria andPostNotBetween(String value1, String value2) {
            addCriterion("temp_par_suppliers_contact.post not between", value1, value2, "post");
            return (Criteria) this;
        }

        public Criteria andResponsibleBusinessIsNull() {
            addCriterion("temp_par_suppliers_contact.responsible_business is null");
            return (Criteria) this;
        }

        public Criteria andResponsibleBusinessIsNotNull() {
            addCriterion("temp_par_suppliers_contact.responsible_business is not null");
            return (Criteria) this;
        }

        public Criteria andResponsibleBusinessEqualTo(String value) {
            addCriterion("temp_par_suppliers_contact.responsible_business =", value, "responsibleBusiness");
            return (Criteria) this;
        }

        public Criteria andResponsibleBusinessNotEqualTo(String value) {
            addCriterion("temp_par_suppliers_contact.responsible_business <>", value, "responsibleBusiness");
            return (Criteria) this;
        }

        public Criteria andResponsibleBusinessGreaterThan(String value) {
            addCriterion("temp_par_suppliers_contact.responsible_business >", value, "responsibleBusiness");
            return (Criteria) this;
        }

        public Criteria andResponsibleBusinessGreaterThanOrEqualTo(String value) {
            addCriterion("temp_par_suppliers_contact.responsible_business >=", value, "responsibleBusiness");
            return (Criteria) this;
        }

        public Criteria andResponsibleBusinessLessThan(String value) {
            addCriterion("temp_par_suppliers_contact.responsible_business <", value, "responsibleBusiness");
            return (Criteria) this;
        }

        public Criteria andResponsibleBusinessLessThanOrEqualTo(String value) {
            addCriterion("temp_par_suppliers_contact.responsible_business <=", value, "responsibleBusiness");
            return (Criteria) this;
        }

        public Criteria andResponsibleBusinessLike(String value) {
            addCriterion("temp_par_suppliers_contact.responsible_business like", value, "responsibleBusiness");
            return (Criteria) this;
        }

        public Criteria andResponsibleBusinessNotLike(String value) {
            addCriterion("temp_par_suppliers_contact.responsible_business not like", value, "responsibleBusiness");
            return (Criteria) this;
        }

        public Criteria andResponsibleBusinessIn(List<String> values) {
            addCriterion("temp_par_suppliers_contact.responsible_business in", values, "responsibleBusiness");
            return (Criteria) this;
        }

        public Criteria andResponsibleBusinessNotIn(List<String> values) {
            addCriterion("temp_par_suppliers_contact.responsible_business not in", values, "responsibleBusiness");
            return (Criteria) this;
        }

        public Criteria andResponsibleBusinessBetween(String value1, String value2) {
            addCriterion("temp_par_suppliers_contact.responsible_business between", value1, value2, "responsibleBusiness");
            return (Criteria) this;
        }

        public Criteria andResponsibleBusinessNotBetween(String value1, String value2) {
            addCriterion("temp_par_suppliers_contact.responsible_business not between", value1, value2, "responsibleBusiness");
            return (Criteria) this;
        }

        public Criteria andWorkPhoneIsNull() {
            addCriterion("temp_par_suppliers_contact.work_phone is null");
            return (Criteria) this;
        }

        public Criteria andWorkPhoneIsNotNull() {
            addCriterion("temp_par_suppliers_contact.work_phone is not null");
            return (Criteria) this;
        }

        public Criteria andWorkPhoneEqualTo(String value) {
            addCriterion("temp_par_suppliers_contact.work_phone =", value, "workPhone");
            return (Criteria) this;
        }

        public Criteria andWorkPhoneNotEqualTo(String value) {
            addCriterion("temp_par_suppliers_contact.work_phone <>", value, "workPhone");
            return (Criteria) this;
        }

        public Criteria andWorkPhoneGreaterThan(String value) {
            addCriterion("temp_par_suppliers_contact.work_phone >", value, "workPhone");
            return (Criteria) this;
        }

        public Criteria andWorkPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("temp_par_suppliers_contact.work_phone >=", value, "workPhone");
            return (Criteria) this;
        }

        public Criteria andWorkPhoneLessThan(String value) {
            addCriterion("temp_par_suppliers_contact.work_phone <", value, "workPhone");
            return (Criteria) this;
        }

        public Criteria andWorkPhoneLessThanOrEqualTo(String value) {
            addCriterion("temp_par_suppliers_contact.work_phone <=", value, "workPhone");
            return (Criteria) this;
        }

        public Criteria andWorkPhoneLike(String value) {
            addCriterion("temp_par_suppliers_contact.work_phone like", value, "workPhone");
            return (Criteria) this;
        }

        public Criteria andWorkPhoneNotLike(String value) {
            addCriterion("temp_par_suppliers_contact.work_phone not like", value, "workPhone");
            return (Criteria) this;
        }

        public Criteria andWorkPhoneIn(List<String> values) {
            addCriterion("temp_par_suppliers_contact.work_phone in", values, "workPhone");
            return (Criteria) this;
        }

        public Criteria andWorkPhoneNotIn(List<String> values) {
            addCriterion("temp_par_suppliers_contact.work_phone not in", values, "workPhone");
            return (Criteria) this;
        }

        public Criteria andWorkPhoneBetween(String value1, String value2) {
            addCriterion("temp_par_suppliers_contact.work_phone between", value1, value2, "workPhone");
            return (Criteria) this;
        }

        public Criteria andWorkPhoneNotBetween(String value1, String value2) {
            addCriterion("temp_par_suppliers_contact.work_phone not between", value1, value2, "workPhone");
            return (Criteria) this;
        }

        public Criteria andMobileTelephoneIsNull() {
            addCriterion("temp_par_suppliers_contact.mobile_telephone is null");
            return (Criteria) this;
        }

        public Criteria andMobileTelephoneIsNotNull() {
            addCriterion("temp_par_suppliers_contact.mobile_telephone is not null");
            return (Criteria) this;
        }

        public Criteria andMobileTelephoneEqualTo(String value) {
            addCriterion("temp_par_suppliers_contact.mobile_telephone =", value, "mobileTelephone");
            return (Criteria) this;
        }

        public Criteria andMobileTelephoneNotEqualTo(String value) {
            addCriterion("temp_par_suppliers_contact.mobile_telephone <>", value, "mobileTelephone");
            return (Criteria) this;
        }

        public Criteria andMobileTelephoneGreaterThan(String value) {
            addCriterion("temp_par_suppliers_contact.mobile_telephone >", value, "mobileTelephone");
            return (Criteria) this;
        }

        public Criteria andMobileTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("temp_par_suppliers_contact.mobile_telephone >=", value, "mobileTelephone");
            return (Criteria) this;
        }

        public Criteria andMobileTelephoneLessThan(String value) {
            addCriterion("temp_par_suppliers_contact.mobile_telephone <", value, "mobileTelephone");
            return (Criteria) this;
        }

        public Criteria andMobileTelephoneLessThanOrEqualTo(String value) {
            addCriterion("temp_par_suppliers_contact.mobile_telephone <=", value, "mobileTelephone");
            return (Criteria) this;
        }

        public Criteria andMobileTelephoneLike(String value) {
            addCriterion("temp_par_suppliers_contact.mobile_telephone like", value, "mobileTelephone");
            return (Criteria) this;
        }

        public Criteria andMobileTelephoneNotLike(String value) {
            addCriterion("temp_par_suppliers_contact.mobile_telephone not like", value, "mobileTelephone");
            return (Criteria) this;
        }

        public Criteria andMobileTelephoneIn(List<String> values) {
            addCriterion("temp_par_suppliers_contact.mobile_telephone in", values, "mobileTelephone");
            return (Criteria) this;
        }

        public Criteria andMobileTelephoneNotIn(List<String> values) {
            addCriterion("temp_par_suppliers_contact.mobile_telephone not in", values, "mobileTelephone");
            return (Criteria) this;
        }

        public Criteria andMobileTelephoneBetween(String value1, String value2) {
            addCriterion("temp_par_suppliers_contact.mobile_telephone between", value1, value2, "mobileTelephone");
            return (Criteria) this;
        }

        public Criteria andMobileTelephoneNotBetween(String value1, String value2) {
            addCriterion("temp_par_suppliers_contact.mobile_telephone not between", value1, value2, "mobileTelephone");
            return (Criteria) this;
        }

        public Criteria andFaxIsNull() {
            addCriterion("temp_par_suppliers_contact.fax is null");
            return (Criteria) this;
        }

        public Criteria andFaxIsNotNull() {
            addCriterion("temp_par_suppliers_contact.fax is not null");
            return (Criteria) this;
        }

        public Criteria andFaxEqualTo(String value) {
            addCriterion("temp_par_suppliers_contact.fax =", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotEqualTo(String value) {
            addCriterion("temp_par_suppliers_contact.fax <>", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxGreaterThan(String value) {
            addCriterion("temp_par_suppliers_contact.fax >", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxGreaterThanOrEqualTo(String value) {
            addCriterion("temp_par_suppliers_contact.fax >=", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLessThan(String value) {
            addCriterion("temp_par_suppliers_contact.fax <", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLessThanOrEqualTo(String value) {
            addCriterion("temp_par_suppliers_contact.fax <=", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLike(String value) {
            addCriterion("temp_par_suppliers_contact.fax like", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotLike(String value) {
            addCriterion("temp_par_suppliers_contact.fax not like", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxIn(List<String> values) {
            addCriterion("temp_par_suppliers_contact.fax in", values, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotIn(List<String> values) {
            addCriterion("temp_par_suppliers_contact.fax not in", values, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxBetween(String value1, String value2) {
            addCriterion("temp_par_suppliers_contact.fax between", value1, value2, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotBetween(String value1, String value2) {
            addCriterion("temp_par_suppliers_contact.fax not between", value1, value2, "fax");
            return (Criteria) this;
        }

        public Criteria andPostcodeIsNull() {
            addCriterion("temp_par_suppliers_contact.postcode is null");
            return (Criteria) this;
        }

        public Criteria andPostcodeIsNotNull() {
            addCriterion("temp_par_suppliers_contact.postcode is not null");
            return (Criteria) this;
        }

        public Criteria andPostcodeEqualTo(String value) {
            addCriterion("temp_par_suppliers_contact.postcode =", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotEqualTo(String value) {
            addCriterion("temp_par_suppliers_contact.postcode <>", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeGreaterThan(String value) {
            addCriterion("temp_par_suppliers_contact.postcode >", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeGreaterThanOrEqualTo(String value) {
            addCriterion("temp_par_suppliers_contact.postcode >=", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeLessThan(String value) {
            addCriterion("temp_par_suppliers_contact.postcode <", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeLessThanOrEqualTo(String value) {
            addCriterion("temp_par_suppliers_contact.postcode <=", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeLike(String value) {
            addCriterion("temp_par_suppliers_contact.postcode like", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotLike(String value) {
            addCriterion("temp_par_suppliers_contact.postcode not like", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeIn(List<String> values) {
            addCriterion("temp_par_suppliers_contact.postcode in", values, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotIn(List<String> values) {
            addCriterion("temp_par_suppliers_contact.postcode not in", values, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeBetween(String value1, String value2) {
            addCriterion("temp_par_suppliers_contact.postcode between", value1, value2, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotBetween(String value1, String value2) {
            addCriterion("temp_par_suppliers_contact.postcode not between", value1, value2, "postcode");
            return (Criteria) this;
        }

        public Criteria andHomePhoneIsNull() {
            addCriterion("temp_par_suppliers_contact.home_phone is null");
            return (Criteria) this;
        }

        public Criteria andHomePhoneIsNotNull() {
            addCriterion("temp_par_suppliers_contact.home_phone is not null");
            return (Criteria) this;
        }

        public Criteria andHomePhoneEqualTo(String value) {
            addCriterion("temp_par_suppliers_contact.home_phone =", value, "homePhone");
            return (Criteria) this;
        }

        public Criteria andHomePhoneNotEqualTo(String value) {
            addCriterion("temp_par_suppliers_contact.home_phone <>", value, "homePhone");
            return (Criteria) this;
        }

        public Criteria andHomePhoneGreaterThan(String value) {
            addCriterion("temp_par_suppliers_contact.home_phone >", value, "homePhone");
            return (Criteria) this;
        }

        public Criteria andHomePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("temp_par_suppliers_contact.home_phone >=", value, "homePhone");
            return (Criteria) this;
        }

        public Criteria andHomePhoneLessThan(String value) {
            addCriterion("temp_par_suppliers_contact.home_phone <", value, "homePhone");
            return (Criteria) this;
        }

        public Criteria andHomePhoneLessThanOrEqualTo(String value) {
            addCriterion("temp_par_suppliers_contact.home_phone <=", value, "homePhone");
            return (Criteria) this;
        }

        public Criteria andHomePhoneLike(String value) {
            addCriterion("temp_par_suppliers_contact.home_phone like", value, "homePhone");
            return (Criteria) this;
        }

        public Criteria andHomePhoneNotLike(String value) {
            addCriterion("temp_par_suppliers_contact.home_phone not like", value, "homePhone");
            return (Criteria) this;
        }

        public Criteria andHomePhoneIn(List<String> values) {
            addCriterion("temp_par_suppliers_contact.home_phone in", values, "homePhone");
            return (Criteria) this;
        }

        public Criteria andHomePhoneNotIn(List<String> values) {
            addCriterion("temp_par_suppliers_contact.home_phone not in", values, "homePhone");
            return (Criteria) this;
        }

        public Criteria andHomePhoneBetween(String value1, String value2) {
            addCriterion("temp_par_suppliers_contact.home_phone between", value1, value2, "homePhone");
            return (Criteria) this;
        }

        public Criteria andHomePhoneNotBetween(String value1, String value2) {
            addCriterion("temp_par_suppliers_contact.home_phone not between", value1, value2, "homePhone");
            return (Criteria) this;
        }

        public Criteria andHomeAdressIsNull() {
            addCriterion("temp_par_suppliers_contact.home_adress is null");
            return (Criteria) this;
        }

        public Criteria andHomeAdressIsNotNull() {
            addCriterion("temp_par_suppliers_contact.home_adress is not null");
            return (Criteria) this;
        }

        public Criteria andHomeAdressEqualTo(String value) {
            addCriterion("temp_par_suppliers_contact.home_adress =", value, "homeAdress");
            return (Criteria) this;
        }

        public Criteria andHomeAdressNotEqualTo(String value) {
            addCriterion("temp_par_suppliers_contact.home_adress <>", value, "homeAdress");
            return (Criteria) this;
        }

        public Criteria andHomeAdressGreaterThan(String value) {
            addCriterion("temp_par_suppliers_contact.home_adress >", value, "homeAdress");
            return (Criteria) this;
        }

        public Criteria andHomeAdressGreaterThanOrEqualTo(String value) {
            addCriterion("temp_par_suppliers_contact.home_adress >=", value, "homeAdress");
            return (Criteria) this;
        }

        public Criteria andHomeAdressLessThan(String value) {
            addCriterion("temp_par_suppliers_contact.home_adress <", value, "homeAdress");
            return (Criteria) this;
        }

        public Criteria andHomeAdressLessThanOrEqualTo(String value) {
            addCriterion("temp_par_suppliers_contact.home_adress <=", value, "homeAdress");
            return (Criteria) this;
        }

        public Criteria andHomeAdressLike(String value) {
            addCriterion("temp_par_suppliers_contact.home_adress like", value, "homeAdress");
            return (Criteria) this;
        }

        public Criteria andHomeAdressNotLike(String value) {
            addCriterion("temp_par_suppliers_contact.home_adress not like", value, "homeAdress");
            return (Criteria) this;
        }

        public Criteria andHomeAdressIn(List<String> values) {
            addCriterion("temp_par_suppliers_contact.home_adress in", values, "homeAdress");
            return (Criteria) this;
        }

        public Criteria andHomeAdressNotIn(List<String> values) {
            addCriterion("temp_par_suppliers_contact.home_adress not in", values, "homeAdress");
            return (Criteria) this;
        }

        public Criteria andHomeAdressBetween(String value1, String value2) {
            addCriterion("temp_par_suppliers_contact.home_adress between", value1, value2, "homeAdress");
            return (Criteria) this;
        }

        public Criteria andHomeAdressNotBetween(String value1, String value2) {
            addCriterion("temp_par_suppliers_contact.home_adress not between", value1, value2, "homeAdress");
            return (Criteria) this;
        }

        public Criteria andMsnIsNull() {
            addCriterion("temp_par_suppliers_contact.msn is null");
            return (Criteria) this;
        }

        public Criteria andMsnIsNotNull() {
            addCriterion("temp_par_suppliers_contact.msn is not null");
            return (Criteria) this;
        }

        public Criteria andMsnEqualTo(String value) {
            addCriterion("temp_par_suppliers_contact.msn =", value, "msn");
            return (Criteria) this;
        }

        public Criteria andMsnNotEqualTo(String value) {
            addCriterion("temp_par_suppliers_contact.msn <>", value, "msn");
            return (Criteria) this;
        }

        public Criteria andMsnGreaterThan(String value) {
            addCriterion("temp_par_suppliers_contact.msn >", value, "msn");
            return (Criteria) this;
        }

        public Criteria andMsnGreaterThanOrEqualTo(String value) {
            addCriterion("temp_par_suppliers_contact.msn >=", value, "msn");
            return (Criteria) this;
        }

        public Criteria andMsnLessThan(String value) {
            addCriterion("temp_par_suppliers_contact.msn <", value, "msn");
            return (Criteria) this;
        }

        public Criteria andMsnLessThanOrEqualTo(String value) {
            addCriterion("temp_par_suppliers_contact.msn <=", value, "msn");
            return (Criteria) this;
        }

        public Criteria andMsnLike(String value) {
            addCriterion("temp_par_suppliers_contact.msn like", value, "msn");
            return (Criteria) this;
        }

        public Criteria andMsnNotLike(String value) {
            addCriterion("temp_par_suppliers_contact.msn not like", value, "msn");
            return (Criteria) this;
        }

        public Criteria andMsnIn(List<String> values) {
            addCriterion("temp_par_suppliers_contact.msn in", values, "msn");
            return (Criteria) this;
        }

        public Criteria andMsnNotIn(List<String> values) {
            addCriterion("temp_par_suppliers_contact.msn not in", values, "msn");
            return (Criteria) this;
        }

        public Criteria andMsnBetween(String value1, String value2) {
            addCriterion("temp_par_suppliers_contact.msn between", value1, value2, "msn");
            return (Criteria) this;
        }

        public Criteria andMsnNotBetween(String value1, String value2) {
            addCriterion("temp_par_suppliers_contact.msn not between", value1, value2, "msn");
            return (Criteria) this;
        }

        public Criteria andQqIsNull() {
            addCriterion("temp_par_suppliers_contact.qq is null");
            return (Criteria) this;
        }

        public Criteria andQqIsNotNull() {
            addCriterion("temp_par_suppliers_contact.qq is not null");
            return (Criteria) this;
        }

        public Criteria andQqEqualTo(String value) {
            addCriterion("temp_par_suppliers_contact.qq =", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotEqualTo(String value) {
            addCriterion("temp_par_suppliers_contact.qq <>", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqGreaterThan(String value) {
            addCriterion("temp_par_suppliers_contact.qq >", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqGreaterThanOrEqualTo(String value) {
            addCriterion("temp_par_suppliers_contact.qq >=", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLessThan(String value) {
            addCriterion("temp_par_suppliers_contact.qq <", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLessThanOrEqualTo(String value) {
            addCriterion("temp_par_suppliers_contact.qq <=", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLike(String value) {
            addCriterion("temp_par_suppliers_contact.qq like", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotLike(String value) {
            addCriterion("temp_par_suppliers_contact.qq not like", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqIn(List<String> values) {
            addCriterion("temp_par_suppliers_contact.qq in", values, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotIn(List<String> values) {
            addCriterion("temp_par_suppliers_contact.qq not in", values, "qq");
            return (Criteria) this;
        }

        public Criteria andQqBetween(String value1, String value2) {
            addCriterion("temp_par_suppliers_contact.qq between", value1, value2, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotBetween(String value1, String value2) {
            addCriterion("temp_par_suppliers_contact.qq not between", value1, value2, "qq");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("temp_par_suppliers_contact.birthday is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("temp_par_suppliers_contact.birthday is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(Date value) {
            addCriterion("temp_par_suppliers_contact.birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(Date value) {
            addCriterion("temp_par_suppliers_contact.birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(Date value) {
            addCriterion("temp_par_suppliers_contact.birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_par_suppliers_contact.birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(Date value) {
            addCriterion("temp_par_suppliers_contact.birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(Date value) {
            addCriterion("temp_par_suppliers_contact.birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<Date> values) {
            addCriterion("temp_par_suppliers_contact.birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<Date> values) {
            addCriterion("temp_par_suppliers_contact.birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(Date value1, Date value2) {
            addCriterion("temp_par_suppliers_contact.birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(Date value1, Date value2) {
            addCriterion("temp_par_suppliers_contact.birthday not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andHobbyIsNull() {
            addCriterion("temp_par_suppliers_contact.hobby is null");
            return (Criteria) this;
        }

        public Criteria andHobbyIsNotNull() {
            addCriterion("temp_par_suppliers_contact.hobby is not null");
            return (Criteria) this;
        }

        public Criteria andHobbyEqualTo(String value) {
            addCriterion("temp_par_suppliers_contact.hobby =", value, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyNotEqualTo(String value) {
            addCriterion("temp_par_suppliers_contact.hobby <>", value, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyGreaterThan(String value) {
            addCriterion("temp_par_suppliers_contact.hobby >", value, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyGreaterThanOrEqualTo(String value) {
            addCriterion("temp_par_suppliers_contact.hobby >=", value, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyLessThan(String value) {
            addCriterion("temp_par_suppliers_contact.hobby <", value, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyLessThanOrEqualTo(String value) {
            addCriterion("temp_par_suppliers_contact.hobby <=", value, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyLike(String value) {
            addCriterion("temp_par_suppliers_contact.hobby like", value, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyNotLike(String value) {
            addCriterion("temp_par_suppliers_contact.hobby not like", value, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyIn(List<String> values) {
            addCriterion("temp_par_suppliers_contact.hobby in", values, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyNotIn(List<String> values) {
            addCriterion("temp_par_suppliers_contact.hobby not in", values, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyBetween(String value1, String value2) {
            addCriterion("temp_par_suppliers_contact.hobby between", value1, value2, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyNotBetween(String value1, String value2) {
            addCriterion("temp_par_suppliers_contact.hobby not between", value1, value2, "hobby");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("temp_par_suppliers_contact.remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("temp_par_suppliers_contact.remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("temp_par_suppliers_contact.remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("temp_par_suppliers_contact.remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("temp_par_suppliers_contact.remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("temp_par_suppliers_contact.remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("temp_par_suppliers_contact.remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("temp_par_suppliers_contact.remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("temp_par_suppliers_contact.remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("temp_par_suppliers_contact.remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("temp_par_suppliers_contact.remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("temp_par_suppliers_contact.remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("temp_par_suppliers_contact.remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("temp_par_suppliers_contact.remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andEnabledIsNull() {
            addCriterion("temp_par_suppliers_contact.enabled is null");
            return (Criteria) this;
        }

        public Criteria andEnabledIsNotNull() {
            addCriterion("temp_par_suppliers_contact.enabled is not null");
            return (Criteria) this;
        }

        public Criteria andEnabledEqualTo(String value) {
            addCriterion("temp_par_suppliers_contact.enabled =", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotEqualTo(String value) {
            addCriterion("temp_par_suppliers_contact.enabled <>", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledGreaterThan(String value) {
            addCriterion("temp_par_suppliers_contact.enabled >", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledGreaterThanOrEqualTo(String value) {
            addCriterion("temp_par_suppliers_contact.enabled >=", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledLessThan(String value) {
            addCriterion("temp_par_suppliers_contact.enabled <", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledLessThanOrEqualTo(String value) {
            addCriterion("temp_par_suppliers_contact.enabled <=", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledLike(String value) {
            addCriterion("temp_par_suppliers_contact.enabled like", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotLike(String value) {
            addCriterion("temp_par_suppliers_contact.enabled not like", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledIn(List<String> values) {
            addCriterion("temp_par_suppliers_contact.enabled in", values, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotIn(List<String> values) {
            addCriterion("temp_par_suppliers_contact.enabled not in", values, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledBetween(String value1, String value2) {
            addCriterion("temp_par_suppliers_contact.enabled between", value1, value2, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotBetween(String value1, String value2) {
            addCriterion("temp_par_suppliers_contact.enabled not between", value1, value2, "enabled");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNull() {
            addCriterion("temp_par_suppliers_contact.creater is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNotNull() {
            addCriterion("temp_par_suppliers_contact.creater is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterEqualTo(String value) {
            addCriterion("temp_par_suppliers_contact.creater =", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotEqualTo(String value) {
            addCriterion("temp_par_suppliers_contact.creater <>", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThan(String value) {
            addCriterion("temp_par_suppliers_contact.creater >", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_par_suppliers_contact.creater >=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThan(String value) {
            addCriterion("temp_par_suppliers_contact.creater <", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThanOrEqualTo(String value) {
            addCriterion("temp_par_suppliers_contact.creater <=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLike(String value) {
            addCriterion("temp_par_suppliers_contact.creater like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotLike(String value) {
            addCriterion("temp_par_suppliers_contact.creater not like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterIn(List<String> values) {
            addCriterion("temp_par_suppliers_contact.creater in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotIn(List<String> values) {
            addCriterion("temp_par_suppliers_contact.creater not in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterBetween(String value1, String value2) {
            addCriterion("temp_par_suppliers_contact.creater between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotBetween(String value1, String value2) {
            addCriterion("temp_par_suppliers_contact.creater not between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("temp_par_suppliers_contact.create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("temp_par_suppliers_contact.create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("temp_par_suppliers_contact.create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("temp_par_suppliers_contact.create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("temp_par_suppliers_contact.create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_par_suppliers_contact.create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("temp_par_suppliers_contact.create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_par_suppliers_contact.create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("temp_par_suppliers_contact.create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("temp_par_suppliers_contact.create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_par_suppliers_contact.create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_par_suppliers_contact.create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNull() {
            addCriterion("temp_par_suppliers_contact.updater is null");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNotNull() {
            addCriterion("temp_par_suppliers_contact.updater is not null");
            return (Criteria) this;
        }

        public Criteria andUpdaterEqualTo(String value) {
            addCriterion("temp_par_suppliers_contact.updater =", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotEqualTo(String value) {
            addCriterion("temp_par_suppliers_contact.updater <>", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThan(String value) {
            addCriterion("temp_par_suppliers_contact.updater >", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_par_suppliers_contact.updater >=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThan(String value) {
            addCriterion("temp_par_suppliers_contact.updater <", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThanOrEqualTo(String value) {
            addCriterion("temp_par_suppliers_contact.updater <=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLike(String value) {
            addCriterion("temp_par_suppliers_contact.updater like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotLike(String value) {
            addCriterion("temp_par_suppliers_contact.updater not like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterIn(List<String> values) {
            addCriterion("temp_par_suppliers_contact.updater in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotIn(List<String> values) {
            addCriterion("temp_par_suppliers_contact.updater not in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterBetween(String value1, String value2) {
            addCriterion("temp_par_suppliers_contact.updater between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotBetween(String value1, String value2) {
            addCriterion("temp_par_suppliers_contact.updater not between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("temp_par_suppliers_contact.update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("temp_par_suppliers_contact.update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("temp_par_suppliers_contact.update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("temp_par_suppliers_contact.update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("temp_par_suppliers_contact.update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_par_suppliers_contact.update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("temp_par_suppliers_contact.update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_par_suppliers_contact.update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("temp_par_suppliers_contact.update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("temp_par_suppliers_contact.update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_par_suppliers_contact.update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_par_suppliers_contact.update_time not between", value1, value2, "updateTime");
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
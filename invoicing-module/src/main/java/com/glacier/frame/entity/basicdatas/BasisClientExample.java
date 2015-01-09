package com.glacier.frame.entity.basicdatas;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BasisClientExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public BasisClientExample() {
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

        public Criteria andClientIdIsNull() {
            addCriterion("temp_basis_client.client_id is null");
            return (Criteria) this;
        }

        public Criteria andClientIdIsNotNull() {
            addCriterion("temp_basis_client.client_id is not null");
            return (Criteria) this;
        }

        public Criteria andClientIdEqualTo(String value) {
            addCriterion("temp_basis_client.client_id =", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdNotEqualTo(String value) {
            addCriterion("temp_basis_client.client_id <>", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdGreaterThan(String value) {
            addCriterion("temp_basis_client.client_id >", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_basis_client.client_id >=", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdLessThan(String value) {
            addCriterion("temp_basis_client.client_id <", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdLessThanOrEqualTo(String value) {
            addCriterion("temp_basis_client.client_id <=", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdLike(String value) {
            addCriterion("temp_basis_client.client_id like", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdNotLike(String value) {
            addCriterion("temp_basis_client.client_id not like", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdIn(List<String> values) {
            addCriterion("temp_basis_client.client_id in", values, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdNotIn(List<String> values) {
            addCriterion("temp_basis_client.client_id not in", values, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdBetween(String value1, String value2) {
            addCriterion("temp_basis_client.client_id between", value1, value2, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdNotBetween(String value1, String value2) {
            addCriterion("temp_basis_client.client_id not between", value1, value2, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientCodeIsNull() {
            addCriterion("temp_basis_client.client_code is null");
            return (Criteria) this;
        }

        public Criteria andClientCodeIsNotNull() {
            addCriterion("temp_basis_client.client_code is not null");
            return (Criteria) this;
        }

        public Criteria andClientCodeEqualTo(String value) {
            addCriterion("temp_basis_client.client_code =", value, "clientCode");
            return (Criteria) this;
        }

        public Criteria andClientCodeNotEqualTo(String value) {
            addCriterion("temp_basis_client.client_code <>", value, "clientCode");
            return (Criteria) this;
        }

        public Criteria andClientCodeGreaterThan(String value) {
            addCriterion("temp_basis_client.client_code >", value, "clientCode");
            return (Criteria) this;
        }

        public Criteria andClientCodeGreaterThanOrEqualTo(String value) {
            addCriterion("temp_basis_client.client_code >=", value, "clientCode");
            return (Criteria) this;
        }

        public Criteria andClientCodeLessThan(String value) {
            addCriterion("temp_basis_client.client_code <", value, "clientCode");
            return (Criteria) this;
        }

        public Criteria andClientCodeLessThanOrEqualTo(String value) {
            addCriterion("temp_basis_client.client_code <=", value, "clientCode");
            return (Criteria) this;
        }

        public Criteria andClientCodeLike(String value) {
            addCriterion("temp_basis_client.client_code like", value, "clientCode");
            return (Criteria) this;
        }

        public Criteria andClientCodeNotLike(String value) {
            addCriterion("temp_basis_client.client_code not like", value, "clientCode");
            return (Criteria) this;
        }

        public Criteria andClientCodeIn(List<String> values) {
            addCriterion("temp_basis_client.client_code in", values, "clientCode");
            return (Criteria) this;
        }

        public Criteria andClientCodeNotIn(List<String> values) {
            addCriterion("temp_basis_client.client_code not in", values, "clientCode");
            return (Criteria) this;
        }

        public Criteria andClientCodeBetween(String value1, String value2) {
            addCriterion("temp_basis_client.client_code between", value1, value2, "clientCode");
            return (Criteria) this;
        }

        public Criteria andClientCodeNotBetween(String value1, String value2) {
            addCriterion("temp_basis_client.client_code not between", value1, value2, "clientCode");
            return (Criteria) this;
        }

        public Criteria andClientTypeIdIsNull() {
            addCriterion("temp_basis_client.client_type_id is null");
            return (Criteria) this;
        }

        public Criteria andClientTypeIdIsNotNull() {
            addCriterion("temp_basis_client.client_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andClientTypeIdEqualTo(String value) {
            addCriterion("temp_basis_client.client_type_id =", value, "clientTypeId");
            return (Criteria) this;
        }

        public Criteria andClientTypeIdNotEqualTo(String value) {
            addCriterion("temp_basis_client.client_type_id <>", value, "clientTypeId");
            return (Criteria) this;
        }

        public Criteria andClientTypeIdGreaterThan(String value) {
            addCriterion("temp_basis_client.client_type_id >", value, "clientTypeId");
            return (Criteria) this;
        }

        public Criteria andClientTypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_basis_client.client_type_id >=", value, "clientTypeId");
            return (Criteria) this;
        }

        public Criteria andClientTypeIdLessThan(String value) {
            addCriterion("temp_basis_client.client_type_id <", value, "clientTypeId");
            return (Criteria) this;
        }

        public Criteria andClientTypeIdLessThanOrEqualTo(String value) {
            addCriterion("temp_basis_client.client_type_id <=", value, "clientTypeId");
            return (Criteria) this;
        }

        public Criteria andClientTypeIdLike(String value) {
            addCriterion("temp_basis_client.client_type_id like", value, "clientTypeId");
            return (Criteria) this;
        }

        public Criteria andClientTypeIdNotLike(String value) {
            addCriterion("temp_basis_client.client_type_id not like", value, "clientTypeId");
            return (Criteria) this;
        }

        public Criteria andClientTypeIdIn(List<String> values) {
            addCriterion("temp_basis_client.client_type_id in", values, "clientTypeId");
            return (Criteria) this;
        }

        public Criteria andClientTypeIdNotIn(List<String> values) {
            addCriterion("temp_basis_client.client_type_id not in", values, "clientTypeId");
            return (Criteria) this;
        }

        public Criteria andClientTypeIdBetween(String value1, String value2) {
            addCriterion("temp_basis_client.client_type_id between", value1, value2, "clientTypeId");
            return (Criteria) this;
        }

        public Criteria andClientTypeIdNotBetween(String value1, String value2) {
            addCriterion("temp_basis_client.client_type_id not between", value1, value2, "clientTypeId");
            return (Criteria) this;
        }

        public Criteria andClientNameIsNull() {
            addCriterion("temp_basis_client.client_name is null");
            return (Criteria) this;
        }

        public Criteria andClientNameIsNotNull() {
            addCriterion("temp_basis_client.client_name is not null");
            return (Criteria) this;
        }

        public Criteria andClientNameEqualTo(String value) {
            addCriterion("temp_basis_client.client_name =", value, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameNotEqualTo(String value) {
            addCriterion("temp_basis_client.client_name <>", value, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameGreaterThan(String value) {
            addCriterion("temp_basis_client.client_name >", value, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameGreaterThanOrEqualTo(String value) {
            addCriterion("temp_basis_client.client_name >=", value, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameLessThan(String value) {
            addCriterion("temp_basis_client.client_name <", value, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameLessThanOrEqualTo(String value) {
            addCriterion("temp_basis_client.client_name <=", value, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameLike(String value) {
            addCriterion("temp_basis_client.client_name like", value, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameNotLike(String value) {
            addCriterion("temp_basis_client.client_name not like", value, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameIn(List<String> values) {
            addCriterion("temp_basis_client.client_name in", values, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameNotIn(List<String> values) {
            addCriterion("temp_basis_client.client_name not in", values, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameBetween(String value1, String value2) {
            addCriterion("temp_basis_client.client_name between", value1, value2, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameNotBetween(String value1, String value2) {
            addCriterion("temp_basis_client.client_name not between", value1, value2, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientGradeIsNull() {
            addCriterion("temp_basis_client.client_grade is null");
            return (Criteria) this;
        }

        public Criteria andClientGradeIsNotNull() {
            addCriterion("temp_basis_client.client_grade is not null");
            return (Criteria) this;
        }

        public Criteria andClientGradeEqualTo(String value) {
            addCriterion("temp_basis_client.client_grade =", value, "clientGrade");
            return (Criteria) this;
        }

        public Criteria andClientGradeNotEqualTo(String value) {
            addCriterion("temp_basis_client.client_grade <>", value, "clientGrade");
            return (Criteria) this;
        }

        public Criteria andClientGradeGreaterThan(String value) {
            addCriterion("temp_basis_client.client_grade >", value, "clientGrade");
            return (Criteria) this;
        }

        public Criteria andClientGradeGreaterThanOrEqualTo(String value) {
            addCriterion("temp_basis_client.client_grade >=", value, "clientGrade");
            return (Criteria) this;
        }

        public Criteria andClientGradeLessThan(String value) {
            addCriterion("temp_basis_client.client_grade <", value, "clientGrade");
            return (Criteria) this;
        }

        public Criteria andClientGradeLessThanOrEqualTo(String value) {
            addCriterion("temp_basis_client.client_grade <=", value, "clientGrade");
            return (Criteria) this;
        }

        public Criteria andClientGradeLike(String value) {
            addCriterion("temp_basis_client.client_grade like", value, "clientGrade");
            return (Criteria) this;
        }

        public Criteria andClientGradeNotLike(String value) {
            addCriterion("temp_basis_client.client_grade not like", value, "clientGrade");
            return (Criteria) this;
        }

        public Criteria andClientGradeIn(List<String> values) {
            addCriterion("temp_basis_client.client_grade in", values, "clientGrade");
            return (Criteria) this;
        }

        public Criteria andClientGradeNotIn(List<String> values) {
            addCriterion("temp_basis_client.client_grade not in", values, "clientGrade");
            return (Criteria) this;
        }

        public Criteria andClientGradeBetween(String value1, String value2) {
            addCriterion("temp_basis_client.client_grade between", value1, value2, "clientGrade");
            return (Criteria) this;
        }

        public Criteria andClientGradeNotBetween(String value1, String value2) {
            addCriterion("temp_basis_client.client_grade not between", value1, value2, "clientGrade");
            return (Criteria) this;
        }

        public Criteria andClientSourceIsNull() {
            addCriterion("temp_basis_client.client_source is null");
            return (Criteria) this;
        }

        public Criteria andClientSourceIsNotNull() {
            addCriterion("temp_basis_client.client_source is not null");
            return (Criteria) this;
        }

        public Criteria andClientSourceEqualTo(String value) {
            addCriterion("temp_basis_client.client_source =", value, "clientSource");
            return (Criteria) this;
        }

        public Criteria andClientSourceNotEqualTo(String value) {
            addCriterion("temp_basis_client.client_source <>", value, "clientSource");
            return (Criteria) this;
        }

        public Criteria andClientSourceGreaterThan(String value) {
            addCriterion("temp_basis_client.client_source >", value, "clientSource");
            return (Criteria) this;
        }

        public Criteria andClientSourceGreaterThanOrEqualTo(String value) {
            addCriterion("temp_basis_client.client_source >=", value, "clientSource");
            return (Criteria) this;
        }

        public Criteria andClientSourceLessThan(String value) {
            addCriterion("temp_basis_client.client_source <", value, "clientSource");
            return (Criteria) this;
        }

        public Criteria andClientSourceLessThanOrEqualTo(String value) {
            addCriterion("temp_basis_client.client_source <=", value, "clientSource");
            return (Criteria) this;
        }

        public Criteria andClientSourceLike(String value) {
            addCriterion("temp_basis_client.client_source like", value, "clientSource");
            return (Criteria) this;
        }

        public Criteria andClientSourceNotLike(String value) {
            addCriterion("temp_basis_client.client_source not like", value, "clientSource");
            return (Criteria) this;
        }

        public Criteria andClientSourceIn(List<String> values) {
            addCriterion("temp_basis_client.client_source in", values, "clientSource");
            return (Criteria) this;
        }

        public Criteria andClientSourceNotIn(List<String> values) {
            addCriterion("temp_basis_client.client_source not in", values, "clientSource");
            return (Criteria) this;
        }

        public Criteria andClientSourceBetween(String value1, String value2) {
            addCriterion("temp_basis_client.client_source between", value1, value2, "clientSource");
            return (Criteria) this;
        }

        public Criteria andClientSourceNotBetween(String value1, String value2) {
            addCriterion("temp_basis_client.client_source not between", value1, value2, "clientSource");
            return (Criteria) this;
        }

        public Criteria andProvinceManagerIsNull() {
            addCriterion("temp_basis_client.province_manager is null");
            return (Criteria) this;
        }

        public Criteria andProvinceManagerIsNotNull() {
            addCriterion("temp_basis_client.province_manager is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceManagerEqualTo(String value) {
            addCriterion("temp_basis_client.province_manager =", value, "provinceManager");
            return (Criteria) this;
        }

        public Criteria andProvinceManagerNotEqualTo(String value) {
            addCriterion("temp_basis_client.province_manager <>", value, "provinceManager");
            return (Criteria) this;
        }

        public Criteria andProvinceManagerGreaterThan(String value) {
            addCriterion("temp_basis_client.province_manager >", value, "provinceManager");
            return (Criteria) this;
        }

        public Criteria andProvinceManagerGreaterThanOrEqualTo(String value) {
            addCriterion("temp_basis_client.province_manager >=", value, "provinceManager");
            return (Criteria) this;
        }

        public Criteria andProvinceManagerLessThan(String value) {
            addCriterion("temp_basis_client.province_manager <", value, "provinceManager");
            return (Criteria) this;
        }

        public Criteria andProvinceManagerLessThanOrEqualTo(String value) {
            addCriterion("temp_basis_client.province_manager <=", value, "provinceManager");
            return (Criteria) this;
        }

        public Criteria andProvinceManagerLike(String value) {
            addCriterion("temp_basis_client.province_manager like", value, "provinceManager");
            return (Criteria) this;
        }

        public Criteria andProvinceManagerNotLike(String value) {
            addCriterion("temp_basis_client.province_manager not like", value, "provinceManager");
            return (Criteria) this;
        }

        public Criteria andProvinceManagerIn(List<String> values) {
            addCriterion("temp_basis_client.province_manager in", values, "provinceManager");
            return (Criteria) this;
        }

        public Criteria andProvinceManagerNotIn(List<String> values) {
            addCriterion("temp_basis_client.province_manager not in", values, "provinceManager");
            return (Criteria) this;
        }

        public Criteria andProvinceManagerBetween(String value1, String value2) {
            addCriterion("temp_basis_client.province_manager between", value1, value2, "provinceManager");
            return (Criteria) this;
        }

        public Criteria andProvinceManagerNotBetween(String value1, String value2) {
            addCriterion("temp_basis_client.province_manager not between", value1, value2, "provinceManager");
            return (Criteria) this;
        }

        public Criteria andServiceManagerIsNull() {
            addCriterion("temp_basis_client.service_manager is null");
            return (Criteria) this;
        }

        public Criteria andServiceManagerIsNotNull() {
            addCriterion("temp_basis_client.service_manager is not null");
            return (Criteria) this;
        }

        public Criteria andServiceManagerEqualTo(String value) {
            addCriterion("temp_basis_client.service_manager =", value, "serviceManager");
            return (Criteria) this;
        }

        public Criteria andServiceManagerNotEqualTo(String value) {
            addCriterion("temp_basis_client.service_manager <>", value, "serviceManager");
            return (Criteria) this;
        }

        public Criteria andServiceManagerGreaterThan(String value) {
            addCriterion("temp_basis_client.service_manager >", value, "serviceManager");
            return (Criteria) this;
        }

        public Criteria andServiceManagerGreaterThanOrEqualTo(String value) {
            addCriterion("temp_basis_client.service_manager >=", value, "serviceManager");
            return (Criteria) this;
        }

        public Criteria andServiceManagerLessThan(String value) {
            addCriterion("temp_basis_client.service_manager <", value, "serviceManager");
            return (Criteria) this;
        }

        public Criteria andServiceManagerLessThanOrEqualTo(String value) {
            addCriterion("temp_basis_client.service_manager <=", value, "serviceManager");
            return (Criteria) this;
        }

        public Criteria andServiceManagerLike(String value) {
            addCriterion("temp_basis_client.service_manager like", value, "serviceManager");
            return (Criteria) this;
        }

        public Criteria andServiceManagerNotLike(String value) {
            addCriterion("temp_basis_client.service_manager not like", value, "serviceManager");
            return (Criteria) this;
        }

        public Criteria andServiceManagerIn(List<String> values) {
            addCriterion("temp_basis_client.service_manager in", values, "serviceManager");
            return (Criteria) this;
        }

        public Criteria andServiceManagerNotIn(List<String> values) {
            addCriterion("temp_basis_client.service_manager not in", values, "serviceManager");
            return (Criteria) this;
        }

        public Criteria andServiceManagerBetween(String value1, String value2) {
            addCriterion("temp_basis_client.service_manager between", value1, value2, "serviceManager");
            return (Criteria) this;
        }

        public Criteria andServiceManagerNotBetween(String value1, String value2) {
            addCriterion("temp_basis_client.service_manager not between", value1, value2, "serviceManager");
            return (Criteria) this;
        }

        public Criteria andCompanyScaleIsNull() {
            addCriterion("temp_basis_client.company_scale is null");
            return (Criteria) this;
        }

        public Criteria andCompanyScaleIsNotNull() {
            addCriterion("temp_basis_client.company_scale is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyScaleEqualTo(String value) {
            addCriterion("temp_basis_client.company_scale =", value, "companyScale");
            return (Criteria) this;
        }

        public Criteria andCompanyScaleNotEqualTo(String value) {
            addCriterion("temp_basis_client.company_scale <>", value, "companyScale");
            return (Criteria) this;
        }

        public Criteria andCompanyScaleGreaterThan(String value) {
            addCriterion("temp_basis_client.company_scale >", value, "companyScale");
            return (Criteria) this;
        }

        public Criteria andCompanyScaleGreaterThanOrEqualTo(String value) {
            addCriterion("temp_basis_client.company_scale >=", value, "companyScale");
            return (Criteria) this;
        }

        public Criteria andCompanyScaleLessThan(String value) {
            addCriterion("temp_basis_client.company_scale <", value, "companyScale");
            return (Criteria) this;
        }

        public Criteria andCompanyScaleLessThanOrEqualTo(String value) {
            addCriterion("temp_basis_client.company_scale <=", value, "companyScale");
            return (Criteria) this;
        }

        public Criteria andCompanyScaleLike(String value) {
            addCriterion("temp_basis_client.company_scale like", value, "companyScale");
            return (Criteria) this;
        }

        public Criteria andCompanyScaleNotLike(String value) {
            addCriterion("temp_basis_client.company_scale not like", value, "companyScale");
            return (Criteria) this;
        }

        public Criteria andCompanyScaleIn(List<String> values) {
            addCriterion("temp_basis_client.company_scale in", values, "companyScale");
            return (Criteria) this;
        }

        public Criteria andCompanyScaleNotIn(List<String> values) {
            addCriterion("temp_basis_client.company_scale not in", values, "companyScale");
            return (Criteria) this;
        }

        public Criteria andCompanyScaleBetween(String value1, String value2) {
            addCriterion("temp_basis_client.company_scale between", value1, value2, "companyScale");
            return (Criteria) this;
        }

        public Criteria andCompanyScaleNotBetween(String value1, String value2) {
            addCriterion("temp_basis_client.company_scale not between", value1, value2, "companyScale");
            return (Criteria) this;
        }

        public Criteria andMarketingDepartmentIsNull() {
            addCriterion("temp_basis_client.marketing_department is null");
            return (Criteria) this;
        }

        public Criteria andMarketingDepartmentIsNotNull() {
            addCriterion("temp_basis_client.marketing_department is not null");
            return (Criteria) this;
        }

        public Criteria andMarketingDepartmentEqualTo(String value) {
            addCriterion("temp_basis_client.marketing_department =", value, "marketingDepartment");
            return (Criteria) this;
        }

        public Criteria andMarketingDepartmentNotEqualTo(String value) {
            addCriterion("temp_basis_client.marketing_department <>", value, "marketingDepartment");
            return (Criteria) this;
        }

        public Criteria andMarketingDepartmentGreaterThan(String value) {
            addCriterion("temp_basis_client.marketing_department >", value, "marketingDepartment");
            return (Criteria) this;
        }

        public Criteria andMarketingDepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("temp_basis_client.marketing_department >=", value, "marketingDepartment");
            return (Criteria) this;
        }

        public Criteria andMarketingDepartmentLessThan(String value) {
            addCriterion("temp_basis_client.marketing_department <", value, "marketingDepartment");
            return (Criteria) this;
        }

        public Criteria andMarketingDepartmentLessThanOrEqualTo(String value) {
            addCriterion("temp_basis_client.marketing_department <=", value, "marketingDepartment");
            return (Criteria) this;
        }

        public Criteria andMarketingDepartmentLike(String value) {
            addCriterion("temp_basis_client.marketing_department like", value, "marketingDepartment");
            return (Criteria) this;
        }

        public Criteria andMarketingDepartmentNotLike(String value) {
            addCriterion("temp_basis_client.marketing_department not like", value, "marketingDepartment");
            return (Criteria) this;
        }

        public Criteria andMarketingDepartmentIn(List<String> values) {
            addCriterion("temp_basis_client.marketing_department in", values, "marketingDepartment");
            return (Criteria) this;
        }

        public Criteria andMarketingDepartmentNotIn(List<String> values) {
            addCriterion("temp_basis_client.marketing_department not in", values, "marketingDepartment");
            return (Criteria) this;
        }

        public Criteria andMarketingDepartmentBetween(String value1, String value2) {
            addCriterion("temp_basis_client.marketing_department between", value1, value2, "marketingDepartment");
            return (Criteria) this;
        }

        public Criteria andMarketingDepartmentNotBetween(String value1, String value2) {
            addCriterion("temp_basis_client.marketing_department not between", value1, value2, "marketingDepartment");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneIsNull() {
            addCriterion("temp_basis_client.company_phone is null");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneIsNotNull() {
            addCriterion("temp_basis_client.company_phone is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneEqualTo(String value) {
            addCriterion("temp_basis_client.company_phone =", value, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneNotEqualTo(String value) {
            addCriterion("temp_basis_client.company_phone <>", value, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneGreaterThan(String value) {
            addCriterion("temp_basis_client.company_phone >", value, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("temp_basis_client.company_phone >=", value, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneLessThan(String value) {
            addCriterion("temp_basis_client.company_phone <", value, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneLessThanOrEqualTo(String value) {
            addCriterion("temp_basis_client.company_phone <=", value, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneLike(String value) {
            addCriterion("temp_basis_client.company_phone like", value, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneNotLike(String value) {
            addCriterion("temp_basis_client.company_phone not like", value, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneIn(List<String> values) {
            addCriterion("temp_basis_client.company_phone in", values, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneNotIn(List<String> values) {
            addCriterion("temp_basis_client.company_phone not in", values, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneBetween(String value1, String value2) {
            addCriterion("temp_basis_client.company_phone between", value1, value2, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneNotBetween(String value1, String value2) {
            addCriterion("temp_basis_client.company_phone not between", value1, value2, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyFaxIsNull() {
            addCriterion("temp_basis_client.company_fax is null");
            return (Criteria) this;
        }

        public Criteria andCompanyFaxIsNotNull() {
            addCriterion("temp_basis_client.company_fax is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyFaxEqualTo(String value) {
            addCriterion("temp_basis_client.company_fax =", value, "companyFax");
            return (Criteria) this;
        }

        public Criteria andCompanyFaxNotEqualTo(String value) {
            addCriterion("temp_basis_client.company_fax <>", value, "companyFax");
            return (Criteria) this;
        }

        public Criteria andCompanyFaxGreaterThan(String value) {
            addCriterion("temp_basis_client.company_fax >", value, "companyFax");
            return (Criteria) this;
        }

        public Criteria andCompanyFaxGreaterThanOrEqualTo(String value) {
            addCriterion("temp_basis_client.company_fax >=", value, "companyFax");
            return (Criteria) this;
        }

        public Criteria andCompanyFaxLessThan(String value) {
            addCriterion("temp_basis_client.company_fax <", value, "companyFax");
            return (Criteria) this;
        }

        public Criteria andCompanyFaxLessThanOrEqualTo(String value) {
            addCriterion("temp_basis_client.company_fax <=", value, "companyFax");
            return (Criteria) this;
        }

        public Criteria andCompanyFaxLike(String value) {
            addCriterion("temp_basis_client.company_fax like", value, "companyFax");
            return (Criteria) this;
        }

        public Criteria andCompanyFaxNotLike(String value) {
            addCriterion("temp_basis_client.company_fax not like", value, "companyFax");
            return (Criteria) this;
        }

        public Criteria andCompanyFaxIn(List<String> values) {
            addCriterion("temp_basis_client.company_fax in", values, "companyFax");
            return (Criteria) this;
        }

        public Criteria andCompanyFaxNotIn(List<String> values) {
            addCriterion("temp_basis_client.company_fax not in", values, "companyFax");
            return (Criteria) this;
        }

        public Criteria andCompanyFaxBetween(String value1, String value2) {
            addCriterion("temp_basis_client.company_fax between", value1, value2, "companyFax");
            return (Criteria) this;
        }

        public Criteria andCompanyFaxNotBetween(String value1, String value2) {
            addCriterion("temp_basis_client.company_fax not between", value1, value2, "companyFax");
            return (Criteria) this;
        }

        public Criteria andCompanyWebsiteIsNull() {
            addCriterion("temp_basis_client.company_website is null");
            return (Criteria) this;
        }

        public Criteria andCompanyWebsiteIsNotNull() {
            addCriterion("temp_basis_client.company_website is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyWebsiteEqualTo(String value) {
            addCriterion("temp_basis_client.company_website =", value, "companyWebsite");
            return (Criteria) this;
        }

        public Criteria andCompanyWebsiteNotEqualTo(String value) {
            addCriterion("temp_basis_client.company_website <>", value, "companyWebsite");
            return (Criteria) this;
        }

        public Criteria andCompanyWebsiteGreaterThan(String value) {
            addCriterion("temp_basis_client.company_website >", value, "companyWebsite");
            return (Criteria) this;
        }

        public Criteria andCompanyWebsiteGreaterThanOrEqualTo(String value) {
            addCriterion("temp_basis_client.company_website >=", value, "companyWebsite");
            return (Criteria) this;
        }

        public Criteria andCompanyWebsiteLessThan(String value) {
            addCriterion("temp_basis_client.company_website <", value, "companyWebsite");
            return (Criteria) this;
        }

        public Criteria andCompanyWebsiteLessThanOrEqualTo(String value) {
            addCriterion("temp_basis_client.company_website <=", value, "companyWebsite");
            return (Criteria) this;
        }

        public Criteria andCompanyWebsiteLike(String value) {
            addCriterion("temp_basis_client.company_website like", value, "companyWebsite");
            return (Criteria) this;
        }

        public Criteria andCompanyWebsiteNotLike(String value) {
            addCriterion("temp_basis_client.company_website not like", value, "companyWebsite");
            return (Criteria) this;
        }

        public Criteria andCompanyWebsiteIn(List<String> values) {
            addCriterion("temp_basis_client.company_website in", values, "companyWebsite");
            return (Criteria) this;
        }

        public Criteria andCompanyWebsiteNotIn(List<String> values) {
            addCriterion("temp_basis_client.company_website not in", values, "companyWebsite");
            return (Criteria) this;
        }

        public Criteria andCompanyWebsiteBetween(String value1, String value2) {
            addCriterion("temp_basis_client.company_website between", value1, value2, "companyWebsite");
            return (Criteria) this;
        }

        public Criteria andCompanyWebsiteNotBetween(String value1, String value2) {
            addCriterion("temp_basis_client.company_website not between", value1, value2, "companyWebsite");
            return (Criteria) this;
        }

        public Criteria andCompanyEmailIsNull() {
            addCriterion("temp_basis_client.company_email is null");
            return (Criteria) this;
        }

        public Criteria andCompanyEmailIsNotNull() {
            addCriterion("temp_basis_client.company_email is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyEmailEqualTo(String value) {
            addCriterion("temp_basis_client.company_email =", value, "companyEmail");
            return (Criteria) this;
        }

        public Criteria andCompanyEmailNotEqualTo(String value) {
            addCriterion("temp_basis_client.company_email <>", value, "companyEmail");
            return (Criteria) this;
        }

        public Criteria andCompanyEmailGreaterThan(String value) {
            addCriterion("temp_basis_client.company_email >", value, "companyEmail");
            return (Criteria) this;
        }

        public Criteria andCompanyEmailGreaterThanOrEqualTo(String value) {
            addCriterion("temp_basis_client.company_email >=", value, "companyEmail");
            return (Criteria) this;
        }

        public Criteria andCompanyEmailLessThan(String value) {
            addCriterion("temp_basis_client.company_email <", value, "companyEmail");
            return (Criteria) this;
        }

        public Criteria andCompanyEmailLessThanOrEqualTo(String value) {
            addCriterion("temp_basis_client.company_email <=", value, "companyEmail");
            return (Criteria) this;
        }

        public Criteria andCompanyEmailLike(String value) {
            addCriterion("temp_basis_client.company_email like", value, "companyEmail");
            return (Criteria) this;
        }

        public Criteria andCompanyEmailNotLike(String value) {
            addCriterion("temp_basis_client.company_email not like", value, "companyEmail");
            return (Criteria) this;
        }

        public Criteria andCompanyEmailIn(List<String> values) {
            addCriterion("temp_basis_client.company_email in", values, "companyEmail");
            return (Criteria) this;
        }

        public Criteria andCompanyEmailNotIn(List<String> values) {
            addCriterion("temp_basis_client.company_email not in", values, "companyEmail");
            return (Criteria) this;
        }

        public Criteria andCompanyEmailBetween(String value1, String value2) {
            addCriterion("temp_basis_client.company_email between", value1, value2, "companyEmail");
            return (Criteria) this;
        }

        public Criteria andCompanyEmailNotBetween(String value1, String value2) {
            addCriterion("temp_basis_client.company_email not between", value1, value2, "companyEmail");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNull() {
            addCriterion("temp_basis_client.province is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("temp_basis_client.province is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(String value) {
            addCriterion("temp_basis_client.province =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(String value) {
            addCriterion("temp_basis_client.province <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(String value) {
            addCriterion("temp_basis_client.province >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("temp_basis_client.province >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(String value) {
            addCriterion("temp_basis_client.province <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(String value) {
            addCriterion("temp_basis_client.province <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLike(String value) {
            addCriterion("temp_basis_client.province like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotLike(String value) {
            addCriterion("temp_basis_client.province not like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<String> values) {
            addCriterion("temp_basis_client.province in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<String> values) {
            addCriterion("temp_basis_client.province not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(String value1, String value2) {
            addCriterion("temp_basis_client.province between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(String value1, String value2) {
            addCriterion("temp_basis_client.province not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("temp_basis_client.city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("temp_basis_client.city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("temp_basis_client.city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("temp_basis_client.city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("temp_basis_client.city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("temp_basis_client.city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("temp_basis_client.city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("temp_basis_client.city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("temp_basis_client.city like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("temp_basis_client.city not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("temp_basis_client.city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("temp_basis_client.city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("temp_basis_client.city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("temp_basis_client.city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andAdressIsNull() {
            addCriterion("temp_basis_client.adress is null");
            return (Criteria) this;
        }

        public Criteria andAdressIsNotNull() {
            addCriterion("temp_basis_client.adress is not null");
            return (Criteria) this;
        }

        public Criteria andAdressEqualTo(String value) {
            addCriterion("temp_basis_client.adress =", value, "adress");
            return (Criteria) this;
        }

        public Criteria andAdressNotEqualTo(String value) {
            addCriterion("temp_basis_client.adress <>", value, "adress");
            return (Criteria) this;
        }

        public Criteria andAdressGreaterThan(String value) {
            addCriterion("temp_basis_client.adress >", value, "adress");
            return (Criteria) this;
        }

        public Criteria andAdressGreaterThanOrEqualTo(String value) {
            addCriterion("temp_basis_client.adress >=", value, "adress");
            return (Criteria) this;
        }

        public Criteria andAdressLessThan(String value) {
            addCriterion("temp_basis_client.adress <", value, "adress");
            return (Criteria) this;
        }

        public Criteria andAdressLessThanOrEqualTo(String value) {
            addCriterion("temp_basis_client.adress <=", value, "adress");
            return (Criteria) this;
        }

        public Criteria andAdressLike(String value) {
            addCriterion("temp_basis_client.adress like", value, "adress");
            return (Criteria) this;
        }

        public Criteria andAdressNotLike(String value) {
            addCriterion("temp_basis_client.adress not like", value, "adress");
            return (Criteria) this;
        }

        public Criteria andAdressIn(List<String> values) {
            addCriterion("temp_basis_client.adress in", values, "adress");
            return (Criteria) this;
        }

        public Criteria andAdressNotIn(List<String> values) {
            addCriterion("temp_basis_client.adress not in", values, "adress");
            return (Criteria) this;
        }

        public Criteria andAdressBetween(String value1, String value2) {
            addCriterion("temp_basis_client.adress between", value1, value2, "adress");
            return (Criteria) this;
        }

        public Criteria andAdressNotBetween(String value1, String value2) {
            addCriterion("temp_basis_client.adress not between", value1, value2, "adress");
            return (Criteria) this;
        }

        public Criteria andZipCodeIsNull() {
            addCriterion("temp_basis_client.zip_code is null");
            return (Criteria) this;
        }

        public Criteria andZipCodeIsNotNull() {
            addCriterion("temp_basis_client.zip_code is not null");
            return (Criteria) this;
        }

        public Criteria andZipCodeEqualTo(String value) {
            addCriterion("temp_basis_client.zip_code =", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeNotEqualTo(String value) {
            addCriterion("temp_basis_client.zip_code <>", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeGreaterThan(String value) {
            addCriterion("temp_basis_client.zip_code >", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeGreaterThanOrEqualTo(String value) {
            addCriterion("temp_basis_client.zip_code >=", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeLessThan(String value) {
            addCriterion("temp_basis_client.zip_code <", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeLessThanOrEqualTo(String value) {
            addCriterion("temp_basis_client.zip_code <=", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeLike(String value) {
            addCriterion("temp_basis_client.zip_code like", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeNotLike(String value) {
            addCriterion("temp_basis_client.zip_code not like", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeIn(List<String> values) {
            addCriterion("temp_basis_client.zip_code in", values, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeNotIn(List<String> values) {
            addCriterion("temp_basis_client.zip_code not in", values, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeBetween(String value1, String value2) {
            addCriterion("temp_basis_client.zip_code between", value1, value2, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeNotBetween(String value1, String value2) {
            addCriterion("temp_basis_client.zip_code not between", value1, value2, "zipCode");
            return (Criteria) this;
        }

        public Criteria andPricePolicyIsNull() {
            addCriterion("temp_basis_client.price_policy is null");
            return (Criteria) this;
        }

        public Criteria andPricePolicyIsNotNull() {
            addCriterion("temp_basis_client.price_policy is not null");
            return (Criteria) this;
        }

        public Criteria andPricePolicyEqualTo(String value) {
            addCriterion("temp_basis_client.price_policy =", value, "pricePolicy");
            return (Criteria) this;
        }

        public Criteria andPricePolicyNotEqualTo(String value) {
            addCriterion("temp_basis_client.price_policy <>", value, "pricePolicy");
            return (Criteria) this;
        }

        public Criteria andPricePolicyGreaterThan(String value) {
            addCriterion("temp_basis_client.price_policy >", value, "pricePolicy");
            return (Criteria) this;
        }

        public Criteria andPricePolicyGreaterThanOrEqualTo(String value) {
            addCriterion("temp_basis_client.price_policy >=", value, "pricePolicy");
            return (Criteria) this;
        }

        public Criteria andPricePolicyLessThan(String value) {
            addCriterion("temp_basis_client.price_policy <", value, "pricePolicy");
            return (Criteria) this;
        }

        public Criteria andPricePolicyLessThanOrEqualTo(String value) {
            addCriterion("temp_basis_client.price_policy <=", value, "pricePolicy");
            return (Criteria) this;
        }

        public Criteria andPricePolicyLike(String value) {
            addCriterion("temp_basis_client.price_policy like", value, "pricePolicy");
            return (Criteria) this;
        }

        public Criteria andPricePolicyNotLike(String value) {
            addCriterion("temp_basis_client.price_policy not like", value, "pricePolicy");
            return (Criteria) this;
        }

        public Criteria andPricePolicyIn(List<String> values) {
            addCriterion("temp_basis_client.price_policy in", values, "pricePolicy");
            return (Criteria) this;
        }

        public Criteria andPricePolicyNotIn(List<String> values) {
            addCriterion("temp_basis_client.price_policy not in", values, "pricePolicy");
            return (Criteria) this;
        }

        public Criteria andPricePolicyBetween(String value1, String value2) {
            addCriterion("temp_basis_client.price_policy between", value1, value2, "pricePolicy");
            return (Criteria) this;
        }

        public Criteria andPricePolicyNotBetween(String value1, String value2) {
            addCriterion("temp_basis_client.price_policy not between", value1, value2, "pricePolicy");
            return (Criteria) this;
        }

        public Criteria andContactCycleIsNull() {
            addCriterion("temp_basis_client.contact_cycle is null");
            return (Criteria) this;
        }

        public Criteria andContactCycleIsNotNull() {
            addCriterion("temp_basis_client.contact_cycle is not null");
            return (Criteria) this;
        }

        public Criteria andContactCycleEqualTo(Integer value) {
            addCriterion("temp_basis_client.contact_cycle =", value, "contactCycle");
            return (Criteria) this;
        }

        public Criteria andContactCycleNotEqualTo(Integer value) {
            addCriterion("temp_basis_client.contact_cycle <>", value, "contactCycle");
            return (Criteria) this;
        }

        public Criteria andContactCycleGreaterThan(Integer value) {
            addCriterion("temp_basis_client.contact_cycle >", value, "contactCycle");
            return (Criteria) this;
        }

        public Criteria andContactCycleGreaterThanOrEqualTo(Integer value) {
            addCriterion("temp_basis_client.contact_cycle >=", value, "contactCycle");
            return (Criteria) this;
        }

        public Criteria andContactCycleLessThan(Integer value) {
            addCriterion("temp_basis_client.contact_cycle <", value, "contactCycle");
            return (Criteria) this;
        }

        public Criteria andContactCycleLessThanOrEqualTo(Integer value) {
            addCriterion("temp_basis_client.contact_cycle <=", value, "contactCycle");
            return (Criteria) this;
        }

        public Criteria andContactCycleIn(List<Integer> values) {
            addCriterion("temp_basis_client.contact_cycle in", values, "contactCycle");
            return (Criteria) this;
        }

        public Criteria andContactCycleNotIn(List<Integer> values) {
            addCriterion("temp_basis_client.contact_cycle not in", values, "contactCycle");
            return (Criteria) this;
        }

        public Criteria andContactCycleBetween(Integer value1, Integer value2) {
            addCriterion("temp_basis_client.contact_cycle between", value1, value2, "contactCycle");
            return (Criteria) this;
        }

        public Criteria andContactCycleNotBetween(Integer value1, Integer value2) {
            addCriterion("temp_basis_client.contact_cycle not between", value1, value2, "contactCycle");
            return (Criteria) this;
        }

        public Criteria andCompanyNatureIdIsNull() {
            addCriterion("temp_basis_client.company_nature_id is null");
            return (Criteria) this;
        }

        public Criteria andCompanyNatureIdIsNotNull() {
            addCriterion("temp_basis_client.company_nature_id is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyNatureIdEqualTo(String value) {
            addCriterion("temp_basis_client.company_nature_id =", value, "companyNatureId");
            return (Criteria) this;
        }

        public Criteria andCompanyNatureIdNotEqualTo(String value) {
            addCriterion("temp_basis_client.company_nature_id <>", value, "companyNatureId");
            return (Criteria) this;
        }

        public Criteria andCompanyNatureIdGreaterThan(String value) {
            addCriterion("temp_basis_client.company_nature_id >", value, "companyNatureId");
            return (Criteria) this;
        }

        public Criteria andCompanyNatureIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_basis_client.company_nature_id >=", value, "companyNatureId");
            return (Criteria) this;
        }

        public Criteria andCompanyNatureIdLessThan(String value) {
            addCriterion("temp_basis_client.company_nature_id <", value, "companyNatureId");
            return (Criteria) this;
        }

        public Criteria andCompanyNatureIdLessThanOrEqualTo(String value) {
            addCriterion("temp_basis_client.company_nature_id <=", value, "companyNatureId");
            return (Criteria) this;
        }

        public Criteria andCompanyNatureIdLike(String value) {
            addCriterion("temp_basis_client.company_nature_id like", value, "companyNatureId");
            return (Criteria) this;
        }

        public Criteria andCompanyNatureIdNotLike(String value) {
            addCriterion("temp_basis_client.company_nature_id not like", value, "companyNatureId");
            return (Criteria) this;
        }

        public Criteria andCompanyNatureIdIn(List<String> values) {
            addCriterion("temp_basis_client.company_nature_id in", values, "companyNatureId");
            return (Criteria) this;
        }

        public Criteria andCompanyNatureIdNotIn(List<String> values) {
            addCriterion("temp_basis_client.company_nature_id not in", values, "companyNatureId");
            return (Criteria) this;
        }

        public Criteria andCompanyNatureIdBetween(String value1, String value2) {
            addCriterion("temp_basis_client.company_nature_id between", value1, value2, "companyNatureId");
            return (Criteria) this;
        }

        public Criteria andCompanyNatureIdNotBetween(String value1, String value2) {
            addCriterion("temp_basis_client.company_nature_id not between", value1, value2, "companyNatureId");
            return (Criteria) this;
        }

        public Criteria andMainBusinessIsNull() {
            addCriterion("temp_basis_client.main_business is null");
            return (Criteria) this;
        }

        public Criteria andMainBusinessIsNotNull() {
            addCriterion("temp_basis_client.main_business is not null");
            return (Criteria) this;
        }

        public Criteria andMainBusinessEqualTo(String value) {
            addCriterion("temp_basis_client.main_business =", value, "mainBusiness");
            return (Criteria) this;
        }

        public Criteria andMainBusinessNotEqualTo(String value) {
            addCriterion("temp_basis_client.main_business <>", value, "mainBusiness");
            return (Criteria) this;
        }

        public Criteria andMainBusinessGreaterThan(String value) {
            addCriterion("temp_basis_client.main_business >", value, "mainBusiness");
            return (Criteria) this;
        }

        public Criteria andMainBusinessGreaterThanOrEqualTo(String value) {
            addCriterion("temp_basis_client.main_business >=", value, "mainBusiness");
            return (Criteria) this;
        }

        public Criteria andMainBusinessLessThan(String value) {
            addCriterion("temp_basis_client.main_business <", value, "mainBusiness");
            return (Criteria) this;
        }

        public Criteria andMainBusinessLessThanOrEqualTo(String value) {
            addCriterion("temp_basis_client.main_business <=", value, "mainBusiness");
            return (Criteria) this;
        }

        public Criteria andMainBusinessLike(String value) {
            addCriterion("temp_basis_client.main_business like", value, "mainBusiness");
            return (Criteria) this;
        }

        public Criteria andMainBusinessNotLike(String value) {
            addCriterion("temp_basis_client.main_business not like", value, "mainBusiness");
            return (Criteria) this;
        }

        public Criteria andMainBusinessIn(List<String> values) {
            addCriterion("temp_basis_client.main_business in", values, "mainBusiness");
            return (Criteria) this;
        }

        public Criteria andMainBusinessNotIn(List<String> values) {
            addCriterion("temp_basis_client.main_business not in", values, "mainBusiness");
            return (Criteria) this;
        }

        public Criteria andMainBusinessBetween(String value1, String value2) {
            addCriterion("temp_basis_client.main_business between", value1, value2, "mainBusiness");
            return (Criteria) this;
        }

        public Criteria andMainBusinessNotBetween(String value1, String value2) {
            addCriterion("temp_basis_client.main_business not between", value1, value2, "mainBusiness");
            return (Criteria) this;
        }

        public Criteria andOpenedYearIsNull() {
            addCriterion("temp_basis_client.opened_year is null");
            return (Criteria) this;
        }

        public Criteria andOpenedYearIsNotNull() {
            addCriterion("temp_basis_client.opened_year is not null");
            return (Criteria) this;
        }

        public Criteria andOpenedYearEqualTo(Date value) {
            addCriterion("temp_basis_client.opened_year =", value, "openedYear");
            return (Criteria) this;
        }

        public Criteria andOpenedYearNotEqualTo(Date value) {
            addCriterion("temp_basis_client.opened_year <>", value, "openedYear");
            return (Criteria) this;
        }

        public Criteria andOpenedYearGreaterThan(Date value) {
            addCriterion("temp_basis_client.opened_year >", value, "openedYear");
            return (Criteria) this;
        }

        public Criteria andOpenedYearGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_basis_client.opened_year >=", value, "openedYear");
            return (Criteria) this;
        }

        public Criteria andOpenedYearLessThan(Date value) {
            addCriterion("temp_basis_client.opened_year <", value, "openedYear");
            return (Criteria) this;
        }

        public Criteria andOpenedYearLessThanOrEqualTo(Date value) {
            addCriterion("temp_basis_client.opened_year <=", value, "openedYear");
            return (Criteria) this;
        }

        public Criteria andOpenedYearIn(List<Date> values) {
            addCriterion("temp_basis_client.opened_year in", values, "openedYear");
            return (Criteria) this;
        }

        public Criteria andOpenedYearNotIn(List<Date> values) {
            addCriterion("temp_basis_client.opened_year not in", values, "openedYear");
            return (Criteria) this;
        }

        public Criteria andOpenedYearBetween(Date value1, Date value2) {
            addCriterion("temp_basis_client.opened_year between", value1, value2, "openedYear");
            return (Criteria) this;
        }

        public Criteria andOpenedYearNotBetween(Date value1, Date value2) {
            addCriterion("temp_basis_client.opened_year not between", value1, value2, "openedYear");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalIsNull() {
            addCriterion("temp_basis_client.registered_capital is null");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalIsNotNull() {
            addCriterion("temp_basis_client.registered_capital is not null");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalEqualTo(BigDecimal value) {
            addCriterion("temp_basis_client.registered_capital =", value, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalNotEqualTo(BigDecimal value) {
            addCriterion("temp_basis_client.registered_capital <>", value, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalGreaterThan(BigDecimal value) {
            addCriterion("temp_basis_client.registered_capital >", value, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_basis_client.registered_capital >=", value, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalLessThan(BigDecimal value) {
            addCriterion("temp_basis_client.registered_capital <", value, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_basis_client.registered_capital <=", value, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalIn(List<BigDecimal> values) {
            addCriterion("temp_basis_client.registered_capital in", values, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalNotIn(List<BigDecimal> values) {
            addCriterion("temp_basis_client.registered_capital not in", values, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_basis_client.registered_capital between", value1, value2, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_basis_client.registered_capital not between", value1, value2, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andCorporateIsNull() {
            addCriterion("temp_basis_client.corporate is null");
            return (Criteria) this;
        }

        public Criteria andCorporateIsNotNull() {
            addCriterion("temp_basis_client.corporate is not null");
            return (Criteria) this;
        }

        public Criteria andCorporateEqualTo(String value) {
            addCriterion("temp_basis_client.corporate =", value, "corporate");
            return (Criteria) this;
        }

        public Criteria andCorporateNotEqualTo(String value) {
            addCriterion("temp_basis_client.corporate <>", value, "corporate");
            return (Criteria) this;
        }

        public Criteria andCorporateGreaterThan(String value) {
            addCriterion("temp_basis_client.corporate >", value, "corporate");
            return (Criteria) this;
        }

        public Criteria andCorporateGreaterThanOrEqualTo(String value) {
            addCriterion("temp_basis_client.corporate >=", value, "corporate");
            return (Criteria) this;
        }

        public Criteria andCorporateLessThan(String value) {
            addCriterion("temp_basis_client.corporate <", value, "corporate");
            return (Criteria) this;
        }

        public Criteria andCorporateLessThanOrEqualTo(String value) {
            addCriterion("temp_basis_client.corporate <=", value, "corporate");
            return (Criteria) this;
        }

        public Criteria andCorporateLike(String value) {
            addCriterion("temp_basis_client.corporate like", value, "corporate");
            return (Criteria) this;
        }

        public Criteria andCorporateNotLike(String value) {
            addCriterion("temp_basis_client.corporate not like", value, "corporate");
            return (Criteria) this;
        }

        public Criteria andCorporateIn(List<String> values) {
            addCriterion("temp_basis_client.corporate in", values, "corporate");
            return (Criteria) this;
        }

        public Criteria andCorporateNotIn(List<String> values) {
            addCriterion("temp_basis_client.corporate not in", values, "corporate");
            return (Criteria) this;
        }

        public Criteria andCorporateBetween(String value1, String value2) {
            addCriterion("temp_basis_client.corporate between", value1, value2, "corporate");
            return (Criteria) this;
        }

        public Criteria andCorporateNotBetween(String value1, String value2) {
            addCriterion("temp_basis_client.corporate not between", value1, value2, "corporate");
            return (Criteria) this;
        }

        public Criteria andCreditLevelIdIsNull() {
            addCriterion("temp_basis_client.credit_level_id is null");
            return (Criteria) this;
        }

        public Criteria andCreditLevelIdIsNotNull() {
            addCriterion("temp_basis_client.credit_level_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreditLevelIdEqualTo(String value) {
            addCriterion("temp_basis_client.credit_level_id =", value, "creditLevelId");
            return (Criteria) this;
        }

        public Criteria andCreditLevelIdNotEqualTo(String value) {
            addCriterion("temp_basis_client.credit_level_id <>", value, "creditLevelId");
            return (Criteria) this;
        }

        public Criteria andCreditLevelIdGreaterThan(String value) {
            addCriterion("temp_basis_client.credit_level_id >", value, "creditLevelId");
            return (Criteria) this;
        }

        public Criteria andCreditLevelIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_basis_client.credit_level_id >=", value, "creditLevelId");
            return (Criteria) this;
        }

        public Criteria andCreditLevelIdLessThan(String value) {
            addCriterion("temp_basis_client.credit_level_id <", value, "creditLevelId");
            return (Criteria) this;
        }

        public Criteria andCreditLevelIdLessThanOrEqualTo(String value) {
            addCriterion("temp_basis_client.credit_level_id <=", value, "creditLevelId");
            return (Criteria) this;
        }

        public Criteria andCreditLevelIdLike(String value) {
            addCriterion("temp_basis_client.credit_level_id like", value, "creditLevelId");
            return (Criteria) this;
        }

        public Criteria andCreditLevelIdNotLike(String value) {
            addCriterion("temp_basis_client.credit_level_id not like", value, "creditLevelId");
            return (Criteria) this;
        }

        public Criteria andCreditLevelIdIn(List<String> values) {
            addCriterion("temp_basis_client.credit_level_id in", values, "creditLevelId");
            return (Criteria) this;
        }

        public Criteria andCreditLevelIdNotIn(List<String> values) {
            addCriterion("temp_basis_client.credit_level_id not in", values, "creditLevelId");
            return (Criteria) this;
        }

        public Criteria andCreditLevelIdBetween(String value1, String value2) {
            addCriterion("temp_basis_client.credit_level_id between", value1, value2, "creditLevelId");
            return (Criteria) this;
        }

        public Criteria andCreditLevelIdNotBetween(String value1, String value2) {
            addCriterion("temp_basis_client.credit_level_id not between", value1, value2, "creditLevelId");
            return (Criteria) this;
        }

        public Criteria andClientIntegralIsNull() {
            addCriterion("temp_basis_client.client_integral is null");
            return (Criteria) this;
        }

        public Criteria andClientIntegralIsNotNull() {
            addCriterion("temp_basis_client.client_integral is not null");
            return (Criteria) this;
        }

        public Criteria andClientIntegralEqualTo(String value) {
            addCriterion("temp_basis_client.client_integral =", value, "clientIntegral");
            return (Criteria) this;
        }

        public Criteria andClientIntegralNotEqualTo(String value) {
            addCriterion("temp_basis_client.client_integral <>", value, "clientIntegral");
            return (Criteria) this;
        }

        public Criteria andClientIntegralGreaterThan(String value) {
            addCriterion("temp_basis_client.client_integral >", value, "clientIntegral");
            return (Criteria) this;
        }

        public Criteria andClientIntegralGreaterThanOrEqualTo(String value) {
            addCriterion("temp_basis_client.client_integral >=", value, "clientIntegral");
            return (Criteria) this;
        }

        public Criteria andClientIntegralLessThan(String value) {
            addCriterion("temp_basis_client.client_integral <", value, "clientIntegral");
            return (Criteria) this;
        }

        public Criteria andClientIntegralLessThanOrEqualTo(String value) {
            addCriterion("temp_basis_client.client_integral <=", value, "clientIntegral");
            return (Criteria) this;
        }

        public Criteria andClientIntegralLike(String value) {
            addCriterion("temp_basis_client.client_integral like", value, "clientIntegral");
            return (Criteria) this;
        }

        public Criteria andClientIntegralNotLike(String value) {
            addCriterion("temp_basis_client.client_integral not like", value, "clientIntegral");
            return (Criteria) this;
        }

        public Criteria andClientIntegralIn(List<String> values) {
            addCriterion("temp_basis_client.client_integral in", values, "clientIntegral");
            return (Criteria) this;
        }

        public Criteria andClientIntegralNotIn(List<String> values) {
            addCriterion("temp_basis_client.client_integral not in", values, "clientIntegral");
            return (Criteria) this;
        }

        public Criteria andClientIntegralBetween(String value1, String value2) {
            addCriterion("temp_basis_client.client_integral between", value1, value2, "clientIntegral");
            return (Criteria) this;
        }

        public Criteria andClientIntegralNotBetween(String value1, String value2) {
            addCriterion("temp_basis_client.client_integral not between", value1, value2, "clientIntegral");
            return (Criteria) this;
        }

        public Criteria andBankIsNull() {
            addCriterion("temp_basis_client.bank is null");
            return (Criteria) this;
        }

        public Criteria andBankIsNotNull() {
            addCriterion("temp_basis_client.bank is not null");
            return (Criteria) this;
        }

        public Criteria andBankEqualTo(String value) {
            addCriterion("temp_basis_client.bank =", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotEqualTo(String value) {
            addCriterion("temp_basis_client.bank <>", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankGreaterThan(String value) {
            addCriterion("temp_basis_client.bank >", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankGreaterThanOrEqualTo(String value) {
            addCriterion("temp_basis_client.bank >=", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankLessThan(String value) {
            addCriterion("temp_basis_client.bank <", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankLessThanOrEqualTo(String value) {
            addCriterion("temp_basis_client.bank <=", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankLike(String value) {
            addCriterion("temp_basis_client.bank like", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotLike(String value) {
            addCriterion("temp_basis_client.bank not like", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankIn(List<String> values) {
            addCriterion("temp_basis_client.bank in", values, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotIn(List<String> values) {
            addCriterion("temp_basis_client.bank not in", values, "bank");
            return (Criteria) this;
        }

        public Criteria andBankBetween(String value1, String value2) {
            addCriterion("temp_basis_client.bank between", value1, value2, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotBetween(String value1, String value2) {
            addCriterion("temp_basis_client.bank not between", value1, value2, "bank");
            return (Criteria) this;
        }

        public Criteria andBankAccountIsNull() {
            addCriterion("temp_basis_client.bank_account is null");
            return (Criteria) this;
        }

        public Criteria andBankAccountIsNotNull() {
            addCriterion("temp_basis_client.bank_account is not null");
            return (Criteria) this;
        }

        public Criteria andBankAccountEqualTo(String value) {
            addCriterion("temp_basis_client.bank_account =", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountNotEqualTo(String value) {
            addCriterion("temp_basis_client.bank_account <>", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountGreaterThan(String value) {
            addCriterion("temp_basis_client.bank_account >", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountGreaterThanOrEqualTo(String value) {
            addCriterion("temp_basis_client.bank_account >=", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountLessThan(String value) {
            addCriterion("temp_basis_client.bank_account <", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountLessThanOrEqualTo(String value) {
            addCriterion("temp_basis_client.bank_account <=", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountLike(String value) {
            addCriterion("temp_basis_client.bank_account like", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountNotLike(String value) {
            addCriterion("temp_basis_client.bank_account not like", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountIn(List<String> values) {
            addCriterion("temp_basis_client.bank_account in", values, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountNotIn(List<String> values) {
            addCriterion("temp_basis_client.bank_account not in", values, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountBetween(String value1, String value2) {
            addCriterion("temp_basis_client.bank_account between", value1, value2, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountNotBetween(String value1, String value2) {
            addCriterion("temp_basis_client.bank_account not between", value1, value2, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andTariffIsNull() {
            addCriterion("temp_basis_client.tariff is null");
            return (Criteria) this;
        }

        public Criteria andTariffIsNotNull() {
            addCriterion("temp_basis_client.tariff is not null");
            return (Criteria) this;
        }

        public Criteria andTariffEqualTo(String value) {
            addCriterion("temp_basis_client.tariff =", value, "tariff");
            return (Criteria) this;
        }

        public Criteria andTariffNotEqualTo(String value) {
            addCriterion("temp_basis_client.tariff <>", value, "tariff");
            return (Criteria) this;
        }

        public Criteria andTariffGreaterThan(String value) {
            addCriterion("temp_basis_client.tariff >", value, "tariff");
            return (Criteria) this;
        }

        public Criteria andTariffGreaterThanOrEqualTo(String value) {
            addCriterion("temp_basis_client.tariff >=", value, "tariff");
            return (Criteria) this;
        }

        public Criteria andTariffLessThan(String value) {
            addCriterion("temp_basis_client.tariff <", value, "tariff");
            return (Criteria) this;
        }

        public Criteria andTariffLessThanOrEqualTo(String value) {
            addCriterion("temp_basis_client.tariff <=", value, "tariff");
            return (Criteria) this;
        }

        public Criteria andTariffLike(String value) {
            addCriterion("temp_basis_client.tariff like", value, "tariff");
            return (Criteria) this;
        }

        public Criteria andTariffNotLike(String value) {
            addCriterion("temp_basis_client.tariff not like", value, "tariff");
            return (Criteria) this;
        }

        public Criteria andTariffIn(List<String> values) {
            addCriterion("temp_basis_client.tariff in", values, "tariff");
            return (Criteria) this;
        }

        public Criteria andTariffNotIn(List<String> values) {
            addCriterion("temp_basis_client.tariff not in", values, "tariff");
            return (Criteria) this;
        }

        public Criteria andTariffBetween(String value1, String value2) {
            addCriterion("temp_basis_client.tariff between", value1, value2, "tariff");
            return (Criteria) this;
        }

        public Criteria andTariffNotBetween(String value1, String value2) {
            addCriterion("temp_basis_client.tariff not between", value1, value2, "tariff");
            return (Criteria) this;
        }

        public Criteria andControlCreditIsNull() {
            addCriterion("temp_basis_client.control_credit is null");
            return (Criteria) this;
        }

        public Criteria andControlCreditIsNotNull() {
            addCriterion("temp_basis_client.control_credit is not null");
            return (Criteria) this;
        }

        public Criteria andControlCreditEqualTo(String value) {
            addCriterion("temp_basis_client.control_credit =", value, "controlCredit");
            return (Criteria) this;
        }

        public Criteria andControlCreditNotEqualTo(String value) {
            addCriterion("temp_basis_client.control_credit <>", value, "controlCredit");
            return (Criteria) this;
        }

        public Criteria andControlCreditGreaterThan(String value) {
            addCriterion("temp_basis_client.control_credit >", value, "controlCredit");
            return (Criteria) this;
        }

        public Criteria andControlCreditGreaterThanOrEqualTo(String value) {
            addCriterion("temp_basis_client.control_credit >=", value, "controlCredit");
            return (Criteria) this;
        }

        public Criteria andControlCreditLessThan(String value) {
            addCriterion("temp_basis_client.control_credit <", value, "controlCredit");
            return (Criteria) this;
        }

        public Criteria andControlCreditLessThanOrEqualTo(String value) {
            addCriterion("temp_basis_client.control_credit <=", value, "controlCredit");
            return (Criteria) this;
        }

        public Criteria andControlCreditLike(String value) {
            addCriterion("temp_basis_client.control_credit like", value, "controlCredit");
            return (Criteria) this;
        }

        public Criteria andControlCreditNotLike(String value) {
            addCriterion("temp_basis_client.control_credit not like", value, "controlCredit");
            return (Criteria) this;
        }

        public Criteria andControlCreditIn(List<String> values) {
            addCriterion("temp_basis_client.control_credit in", values, "controlCredit");
            return (Criteria) this;
        }

        public Criteria andControlCreditNotIn(List<String> values) {
            addCriterion("temp_basis_client.control_credit not in", values, "controlCredit");
            return (Criteria) this;
        }

        public Criteria andControlCreditBetween(String value1, String value2) {
            addCriterion("temp_basis_client.control_credit between", value1, value2, "controlCredit");
            return (Criteria) this;
        }

        public Criteria andControlCreditNotBetween(String value1, String value2) {
            addCriterion("temp_basis_client.control_credit not between", value1, value2, "controlCredit");
            return (Criteria) this;
        }

        public Criteria andLimitCreditIsNull() {
            addCriterion("temp_basis_client.limit_credit is null");
            return (Criteria) this;
        }

        public Criteria andLimitCreditIsNotNull() {
            addCriterion("temp_basis_client.limit_credit is not null");
            return (Criteria) this;
        }

        public Criteria andLimitCreditEqualTo(BigDecimal value) {
            addCriterion("temp_basis_client.limit_credit =", value, "limitCredit");
            return (Criteria) this;
        }

        public Criteria andLimitCreditNotEqualTo(BigDecimal value) {
            addCriterion("temp_basis_client.limit_credit <>", value, "limitCredit");
            return (Criteria) this;
        }

        public Criteria andLimitCreditGreaterThan(BigDecimal value) {
            addCriterion("temp_basis_client.limit_credit >", value, "limitCredit");
            return (Criteria) this;
        }

        public Criteria andLimitCreditGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_basis_client.limit_credit >=", value, "limitCredit");
            return (Criteria) this;
        }

        public Criteria andLimitCreditLessThan(BigDecimal value) {
            addCriterion("temp_basis_client.limit_credit <", value, "limitCredit");
            return (Criteria) this;
        }

        public Criteria andLimitCreditLessThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_basis_client.limit_credit <=", value, "limitCredit");
            return (Criteria) this;
        }

        public Criteria andLimitCreditIn(List<BigDecimal> values) {
            addCriterion("temp_basis_client.limit_credit in", values, "limitCredit");
            return (Criteria) this;
        }

        public Criteria andLimitCreditNotIn(List<BigDecimal> values) {
            addCriterion("temp_basis_client.limit_credit not in", values, "limitCredit");
            return (Criteria) this;
        }

        public Criteria andLimitCreditBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_basis_client.limit_credit between", value1, value2, "limitCredit");
            return (Criteria) this;
        }

        public Criteria andLimitCreditNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_basis_client.limit_credit not between", value1, value2, "limitCredit");
            return (Criteria) this;
        }

        public Criteria andPresentCreditIsNull() {
            addCriterion("temp_basis_client.present_credit is null");
            return (Criteria) this;
        }

        public Criteria andPresentCreditIsNotNull() {
            addCriterion("temp_basis_client.present_credit is not null");
            return (Criteria) this;
        }

        public Criteria andPresentCreditEqualTo(BigDecimal value) {
            addCriterion("temp_basis_client.present_credit =", value, "presentCredit");
            return (Criteria) this;
        }

        public Criteria andPresentCreditNotEqualTo(BigDecimal value) {
            addCriterion("temp_basis_client.present_credit <>", value, "presentCredit");
            return (Criteria) this;
        }

        public Criteria andPresentCreditGreaterThan(BigDecimal value) {
            addCriterion("temp_basis_client.present_credit >", value, "presentCredit");
            return (Criteria) this;
        }

        public Criteria andPresentCreditGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_basis_client.present_credit >=", value, "presentCredit");
            return (Criteria) this;
        }

        public Criteria andPresentCreditLessThan(BigDecimal value) {
            addCriterion("temp_basis_client.present_credit <", value, "presentCredit");
            return (Criteria) this;
        }

        public Criteria andPresentCreditLessThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_basis_client.present_credit <=", value, "presentCredit");
            return (Criteria) this;
        }

        public Criteria andPresentCreditIn(List<BigDecimal> values) {
            addCriterion("temp_basis_client.present_credit in", values, "presentCredit");
            return (Criteria) this;
        }

        public Criteria andPresentCreditNotIn(List<BigDecimal> values) {
            addCriterion("temp_basis_client.present_credit not in", values, "presentCredit");
            return (Criteria) this;
        }

        public Criteria andPresentCreditBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_basis_client.present_credit between", value1, value2, "presentCredit");
            return (Criteria) this;
        }

        public Criteria andPresentCreditNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_basis_client.present_credit not between", value1, value2, "presentCredit");
            return (Criteria) this;
        }

        public Criteria andPresentDebtIsNull() {
            addCriterion("temp_basis_client.present_debt is null");
            return (Criteria) this;
        }

        public Criteria andPresentDebtIsNotNull() {
            addCriterion("temp_basis_client.present_debt is not null");
            return (Criteria) this;
        }

        public Criteria andPresentDebtEqualTo(BigDecimal value) {
            addCriterion("temp_basis_client.present_debt =", value, "presentDebt");
            return (Criteria) this;
        }

        public Criteria andPresentDebtNotEqualTo(BigDecimal value) {
            addCriterion("temp_basis_client.present_debt <>", value, "presentDebt");
            return (Criteria) this;
        }

        public Criteria andPresentDebtGreaterThan(BigDecimal value) {
            addCriterion("temp_basis_client.present_debt >", value, "presentDebt");
            return (Criteria) this;
        }

        public Criteria andPresentDebtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_basis_client.present_debt >=", value, "presentDebt");
            return (Criteria) this;
        }

        public Criteria andPresentDebtLessThan(BigDecimal value) {
            addCriterion("temp_basis_client.present_debt <", value, "presentDebt");
            return (Criteria) this;
        }

        public Criteria andPresentDebtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_basis_client.present_debt <=", value, "presentDebt");
            return (Criteria) this;
        }

        public Criteria andPresentDebtIn(List<BigDecimal> values) {
            addCriterion("temp_basis_client.present_debt in", values, "presentDebt");
            return (Criteria) this;
        }

        public Criteria andPresentDebtNotIn(List<BigDecimal> values) {
            addCriterion("temp_basis_client.present_debt not in", values, "presentDebt");
            return (Criteria) this;
        }

        public Criteria andPresentDebtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_basis_client.present_debt between", value1, value2, "presentDebt");
            return (Criteria) this;
        }

        public Criteria andPresentDebtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_basis_client.present_debt not between", value1, value2, "presentDebt");
            return (Criteria) this;
        }

        public Criteria andAdvancesReceivedIsNull() {
            addCriterion("temp_basis_client.advances_received is null");
            return (Criteria) this;
        }

        public Criteria andAdvancesReceivedIsNotNull() {
            addCriterion("temp_basis_client.advances_received is not null");
            return (Criteria) this;
        }

        public Criteria andAdvancesReceivedEqualTo(BigDecimal value) {
            addCriterion("temp_basis_client.advances_received =", value, "advancesReceived");
            return (Criteria) this;
        }

        public Criteria andAdvancesReceivedNotEqualTo(BigDecimal value) {
            addCriterion("temp_basis_client.advances_received <>", value, "advancesReceived");
            return (Criteria) this;
        }

        public Criteria andAdvancesReceivedGreaterThan(BigDecimal value) {
            addCriterion("temp_basis_client.advances_received >", value, "advancesReceived");
            return (Criteria) this;
        }

        public Criteria andAdvancesReceivedGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_basis_client.advances_received >=", value, "advancesReceived");
            return (Criteria) this;
        }

        public Criteria andAdvancesReceivedLessThan(BigDecimal value) {
            addCriterion("temp_basis_client.advances_received <", value, "advancesReceived");
            return (Criteria) this;
        }

        public Criteria andAdvancesReceivedLessThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_basis_client.advances_received <=", value, "advancesReceived");
            return (Criteria) this;
        }

        public Criteria andAdvancesReceivedIn(List<BigDecimal> values) {
            addCriterion("temp_basis_client.advances_received in", values, "advancesReceived");
            return (Criteria) this;
        }

        public Criteria andAdvancesReceivedNotIn(List<BigDecimal> values) {
            addCriterion("temp_basis_client.advances_received not in", values, "advancesReceived");
            return (Criteria) this;
        }

        public Criteria andAdvancesReceivedBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_basis_client.advances_received between", value1, value2, "advancesReceived");
            return (Criteria) this;
        }

        public Criteria andAdvancesReceivedNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_basis_client.advances_received not between", value1, value2, "advancesReceived");
            return (Criteria) this;
        }

        public Criteria andSetupPersonIsNull() {
            addCriterion("temp_basis_client.setup_person is null");
            return (Criteria) this;
        }

        public Criteria andSetupPersonIsNotNull() {
            addCriterion("temp_basis_client.setup_person is not null");
            return (Criteria) this;
        }

        public Criteria andSetupPersonEqualTo(String value) {
            addCriterion("temp_basis_client.setup_person =", value, "setupPerson");
            return (Criteria) this;
        }

        public Criteria andSetupPersonNotEqualTo(String value) {
            addCriterion("temp_basis_client.setup_person <>", value, "setupPerson");
            return (Criteria) this;
        }

        public Criteria andSetupPersonGreaterThan(String value) {
            addCriterion("temp_basis_client.setup_person >", value, "setupPerson");
            return (Criteria) this;
        }

        public Criteria andSetupPersonGreaterThanOrEqualTo(String value) {
            addCriterion("temp_basis_client.setup_person >=", value, "setupPerson");
            return (Criteria) this;
        }

        public Criteria andSetupPersonLessThan(String value) {
            addCriterion("temp_basis_client.setup_person <", value, "setupPerson");
            return (Criteria) this;
        }

        public Criteria andSetupPersonLessThanOrEqualTo(String value) {
            addCriterion("temp_basis_client.setup_person <=", value, "setupPerson");
            return (Criteria) this;
        }

        public Criteria andSetupPersonLike(String value) {
            addCriterion("temp_basis_client.setup_person like", value, "setupPerson");
            return (Criteria) this;
        }

        public Criteria andSetupPersonNotLike(String value) {
            addCriterion("temp_basis_client.setup_person not like", value, "setupPerson");
            return (Criteria) this;
        }

        public Criteria andSetupPersonIn(List<String> values) {
            addCriterion("temp_basis_client.setup_person in", values, "setupPerson");
            return (Criteria) this;
        }

        public Criteria andSetupPersonNotIn(List<String> values) {
            addCriterion("temp_basis_client.setup_person not in", values, "setupPerson");
            return (Criteria) this;
        }

        public Criteria andSetupPersonBetween(String value1, String value2) {
            addCriterion("temp_basis_client.setup_person between", value1, value2, "setupPerson");
            return (Criteria) this;
        }

        public Criteria andSetupPersonNotBetween(String value1, String value2) {
            addCriterion("temp_basis_client.setup_person not between", value1, value2, "setupPerson");
            return (Criteria) this;
        }

        public Criteria andSetupTimeIsNull() {
            addCriterion("temp_basis_client.setup_time is null");
            return (Criteria) this;
        }

        public Criteria andSetupTimeIsNotNull() {
            addCriterion("temp_basis_client.setup_time is not null");
            return (Criteria) this;
        }

        public Criteria andSetupTimeEqualTo(Date value) {
            addCriterion("temp_basis_client.setup_time =", value, "setupTime");
            return (Criteria) this;
        }

        public Criteria andSetupTimeNotEqualTo(Date value) {
            addCriterion("temp_basis_client.setup_time <>", value, "setupTime");
            return (Criteria) this;
        }

        public Criteria andSetupTimeGreaterThan(Date value) {
            addCriterion("temp_basis_client.setup_time >", value, "setupTime");
            return (Criteria) this;
        }

        public Criteria andSetupTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_basis_client.setup_time >=", value, "setupTime");
            return (Criteria) this;
        }

        public Criteria andSetupTimeLessThan(Date value) {
            addCriterion("temp_basis_client.setup_time <", value, "setupTime");
            return (Criteria) this;
        }

        public Criteria andSetupTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_basis_client.setup_time <=", value, "setupTime");
            return (Criteria) this;
        }

        public Criteria andSetupTimeIn(List<Date> values) {
            addCriterion("temp_basis_client.setup_time in", values, "setupTime");
            return (Criteria) this;
        }

        public Criteria andSetupTimeNotIn(List<Date> values) {
            addCriterion("temp_basis_client.setup_time not in", values, "setupTime");
            return (Criteria) this;
        }

        public Criteria andSetupTimeBetween(Date value1, Date value2) {
            addCriterion("temp_basis_client.setup_time between", value1, value2, "setupTime");
            return (Criteria) this;
        }

        public Criteria andSetupTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_basis_client.setup_time not between", value1, value2, "setupTime");
            return (Criteria) this;
        }

        public Criteria andClientCreateIsNull() {
            addCriterion("temp_basis_client.client_create is null");
            return (Criteria) this;
        }

        public Criteria andClientCreateIsNotNull() {
            addCriterion("temp_basis_client.client_create is not null");
            return (Criteria) this;
        }

        public Criteria andClientCreateEqualTo(Date value) {
            addCriterion("temp_basis_client.client_create =", value, "clientCreate");
            return (Criteria) this;
        }

        public Criteria andClientCreateNotEqualTo(Date value) {
            addCriterion("temp_basis_client.client_create <>", value, "clientCreate");
            return (Criteria) this;
        }

        public Criteria andClientCreateGreaterThan(Date value) {
            addCriterion("temp_basis_client.client_create >", value, "clientCreate");
            return (Criteria) this;
        }

        public Criteria andClientCreateGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_basis_client.client_create >=", value, "clientCreate");
            return (Criteria) this;
        }

        public Criteria andClientCreateLessThan(Date value) {
            addCriterion("temp_basis_client.client_create <", value, "clientCreate");
            return (Criteria) this;
        }

        public Criteria andClientCreateLessThanOrEqualTo(Date value) {
            addCriterion("temp_basis_client.client_create <=", value, "clientCreate");
            return (Criteria) this;
        }

        public Criteria andClientCreateIn(List<Date> values) {
            addCriterion("temp_basis_client.client_create in", values, "clientCreate");
            return (Criteria) this;
        }

        public Criteria andClientCreateNotIn(List<Date> values) {
            addCriterion("temp_basis_client.client_create not in", values, "clientCreate");
            return (Criteria) this;
        }

        public Criteria andClientCreateBetween(Date value1, Date value2) {
            addCriterion("temp_basis_client.client_create between", value1, value2, "clientCreate");
            return (Criteria) this;
        }

        public Criteria andClientCreateNotBetween(Date value1, Date value2) {
            addCriterion("temp_basis_client.client_create not between", value1, value2, "clientCreate");
            return (Criteria) this;
        }

        public Criteria andSuperiorClientIdIsNull() {
            addCriterion("temp_basis_client.superior_client_id is null");
            return (Criteria) this;
        }

        public Criteria andSuperiorClientIdIsNotNull() {
            addCriterion("temp_basis_client.superior_client_id is not null");
            return (Criteria) this;
        }

        public Criteria andSuperiorClientIdEqualTo(String value) {
            addCriterion("temp_basis_client.superior_client_id =", value, "superiorClientId");
            return (Criteria) this;
        }

        public Criteria andSuperiorClientIdNotEqualTo(String value) {
            addCriterion("temp_basis_client.superior_client_id <>", value, "superiorClientId");
            return (Criteria) this;
        }

        public Criteria andSuperiorClientIdGreaterThan(String value) {
            addCriterion("temp_basis_client.superior_client_id >", value, "superiorClientId");
            return (Criteria) this;
        }

        public Criteria andSuperiorClientIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_basis_client.superior_client_id >=", value, "superiorClientId");
            return (Criteria) this;
        }

        public Criteria andSuperiorClientIdLessThan(String value) {
            addCriterion("temp_basis_client.superior_client_id <", value, "superiorClientId");
            return (Criteria) this;
        }

        public Criteria andSuperiorClientIdLessThanOrEqualTo(String value) {
            addCriterion("temp_basis_client.superior_client_id <=", value, "superiorClientId");
            return (Criteria) this;
        }

        public Criteria andSuperiorClientIdLike(String value) {
            addCriterion("temp_basis_client.superior_client_id like", value, "superiorClientId");
            return (Criteria) this;
        }

        public Criteria andSuperiorClientIdNotLike(String value) {
            addCriterion("temp_basis_client.superior_client_id not like", value, "superiorClientId");
            return (Criteria) this;
        }

        public Criteria andSuperiorClientIdIn(List<String> values) {
            addCriterion("temp_basis_client.superior_client_id in", values, "superiorClientId");
            return (Criteria) this;
        }

        public Criteria andSuperiorClientIdNotIn(List<String> values) {
            addCriterion("temp_basis_client.superior_client_id not in", values, "superiorClientId");
            return (Criteria) this;
        }

        public Criteria andSuperiorClientIdBetween(String value1, String value2) {
            addCriterion("temp_basis_client.superior_client_id between", value1, value2, "superiorClientId");
            return (Criteria) this;
        }

        public Criteria andSuperiorClientIdNotBetween(String value1, String value2) {
            addCriterion("temp_basis_client.superior_client_id not between", value1, value2, "superiorClientId");
            return (Criteria) this;
        }

        public Criteria andAccessoryIsNull() {
            addCriterion("temp_basis_client.accessory is null");
            return (Criteria) this;
        }

        public Criteria andAccessoryIsNotNull() {
            addCriterion("temp_basis_client.accessory is not null");
            return (Criteria) this;
        }

        public Criteria andAccessoryEqualTo(String value) {
            addCriterion("temp_basis_client.accessory =", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryNotEqualTo(String value) {
            addCriterion("temp_basis_client.accessory <>", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryGreaterThan(String value) {
            addCriterion("temp_basis_client.accessory >", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryGreaterThanOrEqualTo(String value) {
            addCriterion("temp_basis_client.accessory >=", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryLessThan(String value) {
            addCriterion("temp_basis_client.accessory <", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryLessThanOrEqualTo(String value) {
            addCriterion("temp_basis_client.accessory <=", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryLike(String value) {
            addCriterion("temp_basis_client.accessory like", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryNotLike(String value) {
            addCriterion("temp_basis_client.accessory not like", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryIn(List<String> values) {
            addCriterion("temp_basis_client.accessory in", values, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryNotIn(List<String> values) {
            addCriterion("temp_basis_client.accessory not in", values, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryBetween(String value1, String value2) {
            addCriterion("temp_basis_client.accessory between", value1, value2, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryNotBetween(String value1, String value2) {
            addCriterion("temp_basis_client.accessory not between", value1, value2, "accessory");
            return (Criteria) this;
        }

        public Criteria andStaffIdIsNull() {
            addCriterion("temp_basis_client.staff_id is null");
            return (Criteria) this;
        }

        public Criteria andStaffIdIsNotNull() {
            addCriterion("temp_basis_client.staff_id is not null");
            return (Criteria) this;
        }

        public Criteria andStaffIdEqualTo(String value) {
            addCriterion("temp_basis_client.staff_id =", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotEqualTo(String value) {
            addCriterion("temp_basis_client.staff_id <>", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdGreaterThan(String value) {
            addCriterion("temp_basis_client.staff_id >", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_basis_client.staff_id >=", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdLessThan(String value) {
            addCriterion("temp_basis_client.staff_id <", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdLessThanOrEqualTo(String value) {
            addCriterion("temp_basis_client.staff_id <=", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdLike(String value) {
            addCriterion("temp_basis_client.staff_id like", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotLike(String value) {
            addCriterion("temp_basis_client.staff_id not like", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdIn(List<String> values) {
            addCriterion("temp_basis_client.staff_id in", values, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotIn(List<String> values) {
            addCriterion("temp_basis_client.staff_id not in", values, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdBetween(String value1, String value2) {
            addCriterion("temp_basis_client.staff_id between", value1, value2, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotBetween(String value1, String value2) {
            addCriterion("temp_basis_client.staff_id not between", value1, value2, "staffId");
            return (Criteria) this;
        }

        public Criteria andEnabledIsNull() {
            addCriterion("temp_basis_client.enabled is null");
            return (Criteria) this;
        }

        public Criteria andEnabledIsNotNull() {
            addCriterion("temp_basis_client.enabled is not null");
            return (Criteria) this;
        }

        public Criteria andEnabledEqualTo(String value) {
            addCriterion("temp_basis_client.enabled =", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotEqualTo(String value) {
            addCriterion("temp_basis_client.enabled <>", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledGreaterThan(String value) {
            addCriterion("temp_basis_client.enabled >", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledGreaterThanOrEqualTo(String value) {
            addCriterion("temp_basis_client.enabled >=", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledLessThan(String value) {
            addCriterion("temp_basis_client.enabled <", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledLessThanOrEqualTo(String value) {
            addCriterion("temp_basis_client.enabled <=", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledLike(String value) {
            addCriterion("temp_basis_client.enabled like", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotLike(String value) {
            addCriterion("temp_basis_client.enabled not like", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledIn(List<String> values) {
            addCriterion("temp_basis_client.enabled in", values, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotIn(List<String> values) {
            addCriterion("temp_basis_client.enabled not in", values, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledBetween(String value1, String value2) {
            addCriterion("temp_basis_client.enabled between", value1, value2, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotBetween(String value1, String value2) {
            addCriterion("temp_basis_client.enabled not between", value1, value2, "enabled");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("temp_basis_client.remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("temp_basis_client.remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("temp_basis_client.remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("temp_basis_client.remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("temp_basis_client.remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("temp_basis_client.remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("temp_basis_client.remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("temp_basis_client.remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("temp_basis_client.remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("temp_basis_client.remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("temp_basis_client.remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("temp_basis_client.remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("temp_basis_client.remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("temp_basis_client.remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andAuditStateIsNull() {
            addCriterion("temp_basis_client.audit_state is null");
            return (Criteria) this;
        }

        public Criteria andAuditStateIsNotNull() {
            addCriterion("temp_basis_client.audit_state is not null");
            return (Criteria) this;
        }

        public Criteria andAuditStateEqualTo(String value) {
            addCriterion("temp_basis_client.audit_state =", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateNotEqualTo(String value) {
            addCriterion("temp_basis_client.audit_state <>", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateGreaterThan(String value) {
            addCriterion("temp_basis_client.audit_state >", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateGreaterThanOrEqualTo(String value) {
            addCriterion("temp_basis_client.audit_state >=", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateLessThan(String value) {
            addCriterion("temp_basis_client.audit_state <", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateLessThanOrEqualTo(String value) {
            addCriterion("temp_basis_client.audit_state <=", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateLike(String value) {
            addCriterion("temp_basis_client.audit_state like", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateNotLike(String value) {
            addCriterion("temp_basis_client.audit_state not like", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateIn(List<String> values) {
            addCriterion("temp_basis_client.audit_state in", values, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateNotIn(List<String> values) {
            addCriterion("temp_basis_client.audit_state not in", values, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateBetween(String value1, String value2) {
            addCriterion("temp_basis_client.audit_state between", value1, value2, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateNotBetween(String value1, String value2) {
            addCriterion("temp_basis_client.audit_state not between", value1, value2, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditorIsNull() {
            addCriterion("temp_basis_client.auditor is null");
            return (Criteria) this;
        }

        public Criteria andAuditorIsNotNull() {
            addCriterion("temp_basis_client.auditor is not null");
            return (Criteria) this;
        }

        public Criteria andAuditorEqualTo(String value) {
            addCriterion("temp_basis_client.auditor =", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotEqualTo(String value) {
            addCriterion("temp_basis_client.auditor <>", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorGreaterThan(String value) {
            addCriterion("temp_basis_client.auditor >", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorGreaterThanOrEqualTo(String value) {
            addCriterion("temp_basis_client.auditor >=", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorLessThan(String value) {
            addCriterion("temp_basis_client.auditor <", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorLessThanOrEqualTo(String value) {
            addCriterion("temp_basis_client.auditor <=", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorLike(String value) {
            addCriterion("temp_basis_client.auditor like", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotLike(String value) {
            addCriterion("temp_basis_client.auditor not like", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorIn(List<String> values) {
            addCriterion("temp_basis_client.auditor in", values, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotIn(List<String> values) {
            addCriterion("temp_basis_client.auditor not in", values, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorBetween(String value1, String value2) {
            addCriterion("temp_basis_client.auditor between", value1, value2, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotBetween(String value1, String value2) {
            addCriterion("temp_basis_client.auditor not between", value1, value2, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditDateIsNull() {
            addCriterion("temp_basis_client.audit_date is null");
            return (Criteria) this;
        }

        public Criteria andAuditDateIsNotNull() {
            addCriterion("temp_basis_client.audit_date is not null");
            return (Criteria) this;
        }

        public Criteria andAuditDateEqualTo(Date value) {
            addCriterion("temp_basis_client.audit_date =", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateNotEqualTo(Date value) {
            addCriterion("temp_basis_client.audit_date <>", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateGreaterThan(Date value) {
            addCriterion("temp_basis_client.audit_date >", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_basis_client.audit_date >=", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateLessThan(Date value) {
            addCriterion("temp_basis_client.audit_date <", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateLessThanOrEqualTo(Date value) {
            addCriterion("temp_basis_client.audit_date <=", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateIn(List<Date> values) {
            addCriterion("temp_basis_client.audit_date in", values, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateNotIn(List<Date> values) {
            addCriterion("temp_basis_client.audit_date not in", values, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateBetween(Date value1, Date value2) {
            addCriterion("temp_basis_client.audit_date between", value1, value2, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateNotBetween(Date value1, Date value2) {
            addCriterion("temp_basis_client.audit_date not between", value1, value2, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkIsNull() {
            addCriterion("temp_basis_client.audit_remark is null");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkIsNotNull() {
            addCriterion("temp_basis_client.audit_remark is not null");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkEqualTo(String value) {
            addCriterion("temp_basis_client.audit_remark =", value, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkNotEqualTo(String value) {
            addCriterion("temp_basis_client.audit_remark <>", value, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkGreaterThan(String value) {
            addCriterion("temp_basis_client.audit_remark >", value, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("temp_basis_client.audit_remark >=", value, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkLessThan(String value) {
            addCriterion("temp_basis_client.audit_remark <", value, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkLessThanOrEqualTo(String value) {
            addCriterion("temp_basis_client.audit_remark <=", value, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkLike(String value) {
            addCriterion("temp_basis_client.audit_remark like", value, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkNotLike(String value) {
            addCriterion("temp_basis_client.audit_remark not like", value, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkIn(List<String> values) {
            addCriterion("temp_basis_client.audit_remark in", values, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkNotIn(List<String> values) {
            addCriterion("temp_basis_client.audit_remark not in", values, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkBetween(String value1, String value2) {
            addCriterion("temp_basis_client.audit_remark between", value1, value2, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkNotBetween(String value1, String value2) {
            addCriterion("temp_basis_client.audit_remark not between", value1, value2, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNull() {
            addCriterion("temp_basis_client.creater is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNotNull() {
            addCriterion("temp_basis_client.creater is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterEqualTo(String value) {
            addCriterion("temp_basis_client.creater =", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotEqualTo(String value) {
            addCriterion("temp_basis_client.creater <>", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThan(String value) {
            addCriterion("temp_basis_client.creater >", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_basis_client.creater >=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThan(String value) {
            addCriterion("temp_basis_client.creater <", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThanOrEqualTo(String value) {
            addCriterion("temp_basis_client.creater <=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLike(String value) {
            addCriterion("temp_basis_client.creater like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotLike(String value) {
            addCriterion("temp_basis_client.creater not like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterIn(List<String> values) {
            addCriterion("temp_basis_client.creater in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotIn(List<String> values) {
            addCriterion("temp_basis_client.creater not in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterBetween(String value1, String value2) {
            addCriterion("temp_basis_client.creater between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotBetween(String value1, String value2) {
            addCriterion("temp_basis_client.creater not between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("temp_basis_client.create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("temp_basis_client.create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("temp_basis_client.create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("temp_basis_client.create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("temp_basis_client.create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_basis_client.create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("temp_basis_client.create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_basis_client.create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("temp_basis_client.create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("temp_basis_client.create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_basis_client.create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_basis_client.create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNull() {
            addCriterion("temp_basis_client.updater is null");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNotNull() {
            addCriterion("temp_basis_client.updater is not null");
            return (Criteria) this;
        }

        public Criteria andUpdaterEqualTo(String value) {
            addCriterion("temp_basis_client.updater =", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotEqualTo(String value) {
            addCriterion("temp_basis_client.updater <>", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThan(String value) {
            addCriterion("temp_basis_client.updater >", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_basis_client.updater >=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThan(String value) {
            addCriterion("temp_basis_client.updater <", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThanOrEqualTo(String value) {
            addCriterion("temp_basis_client.updater <=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLike(String value) {
            addCriterion("temp_basis_client.updater like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotLike(String value) {
            addCriterion("temp_basis_client.updater not like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterIn(List<String> values) {
            addCriterion("temp_basis_client.updater in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotIn(List<String> values) {
            addCriterion("temp_basis_client.updater not in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterBetween(String value1, String value2) {
            addCriterion("temp_basis_client.updater between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotBetween(String value1, String value2) {
            addCriterion("temp_basis_client.updater not between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("temp_basis_client.update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("temp_basis_client.update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("temp_basis_client.update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("temp_basis_client.update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("temp_basis_client.update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_basis_client.update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("temp_basis_client.update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_basis_client.update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("temp_basis_client.update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("temp_basis_client.update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_basis_client.update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_basis_client.update_time not between", value1, value2, "updateTime");
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
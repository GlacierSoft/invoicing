package com.glacier.frame.entity.basicdatas;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ParameterSystemVariablesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public ParameterSystemVariablesExample() {
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

        public Criteria andVariablesIdIsNull() {
            addCriterion("temp_parameter_system_variables.variables_id is null");
            return (Criteria) this;
        }

        public Criteria andVariablesIdIsNotNull() {
            addCriterion("temp_parameter_system_variables.variables_id is not null");
            return (Criteria) this;
        }

        public Criteria andVariablesIdEqualTo(String value) {
            addCriterion("temp_parameter_system_variables.variables_id =", value, "variablesId");
            return (Criteria) this;
        }

        public Criteria andVariablesIdNotEqualTo(String value) {
            addCriterion("temp_parameter_system_variables.variables_id <>", value, "variablesId");
            return (Criteria) this;
        }

        public Criteria andVariablesIdGreaterThan(String value) {
            addCriterion("temp_parameter_system_variables.variables_id >", value, "variablesId");
            return (Criteria) this;
        }

        public Criteria andVariablesIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_parameter_system_variables.variables_id >=", value, "variablesId");
            return (Criteria) this;
        }

        public Criteria andVariablesIdLessThan(String value) {
            addCriterion("temp_parameter_system_variables.variables_id <", value, "variablesId");
            return (Criteria) this;
        }

        public Criteria andVariablesIdLessThanOrEqualTo(String value) {
            addCriterion("temp_parameter_system_variables.variables_id <=", value, "variablesId");
            return (Criteria) this;
        }

        public Criteria andVariablesIdLike(String value) {
            addCriterion("temp_parameter_system_variables.variables_id like", value, "variablesId");
            return (Criteria) this;
        }

        public Criteria andVariablesIdNotLike(String value) {
            addCriterion("temp_parameter_system_variables.variables_id not like", value, "variablesId");
            return (Criteria) this;
        }

        public Criteria andVariablesIdIn(List<String> values) {
            addCriterion("temp_parameter_system_variables.variables_id in", values, "variablesId");
            return (Criteria) this;
        }

        public Criteria andVariablesIdNotIn(List<String> values) {
            addCriterion("temp_parameter_system_variables.variables_id not in", values, "variablesId");
            return (Criteria) this;
        }

        public Criteria andVariablesIdBetween(String value1, String value2) {
            addCriterion("temp_parameter_system_variables.variables_id between", value1, value2, "variablesId");
            return (Criteria) this;
        }

        public Criteria andVariablesIdNotBetween(String value1, String value2) {
            addCriterion("temp_parameter_system_variables.variables_id not between", value1, value2, "variablesId");
            return (Criteria) this;
        }

        public Criteria andSpecificationIsNull() {
            addCriterion("temp_parameter_system_variables.specification is null");
            return (Criteria) this;
        }

        public Criteria andSpecificationIsNotNull() {
            addCriterion("temp_parameter_system_variables.specification is not null");
            return (Criteria) this;
        }

        public Criteria andSpecificationEqualTo(String value) {
            addCriterion("temp_parameter_system_variables.specification =", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationNotEqualTo(String value) {
            addCriterion("temp_parameter_system_variables.specification <>", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationGreaterThan(String value) {
            addCriterion("temp_parameter_system_variables.specification >", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationGreaterThanOrEqualTo(String value) {
            addCriterion("temp_parameter_system_variables.specification >=", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationLessThan(String value) {
            addCriterion("temp_parameter_system_variables.specification <", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationLessThanOrEqualTo(String value) {
            addCriterion("temp_parameter_system_variables.specification <=", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationLike(String value) {
            addCriterion("temp_parameter_system_variables.specification like", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationNotLike(String value) {
            addCriterion("temp_parameter_system_variables.specification not like", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationIn(List<String> values) {
            addCriterion("temp_parameter_system_variables.specification in", values, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationNotIn(List<String> values) {
            addCriterion("temp_parameter_system_variables.specification not in", values, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationBetween(String value1, String value2) {
            addCriterion("temp_parameter_system_variables.specification between", value1, value2, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationNotBetween(String value1, String value2) {
            addCriterion("temp_parameter_system_variables.specification not between", value1, value2, "specification");
            return (Criteria) this;
        }

        public Criteria andInputTipIsNull() {
            addCriterion("temp_parameter_system_variables.input_tip is null");
            return (Criteria) this;
        }

        public Criteria andInputTipIsNotNull() {
            addCriterion("temp_parameter_system_variables.input_tip is not null");
            return (Criteria) this;
        }

        public Criteria andInputTipEqualTo(String value) {
            addCriterion("temp_parameter_system_variables.input_tip =", value, "inputTip");
            return (Criteria) this;
        }

        public Criteria andInputTipNotEqualTo(String value) {
            addCriterion("temp_parameter_system_variables.input_tip <>", value, "inputTip");
            return (Criteria) this;
        }

        public Criteria andInputTipGreaterThan(String value) {
            addCriterion("temp_parameter_system_variables.input_tip >", value, "inputTip");
            return (Criteria) this;
        }

        public Criteria andInputTipGreaterThanOrEqualTo(String value) {
            addCriterion("temp_parameter_system_variables.input_tip >=", value, "inputTip");
            return (Criteria) this;
        }

        public Criteria andInputTipLessThan(String value) {
            addCriterion("temp_parameter_system_variables.input_tip <", value, "inputTip");
            return (Criteria) this;
        }

        public Criteria andInputTipLessThanOrEqualTo(String value) {
            addCriterion("temp_parameter_system_variables.input_tip <=", value, "inputTip");
            return (Criteria) this;
        }

        public Criteria andInputTipLike(String value) {
            addCriterion("temp_parameter_system_variables.input_tip like", value, "inputTip");
            return (Criteria) this;
        }

        public Criteria andInputTipNotLike(String value) {
            addCriterion("temp_parameter_system_variables.input_tip not like", value, "inputTip");
            return (Criteria) this;
        }

        public Criteria andInputTipIn(List<String> values) {
            addCriterion("temp_parameter_system_variables.input_tip in", values, "inputTip");
            return (Criteria) this;
        }

        public Criteria andInputTipNotIn(List<String> values) {
            addCriterion("temp_parameter_system_variables.input_tip not in", values, "inputTip");
            return (Criteria) this;
        }

        public Criteria andInputTipBetween(String value1, String value2) {
            addCriterion("temp_parameter_system_variables.input_tip between", value1, value2, "inputTip");
            return (Criteria) this;
        }

        public Criteria andInputTipNotBetween(String value1, String value2) {
            addCriterion("temp_parameter_system_variables.input_tip not between", value1, value2, "inputTip");
            return (Criteria) this;
        }

        public Criteria andParameterValuesIsNull() {
            addCriterion("temp_parameter_system_variables.parameter_values is null");
            return (Criteria) this;
        }

        public Criteria andParameterValuesIsNotNull() {
            addCriterion("temp_parameter_system_variables.parameter_values is not null");
            return (Criteria) this;
        }

        public Criteria andParameterValuesEqualTo(String value) {
            addCriterion("temp_parameter_system_variables.parameter_values =", value, "parameterValues");
            return (Criteria) this;
        }

        public Criteria andParameterValuesNotEqualTo(String value) {
            addCriterion("temp_parameter_system_variables.parameter_values <>", value, "parameterValues");
            return (Criteria) this;
        }

        public Criteria andParameterValuesGreaterThan(String value) {
            addCriterion("temp_parameter_system_variables.parameter_values >", value, "parameterValues");
            return (Criteria) this;
        }

        public Criteria andParameterValuesGreaterThanOrEqualTo(String value) {
            addCriterion("temp_parameter_system_variables.parameter_values >=", value, "parameterValues");
            return (Criteria) this;
        }

        public Criteria andParameterValuesLessThan(String value) {
            addCriterion("temp_parameter_system_variables.parameter_values <", value, "parameterValues");
            return (Criteria) this;
        }

        public Criteria andParameterValuesLessThanOrEqualTo(String value) {
            addCriterion("temp_parameter_system_variables.parameter_values <=", value, "parameterValues");
            return (Criteria) this;
        }

        public Criteria andParameterValuesLike(String value) {
            addCriterion("temp_parameter_system_variables.parameter_values like", value, "parameterValues");
            return (Criteria) this;
        }

        public Criteria andParameterValuesNotLike(String value) {
            addCriterion("temp_parameter_system_variables.parameter_values not like", value, "parameterValues");
            return (Criteria) this;
        }

        public Criteria andParameterValuesIn(List<String> values) {
            addCriterion("temp_parameter_system_variables.parameter_values in", values, "parameterValues");
            return (Criteria) this;
        }

        public Criteria andParameterValuesNotIn(List<String> values) {
            addCriterion("temp_parameter_system_variables.parameter_values not in", values, "parameterValues");
            return (Criteria) this;
        }

        public Criteria andParameterValuesBetween(String value1, String value2) {
            addCriterion("temp_parameter_system_variables.parameter_values between", value1, value2, "parameterValues");
            return (Criteria) this;
        }

        public Criteria andParameterValuesNotBetween(String value1, String value2) {
            addCriterion("temp_parameter_system_variables.parameter_values not between", value1, value2, "parameterValues");
            return (Criteria) this;
        }

        public Criteria andVariableNameIsNull() {
            addCriterion("temp_parameter_system_variables.variable_name is null");
            return (Criteria) this;
        }

        public Criteria andVariableNameIsNotNull() {
            addCriterion("temp_parameter_system_variables.variable_name is not null");
            return (Criteria) this;
        }

        public Criteria andVariableNameEqualTo(String value) {
            addCriterion("temp_parameter_system_variables.variable_name =", value, "variableName");
            return (Criteria) this;
        }

        public Criteria andVariableNameNotEqualTo(String value) {
            addCriterion("temp_parameter_system_variables.variable_name <>", value, "variableName");
            return (Criteria) this;
        }

        public Criteria andVariableNameGreaterThan(String value) {
            addCriterion("temp_parameter_system_variables.variable_name >", value, "variableName");
            return (Criteria) this;
        }

        public Criteria andVariableNameGreaterThanOrEqualTo(String value) {
            addCriterion("temp_parameter_system_variables.variable_name >=", value, "variableName");
            return (Criteria) this;
        }

        public Criteria andVariableNameLessThan(String value) {
            addCriterion("temp_parameter_system_variables.variable_name <", value, "variableName");
            return (Criteria) this;
        }

        public Criteria andVariableNameLessThanOrEqualTo(String value) {
            addCriterion("temp_parameter_system_variables.variable_name <=", value, "variableName");
            return (Criteria) this;
        }

        public Criteria andVariableNameLike(String value) {
            addCriterion("temp_parameter_system_variables.variable_name like", value, "variableName");
            return (Criteria) this;
        }

        public Criteria andVariableNameNotLike(String value) {
            addCriterion("temp_parameter_system_variables.variable_name not like", value, "variableName");
            return (Criteria) this;
        }

        public Criteria andVariableNameIn(List<String> values) {
            addCriterion("temp_parameter_system_variables.variable_name in", values, "variableName");
            return (Criteria) this;
        }

        public Criteria andVariableNameNotIn(List<String> values) {
            addCriterion("temp_parameter_system_variables.variable_name not in", values, "variableName");
            return (Criteria) this;
        }

        public Criteria andVariableNameBetween(String value1, String value2) {
            addCriterion("temp_parameter_system_variables.variable_name between", value1, value2, "variableName");
            return (Criteria) this;
        }

        public Criteria andVariableNameNotBetween(String value1, String value2) {
            addCriterion("temp_parameter_system_variables.variable_name not between", value1, value2, "variableName");
            return (Criteria) this;
        }

        public Criteria andFormTypeIsNull() {
            addCriterion("temp_parameter_system_variables.form_type is null");
            return (Criteria) this;
        }

        public Criteria andFormTypeIsNotNull() {
            addCriterion("temp_parameter_system_variables.form_type is not null");
            return (Criteria) this;
        }

        public Criteria andFormTypeEqualTo(String value) {
            addCriterion("temp_parameter_system_variables.form_type =", value, "formType");
            return (Criteria) this;
        }

        public Criteria andFormTypeNotEqualTo(String value) {
            addCriterion("temp_parameter_system_variables.form_type <>", value, "formType");
            return (Criteria) this;
        }

        public Criteria andFormTypeGreaterThan(String value) {
            addCriterion("temp_parameter_system_variables.form_type >", value, "formType");
            return (Criteria) this;
        }

        public Criteria andFormTypeGreaterThanOrEqualTo(String value) {
            addCriterion("temp_parameter_system_variables.form_type >=", value, "formType");
            return (Criteria) this;
        }

        public Criteria andFormTypeLessThan(String value) {
            addCriterion("temp_parameter_system_variables.form_type <", value, "formType");
            return (Criteria) this;
        }

        public Criteria andFormTypeLessThanOrEqualTo(String value) {
            addCriterion("temp_parameter_system_variables.form_type <=", value, "formType");
            return (Criteria) this;
        }

        public Criteria andFormTypeLike(String value) {
            addCriterion("temp_parameter_system_variables.form_type like", value, "formType");
            return (Criteria) this;
        }

        public Criteria andFormTypeNotLike(String value) {
            addCriterion("temp_parameter_system_variables.form_type not like", value, "formType");
            return (Criteria) this;
        }

        public Criteria andFormTypeIn(List<String> values) {
            addCriterion("temp_parameter_system_variables.form_type in", values, "formType");
            return (Criteria) this;
        }

        public Criteria andFormTypeNotIn(List<String> values) {
            addCriterion("temp_parameter_system_variables.form_type not in", values, "formType");
            return (Criteria) this;
        }

        public Criteria andFormTypeBetween(String value1, String value2) {
            addCriterion("temp_parameter_system_variables.form_type between", value1, value2, "formType");
            return (Criteria) this;
        }

        public Criteria andFormTypeNotBetween(String value1, String value2) {
            addCriterion("temp_parameter_system_variables.form_type not between", value1, value2, "formType");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("temp_parameter_system_variables.remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("temp_parameter_system_variables.remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("temp_parameter_system_variables.remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("temp_parameter_system_variables.remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("temp_parameter_system_variables.remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("temp_parameter_system_variables.remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("temp_parameter_system_variables.remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("temp_parameter_system_variables.remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("temp_parameter_system_variables.remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("temp_parameter_system_variables.remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("temp_parameter_system_variables.remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("temp_parameter_system_variables.remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("temp_parameter_system_variables.remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("temp_parameter_system_variables.remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNull() {
            addCriterion("temp_parameter_system_variables.creater is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNotNull() {
            addCriterion("temp_parameter_system_variables.creater is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterEqualTo(String value) {
            addCriterion("temp_parameter_system_variables.creater =", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotEqualTo(String value) {
            addCriterion("temp_parameter_system_variables.creater <>", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThan(String value) {
            addCriterion("temp_parameter_system_variables.creater >", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_parameter_system_variables.creater >=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThan(String value) {
            addCriterion("temp_parameter_system_variables.creater <", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThanOrEqualTo(String value) {
            addCriterion("temp_parameter_system_variables.creater <=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLike(String value) {
            addCriterion("temp_parameter_system_variables.creater like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotLike(String value) {
            addCriterion("temp_parameter_system_variables.creater not like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterIn(List<String> values) {
            addCriterion("temp_parameter_system_variables.creater in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotIn(List<String> values) {
            addCriterion("temp_parameter_system_variables.creater not in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterBetween(String value1, String value2) {
            addCriterion("temp_parameter_system_variables.creater between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotBetween(String value1, String value2) {
            addCriterion("temp_parameter_system_variables.creater not between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("temp_parameter_system_variables.create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("temp_parameter_system_variables.create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("temp_parameter_system_variables.create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("temp_parameter_system_variables.create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("temp_parameter_system_variables.create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_parameter_system_variables.create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("temp_parameter_system_variables.create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_parameter_system_variables.create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("temp_parameter_system_variables.create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("temp_parameter_system_variables.create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_parameter_system_variables.create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_parameter_system_variables.create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNull() {
            addCriterion("temp_parameter_system_variables.updater is null");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNotNull() {
            addCriterion("temp_parameter_system_variables.updater is not null");
            return (Criteria) this;
        }

        public Criteria andUpdaterEqualTo(String value) {
            addCriterion("temp_parameter_system_variables.updater =", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotEqualTo(String value) {
            addCriterion("temp_parameter_system_variables.updater <>", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThan(String value) {
            addCriterion("temp_parameter_system_variables.updater >", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_parameter_system_variables.updater >=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThan(String value) {
            addCriterion("temp_parameter_system_variables.updater <", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThanOrEqualTo(String value) {
            addCriterion("temp_parameter_system_variables.updater <=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLike(String value) {
            addCriterion("temp_parameter_system_variables.updater like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotLike(String value) {
            addCriterion("temp_parameter_system_variables.updater not like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterIn(List<String> values) {
            addCriterion("temp_parameter_system_variables.updater in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotIn(List<String> values) {
            addCriterion("temp_parameter_system_variables.updater not in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterBetween(String value1, String value2) {
            addCriterion("temp_parameter_system_variables.updater between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotBetween(String value1, String value2) {
            addCriterion("temp_parameter_system_variables.updater not between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("temp_parameter_system_variables.update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("temp_parameter_system_variables.update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("temp_parameter_system_variables.update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("temp_parameter_system_variables.update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("temp_parameter_system_variables.update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_parameter_system_variables.update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("temp_parameter_system_variables.update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_parameter_system_variables.update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("temp_parameter_system_variables.update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("temp_parameter_system_variables.update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_parameter_system_variables.update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_parameter_system_variables.update_time not between", value1, value2, "updateTime");
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
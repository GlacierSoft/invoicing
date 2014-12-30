package com.glacier.frame.entity.system;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class LoginLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public LoginLogExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andLoginlogIdIsNull() {
            addCriterion("temp_loginlog.loginlog_id is null");
            return (Criteria) this;
        }

        public Criteria andLoginlogIdIsNotNull() {
            addCriterion("temp_loginlog.loginlog_id is not null");
            return (Criteria) this;
        }

        public Criteria andLoginlogIdEqualTo(String value) {
            addCriterion("temp_loginlog.loginlog_id =", value, "loginlogId");
            return (Criteria) this;
        }

        public Criteria andLoginlogIdNotEqualTo(String value) {
            addCriterion("temp_loginlog.loginlog_id <>", value, "loginlogId");
            return (Criteria) this;
        }

        public Criteria andLoginlogIdGreaterThan(String value) {
            addCriterion("temp_loginlog.loginlog_id >", value, "loginlogId");
            return (Criteria) this;
        }

        public Criteria andLoginlogIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_loginlog.loginlog_id >=", value, "loginlogId");
            return (Criteria) this;
        }

        public Criteria andLoginlogIdLessThan(String value) {
            addCriterion("temp_loginlog.loginlog_id <", value, "loginlogId");
            return (Criteria) this;
        }

        public Criteria andLoginlogIdLessThanOrEqualTo(String value) {
            addCriterion("temp_loginlog.loginlog_id <=", value, "loginlogId");
            return (Criteria) this;
        }

        public Criteria andLoginlogIdLike(String value) {
            addCriterion("temp_loginlog.loginlog_id like", value, "loginlogId");
            return (Criteria) this;
        }

        public Criteria andLoginlogIdNotLike(String value) {
            addCriterion("temp_loginlog.loginlog_id not like", value, "loginlogId");
            return (Criteria) this;
        }

        public Criteria andLoginlogIdIn(List<String> values) {
            addCriterion("temp_loginlog.loginlog_id in", values, "loginlogId");
            return (Criteria) this;
        }

        public Criteria andLoginlogIdNotIn(List<String> values) {
            addCriterion("temp_loginlog.loginlog_id not in", values, "loginlogId");
            return (Criteria) this;
        }

        public Criteria andLoginlogIdBetween(String value1, String value2) {
            addCriterion("temp_loginlog.loginlog_id between", value1, value2, "loginlogId");
            return (Criteria) this;
        }

        public Criteria andLoginlogIdNotBetween(String value1, String value2) {
            addCriterion("temp_loginlog.loginlog_id not between", value1, value2, "loginlogId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("temp_loginlog.user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("temp_loginlog.user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("temp_loginlog.user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("temp_loginlog.user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("temp_loginlog.user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_loginlog.user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("temp_loginlog.user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("temp_loginlog.user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("temp_loginlog.user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("temp_loginlog.user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("temp_loginlog.user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("temp_loginlog.user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("temp_loginlog.user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("temp_loginlog.user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andLoginUserIsNull() {
            addCriterion("temp_loginlog.login_user is null");
            return (Criteria) this;
        }

        public Criteria andLoginUserIsNotNull() {
            addCriterion("temp_loginlog.login_user is not null");
            return (Criteria) this;
        }

        public Criteria andLoginUserEqualTo(String value) {
            addCriterion("temp_loginlog.login_user =", value, "loginUser");
            return (Criteria) this;
        }

        public Criteria andLoginUserNotEqualTo(String value) {
            addCriterion("temp_loginlog.login_user <>", value, "loginUser");
            return (Criteria) this;
        }

        public Criteria andLoginUserGreaterThan(String value) {
            addCriterion("temp_loginlog.login_user >", value, "loginUser");
            return (Criteria) this;
        }

        public Criteria andLoginUserGreaterThanOrEqualTo(String value) {
            addCriterion("temp_loginlog.login_user >=", value, "loginUser");
            return (Criteria) this;
        }

        public Criteria andLoginUserLessThan(String value) {
            addCriterion("temp_loginlog.login_user <", value, "loginUser");
            return (Criteria) this;
        }

        public Criteria andLoginUserLessThanOrEqualTo(String value) {
            addCriterion("temp_loginlog.login_user <=", value, "loginUser");
            return (Criteria) this;
        }

        public Criteria andLoginUserLike(String value) {
            addCriterion("temp_loginlog.login_user like", value, "loginUser");
            return (Criteria) this;
        }

        public Criteria andLoginUserNotLike(String value) {
            addCriterion("temp_loginlog.login_user not like", value, "loginUser");
            return (Criteria) this;
        }

        public Criteria andLoginUserIn(List<String> values) {
            addCriterion("temp_loginlog.login_user in", values, "loginUser");
            return (Criteria) this;
        }

        public Criteria andLoginUserNotIn(List<String> values) {
            addCriterion("temp_loginlog.login_user not in", values, "loginUser");
            return (Criteria) this;
        }

        public Criteria andLoginUserBetween(String value1, String value2) {
            addCriterion("temp_loginlog.login_user between", value1, value2, "loginUser");
            return (Criteria) this;
        }

        public Criteria andLoginUserNotBetween(String value1, String value2) {
            addCriterion("temp_loginlog.login_user not between", value1, value2, "loginUser");
            return (Criteria) this;
        }

        public Criteria andLoginTimeIsNull() {
            addCriterion("temp_loginlog.login_time is null");
            return (Criteria) this;
        }

        public Criteria andLoginTimeIsNotNull() {
            addCriterion("temp_loginlog.login_time is not null");
            return (Criteria) this;
        }

        public Criteria andLoginTimeEqualTo(Date value) {
            addCriterionForJDBCDate("temp_loginlog.login_time =", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("temp_loginlog.login_time <>", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("temp_loginlog.login_time >", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("temp_loginlog.login_time >=", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeLessThan(Date value) {
            addCriterionForJDBCDate("temp_loginlog.login_time <", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("temp_loginlog.login_time <=", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeIn(List<Date> values) {
            addCriterionForJDBCDate("temp_loginlog.login_time in", values, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("temp_loginlog.login_time not in", values, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("temp_loginlog.login_time between", value1, value2, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("temp_loginlog.login_time not between", value1, value2, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginIpIsNull() {
            addCriterion("temp_loginlog.login_ip is null");
            return (Criteria) this;
        }

        public Criteria andLoginIpIsNotNull() {
            addCriterion("temp_loginlog.login_ip is not null");
            return (Criteria) this;
        }

        public Criteria andLoginIpEqualTo(String value) {
            addCriterion("temp_loginlog.login_ip =", value, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpNotEqualTo(String value) {
            addCriterion("temp_loginlog.login_ip <>", value, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpGreaterThan(String value) {
            addCriterion("temp_loginlog.login_ip >", value, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpGreaterThanOrEqualTo(String value) {
            addCriterion("temp_loginlog.login_ip >=", value, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpLessThan(String value) {
            addCriterion("temp_loginlog.login_ip <", value, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpLessThanOrEqualTo(String value) {
            addCriterion("temp_loginlog.login_ip <=", value, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpLike(String value) {
            addCriterion("temp_loginlog.login_ip like", value, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpNotLike(String value) {
            addCriterion("temp_loginlog.login_ip not like", value, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpIn(List<String> values) {
            addCriterion("temp_loginlog.login_ip in", values, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpNotIn(List<String> values) {
            addCriterion("temp_loginlog.login_ip not in", values, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpBetween(String value1, String value2) {
            addCriterion("temp_loginlog.login_ip between", value1, value2, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpNotBetween(String value1, String value2) {
            addCriterion("temp_loginlog.login_ip not between", value1, value2, "loginIp");
            return (Criteria) this;
        }

        public Criteria andBrowserVersionIsNull() {
            addCriterion("temp_loginlog.browser_version is null");
            return (Criteria) this;
        }

        public Criteria andBrowserVersionIsNotNull() {
            addCriterion("temp_loginlog.browser_version is not null");
            return (Criteria) this;
        }

        public Criteria andBrowserVersionEqualTo(String value) {
            addCriterion("temp_loginlog.browser_version =", value, "browserVersion");
            return (Criteria) this;
        }

        public Criteria andBrowserVersionNotEqualTo(String value) {
            addCriterion("temp_loginlog.browser_version <>", value, "browserVersion");
            return (Criteria) this;
        }

        public Criteria andBrowserVersionGreaterThan(String value) {
            addCriterion("temp_loginlog.browser_version >", value, "browserVersion");
            return (Criteria) this;
        }

        public Criteria andBrowserVersionGreaterThanOrEqualTo(String value) {
            addCriterion("temp_loginlog.browser_version >=", value, "browserVersion");
            return (Criteria) this;
        }

        public Criteria andBrowserVersionLessThan(String value) {
            addCriterion("temp_loginlog.browser_version <", value, "browserVersion");
            return (Criteria) this;
        }

        public Criteria andBrowserVersionLessThanOrEqualTo(String value) {
            addCriterion("temp_loginlog.browser_version <=", value, "browserVersion");
            return (Criteria) this;
        }

        public Criteria andBrowserVersionLike(String value) {
            addCriterion("temp_loginlog.browser_version like", value, "browserVersion");
            return (Criteria) this;
        }

        public Criteria andBrowserVersionNotLike(String value) {
            addCriterion("temp_loginlog.browser_version not like", value, "browserVersion");
            return (Criteria) this;
        }

        public Criteria andBrowserVersionIn(List<String> values) {
            addCriterion("temp_loginlog.browser_version in", values, "browserVersion");
            return (Criteria) this;
        }

        public Criteria andBrowserVersionNotIn(List<String> values) {
            addCriterion("temp_loginlog.browser_version not in", values, "browserVersion");
            return (Criteria) this;
        }

        public Criteria andBrowserVersionBetween(String value1, String value2) {
            addCriterion("temp_loginlog.browser_version between", value1, value2, "browserVersion");
            return (Criteria) this;
        }

        public Criteria andBrowserVersionNotBetween(String value1, String value2) {
            addCriterion("temp_loginlog.browser_version not between", value1, value2, "browserVersion");
            return (Criteria) this;
        }

        public Criteria andScreenSizeIsNull() {
            addCriterion("temp_loginlog.screen_size is null");
            return (Criteria) this;
        }

        public Criteria andScreenSizeIsNotNull() {
            addCriterion("temp_loginlog.screen_size is not null");
            return (Criteria) this;
        }

        public Criteria andScreenSizeEqualTo(String value) {
            addCriterion("temp_loginlog.screen_size =", value, "screenSize");
            return (Criteria) this;
        }

        public Criteria andScreenSizeNotEqualTo(String value) {
            addCriterion("temp_loginlog.screen_size <>", value, "screenSize");
            return (Criteria) this;
        }

        public Criteria andScreenSizeGreaterThan(String value) {
            addCriterion("temp_loginlog.screen_size >", value, "screenSize");
            return (Criteria) this;
        }

        public Criteria andScreenSizeGreaterThanOrEqualTo(String value) {
            addCriterion("temp_loginlog.screen_size >=", value, "screenSize");
            return (Criteria) this;
        }

        public Criteria andScreenSizeLessThan(String value) {
            addCriterion("temp_loginlog.screen_size <", value, "screenSize");
            return (Criteria) this;
        }

        public Criteria andScreenSizeLessThanOrEqualTo(String value) {
            addCriterion("temp_loginlog.screen_size <=", value, "screenSize");
            return (Criteria) this;
        }

        public Criteria andScreenSizeLike(String value) {
            addCriterion("temp_loginlog.screen_size like", value, "screenSize");
            return (Criteria) this;
        }

        public Criteria andScreenSizeNotLike(String value) {
            addCriterion("temp_loginlog.screen_size not like", value, "screenSize");
            return (Criteria) this;
        }

        public Criteria andScreenSizeIn(List<String> values) {
            addCriterion("temp_loginlog.screen_size in", values, "screenSize");
            return (Criteria) this;
        }

        public Criteria andScreenSizeNotIn(List<String> values) {
            addCriterion("temp_loginlog.screen_size not in", values, "screenSize");
            return (Criteria) this;
        }

        public Criteria andScreenSizeBetween(String value1, String value2) {
            addCriterion("temp_loginlog.screen_size between", value1, value2, "screenSize");
            return (Criteria) this;
        }

        public Criteria andScreenSizeNotBetween(String value1, String value2) {
            addCriterion("temp_loginlog.screen_size not between", value1, value2, "screenSize");
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
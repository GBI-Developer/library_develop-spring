package com.web.library.dao.generate.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TMngUserInfoExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_mng_user_info
     *
     * @mbg.generated Sun Jun 24 18:39:58 JST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_mng_user_info
     *
     * @mbg.generated Sun Jun 24 18:39:58 JST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_mng_user_info
     *
     * @mbg.generated Sun Jun 24 18:39:58 JST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mng_user_info
     *
     * @mbg.generated Sun Jun 24 18:39:58 JST 2018
     */
    public TMngUserInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mng_user_info
     *
     * @mbg.generated Sun Jun 24 18:39:58 JST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mng_user_info
     *
     * @mbg.generated Sun Jun 24 18:39:58 JST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mng_user_info
     *
     * @mbg.generated Sun Jun 24 18:39:58 JST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mng_user_info
     *
     * @mbg.generated Sun Jun 24 18:39:58 JST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mng_user_info
     *
     * @mbg.generated Sun Jun 24 18:39:58 JST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mng_user_info
     *
     * @mbg.generated Sun Jun 24 18:39:58 JST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mng_user_info
     *
     * @mbg.generated Sun Jun 24 18:39:58 JST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mng_user_info
     *
     * @mbg.generated Sun Jun 24 18:39:58 JST 2018
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mng_user_info
     *
     * @mbg.generated Sun Jun 24 18:39:58 JST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mng_user_info
     *
     * @mbg.generated Sun Jun 24 18:39:58 JST 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_mng_user_info
     *
     * @mbg.generated Sun Jun 24 18:39:58 JST 2018
     */
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

        public Criteria andMngUserIdIsNull() {
            addCriterion("MNG_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andMngUserIdIsNotNull() {
            addCriterion("MNG_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMngUserIdEqualTo(String value) {
            addCriterion("MNG_USER_ID =", value, "mngUserId");
            return (Criteria) this;
        }

        public Criteria andMngUserIdNotEqualTo(String value) {
            addCriterion("MNG_USER_ID <>", value, "mngUserId");
            return (Criteria) this;
        }

        public Criteria andMngUserIdGreaterThan(String value) {
            addCriterion("MNG_USER_ID >", value, "mngUserId");
            return (Criteria) this;
        }

        public Criteria andMngUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("MNG_USER_ID >=", value, "mngUserId");
            return (Criteria) this;
        }

        public Criteria andMngUserIdLessThan(String value) {
            addCriterion("MNG_USER_ID <", value, "mngUserId");
            return (Criteria) this;
        }

        public Criteria andMngUserIdLessThanOrEqualTo(String value) {
            addCriterion("MNG_USER_ID <=", value, "mngUserId");
            return (Criteria) this;
        }

        public Criteria andMngUserIdLike(String value) {
            addCriterion("MNG_USER_ID like", value, "mngUserId");
            return (Criteria) this;
        }

        public Criteria andMngUserIdNotLike(String value) {
            addCriterion("MNG_USER_ID not like", value, "mngUserId");
            return (Criteria) this;
        }

        public Criteria andMngUserIdIn(List<String> values) {
            addCriterion("MNG_USER_ID in", values, "mngUserId");
            return (Criteria) this;
        }

        public Criteria andMngUserIdNotIn(List<String> values) {
            addCriterion("MNG_USER_ID not in", values, "mngUserId");
            return (Criteria) this;
        }

        public Criteria andMngUserIdBetween(String value1, String value2) {
            addCriterion("MNG_USER_ID between", value1, value2, "mngUserId");
            return (Criteria) this;
        }

        public Criteria andMngUserIdNotBetween(String value1, String value2) {
            addCriterion("MNG_USER_ID not between", value1, value2, "mngUserId");
            return (Criteria) this;
        }

        public Criteria andMngUserNameIsNull() {
            addCriterion("MNG_USER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andMngUserNameIsNotNull() {
            addCriterion("MNG_USER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andMngUserNameEqualTo(String value) {
            addCriterion("MNG_USER_NAME =", value, "mngUserName");
            return (Criteria) this;
        }

        public Criteria andMngUserNameNotEqualTo(String value) {
            addCriterion("MNG_USER_NAME <>", value, "mngUserName");
            return (Criteria) this;
        }

        public Criteria andMngUserNameGreaterThan(String value) {
            addCriterion("MNG_USER_NAME >", value, "mngUserName");
            return (Criteria) this;
        }

        public Criteria andMngUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("MNG_USER_NAME >=", value, "mngUserName");
            return (Criteria) this;
        }

        public Criteria andMngUserNameLessThan(String value) {
            addCriterion("MNG_USER_NAME <", value, "mngUserName");
            return (Criteria) this;
        }

        public Criteria andMngUserNameLessThanOrEqualTo(String value) {
            addCriterion("MNG_USER_NAME <=", value, "mngUserName");
            return (Criteria) this;
        }

        public Criteria andMngUserNameLike(String value) {
            addCriterion("MNG_USER_NAME like", value, "mngUserName");
            return (Criteria) this;
        }

        public Criteria andMngUserNameNotLike(String value) {
            addCriterion("MNG_USER_NAME not like", value, "mngUserName");
            return (Criteria) this;
        }

        public Criteria andMngUserNameIn(List<String> values) {
            addCriterion("MNG_USER_NAME in", values, "mngUserName");
            return (Criteria) this;
        }

        public Criteria andMngUserNameNotIn(List<String> values) {
            addCriterion("MNG_USER_NAME not in", values, "mngUserName");
            return (Criteria) this;
        }

        public Criteria andMngUserNameBetween(String value1, String value2) {
            addCriterion("MNG_USER_NAME between", value1, value2, "mngUserName");
            return (Criteria) this;
        }

        public Criteria andMngUserNameNotBetween(String value1, String value2) {
            addCriterion("MNG_USER_NAME not between", value1, value2, "mngUserName");
            return (Criteria) this;
        }

        public Criteria andMngUserPassIsNull() {
            addCriterion("MNG_USER_PASS is null");
            return (Criteria) this;
        }

        public Criteria andMngUserPassIsNotNull() {
            addCriterion("MNG_USER_PASS is not null");
            return (Criteria) this;
        }

        public Criteria andMngUserPassEqualTo(String value) {
            addCriterion("MNG_USER_PASS =", value, "mngUserPass");
            return (Criteria) this;
        }

        public Criteria andMngUserPassNotEqualTo(String value) {
            addCriterion("MNG_USER_PASS <>", value, "mngUserPass");
            return (Criteria) this;
        }

        public Criteria andMngUserPassGreaterThan(String value) {
            addCriterion("MNG_USER_PASS >", value, "mngUserPass");
            return (Criteria) this;
        }

        public Criteria andMngUserPassGreaterThanOrEqualTo(String value) {
            addCriterion("MNG_USER_PASS >=", value, "mngUserPass");
            return (Criteria) this;
        }

        public Criteria andMngUserPassLessThan(String value) {
            addCriterion("MNG_USER_PASS <", value, "mngUserPass");
            return (Criteria) this;
        }

        public Criteria andMngUserPassLessThanOrEqualTo(String value) {
            addCriterion("MNG_USER_PASS <=", value, "mngUserPass");
            return (Criteria) this;
        }

        public Criteria andMngUserPassLike(String value) {
            addCriterion("MNG_USER_PASS like", value, "mngUserPass");
            return (Criteria) this;
        }

        public Criteria andMngUserPassNotLike(String value) {
            addCriterion("MNG_USER_PASS not like", value, "mngUserPass");
            return (Criteria) this;
        }

        public Criteria andMngUserPassIn(List<String> values) {
            addCriterion("MNG_USER_PASS in", values, "mngUserPass");
            return (Criteria) this;
        }

        public Criteria andMngUserPassNotIn(List<String> values) {
            addCriterion("MNG_USER_PASS not in", values, "mngUserPass");
            return (Criteria) this;
        }

        public Criteria andMngUserPassBetween(String value1, String value2) {
            addCriterion("MNG_USER_PASS between", value1, value2, "mngUserPass");
            return (Criteria) this;
        }

        public Criteria andMngUserPassNotBetween(String value1, String value2) {
            addCriterion("MNG_USER_PASS not between", value1, value2, "mngUserPass");
            return (Criteria) this;
        }

        public Criteria andMngRegistDateIsNull() {
            addCriterion("MNG_REGIST_DATE is null");
            return (Criteria) this;
        }

        public Criteria andMngRegistDateIsNotNull() {
            addCriterion("MNG_REGIST_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andMngRegistDateEqualTo(Date value) {
            addCriterionForJDBCDate("MNG_REGIST_DATE =", value, "mngRegistDate");
            return (Criteria) this;
        }

        public Criteria andMngRegistDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("MNG_REGIST_DATE <>", value, "mngRegistDate");
            return (Criteria) this;
        }

        public Criteria andMngRegistDateGreaterThan(Date value) {
            addCriterionForJDBCDate("MNG_REGIST_DATE >", value, "mngRegistDate");
            return (Criteria) this;
        }

        public Criteria andMngRegistDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("MNG_REGIST_DATE >=", value, "mngRegistDate");
            return (Criteria) this;
        }

        public Criteria andMngRegistDateLessThan(Date value) {
            addCriterionForJDBCDate("MNG_REGIST_DATE <", value, "mngRegistDate");
            return (Criteria) this;
        }

        public Criteria andMngRegistDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("MNG_REGIST_DATE <=", value, "mngRegistDate");
            return (Criteria) this;
        }

        public Criteria andMngRegistDateIn(List<Date> values) {
            addCriterionForJDBCDate("MNG_REGIST_DATE in", values, "mngRegistDate");
            return (Criteria) this;
        }

        public Criteria andMngRegistDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("MNG_REGIST_DATE not in", values, "mngRegistDate");
            return (Criteria) this;
        }

        public Criteria andMngRegistDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("MNG_REGIST_DATE between", value1, value2, "mngRegistDate");
            return (Criteria) this;
        }

        public Criteria andMngRegistDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("MNG_REGIST_DATE not between", value1, value2, "mngRegistDate");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNull() {
            addCriterion("CREATE_USER is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNotNull() {
            addCriterion("CREATE_USER is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserEqualTo(String value) {
            addCriterion("CREATE_USER =", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotEqualTo(String value) {
            addCriterion("CREATE_USER <>", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThan(String value) {
            addCriterion("CREATE_USER >", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_USER >=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThan(String value) {
            addCriterion("CREATE_USER <", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThanOrEqualTo(String value) {
            addCriterion("CREATE_USER <=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLike(String value) {
            addCriterion("CREATE_USER like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotLike(String value) {
            addCriterion("CREATE_USER not like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserIn(List<String> values) {
            addCriterion("CREATE_USER in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotIn(List<String> values) {
            addCriterion("CREATE_USER not in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserBetween(String value1, String value2) {
            addCriterion("CREATE_USER between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotBetween(String value1, String value2) {
            addCriterion("CREATE_USER not between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIsNull() {
            addCriterion("UPDATE_USER is null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIsNotNull() {
            addCriterion("UPDATE_USER is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserEqualTo(String value) {
            addCriterion("UPDATE_USER =", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotEqualTo(String value) {
            addCriterion("UPDATE_USER <>", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThan(String value) {
            addCriterion("UPDATE_USER >", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATE_USER >=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThan(String value) {
            addCriterion("UPDATE_USER <", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThanOrEqualTo(String value) {
            addCriterion("UPDATE_USER <=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLike(String value) {
            addCriterion("UPDATE_USER like", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotLike(String value) {
            addCriterion("UPDATE_USER not like", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIn(List<String> values) {
            addCriterion("UPDATE_USER in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotIn(List<String> values) {
            addCriterion("UPDATE_USER not in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserBetween(String value1, String value2) {
            addCriterion("UPDATE_USER between", value1, value2, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotBetween(String value1, String value2) {
            addCriterion("UPDATE_USER not between", value1, value2, "updateUser");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("CREATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("CREATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("CREATE_DATE =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("CREATE_DATE <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("CREATE_DATE >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_DATE >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("CREATE_DATE <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_DATE <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("CREATE_DATE in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("CREATE_DATE not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("CREATE_DATE between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_DATE not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNull() {
            addCriterion("UPDATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNotNull() {
            addCriterion("UPDATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateEqualTo(Date value) {
            addCriterion("UPDATE_DATE =", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualTo(Date value) {
            addCriterion("UPDATE_DATE <>", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThan(Date value) {
            addCriterion("UPDATE_DATE >", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATE_DATE >=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThan(Date value) {
            addCriterion("UPDATE_DATE <", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("UPDATE_DATE <=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIn(List<Date> values) {
            addCriterion("UPDATE_DATE in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotIn(List<Date> values) {
            addCriterion("UPDATE_DATE not in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateBetween(Date value1, Date value2) {
            addCriterion("UPDATE_DATE between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("UPDATE_DATE not between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andVersionNoIsNull() {
            addCriterion("VERSION_NO is null");
            return (Criteria) this;
        }

        public Criteria andVersionNoIsNotNull() {
            addCriterion("VERSION_NO is not null");
            return (Criteria) this;
        }

        public Criteria andVersionNoEqualTo(Integer value) {
            addCriterion("VERSION_NO =", value, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoNotEqualTo(Integer value) {
            addCriterion("VERSION_NO <>", value, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoGreaterThan(Integer value) {
            addCriterion("VERSION_NO >", value, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("VERSION_NO >=", value, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoLessThan(Integer value) {
            addCriterion("VERSION_NO <", value, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoLessThanOrEqualTo(Integer value) {
            addCriterion("VERSION_NO <=", value, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoIn(List<Integer> values) {
            addCriterion("VERSION_NO in", values, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoNotIn(List<Integer> values) {
            addCriterion("VERSION_NO not in", values, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoBetween(Integer value1, Integer value2) {
            addCriterion("VERSION_NO between", value1, value2, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoNotBetween(Integer value1, Integer value2) {
            addCriterion("VERSION_NO not between", value1, value2, "versionNo");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_mng_user_info
     *
     * @mbg.generated do_not_delete_during_merge Sun Jun 24 18:39:58 JST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_mng_user_info
     *
     * @mbg.generated Sun Jun 24 18:39:58 JST 2018
     */
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
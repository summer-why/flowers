package com.hy.flowersweb.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StoreExample {
    /**
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    protected String orderByClause;

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    protected boolean distinct;

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    public StoreExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    public StoreExample orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    public StoreExample orderBy(String ... orderByClauses) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < orderByClauses.length; i++) {
            sb.append(orderByClauses[i]);
            if (i < orderByClauses.length - 1) {
                sb.append(" , ");
            }
        }
        this.setOrderByClause(sb.toString());
        return this;
    }

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria(this);
        return criteria;
    }

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setPageInfo(Integer currentPage, Integer pageSize) {
        if(pageSize<1) throw new IllegalArgumentException("页大小不能小于1！");
        this.limit=pageSize;
        if(currentPage<1) throw new IllegalArgumentException("页数不能小于1！");
        this.offset=(currentPage-1)*pageSize;
    }

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    public static Criteria newAndCreateCriteria() {
        StoreExample example = new StoreExample();
        return example.createCriteria();
    }

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:13 CST 2020
         */
        public Criteria andIdEqualToColumn(Store.Column column) {
            addCriterion(new StringBuilder("id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:13 CST 2020
         */
        public Criteria andIdNotEqualToColumn(Store.Column column) {
            addCriterion(new StringBuilder("id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:13 CST 2020
         */
        public Criteria andIdGreaterThanColumn(Store.Column column) {
            addCriterion(new StringBuilder("id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:13 CST 2020
         */
        public Criteria andIdGreaterThanOrEqualToColumn(Store.Column column) {
            addCriterion(new StringBuilder("id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:13 CST 2020
         */
        public Criteria andIdLessThanColumn(Store.Column column) {
            addCriterion(new StringBuilder("id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:13 CST 2020
         */
        public Criteria andIdLessThanOrEqualToColumn(Store.Column column) {
            addCriterion(new StringBuilder("id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:13 CST 2020
         */
        public Criteria andUsernameEqualToColumn(Store.Column column) {
            addCriterion(new StringBuilder("username = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:13 CST 2020
         */
        public Criteria andUsernameNotEqualToColumn(Store.Column column) {
            addCriterion(new StringBuilder("username <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:13 CST 2020
         */
        public Criteria andUsernameGreaterThanColumn(Store.Column column) {
            addCriterion(new StringBuilder("username > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:13 CST 2020
         */
        public Criteria andUsernameGreaterThanOrEqualToColumn(Store.Column column) {
            addCriterion(new StringBuilder("username >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:13 CST 2020
         */
        public Criteria andUsernameLessThanColumn(Store.Column column) {
            addCriterion(new StringBuilder("username < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:13 CST 2020
         */
        public Criteria andUsernameLessThanOrEqualToColumn(Store.Column column) {
            addCriterion(new StringBuilder("username <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:13 CST 2020
         */
        public Criteria andPasswordEqualToColumn(Store.Column column) {
            addCriterion(new StringBuilder("password = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:13 CST 2020
         */
        public Criteria andPasswordNotEqualToColumn(Store.Column column) {
            addCriterion(new StringBuilder("password <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:13 CST 2020
         */
        public Criteria andPasswordGreaterThanColumn(Store.Column column) {
            addCriterion(new StringBuilder("password > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:13 CST 2020
         */
        public Criteria andPasswordGreaterThanOrEqualToColumn(Store.Column column) {
            addCriterion(new StringBuilder("password >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:13 CST 2020
         */
        public Criteria andPasswordLessThanColumn(Store.Column column) {
            addCriterion(new StringBuilder("password < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:13 CST 2020
         */
        public Criteria andPasswordLessThanOrEqualToColumn(Store.Column column) {
            addCriterion(new StringBuilder("password <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:13 CST 2020
         */
        public Criteria andPhoneEqualToColumn(Store.Column column) {
            addCriterion(new StringBuilder("phone = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:13 CST 2020
         */
        public Criteria andPhoneNotEqualToColumn(Store.Column column) {
            addCriterion(new StringBuilder("phone <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:13 CST 2020
         */
        public Criteria andPhoneGreaterThanColumn(Store.Column column) {
            addCriterion(new StringBuilder("phone > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:13 CST 2020
         */
        public Criteria andPhoneGreaterThanOrEqualToColumn(Store.Column column) {
            addCriterion(new StringBuilder("phone >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:13 CST 2020
         */
        public Criteria andPhoneLessThanColumn(Store.Column column) {
            addCriterion(new StringBuilder("phone < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:13 CST 2020
         */
        public Criteria andPhoneLessThanOrEqualToColumn(Store.Column column) {
            addCriterion(new StringBuilder("phone <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andRealnameIsNull() {
            addCriterion("realname is null");
            return (Criteria) this;
        }

        public Criteria andRealnameIsNotNull() {
            addCriterion("realname is not null");
            return (Criteria) this;
        }

        public Criteria andRealnameEqualTo(String value) {
            addCriterion("realname =", value, "realname");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:13 CST 2020
         */
        public Criteria andRealnameEqualToColumn(Store.Column column) {
            addCriterion(new StringBuilder("realname = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRealnameNotEqualTo(String value) {
            addCriterion("realname <>", value, "realname");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:13 CST 2020
         */
        public Criteria andRealnameNotEqualToColumn(Store.Column column) {
            addCriterion(new StringBuilder("realname <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRealnameGreaterThan(String value) {
            addCriterion("realname >", value, "realname");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:13 CST 2020
         */
        public Criteria andRealnameGreaterThanColumn(Store.Column column) {
            addCriterion(new StringBuilder("realname > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRealnameGreaterThanOrEqualTo(String value) {
            addCriterion("realname >=", value, "realname");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:13 CST 2020
         */
        public Criteria andRealnameGreaterThanOrEqualToColumn(Store.Column column) {
            addCriterion(new StringBuilder("realname >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRealnameLessThan(String value) {
            addCriterion("realname <", value, "realname");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:13 CST 2020
         */
        public Criteria andRealnameLessThanColumn(Store.Column column) {
            addCriterion(new StringBuilder("realname < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRealnameLessThanOrEqualTo(String value) {
            addCriterion("realname <=", value, "realname");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:13 CST 2020
         */
        public Criteria andRealnameLessThanOrEqualToColumn(Store.Column column) {
            addCriterion(new StringBuilder("realname <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRealnameLike(String value) {
            addCriterion("realname like", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotLike(String value) {
            addCriterion("realname not like", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameIn(List<String> values) {
            addCriterion("realname in", values, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotIn(List<String> values) {
            addCriterion("realname not in", values, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameBetween(String value1, String value2) {
            addCriterion("realname between", value1, value2, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotBetween(String value1, String value2) {
            addCriterion("realname not between", value1, value2, "realname");
            return (Criteria) this;
        }

        public Criteria andId_cardIsNull() {
            addCriterion("id_card is null");
            return (Criteria) this;
        }

        public Criteria andId_cardIsNotNull() {
            addCriterion("id_card is not null");
            return (Criteria) this;
        }

        public Criteria andId_cardEqualTo(String value) {
            addCriterion("id_card =", value, "id_card");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:13 CST 2020
         */
        public Criteria andId_cardEqualToColumn(Store.Column column) {
            addCriterion(new StringBuilder("id_card = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andId_cardNotEqualTo(String value) {
            addCriterion("id_card <>", value, "id_card");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:13 CST 2020
         */
        public Criteria andId_cardNotEqualToColumn(Store.Column column) {
            addCriterion(new StringBuilder("id_card <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andId_cardGreaterThan(String value) {
            addCriterion("id_card >", value, "id_card");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:13 CST 2020
         */
        public Criteria andId_cardGreaterThanColumn(Store.Column column) {
            addCriterion(new StringBuilder("id_card > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andId_cardGreaterThanOrEqualTo(String value) {
            addCriterion("id_card >=", value, "id_card");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:13 CST 2020
         */
        public Criteria andId_cardGreaterThanOrEqualToColumn(Store.Column column) {
            addCriterion(new StringBuilder("id_card >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andId_cardLessThan(String value) {
            addCriterion("id_card <", value, "id_card");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:13 CST 2020
         */
        public Criteria andId_cardLessThanColumn(Store.Column column) {
            addCriterion(new StringBuilder("id_card < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andId_cardLessThanOrEqualTo(String value) {
            addCriterion("id_card <=", value, "id_card");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:13 CST 2020
         */
        public Criteria andId_cardLessThanOrEqualToColumn(Store.Column column) {
            addCriterion(new StringBuilder("id_card <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andId_cardLike(String value) {
            addCriterion("id_card like", value, "id_card");
            return (Criteria) this;
        }

        public Criteria andId_cardNotLike(String value) {
            addCriterion("id_card not like", value, "id_card");
            return (Criteria) this;
        }

        public Criteria andId_cardIn(List<String> values) {
            addCriterion("id_card in", values, "id_card");
            return (Criteria) this;
        }

        public Criteria andId_cardNotIn(List<String> values) {
            addCriterion("id_card not in", values, "id_card");
            return (Criteria) this;
        }

        public Criteria andId_cardBetween(String value1, String value2) {
            addCriterion("id_card between", value1, value2, "id_card");
            return (Criteria) this;
        }

        public Criteria andId_cardNotBetween(String value1, String value2) {
            addCriterion("id_card not between", value1, value2, "id_card");
            return (Criteria) this;
        }

        public Criteria andCreate_timeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreate_timeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreate_timeEqualTo(Date value) {
            addCriterion("create_time =", value, "create_time");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:13 CST 2020
         */
        public Criteria andCreate_timeEqualToColumn(Store.Column column) {
            addCriterion(new StringBuilder("create_time = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreate_timeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "create_time");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:13 CST 2020
         */
        public Criteria andCreate_timeNotEqualToColumn(Store.Column column) {
            addCriterion(new StringBuilder("create_time <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreate_timeGreaterThan(Date value) {
            addCriterion("create_time >", value, "create_time");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:13 CST 2020
         */
        public Criteria andCreate_timeGreaterThanColumn(Store.Column column) {
            addCriterion(new StringBuilder("create_time > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreate_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "create_time");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:13 CST 2020
         */
        public Criteria andCreate_timeGreaterThanOrEqualToColumn(Store.Column column) {
            addCriterion(new StringBuilder("create_time >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreate_timeLessThan(Date value) {
            addCriterion("create_time <", value, "create_time");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:13 CST 2020
         */
        public Criteria andCreate_timeLessThanColumn(Store.Column column) {
            addCriterion(new StringBuilder("create_time < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreate_timeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "create_time");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:13 CST 2020
         */
        public Criteria andCreate_timeLessThanOrEqualToColumn(Store.Column column) {
            addCriterion(new StringBuilder("create_time <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreate_timeIn(List<Date> values) {
            addCriterion("create_time in", values, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "create_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeEqualTo(Date value) {
            addCriterion("update_time =", value, "update_time");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:13 CST 2020
         */
        public Criteria andUpdate_timeEqualToColumn(Store.Column column) {
            addCriterion(new StringBuilder("update_time = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdate_timeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "update_time");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:13 CST 2020
         */
        public Criteria andUpdate_timeNotEqualToColumn(Store.Column column) {
            addCriterion(new StringBuilder("update_time <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdate_timeGreaterThan(Date value) {
            addCriterion("update_time >", value, "update_time");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:13 CST 2020
         */
        public Criteria andUpdate_timeGreaterThanColumn(Store.Column column) {
            addCriterion(new StringBuilder("update_time > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdate_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "update_time");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:13 CST 2020
         */
        public Criteria andUpdate_timeGreaterThanOrEqualToColumn(Store.Column column) {
            addCriterion(new StringBuilder("update_time >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdate_timeLessThan(Date value) {
            addCriterion("update_time <", value, "update_time");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:13 CST 2020
         */
        public Criteria andUpdate_timeLessThanColumn(Store.Column column) {
            addCriterion(new StringBuilder("update_time < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdate_timeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "update_time");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:13 CST 2020
         */
        public Criteria andUpdate_timeLessThanOrEqualToColumn(Store.Column column) {
            addCriterion(new StringBuilder("update_time <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdate_timeIn(List<Date> values) {
            addCriterion("update_time in", values, "update_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "update_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "update_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "update_time");
            return (Criteria) this;
        }

        public Criteria andStore_nameIsNull() {
            addCriterion("store_name is null");
            return (Criteria) this;
        }

        public Criteria andStore_nameIsNotNull() {
            addCriterion("store_name is not null");
            return (Criteria) this;
        }

        public Criteria andStore_nameEqualTo(String value) {
            addCriterion("store_name =", value, "store_name");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:13 CST 2020
         */
        public Criteria andStore_nameEqualToColumn(Store.Column column) {
            addCriterion(new StringBuilder("store_name = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStore_nameNotEqualTo(String value) {
            addCriterion("store_name <>", value, "store_name");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:13 CST 2020
         */
        public Criteria andStore_nameNotEqualToColumn(Store.Column column) {
            addCriterion(new StringBuilder("store_name <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStore_nameGreaterThan(String value) {
            addCriterion("store_name >", value, "store_name");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:13 CST 2020
         */
        public Criteria andStore_nameGreaterThanColumn(Store.Column column) {
            addCriterion(new StringBuilder("store_name > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStore_nameGreaterThanOrEqualTo(String value) {
            addCriterion("store_name >=", value, "store_name");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:13 CST 2020
         */
        public Criteria andStore_nameGreaterThanOrEqualToColumn(Store.Column column) {
            addCriterion(new StringBuilder("store_name >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStore_nameLessThan(String value) {
            addCriterion("store_name <", value, "store_name");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:13 CST 2020
         */
        public Criteria andStore_nameLessThanColumn(Store.Column column) {
            addCriterion(new StringBuilder("store_name < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStore_nameLessThanOrEqualTo(String value) {
            addCriterion("store_name <=", value, "store_name");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:13 CST 2020
         */
        public Criteria andStore_nameLessThanOrEqualToColumn(Store.Column column) {
            addCriterion(new StringBuilder("store_name <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStore_nameLike(String value) {
            addCriterion("store_name like", value, "store_name");
            return (Criteria) this;
        }

        public Criteria andStore_nameNotLike(String value) {
            addCriterion("store_name not like", value, "store_name");
            return (Criteria) this;
        }

        public Criteria andStore_nameIn(List<String> values) {
            addCriterion("store_name in", values, "store_name");
            return (Criteria) this;
        }

        public Criteria andStore_nameNotIn(List<String> values) {
            addCriterion("store_name not in", values, "store_name");
            return (Criteria) this;
        }

        public Criteria andStore_nameBetween(String value1, String value2) {
            addCriterion("store_name between", value1, value2, "store_name");
            return (Criteria) this;
        }

        public Criteria andStore_nameNotBetween(String value1, String value2) {
            addCriterion("store_name not between", value1, value2, "store_name");
            return (Criteria) this;
        }

        public Criteria andCoverIsNull() {
            addCriterion("cover is null");
            return (Criteria) this;
        }

        public Criteria andCoverIsNotNull() {
            addCriterion("cover is not null");
            return (Criteria) this;
        }

        public Criteria andCoverEqualTo(String value) {
            addCriterion("cover =", value, "cover");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:13 CST 2020
         */
        public Criteria andCoverEqualToColumn(Store.Column column) {
            addCriterion(new StringBuilder("cover = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCoverNotEqualTo(String value) {
            addCriterion("cover <>", value, "cover");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:13 CST 2020
         */
        public Criteria andCoverNotEqualToColumn(Store.Column column) {
            addCriterion(new StringBuilder("cover <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCoverGreaterThan(String value) {
            addCriterion("cover >", value, "cover");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:13 CST 2020
         */
        public Criteria andCoverGreaterThanColumn(Store.Column column) {
            addCriterion(new StringBuilder("cover > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCoverGreaterThanOrEqualTo(String value) {
            addCriterion("cover >=", value, "cover");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:13 CST 2020
         */
        public Criteria andCoverGreaterThanOrEqualToColumn(Store.Column column) {
            addCriterion(new StringBuilder("cover >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCoverLessThan(String value) {
            addCriterion("cover <", value, "cover");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:13 CST 2020
         */
        public Criteria andCoverLessThanColumn(Store.Column column) {
            addCriterion(new StringBuilder("cover < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCoverLessThanOrEqualTo(String value) {
            addCriterion("cover <=", value, "cover");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:13 CST 2020
         */
        public Criteria andCoverLessThanOrEqualToColumn(Store.Column column) {
            addCriterion(new StringBuilder("cover <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCoverLike(String value) {
            addCriterion("cover like", value, "cover");
            return (Criteria) this;
        }

        public Criteria andCoverNotLike(String value) {
            addCriterion("cover not like", value, "cover");
            return (Criteria) this;
        }

        public Criteria andCoverIn(List<String> values) {
            addCriterion("cover in", values, "cover");
            return (Criteria) this;
        }

        public Criteria andCoverNotIn(List<String> values) {
            addCriterion("cover not in", values, "cover");
            return (Criteria) this;
        }

        public Criteria andCoverBetween(String value1, String value2) {
            addCriterion("cover between", value1, value2, "cover");
            return (Criteria) this;
        }

        public Criteria andCoverNotBetween(String value1, String value2) {
            addCriterion("cover not between", value1, value2, "cover");
            return (Criteria) this;
        }

        public Criteria andRoleIsNull() {
            addCriterion("role is null");
            return (Criteria) this;
        }

        public Criteria andRoleIsNotNull() {
            addCriterion("role is not null");
            return (Criteria) this;
        }

        public Criteria andRoleEqualTo(Integer value) {
            addCriterion("role =", value, "role");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:13 CST 2020
         */
        public Criteria andRoleEqualToColumn(Store.Column column) {
            addCriterion(new StringBuilder("role = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRoleNotEqualTo(Integer value) {
            addCriterion("role <>", value, "role");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:13 CST 2020
         */
        public Criteria andRoleNotEqualToColumn(Store.Column column) {
            addCriterion(new StringBuilder("role <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRoleGreaterThan(Integer value) {
            addCriterion("role >", value, "role");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:13 CST 2020
         */
        public Criteria andRoleGreaterThanColumn(Store.Column column) {
            addCriterion(new StringBuilder("role > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRoleGreaterThanOrEqualTo(Integer value) {
            addCriterion("role >=", value, "role");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:13 CST 2020
         */
        public Criteria andRoleGreaterThanOrEqualToColumn(Store.Column column) {
            addCriterion(new StringBuilder("role >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRoleLessThan(Integer value) {
            addCriterion("role <", value, "role");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:13 CST 2020
         */
        public Criteria andRoleLessThanColumn(Store.Column column) {
            addCriterion(new StringBuilder("role < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRoleLessThanOrEqualTo(Integer value) {
            addCriterion("role <=", value, "role");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:13 CST 2020
         */
        public Criteria andRoleLessThanOrEqualToColumn(Store.Column column) {
            addCriterion(new StringBuilder("role <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRoleIn(List<Integer> values) {
            addCriterion("role in", values, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotIn(List<Integer> values) {
            addCriterion("role not in", values, "role");
            return (Criteria) this;
        }

        public Criteria andRoleBetween(Integer value1, Integer value2) {
            addCriterion("role between", value1, value2, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotBetween(Integer value1, Integer value2) {
            addCriterion("role not between", value1, value2, "role");
            return (Criteria) this;
        }

        public Criteria andUsernameLikeInsensitive(String value) {
            addCriterion("upper(username) like", value.toUpperCase(), "username");
            return (Criteria) this;
        }

        public Criteria andPasswordLikeInsensitive(String value) {
            addCriterion("upper(password) like", value.toUpperCase(), "password");
            return (Criteria) this;
        }

        public Criteria andPhoneLikeInsensitive(String value) {
            addCriterion("upper(phone) like", value.toUpperCase(), "phone");
            return (Criteria) this;
        }

        public Criteria andRealnameLikeInsensitive(String value) {
            addCriterion("upper(realname) like", value.toUpperCase(), "realname");
            return (Criteria) this;
        }

        public Criteria andId_cardLikeInsensitive(String value) {
            addCriterion("upper(id_card) like", value.toUpperCase(), "id_card");
            return (Criteria) this;
        }

        public Criteria andStore_nameLikeInsensitive(String value) {
            addCriterion("upper(store_name) like", value.toUpperCase(), "store_name");
            return (Criteria) this;
        }

        public Criteria andCoverLikeInsensitive(String value) {
            addCriterion("upper(cover) like", value.toUpperCase(), "cover");
            return (Criteria) this;
        }
    }

    /**
     *
     * @mbg.generated do_not_delete_during_merge Wed Feb 26 16:28:13 CST 2020
     */
    public static class Criteria extends GeneratedCriteria {
        /**
         *
         * @mbg.generated Wed Feb 26 16:28:13 CST 2020
         */
        private StoreExample example;

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:13 CST 2020
         */
        protected Criteria(StoreExample example) {
            super();
            this.example = example;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:13 CST 2020
         */
        public StoreExample example() {
            return this.example;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:13 CST 2020
         */
        public Criteria andIf(boolean ifAdd, ICriteriaAdd add) {
            if (ifAdd) {
                add.add(this);
            }
            return this;
        }

        public interface ICriteriaAdd {
            /**
             *
             * @mbg.generated Wed Feb 26 16:28:13 CST 2020
             */
            Criteria add(Criteria add);
        }
    }

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
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
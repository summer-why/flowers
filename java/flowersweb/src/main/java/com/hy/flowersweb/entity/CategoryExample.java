package com.hy.flowersweb.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CategoryExample {
    /**
     *
     * @mbg.generated Mon Mar 09 22:02:32 CST 2020
     */
    protected String orderByClause;

    /**
     *
     * @mbg.generated Mon Mar 09 22:02:32 CST 2020
     */
    protected boolean distinct;

    /**
     *
     * @mbg.generated Mon Mar 09 22:02:32 CST 2020
     */
    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    /**
     *
     * @mbg.generated Mon Mar 09 22:02:32 CST 2020
     */
    public CategoryExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *
     * @mbg.generated Mon Mar 09 22:02:32 CST 2020
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *
     * @mbg.generated Mon Mar 09 22:02:32 CST 2020
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *
     * @mbg.generated Mon Mar 09 22:02:32 CST 2020
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *
     * @mbg.generated Mon Mar 09 22:02:32 CST 2020
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *
     * @mbg.generated Mon Mar 09 22:02:32 CST 2020
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     *
     * @mbg.generated Mon Mar 09 22:02:32 CST 2020
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     *
     * @mbg.generated Mon Mar 09 22:02:32 CST 2020
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *
     * @mbg.generated Mon Mar 09 22:02:32 CST 2020
     */
    public CategoryExample orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    /**
     *
     * @mbg.generated Mon Mar 09 22:02:32 CST 2020
     */
    public CategoryExample orderBy(String ... orderByClauses) {
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
     * @mbg.generated Mon Mar 09 22:02:32 CST 2020
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
     * @mbg.generated Mon Mar 09 22:02:32 CST 2020
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria(this);
        return criteria;
    }

    /**
     *
     * @mbg.generated Mon Mar 09 22:02:32 CST 2020
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
     * @mbg.generated Mon Mar 09 22:02:32 CST 2020
     */
    public static Criteria newAndCreateCriteria() {
        CategoryExample example = new CategoryExample();
        return example.createCriteria();
    }

    /**
     *
     * @mbg.generated Mon Mar 09 22:02:32 CST 2020
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
         * @mbg.generated Mon Mar 09 22:02:32 CST 2020
         */
        public Criteria andIdEqualToColumn(Category.Column column) {
            addCriterion(new StringBuilder("id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Mon Mar 09 22:02:32 CST 2020
         */
        public Criteria andIdNotEqualToColumn(Category.Column column) {
            addCriterion(new StringBuilder("id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Mon Mar 09 22:02:32 CST 2020
         */
        public Criteria andIdGreaterThanColumn(Category.Column column) {
            addCriterion(new StringBuilder("id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Mon Mar 09 22:02:32 CST 2020
         */
        public Criteria andIdGreaterThanOrEqualToColumn(Category.Column column) {
            addCriterion(new StringBuilder("id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Mon Mar 09 22:02:32 CST 2020
         */
        public Criteria andIdLessThanColumn(Category.Column column) {
            addCriterion(new StringBuilder("id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Mon Mar 09 22:02:32 CST 2020
         */
        public Criteria andIdLessThanOrEqualToColumn(Category.Column column) {
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

        public Criteria andCategory_nameIsNull() {
            addCriterion("category_name is null");
            return (Criteria) this;
        }

        public Criteria andCategory_nameIsNotNull() {
            addCriterion("category_name is not null");
            return (Criteria) this;
        }

        public Criteria andCategory_nameEqualTo(String value) {
            addCriterion("category_name =", value, "category_name");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Mon Mar 09 22:02:32 CST 2020
         */
        public Criteria andCategory_nameEqualToColumn(Category.Column column) {
            addCriterion(new StringBuilder("category_name = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCategory_nameNotEqualTo(String value) {
            addCriterion("category_name <>", value, "category_name");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Mon Mar 09 22:02:32 CST 2020
         */
        public Criteria andCategory_nameNotEqualToColumn(Category.Column column) {
            addCriterion(new StringBuilder("category_name <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCategory_nameGreaterThan(String value) {
            addCriterion("category_name >", value, "category_name");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Mon Mar 09 22:02:32 CST 2020
         */
        public Criteria andCategory_nameGreaterThanColumn(Category.Column column) {
            addCriterion(new StringBuilder("category_name > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCategory_nameGreaterThanOrEqualTo(String value) {
            addCriterion("category_name >=", value, "category_name");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Mon Mar 09 22:02:32 CST 2020
         */
        public Criteria andCategory_nameGreaterThanOrEqualToColumn(Category.Column column) {
            addCriterion(new StringBuilder("category_name >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCategory_nameLessThan(String value) {
            addCriterion("category_name <", value, "category_name");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Mon Mar 09 22:02:32 CST 2020
         */
        public Criteria andCategory_nameLessThanColumn(Category.Column column) {
            addCriterion(new StringBuilder("category_name < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCategory_nameLessThanOrEqualTo(String value) {
            addCriterion("category_name <=", value, "category_name");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Mon Mar 09 22:02:32 CST 2020
         */
        public Criteria andCategory_nameLessThanOrEqualToColumn(Category.Column column) {
            addCriterion(new StringBuilder("category_name <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCategory_nameLike(String value) {
            addCriterion("category_name like", value, "category_name");
            return (Criteria) this;
        }

        public Criteria andCategory_nameNotLike(String value) {
            addCriterion("category_name not like", value, "category_name");
            return (Criteria) this;
        }

        public Criteria andCategory_nameIn(List<String> values) {
            addCriterion("category_name in", values, "category_name");
            return (Criteria) this;
        }

        public Criteria andCategory_nameNotIn(List<String> values) {
            addCriterion("category_name not in", values, "category_name");
            return (Criteria) this;
        }

        public Criteria andCategory_nameBetween(String value1, String value2) {
            addCriterion("category_name between", value1, value2, "category_name");
            return (Criteria) this;
        }

        public Criteria andCategory_nameNotBetween(String value1, String value2) {
            addCriterion("category_name not between", value1, value2, "category_name");
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
         * @mbg.generated Mon Mar 09 22:02:32 CST 2020
         */
        public Criteria andCreate_timeEqualToColumn(Category.Column column) {
            addCriterion(new StringBuilder("create_time = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreate_timeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "create_time");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Mon Mar 09 22:02:32 CST 2020
         */
        public Criteria andCreate_timeNotEqualToColumn(Category.Column column) {
            addCriterion(new StringBuilder("create_time <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreate_timeGreaterThan(Date value) {
            addCriterion("create_time >", value, "create_time");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Mon Mar 09 22:02:32 CST 2020
         */
        public Criteria andCreate_timeGreaterThanColumn(Category.Column column) {
            addCriterion(new StringBuilder("create_time > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreate_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "create_time");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Mon Mar 09 22:02:32 CST 2020
         */
        public Criteria andCreate_timeGreaterThanOrEqualToColumn(Category.Column column) {
            addCriterion(new StringBuilder("create_time >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreate_timeLessThan(Date value) {
            addCriterion("create_time <", value, "create_time");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Mon Mar 09 22:02:32 CST 2020
         */
        public Criteria andCreate_timeLessThanColumn(Category.Column column) {
            addCriterion(new StringBuilder("create_time < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreate_timeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "create_time");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Mon Mar 09 22:02:32 CST 2020
         */
        public Criteria andCreate_timeLessThanOrEqualToColumn(Category.Column column) {
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
         * @mbg.generated Mon Mar 09 22:02:32 CST 2020
         */
        public Criteria andUpdate_timeEqualToColumn(Category.Column column) {
            addCriterion(new StringBuilder("update_time = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdate_timeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "update_time");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Mon Mar 09 22:02:32 CST 2020
         */
        public Criteria andUpdate_timeNotEqualToColumn(Category.Column column) {
            addCriterion(new StringBuilder("update_time <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdate_timeGreaterThan(Date value) {
            addCriterion("update_time >", value, "update_time");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Mon Mar 09 22:02:32 CST 2020
         */
        public Criteria andUpdate_timeGreaterThanColumn(Category.Column column) {
            addCriterion(new StringBuilder("update_time > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdate_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "update_time");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Mon Mar 09 22:02:32 CST 2020
         */
        public Criteria andUpdate_timeGreaterThanOrEqualToColumn(Category.Column column) {
            addCriterion(new StringBuilder("update_time >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdate_timeLessThan(Date value) {
            addCriterion("update_time <", value, "update_time");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Mon Mar 09 22:02:32 CST 2020
         */
        public Criteria andUpdate_timeLessThanColumn(Category.Column column) {
            addCriterion(new StringBuilder("update_time < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdate_timeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "update_time");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Mon Mar 09 22:02:32 CST 2020
         */
        public Criteria andUpdate_timeLessThanOrEqualToColumn(Category.Column column) {
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

        public Criteria andStore_idIsNull() {
            addCriterion("store_id is null");
            return (Criteria) this;
        }

        public Criteria andStore_idIsNotNull() {
            addCriterion("store_id is not null");
            return (Criteria) this;
        }

        public Criteria andStore_idEqualTo(Integer value) {
            addCriterion("store_id =", value, "store_id");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Mon Mar 09 22:02:32 CST 2020
         */
        public Criteria andStore_idEqualToColumn(Category.Column column) {
            addCriterion(new StringBuilder("store_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStore_idNotEqualTo(Integer value) {
            addCriterion("store_id <>", value, "store_id");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Mon Mar 09 22:02:32 CST 2020
         */
        public Criteria andStore_idNotEqualToColumn(Category.Column column) {
            addCriterion(new StringBuilder("store_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStore_idGreaterThan(Integer value) {
            addCriterion("store_id >", value, "store_id");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Mon Mar 09 22:02:32 CST 2020
         */
        public Criteria andStore_idGreaterThanColumn(Category.Column column) {
            addCriterion(new StringBuilder("store_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStore_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("store_id >=", value, "store_id");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Mon Mar 09 22:02:32 CST 2020
         */
        public Criteria andStore_idGreaterThanOrEqualToColumn(Category.Column column) {
            addCriterion(new StringBuilder("store_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStore_idLessThan(Integer value) {
            addCriterion("store_id <", value, "store_id");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Mon Mar 09 22:02:32 CST 2020
         */
        public Criteria andStore_idLessThanColumn(Category.Column column) {
            addCriterion(new StringBuilder("store_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStore_idLessThanOrEqualTo(Integer value) {
            addCriterion("store_id <=", value, "store_id");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Mon Mar 09 22:02:32 CST 2020
         */
        public Criteria andStore_idLessThanOrEqualToColumn(Category.Column column) {
            addCriterion(new StringBuilder("store_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStore_idIn(List<Integer> values) {
            addCriterion("store_id in", values, "store_id");
            return (Criteria) this;
        }

        public Criteria andStore_idNotIn(List<Integer> values) {
            addCriterion("store_id not in", values, "store_id");
            return (Criteria) this;
        }

        public Criteria andStore_idBetween(Integer value1, Integer value2) {
            addCriterion("store_id between", value1, value2, "store_id");
            return (Criteria) this;
        }

        public Criteria andStore_idNotBetween(Integer value1, Integer value2) {
            addCriterion("store_id not between", value1, value2, "store_id");
            return (Criteria) this;
        }

        public Criteria andCategory_nameLikeInsensitive(String value) {
            addCriterion("upper(category_name) like", value.toUpperCase(), "category_name");
            return (Criteria) this;
        }
    }

    /**
     *
     * @mbg.generated do_not_delete_during_merge Mon Mar 09 22:02:32 CST 2020
     */
    public static class Criteria extends GeneratedCriteria {
        /**
         *
         * @mbg.generated Mon Mar 09 22:02:32 CST 2020
         */
        private CategoryExample example;

        /**
         *
         * @mbg.generated Mon Mar 09 22:02:32 CST 2020
         */
        protected Criteria(CategoryExample example) {
            super();
            this.example = example;
        }

        /**
         *
         * @mbg.generated Mon Mar 09 22:02:32 CST 2020
         */
        public CategoryExample example() {
            return this.example;
        }

        /**
         *
         * @mbg.generated Mon Mar 09 22:02:32 CST 2020
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
             * @mbg.generated Mon Mar 09 22:02:32 CST 2020
             */
            Criteria add(Criteria add);
        }
    }

    /**
     *
     * @mbg.generated Mon Mar 09 22:02:32 CST 2020
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
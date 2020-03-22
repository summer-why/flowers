package com.hy.flowersweb.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CommentExample {
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
    public CommentExample() {
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
    public CommentExample orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    public CommentExample orderBy(String ... orderByClauses) {
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
        CommentExample example = new CommentExample();
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
        public Criteria andIdEqualToColumn(Comment.Column column) {
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
        public Criteria andIdNotEqualToColumn(Comment.Column column) {
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
        public Criteria andIdGreaterThanColumn(Comment.Column column) {
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
        public Criteria andIdGreaterThanOrEqualToColumn(Comment.Column column) {
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
        public Criteria andIdLessThanColumn(Comment.Column column) {
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
        public Criteria andIdLessThanOrEqualToColumn(Comment.Column column) {
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

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:13 CST 2020
         */
        public Criteria andContentEqualToColumn(Comment.Column column) {
            addCriterion(new StringBuilder("content = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:13 CST 2020
         */
        public Criteria andContentNotEqualToColumn(Comment.Column column) {
            addCriterion(new StringBuilder("content <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:13 CST 2020
         */
        public Criteria andContentGreaterThanColumn(Comment.Column column) {
            addCriterion(new StringBuilder("content > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:13 CST 2020
         */
        public Criteria andContentGreaterThanOrEqualToColumn(Comment.Column column) {
            addCriterion(new StringBuilder("content >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:13 CST 2020
         */
        public Criteria andContentLessThanColumn(Comment.Column column) {
            addCriterion(new StringBuilder("content < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:13 CST 2020
         */
        public Criteria andContentLessThanOrEqualToColumn(Comment.Column column) {
            addCriterion(new StringBuilder("content <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
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
        public Criteria andCreate_timeEqualToColumn(Comment.Column column) {
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
        public Criteria andCreate_timeNotEqualToColumn(Comment.Column column) {
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
        public Criteria andCreate_timeGreaterThanColumn(Comment.Column column) {
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
        public Criteria andCreate_timeGreaterThanOrEqualToColumn(Comment.Column column) {
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
        public Criteria andCreate_timeLessThanColumn(Comment.Column column) {
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
        public Criteria andCreate_timeLessThanOrEqualToColumn(Comment.Column column) {
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
        public Criteria andUpdate_timeEqualToColumn(Comment.Column column) {
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
        public Criteria andUpdate_timeNotEqualToColumn(Comment.Column column) {
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
        public Criteria andUpdate_timeGreaterThanColumn(Comment.Column column) {
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
        public Criteria andUpdate_timeGreaterThanOrEqualToColumn(Comment.Column column) {
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
        public Criteria andUpdate_timeLessThanColumn(Comment.Column column) {
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
        public Criteria andUpdate_timeLessThanOrEqualToColumn(Comment.Column column) {
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

        public Criteria andFlower_idIsNull() {
            addCriterion("flower_id is null");
            return (Criteria) this;
        }

        public Criteria andFlower_idIsNotNull() {
            addCriterion("flower_id is not null");
            return (Criteria) this;
        }

        public Criteria andFlower_idEqualTo(Integer value) {
            addCriterion("flower_id =", value, "flower_id");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:13 CST 2020
         */
        public Criteria andFlower_idEqualToColumn(Comment.Column column) {
            addCriterion(new StringBuilder("flower_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFlower_idNotEqualTo(Integer value) {
            addCriterion("flower_id <>", value, "flower_id");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:13 CST 2020
         */
        public Criteria andFlower_idNotEqualToColumn(Comment.Column column) {
            addCriterion(new StringBuilder("flower_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFlower_idGreaterThan(Integer value) {
            addCriterion("flower_id >", value, "flower_id");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:13 CST 2020
         */
        public Criteria andFlower_idGreaterThanColumn(Comment.Column column) {
            addCriterion(new StringBuilder("flower_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFlower_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("flower_id >=", value, "flower_id");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:13 CST 2020
         */
        public Criteria andFlower_idGreaterThanOrEqualToColumn(Comment.Column column) {
            addCriterion(new StringBuilder("flower_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFlower_idLessThan(Integer value) {
            addCriterion("flower_id <", value, "flower_id");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:13 CST 2020
         */
        public Criteria andFlower_idLessThanColumn(Comment.Column column) {
            addCriterion(new StringBuilder("flower_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFlower_idLessThanOrEqualTo(Integer value) {
            addCriterion("flower_id <=", value, "flower_id");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:13 CST 2020
         */
        public Criteria andFlower_idLessThanOrEqualToColumn(Comment.Column column) {
            addCriterion(new StringBuilder("flower_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFlower_idIn(List<Integer> values) {
            addCriterion("flower_id in", values, "flower_id");
            return (Criteria) this;
        }

        public Criteria andFlower_idNotIn(List<Integer> values) {
            addCriterion("flower_id not in", values, "flower_id");
            return (Criteria) this;
        }

        public Criteria andFlower_idBetween(Integer value1, Integer value2) {
            addCriterion("flower_id between", value1, value2, "flower_id");
            return (Criteria) this;
        }

        public Criteria andFlower_idNotBetween(Integer value1, Integer value2) {
            addCriterion("flower_id not between", value1, value2, "flower_id");
            return (Criteria) this;
        }

        public Criteria andUser_idIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUser_idIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUser_idEqualTo(Integer value) {
            addCriterion("user_id =", value, "user_id");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:13 CST 2020
         */
        public Criteria andUser_idEqualToColumn(Comment.Column column) {
            addCriterion(new StringBuilder("user_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUser_idNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "user_id");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:13 CST 2020
         */
        public Criteria andUser_idNotEqualToColumn(Comment.Column column) {
            addCriterion(new StringBuilder("user_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUser_idGreaterThan(Integer value) {
            addCriterion("user_id >", value, "user_id");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:13 CST 2020
         */
        public Criteria andUser_idGreaterThanColumn(Comment.Column column) {
            addCriterion(new StringBuilder("user_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUser_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "user_id");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:13 CST 2020
         */
        public Criteria andUser_idGreaterThanOrEqualToColumn(Comment.Column column) {
            addCriterion(new StringBuilder("user_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUser_idLessThan(Integer value) {
            addCriterion("user_id <", value, "user_id");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:13 CST 2020
         */
        public Criteria andUser_idLessThanColumn(Comment.Column column) {
            addCriterion(new StringBuilder("user_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUser_idLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "user_id");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:13 CST 2020
         */
        public Criteria andUser_idLessThanOrEqualToColumn(Comment.Column column) {
            addCriterion(new StringBuilder("user_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUser_idIn(List<Integer> values) {
            addCriterion("user_id in", values, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "user_id");
            return (Criteria) this;
        }

        public Criteria andContentLikeInsensitive(String value) {
            addCriterion("upper(content) like", value.toUpperCase(), "content");
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
        private CommentExample example;

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:13 CST 2020
         */
        protected Criteria(CommentExample example) {
            super();
            this.example = example;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:13 CST 2020
         */
        public CommentExample example() {
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
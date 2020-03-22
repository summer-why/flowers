package com.hy.flowersweb.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrdersExample {
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
    public OrdersExample() {
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
    public OrdersExample orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    public OrdersExample orderBy(String ... orderByClauses) {
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
        OrdersExample example = new OrdersExample();
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

        public Criteria andOrder_numberIsNull() {
            addCriterion("order_number is null");
            return (Criteria) this;
        }

        public Criteria andOrder_numberIsNotNull() {
            addCriterion("order_number is not null");
            return (Criteria) this;
        }

        public Criteria andOrder_numberEqualTo(Integer value) {
            addCriterion("order_number =", value, "order_number");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:13 CST 2020
         */
        public Criteria andOrder_numberEqualToColumn(Orders.Column column) {
            addCriterion(new StringBuilder("order_number = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOrder_numberNotEqualTo(Integer value) {
            addCriterion("order_number <>", value, "order_number");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:13 CST 2020
         */
        public Criteria andOrder_numberNotEqualToColumn(Orders.Column column) {
            addCriterion(new StringBuilder("order_number <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOrder_numberGreaterThan(Integer value) {
            addCriterion("order_number >", value, "order_number");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:13 CST 2020
         */
        public Criteria andOrder_numberGreaterThanColumn(Orders.Column column) {
            addCriterion(new StringBuilder("order_number > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOrder_numberGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_number >=", value, "order_number");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:13 CST 2020
         */
        public Criteria andOrder_numberGreaterThanOrEqualToColumn(Orders.Column column) {
            addCriterion(new StringBuilder("order_number >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOrder_numberLessThan(Integer value) {
            addCriterion("order_number <", value, "order_number");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:13 CST 2020
         */
        public Criteria andOrder_numberLessThanColumn(Orders.Column column) {
            addCriterion(new StringBuilder("order_number < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOrder_numberLessThanOrEqualTo(Integer value) {
            addCriterion("order_number <=", value, "order_number");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:13 CST 2020
         */
        public Criteria andOrder_numberLessThanOrEqualToColumn(Orders.Column column) {
            addCriterion(new StringBuilder("order_number <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOrder_numberIn(List<Integer> values) {
            addCriterion("order_number in", values, "order_number");
            return (Criteria) this;
        }

        public Criteria andOrder_numberNotIn(List<Integer> values) {
            addCriterion("order_number not in", values, "order_number");
            return (Criteria) this;
        }

        public Criteria andOrder_numberBetween(Integer value1, Integer value2) {
            addCriterion("order_number between", value1, value2, "order_number");
            return (Criteria) this;
        }

        public Criteria andOrder_numberNotBetween(Integer value1, Integer value2) {
            addCriterion("order_number not between", value1, value2, "order_number");
            return (Criteria) this;
        }

        public Criteria andNumberIsNull() {
            addCriterion("number is null");
            return (Criteria) this;
        }

        public Criteria andNumberIsNotNull() {
            addCriterion("number is not null");
            return (Criteria) this;
        }

        public Criteria andNumberEqualTo(Integer value) {
            addCriterion("number =", value, "number");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:13 CST 2020
         */
        public Criteria andNumberEqualToColumn(Orders.Column column) {
            addCriterion(new StringBuilder("number = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNumberNotEqualTo(Integer value) {
            addCriterion("number <>", value, "number");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:13 CST 2020
         */
        public Criteria andNumberNotEqualToColumn(Orders.Column column) {
            addCriterion(new StringBuilder("number <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThan(Integer value) {
            addCriterion("number >", value, "number");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:13 CST 2020
         */
        public Criteria andNumberGreaterThanColumn(Orders.Column column) {
            addCriterion(new StringBuilder("number > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("number >=", value, "number");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:13 CST 2020
         */
        public Criteria andNumberGreaterThanOrEqualToColumn(Orders.Column column) {
            addCriterion(new StringBuilder("number >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNumberLessThan(Integer value) {
            addCriterion("number <", value, "number");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:13 CST 2020
         */
        public Criteria andNumberLessThanColumn(Orders.Column column) {
            addCriterion(new StringBuilder("number < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNumberLessThanOrEqualTo(Integer value) {
            addCriterion("number <=", value, "number");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:13 CST 2020
         */
        public Criteria andNumberLessThanOrEqualToColumn(Orders.Column column) {
            addCriterion(new StringBuilder("number <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNumberIn(List<Integer> values) {
            addCriterion("number in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotIn(List<Integer> values) {
            addCriterion("number not in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberBetween(Integer value1, Integer value2) {
            addCriterion("number between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("number not between", value1, value2, "number");
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
        public Criteria andCreate_timeEqualToColumn(Orders.Column column) {
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
        public Criteria andCreate_timeNotEqualToColumn(Orders.Column column) {
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
        public Criteria andCreate_timeGreaterThanColumn(Orders.Column column) {
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
        public Criteria andCreate_timeGreaterThanOrEqualToColumn(Orders.Column column) {
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
        public Criteria andCreate_timeLessThanColumn(Orders.Column column) {
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
        public Criteria andCreate_timeLessThanOrEqualToColumn(Orders.Column column) {
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
        public Criteria andUpdate_timeEqualToColumn(Orders.Column column) {
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
        public Criteria andUpdate_timeNotEqualToColumn(Orders.Column column) {
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
        public Criteria andUpdate_timeGreaterThanColumn(Orders.Column column) {
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
        public Criteria andUpdate_timeGreaterThanOrEqualToColumn(Orders.Column column) {
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
        public Criteria andUpdate_timeLessThanColumn(Orders.Column column) {
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
        public Criteria andUpdate_timeLessThanOrEqualToColumn(Orders.Column column) {
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

        public Criteria andSum_priceIsNull() {
            addCriterion("sum_price is null");
            return (Criteria) this;
        }

        public Criteria andSum_priceIsNotNull() {
            addCriterion("sum_price is not null");
            return (Criteria) this;
        }

        public Criteria andSum_priceEqualTo(Double value) {
            addCriterion("sum_price =", value, "sum_price");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:13 CST 2020
         */
        public Criteria andSum_priceEqualToColumn(Orders.Column column) {
            addCriterion(new StringBuilder("sum_price = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSum_priceNotEqualTo(Double value) {
            addCriterion("sum_price <>", value, "sum_price");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:13 CST 2020
         */
        public Criteria andSum_priceNotEqualToColumn(Orders.Column column) {
            addCriterion(new StringBuilder("sum_price <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSum_priceGreaterThan(Double value) {
            addCriterion("sum_price >", value, "sum_price");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:13 CST 2020
         */
        public Criteria andSum_priceGreaterThanColumn(Orders.Column column) {
            addCriterion(new StringBuilder("sum_price > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSum_priceGreaterThanOrEqualTo(Double value) {
            addCriterion("sum_price >=", value, "sum_price");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:13 CST 2020
         */
        public Criteria andSum_priceGreaterThanOrEqualToColumn(Orders.Column column) {
            addCriterion(new StringBuilder("sum_price >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSum_priceLessThan(Double value) {
            addCriterion("sum_price <", value, "sum_price");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:13 CST 2020
         */
        public Criteria andSum_priceLessThanColumn(Orders.Column column) {
            addCriterion(new StringBuilder("sum_price < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSum_priceLessThanOrEqualTo(Double value) {
            addCriterion("sum_price <=", value, "sum_price");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:13 CST 2020
         */
        public Criteria andSum_priceLessThanOrEqualToColumn(Orders.Column column) {
            addCriterion(new StringBuilder("sum_price <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSum_priceIn(List<Double> values) {
            addCriterion("sum_price in", values, "sum_price");
            return (Criteria) this;
        }

        public Criteria andSum_priceNotIn(List<Double> values) {
            addCriterion("sum_price not in", values, "sum_price");
            return (Criteria) this;
        }

        public Criteria andSum_priceBetween(Double value1, Double value2) {
            addCriterion("sum_price between", value1, value2, "sum_price");
            return (Criteria) this;
        }

        public Criteria andSum_priceNotBetween(Double value1, Double value2) {
            addCriterion("sum_price not between", value1, value2, "sum_price");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:13 CST 2020
         */
        public Criteria andStatusEqualToColumn(Orders.Column column) {
            addCriterion(new StringBuilder("status = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:13 CST 2020
         */
        public Criteria andStatusNotEqualToColumn(Orders.Column column) {
            addCriterion(new StringBuilder("status <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:13 CST 2020
         */
        public Criteria andStatusGreaterThanColumn(Orders.Column column) {
            addCriterion(new StringBuilder("status > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:13 CST 2020
         */
        public Criteria andStatusGreaterThanOrEqualToColumn(Orders.Column column) {
            addCriterion(new StringBuilder("status >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:13 CST 2020
         */
        public Criteria andStatusLessThanColumn(Orders.Column column) {
            addCriterion(new StringBuilder("status < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:13 CST 2020
         */
        public Criteria andStatusLessThanOrEqualToColumn(Orders.Column column) {
            addCriterion(new StringBuilder("status <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
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
        public Criteria andUser_idEqualToColumn(Orders.Column column) {
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
        public Criteria andUser_idNotEqualToColumn(Orders.Column column) {
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
        public Criteria andUser_idGreaterThanColumn(Orders.Column column) {
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
        public Criteria andUser_idGreaterThanOrEqualToColumn(Orders.Column column) {
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
        public Criteria andUser_idLessThanColumn(Orders.Column column) {
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
        public Criteria andUser_idLessThanOrEqualToColumn(Orders.Column column) {
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
        public Criteria andFlower_idEqualToColumn(Orders.Column column) {
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
        public Criteria andFlower_idNotEqualToColumn(Orders.Column column) {
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
        public Criteria andFlower_idGreaterThanColumn(Orders.Column column) {
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
        public Criteria andFlower_idGreaterThanOrEqualToColumn(Orders.Column column) {
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
        public Criteria andFlower_idLessThanColumn(Orders.Column column) {
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
        public Criteria andFlower_idLessThanOrEqualToColumn(Orders.Column column) {
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

        public Criteria andAddress_idIsNull() {
            addCriterion("address_id is null");
            return (Criteria) this;
        }

        public Criteria andAddress_idIsNotNull() {
            addCriterion("address_id is not null");
            return (Criteria) this;
        }

        public Criteria andAddress_idEqualTo(Integer value) {
            addCriterion("address_id =", value, "address_id");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:13 CST 2020
         */
        public Criteria andAddress_idEqualToColumn(Orders.Column column) {
            addCriterion(new StringBuilder("address_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAddress_idNotEqualTo(Integer value) {
            addCriterion("address_id <>", value, "address_id");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:13 CST 2020
         */
        public Criteria andAddress_idNotEqualToColumn(Orders.Column column) {
            addCriterion(new StringBuilder("address_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAddress_idGreaterThan(Integer value) {
            addCriterion("address_id >", value, "address_id");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:13 CST 2020
         */
        public Criteria andAddress_idGreaterThanColumn(Orders.Column column) {
            addCriterion(new StringBuilder("address_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAddress_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("address_id >=", value, "address_id");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:13 CST 2020
         */
        public Criteria andAddress_idGreaterThanOrEqualToColumn(Orders.Column column) {
            addCriterion(new StringBuilder("address_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAddress_idLessThan(Integer value) {
            addCriterion("address_id <", value, "address_id");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:13 CST 2020
         */
        public Criteria andAddress_idLessThanColumn(Orders.Column column) {
            addCriterion(new StringBuilder("address_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAddress_idLessThanOrEqualTo(Integer value) {
            addCriterion("address_id <=", value, "address_id");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:13 CST 2020
         */
        public Criteria andAddress_idLessThanOrEqualToColumn(Orders.Column column) {
            addCriterion(new StringBuilder("address_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAddress_idIn(List<Integer> values) {
            addCriterion("address_id in", values, "address_id");
            return (Criteria) this;
        }

        public Criteria andAddress_idNotIn(List<Integer> values) {
            addCriterion("address_id not in", values, "address_id");
            return (Criteria) this;
        }

        public Criteria andAddress_idBetween(Integer value1, Integer value2) {
            addCriterion("address_id between", value1, value2, "address_id");
            return (Criteria) this;
        }

        public Criteria andAddress_idNotBetween(Integer value1, Integer value2) {
            addCriterion("address_id not between", value1, value2, "address_id");
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
        private OrdersExample example;

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:13 CST 2020
         */
        protected Criteria(OrdersExample example) {
            super();
            this.example = example;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:13 CST 2020
         */
        public OrdersExample example() {
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
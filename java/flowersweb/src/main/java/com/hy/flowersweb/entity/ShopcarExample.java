package com.hy.flowersweb.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ShopcarExample {
    /**
     *
     * @mbg.generated Tue Mar 17 11:17:11 CST 2020
     */
    protected String orderByClause;

    /**
     *
     * @mbg.generated Tue Mar 17 11:17:11 CST 2020
     */
    protected boolean distinct;

    /**
     *
     * @mbg.generated Tue Mar 17 11:17:11 CST 2020
     */
    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    /**
     *
     * @mbg.generated Tue Mar 17 11:17:11 CST 2020
     */
    public ShopcarExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *
     * @mbg.generated Tue Mar 17 11:17:11 CST 2020
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *
     * @mbg.generated Tue Mar 17 11:17:11 CST 2020
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *
     * @mbg.generated Tue Mar 17 11:17:11 CST 2020
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *
     * @mbg.generated Tue Mar 17 11:17:11 CST 2020
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *
     * @mbg.generated Tue Mar 17 11:17:11 CST 2020
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     *
     * @mbg.generated Tue Mar 17 11:17:11 CST 2020
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     *
     * @mbg.generated Tue Mar 17 11:17:11 CST 2020
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *
     * @mbg.generated Tue Mar 17 11:17:11 CST 2020
     */
    public ShopcarExample orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    /**
     *
     * @mbg.generated Tue Mar 17 11:17:11 CST 2020
     */
    public ShopcarExample orderBy(String ... orderByClauses) {
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
     * @mbg.generated Tue Mar 17 11:17:11 CST 2020
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
     * @mbg.generated Tue Mar 17 11:17:11 CST 2020
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria(this);
        return criteria;
    }

    /**
     *
     * @mbg.generated Tue Mar 17 11:17:11 CST 2020
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
     * @mbg.generated Tue Mar 17 11:17:11 CST 2020
     */
    public static Criteria newAndCreateCriteria() {
        ShopcarExample example = new ShopcarExample();
        return example.createCriteria();
    }

    /**
     *
     * @mbg.generated Tue Mar 17 11:17:11 CST 2020
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
         * @mbg.generated Tue Mar 17 11:17:11 CST 2020
         */
        public Criteria andIdEqualToColumn(Shopcar.Column column) {
            addCriterion(new StringBuilder("id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Tue Mar 17 11:17:11 CST 2020
         */
        public Criteria andIdNotEqualToColumn(Shopcar.Column column) {
            addCriterion(new StringBuilder("id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Tue Mar 17 11:17:11 CST 2020
         */
        public Criteria andIdGreaterThanColumn(Shopcar.Column column) {
            addCriterion(new StringBuilder("id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Tue Mar 17 11:17:11 CST 2020
         */
        public Criteria andIdGreaterThanOrEqualToColumn(Shopcar.Column column) {
            addCriterion(new StringBuilder("id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Tue Mar 17 11:17:11 CST 2020
         */
        public Criteria andIdLessThanColumn(Shopcar.Column column) {
            addCriterion(new StringBuilder("id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Tue Mar 17 11:17:11 CST 2020
         */
        public Criteria andIdLessThanOrEqualToColumn(Shopcar.Column column) {
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

        public Criteria andCountIsNull() {
            addCriterion("count is null");
            return (Criteria) this;
        }

        public Criteria andCountIsNotNull() {
            addCriterion("count is not null");
            return (Criteria) this;
        }

        public Criteria andCountEqualTo(Integer value) {
            addCriterion("count =", value, "count");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Tue Mar 17 11:17:11 CST 2020
         */
        public Criteria andCountEqualToColumn(Shopcar.Column column) {
            addCriterion(new StringBuilder("count = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCountNotEqualTo(Integer value) {
            addCriterion("count <>", value, "count");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Tue Mar 17 11:17:11 CST 2020
         */
        public Criteria andCountNotEqualToColumn(Shopcar.Column column) {
            addCriterion(new StringBuilder("count <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCountGreaterThan(Integer value) {
            addCriterion("count >", value, "count");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Tue Mar 17 11:17:11 CST 2020
         */
        public Criteria andCountGreaterThanColumn(Shopcar.Column column) {
            addCriterion(new StringBuilder("count > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("count >=", value, "count");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Tue Mar 17 11:17:11 CST 2020
         */
        public Criteria andCountGreaterThanOrEqualToColumn(Shopcar.Column column) {
            addCriterion(new StringBuilder("count >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCountLessThan(Integer value) {
            addCriterion("count <", value, "count");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Tue Mar 17 11:17:11 CST 2020
         */
        public Criteria andCountLessThanColumn(Shopcar.Column column) {
            addCriterion(new StringBuilder("count < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCountLessThanOrEqualTo(Integer value) {
            addCriterion("count <=", value, "count");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Tue Mar 17 11:17:11 CST 2020
         */
        public Criteria andCountLessThanOrEqualToColumn(Shopcar.Column column) {
            addCriterion(new StringBuilder("count <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCountIn(List<Integer> values) {
            addCriterion("count in", values, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotIn(List<Integer> values) {
            addCriterion("count not in", values, "count");
            return (Criteria) this;
        }

        public Criteria andCountBetween(Integer value1, Integer value2) {
            addCriterion("count between", value1, value2, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotBetween(Integer value1, Integer value2) {
            addCriterion("count not between", value1, value2, "count");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Double value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Tue Mar 17 11:17:11 CST 2020
         */
        public Criteria andPriceEqualToColumn(Shopcar.Column column) {
            addCriterion(new StringBuilder("price = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Double value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Tue Mar 17 11:17:11 CST 2020
         */
        public Criteria andPriceNotEqualToColumn(Shopcar.Column column) {
            addCriterion(new StringBuilder("price <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Double value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Tue Mar 17 11:17:11 CST 2020
         */
        public Criteria andPriceGreaterThanColumn(Shopcar.Column column) {
            addCriterion(new StringBuilder("price > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Tue Mar 17 11:17:11 CST 2020
         */
        public Criteria andPriceGreaterThanOrEqualToColumn(Shopcar.Column column) {
            addCriterion(new StringBuilder("price >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Double value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Tue Mar 17 11:17:11 CST 2020
         */
        public Criteria andPriceLessThanColumn(Shopcar.Column column) {
            addCriterion(new StringBuilder("price < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Double value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Tue Mar 17 11:17:11 CST 2020
         */
        public Criteria andPriceLessThanOrEqualToColumn(Shopcar.Column column) {
            addCriterion(new StringBuilder("price <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Double> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Double> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Double value1, Double value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Double value1, Double value2) {
            addCriterion("price not between", value1, value2, "price");
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
         * @mbg.generated Tue Mar 17 11:17:11 CST 2020
         */
        public Criteria andSum_priceEqualToColumn(Shopcar.Column column) {
            addCriterion(new StringBuilder("sum_price = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSum_priceNotEqualTo(Double value) {
            addCriterion("sum_price <>", value, "sum_price");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Tue Mar 17 11:17:11 CST 2020
         */
        public Criteria andSum_priceNotEqualToColumn(Shopcar.Column column) {
            addCriterion(new StringBuilder("sum_price <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSum_priceGreaterThan(Double value) {
            addCriterion("sum_price >", value, "sum_price");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Tue Mar 17 11:17:11 CST 2020
         */
        public Criteria andSum_priceGreaterThanColumn(Shopcar.Column column) {
            addCriterion(new StringBuilder("sum_price > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSum_priceGreaterThanOrEqualTo(Double value) {
            addCriterion("sum_price >=", value, "sum_price");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Tue Mar 17 11:17:11 CST 2020
         */
        public Criteria andSum_priceGreaterThanOrEqualToColumn(Shopcar.Column column) {
            addCriterion(new StringBuilder("sum_price >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSum_priceLessThan(Double value) {
            addCriterion("sum_price <", value, "sum_price");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Tue Mar 17 11:17:11 CST 2020
         */
        public Criteria andSum_priceLessThanColumn(Shopcar.Column column) {
            addCriterion(new StringBuilder("sum_price < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSum_priceLessThanOrEqualTo(Double value) {
            addCriterion("sum_price <=", value, "sum_price");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Tue Mar 17 11:17:11 CST 2020
         */
        public Criteria andSum_priceLessThanOrEqualToColumn(Shopcar.Column column) {
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

        public Criteria andCheckedIsNull() {
            addCriterion("checked is null");
            return (Criteria) this;
        }

        public Criteria andCheckedIsNotNull() {
            addCriterion("checked is not null");
            return (Criteria) this;
        }

        public Criteria andCheckedEqualTo(Boolean value) {
            addCriterion("checked =", value, "checked");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Tue Mar 17 11:17:11 CST 2020
         */
        public Criteria andCheckedEqualToColumn(Shopcar.Column column) {
            addCriterion(new StringBuilder("checked = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCheckedNotEqualTo(Boolean value) {
            addCriterion("checked <>", value, "checked");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Tue Mar 17 11:17:11 CST 2020
         */
        public Criteria andCheckedNotEqualToColumn(Shopcar.Column column) {
            addCriterion(new StringBuilder("checked <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCheckedGreaterThan(Boolean value) {
            addCriterion("checked >", value, "checked");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Tue Mar 17 11:17:11 CST 2020
         */
        public Criteria andCheckedGreaterThanColumn(Shopcar.Column column) {
            addCriterion(new StringBuilder("checked > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCheckedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("checked >=", value, "checked");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Tue Mar 17 11:17:11 CST 2020
         */
        public Criteria andCheckedGreaterThanOrEqualToColumn(Shopcar.Column column) {
            addCriterion(new StringBuilder("checked >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCheckedLessThan(Boolean value) {
            addCriterion("checked <", value, "checked");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Tue Mar 17 11:17:11 CST 2020
         */
        public Criteria andCheckedLessThanColumn(Shopcar.Column column) {
            addCriterion(new StringBuilder("checked < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCheckedLessThanOrEqualTo(Boolean value) {
            addCriterion("checked <=", value, "checked");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Tue Mar 17 11:17:11 CST 2020
         */
        public Criteria andCheckedLessThanOrEqualToColumn(Shopcar.Column column) {
            addCriterion(new StringBuilder("checked <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCheckedIn(List<Boolean> values) {
            addCriterion("checked in", values, "checked");
            return (Criteria) this;
        }

        public Criteria andCheckedNotIn(List<Boolean> values) {
            addCriterion("checked not in", values, "checked");
            return (Criteria) this;
        }

        public Criteria andCheckedBetween(Boolean value1, Boolean value2) {
            addCriterion("checked between", value1, value2, "checked");
            return (Criteria) this;
        }

        public Criteria andCheckedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("checked not between", value1, value2, "checked");
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
         * @mbg.generated Tue Mar 17 11:17:11 CST 2020
         */
        public Criteria andCreate_timeEqualToColumn(Shopcar.Column column) {
            addCriterion(new StringBuilder("create_time = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreate_timeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "create_time");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Tue Mar 17 11:17:11 CST 2020
         */
        public Criteria andCreate_timeNotEqualToColumn(Shopcar.Column column) {
            addCriterion(new StringBuilder("create_time <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreate_timeGreaterThan(Date value) {
            addCriterion("create_time >", value, "create_time");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Tue Mar 17 11:17:11 CST 2020
         */
        public Criteria andCreate_timeGreaterThanColumn(Shopcar.Column column) {
            addCriterion(new StringBuilder("create_time > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreate_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "create_time");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Tue Mar 17 11:17:11 CST 2020
         */
        public Criteria andCreate_timeGreaterThanOrEqualToColumn(Shopcar.Column column) {
            addCriterion(new StringBuilder("create_time >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreate_timeLessThan(Date value) {
            addCriterion("create_time <", value, "create_time");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Tue Mar 17 11:17:11 CST 2020
         */
        public Criteria andCreate_timeLessThanColumn(Shopcar.Column column) {
            addCriterion(new StringBuilder("create_time < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreate_timeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "create_time");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Tue Mar 17 11:17:11 CST 2020
         */
        public Criteria andCreate_timeLessThanOrEqualToColumn(Shopcar.Column column) {
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
         * @mbg.generated Tue Mar 17 11:17:11 CST 2020
         */
        public Criteria andUser_idEqualToColumn(Shopcar.Column column) {
            addCriterion(new StringBuilder("user_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUser_idNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "user_id");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Tue Mar 17 11:17:11 CST 2020
         */
        public Criteria andUser_idNotEqualToColumn(Shopcar.Column column) {
            addCriterion(new StringBuilder("user_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUser_idGreaterThan(Integer value) {
            addCriterion("user_id >", value, "user_id");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Tue Mar 17 11:17:11 CST 2020
         */
        public Criteria andUser_idGreaterThanColumn(Shopcar.Column column) {
            addCriterion(new StringBuilder("user_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUser_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "user_id");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Tue Mar 17 11:17:11 CST 2020
         */
        public Criteria andUser_idGreaterThanOrEqualToColumn(Shopcar.Column column) {
            addCriterion(new StringBuilder("user_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUser_idLessThan(Integer value) {
            addCriterion("user_id <", value, "user_id");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Tue Mar 17 11:17:11 CST 2020
         */
        public Criteria andUser_idLessThanColumn(Shopcar.Column column) {
            addCriterion(new StringBuilder("user_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUser_idLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "user_id");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Tue Mar 17 11:17:11 CST 2020
         */
        public Criteria andUser_idLessThanOrEqualToColumn(Shopcar.Column column) {
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
         * @mbg.generated Tue Mar 17 11:17:11 CST 2020
         */
        public Criteria andFlower_idEqualToColumn(Shopcar.Column column) {
            addCriterion(new StringBuilder("flower_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFlower_idNotEqualTo(Integer value) {
            addCriterion("flower_id <>", value, "flower_id");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Tue Mar 17 11:17:11 CST 2020
         */
        public Criteria andFlower_idNotEqualToColumn(Shopcar.Column column) {
            addCriterion(new StringBuilder("flower_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFlower_idGreaterThan(Integer value) {
            addCriterion("flower_id >", value, "flower_id");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Tue Mar 17 11:17:11 CST 2020
         */
        public Criteria andFlower_idGreaterThanColumn(Shopcar.Column column) {
            addCriterion(new StringBuilder("flower_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFlower_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("flower_id >=", value, "flower_id");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Tue Mar 17 11:17:11 CST 2020
         */
        public Criteria andFlower_idGreaterThanOrEqualToColumn(Shopcar.Column column) {
            addCriterion(new StringBuilder("flower_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFlower_idLessThan(Integer value) {
            addCriterion("flower_id <", value, "flower_id");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Tue Mar 17 11:17:11 CST 2020
         */
        public Criteria andFlower_idLessThanColumn(Shopcar.Column column) {
            addCriterion(new StringBuilder("flower_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFlower_idLessThanOrEqualTo(Integer value) {
            addCriterion("flower_id <=", value, "flower_id");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Tue Mar 17 11:17:11 CST 2020
         */
        public Criteria andFlower_idLessThanOrEqualToColumn(Shopcar.Column column) {
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
    }

    /**
     *
     * @mbg.generated do_not_delete_during_merge Tue Mar 17 11:17:11 CST 2020
     */
    public static class Criteria extends GeneratedCriteria {
        /**
         *
         * @mbg.generated Tue Mar 17 11:17:11 CST 2020
         */
        private ShopcarExample example;

        /**
         *
         * @mbg.generated Tue Mar 17 11:17:11 CST 2020
         */
        protected Criteria(ShopcarExample example) {
            super();
            this.example = example;
        }

        /**
         *
         * @mbg.generated Tue Mar 17 11:17:11 CST 2020
         */
        public ShopcarExample example() {
            return this.example;
        }

        /**
         *
         * @mbg.generated Tue Mar 17 11:17:11 CST 2020
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
             * @mbg.generated Tue Mar 17 11:17:11 CST 2020
             */
            Criteria add(Criteria add);
        }
    }

    /**
     *
     * @mbg.generated Tue Mar 17 11:17:11 CST 2020
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
package com.hy.flowersweb.entity;

import java.util.ArrayList;
import java.util.List;

public class AddressExample {
    /**
     *
     * @mbg.generated Thu Mar 19 17:39:39 CST 2020
     */
    protected String orderByClause;

    /**
     *
     * @mbg.generated Thu Mar 19 17:39:39 CST 2020
     */
    protected boolean distinct;

    /**
     *
     * @mbg.generated Thu Mar 19 17:39:39 CST 2020
     */
    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    /**
     *
     * @mbg.generated Thu Mar 19 17:39:39 CST 2020
     */
    public AddressExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *
     * @mbg.generated Thu Mar 19 17:39:39 CST 2020
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *
     * @mbg.generated Thu Mar 19 17:39:39 CST 2020
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *
     * @mbg.generated Thu Mar 19 17:39:39 CST 2020
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *
     * @mbg.generated Thu Mar 19 17:39:39 CST 2020
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *
     * @mbg.generated Thu Mar 19 17:39:39 CST 2020
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     *
     * @mbg.generated Thu Mar 19 17:39:39 CST 2020
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     *
     * @mbg.generated Thu Mar 19 17:39:39 CST 2020
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *
     * @mbg.generated Thu Mar 19 17:39:39 CST 2020
     */
    public AddressExample orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    /**
     *
     * @mbg.generated Thu Mar 19 17:39:39 CST 2020
     */
    public AddressExample orderBy(String ... orderByClauses) {
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
     * @mbg.generated Thu Mar 19 17:39:39 CST 2020
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
     * @mbg.generated Thu Mar 19 17:39:39 CST 2020
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria(this);
        return criteria;
    }

    /**
     *
     * @mbg.generated Thu Mar 19 17:39:39 CST 2020
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
     * @mbg.generated Thu Mar 19 17:39:39 CST 2020
     */
    public static Criteria newAndCreateCriteria() {
        AddressExample example = new AddressExample();
        return example.createCriteria();
    }

    /**
     *
     * @mbg.generated Thu Mar 19 17:39:39 CST 2020
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
         * @mbg.generated Thu Mar 19 17:39:39 CST 2020
         */
        public Criteria andIdEqualToColumn(Address.Column column) {
            addCriterion(new StringBuilder("id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Thu Mar 19 17:39:39 CST 2020
         */
        public Criteria andIdNotEqualToColumn(Address.Column column) {
            addCriterion(new StringBuilder("id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Thu Mar 19 17:39:39 CST 2020
         */
        public Criteria andIdGreaterThanColumn(Address.Column column) {
            addCriterion(new StringBuilder("id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Thu Mar 19 17:39:39 CST 2020
         */
        public Criteria andIdGreaterThanOrEqualToColumn(Address.Column column) {
            addCriterion(new StringBuilder("id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Thu Mar 19 17:39:39 CST 2020
         */
        public Criteria andIdLessThanColumn(Address.Column column) {
            addCriterion(new StringBuilder("id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Thu Mar 19 17:39:39 CST 2020
         */
        public Criteria andIdLessThanOrEqualToColumn(Address.Column column) {
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

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Thu Mar 19 17:39:39 CST 2020
         */
        public Criteria andAddressEqualToColumn(Address.Column column) {
            addCriterion(new StringBuilder("address = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Thu Mar 19 17:39:39 CST 2020
         */
        public Criteria andAddressNotEqualToColumn(Address.Column column) {
            addCriterion(new StringBuilder("address <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Thu Mar 19 17:39:39 CST 2020
         */
        public Criteria andAddressGreaterThanColumn(Address.Column column) {
            addCriterion(new StringBuilder("address > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Thu Mar 19 17:39:39 CST 2020
         */
        public Criteria andAddressGreaterThanOrEqualToColumn(Address.Column column) {
            addCriterion(new StringBuilder("address >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Thu Mar 19 17:39:39 CST 2020
         */
        public Criteria andAddressLessThanColumn(Address.Column column) {
            addCriterion(new StringBuilder("address < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Thu Mar 19 17:39:39 CST 2020
         */
        public Criteria andAddressLessThanOrEqualToColumn(Address.Column column) {
            addCriterion(new StringBuilder("address <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddress_detailsIsNull() {
            addCriterion("address_details is null");
            return (Criteria) this;
        }

        public Criteria andAddress_detailsIsNotNull() {
            addCriterion("address_details is not null");
            return (Criteria) this;
        }

        public Criteria andAddress_detailsEqualTo(String value) {
            addCriterion("address_details =", value, "address_details");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Thu Mar 19 17:39:39 CST 2020
         */
        public Criteria andAddress_detailsEqualToColumn(Address.Column column) {
            addCriterion(new StringBuilder("address_details = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAddress_detailsNotEqualTo(String value) {
            addCriterion("address_details <>", value, "address_details");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Thu Mar 19 17:39:39 CST 2020
         */
        public Criteria andAddress_detailsNotEqualToColumn(Address.Column column) {
            addCriterion(new StringBuilder("address_details <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAddress_detailsGreaterThan(String value) {
            addCriterion("address_details >", value, "address_details");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Thu Mar 19 17:39:39 CST 2020
         */
        public Criteria andAddress_detailsGreaterThanColumn(Address.Column column) {
            addCriterion(new StringBuilder("address_details > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAddress_detailsGreaterThanOrEqualTo(String value) {
            addCriterion("address_details >=", value, "address_details");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Thu Mar 19 17:39:39 CST 2020
         */
        public Criteria andAddress_detailsGreaterThanOrEqualToColumn(Address.Column column) {
            addCriterion(new StringBuilder("address_details >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAddress_detailsLessThan(String value) {
            addCriterion("address_details <", value, "address_details");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Thu Mar 19 17:39:39 CST 2020
         */
        public Criteria andAddress_detailsLessThanColumn(Address.Column column) {
            addCriterion(new StringBuilder("address_details < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAddress_detailsLessThanOrEqualTo(String value) {
            addCriterion("address_details <=", value, "address_details");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Thu Mar 19 17:39:39 CST 2020
         */
        public Criteria andAddress_detailsLessThanOrEqualToColumn(Address.Column column) {
            addCriterion(new StringBuilder("address_details <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAddress_detailsLike(String value) {
            addCriterion("address_details like", value, "address_details");
            return (Criteria) this;
        }

        public Criteria andAddress_detailsNotLike(String value) {
            addCriterion("address_details not like", value, "address_details");
            return (Criteria) this;
        }

        public Criteria andAddress_detailsIn(List<String> values) {
            addCriterion("address_details in", values, "address_details");
            return (Criteria) this;
        }

        public Criteria andAddress_detailsNotIn(List<String> values) {
            addCriterion("address_details not in", values, "address_details");
            return (Criteria) this;
        }

        public Criteria andAddress_detailsBetween(String value1, String value2) {
            addCriterion("address_details between", value1, value2, "address_details");
            return (Criteria) this;
        }

        public Criteria andAddress_detailsNotBetween(String value1, String value2) {
            addCriterion("address_details not between", value1, value2, "address_details");
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
         * @mbg.generated Thu Mar 19 17:39:39 CST 2020
         */
        public Criteria andPhoneEqualToColumn(Address.Column column) {
            addCriterion(new StringBuilder("phone = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Thu Mar 19 17:39:39 CST 2020
         */
        public Criteria andPhoneNotEqualToColumn(Address.Column column) {
            addCriterion(new StringBuilder("phone <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Thu Mar 19 17:39:39 CST 2020
         */
        public Criteria andPhoneGreaterThanColumn(Address.Column column) {
            addCriterion(new StringBuilder("phone > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Thu Mar 19 17:39:39 CST 2020
         */
        public Criteria andPhoneGreaterThanOrEqualToColumn(Address.Column column) {
            addCriterion(new StringBuilder("phone >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Thu Mar 19 17:39:39 CST 2020
         */
        public Criteria andPhoneLessThanColumn(Address.Column column) {
            addCriterion(new StringBuilder("phone < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Thu Mar 19 17:39:39 CST 2020
         */
        public Criteria andPhoneLessThanOrEqualToColumn(Address.Column column) {
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

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Thu Mar 19 17:39:39 CST 2020
         */
        public Criteria andNameEqualToColumn(Address.Column column) {
            addCriterion(new StringBuilder("name = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Thu Mar 19 17:39:39 CST 2020
         */
        public Criteria andNameNotEqualToColumn(Address.Column column) {
            addCriterion(new StringBuilder("name <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Thu Mar 19 17:39:39 CST 2020
         */
        public Criteria andNameGreaterThanColumn(Address.Column column) {
            addCriterion(new StringBuilder("name > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Thu Mar 19 17:39:39 CST 2020
         */
        public Criteria andNameGreaterThanOrEqualToColumn(Address.Column column) {
            addCriterion(new StringBuilder("name >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Thu Mar 19 17:39:39 CST 2020
         */
        public Criteria andNameLessThanColumn(Address.Column column) {
            addCriterion(new StringBuilder("name < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Thu Mar 19 17:39:39 CST 2020
         */
        public Criteria andNameLessThanOrEqualToColumn(Address.Column column) {
            addCriterion(new StringBuilder("name <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andPostalCodeIsNull() {
            addCriterion("postalCode is null");
            return (Criteria) this;
        }

        public Criteria andPostalCodeIsNotNull() {
            addCriterion("postalCode is not null");
            return (Criteria) this;
        }

        public Criteria andPostalCodeEqualTo(String value) {
            addCriterion("postalCode =", value, "postalCode");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Thu Mar 19 17:39:39 CST 2020
         */
        public Criteria andPostalCodeEqualToColumn(Address.Column column) {
            addCriterion(new StringBuilder("postalCode = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPostalCodeNotEqualTo(String value) {
            addCriterion("postalCode <>", value, "postalCode");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Thu Mar 19 17:39:39 CST 2020
         */
        public Criteria andPostalCodeNotEqualToColumn(Address.Column column) {
            addCriterion(new StringBuilder("postalCode <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPostalCodeGreaterThan(String value) {
            addCriterion("postalCode >", value, "postalCode");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Thu Mar 19 17:39:39 CST 2020
         */
        public Criteria andPostalCodeGreaterThanColumn(Address.Column column) {
            addCriterion(new StringBuilder("postalCode > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPostalCodeGreaterThanOrEqualTo(String value) {
            addCriterion("postalCode >=", value, "postalCode");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Thu Mar 19 17:39:39 CST 2020
         */
        public Criteria andPostalCodeGreaterThanOrEqualToColumn(Address.Column column) {
            addCriterion(new StringBuilder("postalCode >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPostalCodeLessThan(String value) {
            addCriterion("postalCode <", value, "postalCode");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Thu Mar 19 17:39:39 CST 2020
         */
        public Criteria andPostalCodeLessThanColumn(Address.Column column) {
            addCriterion(new StringBuilder("postalCode < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPostalCodeLessThanOrEqualTo(String value) {
            addCriterion("postalCode <=", value, "postalCode");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Thu Mar 19 17:39:39 CST 2020
         */
        public Criteria andPostalCodeLessThanOrEqualToColumn(Address.Column column) {
            addCriterion(new StringBuilder("postalCode <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPostalCodeLike(String value) {
            addCriterion("postalCode like", value, "postalCode");
            return (Criteria) this;
        }

        public Criteria andPostalCodeNotLike(String value) {
            addCriterion("postalCode not like", value, "postalCode");
            return (Criteria) this;
        }

        public Criteria andPostalCodeIn(List<String> values) {
            addCriterion("postalCode in", values, "postalCode");
            return (Criteria) this;
        }

        public Criteria andPostalCodeNotIn(List<String> values) {
            addCriterion("postalCode not in", values, "postalCode");
            return (Criteria) this;
        }

        public Criteria andPostalCodeBetween(String value1, String value2) {
            addCriterion("postalCode between", value1, value2, "postalCode");
            return (Criteria) this;
        }

        public Criteria andPostalCodeNotBetween(String value1, String value2) {
            addCriterion("postalCode not between", value1, value2, "postalCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeIsNull() {
            addCriterion("areaCode is null");
            return (Criteria) this;
        }

        public Criteria andAreaCodeIsNotNull() {
            addCriterion("areaCode is not null");
            return (Criteria) this;
        }

        public Criteria andAreaCodeEqualTo(String value) {
            addCriterion("areaCode =", value, "areaCode");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Thu Mar 19 17:39:39 CST 2020
         */
        public Criteria andAreaCodeEqualToColumn(Address.Column column) {
            addCriterion(new StringBuilder("areaCode = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotEqualTo(String value) {
            addCriterion("areaCode <>", value, "areaCode");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Thu Mar 19 17:39:39 CST 2020
         */
        public Criteria andAreaCodeNotEqualToColumn(Address.Column column) {
            addCriterion(new StringBuilder("areaCode <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAreaCodeGreaterThan(String value) {
            addCriterion("areaCode >", value, "areaCode");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Thu Mar 19 17:39:39 CST 2020
         */
        public Criteria andAreaCodeGreaterThanColumn(Address.Column column) {
            addCriterion(new StringBuilder("areaCode > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAreaCodeGreaterThanOrEqualTo(String value) {
            addCriterion("areaCode >=", value, "areaCode");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Thu Mar 19 17:39:39 CST 2020
         */
        public Criteria andAreaCodeGreaterThanOrEqualToColumn(Address.Column column) {
            addCriterion(new StringBuilder("areaCode >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAreaCodeLessThan(String value) {
            addCriterion("areaCode <", value, "areaCode");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Thu Mar 19 17:39:39 CST 2020
         */
        public Criteria andAreaCodeLessThanColumn(Address.Column column) {
            addCriterion(new StringBuilder("areaCode < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAreaCodeLessThanOrEqualTo(String value) {
            addCriterion("areaCode <=", value, "areaCode");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Thu Mar 19 17:39:39 CST 2020
         */
        public Criteria andAreaCodeLessThanOrEqualToColumn(Address.Column column) {
            addCriterion(new StringBuilder("areaCode <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAreaCodeLike(String value) {
            addCriterion("areaCode like", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotLike(String value) {
            addCriterion("areaCode not like", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeIn(List<String> values) {
            addCriterion("areaCode in", values, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotIn(List<String> values) {
            addCriterion("areaCode not in", values, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeBetween(String value1, String value2) {
            addCriterion("areaCode between", value1, value2, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotBetween(String value1, String value2) {
            addCriterion("areaCode not between", value1, value2, "areaCode");
            return (Criteria) this;
        }

        public Criteria andIsDefaultIsNull() {
            addCriterion("isDefault is null");
            return (Criteria) this;
        }

        public Criteria andIsDefaultIsNotNull() {
            addCriterion("isDefault is not null");
            return (Criteria) this;
        }

        public Criteria andIsDefaultEqualTo(Boolean value) {
            addCriterion("isDefault =", value, "isDefault");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Thu Mar 19 17:39:39 CST 2020
         */
        public Criteria andIsDefaultEqualToColumn(Address.Column column) {
            addCriterion(new StringBuilder("isDefault = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIsDefaultNotEqualTo(Boolean value) {
            addCriterion("isDefault <>", value, "isDefault");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Thu Mar 19 17:39:39 CST 2020
         */
        public Criteria andIsDefaultNotEqualToColumn(Address.Column column) {
            addCriterion(new StringBuilder("isDefault <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIsDefaultGreaterThan(Boolean value) {
            addCriterion("isDefault >", value, "isDefault");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Thu Mar 19 17:39:39 CST 2020
         */
        public Criteria andIsDefaultGreaterThanColumn(Address.Column column) {
            addCriterion(new StringBuilder("isDefault > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIsDefaultGreaterThanOrEqualTo(Boolean value) {
            addCriterion("isDefault >=", value, "isDefault");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Thu Mar 19 17:39:39 CST 2020
         */
        public Criteria andIsDefaultGreaterThanOrEqualToColumn(Address.Column column) {
            addCriterion(new StringBuilder("isDefault >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIsDefaultLessThan(Boolean value) {
            addCriterion("isDefault <", value, "isDefault");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Thu Mar 19 17:39:39 CST 2020
         */
        public Criteria andIsDefaultLessThanColumn(Address.Column column) {
            addCriterion(new StringBuilder("isDefault < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIsDefaultLessThanOrEqualTo(Boolean value) {
            addCriterion("isDefault <=", value, "isDefault");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Thu Mar 19 17:39:39 CST 2020
         */
        public Criteria andIsDefaultLessThanOrEqualToColumn(Address.Column column) {
            addCriterion(new StringBuilder("isDefault <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIsDefaultIn(List<Boolean> values) {
            addCriterion("isDefault in", values, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultNotIn(List<Boolean> values) {
            addCriterion("isDefault not in", values, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultBetween(Boolean value1, Boolean value2) {
            addCriterion("isDefault between", value1, value2, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultNotBetween(Boolean value1, Boolean value2) {
            addCriterion("isDefault not between", value1, value2, "isDefault");
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
         * @mbg.generated Thu Mar 19 17:39:39 CST 2020
         */
        public Criteria andUser_idEqualToColumn(Address.Column column) {
            addCriterion(new StringBuilder("user_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUser_idNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "user_id");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Thu Mar 19 17:39:39 CST 2020
         */
        public Criteria andUser_idNotEqualToColumn(Address.Column column) {
            addCriterion(new StringBuilder("user_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUser_idGreaterThan(Integer value) {
            addCriterion("user_id >", value, "user_id");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Thu Mar 19 17:39:39 CST 2020
         */
        public Criteria andUser_idGreaterThanColumn(Address.Column column) {
            addCriterion(new StringBuilder("user_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUser_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "user_id");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Thu Mar 19 17:39:39 CST 2020
         */
        public Criteria andUser_idGreaterThanOrEqualToColumn(Address.Column column) {
            addCriterion(new StringBuilder("user_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUser_idLessThan(Integer value) {
            addCriterion("user_id <", value, "user_id");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Thu Mar 19 17:39:39 CST 2020
         */
        public Criteria andUser_idLessThanColumn(Address.Column column) {
            addCriterion(new StringBuilder("user_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUser_idLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "user_id");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Thu Mar 19 17:39:39 CST 2020
         */
        public Criteria andUser_idLessThanOrEqualToColumn(Address.Column column) {
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

        public Criteria andUser_nameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUser_nameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUser_nameEqualTo(String value) {
            addCriterion("user_name =", value, "user_name");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Thu Mar 19 17:39:39 CST 2020
         */
        public Criteria andUser_nameEqualToColumn(Address.Column column) {
            addCriterion(new StringBuilder("user_name = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUser_nameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "user_name");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Thu Mar 19 17:39:39 CST 2020
         */
        public Criteria andUser_nameNotEqualToColumn(Address.Column column) {
            addCriterion(new StringBuilder("user_name <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUser_nameGreaterThan(String value) {
            addCriterion("user_name >", value, "user_name");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Thu Mar 19 17:39:39 CST 2020
         */
        public Criteria andUser_nameGreaterThanColumn(Address.Column column) {
            addCriterion(new StringBuilder("user_name > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUser_nameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "user_name");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Thu Mar 19 17:39:39 CST 2020
         */
        public Criteria andUser_nameGreaterThanOrEqualToColumn(Address.Column column) {
            addCriterion(new StringBuilder("user_name >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUser_nameLessThan(String value) {
            addCriterion("user_name <", value, "user_name");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Thu Mar 19 17:39:39 CST 2020
         */
        public Criteria andUser_nameLessThanColumn(Address.Column column) {
            addCriterion(new StringBuilder("user_name < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUser_nameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "user_name");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Thu Mar 19 17:39:39 CST 2020
         */
        public Criteria andUser_nameLessThanOrEqualToColumn(Address.Column column) {
            addCriterion(new StringBuilder("user_name <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUser_nameLike(String value) {
            addCriterion("user_name like", value, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameNotLike(String value) {
            addCriterion("user_name not like", value, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameIn(List<String> values) {
            addCriterion("user_name in", values, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "user_name");
            return (Criteria) this;
        }

        public Criteria andAddressLikeInsensitive(String value) {
            addCriterion("upper(address) like", value.toUpperCase(), "address");
            return (Criteria) this;
        }

        public Criteria andAddress_detailsLikeInsensitive(String value) {
            addCriterion("upper(address_details) like", value.toUpperCase(), "address_details");
            return (Criteria) this;
        }

        public Criteria andPhoneLikeInsensitive(String value) {
            addCriterion("upper(phone) like", value.toUpperCase(), "phone");
            return (Criteria) this;
        }

        public Criteria andNameLikeInsensitive(String value) {
            addCriterion("upper(name) like", value.toUpperCase(), "name");
            return (Criteria) this;
        }

        public Criteria andPostalCodeLikeInsensitive(String value) {
            addCriterion("upper(postalCode) like", value.toUpperCase(), "postalCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeLikeInsensitive(String value) {
            addCriterion("upper(areaCode) like", value.toUpperCase(), "areaCode");
            return (Criteria) this;
        }

        public Criteria andUser_nameLikeInsensitive(String value) {
            addCriterion("upper(user_name) like", value.toUpperCase(), "user_name");
            return (Criteria) this;
        }
    }

    /**
     *
     * @mbg.generated do_not_delete_during_merge Thu Mar 19 17:39:39 CST 2020
     */
    public static class Criteria extends GeneratedCriteria {
        /**
         *
         * @mbg.generated Thu Mar 19 17:39:39 CST 2020
         */
        private AddressExample example;

        /**
         *
         * @mbg.generated Thu Mar 19 17:39:39 CST 2020
         */
        protected Criteria(AddressExample example) {
            super();
            this.example = example;
        }

        /**
         *
         * @mbg.generated Thu Mar 19 17:39:39 CST 2020
         */
        public AddressExample example() {
            return this.example;
        }

        /**
         *
         * @mbg.generated Thu Mar 19 17:39:39 CST 2020
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
             * @mbg.generated Thu Mar 19 17:39:39 CST 2020
             */
            Criteria add(Criteria add);
        }
    }

    /**
     *
     * @mbg.generated Thu Mar 19 17:39:39 CST 2020
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
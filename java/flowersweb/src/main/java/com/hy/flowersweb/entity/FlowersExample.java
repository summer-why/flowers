package com.hy.flowersweb.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FlowersExample {
    /**
     *
     * @mbg.generated Wed Feb 26 16:28:12 CST 2020
     */
    protected String orderByClause;

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:12 CST 2020
     */
    protected boolean distinct;

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:12 CST 2020
     */
    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:12 CST 2020
     */
    public FlowersExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:12 CST 2020
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:12 CST 2020
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:12 CST 2020
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:12 CST 2020
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:12 CST 2020
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:12 CST 2020
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:12 CST 2020
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:12 CST 2020
     */
    public FlowersExample orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:12 CST 2020
     */
    public FlowersExample orderBy(String ... orderByClauses) {
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
     * @mbg.generated Wed Feb 26 16:28:12 CST 2020
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
     * @mbg.generated Wed Feb 26 16:28:12 CST 2020
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria(this);
        return criteria;
    }

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:12 CST 2020
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
     * @mbg.generated Wed Feb 26 16:28:12 CST 2020
     */
    public static Criteria newAndCreateCriteria() {
        FlowersExample example = new FlowersExample();
        return example.createCriteria();
    }

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:12 CST 2020
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
         * @mbg.generated Wed Feb 26 16:28:12 CST 2020
         */
        public Criteria andIdEqualToColumn(Flowers.Column column) {
            addCriterion(new StringBuilder("id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:12 CST 2020
         */
        public Criteria andIdNotEqualToColumn(Flowers.Column column) {
            addCriterion(new StringBuilder("id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:12 CST 2020
         */
        public Criteria andIdGreaterThanColumn(Flowers.Column column) {
            addCriterion(new StringBuilder("id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:12 CST 2020
         */
        public Criteria andIdGreaterThanOrEqualToColumn(Flowers.Column column) {
            addCriterion(new StringBuilder("id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:12 CST 2020
         */
        public Criteria andIdLessThanColumn(Flowers.Column column) {
            addCriterion(new StringBuilder("id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:12 CST 2020
         */
        public Criteria andIdLessThanOrEqualToColumn(Flowers.Column column) {
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

        public Criteria andFlower_nameIsNull() {
            addCriterion("flower_name is null");
            return (Criteria) this;
        }

        public Criteria andFlower_nameIsNotNull() {
            addCriterion("flower_name is not null");
            return (Criteria) this;
        }

        public Criteria andFlower_nameEqualTo(String value) {
            addCriterion("flower_name =", value, "flower_name");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:12 CST 2020
         */
        public Criteria andFlower_nameEqualToColumn(Flowers.Column column) {
            addCriterion(new StringBuilder("flower_name = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFlower_nameNotEqualTo(String value) {
            addCriterion("flower_name <>", value, "flower_name");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:12 CST 2020
         */
        public Criteria andFlower_nameNotEqualToColumn(Flowers.Column column) {
            addCriterion(new StringBuilder("flower_name <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFlower_nameGreaterThan(String value) {
            addCriterion("flower_name >", value, "flower_name");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:12 CST 2020
         */
        public Criteria andFlower_nameGreaterThanColumn(Flowers.Column column) {
            addCriterion(new StringBuilder("flower_name > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFlower_nameGreaterThanOrEqualTo(String value) {
            addCriterion("flower_name >=", value, "flower_name");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:12 CST 2020
         */
        public Criteria andFlower_nameGreaterThanOrEqualToColumn(Flowers.Column column) {
            addCriterion(new StringBuilder("flower_name >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFlower_nameLessThan(String value) {
            addCriterion("flower_name <", value, "flower_name");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:12 CST 2020
         */
        public Criteria andFlower_nameLessThanColumn(Flowers.Column column) {
            addCriterion(new StringBuilder("flower_name < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFlower_nameLessThanOrEqualTo(String value) {
            addCriterion("flower_name <=", value, "flower_name");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:12 CST 2020
         */
        public Criteria andFlower_nameLessThanOrEqualToColumn(Flowers.Column column) {
            addCriterion(new StringBuilder("flower_name <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFlower_nameLike(String value) {
            addCriterion("flower_name like", value, "flower_name");
            return (Criteria) this;
        }

        public Criteria andFlower_nameNotLike(String value) {
            addCriterion("flower_name not like", value, "flower_name");
            return (Criteria) this;
        }

        public Criteria andFlower_nameIn(List<String> values) {
            addCriterion("flower_name in", values, "flower_name");
            return (Criteria) this;
        }

        public Criteria andFlower_nameNotIn(List<String> values) {
            addCriterion("flower_name not in", values, "flower_name");
            return (Criteria) this;
        }

        public Criteria andFlower_nameBetween(String value1, String value2) {
            addCriterion("flower_name between", value1, value2, "flower_name");
            return (Criteria) this;
        }

        public Criteria andFlower_nameNotBetween(String value1, String value2) {
            addCriterion("flower_name not between", value1, value2, "flower_name");
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
         * @mbg.generated Wed Feb 26 16:28:12 CST 2020
         */
        public Criteria andCoverEqualToColumn(Flowers.Column column) {
            addCriterion(new StringBuilder("cover = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCoverNotEqualTo(String value) {
            addCriterion("cover <>", value, "cover");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:12 CST 2020
         */
        public Criteria andCoverNotEqualToColumn(Flowers.Column column) {
            addCriterion(new StringBuilder("cover <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCoverGreaterThan(String value) {
            addCriterion("cover >", value, "cover");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:12 CST 2020
         */
        public Criteria andCoverGreaterThanColumn(Flowers.Column column) {
            addCriterion(new StringBuilder("cover > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCoverGreaterThanOrEqualTo(String value) {
            addCriterion("cover >=", value, "cover");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:12 CST 2020
         */
        public Criteria andCoverGreaterThanOrEqualToColumn(Flowers.Column column) {
            addCriterion(new StringBuilder("cover >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCoverLessThan(String value) {
            addCriterion("cover <", value, "cover");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:12 CST 2020
         */
        public Criteria andCoverLessThanColumn(Flowers.Column column) {
            addCriterion(new StringBuilder("cover < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCoverLessThanOrEqualTo(String value) {
            addCriterion("cover <=", value, "cover");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:12 CST 2020
         */
        public Criteria andCoverLessThanOrEqualToColumn(Flowers.Column column) {
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

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:12 CST 2020
         */
        public Criteria andTitleEqualToColumn(Flowers.Column column) {
            addCriterion(new StringBuilder("title = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:12 CST 2020
         */
        public Criteria andTitleNotEqualToColumn(Flowers.Column column) {
            addCriterion(new StringBuilder("title <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:12 CST 2020
         */
        public Criteria andTitleGreaterThanColumn(Flowers.Column column) {
            addCriterion(new StringBuilder("title > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:12 CST 2020
         */
        public Criteria andTitleGreaterThanOrEqualToColumn(Flowers.Column column) {
            addCriterion(new StringBuilder("title >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:12 CST 2020
         */
        public Criteria andTitleLessThanColumn(Flowers.Column column) {
            addCriterion(new StringBuilder("title < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:12 CST 2020
         */
        public Criteria andTitleLessThanOrEqualToColumn(Flowers.Column column) {
            addCriterion(new StringBuilder("title <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andMain_imageIsNull() {
            addCriterion("main_image is null");
            return (Criteria) this;
        }

        public Criteria andMain_imageIsNotNull() {
            addCriterion("main_image is not null");
            return (Criteria) this;
        }

        public Criteria andMain_imageEqualTo(String value) {
            addCriterion("main_image =", value, "main_image");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:12 CST 2020
         */
        public Criteria andMain_imageEqualToColumn(Flowers.Column column) {
            addCriterion(new StringBuilder("main_image = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMain_imageNotEqualTo(String value) {
            addCriterion("main_image <>", value, "main_image");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:12 CST 2020
         */
        public Criteria andMain_imageNotEqualToColumn(Flowers.Column column) {
            addCriterion(new StringBuilder("main_image <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMain_imageGreaterThan(String value) {
            addCriterion("main_image >", value, "main_image");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:12 CST 2020
         */
        public Criteria andMain_imageGreaterThanColumn(Flowers.Column column) {
            addCriterion(new StringBuilder("main_image > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMain_imageGreaterThanOrEqualTo(String value) {
            addCriterion("main_image >=", value, "main_image");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:12 CST 2020
         */
        public Criteria andMain_imageGreaterThanOrEqualToColumn(Flowers.Column column) {
            addCriterion(new StringBuilder("main_image >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMain_imageLessThan(String value) {
            addCriterion("main_image <", value, "main_image");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:12 CST 2020
         */
        public Criteria andMain_imageLessThanColumn(Flowers.Column column) {
            addCriterion(new StringBuilder("main_image < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMain_imageLessThanOrEqualTo(String value) {
            addCriterion("main_image <=", value, "main_image");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:12 CST 2020
         */
        public Criteria andMain_imageLessThanOrEqualToColumn(Flowers.Column column) {
            addCriterion(new StringBuilder("main_image <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMain_imageLike(String value) {
            addCriterion("main_image like", value, "main_image");
            return (Criteria) this;
        }

        public Criteria andMain_imageNotLike(String value) {
            addCriterion("main_image not like", value, "main_image");
            return (Criteria) this;
        }

        public Criteria andMain_imageIn(List<String> values) {
            addCriterion("main_image in", values, "main_image");
            return (Criteria) this;
        }

        public Criteria andMain_imageNotIn(List<String> values) {
            addCriterion("main_image not in", values, "main_image");
            return (Criteria) this;
        }

        public Criteria andMain_imageBetween(String value1, String value2) {
            addCriterion("main_image between", value1, value2, "main_image");
            return (Criteria) this;
        }

        public Criteria andMain_imageNotBetween(String value1, String value2) {
            addCriterion("main_image not between", value1, value2, "main_image");
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
         * @mbg.generated Wed Feb 26 16:28:12 CST 2020
         */
        public Criteria andPriceEqualToColumn(Flowers.Column column) {
            addCriterion(new StringBuilder("price = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Double value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:12 CST 2020
         */
        public Criteria andPriceNotEqualToColumn(Flowers.Column column) {
            addCriterion(new StringBuilder("price <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Double value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:12 CST 2020
         */
        public Criteria andPriceGreaterThanColumn(Flowers.Column column) {
            addCriterion(new StringBuilder("price > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:12 CST 2020
         */
        public Criteria andPriceGreaterThanOrEqualToColumn(Flowers.Column column) {
            addCriterion(new StringBuilder("price >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Double value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:12 CST 2020
         */
        public Criteria andPriceLessThanColumn(Flowers.Column column) {
            addCriterion(new StringBuilder("price < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Double value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:12 CST 2020
         */
        public Criteria andPriceLessThanOrEqualToColumn(Flowers.Column column) {
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

        public Criteria andStockIsNull() {
            addCriterion("stock is null");
            return (Criteria) this;
        }

        public Criteria andStockIsNotNull() {
            addCriterion("stock is not null");
            return (Criteria) this;
        }

        public Criteria andStockEqualTo(String value) {
            addCriterion("stock =", value, "stock");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:12 CST 2020
         */
        public Criteria andStockEqualToColumn(Flowers.Column column) {
            addCriterion(new StringBuilder("stock = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStockNotEqualTo(String value) {
            addCriterion("stock <>", value, "stock");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:12 CST 2020
         */
        public Criteria andStockNotEqualToColumn(Flowers.Column column) {
            addCriterion(new StringBuilder("stock <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStockGreaterThan(String value) {
            addCriterion("stock >", value, "stock");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:12 CST 2020
         */
        public Criteria andStockGreaterThanColumn(Flowers.Column column) {
            addCriterion(new StringBuilder("stock > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStockGreaterThanOrEqualTo(String value) {
            addCriterion("stock >=", value, "stock");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:12 CST 2020
         */
        public Criteria andStockGreaterThanOrEqualToColumn(Flowers.Column column) {
            addCriterion(new StringBuilder("stock >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStockLessThan(String value) {
            addCriterion("stock <", value, "stock");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:12 CST 2020
         */
        public Criteria andStockLessThanColumn(Flowers.Column column) {
            addCriterion(new StringBuilder("stock < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStockLessThanOrEqualTo(String value) {
            addCriterion("stock <=", value, "stock");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:12 CST 2020
         */
        public Criteria andStockLessThanOrEqualToColumn(Flowers.Column column) {
            addCriterion(new StringBuilder("stock <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStockLike(String value) {
            addCriterion("stock like", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockNotLike(String value) {
            addCriterion("stock not like", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockIn(List<String> values) {
            addCriterion("stock in", values, "stock");
            return (Criteria) this;
        }

        public Criteria andStockNotIn(List<String> values) {
            addCriterion("stock not in", values, "stock");
            return (Criteria) this;
        }

        public Criteria andStockBetween(String value1, String value2) {
            addCriterion("stock between", value1, value2, "stock");
            return (Criteria) this;
        }

        public Criteria andStockNotBetween(String value1, String value2) {
            addCriterion("stock not between", value1, value2, "stock");
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
         * @mbg.generated Wed Feb 26 16:28:12 CST 2020
         */
        public Criteria andStatusEqualToColumn(Flowers.Column column) {
            addCriterion(new StringBuilder("status = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:12 CST 2020
         */
        public Criteria andStatusNotEqualToColumn(Flowers.Column column) {
            addCriterion(new StringBuilder("status <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:12 CST 2020
         */
        public Criteria andStatusGreaterThanColumn(Flowers.Column column) {
            addCriterion(new StringBuilder("status > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:12 CST 2020
         */
        public Criteria andStatusGreaterThanOrEqualToColumn(Flowers.Column column) {
            addCriterion(new StringBuilder("status >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:12 CST 2020
         */
        public Criteria andStatusLessThanColumn(Flowers.Column column) {
            addCriterion(new StringBuilder("status < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:12 CST 2020
         */
        public Criteria andStatusLessThanOrEqualToColumn(Flowers.Column column) {
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
         * @mbg.generated Wed Feb 26 16:28:12 CST 2020
         */
        public Criteria andCreate_timeEqualToColumn(Flowers.Column column) {
            addCriterion(new StringBuilder("create_time = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreate_timeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "create_time");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:12 CST 2020
         */
        public Criteria andCreate_timeNotEqualToColumn(Flowers.Column column) {
            addCriterion(new StringBuilder("create_time <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreate_timeGreaterThan(Date value) {
            addCriterion("create_time >", value, "create_time");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:12 CST 2020
         */
        public Criteria andCreate_timeGreaterThanColumn(Flowers.Column column) {
            addCriterion(new StringBuilder("create_time > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreate_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "create_time");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:12 CST 2020
         */
        public Criteria andCreate_timeGreaterThanOrEqualToColumn(Flowers.Column column) {
            addCriterion(new StringBuilder("create_time >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreate_timeLessThan(Date value) {
            addCriterion("create_time <", value, "create_time");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:12 CST 2020
         */
        public Criteria andCreate_timeLessThanColumn(Flowers.Column column) {
            addCriterion(new StringBuilder("create_time < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreate_timeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "create_time");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:12 CST 2020
         */
        public Criteria andCreate_timeLessThanOrEqualToColumn(Flowers.Column column) {
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
         * @mbg.generated Wed Feb 26 16:28:12 CST 2020
         */
        public Criteria andUpdate_timeEqualToColumn(Flowers.Column column) {
            addCriterion(new StringBuilder("update_time = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdate_timeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "update_time");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:12 CST 2020
         */
        public Criteria andUpdate_timeNotEqualToColumn(Flowers.Column column) {
            addCriterion(new StringBuilder("update_time <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdate_timeGreaterThan(Date value) {
            addCriterion("update_time >", value, "update_time");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:12 CST 2020
         */
        public Criteria andUpdate_timeGreaterThanColumn(Flowers.Column column) {
            addCriterion(new StringBuilder("update_time > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdate_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "update_time");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:12 CST 2020
         */
        public Criteria andUpdate_timeGreaterThanOrEqualToColumn(Flowers.Column column) {
            addCriterion(new StringBuilder("update_time >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdate_timeLessThan(Date value) {
            addCriterion("update_time <", value, "update_time");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:12 CST 2020
         */
        public Criteria andUpdate_timeLessThanColumn(Flowers.Column column) {
            addCriterion(new StringBuilder("update_time < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdate_timeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "update_time");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:12 CST 2020
         */
        public Criteria andUpdate_timeLessThanOrEqualToColumn(Flowers.Column column) {
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

        public Criteria andFlower_languageIsNull() {
            addCriterion("flower_language is null");
            return (Criteria) this;
        }

        public Criteria andFlower_languageIsNotNull() {
            addCriterion("flower_language is not null");
            return (Criteria) this;
        }

        public Criteria andFlower_languageEqualTo(String value) {
            addCriterion("flower_language =", value, "flower_language");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:12 CST 2020
         */
        public Criteria andFlower_languageEqualToColumn(Flowers.Column column) {
            addCriterion(new StringBuilder("flower_language = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFlower_languageNotEqualTo(String value) {
            addCriterion("flower_language <>", value, "flower_language");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:12 CST 2020
         */
        public Criteria andFlower_languageNotEqualToColumn(Flowers.Column column) {
            addCriterion(new StringBuilder("flower_language <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFlower_languageGreaterThan(String value) {
            addCriterion("flower_language >", value, "flower_language");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:12 CST 2020
         */
        public Criteria andFlower_languageGreaterThanColumn(Flowers.Column column) {
            addCriterion(new StringBuilder("flower_language > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFlower_languageGreaterThanOrEqualTo(String value) {
            addCriterion("flower_language >=", value, "flower_language");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:12 CST 2020
         */
        public Criteria andFlower_languageGreaterThanOrEqualToColumn(Flowers.Column column) {
            addCriterion(new StringBuilder("flower_language >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFlower_languageLessThan(String value) {
            addCriterion("flower_language <", value, "flower_language");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:12 CST 2020
         */
        public Criteria andFlower_languageLessThanColumn(Flowers.Column column) {
            addCriterion(new StringBuilder("flower_language < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFlower_languageLessThanOrEqualTo(String value) {
            addCriterion("flower_language <=", value, "flower_language");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:12 CST 2020
         */
        public Criteria andFlower_languageLessThanOrEqualToColumn(Flowers.Column column) {
            addCriterion(new StringBuilder("flower_language <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFlower_languageLike(String value) {
            addCriterion("flower_language like", value, "flower_language");
            return (Criteria) this;
        }

        public Criteria andFlower_languageNotLike(String value) {
            addCriterion("flower_language not like", value, "flower_language");
            return (Criteria) this;
        }

        public Criteria andFlower_languageIn(List<String> values) {
            addCriterion("flower_language in", values, "flower_language");
            return (Criteria) this;
        }

        public Criteria andFlower_languageNotIn(List<String> values) {
            addCriterion("flower_language not in", values, "flower_language");
            return (Criteria) this;
        }

        public Criteria andFlower_languageBetween(String value1, String value2) {
            addCriterion("flower_language between", value1, value2, "flower_language");
            return (Criteria) this;
        }

        public Criteria andFlower_languageNotBetween(String value1, String value2) {
            addCriterion("flower_language not between", value1, value2, "flower_language");
            return (Criteria) this;
        }

        public Criteria andFlower_materialIsNull() {
            addCriterion("flower_material is null");
            return (Criteria) this;
        }

        public Criteria andFlower_materialIsNotNull() {
            addCriterion("flower_material is not null");
            return (Criteria) this;
        }

        public Criteria andFlower_materialEqualTo(String value) {
            addCriterion("flower_material =", value, "flower_material");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:12 CST 2020
         */
        public Criteria andFlower_materialEqualToColumn(Flowers.Column column) {
            addCriterion(new StringBuilder("flower_material = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFlower_materialNotEqualTo(String value) {
            addCriterion("flower_material <>", value, "flower_material");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:12 CST 2020
         */
        public Criteria andFlower_materialNotEqualToColumn(Flowers.Column column) {
            addCriterion(new StringBuilder("flower_material <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFlower_materialGreaterThan(String value) {
            addCriterion("flower_material >", value, "flower_material");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:12 CST 2020
         */
        public Criteria andFlower_materialGreaterThanColumn(Flowers.Column column) {
            addCriterion(new StringBuilder("flower_material > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFlower_materialGreaterThanOrEqualTo(String value) {
            addCriterion("flower_material >=", value, "flower_material");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:12 CST 2020
         */
        public Criteria andFlower_materialGreaterThanOrEqualToColumn(Flowers.Column column) {
            addCriterion(new StringBuilder("flower_material >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFlower_materialLessThan(String value) {
            addCriterion("flower_material <", value, "flower_material");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:12 CST 2020
         */
        public Criteria andFlower_materialLessThanColumn(Flowers.Column column) {
            addCriterion(new StringBuilder("flower_material < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFlower_materialLessThanOrEqualTo(String value) {
            addCriterion("flower_material <=", value, "flower_material");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:12 CST 2020
         */
        public Criteria andFlower_materialLessThanOrEqualToColumn(Flowers.Column column) {
            addCriterion(new StringBuilder("flower_material <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFlower_materialLike(String value) {
            addCriterion("flower_material like", value, "flower_material");
            return (Criteria) this;
        }

        public Criteria andFlower_materialNotLike(String value) {
            addCriterion("flower_material not like", value, "flower_material");
            return (Criteria) this;
        }

        public Criteria andFlower_materialIn(List<String> values) {
            addCriterion("flower_material in", values, "flower_material");
            return (Criteria) this;
        }

        public Criteria andFlower_materialNotIn(List<String> values) {
            addCriterion("flower_material not in", values, "flower_material");
            return (Criteria) this;
        }

        public Criteria andFlower_materialBetween(String value1, String value2) {
            addCriterion("flower_material between", value1, value2, "flower_material");
            return (Criteria) this;
        }

        public Criteria andFlower_materialNotBetween(String value1, String value2) {
            addCriterion("flower_material not between", value1, value2, "flower_material");
            return (Criteria) this;
        }

        public Criteria andCategory_idIsNull() {
            addCriterion("category_id is null");
            return (Criteria) this;
        }

        public Criteria andCategory_idIsNotNull() {
            addCriterion("category_id is not null");
            return (Criteria) this;
        }

        public Criteria andCategory_idEqualTo(Integer value) {
            addCriterion("category_id =", value, "category_id");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:12 CST 2020
         */
        public Criteria andCategory_idEqualToColumn(Flowers.Column column) {
            addCriterion(new StringBuilder("category_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCategory_idNotEqualTo(Integer value) {
            addCriterion("category_id <>", value, "category_id");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:12 CST 2020
         */
        public Criteria andCategory_idNotEqualToColumn(Flowers.Column column) {
            addCriterion(new StringBuilder("category_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCategory_idGreaterThan(Integer value) {
            addCriterion("category_id >", value, "category_id");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:12 CST 2020
         */
        public Criteria andCategory_idGreaterThanColumn(Flowers.Column column) {
            addCriterion(new StringBuilder("category_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCategory_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("category_id >=", value, "category_id");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:12 CST 2020
         */
        public Criteria andCategory_idGreaterThanOrEqualToColumn(Flowers.Column column) {
            addCriterion(new StringBuilder("category_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCategory_idLessThan(Integer value) {
            addCriterion("category_id <", value, "category_id");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:12 CST 2020
         */
        public Criteria andCategory_idLessThanColumn(Flowers.Column column) {
            addCriterion(new StringBuilder("category_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCategory_idLessThanOrEqualTo(Integer value) {
            addCriterion("category_id <=", value, "category_id");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:12 CST 2020
         */
        public Criteria andCategory_idLessThanOrEqualToColumn(Flowers.Column column) {
            addCriterion(new StringBuilder("category_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCategory_idIn(List<Integer> values) {
            addCriterion("category_id in", values, "category_id");
            return (Criteria) this;
        }

        public Criteria andCategory_idNotIn(List<Integer> values) {
            addCriterion("category_id not in", values, "category_id");
            return (Criteria) this;
        }

        public Criteria andCategory_idBetween(Integer value1, Integer value2) {
            addCriterion("category_id between", value1, value2, "category_id");
            return (Criteria) this;
        }

        public Criteria andCategory_idNotBetween(Integer value1, Integer value2) {
            addCriterion("category_id not between", value1, value2, "category_id");
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
         * @mbg.generated Wed Feb 26 16:28:12 CST 2020
         */
        public Criteria andStore_idEqualToColumn(Flowers.Column column) {
            addCriterion(new StringBuilder("store_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStore_idNotEqualTo(Integer value) {
            addCriterion("store_id <>", value, "store_id");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:12 CST 2020
         */
        public Criteria andStore_idNotEqualToColumn(Flowers.Column column) {
            addCriterion(new StringBuilder("store_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStore_idGreaterThan(Integer value) {
            addCriterion("store_id >", value, "store_id");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:12 CST 2020
         */
        public Criteria andStore_idGreaterThanColumn(Flowers.Column column) {
            addCriterion(new StringBuilder("store_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStore_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("store_id >=", value, "store_id");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:12 CST 2020
         */
        public Criteria andStore_idGreaterThanOrEqualToColumn(Flowers.Column column) {
            addCriterion(new StringBuilder("store_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStore_idLessThan(Integer value) {
            addCriterion("store_id <", value, "store_id");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:12 CST 2020
         */
        public Criteria andStore_idLessThanColumn(Flowers.Column column) {
            addCriterion(new StringBuilder("store_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStore_idLessThanOrEqualTo(Integer value) {
            addCriterion("store_id <=", value, "store_id");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:12 CST 2020
         */
        public Criteria andStore_idLessThanOrEqualToColumn(Flowers.Column column) {
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

        public Criteria andFlower_nameLikeInsensitive(String value) {
            addCriterion("upper(flower_name) like", value.toUpperCase(), "flower_name");
            return (Criteria) this;
        }

        public Criteria andCoverLikeInsensitive(String value) {
            addCriterion("upper(cover) like", value.toUpperCase(), "cover");
            return (Criteria) this;
        }

        public Criteria andTitleLikeInsensitive(String value) {
            addCriterion("upper(title) like", value.toUpperCase(), "title");
            return (Criteria) this;
        }

        public Criteria andMain_imageLikeInsensitive(String value) {
            addCriterion("upper(main_image) like", value.toUpperCase(), "main_image");
            return (Criteria) this;
        }

        public Criteria andStockLikeInsensitive(String value) {
            addCriterion("upper(stock) like", value.toUpperCase(), "stock");
            return (Criteria) this;
        }

        public Criteria andFlower_languageLikeInsensitive(String value) {
            addCriterion("upper(flower_language) like", value.toUpperCase(), "flower_language");
            return (Criteria) this;
        }

        public Criteria andFlower_materialLikeInsensitive(String value) {
            addCriterion("upper(flower_material) like", value.toUpperCase(), "flower_material");
            return (Criteria) this;
        }
    }

    /**
     *
     * @mbg.generated do_not_delete_during_merge Wed Feb 26 16:28:12 CST 2020
     */
    public static class Criteria extends GeneratedCriteria {
        /**
         *
         * @mbg.generated Wed Feb 26 16:28:12 CST 2020
         */
        private FlowersExample example;

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:12 CST 2020
         */
        protected Criteria(FlowersExample example) {
            super();
            this.example = example;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:12 CST 2020
         */
        public FlowersExample example() {
            return this.example;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:12 CST 2020
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
             * @mbg.generated Wed Feb 26 16:28:12 CST 2020
             */
            Criteria add(Criteria add);
        }
    }

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:12 CST 2020
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
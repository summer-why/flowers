package com.hy.flowersweb.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

/**
 * Created By MBG-GUI-EXTENSION https://github.com/spawpaw/mybatis-generator-gui-extension
 * Description:
 * 
 *
 * @author 
 */
public class Category implements Serializable {
    /**
     *
     *
     * @mbg.generated Mon Mar 09 22:02:32 CST 2020
     */
    private Integer id;

    /**
     *
     *
     * @mbg.generated Mon Mar 09 22:02:32 CST 2020
     */
    private String category_name;

    /**
     *
     *
     * @mbg.generated Mon Mar 09 22:02:32 CST 2020
     */
    private Date create_time;

    /**
     *
     *
     * @mbg.generated Mon Mar 09 22:02:32 CST 2020
     */
    private Date update_time;

    /**
     *
     *
     * @mbg.generated Mon Mar 09 22:02:32 CST 2020
     */
    private Integer store_id;

    /**
     *
     * @mbg.generated Mon Mar 09 22:02:32 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column flowers..category.id
     *
     * @return the value of flowers..category.id
     *
     * @mbg.generated Mon Mar 09 22:02:32 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     *
     * @mbg.generated Mon Mar 09 22:02:32 CST 2020
     */
    public Category withId(Integer id) {
        this.setId(id);
        return this;
    }

    /**
     * This method sets the value of the database column flowers..category.id
     *
     * @param id the value for flowers..category.id
     *
     * @mbg.generated Mon Mar 09 22:02:32 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column flowers..category.category_name
     *
     * @return the value of flowers..category.category_name
     *
     * @mbg.generated Mon Mar 09 22:02:32 CST 2020
     */
    public String getCategory_name() {
        return category_name;
    }

    /**
     *
     * @mbg.generated Mon Mar 09 22:02:32 CST 2020
     */
    public Category withCategory_name(String category_name) {
        this.setCategory_name(category_name);
        return this;
    }

    /**
     * This method sets the value of the database column flowers..category.category_name
     *
     * @param category_name the value for flowers..category.category_name
     *
     * @mbg.generated Mon Mar 09 22:02:32 CST 2020
     */
    public void setCategory_name(String category_name) {
        this.category_name = category_name == null ? null : category_name.trim();
    }

    /**
     * This method returns the value of the database column flowers..category.create_time
     *
     * @return the value of flowers..category.create_time
     *
     * @mbg.generated Mon Mar 09 22:02:32 CST 2020
     */
    public Date getCreate_time() {
        return create_time;
    }

    /**
     *
     * @mbg.generated Mon Mar 09 22:02:32 CST 2020
     */
    public Category withCreate_time(Date create_time) {
        this.setCreate_time(create_time);
        return this;
    }

    /**
     * This method sets the value of the database column flowers..category.create_time
     *
     * @param create_time the value for flowers..category.create_time
     *
     * @mbg.generated Mon Mar 09 22:02:32 CST 2020
     */
    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    /**
     * This method returns the value of the database column flowers..category.update_time
     *
     * @return the value of flowers..category.update_time
     *
     * @mbg.generated Mon Mar 09 22:02:32 CST 2020
     */
    public Date getUpdate_time() {
        return update_time;
    }

    /**
     *
     * @mbg.generated Mon Mar 09 22:02:32 CST 2020
     */
    public Category withUpdate_time(Date update_time) {
        this.setUpdate_time(update_time);
        return this;
    }

    /**
     * This method sets the value of the database column flowers..category.update_time
     *
     * @param update_time the value for flowers..category.update_time
     *
     * @mbg.generated Mon Mar 09 22:02:32 CST 2020
     */
    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }

    /**
     * This method returns the value of the database column flowers..category.store_id
     *
     * @return the value of flowers..category.store_id
     *
     * @mbg.generated Mon Mar 09 22:02:32 CST 2020
     */
    public Integer getStore_id() {
        return store_id;
    }

    /**
     *
     * @mbg.generated Mon Mar 09 22:02:32 CST 2020
     */
    public Category withStore_id(Integer store_id) {
        this.setStore_id(store_id);
        return this;
    }

    /**
     * This method sets the value of the database column flowers..category.store_id
     *
     * @param store_id the value for flowers..category.store_id
     *
     * @mbg.generated Mon Mar 09 22:02:32 CST 2020
     */
    public void setStore_id(Integer store_id) {
        this.store_id = store_id;
    }

    /**
     *
     * @mbg.generated Mon Mar 09 22:02:32 CST 2020
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", category_name=").append(category_name);
        sb.append(", create_time=").append(create_time);
        sb.append(", update_time=").append(update_time);
        sb.append(", store_id=").append(store_id);
        sb.append("]");
        return sb.toString();
    }

    /**
     *
     * @mbg.generated Mon Mar 09 22:02:32 CST 2020
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Category other = (Category) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCategory_name() == null ? other.getCategory_name() == null : this.getCategory_name().equals(other.getCategory_name()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getUpdate_time() == null ? other.getUpdate_time() == null : this.getUpdate_time().equals(other.getUpdate_time()))
            && (this.getStore_id() == null ? other.getStore_id() == null : this.getStore_id().equals(other.getStore_id()));
    }

    /**
     *
     * @mbg.generated Mon Mar 09 22:02:32 CST 2020
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCategory_name() == null) ? 0 : getCategory_name().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getUpdate_time() == null) ? 0 : getUpdate_time().hashCode());
        result = prime * result + ((getStore_id() == null) ? 0 : getStore_id().hashCode());
        return result;
    }

    /**
     *
     * @mbg.generated Mon Mar 09 22:02:32 CST 2020
     */
    public enum Column {
        id("id", "id", "INTEGER", false),
        category_name("category_name", "category_name", "VARCHAR", false),
        create_time("create_time", "create_time", "TIMESTAMP", false),
        update_time("update_time", "update_time", "TIMESTAMP", false),
        store_id("store_id", "store_id", "INTEGER", false);

        /**
         *
         * @mbg.generated Mon Mar 09 22:02:32 CST 2020
         */
        private static final String BEGINNING_DELIMITER = "\"";

        /**
         *
         * @mbg.generated Mon Mar 09 22:02:32 CST 2020
         */
        private static final String ENDING_DELIMITER = "\"";

        /**
         *
         * @mbg.generated Mon Mar 09 22:02:32 CST 2020
         */
        private final String column;

        /**
         *
         * @mbg.generated Mon Mar 09 22:02:32 CST 2020
         */
        private final boolean isColumnNameDelimited;

        /**
         *
         * @mbg.generated Mon Mar 09 22:02:32 CST 2020
         */
        private final String javaProperty;

        /**
         *
         * @mbg.generated Mon Mar 09 22:02:32 CST 2020
         */
        private final String jdbcType;

        /**
         *
         * @mbg.generated Mon Mar 09 22:02:32 CST 2020
         */
        public String value() {
            return this.column;
        }

        /**
         *
         * @mbg.generated Mon Mar 09 22:02:32 CST 2020
         */
        public String getValue() {
            return this.column;
        }

        /**
         *
         * @mbg.generated Mon Mar 09 22:02:32 CST 2020
         */
        public String getJavaProperty() {
            return this.javaProperty;
        }

        /**
         *
         * @mbg.generated Mon Mar 09 22:02:32 CST 2020
         */
        public String getJdbcType() {
            return this.jdbcType;
        }

        /**
         *
         * @mbg.generated Mon Mar 09 22:02:32 CST 2020
         */
        Column(String column, String javaProperty, String jdbcType, boolean isColumnNameDelimited) {
            this.column = column;
            this.javaProperty = javaProperty;
            this.jdbcType = jdbcType;
            this.isColumnNameDelimited = isColumnNameDelimited;
        }

        /**
         *
         * @mbg.generated Mon Mar 09 22:02:32 CST 2020
         */
        public String desc() {
            return this.getEscapedColumnName() + " DESC";
        }

        /**
         *
         * @mbg.generated Mon Mar 09 22:02:32 CST 2020
         */
        public String asc() {
            return this.getEscapedColumnName() + " ASC";
        }

        /**
         *
         * @mbg.generated Mon Mar 09 22:02:32 CST 2020
         */
        public static Column[] excludes(Column ... excludes) {
            ArrayList<Column> columns = new ArrayList<>(Arrays.asList(Column.values()));
            if (excludes != null && excludes.length > 0) {
                columns.removeAll(new ArrayList<>(Arrays.asList(excludes)));
            }
            return columns.toArray(new Column[]{});
        }

        /**
         *
         * @mbg.generated Mon Mar 09 22:02:32 CST 2020
         */
        public String getEscapedColumnName() {
            if (this.isColumnNameDelimited) {
                return new StringBuilder().append(BEGINNING_DELIMITER).append(this.column).append(ENDING_DELIMITER).toString();
            } else {
                return this.column;
            }
        }
    }
}
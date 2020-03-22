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
public class Shopcar implements Serializable {
    /**
     *
     *
     * @mbg.generated Tue Mar 17 11:17:11 CST 2020
     */
    private Integer id;

    /**
     *
     *
     * @mbg.generated Tue Mar 17 11:17:11 CST 2020
     */
    private Integer count;

    /**
     *
     *
     * @mbg.generated Tue Mar 17 11:17:11 CST 2020
     */
    private Double price;

    /**
     *
     *
     * @mbg.generated Tue Mar 17 11:17:11 CST 2020
     */
    private Double sum_price;

    /**
     *
     *
     * @mbg.generated Tue Mar 17 11:17:11 CST 2020
     */
    private Boolean checked;

    /**
     *
     *
     * @mbg.generated Tue Mar 17 11:17:11 CST 2020
     */
    private Date create_time;

    /**
     *
     *
     * @mbg.generated Tue Mar 17 11:17:11 CST 2020
     */
    private Integer user_id;

    /**
     *
     *
     * @mbg.generated Tue Mar 17 11:17:11 CST 2020
     */
    private Integer flower_id;

    private User user;
    private Flowers flowers;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Flowers getFlowers() {
        return flowers;
    }

    public void setFlowers(Flowers flowers) {
        this.flowers = flowers;
    }


    /**
     *
     * @mbg.generated Tue Mar 17 11:17:11 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column flowers..shopcar.id
     *
     * @return the value of flowers..shopcar.id
     *
     * @mbg.generated Tue Mar 17 11:17:11 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     *
     * @mbg.generated Tue Mar 17 11:17:11 CST 2020
     */
    public Shopcar withId(Integer id) {
        this.setId(id);
        return this;
    }

    /**
     * This method sets the value of the database column flowers..shopcar.id
     *
     * @param id the value for flowers..shopcar.id
     *
     * @mbg.generated Tue Mar 17 11:17:11 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column flowers..shopcar.count
     *
     * @return the value of flowers..shopcar.count
     *
     * @mbg.generated Tue Mar 17 11:17:11 CST 2020
     */
    public Integer getCount() {
        return count;
    }

    /**
     *
     * @mbg.generated Tue Mar 17 11:17:11 CST 2020
     */
    public Shopcar withCount(Integer count) {
        this.setCount(count);
        return this;
    }

    /**
     * This method sets the value of the database column flowers..shopcar.count
     *
     * @param count the value for flowers..shopcar.count
     *
     * @mbg.generated Tue Mar 17 11:17:11 CST 2020
     */
    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * This method returns the value of the database column flowers..shopcar.price
     *
     * @return the value of flowers..shopcar.price
     *
     * @mbg.generated Tue Mar 17 11:17:11 CST 2020
     */
    public Double getPrice() {
        return price;
    }

    /**
     *
     * @mbg.generated Tue Mar 17 11:17:11 CST 2020
     */
    public Shopcar withPrice(Double price) {
        this.setPrice(price);
        return this;
    }

    /**
     * This method sets the value of the database column flowers..shopcar.price
     *
     * @param price the value for flowers..shopcar.price
     *
     * @mbg.generated Tue Mar 17 11:17:11 CST 2020
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * This method returns the value of the database column flowers..shopcar.sum_price
     *
     * @return the value of flowers..shopcar.sum_price
     *
     * @mbg.generated Tue Mar 17 11:17:11 CST 2020
     */
    public Double getSum_price() {
        return sum_price;
    }

    /**
     *
     * @mbg.generated Tue Mar 17 11:17:11 CST 2020
     */
    public Shopcar withSum_price(Double sum_price) {
        this.setSum_price(sum_price);
        return this;
    }

    /**
     * This method sets the value of the database column flowers..shopcar.sum_price
     *
     * @param sum_price the value for flowers..shopcar.sum_price
     *
     * @mbg.generated Tue Mar 17 11:17:11 CST 2020
     */
    public void setSum_price(Double sum_price) {
        this.sum_price = sum_price;
    }

    /**
     * This method returns the value of the database column flowers..shopcar.checked
     *
     * @return the value of flowers..shopcar.checked
     *
     * @mbg.generated Tue Mar 17 11:17:11 CST 2020
     */
    public Boolean getChecked() {
        return checked;
    }

    /**
     *
     * @mbg.generated Tue Mar 17 11:17:11 CST 2020
     */
    public Shopcar withChecked(Boolean checked) {
        this.setChecked(checked);
        return this;
    }

    /**
     * This method sets the value of the database column flowers..shopcar.checked
     *
     * @param checked the value for flowers..shopcar.checked
     *
     * @mbg.generated Tue Mar 17 11:17:11 CST 2020
     */
    public void setChecked(Boolean checked) {
        this.checked = checked;
    }

    /**
     * This method returns the value of the database column flowers..shopcar.create_time
     *
     * @return the value of flowers..shopcar.create_time
     *
     * @mbg.generated Tue Mar 17 11:17:11 CST 2020
     */
    public Date getCreate_time() {
        return create_time;
    }

    /**
     *
     * @mbg.generated Tue Mar 17 11:17:11 CST 2020
     */
    public Shopcar withCreate_time(Date create_time) {
        this.setCreate_time(create_time);
        return this;
    }

    /**
     * This method sets the value of the database column flowers..shopcar.create_time
     *
     * @param create_time the value for flowers..shopcar.create_time
     *
     * @mbg.generated Tue Mar 17 11:17:11 CST 2020
     */
    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    /**
     * This method returns the value of the database column flowers..shopcar.user_id
     *
     * @return the value of flowers..shopcar.user_id
     *
     * @mbg.generated Tue Mar 17 11:17:11 CST 2020
     */
    public Integer getUser_id() {
        return user_id;
    }

    /**
     *
     * @mbg.generated Tue Mar 17 11:17:11 CST 2020
     */
    public Shopcar withUser_id(Integer user_id) {
        this.setUser_id(user_id);
        return this;
    }

    /**
     * This method sets the value of the database column flowers..shopcar.user_id
     *
     * @param user_id the value for flowers..shopcar.user_id
     *
     * @mbg.generated Tue Mar 17 11:17:11 CST 2020
     */
    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    /**
     * This method returns the value of the database column flowers..shopcar.flower_id
     *
     * @return the value of flowers..shopcar.flower_id
     *
     * @mbg.generated Tue Mar 17 11:17:11 CST 2020
     */
    public Integer getFlower_id() {
        return flower_id;
    }

    /**
     *
     * @mbg.generated Tue Mar 17 11:17:11 CST 2020
     */
    public Shopcar withFlower_id(Integer flower_id) {
        this.setFlower_id(flower_id);
        return this;
    }

    /**
     * This method sets the value of the database column flowers..shopcar.flower_id
     *
     * @param flower_id the value for flowers..shopcar.flower_id
     *
     * @mbg.generated Tue Mar 17 11:17:11 CST 2020
     */
    public void setFlower_id(Integer flower_id) {
        this.flower_id = flower_id;
    }

    /**
     *
     * @mbg.generated Tue Mar 17 11:17:11 CST 2020
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", count=").append(count);
        sb.append(", price=").append(price);
        sb.append(", sum_price=").append(sum_price);
        sb.append(", checked=").append(checked);
        sb.append(", create_time=").append(create_time);
        sb.append(", user_id=").append(user_id);
        sb.append(", flower_id=").append(flower_id);
        sb.append("]");
        return sb.toString();
    }

    /**
     *
     * @mbg.generated Tue Mar 17 11:17:11 CST 2020
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
        Shopcar other = (Shopcar) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCount() == null ? other.getCount() == null : this.getCount().equals(other.getCount()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getSum_price() == null ? other.getSum_price() == null : this.getSum_price().equals(other.getSum_price()))
            && (this.getChecked() == null ? other.getChecked() == null : this.getChecked().equals(other.getChecked()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getUser_id() == null ? other.getUser_id() == null : this.getUser_id().equals(other.getUser_id()))
            && (this.getFlower_id() == null ? other.getFlower_id() == null : this.getFlower_id().equals(other.getFlower_id()));
    }

    /**
     *
     * @mbg.generated Tue Mar 17 11:17:11 CST 2020
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCount() == null) ? 0 : getCount().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getSum_price() == null) ? 0 : getSum_price().hashCode());
        result = prime * result + ((getChecked() == null) ? 0 : getChecked().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getUser_id() == null) ? 0 : getUser_id().hashCode());
        result = prime * result + ((getFlower_id() == null) ? 0 : getFlower_id().hashCode());
        return result;
    }

    /**
     *
     * @mbg.generated Tue Mar 17 11:17:11 CST 2020
     */
    public enum Column {
        id("id", "id", "INTEGER", false),
        count("count", "count", "INTEGER", false),
        price("price", "price", "DOUBLE", false),
        sum_price("sum_price", "sum_price", "DOUBLE", false),
        checked("checked", "checked", "BIT", false),
        create_time("create_time", "create_time", "TIMESTAMP", false),
        user_id("user_id", "user_id", "INTEGER", false),
        flower_id("flower_id", "flower_id", "INTEGER", false);

        /**
         *
         * @mbg.generated Tue Mar 17 11:17:11 CST 2020
         */
        private static final String BEGINNING_DELIMITER = "\"";

        /**
         *
         * @mbg.generated Tue Mar 17 11:17:11 CST 2020
         */
        private static final String ENDING_DELIMITER = "\"";

        /**
         *
         * @mbg.generated Tue Mar 17 11:17:11 CST 2020
         */
        private final String column;

        /**
         *
         * @mbg.generated Tue Mar 17 11:17:11 CST 2020
         */
        private final boolean isColumnNameDelimited;

        /**
         *
         * @mbg.generated Tue Mar 17 11:17:11 CST 2020
         */
        private final String javaProperty;

        /**
         *
         * @mbg.generated Tue Mar 17 11:17:11 CST 2020
         */
        private final String jdbcType;

        /**
         *
         * @mbg.generated Tue Mar 17 11:17:11 CST 2020
         */
        public String value() {
            return this.column;
        }

        /**
         *
         * @mbg.generated Tue Mar 17 11:17:11 CST 2020
         */
        public String getValue() {
            return this.column;
        }

        /**
         *
         * @mbg.generated Tue Mar 17 11:17:11 CST 2020
         */
        public String getJavaProperty() {
            return this.javaProperty;
        }

        /**
         *
         * @mbg.generated Tue Mar 17 11:17:11 CST 2020
         */
        public String getJdbcType() {
            return this.jdbcType;
        }

        /**
         *
         * @mbg.generated Tue Mar 17 11:17:11 CST 2020
         */
        Column(String column, String javaProperty, String jdbcType, boolean isColumnNameDelimited) {
            this.column = column;
            this.javaProperty = javaProperty;
            this.jdbcType = jdbcType;
            this.isColumnNameDelimited = isColumnNameDelimited;
        }

        /**
         *
         * @mbg.generated Tue Mar 17 11:17:11 CST 2020
         */
        public String desc() {
            return this.getEscapedColumnName() + " DESC";
        }

        /**
         *
         * @mbg.generated Tue Mar 17 11:17:11 CST 2020
         */
        public String asc() {
            return this.getEscapedColumnName() + " ASC";
        }

        /**
         *
         * @mbg.generated Tue Mar 17 11:17:11 CST 2020
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
         * @mbg.generated Tue Mar 17 11:17:11 CST 2020
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
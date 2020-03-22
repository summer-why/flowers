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
public class Orders implements Serializable {
    /**
     *
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    private Integer order_number;

    /**
     *
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    private Integer number;

    /**
     *
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    private Date create_time;

    /**
     *
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    private Date update_time;

    /**
     *
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    private Double sum_price;

    /**
     *
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    private Integer status;

    /**
     *
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    private Integer user_id;

    /**
     *
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    private Integer flower_id;

    /**
     *
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    private Integer address_id;

    private User user;
    private Flowers flowers;
    private Address address;

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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column flowers..orders.order_number
     *
     * @return the value of flowers..orders.order_number
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    public Integer getOrder_number() {
        return order_number;
    }

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    public Orders withOrder_number(Integer order_number) {
        this.setOrder_number(order_number);
        return this;
    }

    /**
     * This method sets the value of the database column flowers..orders.order_number
     *
     * @param order_number the value for flowers..orders.order_number
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    public void setOrder_number(Integer order_number) {
        this.order_number = order_number;
    }

    /**
     * This method returns the value of the database column flowers..orders.number
     *
     * @return the value of flowers..orders.number
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    public Integer getNumber() {
        return number;
    }

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    public Orders withNumber(Integer number) {
        this.setNumber(number);
        return this;
    }

    /**
     * This method sets the value of the database column flowers..orders.number
     *
     * @param number the value for flowers..orders.number
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    public void setNumber(Integer number) {
        this.number = number;
    }

    /**
     * This method returns the value of the database column flowers..orders.create_time
     *
     * @return the value of flowers..orders.create_time
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    public Date getCreate_time() {
        return create_time;
    }

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    public Orders withCreate_time(Date create_time) {
        this.setCreate_time(create_time);
        return this;
    }

    /**
     * This method sets the value of the database column flowers..orders.create_time
     *
     * @param create_time the value for flowers..orders.create_time
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    /**
     * This method returns the value of the database column flowers..orders.update_time
     *
     * @return the value of flowers..orders.update_time
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    public Date getUpdate_time() {
        return update_time;
    }

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    public Orders withUpdate_time(Date update_time) {
        this.setUpdate_time(update_time);
        return this;
    }

    /**
     * This method sets the value of the database column flowers..orders.update_time
     *
     * @param update_time the value for flowers..orders.update_time
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }

    /**
     * This method returns the value of the database column flowers..orders.sum_price
     *
     * @return the value of flowers..orders.sum_price
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    public Double getSum_price() {
        return sum_price;
    }

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    public Orders withSum_price(Double sum_price) {
        this.setSum_price(sum_price);
        return this;
    }

    /**
     * This method sets the value of the database column flowers..orders.sum_price
     *
     * @param sum_price the value for flowers..orders.sum_price
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    public void setSum_price(Double sum_price) {
        this.sum_price = sum_price;
    }

    /**
     * This method returns the value of the database column flowers..orders.status
     *
     * @return the value of flowers..orders.status
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    public Integer getStatus() {
        return status;
    }

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    public Orders withStatus(Integer status) {
        this.setStatus(status);
        return this;
    }

    /**
     * This method sets the value of the database column flowers..orders.status
     *
     * @param status the value for flowers..orders.status
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method returns the value of the database column flowers..orders.user_id
     *
     * @return the value of flowers..orders.user_id
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    public Integer getUser_id() {
        return user_id;
    }

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    public Orders withUser_id(Integer user_id) {
        this.setUser_id(user_id);
        return this;
    }

    /**
     * This method sets the value of the database column flowers..orders.user_id
     *
     * @param user_id the value for flowers..orders.user_id
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    /**
     * This method returns the value of the database column flowers..orders.flower_id
     *
     * @return the value of flowers..orders.flower_id
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    public Integer getFlower_id() {
        return flower_id;
    }

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    public Orders withFlower_id(Integer flower_id) {
        this.setFlower_id(flower_id);
        return this;
    }

    /**
     * This method sets the value of the database column flowers..orders.flower_id
     *
     * @param flower_id the value for flowers..orders.flower_id
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    public void setFlower_id(Integer flower_id) {
        this.flower_id = flower_id;
    }

    /**
     * This method returns the value of the database column flowers..orders.address_id
     *
     * @return the value of flowers..orders.address_id
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    public Integer getAddress_id() {
        return address_id;
    }

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    public Orders withAddress_id(Integer address_id) {
        this.setAddress_id(address_id);
        return this;
    }

    /**
     * This method sets the value of the database column flowers..orders.address_id
     *
     * @param address_id the value for flowers..orders.address_id
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    public void setAddress_id(Integer address_id) {
        this.address_id = address_id;
    }

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", order_number=").append(order_number);
        sb.append(", number=").append(number);
        sb.append(", create_time=").append(create_time);
        sb.append(", update_time=").append(update_time);
        sb.append(", sum_price=").append(sum_price);
        sb.append(", status=").append(status);
        sb.append(", user_id=").append(user_id);
        sb.append(", flower_id=").append(flower_id);
        sb.append(", address_id=").append(address_id);
        sb.append("]");
        return sb.toString();
    }

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
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
        Orders other = (Orders) that;
        return (this.getOrder_number() == null ? other.getOrder_number() == null : this.getOrder_number().equals(other.getOrder_number()))
            && (this.getNumber() == null ? other.getNumber() == null : this.getNumber().equals(other.getNumber()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getUpdate_time() == null ? other.getUpdate_time() == null : this.getUpdate_time().equals(other.getUpdate_time()))
            && (this.getSum_price() == null ? other.getSum_price() == null : this.getSum_price().equals(other.getSum_price()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getUser_id() == null ? other.getUser_id() == null : this.getUser_id().equals(other.getUser_id()))
            && (this.getFlower_id() == null ? other.getFlower_id() == null : this.getFlower_id().equals(other.getFlower_id()))
            && (this.getAddress_id() == null ? other.getAddress_id() == null : this.getAddress_id().equals(other.getAddress_id()));
    }

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOrder_number() == null) ? 0 : getOrder_number().hashCode());
        result = prime * result + ((getNumber() == null) ? 0 : getNumber().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getUpdate_time() == null) ? 0 : getUpdate_time().hashCode());
        result = prime * result + ((getSum_price() == null) ? 0 : getSum_price().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getUser_id() == null) ? 0 : getUser_id().hashCode());
        result = prime * result + ((getFlower_id() == null) ? 0 : getFlower_id().hashCode());
        result = prime * result + ((getAddress_id() == null) ? 0 : getAddress_id().hashCode());
        return result;
    }

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    public enum Column {
        order_number("order_number", "order_number", "INTEGER", false),
        number("number", "number", "INTEGER", false),
        create_time("create_time", "create_time", "TIMESTAMP", false),
        update_time("update_time", "update_time", "TIMESTAMP", false),
        sum_price("sum_price", "sum_price", "DOUBLE", false),
        status("status", "status", "INTEGER", false),
        user_id("user_id", "user_id", "INTEGER", false),
        flower_id("flower_id", "flower_id", "INTEGER", false),
        address_id("address_id", "address_id", "INTEGER", false);

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:13 CST 2020
         */
        private static final String BEGINNING_DELIMITER = "\"";

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:13 CST 2020
         */
        private static final String ENDING_DELIMITER = "\"";

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:13 CST 2020
         */
        private final String column;

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:13 CST 2020
         */
        private final boolean isColumnNameDelimited;

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:13 CST 2020
         */
        private final String javaProperty;

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:13 CST 2020
         */
        private final String jdbcType;

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:13 CST 2020
         */
        public String value() {
            return this.column;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:13 CST 2020
         */
        public String getValue() {
            return this.column;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:13 CST 2020
         */
        public String getJavaProperty() {
            return this.javaProperty;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:13 CST 2020
         */
        public String getJdbcType() {
            return this.jdbcType;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:13 CST 2020
         */
        Column(String column, String javaProperty, String jdbcType, boolean isColumnNameDelimited) {
            this.column = column;
            this.javaProperty = javaProperty;
            this.jdbcType = jdbcType;
            this.isColumnNameDelimited = isColumnNameDelimited;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:13 CST 2020
         */
        public String desc() {
            return this.getEscapedColumnName() + " DESC";
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:13 CST 2020
         */
        public String asc() {
            return this.getEscapedColumnName() + " ASC";
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:13 CST 2020
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
         * @mbg.generated Wed Feb 26 16:28:13 CST 2020
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
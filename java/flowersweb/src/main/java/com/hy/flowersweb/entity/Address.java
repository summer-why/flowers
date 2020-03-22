package com.hy.flowersweb.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created By MBG-GUI-EXTENSION https://github.com/spawpaw/mybatis-generator-gui-extension
 * Description:
 * 
 *
 * @author 
 */
public class Address implements Serializable {
    /**
     *
     *
     * @mbg.generated Thu Mar 19 17:39:39 CST 2020
     */
    private Integer id;

    /**
     *
     *
     * @mbg.generated Thu Mar 19 17:39:39 CST 2020
     */
    private String address;

    /**
     *
     *
     * @mbg.generated Thu Mar 19 17:39:39 CST 2020
     */
    private String address_details;

    /**
     *
     *
     * @mbg.generated Thu Mar 19 17:39:39 CST 2020
     */
    private String phone;

    /**
     *
     *
     * @mbg.generated Thu Mar 19 17:39:39 CST 2020
     */
    private String name;

    /**
     *
     *
     * @mbg.generated Thu Mar 19 17:39:39 CST 2020
     */
    private String postalCode;

    /**
     *
     *
     * @mbg.generated Thu Mar 19 17:39:39 CST 2020
     */
    private String areaCode;

    /**
     *
     *
     * @mbg.generated Thu Mar 19 17:39:39 CST 2020
     */
    private Boolean isDefault;

    /**
     *
     *
     * @mbg.generated Thu Mar 19 17:39:39 CST 2020
     */
    private Integer user_id;

    /**
     *
     *
     * @mbg.generated Thu Mar 19 17:39:39 CST 2020
     */
    private String user_name;

    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    /**
     *
     * @mbg.generated Thu Mar 19 17:39:39 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column flowers..address.id
     *
     * @return the value of flowers..address.id
     *
     * @mbg.generated Thu Mar 19 17:39:39 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     *
     * @mbg.generated Thu Mar 19 17:39:39 CST 2020
     */
    public Address withId(Integer id) {
        this.setId(id);
        return this;
    }

    /**
     * This method sets the value of the database column flowers..address.id
     *
     * @param id the value for flowers..address.id
     *
     * @mbg.generated Thu Mar 19 17:39:39 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column flowers..address.address
     *
     * @return the value of flowers..address.address
     *
     * @mbg.generated Thu Mar 19 17:39:39 CST 2020
     */
    public String getAddress() {
        return address;
    }

    /**
     *
     * @mbg.generated Thu Mar 19 17:39:39 CST 2020
     */
    public Address withAddress(String address) {
        this.setAddress(address);
        return this;
    }

    /**
     * This method sets the value of the database column flowers..address.address
     *
     * @param address the value for flowers..address.address
     *
     * @mbg.generated Thu Mar 19 17:39:39 CST 2020
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * This method returns the value of the database column flowers..address.address_details
     *
     * @return the value of flowers..address.address_details
     *
     * @mbg.generated Thu Mar 19 17:39:39 CST 2020
     */
    public String getAddress_details() {
        return address_details;
    }

    /**
     *
     * @mbg.generated Thu Mar 19 17:39:39 CST 2020
     */
    public Address withAddress_details(String address_details) {
        this.setAddress_details(address_details);
        return this;
    }

    /**
     * This method sets the value of the database column flowers..address.address_details
     *
     * @param address_details the value for flowers..address.address_details
     *
     * @mbg.generated Thu Mar 19 17:39:39 CST 2020
     */
    public void setAddress_details(String address_details) {
        this.address_details = address_details == null ? null : address_details.trim();
    }

    /**
     * This method returns the value of the database column flowers..address.phone
     *
     * @return the value of flowers..address.phone
     *
     * @mbg.generated Thu Mar 19 17:39:39 CST 2020
     */
    public String getPhone() {
        return phone;
    }

    /**
     *
     * @mbg.generated Thu Mar 19 17:39:39 CST 2020
     */
    public Address withPhone(String phone) {
        this.setPhone(phone);
        return this;
    }

    /**
     * This method sets the value of the database column flowers..address.phone
     *
     * @param phone the value for flowers..address.phone
     *
     * @mbg.generated Thu Mar 19 17:39:39 CST 2020
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * This method returns the value of the database column flowers..address.name
     *
     * @return the value of flowers..address.name
     *
     * @mbg.generated Thu Mar 19 17:39:39 CST 2020
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @mbg.generated Thu Mar 19 17:39:39 CST 2020
     */
    public Address withName(String name) {
        this.setName(name);
        return this;
    }

    /**
     * This method sets the value of the database column flowers..address.name
     *
     * @param name the value for flowers..address.name
     *
     * @mbg.generated Thu Mar 19 17:39:39 CST 2020
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method returns the value of the database column flowers..address.postalCode
     *
     * @return the value of flowers..address.postalCode
     *
     * @mbg.generated Thu Mar 19 17:39:39 CST 2020
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     *
     * @mbg.generated Thu Mar 19 17:39:39 CST 2020
     */
    public Address withPostalCode(String postalCode) {
        this.setPostalCode(postalCode);
        return this;
    }

    /**
     * This method sets the value of the database column flowers..address.postalCode
     *
     * @param postalCode the value for flowers..address.postalCode
     *
     * @mbg.generated Thu Mar 19 17:39:39 CST 2020
     */
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode == null ? null : postalCode.trim();
    }

    /**
     * This method returns the value of the database column flowers..address.areaCode
     *
     * @return the value of flowers..address.areaCode
     *
     * @mbg.generated Thu Mar 19 17:39:39 CST 2020
     */
    public String getAreaCode() {
        return areaCode;
    }

    /**
     *
     * @mbg.generated Thu Mar 19 17:39:39 CST 2020
     */
    public Address withAreaCode(String areaCode) {
        this.setAreaCode(areaCode);
        return this;
    }

    /**
     * This method sets the value of the database column flowers..address.areaCode
     *
     * @param areaCode the value for flowers..address.areaCode
     *
     * @mbg.generated Thu Mar 19 17:39:39 CST 2020
     */
    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode == null ? null : areaCode.trim();
    }

    /**
     * This method returns the value of the database column flowers..address.isDefault
     *
     * @return the value of flowers..address.isDefault
     *
     * @mbg.generated Thu Mar 19 17:39:39 CST 2020
     */
    public Boolean getIsDefault() {
        return isDefault;
    }

    /**
     *
     * @mbg.generated Thu Mar 19 17:39:39 CST 2020
     */
    public Address withIsDefault(Boolean isDefault) {
        this.setIsDefault(isDefault);
        return this;
    }

    /**
     * This method sets the value of the database column flowers..address.isDefault
     *
     * @param isDefault the value for flowers..address.isDefault
     *
     * @mbg.generated Thu Mar 19 17:39:39 CST 2020
     */
    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    /**
     * This method returns the value of the database column flowers..address.user_id
     *
     * @return the value of flowers..address.user_id
     *
     * @mbg.generated Thu Mar 19 17:39:39 CST 2020
     */
    public Integer getUser_id() {
        return user_id;
    }

    /**
     *
     * @mbg.generated Thu Mar 19 17:39:39 CST 2020
     */
    public Address withUser_id(Integer user_id) {
        this.setUser_id(user_id);
        return this;
    }

    /**
     * This method sets the value of the database column flowers..address.user_id
     *
     * @param user_id the value for flowers..address.user_id
     *
     * @mbg.generated Thu Mar 19 17:39:39 CST 2020
     */
    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    /**
     * This method returns the value of the database column flowers..address.user_name
     *
     * @return the value of flowers..address.user_name
     *
     * @mbg.generated Thu Mar 19 17:39:39 CST 2020
     */
    public String getUser_name() {
        return user_name;
    }

    /**
     *
     * @mbg.generated Thu Mar 19 17:39:39 CST 2020
     */
    public Address withUser_name(String user_name) {
        this.setUser_name(user_name);
        return this;
    }

    /**
     * This method sets the value of the database column flowers..address.user_name
     *
     * @param user_name the value for flowers..address.user_name
     *
     * @mbg.generated Thu Mar 19 17:39:39 CST 2020
     */
    public void setUser_name(String user_name) {
        this.user_name = user_name == null ? null : user_name.trim();
    }

    /**
     *
     * @mbg.generated Thu Mar 19 17:39:39 CST 2020
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", address=").append(address);
        sb.append(", address_details=").append(address_details);
        sb.append(", phone=").append(phone);
        sb.append(", name=").append(name);
        sb.append(", postalCode=").append(postalCode);
        sb.append(", areaCode=").append(areaCode);
        sb.append(", isDefault=").append(isDefault);
        sb.append(", user_id=").append(user_id);
        sb.append(", user_name=").append(user_name);
        sb.append("]");
        return sb.toString();
    }

    /**
     *
     * @mbg.generated Thu Mar 19 17:39:39 CST 2020
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
        Address other = (Address) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getAddress_details() == null ? other.getAddress_details() == null : this.getAddress_details().equals(other.getAddress_details()))
            && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getPostalCode() == null ? other.getPostalCode() == null : this.getPostalCode().equals(other.getPostalCode()))
            && (this.getAreaCode() == null ? other.getAreaCode() == null : this.getAreaCode().equals(other.getAreaCode()))
            && (this.getIsDefault() == null ? other.getIsDefault() == null : this.getIsDefault().equals(other.getIsDefault()))
            && (this.getUser_id() == null ? other.getUser_id() == null : this.getUser_id().equals(other.getUser_id()))
            && (this.getUser_name() == null ? other.getUser_name() == null : this.getUser_name().equals(other.getUser_name()));
    }

    /**
     *
     * @mbg.generated Thu Mar 19 17:39:39 CST 2020
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getAddress_details() == null) ? 0 : getAddress_details().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getPostalCode() == null) ? 0 : getPostalCode().hashCode());
        result = prime * result + ((getAreaCode() == null) ? 0 : getAreaCode().hashCode());
        result = prime * result + ((getIsDefault() == null) ? 0 : getIsDefault().hashCode());
        result = prime * result + ((getUser_id() == null) ? 0 : getUser_id().hashCode());
        result = prime * result + ((getUser_name() == null) ? 0 : getUser_name().hashCode());
        return result;
    }

    /**
     *
     * @mbg.generated Thu Mar 19 17:39:39 CST 2020
     */
    public enum Column {
        id("id", "id", "INTEGER", false),
        address("address", "address", "VARCHAR", false),
        address_details("address_details", "address_details", "VARCHAR", false),
        phone("phone", "phone", "VARCHAR", false),
        name("name", "name", "VARCHAR", false),
        postalCode("postalCode", "postalCode", "VARCHAR", false),
        areaCode("areaCode", "areaCode", "VARCHAR", false),
        isDefault("isDefault", "isDefault", "BIT", false),
        user_id("user_id", "user_id", "INTEGER", false),
        user_name("user_name", "user_name", "VARCHAR", false);

        /**
         *
         * @mbg.generated Thu Mar 19 17:39:39 CST 2020
         */
        private static final String BEGINNING_DELIMITER = "\"";

        /**
         *
         * @mbg.generated Thu Mar 19 17:39:39 CST 2020
         */
        private static final String ENDING_DELIMITER = "\"";

        /**
         *
         * @mbg.generated Thu Mar 19 17:39:39 CST 2020
         */
        private final String column;

        /**
         *
         * @mbg.generated Thu Mar 19 17:39:39 CST 2020
         */
        private final boolean isColumnNameDelimited;

        /**
         *
         * @mbg.generated Thu Mar 19 17:39:39 CST 2020
         */
        private final String javaProperty;

        /**
         *
         * @mbg.generated Thu Mar 19 17:39:39 CST 2020
         */
        private final String jdbcType;

        /**
         *
         * @mbg.generated Thu Mar 19 17:39:39 CST 2020
         */
        public String value() {
            return this.column;
        }

        /**
         *
         * @mbg.generated Thu Mar 19 17:39:39 CST 2020
         */
        public String getValue() {
            return this.column;
        }

        /**
         *
         * @mbg.generated Thu Mar 19 17:39:39 CST 2020
         */
        public String getJavaProperty() {
            return this.javaProperty;
        }

        /**
         *
         * @mbg.generated Thu Mar 19 17:39:39 CST 2020
         */
        public String getJdbcType() {
            return this.jdbcType;
        }

        /**
         *
         * @mbg.generated Thu Mar 19 17:39:39 CST 2020
         */
        Column(String column, String javaProperty, String jdbcType, boolean isColumnNameDelimited) {
            this.column = column;
            this.javaProperty = javaProperty;
            this.jdbcType = jdbcType;
            this.isColumnNameDelimited = isColumnNameDelimited;
        }

        /**
         *
         * @mbg.generated Thu Mar 19 17:39:39 CST 2020
         */
        public String desc() {
            return this.getEscapedColumnName() + " DESC";
        }

        /**
         *
         * @mbg.generated Thu Mar 19 17:39:39 CST 2020
         */
        public String asc() {
            return this.getEscapedColumnName() + " ASC";
        }

        /**
         *
         * @mbg.generated Thu Mar 19 17:39:39 CST 2020
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
         * @mbg.generated Thu Mar 19 17:39:39 CST 2020
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
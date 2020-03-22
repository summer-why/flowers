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
public class Store implements Serializable {
    /**
     *
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    private Integer id;

    /**
     *
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    private String username;

    /**
     *
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    private String password;

    /**
     *
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    private String phone;

    /**
     *
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    private String realname;

    /**
     *
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    private String id_card;

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
    private String store_name;

    /**
     *
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    private String cover;

    /**
     *
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    private Integer role;

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column flowers..store.id
     *
     * @return the value of flowers..store.id
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    public Store withId(Integer id) {
        this.setId(id);
        return this;
    }

    /**
     * This method sets the value of the database column flowers..store.id
     *
     * @param id the value for flowers..store.id
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column flowers..store.username
     *
     * @return the value of flowers..store.username
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    public String getUsername() {
        return username;
    }

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    public Store withUsername(String username) {
        this.setUsername(username);
        return this;
    }

    /**
     * This method sets the value of the database column flowers..store.username
     *
     * @param username the value for flowers..store.username
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method returns the value of the database column flowers..store.password
     *
     * @return the value of flowers..store.password
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    public String getPassword() {
        return password;
    }

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    public Store withPassword(String password) {
        this.setPassword(password);
        return this;
    }

    /**
     * This method sets the value of the database column flowers..store.password
     *
     * @param password the value for flowers..store.password
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method returns the value of the database column flowers..store.phone
     *
     * @return the value of flowers..store.phone
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    public String getPhone() {
        return phone;
    }

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    public Store withPhone(String phone) {
        this.setPhone(phone);
        return this;
    }

    /**
     * This method sets the value of the database column flowers..store.phone
     *
     * @param phone the value for flowers..store.phone
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * This method returns the value of the database column flowers..store.realname
     *
     * @return the value of flowers..store.realname
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    public String getRealname() {
        return realname;
    }

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    public Store withRealname(String realname) {
        this.setRealname(realname);
        return this;
    }

    /**
     * This method sets the value of the database column flowers..store.realname
     *
     * @param realname the value for flowers..store.realname
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }

    /**
     * This method returns the value of the database column flowers..store.id_card
     *
     * @return the value of flowers..store.id_card
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    public String getId_card() {
        return id_card;
    }

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    public Store withId_card(String id_card) {
        this.setId_card(id_card);
        return this;
    }

    /**
     * This method sets the value of the database column flowers..store.id_card
     *
     * @param id_card the value for flowers..store.id_card
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    public void setId_card(String id_card) {
        this.id_card = id_card == null ? null : id_card.trim();
    }

    /**
     * This method returns the value of the database column flowers..store.create_time
     *
     * @return the value of flowers..store.create_time
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
    public Store withCreate_time(Date create_time) {
        this.setCreate_time(create_time);
        return this;
    }

    /**
     * This method sets the value of the database column flowers..store.create_time
     *
     * @param create_time the value for flowers..store.create_time
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    /**
     * This method returns the value of the database column flowers..store.update_time
     *
     * @return the value of flowers..store.update_time
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
    public Store withUpdate_time(Date update_time) {
        this.setUpdate_time(update_time);
        return this;
    }

    /**
     * This method sets the value of the database column flowers..store.update_time
     *
     * @param update_time the value for flowers..store.update_time
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }

    /**
     * This method returns the value of the database column flowers..store.store_name
     *
     * @return the value of flowers..store.store_name
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    public String getStore_name() {
        return store_name;
    }

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    public Store withStore_name(String store_name) {
        this.setStore_name(store_name);
        return this;
    }

    /**
     * This method sets the value of the database column flowers..store.store_name
     *
     * @param store_name the value for flowers..store.store_name
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    public void setStore_name(String store_name) {
        this.store_name = store_name == null ? null : store_name.trim();
    }

    /**
     * This method returns the value of the database column flowers..store.cover
     *
     * @return the value of flowers..store.cover
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    public String getCover() {
        return cover;
    }

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    public Store withCover(String cover) {
        this.setCover(cover);
        return this;
    }

    /**
     * This method sets the value of the database column flowers..store.cover
     *
     * @param cover the value for flowers..store.cover
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    public void setCover(String cover) {
        this.cover = cover == null ? null : cover.trim();
    }

    /**
     * This method returns the value of the database column flowers..store.role
     *
     * @return the value of flowers..store.role
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    public Integer getRole() {
        return role;
    }

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    public Store withRole(Integer role) {
        this.setRole(role);
        return this;
    }

    /**
     * This method sets the value of the database column flowers..store.role
     *
     * @param role the value for flowers..store.role
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    public void setRole(Integer role) {
        this.role = role;
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
        sb.append(", id=").append(id);
        sb.append(", username=").append(username);
        sb.append(", password=").append(password);
        sb.append(", phone=").append(phone);
        sb.append(", realname=").append(realname);
        sb.append(", id_card=").append(id_card);
        sb.append(", create_time=").append(create_time);
        sb.append(", update_time=").append(update_time);
        sb.append(", store_name=").append(store_name);
        sb.append(", cover=").append(cover);
        sb.append(", role=").append(role);
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
        Store other = (Store) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUsername() == null ? other.getUsername() == null : this.getUsername().equals(other.getUsername()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()))
            && (this.getRealname() == null ? other.getRealname() == null : this.getRealname().equals(other.getRealname()))
            && (this.getId_card() == null ? other.getId_card() == null : this.getId_card().equals(other.getId_card()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getUpdate_time() == null ? other.getUpdate_time() == null : this.getUpdate_time().equals(other.getUpdate_time()))
            && (this.getStore_name() == null ? other.getStore_name() == null : this.getStore_name().equals(other.getStore_name()))
            && (this.getCover() == null ? other.getCover() == null : this.getCover().equals(other.getCover()))
            && (this.getRole() == null ? other.getRole() == null : this.getRole().equals(other.getRole()));
    }

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUsername() == null) ? 0 : getUsername().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
        result = prime * result + ((getRealname() == null) ? 0 : getRealname().hashCode());
        result = prime * result + ((getId_card() == null) ? 0 : getId_card().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getUpdate_time() == null) ? 0 : getUpdate_time().hashCode());
        result = prime * result + ((getStore_name() == null) ? 0 : getStore_name().hashCode());
        result = prime * result + ((getCover() == null) ? 0 : getCover().hashCode());
        result = prime * result + ((getRole() == null) ? 0 : getRole().hashCode());
        return result;
    }

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    public enum Column {
        id("id", "id", "INTEGER", false),
        username("username", "username", "VARCHAR", false),
        password("password", "password", "VARCHAR", false),
        phone("phone", "phone", "VARCHAR", false),
        realname("realname", "realname", "VARCHAR", false),
        id_card("id_card", "id_card", "VARCHAR", false),
        create_time("create_time", "create_time", "TIMESTAMP", false),
        update_time("update_time", "update_time", "TIMESTAMP", false),
        store_name("store_name", "store_name", "VARCHAR", false),
        cover("cover", "cover", "VARCHAR", false),
        role("role", "role", "INTEGER", false);

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
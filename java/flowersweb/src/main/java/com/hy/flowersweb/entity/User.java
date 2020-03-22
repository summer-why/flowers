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
public class User implements Serializable {
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
    private String telephone;

    /**
     *
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    private String sex;

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
    private Integer role;

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column flowers..user.id
     *
     * @return the value of flowers..user.id
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
    public User withId(Integer id) {
        this.setId(id);
        return this;
    }

    /**
     * This method sets the value of the database column flowers..user.id
     *
     * @param id the value for flowers..user.id
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column flowers..user.username
     *
     * @return the value of flowers..user.username
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
    public User withUsername(String username) {
        this.setUsername(username);
        return this;
    }

    /**
     * This method sets the value of the database column flowers..user.username
     *
     * @param username the value for flowers..user.username
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method returns the value of the database column flowers..user.password
     *
     * @return the value of flowers..user.password
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
    public User withPassword(String password) {
        this.setPassword(password);
        return this;
    }

    /**
     * This method sets the value of the database column flowers..user.password
     *
     * @param password the value for flowers..user.password
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method returns the value of the database column flowers..user.telephone
     *
     * @return the value of flowers..user.telephone
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    public User withTelephone(String telephone) {
        this.setTelephone(telephone);
        return this;
    }

    /**
     * This method sets the value of the database column flowers..user.telephone
     *
     * @param telephone the value for flowers..user.telephone
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    /**
     * This method returns the value of the database column flowers..user.sex
     *
     * @return the value of flowers..user.sex
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    public String getSex() {
        return sex;
    }

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    public User withSex(String sex) {
        this.setSex(sex);
        return this;
    }

    /**
     * This method sets the value of the database column flowers..user.sex
     *
     * @param sex the value for flowers..user.sex
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    /**
     * This method returns the value of the database column flowers..user.create_time
     *
     * @return the value of flowers..user.create_time
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
    public User withCreate_time(Date create_time) {
        this.setCreate_time(create_time);
        return this;
    }

    /**
     * This method sets the value of the database column flowers..user.create_time
     *
     * @param create_time the value for flowers..user.create_time
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    /**
     * This method returns the value of the database column flowers..user.update_time
     *
     * @return the value of flowers..user.update_time
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
    public User withUpdate_time(Date update_time) {
        this.setUpdate_time(update_time);
        return this;
    }

    /**
     * This method sets the value of the database column flowers..user.update_time
     *
     * @param update_time the value for flowers..user.update_time
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }

    /**
     * This method returns the value of the database column flowers..user.role
     *
     * @return the value of flowers..user.role
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
    public User withRole(Integer role) {
        this.setRole(role);
        return this;
    }

    /**
     * This method sets the value of the database column flowers..user.role
     *
     * @param role the value for flowers..user.role
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
        sb.append(", telephone=").append(telephone);
        sb.append(", sex=").append(sex);
        sb.append(", create_time=").append(create_time);
        sb.append(", update_time=").append(update_time);
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
        User other = (User) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUsername() == null ? other.getUsername() == null : this.getUsername().equals(other.getUsername()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getTelephone() == null ? other.getTelephone() == null : this.getTelephone().equals(other.getTelephone()))
            && (this.getSex() == null ? other.getSex() == null : this.getSex().equals(other.getSex()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getUpdate_time() == null ? other.getUpdate_time() == null : this.getUpdate_time().equals(other.getUpdate_time()))
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
        result = prime * result + ((getTelephone() == null) ? 0 : getTelephone().hashCode());
        result = prime * result + ((getSex() == null) ? 0 : getSex().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getUpdate_time() == null) ? 0 : getUpdate_time().hashCode());
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
        telephone("telephone", "telephone", "VARCHAR", false),
        sex("sex", "sex", "VARCHAR", false),
        create_time("create_time", "create_time", "TIMESTAMP", false),
        update_time("update_time", "update_time", "TIMESTAMP", false),
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
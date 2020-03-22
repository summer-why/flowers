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
public class Comment implements Serializable {
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
    private String content;

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
    private Integer flower_id;

    /**
     *
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    private Integer user_id;

    private Flowers flowers;
    private User user;

    public Flowers getFlowers() {
        return flowers;
    }

    public void setFlowers(Flowers flowers) {
        this.flowers = flowers;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column flowers..comment.id
     *
     * @return the value of flowers..comment.id
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
    public Comment withId(Integer id) {
        this.setId(id);
        return this;
    }

    /**
     * This method sets the value of the database column flowers..comment.id
     *
     * @param id the value for flowers..comment.id
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column flowers..comment.content
     *
     * @return the value of flowers..comment.content
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    public String getContent() {
        return content;
    }

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    public Comment withContent(String content) {
        this.setContent(content);
        return this;
    }

    /**
     * This method sets the value of the database column flowers..comment.content
     *
     * @param content the value for flowers..comment.content
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method returns the value of the database column flowers..comment.create_time
     *
     * @return the value of flowers..comment.create_time
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
    public Comment withCreate_time(Date create_time) {
        this.setCreate_time(create_time);
        return this;
    }

    /**
     * This method sets the value of the database column flowers..comment.create_time
     *
     * @param create_time the value for flowers..comment.create_time
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    /**
     * This method returns the value of the database column flowers..comment.update_time
     *
     * @return the value of flowers..comment.update_time
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
    public Comment withUpdate_time(Date update_time) {
        this.setUpdate_time(update_time);
        return this;
    }

    /**
     * This method sets the value of the database column flowers..comment.update_time
     *
     * @param update_time the value for flowers..comment.update_time
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }

    /**
     * This method returns the value of the database column flowers..comment.flower_id
     *
     * @return the value of flowers..comment.flower_id
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
    public Comment withFlower_id(Integer flower_id) {
        this.setFlower_id(flower_id);
        return this;
    }

    /**
     * This method sets the value of the database column flowers..comment.flower_id
     *
     * @param flower_id the value for flowers..comment.flower_id
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    public void setFlower_id(Integer flower_id) {
        this.flower_id = flower_id;
    }

    /**
     * This method returns the value of the database column flowers..comment.user_id
     *
     * @return the value of flowers..comment.user_id
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
    public Comment withUser_id(Integer user_id) {
        this.setUser_id(user_id);
        return this;
    }

    /**
     * This method sets the value of the database column flowers..comment.user_id
     *
     * @param user_id the value for flowers..comment.user_id
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
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
        sb.append(", content=").append(content);
        sb.append(", create_time=").append(create_time);
        sb.append(", update_time=").append(update_time);
        sb.append(", flower_id=").append(flower_id);
        sb.append(", user_id=").append(user_id);
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
        Comment other = (Comment) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getUpdate_time() == null ? other.getUpdate_time() == null : this.getUpdate_time().equals(other.getUpdate_time()))
            && (this.getFlower_id() == null ? other.getFlower_id() == null : this.getFlower_id().equals(other.getFlower_id()))
            && (this.getUser_id() == null ? other.getUser_id() == null : this.getUser_id().equals(other.getUser_id()));
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
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getUpdate_time() == null) ? 0 : getUpdate_time().hashCode());
        result = prime * result + ((getFlower_id() == null) ? 0 : getFlower_id().hashCode());
        result = prime * result + ((getUser_id() == null) ? 0 : getUser_id().hashCode());
        return result;
    }

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:13 CST 2020
     */
    public enum Column {
        id("id", "id", "INTEGER", false),
        content("content", "content", "VARCHAR", false),
        create_time("create_time", "create_time", "TIMESTAMP", false),
        update_time("update_time", "update_time", "TIMESTAMP", false),
        flower_id("flower_id", "flower_id", "INTEGER", false),
        user_id("user_id", "user_id", "INTEGER", false);

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
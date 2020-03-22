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
public class Flowers implements Serializable {
    /**
     *
     *
     * @mbg.generated Wed Feb 26 16:28:12 CST 2020
     */
    private Integer id;

    /**
     *
     *
     * @mbg.generated Wed Feb 26 16:28:12 CST 2020
     */
    private String flower_name;

    /**
     *
     *
     * @mbg.generated Wed Feb 26 16:28:12 CST 2020
     */
    private String cover;

    /**
     *
     *
     * @mbg.generated Wed Feb 26 16:28:12 CST 2020
     */
    private String title;

    /**
     *
     *
     * @mbg.generated Wed Feb 26 16:28:12 CST 2020
     */
    private String main_image;

    /**
     *
     *
     * @mbg.generated Wed Feb 26 16:28:12 CST 2020
     */
    private Double price;

    /**
     *
     *
     * @mbg.generated Wed Feb 26 16:28:12 CST 2020
     */
    private String stock;

    /**
     *
     *
     * @mbg.generated Wed Feb 26 16:28:12 CST 2020
     */
    private Integer status;

    /**
     *
     *
     * @mbg.generated Wed Feb 26 16:28:12 CST 2020
     */
    private Date create_time;

    /**
     *
     *
     * @mbg.generated Wed Feb 26 16:28:12 CST 2020
     */
    private Date update_time;

    /**
     *
     *
     * @mbg.generated Wed Feb 26 16:28:12 CST 2020
     */
    private String flower_language;

    /**
     *
     *
     * @mbg.generated Wed Feb 26 16:28:12 CST 2020
     */
    private String flower_material;

    /**
     *
     *
     * @mbg.generated Wed Feb 26 16:28:12 CST 2020
     */
    private Integer category_id;

    /**
     *
     *
     * @mbg.generated Wed Feb 26 16:28:12 CST 2020
     */
    private Integer store_id;

    private Category category;
    private Store store;

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    /**
     *
     *
     * @mbg.generated Wed Feb 26 16:28:12 CST 2020
     */
    private String detail;

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:12 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column flowers..flowers.id
     *
     * @return the value of flowers..flowers.id
     *
     * @mbg.generated Wed Feb 26 16:28:12 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:12 CST 2020
     */
    public Flowers withId(Integer id) {
        this.setId(id);
        return this;
    }

    /**
     * This method sets the value of the database column flowers..flowers.id
     *
     * @param id the value for flowers..flowers.id
     *
     * @mbg.generated Wed Feb 26 16:28:12 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column flowers..flowers.flower_name
     *
     * @return the value of flowers..flowers.flower_name
     *
     * @mbg.generated Wed Feb 26 16:28:12 CST 2020
     */
    public String getFlower_name() {
        return flower_name;
    }

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:12 CST 2020
     */
    public Flowers withFlower_name(String flower_name) {
        this.setFlower_name(flower_name);
        return this;
    }

    /**
     * This method sets the value of the database column flowers..flowers.flower_name
     *
     * @param flower_name the value for flowers..flowers.flower_name
     *
     * @mbg.generated Wed Feb 26 16:28:12 CST 2020
     */
    public void setFlower_name(String flower_name) {
        this.flower_name = flower_name == null ? null : flower_name.trim();
    }

    /**
     * This method returns the value of the database column flowers..flowers.cover
     *
     * @return the value of flowers..flowers.cover
     *
     * @mbg.generated Wed Feb 26 16:28:12 CST 2020
     */
    public String getCover() {
        return cover;
    }

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:12 CST 2020
     */
    public Flowers withCover(String cover) {
        this.setCover(cover);
        return this;
    }

    /**
     * This method sets the value of the database column flowers..flowers.cover
     *
     * @param cover the value for flowers..flowers.cover
     *
     * @mbg.generated Wed Feb 26 16:28:12 CST 2020
     */
    public void setCover(String cover) {
        this.cover = cover == null ? null : cover.trim();
    }

    /**
     * This method returns the value of the database column flowers..flowers.title
     *
     * @return the value of flowers..flowers.title
     *
     * @mbg.generated Wed Feb 26 16:28:12 CST 2020
     */
    public String getTitle() {
        return title;
    }

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:12 CST 2020
     */
    public Flowers withTitle(String title) {
        this.setTitle(title);
        return this;
    }

    /**
     * This method sets the value of the database column flowers..flowers.title
     *
     * @param title the value for flowers..flowers.title
     *
     * @mbg.generated Wed Feb 26 16:28:12 CST 2020
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method returns the value of the database column flowers..flowers.main_image
     *
     * @return the value of flowers..flowers.main_image
     *
     * @mbg.generated Wed Feb 26 16:28:12 CST 2020
     */
    public String getMain_image() {
        return main_image;
    }

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:12 CST 2020
     */
    public Flowers withMain_image(String main_image) {
        this.setMain_image(main_image);
        return this;
    }

    /**
     * This method sets the value of the database column flowers..flowers.main_image
     *
     * @param main_image the value for flowers..flowers.main_image
     *
     * @mbg.generated Wed Feb 26 16:28:12 CST 2020
     */
    public void setMain_image(String main_image) {
        this.main_image = main_image == null ? null : main_image.trim();
    }

    /**
     * This method returns the value of the database column flowers..flowers.price
     *
     * @return the value of flowers..flowers.price
     *
     * @mbg.generated Wed Feb 26 16:28:12 CST 2020
     */
    public Double getPrice() {
        return price;
    }

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:12 CST 2020
     */
    public Flowers withPrice(Double price) {
        this.setPrice(price);
        return this;
    }

    /**
     * This method sets the value of the database column flowers..flowers.price
     *
     * @param price the value for flowers..flowers.price
     *
     * @mbg.generated Wed Feb 26 16:28:12 CST 2020
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * This method returns the value of the database column flowers..flowers.stock
     *
     * @return the value of flowers..flowers.stock
     *
     * @mbg.generated Wed Feb 26 16:28:12 CST 2020
     */
    public String getStock() {
        return stock;
    }

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:12 CST 2020
     */
    public Flowers withStock(String stock) {
        this.setStock(stock);
        return this;
    }

    /**
     * This method sets the value of the database column flowers..flowers.stock
     *
     * @param stock the value for flowers..flowers.stock
     *
     * @mbg.generated Wed Feb 26 16:28:12 CST 2020
     */
    public void setStock(String stock) {
        this.stock = stock == null ? null : stock.trim();
    }

    /**
     * This method returns the value of the database column flowers..flowers.status
     *
     * @return the value of flowers..flowers.status
     *
     * @mbg.generated Wed Feb 26 16:28:12 CST 2020
     */
    public Integer getStatus() {
        return status;
    }

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:12 CST 2020
     */
    public Flowers withStatus(Integer status) {
        this.setStatus(status);
        return this;
    }

    /**
     * This method sets the value of the database column flowers..flowers.status
     *
     * @param status the value for flowers..flowers.status
     *
     * @mbg.generated Wed Feb 26 16:28:12 CST 2020
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method returns the value of the database column flowers..flowers.create_time
     *
     * @return the value of flowers..flowers.create_time
     *
     * @mbg.generated Wed Feb 26 16:28:12 CST 2020
     */
    public Date getCreate_time() {
        return create_time;
    }

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:12 CST 2020
     */
    public Flowers withCreate_time(Date create_time) {
        this.setCreate_time(create_time);
        return this;
    }

    /**
     * This method sets the value of the database column flowers..flowers.create_time
     *
     * @param create_time the value for flowers..flowers.create_time
     *
     * @mbg.generated Wed Feb 26 16:28:12 CST 2020
     */
    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    /**
     * This method returns the value of the database column flowers..flowers.update_time
     *
     * @return the value of flowers..flowers.update_time
     *
     * @mbg.generated Wed Feb 26 16:28:12 CST 2020
     */
    public Date getUpdate_time() {
        return update_time;
    }

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:12 CST 2020
     */
    public Flowers withUpdate_time(Date update_time) {
        this.setUpdate_time(update_time);
        return this;
    }

    /**
     * This method sets the value of the database column flowers..flowers.update_time
     *
     * @param update_time the value for flowers..flowers.update_time
     *
     * @mbg.generated Wed Feb 26 16:28:12 CST 2020
     */
    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }

    /**
     * This method returns the value of the database column flowers..flowers.flower_language
     *
     * @return the value of flowers..flowers.flower_language
     *
     * @mbg.generated Wed Feb 26 16:28:12 CST 2020
     */
    public String getFlower_language() {
        return flower_language;
    }

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:12 CST 2020
     */
    public Flowers withFlower_language(String flower_language) {
        this.setFlower_language(flower_language);
        return this;
    }

    /**
     * This method sets the value of the database column flowers..flowers.flower_language
     *
     * @param flower_language the value for flowers..flowers.flower_language
     *
     * @mbg.generated Wed Feb 26 16:28:12 CST 2020
     */
    public void setFlower_language(String flower_language) {
        this.flower_language = flower_language == null ? null : flower_language.trim();
    }

    /**
     * This method returns the value of the database column flowers..flowers.flower_material
     *
     * @return the value of flowers..flowers.flower_material
     *
     * @mbg.generated Wed Feb 26 16:28:12 CST 2020
     */
    public String getFlower_material() {
        return flower_material;
    }

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:12 CST 2020
     */
    public Flowers withFlower_material(String flower_material) {
        this.setFlower_material(flower_material);
        return this;
    }

    /**
     * This method sets the value of the database column flowers..flowers.flower_material
     *
     * @param flower_material the value for flowers..flowers.flower_material
     *
     * @mbg.generated Wed Feb 26 16:28:12 CST 2020
     */
    public void setFlower_material(String flower_material) {
        this.flower_material = flower_material == null ? null : flower_material.trim();
    }

    /**
     * This method returns the value of the database column flowers..flowers.category_id
     *
     * @return the value of flowers..flowers.category_id
     *
     * @mbg.generated Wed Feb 26 16:28:12 CST 2020
     */
    public Integer getCategory_id() {
        return category_id;
    }

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:12 CST 2020
     */
    public Flowers withCategory_id(Integer category_id) {
        this.setCategory_id(category_id);
        return this;
    }

    /**
     * This method sets the value of the database column flowers..flowers.category_id
     *
     * @param category_id the value for flowers..flowers.category_id
     *
     * @mbg.generated Wed Feb 26 16:28:12 CST 2020
     */
    public void setCategory_id(Integer category_id) {
        this.category_id = category_id;
    }

    /**
     * This method returns the value of the database column flowers..flowers.store_id
     *
     * @return the value of flowers..flowers.store_id
     *
     * @mbg.generated Wed Feb 26 16:28:12 CST 2020
     */
    public Integer getStore_id() {
        return store_id;
    }

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:12 CST 2020
     */
    public Flowers withStore_id(Integer store_id) {
        this.setStore_id(store_id);
        return this;
    }

    /**
     * This method sets the value of the database column flowers..flowers.store_id
     *
     * @param store_id the value for flowers..flowers.store_id
     *
     * @mbg.generated Wed Feb 26 16:28:12 CST 2020
     */
    public void setStore_id(Integer store_id) {
        this.store_id = store_id;
    }

    /**
     * This method returns the value of the database column flowers..flowers.detail
     *
     * @return the value of flowers..flowers.detail
     *
     * @mbg.generated Wed Feb 26 16:28:12 CST 2020
     */
    public String getDetail() {
        return detail;
    }

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:12 CST 2020
     */
    public Flowers withDetail(String detail) {
        this.setDetail(detail);
        return this;
    }

    /**
     * This method sets the value of the database column flowers..flowers.detail
     *
     * @param detail the value for flowers..flowers.detail
     *
     * @mbg.generated Wed Feb 26 16:28:12 CST 2020
     */
    public void setDetail(String detail) {
        this.detail = detail == null ? null : detail.trim();
    }

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:12 CST 2020
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", flower_name=").append(flower_name);
        sb.append(", cover=").append(cover);
        sb.append(", title=").append(title);
        sb.append(", main_image=").append(main_image);
        sb.append(", price=").append(price);
        sb.append(", stock=").append(stock);
        sb.append(", status=").append(status);
        sb.append(", create_time=").append(create_time);
        sb.append(", update_time=").append(update_time);
        sb.append(", flower_language=").append(flower_language);
        sb.append(", flower_material=").append(flower_material);
        sb.append(", category_id=").append(category_id);
        sb.append(", store_id=").append(store_id);
        sb.append(", detail=").append(detail);
        sb.append("]");
        return sb.toString();
    }

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:12 CST 2020
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
        Flowers other = (Flowers) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getFlower_name() == null ? other.getFlower_name() == null : this.getFlower_name().equals(other.getFlower_name()))
            && (this.getCover() == null ? other.getCover() == null : this.getCover().equals(other.getCover()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getMain_image() == null ? other.getMain_image() == null : this.getMain_image().equals(other.getMain_image()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getStock() == null ? other.getStock() == null : this.getStock().equals(other.getStock()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getUpdate_time() == null ? other.getUpdate_time() == null : this.getUpdate_time().equals(other.getUpdate_time()))
            && (this.getFlower_language() == null ? other.getFlower_language() == null : this.getFlower_language().equals(other.getFlower_language()))
            && (this.getFlower_material() == null ? other.getFlower_material() == null : this.getFlower_material().equals(other.getFlower_material()))
            && (this.getCategory_id() == null ? other.getCategory_id() == null : this.getCategory_id().equals(other.getCategory_id()))
            && (this.getStore_id() == null ? other.getStore_id() == null : this.getStore_id().equals(other.getStore_id()))
            && (this.getDetail() == null ? other.getDetail() == null : this.getDetail().equals(other.getDetail()));
    }

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:12 CST 2020
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getFlower_name() == null) ? 0 : getFlower_name().hashCode());
        result = prime * result + ((getCover() == null) ? 0 : getCover().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getMain_image() == null) ? 0 : getMain_image().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getStock() == null) ? 0 : getStock().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getUpdate_time() == null) ? 0 : getUpdate_time().hashCode());
        result = prime * result + ((getFlower_language() == null) ? 0 : getFlower_language().hashCode());
        result = prime * result + ((getFlower_material() == null) ? 0 : getFlower_material().hashCode());
        result = prime * result + ((getCategory_id() == null) ? 0 : getCategory_id().hashCode());
        result = prime * result + ((getStore_id() == null) ? 0 : getStore_id().hashCode());
        result = prime * result + ((getDetail() == null) ? 0 : getDetail().hashCode());
        return result;
    }

    /**
     *
     * @mbg.generated Wed Feb 26 16:28:12 CST 2020
     */
    public enum Column {
        id("id", "id", "INTEGER", false),
        flower_name("flower_name", "flower_name", "VARCHAR", false),
        cover("cover", "cover", "VARCHAR", false),
        title("title", "title", "VARCHAR", false),
        main_image("main_image", "main_image", "VARCHAR", false),
        price("price", "price", "DOUBLE", false),
        stock("stock", "stock", "VARCHAR", false),
        status("status", "status", "INTEGER", false),
        create_time("create_time", "create_time", "TIMESTAMP", false),
        update_time("update_time", "update_time", "TIMESTAMP", false),
        flower_language("flower_language", "flower_language", "VARCHAR", false),
        flower_material("flower_material", "flower_material", "VARCHAR", false),
        category_id("category_id", "category_id", "INTEGER", false),
        store_id("store_id", "store_id", "INTEGER", false),
        detail("detail", "detail", "LONGVARCHAR", false);

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:12 CST 2020
         */
        private static final String BEGINNING_DELIMITER = "\"";

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:12 CST 2020
         */
        private static final String ENDING_DELIMITER = "\"";

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:12 CST 2020
         */
        private final String column;

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:12 CST 2020
         */
        private final boolean isColumnNameDelimited;

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:12 CST 2020
         */
        private final String javaProperty;

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:12 CST 2020
         */
        private final String jdbcType;

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:12 CST 2020
         */
        public String value() {
            return this.column;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:12 CST 2020
         */
        public String getValue() {
            return this.column;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:12 CST 2020
         */
        public String getJavaProperty() {
            return this.javaProperty;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:12 CST 2020
         */
        public String getJdbcType() {
            return this.jdbcType;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:12 CST 2020
         */
        Column(String column, String javaProperty, String jdbcType, boolean isColumnNameDelimited) {
            this.column = column;
            this.javaProperty = javaProperty;
            this.jdbcType = jdbcType;
            this.isColumnNameDelimited = isColumnNameDelimited;
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:12 CST 2020
         */
        public String desc() {
            return this.getEscapedColumnName() + " DESC";
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:12 CST 2020
         */
        public String asc() {
            return this.getEscapedColumnName() + " ASC";
        }

        /**
         *
         * @mbg.generated Wed Feb 26 16:28:12 CST 2020
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
         * @mbg.generated Wed Feb 26 16:28:12 CST 2020
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
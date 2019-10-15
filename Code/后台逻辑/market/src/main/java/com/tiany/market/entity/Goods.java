package com.tiany.market.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created By MBG-GUI-EXTENSION https://github.com/spawpaw/mybatis-generator-gui-extension
 * Description:
 * 
 *
 * @author 
 */
public class Goods implements Serializable {
    /**
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    public static final Integer NOT_DELETED = 0;

    /**
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    public static final Integer DELETED = 1;

    /**
     *
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    private Integer id;

    /**
     * 商品名
     *
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    private String name;

    /**
     * 图片
     *
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    private String img;

    /**
     * 介绍
     *
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    private String introduce;

    /**
     * 价格
     *
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    private BigDecimal price;

    /**
     *
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    private Integer is_delete;

    /**
     * 详情
     *
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    private String content;

    /**
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column market..goods.id
     *
     * @return the value of market..goods.id
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    public Goods withId(Integer id) {
        this.setId(id);
        return this;
    }

    /**
     * This method sets the value of the database column market..goods.id
     *
     * @param id the value for market..goods.id
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column market..goods.name
     *
     * @return the value of market..goods.name
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    public Goods withName(String name) {
        this.setName(name);
        return this;
    }

    /**
     * This method sets the value of the database column market..goods.name
     *
     * @param name the value for market..goods.name
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method returns the value of the database column market..goods.img
     *
     * @return the value of market..goods.img
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    public String getImg() {
        return img;
    }

    /**
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    public Goods withImg(String img) {
        this.setImg(img);
        return this;
    }

    /**
     * This method sets the value of the database column market..goods.img
     *
     * @param img the value for market..goods.img
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }

    /**
     * This method returns the value of the database column market..goods.introduce
     *
     * @return the value of market..goods.introduce
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    public String getIntroduce() {
        return introduce;
    }

    /**
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    public Goods withIntroduce(String introduce) {
        this.setIntroduce(introduce);
        return this;
    }

    /**
     * This method sets the value of the database column market..goods.introduce
     *
     * @param introduce the value for market..goods.introduce
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    public void setIntroduce(String introduce) {
        this.introduce = introduce == null ? null : introduce.trim();
    }

    /**
     * This method returns the value of the database column market..goods.price
     *
     * @return the value of market..goods.price
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    public Goods withPrice(BigDecimal price) {
        this.setPrice(price);
        return this;
    }

    /**
     * This method sets the value of the database column market..goods.price
     *
     * @param price the value for market..goods.price
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * This method returns the value of the database column market..goods.is_delete
     *
     * @return the value of market..goods.is_delete
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    public Integer getIs_delete() {
        return is_delete;
    }

    /**
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    public Goods withIs_delete(Integer is_delete) {
        this.setIs_delete(is_delete);
        return this;
    }

    /**
     * This method sets the value of the database column market..goods.is_delete
     *
     * @param is_delete the value for market..goods.is_delete
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    public void setIs_delete(Integer is_delete) {
        this.is_delete = is_delete;
    }

    /**
     * This method returns the value of the database column market..goods.content
     *
     * @return the value of market..goods.content
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    public String getContent() {
        return content;
    }

    /**
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    public Goods withContent(String content) {
        this.setContent(content);
        return this;
    }

    /**
     * This method sets the value of the database column market..goods.content
     *
     * @param content the value for market..goods.content
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", img=").append(img);
        sb.append(", introduce=").append(introduce);
        sb.append(", price=").append(price);
        sb.append(", is_delete=").append(is_delete);
        sb.append(", content=").append(content);
        sb.append("]");
        return sb.toString();
    }

    /**
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    public void andLogicalDeleted(boolean deleted) {
        setIs_delete(deleted ? DELETED : NOT_DELETED);
    }

    /**
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
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
        Goods other = (Goods) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getImg() == null ? other.getImg() == null : this.getImg().equals(other.getImg()))
            && (this.getIntroduce() == null ? other.getIntroduce() == null : this.getIntroduce().equals(other.getIntroduce()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getIs_delete() == null ? other.getIs_delete() == null : this.getIs_delete().equals(other.getIs_delete()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()));
    }

    /**
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getImg() == null) ? 0 : getImg().hashCode());
        result = prime * result + ((getIntroduce() == null) ? 0 : getIntroduce().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getIs_delete() == null) ? 0 : getIs_delete().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        return result;
    }

    /**
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    public enum Column {
        id("id", "id", "INTEGER", false),
        name("name", "name", "VARCHAR", true),
        img("img", "img", "VARCHAR", false),
        introduce("introduce", "introduce", "VARCHAR", false),
        price("price", "price", "DECIMAL", false),
        is_delete("is_delete", "is_delete", "INTEGER", false),
        content("content", "content", "LONGVARCHAR", false);

        /**
         *
         * @mbg.generated Tue Oct 15 16:35:42 CST 2019
         */
        private static final String BEGINNING_DELIMITER = "`";

        /**
         *
         * @mbg.generated Tue Oct 15 16:35:42 CST 2019
         */
        private static final String ENDING_DELIMITER = "`";

        /**
         *
         * @mbg.generated Tue Oct 15 16:35:42 CST 2019
         */
        private final String column;

        /**
         *
         * @mbg.generated Tue Oct 15 16:35:42 CST 2019
         */
        private final boolean isColumnNameDelimited;

        /**
         *
         * @mbg.generated Tue Oct 15 16:35:42 CST 2019
         */
        private final String javaProperty;

        /**
         *
         * @mbg.generated Tue Oct 15 16:35:42 CST 2019
         */
        private final String jdbcType;

        /**
         *
         * @mbg.generated Tue Oct 15 16:35:42 CST 2019
         */
        public String value() {
            return this.column;
        }

        /**
         *
         * @mbg.generated Tue Oct 15 16:35:42 CST 2019
         */
        public String getValue() {
            return this.column;
        }

        /**
         *
         * @mbg.generated Tue Oct 15 16:35:42 CST 2019
         */
        public String getJavaProperty() {
            return this.javaProperty;
        }

        /**
         *
         * @mbg.generated Tue Oct 15 16:35:42 CST 2019
         */
        public String getJdbcType() {
            return this.jdbcType;
        }

        /**
         *
         * @mbg.generated Tue Oct 15 16:35:42 CST 2019
         */
        Column(String column, String javaProperty, String jdbcType, boolean isColumnNameDelimited) {
            this.column = column;
            this.javaProperty = javaProperty;
            this.jdbcType = jdbcType;
            this.isColumnNameDelimited = isColumnNameDelimited;
        }

        /**
         *
         * @mbg.generated Tue Oct 15 16:35:42 CST 2019
         */
        public String desc() {
            return this.getEscapedColumnName() + " DESC";
        }

        /**
         *
         * @mbg.generated Tue Oct 15 16:35:42 CST 2019
         */
        public String asc() {
            return this.getEscapedColumnName() + " ASC";
        }

        /**
         *
         * @mbg.generated Tue Oct 15 16:35:42 CST 2019
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
         * @mbg.generated Tue Oct 15 16:35:42 CST 2019
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
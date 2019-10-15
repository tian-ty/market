package com.tiany.market.entity;

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
public class Stock implements Serializable {
    /**
     *
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    private Integer id;

    /**
     * 商品ID
     *
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    private Integer goods_id;

    /**
     * 库存
     *
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    private Integer stock;

    /**
     * 已售出
     *
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    private String sold;

    /**
     * 未售出
     *
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    private String unsold;

    /**
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column market..stock.id
     *
     * @return the value of market..stock.id
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
    public Stock withId(Integer id) {
        this.setId(id);
        return this;
    }

    /**
     * This method sets the value of the database column market..stock.id
     *
     * @param id the value for market..stock.id
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column market..stock.goods_id
     *
     * @return the value of market..stock.goods_id
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    public Integer getGoods_id() {
        return goods_id;
    }

    /**
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    public Stock withGoods_id(Integer goods_id) {
        this.setGoods_id(goods_id);
        return this;
    }

    /**
     * This method sets the value of the database column market..stock.goods_id
     *
     * @param goods_id the value for market..stock.goods_id
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    public void setGoods_id(Integer goods_id) {
        this.goods_id = goods_id;
    }

    /**
     * This method returns the value of the database column market..stock.stock
     *
     * @return the value of market..stock.stock
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    public Integer getStock() {
        return stock;
    }

    /**
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    public Stock withStock(Integer stock) {
        this.setStock(stock);
        return this;
    }

    /**
     * This method sets the value of the database column market..stock.stock
     *
     * @param stock the value for market..stock.stock
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    public void setStock(Integer stock) {
        this.stock = stock;
    }

    /**
     * This method returns the value of the database column market..stock.sold
     *
     * @return the value of market..stock.sold
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    public String getSold() {
        return sold;
    }

    /**
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    public Stock withSold(String sold) {
        this.setSold(sold);
        return this;
    }

    /**
     * This method sets the value of the database column market..stock.sold
     *
     * @param sold the value for market..stock.sold
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    public void setSold(String sold) {
        this.sold = sold == null ? null : sold.trim();
    }

    /**
     * This method returns the value of the database column market..stock.unsold
     *
     * @return the value of market..stock.unsold
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    public String getUnsold() {
        return unsold;
    }

    /**
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    public Stock withUnsold(String unsold) {
        this.setUnsold(unsold);
        return this;
    }

    /**
     * This method sets the value of the database column market..stock.unsold
     *
     * @param unsold the value for market..stock.unsold
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    public void setUnsold(String unsold) {
        this.unsold = unsold == null ? null : unsold.trim();
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
        sb.append(", goods_id=").append(goods_id);
        sb.append(", stock=").append(stock);
        sb.append(", sold=").append(sold);
        sb.append(", unsold=").append(unsold);
        sb.append("]");
        return sb.toString();
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
        Stock other = (Stock) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getGoods_id() == null ? other.getGoods_id() == null : this.getGoods_id().equals(other.getGoods_id()))
            && (this.getStock() == null ? other.getStock() == null : this.getStock().equals(other.getStock()))
            && (this.getSold() == null ? other.getSold() == null : this.getSold().equals(other.getSold()))
            && (this.getUnsold() == null ? other.getUnsold() == null : this.getUnsold().equals(other.getUnsold()));
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
        result = prime * result + ((getGoods_id() == null) ? 0 : getGoods_id().hashCode());
        result = prime * result + ((getStock() == null) ? 0 : getStock().hashCode());
        result = prime * result + ((getSold() == null) ? 0 : getSold().hashCode());
        result = prime * result + ((getUnsold() == null) ? 0 : getUnsold().hashCode());
        return result;
    }

    /**
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    public enum Column {
        id("id", "id", "INTEGER", false),
        goods_id("goods_id", "goods_id", "INTEGER", false),
        stock("stock", "stock", "INTEGER", false),
        sold("sold", "sold", "VARCHAR", false),
        unsold("unsold", "unsold", "VARCHAR", false);

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
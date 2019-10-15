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
public class Orders implements Serializable {
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
     * 用户ID
     *
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    private Integer user_id;

    /**
     * 商品ID
     *
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    private Integer goods_id;

    /**
     * 数量
     *
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    private String quantity;

    /**
     * 总价
     *
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    private String total;

    /**
     * 状态
     *
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    private Integer status;

    /**
     *
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    private Integer is_delete;

    /**
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column market..orders.id
     *
     * @return the value of market..orders.id
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
    public Orders withId(Integer id) {
        this.setId(id);
        return this;
    }

    /**
     * This method sets the value of the database column market..orders.id
     *
     * @param id the value for market..orders.id
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column market..orders.user_id
     *
     * @return the value of market..orders.user_id
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    public Integer getUser_id() {
        return user_id;
    }

    /**
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    public Orders withUser_id(Integer user_id) {
        this.setUser_id(user_id);
        return this;
    }

    /**
     * This method sets the value of the database column market..orders.user_id
     *
     * @param user_id the value for market..orders.user_id
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    /**
     * This method returns the value of the database column market..orders.goods_id
     *
     * @return the value of market..orders.goods_id
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
    public Orders withGoods_id(Integer goods_id) {
        this.setGoods_id(goods_id);
        return this;
    }

    /**
     * This method sets the value of the database column market..orders.goods_id
     *
     * @param goods_id the value for market..orders.goods_id
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    public void setGoods_id(Integer goods_id) {
        this.goods_id = goods_id;
    }

    /**
     * This method returns the value of the database column market..orders.quantity
     *
     * @return the value of market..orders.quantity
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    public String getQuantity() {
        return quantity;
    }

    /**
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    public Orders withQuantity(String quantity) {
        this.setQuantity(quantity);
        return this;
    }

    /**
     * This method sets the value of the database column market..orders.quantity
     *
     * @param quantity the value for market..orders.quantity
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    public void setQuantity(String quantity) {
        this.quantity = quantity == null ? null : quantity.trim();
    }

    /**
     * This method returns the value of the database column market..orders.total
     *
     * @return the value of market..orders.total
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    public String getTotal() {
        return total;
    }

    /**
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    public Orders withTotal(String total) {
        this.setTotal(total);
        return this;
    }

    /**
     * This method sets the value of the database column market..orders.total
     *
     * @param total the value for market..orders.total
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    public void setTotal(String total) {
        this.total = total == null ? null : total.trim();
    }

    /**
     * This method returns the value of the database column market..orders.status
     *
     * @return the value of market..orders.status
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    public Integer getStatus() {
        return status;
    }

    /**
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    public Orders withStatus(Integer status) {
        this.setStatus(status);
        return this;
    }

    /**
     * This method sets the value of the database column market..orders.status
     *
     * @param status the value for market..orders.status
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method returns the value of the database column market..orders.is_delete
     *
     * @return the value of market..orders.is_delete
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
    public Orders withIs_delete(Integer is_delete) {
        this.setIs_delete(is_delete);
        return this;
    }

    /**
     * This method sets the value of the database column market..orders.is_delete
     *
     * @param is_delete the value for market..orders.is_delete
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    public void setIs_delete(Integer is_delete) {
        this.is_delete = is_delete;
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
        sb.append(", user_id=").append(user_id);
        sb.append(", goods_id=").append(goods_id);
        sb.append(", quantity=").append(quantity);
        sb.append(", total=").append(total);
        sb.append(", status=").append(status);
        sb.append(", is_delete=").append(is_delete);
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
        Orders other = (Orders) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUser_id() == null ? other.getUser_id() == null : this.getUser_id().equals(other.getUser_id()))
            && (this.getGoods_id() == null ? other.getGoods_id() == null : this.getGoods_id().equals(other.getGoods_id()))
            && (this.getQuantity() == null ? other.getQuantity() == null : this.getQuantity().equals(other.getQuantity()))
            && (this.getTotal() == null ? other.getTotal() == null : this.getTotal().equals(other.getTotal()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getIs_delete() == null ? other.getIs_delete() == null : this.getIs_delete().equals(other.getIs_delete()));
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
        result = prime * result + ((getUser_id() == null) ? 0 : getUser_id().hashCode());
        result = prime * result + ((getGoods_id() == null) ? 0 : getGoods_id().hashCode());
        result = prime * result + ((getQuantity() == null) ? 0 : getQuantity().hashCode());
        result = prime * result + ((getTotal() == null) ? 0 : getTotal().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getIs_delete() == null) ? 0 : getIs_delete().hashCode());
        return result;
    }

    /**
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    public enum Column {
        id("id", "id", "INTEGER", false),
        user_id("user_id", "user_id", "INTEGER", false),
        goods_id("goods_id", "goods_id", "INTEGER", false),
        quantity("quantity", "quantity", "VARCHAR", false),
        total("total", "total", "VARCHAR", false),
        status("status", "status", "INTEGER", true),
        is_delete("is_delete", "is_delete", "INTEGER", false);

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
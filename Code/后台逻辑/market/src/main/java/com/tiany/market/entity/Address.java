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
public class Address implements Serializable {
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
     * 地址
     *
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    private String address;

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
     * This method returns the value of the database column market..address.id
     *
     * @return the value of market..address.id
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
    public Address withId(Integer id) {
        this.setId(id);
        return this;
    }

    /**
     * This method sets the value of the database column market..address.id
     *
     * @param id the value for market..address.id
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column market..address.user_id
     *
     * @return the value of market..address.user_id
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
    public Address withUser_id(Integer user_id) {
        this.setUser_id(user_id);
        return this;
    }

    /**
     * This method sets the value of the database column market..address.user_id
     *
     * @param user_id the value for market..address.user_id
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    /**
     * This method returns the value of the database column market..address.address
     *
     * @return the value of market..address.address
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    public String getAddress() {
        return address;
    }

    /**
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    public Address withAddress(String address) {
        this.setAddress(address);
        return this;
    }

    /**
     * This method sets the value of the database column market..address.address
     *
     * @param address the value for market..address.address
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * This method returns the value of the database column market..address.is_delete
     *
     * @return the value of market..address.is_delete
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
    public Address withIs_delete(Integer is_delete) {
        this.setIs_delete(is_delete);
        return this;
    }

    /**
     * This method sets the value of the database column market..address.is_delete
     *
     * @param is_delete the value for market..address.is_delete
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
        sb.append(", address=").append(address);
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
        Address other = (Address) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUser_id() == null ? other.getUser_id() == null : this.getUser_id().equals(other.getUser_id()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
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
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
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
        address("address", "address", "VARCHAR", false),
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
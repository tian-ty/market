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
public class Admin implements Serializable {
    /**
     *
     *
     * @mbg.generated Wed Oct 16 10:41:15 CST 2019
     */
    private Integer id;

    /**
     *
     *
     * @mbg.generated Wed Oct 16 10:41:15 CST 2019
     */
    private String username;

    /**
     *
     *
     * @mbg.generated Wed Oct 16 10:41:15 CST 2019
     */
    private String password;

    /**
     *
     *
     * @mbg.generated Wed Oct 16 10:41:15 CST 2019
     */
    private String nickname;

    /**
     *
     * @mbg.generated Wed Oct 16 10:41:15 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column market..admin.id
     *
     * @return the value of market..admin.id
     *
     * @mbg.generated Wed Oct 16 10:41:15 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     *
     * @mbg.generated Wed Oct 16 10:41:15 CST 2019
     */
    public Admin withId(Integer id) {
        this.setId(id);
        return this;
    }

    /**
     * This method sets the value of the database column market..admin.id
     *
     * @param id the value for market..admin.id
     *
     * @mbg.generated Wed Oct 16 10:41:15 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column market..admin.username
     *
     * @return the value of market..admin.username
     *
     * @mbg.generated Wed Oct 16 10:41:15 CST 2019
     */
    public String getUsername() {
        return username;
    }

    /**
     *
     * @mbg.generated Wed Oct 16 10:41:15 CST 2019
     */
    public Admin withUsername(String username) {
        this.setUsername(username);
        return this;
    }

    /**
     * This method sets the value of the database column market..admin.username
     *
     * @param username the value for market..admin.username
     *
     * @mbg.generated Wed Oct 16 10:41:15 CST 2019
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method returns the value of the database column market..admin.password
     *
     * @return the value of market..admin.password
     *
     * @mbg.generated Wed Oct 16 10:41:15 CST 2019
     */
    public String getPassword() {
        return password;
    }

    /**
     *
     * @mbg.generated Wed Oct 16 10:41:15 CST 2019
     */
    public Admin withPassword(String password) {
        this.setPassword(password);
        return this;
    }

    /**
     * This method sets the value of the database column market..admin.password
     *
     * @param password the value for market..admin.password
     *
     * @mbg.generated Wed Oct 16 10:41:15 CST 2019
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method returns the value of the database column market..admin.nickname
     *
     * @return the value of market..admin.nickname
     *
     * @mbg.generated Wed Oct 16 10:41:15 CST 2019
     */
    public String getNickname() {
        return nickname;
    }

    /**
     *
     * @mbg.generated Wed Oct 16 10:41:15 CST 2019
     */
    public Admin withNickname(String nickname) {
        this.setNickname(nickname);
        return this;
    }

    /**
     * This method sets the value of the database column market..admin.nickname
     *
     * @param nickname the value for market..admin.nickname
     *
     * @mbg.generated Wed Oct 16 10:41:15 CST 2019
     */
    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    /**
     *
     * @mbg.generated Wed Oct 16 10:41:15 CST 2019
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
        sb.append(", nickname=").append(nickname);
        sb.append("]");
        return sb.toString();
    }

    /**
     *
     * @mbg.generated Wed Oct 16 10:41:15 CST 2019
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
        Admin other = (Admin) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUsername() == null ? other.getUsername() == null : this.getUsername().equals(other.getUsername()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getNickname() == null ? other.getNickname() == null : this.getNickname().equals(other.getNickname()));
    }

    /**
     *
     * @mbg.generated Wed Oct 16 10:41:15 CST 2019
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUsername() == null) ? 0 : getUsername().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getNickname() == null) ? 0 : getNickname().hashCode());
        return result;
    }

    /**
     *
     * @mbg.generated Wed Oct 16 10:41:15 CST 2019
     */
    public enum Column {
        id("id", "id", "INTEGER", false),
        username("username", "username", "VARCHAR", false),
        password("password", "password", "VARCHAR", false),
        nickname("nickname", "nickname", "VARCHAR", false);

        /**
         *
         * @mbg.generated Wed Oct 16 10:41:15 CST 2019
         */
        private static final String BEGINNING_DELIMITER = "\"";

        /**
         *
         * @mbg.generated Wed Oct 16 10:41:15 CST 2019
         */
        private static final String ENDING_DELIMITER = "\"";

        /**
         *
         * @mbg.generated Wed Oct 16 10:41:15 CST 2019
         */
        private final String column;

        /**
         *
         * @mbg.generated Wed Oct 16 10:41:15 CST 2019
         */
        private final boolean isColumnNameDelimited;

        /**
         *
         * @mbg.generated Wed Oct 16 10:41:15 CST 2019
         */
        private final String javaProperty;

        /**
         *
         * @mbg.generated Wed Oct 16 10:41:15 CST 2019
         */
        private final String jdbcType;

        /**
         *
         * @mbg.generated Wed Oct 16 10:41:15 CST 2019
         */
        public String value() {
            return this.column;
        }

        /**
         *
         * @mbg.generated Wed Oct 16 10:41:15 CST 2019
         */
        public String getValue() {
            return this.column;
        }

        /**
         *
         * @mbg.generated Wed Oct 16 10:41:15 CST 2019
         */
        public String getJavaProperty() {
            return this.javaProperty;
        }

        /**
         *
         * @mbg.generated Wed Oct 16 10:41:15 CST 2019
         */
        public String getJdbcType() {
            return this.jdbcType;
        }

        /**
         *
         * @mbg.generated Wed Oct 16 10:41:15 CST 2019
         */
        Column(String column, String javaProperty, String jdbcType, boolean isColumnNameDelimited) {
            this.column = column;
            this.javaProperty = javaProperty;
            this.jdbcType = jdbcType;
            this.isColumnNameDelimited = isColumnNameDelimited;
        }

        /**
         *
         * @mbg.generated Wed Oct 16 10:41:15 CST 2019
         */
        public String desc() {
            return this.getEscapedColumnName() + " DESC";
        }

        /**
         *
         * @mbg.generated Wed Oct 16 10:41:15 CST 2019
         */
        public String asc() {
            return this.getEscapedColumnName() + " ASC";
        }

        /**
         *
         * @mbg.generated Wed Oct 16 10:41:15 CST 2019
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
         * @mbg.generated Wed Oct 16 10:41:15 CST 2019
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
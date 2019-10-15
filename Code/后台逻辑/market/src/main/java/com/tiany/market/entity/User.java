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
public class User implements Serializable {
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
     *
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    private String username;

    /**
     *
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    private String password;

    /**
     *
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    private String nickname;

    /**
     *
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    private String birthday;

    /**
     *
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    private String sex;

    /**
     *
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    private String avatar;

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
     * This method returns the value of the database column market..user.id
     *
     * @return the value of market..user.id
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
    public User withId(Integer id) {
        this.setId(id);
        return this;
    }

    /**
     * This method sets the value of the database column market..user.id
     *
     * @param id the value for market..user.id
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column market..user.username
     *
     * @return the value of market..user.username
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    public String getUsername() {
        return username;
    }

    /**
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    public User withUsername(String username) {
        this.setUsername(username);
        return this;
    }

    /**
     * This method sets the value of the database column market..user.username
     *
     * @param username the value for market..user.username
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method returns the value of the database column market..user.password
     *
     * @return the value of market..user.password
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    public String getPassword() {
        return password;
    }

    /**
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    public User withPassword(String password) {
        this.setPassword(password);
        return this;
    }

    /**
     * This method sets the value of the database column market..user.password
     *
     * @param password the value for market..user.password
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method returns the value of the database column market..user.nickname
     *
     * @return the value of market..user.nickname
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    public String getNickname() {
        return nickname;
    }

    /**
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    public User withNickname(String nickname) {
        this.setNickname(nickname);
        return this;
    }

    /**
     * This method sets the value of the database column market..user.nickname
     *
     * @param nickname the value for market..user.nickname
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    /**
     * This method returns the value of the database column market..user.birthday
     *
     * @return the value of market..user.birthday
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    public String getBirthday() {
        return birthday;
    }

    /**
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    public User withBirthday(String birthday) {
        this.setBirthday(birthday);
        return this;
    }

    /**
     * This method sets the value of the database column market..user.birthday
     *
     * @param birthday the value for market..user.birthday
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    public void setBirthday(String birthday) {
        this.birthday = birthday == null ? null : birthday.trim();
    }

    /**
     * This method returns the value of the database column market..user.sex
     *
     * @return the value of market..user.sex
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    public String getSex() {
        return sex;
    }

    /**
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    public User withSex(String sex) {
        this.setSex(sex);
        return this;
    }

    /**
     * This method sets the value of the database column market..user.sex
     *
     * @param sex the value for market..user.sex
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    /**
     * This method returns the value of the database column market..user.avatar
     *
     * @return the value of market..user.avatar
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    public String getAvatar() {
        return avatar;
    }

    /**
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    public User withAvatar(String avatar) {
        this.setAvatar(avatar);
        return this;
    }

    /**
     * This method sets the value of the database column market..user.avatar
     *
     * @param avatar the value for market..user.avatar
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    public void setAvatar(String avatar) {
        this.avatar = avatar == null ? null : avatar.trim();
    }

    /**
     * This method returns the value of the database column market..user.is_delete
     *
     * @return the value of market..user.is_delete
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
    public User withIs_delete(Integer is_delete) {
        this.setIs_delete(is_delete);
        return this;
    }

    /**
     * This method sets the value of the database column market..user.is_delete
     *
     * @param is_delete the value for market..user.is_delete
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
        sb.append(", username=").append(username);
        sb.append(", password=").append(password);
        sb.append(", nickname=").append(nickname);
        sb.append(", birthday=").append(birthday);
        sb.append(", sex=").append(sex);
        sb.append(", avatar=").append(avatar);
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
        User other = (User) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUsername() == null ? other.getUsername() == null : this.getUsername().equals(other.getUsername()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getNickname() == null ? other.getNickname() == null : this.getNickname().equals(other.getNickname()))
            && (this.getBirthday() == null ? other.getBirthday() == null : this.getBirthday().equals(other.getBirthday()))
            && (this.getSex() == null ? other.getSex() == null : this.getSex().equals(other.getSex()))
            && (this.getAvatar() == null ? other.getAvatar() == null : this.getAvatar().equals(other.getAvatar()))
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
        result = prime * result + ((getUsername() == null) ? 0 : getUsername().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getNickname() == null) ? 0 : getNickname().hashCode());
        result = prime * result + ((getBirthday() == null) ? 0 : getBirthday().hashCode());
        result = prime * result + ((getSex() == null) ? 0 : getSex().hashCode());
        result = prime * result + ((getAvatar() == null) ? 0 : getAvatar().hashCode());
        result = prime * result + ((getIs_delete() == null) ? 0 : getIs_delete().hashCode());
        return result;
    }

    /**
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    public enum Column {
        id("id", "id", "INTEGER", false),
        username("username", "username", "VARCHAR", false),
        password("password", "password", "VARCHAR", true),
        nickname("nickname", "nickname", "VARCHAR", false),
        birthday("birthday", "birthday", "VARCHAR", false),
        sex("sex", "sex", "VARCHAR", false),
        avatar("avatar", "avatar", "VARCHAR", false),
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
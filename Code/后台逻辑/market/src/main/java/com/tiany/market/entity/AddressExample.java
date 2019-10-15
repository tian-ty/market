package com.tiany.market.entity;

import java.util.ArrayList;
import java.util.List;

public class AddressExample {
    /**
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    protected String orderByClause;

    /**
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    protected boolean distinct;

    /**
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    /**
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    public AddressExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    public AddressExample orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    /**
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    public AddressExample orderBy(String ... orderByClauses) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < orderByClauses.length; i++) {
            sb.append(orderByClauses[i]);
            if (i < orderByClauses.length - 1) {
                sb.append(" , ");
            }
        }
        this.setOrderByClause(sb.toString());
        return this;
    }

    /**
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria(this);
        return criteria;
    }

    /**
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setPageInfo(Integer currentPage, Integer pageSize) {
        if(pageSize<1) throw new IllegalArgumentException("页大小不能小于1！");
        this.limit=pageSize;
        if(currentPage<1) throw new IllegalArgumentException("页数不能小于1！");
        this.offset=(currentPage-1)*pageSize;
    }

    /**
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    public static Criteria newAndCreateCriteria() {
        AddressExample example = new AddressExample();
        return example.createCriteria();
    }

    /**
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Tue Oct 15 16:35:42 CST 2019
         */
        public Criteria andIdEqualToColumn(Address.Column column) {
            addCriterion(new StringBuilder("id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Tue Oct 15 16:35:42 CST 2019
         */
        public Criteria andIdNotEqualToColumn(Address.Column column) {
            addCriterion(new StringBuilder("id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Tue Oct 15 16:35:42 CST 2019
         */
        public Criteria andIdGreaterThanColumn(Address.Column column) {
            addCriterion(new StringBuilder("id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Tue Oct 15 16:35:42 CST 2019
         */
        public Criteria andIdGreaterThanOrEqualToColumn(Address.Column column) {
            addCriterion(new StringBuilder("id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Tue Oct 15 16:35:42 CST 2019
         */
        public Criteria andIdLessThanColumn(Address.Column column) {
            addCriterion(new StringBuilder("id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Tue Oct 15 16:35:42 CST 2019
         */
        public Criteria andIdLessThanOrEqualToColumn(Address.Column column) {
            addCriterion(new StringBuilder("id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUser_idIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUser_idIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUser_idEqualTo(Integer value) {
            addCriterion("user_id =", value, "user_id");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Tue Oct 15 16:35:42 CST 2019
         */
        public Criteria andUser_idEqualToColumn(Address.Column column) {
            addCriterion(new StringBuilder("user_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUser_idNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "user_id");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Tue Oct 15 16:35:42 CST 2019
         */
        public Criteria andUser_idNotEqualToColumn(Address.Column column) {
            addCriterion(new StringBuilder("user_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUser_idGreaterThan(Integer value) {
            addCriterion("user_id >", value, "user_id");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Tue Oct 15 16:35:42 CST 2019
         */
        public Criteria andUser_idGreaterThanColumn(Address.Column column) {
            addCriterion(new StringBuilder("user_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUser_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "user_id");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Tue Oct 15 16:35:42 CST 2019
         */
        public Criteria andUser_idGreaterThanOrEqualToColumn(Address.Column column) {
            addCriterion(new StringBuilder("user_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUser_idLessThan(Integer value) {
            addCriterion("user_id <", value, "user_id");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Tue Oct 15 16:35:42 CST 2019
         */
        public Criteria andUser_idLessThanColumn(Address.Column column) {
            addCriterion(new StringBuilder("user_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUser_idLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "user_id");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Tue Oct 15 16:35:42 CST 2019
         */
        public Criteria andUser_idLessThanOrEqualToColumn(Address.Column column) {
            addCriterion(new StringBuilder("user_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUser_idIn(List<Integer> values) {
            addCriterion("user_id in", values, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "user_id");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Tue Oct 15 16:35:42 CST 2019
         */
        public Criteria andAddressEqualToColumn(Address.Column column) {
            addCriterion(new StringBuilder("address = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Tue Oct 15 16:35:42 CST 2019
         */
        public Criteria andAddressNotEqualToColumn(Address.Column column) {
            addCriterion(new StringBuilder("address <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Tue Oct 15 16:35:42 CST 2019
         */
        public Criteria andAddressGreaterThanColumn(Address.Column column) {
            addCriterion(new StringBuilder("address > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Tue Oct 15 16:35:42 CST 2019
         */
        public Criteria andAddressGreaterThanOrEqualToColumn(Address.Column column) {
            addCriterion(new StringBuilder("address >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Tue Oct 15 16:35:42 CST 2019
         */
        public Criteria andAddressLessThanColumn(Address.Column column) {
            addCriterion(new StringBuilder("address < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Tue Oct 15 16:35:42 CST 2019
         */
        public Criteria andAddressLessThanOrEqualToColumn(Address.Column column) {
            addCriterion(new StringBuilder("address <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andIs_deleteIsNull() {
            addCriterion("is_delete is null");
            return (Criteria) this;
        }

        public Criteria andIs_deleteIsNotNull() {
            addCriterion("is_delete is not null");
            return (Criteria) this;
        }

        public Criteria andIs_deleteEqualTo(Integer value) {
            addCriterion("is_delete =", value, "is_delete");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Tue Oct 15 16:35:42 CST 2019
         */
        public Criteria andIs_deleteEqualToColumn(Address.Column column) {
            addCriterion(new StringBuilder("is_delete = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIs_deleteNotEqualTo(Integer value) {
            addCriterion("is_delete <>", value, "is_delete");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Tue Oct 15 16:35:42 CST 2019
         */
        public Criteria andIs_deleteNotEqualToColumn(Address.Column column) {
            addCriterion(new StringBuilder("is_delete <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIs_deleteGreaterThan(Integer value) {
            addCriterion("is_delete >", value, "is_delete");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Tue Oct 15 16:35:42 CST 2019
         */
        public Criteria andIs_deleteGreaterThanColumn(Address.Column column) {
            addCriterion(new StringBuilder("is_delete > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIs_deleteGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_delete >=", value, "is_delete");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Tue Oct 15 16:35:42 CST 2019
         */
        public Criteria andIs_deleteGreaterThanOrEqualToColumn(Address.Column column) {
            addCriterion(new StringBuilder("is_delete >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIs_deleteLessThan(Integer value) {
            addCriterion("is_delete <", value, "is_delete");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Tue Oct 15 16:35:42 CST 2019
         */
        public Criteria andIs_deleteLessThanColumn(Address.Column column) {
            addCriterion(new StringBuilder("is_delete < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIs_deleteLessThanOrEqualTo(Integer value) {
            addCriterion("is_delete <=", value, "is_delete");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Tue Oct 15 16:35:42 CST 2019
         */
        public Criteria andIs_deleteLessThanOrEqualToColumn(Address.Column column) {
            addCriterion(new StringBuilder("is_delete <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIs_deleteIn(List<Integer> values) {
            addCriterion("is_delete in", values, "is_delete");
            return (Criteria) this;
        }

        public Criteria andIs_deleteNotIn(List<Integer> values) {
            addCriterion("is_delete not in", values, "is_delete");
            return (Criteria) this;
        }

        public Criteria andIs_deleteBetween(Integer value1, Integer value2) {
            addCriterion("is_delete between", value1, value2, "is_delete");
            return (Criteria) this;
        }

        public Criteria andIs_deleteNotBetween(Integer value1, Integer value2) {
            addCriterion("is_delete not between", value1, value2, "is_delete");
            return (Criteria) this;
        }

        public Criteria andAddressLikeInsensitive(String value) {
            addCriterion("upper(address) like", value.toUpperCase(), "address");
            return (Criteria) this;
        }
    }

    /**
     *
     * @mbg.generated do_not_delete_during_merge Tue Oct 15 16:35:42 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {
        /**
         *
         * @mbg.generated Tue Oct 15 16:35:42 CST 2019
         */
        private AddressExample example;

        /**
         *
         * @mbg.generated Tue Oct 15 16:35:42 CST 2019
         */
        protected Criteria(AddressExample example) {
            super();
            this.example = example;
        }

        /**
         *
         * @mbg.generated Tue Oct 15 16:35:42 CST 2019
         */
        public Criteria andLogicalDeleted(boolean deleted) {
            return deleted ? andIs_deleteEqualTo(Address.DELETED) : andIs_deleteNotEqualTo(Address.DELETED);
        }

        /**
         *
         * @mbg.generated Tue Oct 15 16:35:42 CST 2019
         */
        public AddressExample example() {
            return this.example;
        }

        /**
         *
         * @mbg.generated Tue Oct 15 16:35:42 CST 2019
         */
        public Criteria andIf(boolean ifAdd, ICriteriaAdd add) {
            if (ifAdd) {
                add.add(this);
            }
            return this;
        }

        public interface ICriteriaAdd {
            /**
             *
             * @mbg.generated Tue Oct 15 16:35:42 CST 2019
             */
            Criteria add(Criteria add);
        }
    }

    /**
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}
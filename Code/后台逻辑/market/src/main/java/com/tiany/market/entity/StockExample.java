package com.tiany.market.entity;

import java.util.ArrayList;
import java.util.List;

public class StockExample {
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
    public StockExample() {
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
    public StockExample orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    /**
     *
     * @mbg.generated Tue Oct 15 16:35:42 CST 2019
     */
    public StockExample orderBy(String ... orderByClauses) {
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
        StockExample example = new StockExample();
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
        public Criteria andIdEqualToColumn(Stock.Column column) {
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
        public Criteria andIdNotEqualToColumn(Stock.Column column) {
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
        public Criteria andIdGreaterThanColumn(Stock.Column column) {
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
        public Criteria andIdGreaterThanOrEqualToColumn(Stock.Column column) {
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
        public Criteria andIdLessThanColumn(Stock.Column column) {
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
        public Criteria andIdLessThanOrEqualToColumn(Stock.Column column) {
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

        public Criteria andGoods_idIsNull() {
            addCriterion("goods_id is null");
            return (Criteria) this;
        }

        public Criteria andGoods_idIsNotNull() {
            addCriterion("goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoods_idEqualTo(Integer value) {
            addCriterion("goods_id =", value, "goods_id");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Tue Oct 15 16:35:42 CST 2019
         */
        public Criteria andGoods_idEqualToColumn(Stock.Column column) {
            addCriterion(new StringBuilder("goods_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGoods_idNotEqualTo(Integer value) {
            addCriterion("goods_id <>", value, "goods_id");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Tue Oct 15 16:35:42 CST 2019
         */
        public Criteria andGoods_idNotEqualToColumn(Stock.Column column) {
            addCriterion(new StringBuilder("goods_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGoods_idGreaterThan(Integer value) {
            addCriterion("goods_id >", value, "goods_id");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Tue Oct 15 16:35:42 CST 2019
         */
        public Criteria andGoods_idGreaterThanColumn(Stock.Column column) {
            addCriterion(new StringBuilder("goods_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGoods_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_id >=", value, "goods_id");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Tue Oct 15 16:35:42 CST 2019
         */
        public Criteria andGoods_idGreaterThanOrEqualToColumn(Stock.Column column) {
            addCriterion(new StringBuilder("goods_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGoods_idLessThan(Integer value) {
            addCriterion("goods_id <", value, "goods_id");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Tue Oct 15 16:35:42 CST 2019
         */
        public Criteria andGoods_idLessThanColumn(Stock.Column column) {
            addCriterion(new StringBuilder("goods_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGoods_idLessThanOrEqualTo(Integer value) {
            addCriterion("goods_id <=", value, "goods_id");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Tue Oct 15 16:35:42 CST 2019
         */
        public Criteria andGoods_idLessThanOrEqualToColumn(Stock.Column column) {
            addCriterion(new StringBuilder("goods_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGoods_idIn(List<Integer> values) {
            addCriterion("goods_id in", values, "goods_id");
            return (Criteria) this;
        }

        public Criteria andGoods_idNotIn(List<Integer> values) {
            addCriterion("goods_id not in", values, "goods_id");
            return (Criteria) this;
        }

        public Criteria andGoods_idBetween(Integer value1, Integer value2) {
            addCriterion("goods_id between", value1, value2, "goods_id");
            return (Criteria) this;
        }

        public Criteria andGoods_idNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_id not between", value1, value2, "goods_id");
            return (Criteria) this;
        }

        public Criteria andStockIsNull() {
            addCriterion("stock is null");
            return (Criteria) this;
        }

        public Criteria andStockIsNotNull() {
            addCriterion("stock is not null");
            return (Criteria) this;
        }

        public Criteria andStockEqualTo(Integer value) {
            addCriterion("stock =", value, "stock");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Tue Oct 15 16:35:42 CST 2019
         */
        public Criteria andStockEqualToColumn(Stock.Column column) {
            addCriterion(new StringBuilder("stock = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStockNotEqualTo(Integer value) {
            addCriterion("stock <>", value, "stock");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Tue Oct 15 16:35:42 CST 2019
         */
        public Criteria andStockNotEqualToColumn(Stock.Column column) {
            addCriterion(new StringBuilder("stock <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStockGreaterThan(Integer value) {
            addCriterion("stock >", value, "stock");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Tue Oct 15 16:35:42 CST 2019
         */
        public Criteria andStockGreaterThanColumn(Stock.Column column) {
            addCriterion(new StringBuilder("stock > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStockGreaterThanOrEqualTo(Integer value) {
            addCriterion("stock >=", value, "stock");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Tue Oct 15 16:35:42 CST 2019
         */
        public Criteria andStockGreaterThanOrEqualToColumn(Stock.Column column) {
            addCriterion(new StringBuilder("stock >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStockLessThan(Integer value) {
            addCriterion("stock <", value, "stock");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Tue Oct 15 16:35:42 CST 2019
         */
        public Criteria andStockLessThanColumn(Stock.Column column) {
            addCriterion(new StringBuilder("stock < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStockLessThanOrEqualTo(Integer value) {
            addCriterion("stock <=", value, "stock");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Tue Oct 15 16:35:42 CST 2019
         */
        public Criteria andStockLessThanOrEqualToColumn(Stock.Column column) {
            addCriterion(new StringBuilder("stock <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStockIn(List<Integer> values) {
            addCriterion("stock in", values, "stock");
            return (Criteria) this;
        }

        public Criteria andStockNotIn(List<Integer> values) {
            addCriterion("stock not in", values, "stock");
            return (Criteria) this;
        }

        public Criteria andStockBetween(Integer value1, Integer value2) {
            addCriterion("stock between", value1, value2, "stock");
            return (Criteria) this;
        }

        public Criteria andStockNotBetween(Integer value1, Integer value2) {
            addCriterion("stock not between", value1, value2, "stock");
            return (Criteria) this;
        }

        public Criteria andSoldIsNull() {
            addCriterion("sold is null");
            return (Criteria) this;
        }

        public Criteria andSoldIsNotNull() {
            addCriterion("sold is not null");
            return (Criteria) this;
        }

        public Criteria andSoldEqualTo(String value) {
            addCriterion("sold =", value, "sold");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Tue Oct 15 16:35:42 CST 2019
         */
        public Criteria andSoldEqualToColumn(Stock.Column column) {
            addCriterion(new StringBuilder("sold = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSoldNotEqualTo(String value) {
            addCriterion("sold <>", value, "sold");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Tue Oct 15 16:35:42 CST 2019
         */
        public Criteria andSoldNotEqualToColumn(Stock.Column column) {
            addCriterion(new StringBuilder("sold <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSoldGreaterThan(String value) {
            addCriterion("sold >", value, "sold");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Tue Oct 15 16:35:42 CST 2019
         */
        public Criteria andSoldGreaterThanColumn(Stock.Column column) {
            addCriterion(new StringBuilder("sold > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSoldGreaterThanOrEqualTo(String value) {
            addCriterion("sold >=", value, "sold");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Tue Oct 15 16:35:42 CST 2019
         */
        public Criteria andSoldGreaterThanOrEqualToColumn(Stock.Column column) {
            addCriterion(new StringBuilder("sold >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSoldLessThan(String value) {
            addCriterion("sold <", value, "sold");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Tue Oct 15 16:35:42 CST 2019
         */
        public Criteria andSoldLessThanColumn(Stock.Column column) {
            addCriterion(new StringBuilder("sold < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSoldLessThanOrEqualTo(String value) {
            addCriterion("sold <=", value, "sold");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Tue Oct 15 16:35:42 CST 2019
         */
        public Criteria andSoldLessThanOrEqualToColumn(Stock.Column column) {
            addCriterion(new StringBuilder("sold <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSoldLike(String value) {
            addCriterion("sold like", value, "sold");
            return (Criteria) this;
        }

        public Criteria andSoldNotLike(String value) {
            addCriterion("sold not like", value, "sold");
            return (Criteria) this;
        }

        public Criteria andSoldIn(List<String> values) {
            addCriterion("sold in", values, "sold");
            return (Criteria) this;
        }

        public Criteria andSoldNotIn(List<String> values) {
            addCriterion("sold not in", values, "sold");
            return (Criteria) this;
        }

        public Criteria andSoldBetween(String value1, String value2) {
            addCriterion("sold between", value1, value2, "sold");
            return (Criteria) this;
        }

        public Criteria andSoldNotBetween(String value1, String value2) {
            addCriterion("sold not between", value1, value2, "sold");
            return (Criteria) this;
        }

        public Criteria andUnsoldIsNull() {
            addCriterion("unsold is null");
            return (Criteria) this;
        }

        public Criteria andUnsoldIsNotNull() {
            addCriterion("unsold is not null");
            return (Criteria) this;
        }

        public Criteria andUnsoldEqualTo(String value) {
            addCriterion("unsold =", value, "unsold");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Tue Oct 15 16:35:42 CST 2019
         */
        public Criteria andUnsoldEqualToColumn(Stock.Column column) {
            addCriterion(new StringBuilder("unsold = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUnsoldNotEqualTo(String value) {
            addCriterion("unsold <>", value, "unsold");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Tue Oct 15 16:35:42 CST 2019
         */
        public Criteria andUnsoldNotEqualToColumn(Stock.Column column) {
            addCriterion(new StringBuilder("unsold <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUnsoldGreaterThan(String value) {
            addCriterion("unsold >", value, "unsold");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Tue Oct 15 16:35:42 CST 2019
         */
        public Criteria andUnsoldGreaterThanColumn(Stock.Column column) {
            addCriterion(new StringBuilder("unsold > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUnsoldGreaterThanOrEqualTo(String value) {
            addCriterion("unsold >=", value, "unsold");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Tue Oct 15 16:35:42 CST 2019
         */
        public Criteria andUnsoldGreaterThanOrEqualToColumn(Stock.Column column) {
            addCriterion(new StringBuilder("unsold >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUnsoldLessThan(String value) {
            addCriterion("unsold <", value, "unsold");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Tue Oct 15 16:35:42 CST 2019
         */
        public Criteria andUnsoldLessThanColumn(Stock.Column column) {
            addCriterion(new StringBuilder("unsold < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUnsoldLessThanOrEqualTo(String value) {
            addCriterion("unsold <=", value, "unsold");
            return (Criteria) this;
        }

        /**
         *
         * @mbg.generated Tue Oct 15 16:35:42 CST 2019
         */
        public Criteria andUnsoldLessThanOrEqualToColumn(Stock.Column column) {
            addCriterion(new StringBuilder("unsold <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUnsoldLike(String value) {
            addCriterion("unsold like", value, "unsold");
            return (Criteria) this;
        }

        public Criteria andUnsoldNotLike(String value) {
            addCriterion("unsold not like", value, "unsold");
            return (Criteria) this;
        }

        public Criteria andUnsoldIn(List<String> values) {
            addCriterion("unsold in", values, "unsold");
            return (Criteria) this;
        }

        public Criteria andUnsoldNotIn(List<String> values) {
            addCriterion("unsold not in", values, "unsold");
            return (Criteria) this;
        }

        public Criteria andUnsoldBetween(String value1, String value2) {
            addCriterion("unsold between", value1, value2, "unsold");
            return (Criteria) this;
        }

        public Criteria andUnsoldNotBetween(String value1, String value2) {
            addCriterion("unsold not between", value1, value2, "unsold");
            return (Criteria) this;
        }

        public Criteria andSoldLikeInsensitive(String value) {
            addCriterion("upper(sold) like", value.toUpperCase(), "sold");
            return (Criteria) this;
        }

        public Criteria andUnsoldLikeInsensitive(String value) {
            addCriterion("upper(unsold) like", value.toUpperCase(), "unsold");
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
        private StockExample example;

        /**
         *
         * @mbg.generated Tue Oct 15 16:35:42 CST 2019
         */
        protected Criteria(StockExample example) {
            super();
            this.example = example;
        }

        /**
         *
         * @mbg.generated Tue Oct 15 16:35:42 CST 2019
         */
        public StockExample example() {
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
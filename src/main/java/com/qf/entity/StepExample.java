package com.qf.entity;

import java.util.ArrayList;
import java.util.List;

public class StepExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table step
     *
     * @mbggenerated Tue Apr 09 21:38:01 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table step
     *
     * @mbggenerated Tue Apr 09 21:38:01 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table step
     *
     * @mbggenerated Tue Apr 09 21:38:01 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table step
     *
     * @mbggenerated Tue Apr 09 21:38:01 CST 2019
     */
    public StepExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table step
     *
     * @mbggenerated Tue Apr 09 21:38:01 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table step
     *
     * @mbggenerated Tue Apr 09 21:38:01 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table step
     *
     * @mbggenerated Tue Apr 09 21:38:01 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table step
     *
     * @mbggenerated Tue Apr 09 21:38:01 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table step
     *
     * @mbggenerated Tue Apr 09 21:38:01 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table step
     *
     * @mbggenerated Tue Apr 09 21:38:01 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table step
     *
     * @mbggenerated Tue Apr 09 21:38:01 CST 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table step
     *
     * @mbggenerated Tue Apr 09 21:38:01 CST 2019
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table step
     *
     * @mbggenerated Tue Apr 09 21:38:01 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table step
     *
     * @mbggenerated Tue Apr 09 21:38:01 CST 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table step
     *
     * @mbggenerated Tue Apr 09 21:38:01 CST 2019
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

        public Criteria andStepIdIsNull() {
            addCriterion("step_id is null");
            return (Criteria) this;
        }

        public Criteria andStepIdIsNotNull() {
            addCriterion("step_id is not null");
            return (Criteria) this;
        }

        public Criteria andStepIdEqualTo(Integer value) {
            addCriterion("step_id =", value, "stepId");
            return (Criteria) this;
        }

        public Criteria andStepIdNotEqualTo(Integer value) {
            addCriterion("step_id <>", value, "stepId");
            return (Criteria) this;
        }

        public Criteria andStepIdGreaterThan(Integer value) {
            addCriterion("step_id >", value, "stepId");
            return (Criteria) this;
        }

        public Criteria andStepIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("step_id >=", value, "stepId");
            return (Criteria) this;
        }

        public Criteria andStepIdLessThan(Integer value) {
            addCriterion("step_id <", value, "stepId");
            return (Criteria) this;
        }

        public Criteria andStepIdLessThanOrEqualTo(Integer value) {
            addCriterion("step_id <=", value, "stepId");
            return (Criteria) this;
        }

        public Criteria andStepIdIn(List<Integer> values) {
            addCriterion("step_id in", values, "stepId");
            return (Criteria) this;
        }

        public Criteria andStepIdNotIn(List<Integer> values) {
            addCriterion("step_id not in", values, "stepId");
            return (Criteria) this;
        }

        public Criteria andStepIdBetween(Integer value1, Integer value2) {
            addCriterion("step_id between", value1, value2, "stepId");
            return (Criteria) this;
        }

        public Criteria andStepIdNotBetween(Integer value1, Integer value2) {
            addCriterion("step_id not between", value1, value2, "stepId");
            return (Criteria) this;
        }

        public Criteria andBookIdIsNull() {
            addCriterion("book_id is null");
            return (Criteria) this;
        }

        public Criteria andBookIdIsNotNull() {
            addCriterion("book_id is not null");
            return (Criteria) this;
        }

        public Criteria andBookIdEqualTo(Integer value) {
            addCriterion("book_id =", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotEqualTo(Integer value) {
            addCriterion("book_id <>", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdGreaterThan(Integer value) {
            addCriterion("book_id >", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("book_id >=", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdLessThan(Integer value) {
            addCriterion("book_id <", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdLessThanOrEqualTo(Integer value) {
            addCriterion("book_id <=", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdIn(List<Integer> values) {
            addCriterion("book_id in", values, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotIn(List<Integer> values) {
            addCriterion("book_id not in", values, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdBetween(Integer value1, Integer value2) {
            addCriterion("book_id between", value1, value2, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotBetween(Integer value1, Integer value2) {
            addCriterion("book_id not between", value1, value2, "bookId");
            return (Criteria) this;
        }

        public Criteria andStepNameIsNull() {
            addCriterion("step_name is null");
            return (Criteria) this;
        }

        public Criteria andStepNameIsNotNull() {
            addCriterion("step_name is not null");
            return (Criteria) this;
        }

        public Criteria andStepNameEqualTo(Integer value) {
            addCriterion("step_name =", value, "stepName");
            return (Criteria) this;
        }

        public Criteria andStepNameNotEqualTo(Integer value) {
            addCriterion("step_name <>", value, "stepName");
            return (Criteria) this;
        }

        public Criteria andStepNameGreaterThan(Integer value) {
            addCriterion("step_name >", value, "stepName");
            return (Criteria) this;
        }

        public Criteria andStepNameGreaterThanOrEqualTo(Integer value) {
            addCriterion("step_name >=", value, "stepName");
            return (Criteria) this;
        }

        public Criteria andStepNameLessThan(Integer value) {
            addCriterion("step_name <", value, "stepName");
            return (Criteria) this;
        }

        public Criteria andStepNameLessThanOrEqualTo(Integer value) {
            addCriterion("step_name <=", value, "stepName");
            return (Criteria) this;
        }

        public Criteria andStepNameIn(List<Integer> values) {
            addCriterion("step_name in", values, "stepName");
            return (Criteria) this;
        }

        public Criteria andStepNameNotIn(List<Integer> values) {
            addCriterion("step_name not in", values, "stepName");
            return (Criteria) this;
        }

        public Criteria andStepNameBetween(Integer value1, Integer value2) {
            addCriterion("step_name between", value1, value2, "stepName");
            return (Criteria) this;
        }

        public Criteria andStepNameNotBetween(Integer value1, Integer value2) {
            addCriterion("step_name not between", value1, value2, "stepName");
            return (Criteria) this;
        }

        public Criteria andStepValueIsNull() {
            addCriterion("step_value is null");
            return (Criteria) this;
        }

        public Criteria andStepValueIsNotNull() {
            addCriterion("step_value is not null");
            return (Criteria) this;
        }

        public Criteria andStepValueEqualTo(String value) {
            addCriterion("step_value =", value, "stepValue");
            return (Criteria) this;
        }

        public Criteria andStepValueNotEqualTo(String value) {
            addCriterion("step_value <>", value, "stepValue");
            return (Criteria) this;
        }

        public Criteria andStepValueGreaterThan(String value) {
            addCriterion("step_value >", value, "stepValue");
            return (Criteria) this;
        }

        public Criteria andStepValueGreaterThanOrEqualTo(String value) {
            addCriterion("step_value >=", value, "stepValue");
            return (Criteria) this;
        }

        public Criteria andStepValueLessThan(String value) {
            addCriterion("step_value <", value, "stepValue");
            return (Criteria) this;
        }

        public Criteria andStepValueLessThanOrEqualTo(String value) {
            addCriterion("step_value <=", value, "stepValue");
            return (Criteria) this;
        }

        public Criteria andStepValueLike(String value) {
            addCriterion("step_value like", value, "stepValue");
            return (Criteria) this;
        }

        public Criteria andStepValueNotLike(String value) {
            addCriterion("step_value not like", value, "stepValue");
            return (Criteria) this;
        }

        public Criteria andStepValueIn(List<String> values) {
            addCriterion("step_value in", values, "stepValue");
            return (Criteria) this;
        }

        public Criteria andStepValueNotIn(List<String> values) {
            addCriterion("step_value not in", values, "stepValue");
            return (Criteria) this;
        }

        public Criteria andStepValueBetween(String value1, String value2) {
            addCriterion("step_value between", value1, value2, "stepValue");
            return (Criteria) this;
        }

        public Criteria andStepValueNotBetween(String value1, String value2) {
            addCriterion("step_value not between", value1, value2, "stepValue");
            return (Criteria) this;
        }

        public Criteria andStepImageIsNull() {
            addCriterion("step_image is null");
            return (Criteria) this;
        }

        public Criteria andStepImageIsNotNull() {
            addCriterion("step_image is not null");
            return (Criteria) this;
        }

        public Criteria andStepImageEqualTo(String value) {
            addCriterion("step_image =", value, "stepImage");
            return (Criteria) this;
        }

        public Criteria andStepImageNotEqualTo(String value) {
            addCriterion("step_image <>", value, "stepImage");
            return (Criteria) this;
        }

        public Criteria andStepImageGreaterThan(String value) {
            addCriterion("step_image >", value, "stepImage");
            return (Criteria) this;
        }

        public Criteria andStepImageGreaterThanOrEqualTo(String value) {
            addCriterion("step_image >=", value, "stepImage");
            return (Criteria) this;
        }

        public Criteria andStepImageLessThan(String value) {
            addCriterion("step_image <", value, "stepImage");
            return (Criteria) this;
        }

        public Criteria andStepImageLessThanOrEqualTo(String value) {
            addCriterion("step_image <=", value, "stepImage");
            return (Criteria) this;
        }

        public Criteria andStepImageLike(String value) {
            addCriterion("step_image like", value, "stepImage");
            return (Criteria) this;
        }

        public Criteria andStepImageNotLike(String value) {
            addCriterion("step_image not like", value, "stepImage");
            return (Criteria) this;
        }

        public Criteria andStepImageIn(List<String> values) {
            addCriterion("step_image in", values, "stepImage");
            return (Criteria) this;
        }

        public Criteria andStepImageNotIn(List<String> values) {
            addCriterion("step_image not in", values, "stepImage");
            return (Criteria) this;
        }

        public Criteria andStepImageBetween(String value1, String value2) {
            addCriterion("step_image between", value1, value2, "stepImage");
            return (Criteria) this;
        }

        public Criteria andStepImageNotBetween(String value1, String value2) {
            addCriterion("step_image not between", value1, value2, "stepImage");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table step
     *
     * @mbggenerated do_not_delete_during_merge Tue Apr 09 21:38:01 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table step
     *
     * @mbggenerated Tue Apr 09 21:38:01 CST 2019
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
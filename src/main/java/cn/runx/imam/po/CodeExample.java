package cn.runx.imam.po;

import java.util.ArrayList;
import java.util.List;

public class CodeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CodeExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
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

        public Criteria andCodedescriptionIsNull() {
            addCriterion("codeDescription is null");
            return (Criteria) this;
        }

        public Criteria andCodedescriptionIsNotNull() {
            addCriterion("codeDescription is not null");
            return (Criteria) this;
        }

        public Criteria andCodedescriptionEqualTo(String value) {
            addCriterion("codeDescription =", value, "codedescription");
            return (Criteria) this;
        }

        public Criteria andCodedescriptionNotEqualTo(String value) {
            addCriterion("codeDescription <>", value, "codedescription");
            return (Criteria) this;
        }

        public Criteria andCodedescriptionGreaterThan(String value) {
            addCriterion("codeDescription >", value, "codedescription");
            return (Criteria) this;
        }

        public Criteria andCodedescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("codeDescription >=", value, "codedescription");
            return (Criteria) this;
        }

        public Criteria andCodedescriptionLessThan(String value) {
            addCriterion("codeDescription <", value, "codedescription");
            return (Criteria) this;
        }

        public Criteria andCodedescriptionLessThanOrEqualTo(String value) {
            addCriterion("codeDescription <=", value, "codedescription");
            return (Criteria) this;
        }

        public Criteria andCodedescriptionLike(String value) {
            addCriterion("codeDescription like", value, "codedescription");
            return (Criteria) this;
        }

        public Criteria andCodedescriptionNotLike(String value) {
            addCriterion("codeDescription not like", value, "codedescription");
            return (Criteria) this;
        }

        public Criteria andCodedescriptionIn(List<String> values) {
            addCriterion("codeDescription in", values, "codedescription");
            return (Criteria) this;
        }

        public Criteria andCodedescriptionNotIn(List<String> values) {
            addCriterion("codeDescription not in", values, "codedescription");
            return (Criteria) this;
        }

        public Criteria andCodedescriptionBetween(String value1, String value2) {
            addCriterion("codeDescription between", value1, value2, "codedescription");
            return (Criteria) this;
        }

        public Criteria andCodedescriptionNotBetween(String value1, String value2) {
            addCriterion("codeDescription not between", value1, value2, "codedescription");
            return (Criteria) this;
        }

        public Criteria andCodeurlIsNull() {
            addCriterion("codeUrl is null");
            return (Criteria) this;
        }

        public Criteria andCodeurlIsNotNull() {
            addCriterion("codeUrl is not null");
            return (Criteria) this;
        }

        public Criteria andCodeurlEqualTo(String value) {
            addCriterion("codeUrl =", value, "codeurl");
            return (Criteria) this;
        }

        public Criteria andCodeurlNotEqualTo(String value) {
            addCriterion("codeUrl <>", value, "codeurl");
            return (Criteria) this;
        }

        public Criteria andCodeurlGreaterThan(String value) {
            addCriterion("codeUrl >", value, "codeurl");
            return (Criteria) this;
        }

        public Criteria andCodeurlGreaterThanOrEqualTo(String value) {
            addCriterion("codeUrl >=", value, "codeurl");
            return (Criteria) this;
        }

        public Criteria andCodeurlLessThan(String value) {
            addCriterion("codeUrl <", value, "codeurl");
            return (Criteria) this;
        }

        public Criteria andCodeurlLessThanOrEqualTo(String value) {
            addCriterion("codeUrl <=", value, "codeurl");
            return (Criteria) this;
        }

        public Criteria andCodeurlLike(String value) {
            addCriterion("codeUrl like", value, "codeurl");
            return (Criteria) this;
        }

        public Criteria andCodeurlNotLike(String value) {
            addCriterion("codeUrl not like", value, "codeurl");
            return (Criteria) this;
        }

        public Criteria andCodeurlIn(List<String> values) {
            addCriterion("codeUrl in", values, "codeurl");
            return (Criteria) this;
        }

        public Criteria andCodeurlNotIn(List<String> values) {
            addCriterion("codeUrl not in", values, "codeurl");
            return (Criteria) this;
        }

        public Criteria andCodeurlBetween(String value1, String value2) {
            addCriterion("codeUrl between", value1, value2, "codeurl");
            return (Criteria) this;
        }

        public Criteria andCodeurlNotBetween(String value1, String value2) {
            addCriterion("codeUrl not between", value1, value2, "codeurl");
            return (Criteria) this;
        }

        public Criteria andCodenameIsNull() {
            addCriterion("codeName is null");
            return (Criteria) this;
        }

        public Criteria andCodenameIsNotNull() {
            addCriterion("codeName is not null");
            return (Criteria) this;
        }

        public Criteria andCodenameEqualTo(String value) {
            addCriterion("codeName =", value, "codename");
            return (Criteria) this;
        }

        public Criteria andCodenameNotEqualTo(String value) {
            addCriterion("codeName <>", value, "codename");
            return (Criteria) this;
        }

        public Criteria andCodenameGreaterThan(String value) {
            addCriterion("codeName >", value, "codename");
            return (Criteria) this;
        }

        public Criteria andCodenameGreaterThanOrEqualTo(String value) {
            addCriterion("codeName >=", value, "codename");
            return (Criteria) this;
        }

        public Criteria andCodenameLessThan(String value) {
            addCriterion("codeName <", value, "codename");
            return (Criteria) this;
        }

        public Criteria andCodenameLessThanOrEqualTo(String value) {
            addCriterion("codeName <=", value, "codename");
            return (Criteria) this;
        }

        public Criteria andCodenameLike(String value) {
            addCriterion("codeName like", value, "codename");
            return (Criteria) this;
        }

        public Criteria andCodenameNotLike(String value) {
            addCriterion("codeName not like", value, "codename");
            return (Criteria) this;
        }

        public Criteria andCodenameIn(List<String> values) {
            addCriterion("codeName in", values, "codename");
            return (Criteria) this;
        }

        public Criteria andCodenameNotIn(List<String> values) {
            addCriterion("codeName not in", values, "codename");
            return (Criteria) this;
        }

        public Criteria andCodenameBetween(String value1, String value2) {
            addCriterion("codeName between", value1, value2, "codename");
            return (Criteria) this;
        }

        public Criteria andCodenameNotBetween(String value1, String value2) {
            addCriterion("codeName not between", value1, value2, "codename");
            return (Criteria) this;
        }

        public Criteria andCodepasswordIsNull() {
            addCriterion("codePassword is null");
            return (Criteria) this;
        }

        public Criteria andCodepasswordIsNotNull() {
            addCriterion("codePassword is not null");
            return (Criteria) this;
        }

        public Criteria andCodepasswordEqualTo(String value) {
            addCriterion("codePassword =", value, "codepassword");
            return (Criteria) this;
        }

        public Criteria andCodepasswordNotEqualTo(String value) {
            addCriterion("codePassword <>", value, "codepassword");
            return (Criteria) this;
        }

        public Criteria andCodepasswordGreaterThan(String value) {
            addCriterion("codePassword >", value, "codepassword");
            return (Criteria) this;
        }

        public Criteria andCodepasswordGreaterThanOrEqualTo(String value) {
            addCriterion("codePassword >=", value, "codepassword");
            return (Criteria) this;
        }

        public Criteria andCodepasswordLessThan(String value) {
            addCriterion("codePassword <", value, "codepassword");
            return (Criteria) this;
        }

        public Criteria andCodepasswordLessThanOrEqualTo(String value) {
            addCriterion("codePassword <=", value, "codepassword");
            return (Criteria) this;
        }

        public Criteria andCodepasswordLike(String value) {
            addCriterion("codePassword like", value, "codepassword");
            return (Criteria) this;
        }

        public Criteria andCodepasswordNotLike(String value) {
            addCriterion("codePassword not like", value, "codepassword");
            return (Criteria) this;
        }

        public Criteria andCodepasswordIn(List<String> values) {
            addCriterion("codePassword in", values, "codepassword");
            return (Criteria) this;
        }

        public Criteria andCodepasswordNotIn(List<String> values) {
            addCriterion("codePassword not in", values, "codepassword");
            return (Criteria) this;
        }

        public Criteria andCodepasswordBetween(String value1, String value2) {
            addCriterion("codePassword between", value1, value2, "codepassword");
            return (Criteria) this;
        }

        public Criteria andCodepasswordNotBetween(String value1, String value2) {
            addCriterion("codePassword not between", value1, value2, "codepassword");
            return (Criteria) this;
        }

        public Criteria andCodehintIsNull() {
            addCriterion("codeHint is null");
            return (Criteria) this;
        }

        public Criteria andCodehintIsNotNull() {
            addCriterion("codeHint is not null");
            return (Criteria) this;
        }

        public Criteria andCodehintEqualTo(String value) {
            addCriterion("codeHint =", value, "codehint");
            return (Criteria) this;
        }

        public Criteria andCodehintNotEqualTo(String value) {
            addCriterion("codeHint <>", value, "codehint");
            return (Criteria) this;
        }

        public Criteria andCodehintGreaterThan(String value) {
            addCriterion("codeHint >", value, "codehint");
            return (Criteria) this;
        }

        public Criteria andCodehintGreaterThanOrEqualTo(String value) {
            addCriterion("codeHint >=", value, "codehint");
            return (Criteria) this;
        }

        public Criteria andCodehintLessThan(String value) {
            addCriterion("codeHint <", value, "codehint");
            return (Criteria) this;
        }

        public Criteria andCodehintLessThanOrEqualTo(String value) {
            addCriterion("codeHint <=", value, "codehint");
            return (Criteria) this;
        }

        public Criteria andCodehintLike(String value) {
            addCriterion("codeHint like", value, "codehint");
            return (Criteria) this;
        }

        public Criteria andCodehintNotLike(String value) {
            addCriterion("codeHint not like", value, "codehint");
            return (Criteria) this;
        }

        public Criteria andCodehintIn(List<String> values) {
            addCriterion("codeHint in", values, "codehint");
            return (Criteria) this;
        }

        public Criteria andCodehintNotIn(List<String> values) {
            addCriterion("codeHint not in", values, "codehint");
            return (Criteria) this;
        }

        public Criteria andCodehintBetween(String value1, String value2) {
            addCriterion("codeHint between", value1, value2, "codehint");
            return (Criteria) this;
        }

        public Criteria andCodehintNotBetween(String value1, String value2) {
            addCriterion("codeHint not between", value1, value2, "codehint");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userId is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userId is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userId =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userId <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userId >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userId >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userId <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userId <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("userId in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("userId not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userId between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userId not between", value1, value2, "userid");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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
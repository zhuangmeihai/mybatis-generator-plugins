package com.google.code.mybatis.generator.plugins.gen;

import static org.apache.ibatis.jdbc.SqlBuilder.BEGIN;
import static org.apache.ibatis.jdbc.SqlBuilder.DELETE_FROM;
import static org.apache.ibatis.jdbc.SqlBuilder.FROM;
import static org.apache.ibatis.jdbc.SqlBuilder.INSERT_INTO;
import static org.apache.ibatis.jdbc.SqlBuilder.ORDER_BY;
import static org.apache.ibatis.jdbc.SqlBuilder.SELECT;
import static org.apache.ibatis.jdbc.SqlBuilder.SELECT_DISTINCT;
import static org.apache.ibatis.jdbc.SqlBuilder.SET;
import static org.apache.ibatis.jdbc.SqlBuilder.SQL;
import static org.apache.ibatis.jdbc.SqlBuilder.UPDATE;
import static org.apache.ibatis.jdbc.SqlBuilder.VALUES;
import static org.apache.ibatis.jdbc.SqlBuilder.WHERE;

import com.google.code.mybatis.generator.plugins.gen.Blog;
import com.google.code.mybatis.generator.plugins.gen.BlogExample.Criteria;
import com.google.code.mybatis.generator.plugins.gen.BlogExample.Criterion;
import com.google.code.mybatis.generator.plugins.gen.BlogExample;
import java.util.List;
import java.util.Map;

public class BlogSqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_BLOG
     *
     * @mbggenerated Wed Nov 30 10:19:04 CET 2011
     */
    public String countByExample(BlogExample example) {
        BEGIN();
        SELECT("count (*)");
        FROM("T_BLOG");
        applyWhere(example, false);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_BLOG
     *
     * @mbggenerated Wed Nov 30 10:19:04 CET 2011
     */
    public String deleteByExample(BlogExample example) {
        BEGIN();
        DELETE_FROM("T_BLOG");
        applyWhere(example, false);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_BLOG
     *
     * @mbggenerated Wed Nov 30 10:19:04 CET 2011
     */
    public String insertSelective(Blog record) {
        BEGIN();
        INSERT_INTO("T_BLOG");
        
        if (record.getName() != null) {
            VALUES("NAME", "#{name,jdbcType=VARCHAR}");
        }
        
        if (record.getUrl() != null) {
            VALUES("URL", "#{url,jdbcType=VARCHAR}");
        }
        
        if (record.getDescription() != null) {
            VALUES("DESCRIPTION", "#{description,jdbcType=VARCHAR}");
        }
        
        if (record.getOwnerId() != null) {
            VALUES("OWNER_ID", "#{ownerId,jdbcType=BIGINT}");
        }
        
        return SQL();
    }

    public String selectByExampleDecorated(BlogExample example) {
        String sql = this.selectByExample(example);
        return "select * from ( #{methodToDecorate} ) a where 1 = 1".replace("#{methodToDecorate}", sql);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_BLOG
     *
     * @mbggenerated Wed Nov 30 10:19:04 CET 2011
     */
    public String selectByExample(BlogExample example) {
        BEGIN();
        if (example != null && example.isDistinct()) {
            SELECT_DISTINCT("ID");
        } else {
            SELECT("ID");
        }
        SELECT("NAME");
        SELECT("URL");
        SELECT("DESCRIPTION");
        SELECT("OWNER_ID");
        FROM("T_BLOG");
        applyWhere(example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            ORDER_BY(example.getOrderByClause());
        }
        
        return SQL();
    }

    public String updateByExampleSelective2(Map<String, Object> parameter) {
        String sql = this.updateByExampleSelective(parameter);
        return "#{methodToDecorate} and a = ${a} and b = ${b}".replace("#{methodToDecorate}", sql);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_BLOG
     *
     * @mbggenerated Wed Nov 30 10:19:04 CET 2011
     */
    public String updateByExampleSelective(Map<String, Object> parameter) {
        Blog record = (Blog) parameter.get("record");
        BlogExample example = (BlogExample) parameter.get("example");
        
        BEGIN();
        UPDATE("T_BLOG");
        
        if (record.getId() != null) {
            SET("ID = #{record.id,jdbcType=BIGINT}");
        }
        
        if (record.getName() != null) {
            SET("NAME = #{record.name,jdbcType=VARCHAR}");
        }
        
        if (record.getUrl() != null) {
            SET("URL = #{record.url,jdbcType=VARCHAR}");
        }
        
        if (record.getDescription() != null) {
            SET("DESCRIPTION = #{record.description,jdbcType=VARCHAR}");
        }
        
        if (record.getOwnerId() != null) {
            SET("OWNER_ID = #{record.ownerId,jdbcType=BIGINT}");
        }
        
        applyWhere(example, true);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_BLOG
     *
     * @mbggenerated Wed Nov 30 10:19:04 CET 2011
     */
    public String updateByExample(Map<String, Object> parameter) {
        BEGIN();
        UPDATE("T_BLOG");
        
        SET("ID = #{record.id,jdbcType=BIGINT}");
        SET("NAME = #{record.name,jdbcType=VARCHAR}");
        SET("URL = #{record.url,jdbcType=VARCHAR}");
        SET("DESCRIPTION = #{record.description,jdbcType=VARCHAR}");
        SET("OWNER_ID = #{record.ownerId,jdbcType=BIGINT}");
        
        BlogExample example = (BlogExample) parameter.get("example");
        applyWhere(example, true);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_BLOG
     *
     * @mbggenerated Wed Nov 30 10:19:04 CET 2011
     */
    public String updateByPrimaryKeySelective(Blog record) {
        BEGIN();
        UPDATE("T_BLOG");
        
        if (record.getName() != null) {
            SET("NAME = #{name,jdbcType=VARCHAR}");
        }
        
        if (record.getUrl() != null) {
            SET("URL = #{url,jdbcType=VARCHAR}");
        }
        
        if (record.getDescription() != null) {
            SET("DESCRIPTION = #{description,jdbcType=VARCHAR}");
        }
        
        if (record.getOwnerId() != null) {
            SET("OWNER_ID = #{ownerId,jdbcType=BIGINT}");
        }
        
        WHERE("ID = #{id,jdbcType=BIGINT}");
        
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_BLOG
     *
     * @mbggenerated Wed Nov 30 10:19:04 CET 2011
     */
    protected void applyWhere(BlogExample example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        
        if (sb.length() > 0) {
            WHERE(sb.toString());
        }
    }
}
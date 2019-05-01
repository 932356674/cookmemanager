package com.qf.mapper;

import com.qf.entity.Step;
import com.qf.entity.StepExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StepMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table step
     *
     * @mbggenerated Tue Apr 09 21:38:01 CST 2019
     */
    int countByExample(StepExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table step
     *
     * @mbggenerated Tue Apr 09 21:38:01 CST 2019
     */
    int deleteByExample(StepExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table step
     *
     * @mbggenerated Tue Apr 09 21:38:01 CST 2019
     */
    int deleteByPrimaryKey(Integer stepId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table step
     *
     * @mbggenerated Tue Apr 09 21:38:01 CST 2019
     */
    int insert(Step record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table step
     *
     * @mbggenerated Tue Apr 09 21:38:01 CST 2019
     */
    int insertSelective(Step record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table step
     *
     * @mbggenerated Tue Apr 09 21:38:01 CST 2019
     */
    List<Step> selectByExample(StepExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table step
     *
     * @mbggenerated Tue Apr 09 21:38:01 CST 2019
     */
    Step selectByPrimaryKey(Integer stepId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table step
     *
     * @mbggenerated Tue Apr 09 21:38:01 CST 2019
     */
    int updateByExampleSelective(@Param("record") Step record, @Param("example") StepExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table step
     *
     * @mbggenerated Tue Apr 09 21:38:01 CST 2019
     */
    int updateByExample(@Param("record") Step record, @Param("example") StepExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table step
     *
     * @mbggenerated Tue Apr 09 21:38:01 CST 2019
     */
    int updateByPrimaryKeySelective(Step record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table step
     *
     * @mbggenerated Tue Apr 09 21:38:01 CST 2019
     */
    int updateByPrimaryKey(Step record);
}
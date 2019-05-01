package com.qf.mapper;

import com.qf.entity.AliOrder;
import com.qf.entity.AliOrderExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AliOrderMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ali_order
     *
     * @mbggenerated Fri Apr 19 14:58:20 CST 2019
     */
    int countByExample(AliOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ali_order
     *
     * @mbggenerated Fri Apr 19 14:58:20 CST 2019
     */
    int deleteByExample(AliOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ali_order
     *
     * @mbggenerated Fri Apr 19 14:58:20 CST 2019
     */
    int deleteByPrimaryKey(Long orderId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ali_order
     *
     * @mbggenerated Fri Apr 19 14:58:20 CST 2019
     */
    int insert(AliOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ali_order
     *
     * @mbggenerated Fri Apr 19 14:58:20 CST 2019
     */
    int insertSelective(AliOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ali_order
     *
     * @mbggenerated Fri Apr 19 14:58:20 CST 2019
     */
    List<AliOrder> selectByExample(AliOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ali_order
     *
     * @mbggenerated Fri Apr 19 14:58:20 CST 2019
     */
    AliOrder selectByPrimaryKey(Long orderId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ali_order
     *
     * @mbggenerated Fri Apr 19 14:58:20 CST 2019
     */
    int updateByExampleSelective(@Param("record") AliOrder record, @Param("example") AliOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ali_order
     *
     * @mbggenerated Fri Apr 19 14:58:20 CST 2019
     */
    int updateByExample(@Param("record") AliOrder record, @Param("example") AliOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ali_order
     *
     * @mbggenerated Fri Apr 19 14:58:20 CST 2019
     */
    int updateByPrimaryKeySelective(AliOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ali_order
     *
     * @mbggenerated Fri Apr 19 14:58:20 CST 2019
     */
    int updateByPrimaryKey(AliOrder record);
}
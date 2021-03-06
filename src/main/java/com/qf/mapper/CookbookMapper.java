package com.qf.mapper;

import com.qf.entity.Cookbook;
import com.qf.entity.CookbookExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CookbookMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cookbook
     *
     * @mbggenerated Tue Apr 09 21:38:01 CST 2019
     */
    int countByExample(CookbookExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cookbook
     *
     * @mbggenerated Tue Apr 09 21:38:01 CST 2019
     */
    int deleteByExample(CookbookExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cookbook
     *
     * @mbggenerated Tue Apr 09 21:38:01 CST 2019
     */
    int deleteByPrimaryKey(Integer bookId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cookbook
     *
     * @mbggenerated Tue Apr 09 21:38:01 CST 2019
     */
    int insert(Cookbook record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cookbook
     *
     * @mbggenerated Tue Apr 09 21:38:01 CST 2019
     */
    int insertSelective(Cookbook record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cookbook
     *
     * @mbggenerated Tue Apr 09 21:38:01 CST 2019
     */
    List<Cookbook> selectByExample(CookbookExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cookbook
     *
     * @mbggenerated Tue Apr 09 21:38:01 CST 2019
     */
    Cookbook selectByPrimaryKey(Integer bookId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cookbook
     *
     * @mbggenerated Tue Apr 09 21:38:01 CST 2019
     */
    int updateByExampleSelective(@Param("record") Cookbook record, @Param("example") CookbookExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cookbook
     *
     * @mbggenerated Tue Apr 09 21:38:01 CST 2019
     */
    int updateByExample(@Param("record") Cookbook record, @Param("example") CookbookExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cookbook
     *
     * @mbggenerated Tue Apr 09 21:38:01 CST 2019
     */
    int updateByPrimaryKeySelective(Cookbook record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cookbook
     *
     * @mbggenerated Tue Apr 09 21:38:01 CST 2019
     */
    int updateByPrimaryKey(Cookbook record);

    List<Cookbook> selectByType(int typeId);

    List<Cookbook> selectCookbookByUsId(Integer usId);
}
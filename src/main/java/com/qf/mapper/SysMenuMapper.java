package com.qf.mapper;


import com.qf.entity.SysMenu;
import com.qf.entity.SysMenuExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SysMenuMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_menu
     *
     * @mbggenerated Mon Mar 25 17:22:19 CST 2019
     */
    int countByExample(SysMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_menu
     *
     * @mbggenerated Mon Mar 25 17:22:19 CST 2019
     */
    int deleteByExample(SysMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_menu
     *
     * @mbggenerated Mon Mar 25 17:22:19 CST 2019
     */
    int deleteByPrimaryKey(Long menuId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_menu
     *
     * @mbggenerated Mon Mar 25 17:22:19 CST 2019
     */
    int insert(SysMenu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_menu
     *
     * @mbggenerated Mon Mar 25 17:22:19 CST 2019
     */
    int insertSelective(SysMenu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_menu
     *
     * @mbggenerated Mon Mar 25 17:22:19 CST 2019
     */
    List<SysMenu> selectByExample(SysMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_menu
     *
     * @mbggenerated Mon Mar 25 17:22:19 CST 2019
     */
    SysMenu selectByPrimaryKey(Long menuId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_menu
     *
     * @mbggenerated Mon Mar 25 17:22:19 CST 2019
     */
    int updateByExampleSelective(@Param("record") SysMenu record, @Param("example") SysMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_menu
     *
     * @mbggenerated Mon Mar 25 17:22:19 CST 2019
     */
    int updateByExample(@Param("record") SysMenu record, @Param("example") SysMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_menu
     *
     * @mbggenerated Mon Mar 25 17:22:19 CST 2019
     */
    int updateByPrimaryKeySelective(SysMenu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_menu
     *
     * @mbggenerated Mon Mar 25 17:22:19 CST 2019
     */
    int updateByPrimaryKey(SysMenu record);

    List<SysMenu> findMenuNotButton();

    List<String> findPermsByUserId(long userId);

    //查询目录
    List<SysMenu> findDir(long uId);

    //查询目录下的菜单
    List<SysMenu> findMenu(@Param("parentId") long parentId, @Param("uId") long uId);

}
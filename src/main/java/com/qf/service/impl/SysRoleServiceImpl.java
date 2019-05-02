package com.qf.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qf.entity.SysRole;
import com.qf.entity.SysRoleExample;
import com.qf.mapper.SysRoleMapper;
import com.qf.service.SysRoleService;
import com.qf.utils.*;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("sysRoleServiceImpl")
public class SysRoleServiceImpl implements SysRoleService {

    @Resource
    private SysRoleMapper sysRoleMapper;

    @Override
    public R selectRolesByUserId(long RoleId) {
        return R.ok().put("role",sysRoleMapper.selectByPrimaryKey(RoleId));
    }

    @Override
    public List<String> findRolesByUserId(long userId) {
        return sysRoleMapper.findRoleByUserId(userId);
    }

    @Override
    public ResultData findAllRole(Pager pager, String search, Sorter sorter) {
        PageHelper.offsetPage(pager.getOffset(),pager.getLimit());
        SysRoleExample example = new SysRoleExample();

        if(sorter!=null&&StringUtils.isNotEmpty(sorter.getSort())){
            example.setOrderByClause("role_id "+sorter.getOrder());
        }

        SysRoleExample.Criteria criteria = example.createCriteria();

        if(search!=null&&"".equals(search)){
            criteria.andRoleNameLike("%"+search+"%");
        }

        List<SysRole> list = sysRoleMapper.selectByExample(example);

        PageInfo info = new PageInfo(list);

        ResultData data = new ResultData(info.getTotal(),info.getList());
        return data;
    }



    @Override
    public R save(SysRole sysRole) {
        int i = sysRoleMapper.insert(sysRole);
        if(i>0){
            return R.ok();
        }
        return R.error("插入失败！");
    }

    @Override
    public R del(List<Long> ids) {

        SysRoleExample example = new SysRoleExample();
        SysRoleExample.Criteria criteria = example.createCriteria();
        for (Long id:ids){
            if (id<2){
                return R.error("系统菜单，不能删除！请核对");
            }
        }
        criteria.andRoleIdIn(ids);
        int i = sysRoleMapper.deleteByExample(example);
        if (i>0){
            return R.ok();
        }

        return R.error("删除失败!");
    }


    @Override
    public R update(SysRole sysRole) {
        int i = sysRoleMapper.updateByPrimaryKeySelective(sysRole);

        if(i>0){
            return R.ok();
        }
        return R.error("修改失败");
    }

}

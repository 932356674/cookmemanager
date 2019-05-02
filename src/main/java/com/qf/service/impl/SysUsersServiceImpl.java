package com.qf.service.impl;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qf.entity.SysUser;
import com.qf.entity.SysUserExample;
import com.qf.entity.User;
import com.qf.entity.UserExample;
import com.qf.mapper.SysUserMapper;
import com.qf.mapper.UserMapper;
import com.qf.service.SysUsersService;
import com.qf.utils.*;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class SysUsersServiceImpl implements SysUsersService {


    @Resource
    private SysUserMapper sysUserMapper;

    @Resource
    private UserMapper userMapper;


    @Override
    public List<User> findAll() {
        return userMapper.selectByExample(null);
    }

    @Override
    public R login(SysUser sysUser) {

        SysUserExample example = new SysUserExample();
        SysUserExample.Criteria criteria = example.createCriteria();

        criteria.andUsernameEqualTo(sysUser.getUsername());

        List<SysUser> list = sysUserMapper.selectByExample(example);

        if(list==null||list.size()==0){
            return R.error("账号不存在");
        }
        SysUser u = list.get(0);
        if(!u.getPassword().equals(sysUser.getPassword())){
            return R.error("密码错误");
        }
        if(u.getStatus()==0){
            return R.error("账号被冻结");
        }

        return R.ok().put("u",u);
    }

    @Override
    public ResultData findByPage(Pager pager, String search, Sorter sorter) {

        PageHelper.offsetPage(pager.getOffset(),pager.getLimit());
        UserExample example = new UserExample();

        if(sorter!=null&&StringUtils.isNotEmpty(sorter.getSort())){
            example.setOrderByClause("us_id "+sorter.getOrder());
        }

        UserExample.Criteria criteria = example.createCriteria();

        if(search!=null&&"".equals(search)){
            criteria.andUsNameLike("%"+search+"%");
        }

        List<User> list = userMapper.selectByExample(example);

        PageInfo info = new PageInfo(list);

        ResultData data = new ResultData(info.getTotal(),info.getList());

        System.out.println(data.toString());

        return data;

    }

    @Override
    public R save(User sysUser) {
        int i = userMapper.insert(sysUser);
        if(i>0){
            return R.ok();
        }
        return R.error("插入失败！");
    }

    @Override
    public R delete(List<Integer> ids) {

        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        for (Integer id:ids){
            if (id<2){
                return R.error("系统菜单，不能删除！请核对");
            }
        }
        criteria.andUsIdIn(ids);
        int i = userMapper.deleteByExample(example);
        if (i>0){
            return R.ok();
        }

        return R.error("删除失败!");
    }

    @Override
    public R findUser(Long userId) {

        SysUser sysUser = sysUserMapper.selectByPrimaryKey(userId);

        return R.ok().put("user",sysUser);
    }

    @Override
    public R update(SysUser sysUser) {
        int i = sysUserMapper.updateByPrimaryKeySelective(sysUser);

        if(i>0){
            return R.ok();
        }
        return R.error("修改失败");
    }

    @Override
    public SysUser findByUname(String name) {

        SysUserExample example = new SysUserExample();
        SysUserExample.Criteria criteria = example.createCriteria();
        criteria.andUsernameEqualTo(name);
        List<SysUser> list = sysUserMapper.selectByExample(example);
        if(list!=null&&list.size()>0){
            return list.get(0);
        }
        return null;
    }

    @Override
    public R updatePwd(String password, String newPassword) {

        SysUser user = ShiroUtils.getCurrentUser();
        Md5Hash passwordMd5 = new Md5Hash(password,user.getUsername(),1024);
        if(passwordMd5.toString().equals(user.getPassword())){
            System.out.println(newPassword+"------>>>加密前");
            Md5Hash md5Hash = new Md5Hash(newPassword,user.getUsername(),1024);
            newPassword = md5Hash.toString();
            System.out.println(newPassword+"------->>>MD5加密后");
            user.setPassword(newPassword);
            sysUserMapper.updateByPrimaryKeySelective(user);
            ShiroUtils.logout();
            return R.ok();
        }
        return R.error("修改失败");
    }

    @Override
    public List<SysUser> findLockAccount() {
        return sysUserMapper.findLockAccount();
    }

    @Override
    public int unLockAccount(SysUser user) {
        return sysUserMapper.unLockAccount(user);
    }

    @Override
    public R findPieData() {

        List<Map<String, Object>> pieData = sysUserMapper.findPieData();

        List list = new ArrayList();

        for (Map<String, Object> map : pieData) {

            String name = map.get("name")+"";
            list.add(name);
        }
        return R.ok().put("pieData",pieData).put("legendData",list);
    }

    @Override
    public R findBarData() {

        List<Map<String,Object>>list =sysUserMapper.findBarData();

        List yAxisData = new ArrayList();//y坐标
        List series0Data = new ArrayList();//男
        List series1Data = new ArrayList();//女

        for (Map<String, Object> map : list) {
            String deptName = map.get("deptName")+"";
            Object boy = map.get("boy");
            Object girl = map.get("girl");
            yAxisData.add(deptName);
            series0Data.add(boy);
            series1Data.add(girl);
        }

        return R.ok().put("yAxisData",yAxisData).put("series0Data",series0Data).put("series1Data",series1Data);
    }

    @Override
    public List<Map<String, Object>> exportExcel() {

        return sysUserMapper.findUserForExport();
    }
}

package com.qf.service;

import com.qf.entity.SysUser;
import com.qf.entity.User;
import com.qf.utils.Pager;
import com.qf.utils.R;
import com.qf.utils.ResultData;
import com.qf.utils.Sorter;

import java.util.List;
import java.util.Map;

public interface SysUsersService {

    public List<User> findAll();

    public R login(SysUser sysUser);

    public ResultData findByPage(Pager pager, String search, Sorter sorter);

    public R save (User sysUser);

    public R delete(List<Integer> ids);

    public R findUser(Long userId);

    public R update(SysUser sysUser);

    public SysUser findByUname(String name);

    public R updatePwd(String password, String newPassword);

    List<SysUser> findLockAccount();

    int unLockAccount(SysUser user);

//    R findPieData();

    R findBarData();

    List<Map<String,Object>>exportExcel();



}

package com.qf.service;

import com.qf.entity.SysRole;
import com.qf.utils.Pager;
import com.qf.utils.R;
import com.qf.utils.ResultData;
import com.qf.utils.Sorter;

import java.util.List;

public interface SysRoleService {

    public R selectRolesByUserId(long userId);

    public List<String> findRolesByUserId(long userId);

    public ResultData findAllRole(Pager pager, String search, Sorter sorter);

    public R save(SysRole sysRole);

    public R update(SysRole sysRole);

    public R del(List<Long> ids);
}

package com.qf.controller;

import com.qf.entity.SysRole;
import com.qf.log.Mylog;
import com.qf.service.SysRoleService;
import com.qf.utils.Pager;
import com.qf.utils.R;
import com.qf.utils.ResultData;
import com.qf.utils.Sorter;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;

@RestController
public class SysRoleController {

    @Resource
    private SysRoleService sysRoleService;

    @Mylog(value = "分页模糊查询",description = "查询所有")
    @ApiOperation(value = "分页模糊查询",notes = "查询所有")
    @RequestMapping(value = "/sys/role/list",method = RequestMethod.GET)
    public ResultData findByPage(Pager pager, String search, Sorter sorter){
        return sysRoleService.findAllRole(pager, search, sorter);
    }


    @Mylog(value = "删除用户",description = "删除")
    @ApiOperation(value = "删除用户",notes="删除")
    @RequestMapping("/sys/role/del")
    public R del(@RequestBody List<Long> ids){
        return sysRoleService.del(ids);
    }

    @Mylog(value = "根据id查询单个用户角色信息",description = "修改信息注入")
    @ApiOperation(value = "根据id查询单个用户角色信息",notes = "修改信息注入")
    @RequestMapping(value = "/sys/role/info/{roleId}",method = RequestMethod.GET)
    public R findUser(@PathVariable long roleId){
        return sysRoleService.selectRolesByUserId(roleId);

    }

    @Mylog(value = "修改单个用户角色信息",description = "修改")
    @ApiOperation(value = "修改单个用户角色信息",notes = "修改")
    @RequestMapping(value = "/sys/role/update", method = RequestMethod.POST)
    public R update(@RequestBody SysRole sysRole){
        return sysRoleService.update(sysRole);
    }


    @Mylog(value = "新增用户角色信息",description = "新增")
    @ApiOperation(value = "新增用户角色信息",notes = "新增")
    @RequestMapping(value = "/sys/role/save",method = RequestMethod.POST)
    public R saveRole(@RequestBody SysRole sysRole){
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        sysRole.setCreateTime(new Date(System.currentTimeMillis()));
        return sysRoleService.save(sysRole);
    }
}

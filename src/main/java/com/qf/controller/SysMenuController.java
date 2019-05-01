package com.qf.controller;

import com.qf.entity.SysMenu;
import com.qf.log.Mylog;
import com.qf.service.SysMenuService;
import com.qf.utils.R;
import com.qf.utils.ResultData;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/sys")
@Api(value = "菜单管理处理类",produces = "application/json")
public class SysMenuController {

    @Resource
    private SysMenuService sysMenuService;

    @Mylog(value = "菜单管理查询",description = "分页模糊排序查询")
    @ApiOperation(value = "菜单管理查询",notes = "分页模糊排序查询")
    @RequiresPermissions("sys:menu:list")
    @RequestMapping(value = "/menu/list",method = RequestMethod.GET)//?sort=menuId&order=asc&limiset=0
    /**
     * int limit , int offset:
     * String search:条件
     * String sort:排序字段
     * String order:排序方式
     */
    public ResultData menuList(int limit, int offset, String search, String sort, String order){
        return sysMenuService.findByPage(limit, offset,search,sort,order);
    }

    @Mylog(value = "删除",description = "删除菜单")
    @ApiOperation(value = "删除" ,notes = "删除菜单")
    @RequiresPermissions("sys:menu:delete")
    @RequestMapping(value = "/menu/del",method = RequestMethod.POST)
    public R del(@RequestBody List<Long> ids){
        return sysMenuService.del(ids);
    }

    @Mylog(value = "菜单分级查询",description = "菜单分级")
    @ApiOperation(value = "菜单分级查询",notes = "菜单分级")
    @RequiresPermissions("sys:menu:list")
    @RequestMapping(value = "/menu/select",method = RequestMethod.GET)
    public R selectMenu(){
        return sysMenuService.selectMenu();
    }

    @Mylog(value = "新增",description = "新增菜单")
    @ApiOperation(value = "新增",notes = "新增菜单")
    @RequiresPermissions("sys:menu:save")
    @RequestMapping(value = "/menu/save",method = RequestMethod.POST)
    public R saveMenu(@RequestBody SysMenu sysMenu){
        return sysMenuService.save(sysMenu);
    }

    @Mylog(value = "根据id查询单个菜单信息",description = "修改信息注入")
    @ApiOperation(value = "根据id查询单个菜单信息",notes = "修改信息注入")
    @RequiresPermissions("sys:menu:list")
    @RequestMapping(value = "/menu/info/{menuId}",method = RequestMethod.GET)
    public R findMenu(@PathVariable long menuId){
        return sysMenuService.findMenu(menuId);
    }


    @Mylog(value = "修改单个菜单信息",description = "修改")
    @ApiOperation(value = "修改单个菜单信息",notes = "修改")
    @RequiresPermissions("sys:menu:update")
    @RequestMapping(value= "/menu/update",method = RequestMethod.POST)
    public R update(@RequestBody SysMenu sysMenu){
        return sysMenuService.update(sysMenu);
    }

    @Mylog(value = "查询目录和菜单",description = "查询")
    @ApiOperation(value = "查询目录和菜单",notes = "查询")
    @RequiresPermissions("sys:menu:select")
    @RequestMapping(value="/menu/user",method = RequestMethod.GET)
    public R findDirAndMenu(){
        return sysMenuService.findMenuByUser();
    }
}

package com.qf.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qf.entity.SysMenu;
import com.qf.entity.SysMenuExample;
import com.qf.mapper.SysMenuMapper;
import com.qf.service.SysMenuService;
import com.qf.utils.R;
import com.qf.utils.ResultData;
import com.qf.utils.ShiroUtils;
import com.qf.utils.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class SysMenuServiceImpl implements SysMenuService {

    @Resource
    private SysMenuMapper sysMenuMapper;

    @Override
    public ResultData findByPage(int limit, int offset) {

        PageHelper.offsetPage(offset,limit);
        List<SysMenu> list = sysMenuMapper.selectByExample(null);
        PageInfo info = new PageInfo(list);
        long total = info.getTotal();
        List<SysMenu> list1 = info.getList();

        ResultData resultData = new ResultData(total,list1);
        return resultData;
    }

    @Override
    public ResultData findByPage(int limit, int offset, String search) {

        PageHelper.offsetPage(offset,limit);

        SysMenuExample example = null;
        if(search!=null&&!"".equals(search)){
            example = new SysMenuExample();
            SysMenuExample.Criteria criteria = example.createCriteria();
            criteria.andNameLike("%"+search+"%");
        }
        List<SysMenu>list = sysMenuMapper.selectByExample(example);

        PageInfo pageInfo = new PageInfo(list);
        long total = pageInfo.getTotal();

        List <SysMenu>list1 = pageInfo.getList();

        ResultData resultData = new ResultData(total,list1);
        return resultData;
    }

    @Override
    public ResultData findByPage(int limit, int offset, String search, String sort, String order) {

        PageHelper.offsetPage(offset,limit);

        SysMenuExample example = new SysMenuExample();
        SysMenuExample.Criteria criteria = example.createCriteria();

        if(search!=null&&!"".equals(search)){

            criteria.andNameLike("%"+search+"%");
        }
        if(sort!=null&&sort.equals("menuId")){
            sort = "menu_id";
        }
        example.setOrderByClause(sort+" "+order);

        List<SysMenu>list = sysMenuMapper.selectByExample(example);

        PageInfo info = new PageInfo(list);

        long total = info.getTotal();

        List<SysMenu>list1 = info.getList();

        ResultData resultData = new ResultData(total,list1);
        return resultData;
    }

    @Override
    public R del(List<Long> ids) {

        SysMenuExample example = new SysMenuExample();
        SysMenuExample.Criteria criteria = example.createCriteria();
        for (Long id : ids){
            if(id<29){
                return R.error("系统菜单，不能删除！请核对");
            }
        }
        //where id menu_in(?,?);
        criteria.andMenuIdIn(ids);
        int i = sysMenuMapper.deleteByExample(example);
        if(i>0){
            return R.ok();
        }
        return R.error("删除失败");
    }

    @Override
    public R selectMenu() {
        List<SysMenu> list = sysMenuMapper.findMenuNotButton();
        SysMenu sysMenu = new SysMenu();
        sysMenu.setMenuId(0l);
        sysMenu.setParentId(-1l);
        sysMenu.setName("一级目录");
        sysMenu.setOrderNum(0);

        list.add(sysMenu);
        return R.ok().put("menuList",list);
    }

    @Override
    public R save(SysMenu sysMenu){
        int i = sysMenuMapper.insert(sysMenu);
        return i>0?R.ok():R.error("新增失败");
    }

    @Override
    public R findMenu(long menuId) {
        SysMenu sysMenu = sysMenuMapper.selectByPrimaryKey(menuId);
        return R.ok().put("menu",sysMenu);
    }

    @Override
    public R update(SysMenu sysMenu) {
        int i = sysMenuMapper.updateByPrimaryKeySelective(sysMenu);
        if(i>0){
            return R.ok();
        }
        return R.error("修改失败");
    }

    @Override
    public List<String> findPermsByUserId(long userId) {

        List<String>list = sysMenuMapper.findPermsByUserId(userId);
        Set set = new HashSet<String>();
        for (String s:list){
            if(StringUtils.isNotEmpty(s)){
                String ss[] = s.split(",");
                for (String s1:ss){
                    set.add(s1);
                }
            }
        }
        List<String>newList = new ArrayList<>();
        newList.addAll(set);
        return newList;
    }

    /**
     * {menuList:[{
     *     目录信息
     *     list:{
     *         子菜单
     *     }
     * }
     * ,code:0,
     * permissions:[{sys:menu:list},{}]
     * ]}
     * @return
     */
    @Override
    public R findMenuByUser() {

        long userId = ShiroUtils.getUserId();

        //查找所有目录
        List<SysMenu> dir = sysMenuMapper.findDir(userId);

        for (SysMenu sysMenu:dir){
            //根据目录查询子菜单
            List<SysMenu> menu = sysMenuMapper.findMenu(sysMenu.getMenuId(),userId);
            sysMenu.setList(menu);
        }
        System.out.println(this+"------->>>>>");
        List<String> perms = this.findPermsByUserId(userId);

        return R.ok().put("menuList",dir).put("permissions",perms);

    }
}
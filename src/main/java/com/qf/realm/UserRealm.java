package com.qf.realm;

import com.qf.entity.SysUser;
import com.qf.service.SysMenuService;
import com.qf.service.SysRoleService;
import com.qf.service.SysUsersService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Component(value = "userRealm")
public class UserRealm extends AuthorizingRealm {

    //注入service
    @Resource
    private SysUsersService sysUsersService;
    @Resource
    private SysRoleService sysRoleService;
    @Resource
    private SysMenuService sysMenuService;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        System.out.println("--->授权");
        //得到当前登陆的用户
        SysUser user = (SysUser) principals.getPrimaryPrincipal();
        //根据当前用户id查询角色名
        List<String> roles = sysRoleService.findRolesByUserId(user.getUserId());
        //根据当前用户id查询权限
        List<String>perms = sysMenuService.findPermsByUserId(user.getUserId());

        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        info.addRoles(roles);
        info.addStringPermissions(perms);
        System.out.println("--->授权结束！");
        return info;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        System.out.println("--->认证");
        UsernamePasswordToken u = (UsernamePasswordToken) token;
        String uname = u.getUsername();
        String pass = new String(u.getPassword());
        //调用service层方法
        SysUser user = sysUsersService.findByUname(uname);

        if(user==null){
            System.out.println("账户错误");
            throw new UnknownAccountException("账号不存在！");
        }
        if (!user.getPassword().equals(pass)){
            System.out.println("密码错误");
            throw new IncorrectCredentialsException("密码错误！");
        }
        if(user.getStatus()==0){
            System.out.println("账号被冻结");
            throw new LockedAccountException("账号被冻结！");
        }

        SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(user,pass,this.getName());
        System.out.println("认证结束");
        return info;
    }

    public static void main(String[] args) {
        Md5Hash md5Hash = new Md5Hash("admin","admin",1024);
        System.out.println(md5Hash.toString());
    }
}

package com.qf.controller;

import com.google.code.kaptcha.Producer;
import com.qf.dto.SysUserDTO;
import com.qf.entity.SysUser;
import com.qf.entity.User;
import com.qf.log.Mylog;
import com.qf.service.SysUsersService;
import com.qf.utils.*;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.subject.Subject;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.OutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
public class SysUserController {

    @Resource
    private SysUsersService sysUsersService;

    @Resource
    private Producer producer;

    @RequestMapping("/findAll")
    @Mylog(value = "查所有",description = "查询")
    public List<User> findAll(){
        return sysUsersService.findAll();
    }

    @Mylog(value = "登录",description = "登录")
    @RequestMapping("/sys/login")
    public R login(@RequestBody SysUserDTO sysUserDTO){

        //传统登录return sysUsersService.login(sysUserDTO);
        //shiro登录
        //服务端生成的验证码
        String code = ShiroUtils.getCaptcha();
        //用户输入的验证码
        String c = sysUserDTO.getCaptcha();
        if(code!=null&&!code.equalsIgnoreCase(c)){
            return R.error("验证码错误");
        }
        String s = null;
        try {
            //1、得到subject
            Subject subject = SecurityUtils.getSubject();
            //2、把用户名和密码封装成UsernamePasswordToken对象
            //MD5加密
            String pwd = sysUserDTO.getPassword();
            Md5Hash md5Hash = new Md5Hash(pwd,sysUserDTO.getUsername(),1024);
            pwd = md5Hash.toString();
            UsernamePasswordToken token = new UsernamePasswordToken(sysUserDTO.getUsername(),pwd);

            //记住我
            if(sysUserDTO.isRememberMe()){
                token.setRememberMe(true);
            }

            //3、登录
            subject.login(token);//自定义Realm的认证方法
            System.out.println(subject.hasRole("管理员"));
            System.out.println(subject.isPermitted("sys:menu:save"));
            return R.ok();
        }catch (Exception e){
            s = e.getMessage();
        }
        return R.error(s);
    }
    @Mylog(value = "分页模糊查询",description = "查询所有")
    @ApiOperation(value = "分页模糊查询",notes = "查询所有")
    @RequiresPermissions("sys:user:list")
    @RequestMapping(value = "/sys/user/list",method = RequestMethod.GET)
    public ResultData findUserByPage(Pager pager, String search, Sorter sorter){
        return sysUsersService.findByPage(pager,search,sorter);
    }

    @Mylog(value = "新增用户",description = "新增")
    @ApiOperation(value = "新增用户",notes = "新增")
    @RequiresPermissions("sys:user:save")
    @RequestMapping(value = "/sys/user/save",method = RequestMethod.POST)
    public R saveUser(@RequestBody User sysUser){
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        // new Date()为获取当前系统时间
        Date time = null;
        try {
            time = df.parse(df.format(new Date()));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        sysUser.setUsCreatedate(time);
        System.out.println(time);
        return sysUsersService.save(sysUser);
    }

    @Mylog(value = "删除用户",description = "删除")
    @ApiOperation(value = "删除用户",notes="删除")
    @RequiresPermissions("sys:user:delete")
    @RequestMapping("/sys/user/del")
    public R del(@RequestBody List<Integer>ids){
        return sysUsersService.delete(ids);
    }


    @Mylog(value = "根据id查询单个用户信息",description = "修改信息注入")
    @ApiOperation(value = "根据id查询单个用户信息",notes = "修改信息注入")
    @RequiresPermissions("sys:user:select")
    @RequestMapping(value = "/sys/user/info/{userId}",method = RequestMethod.GET)
    public R findUser(@PathVariable long userId){
        return sysUsersService.findUser(userId);
    }

    @Mylog(value = "修改单个用户信息",description = "修改")
    @ApiOperation(value = "修改单个用户信息",notes = "修改")
    @RequiresPermissions("sys:user:update")
    @RequestMapping(value = "/sys/user/update", method = RequestMethod.POST)
    public R update(@RequestBody SysUser sysUser){
        return sysUsersService.update(sysUser);
    }

    /**
     * 验证码
     */
    @RequestMapping("/captcha.jpg")
    public void captcha(HttpServletResponse response){
        try {
            String text =  producer.createText();
            System.out.println("验证码：--->"+text);

            ShiroUtils.setAttribute("code",text);

            BufferedImage bufferedImage = producer.createImage(text);
            OutputStream os = response.getOutputStream();

            //把生成的验证码展示到客户端
            ImageIO.write(bufferedImage,"jpg",os);

        }catch (Exception e){
            e.printStackTrace();
        }
    }

//    @RequiresPermissions("sys:user:select")
    @RequestMapping("/sys/user/info")
    public R userInfo(){
        SysUser user = ShiroUtils.getCurrentUser();
        return R.ok().put("user",user);
    }

    @RequestMapping("/logout")
    public R logout(){
        //清空session
        ShiroUtils.logout();
        return R.ok();
    }

    @Mylog(value = "修改用户密码",description = "修改")
    @ApiOperation(value = "修改用户密码",notes = "修改")
    @RequestMapping("/sys/user/password")
    public R updatePwd(String password, String newPassword){
        return sysUsersService.updatePwd(password,newPassword);
    }
}

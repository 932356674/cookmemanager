package com.qf.log;

import com.alibaba.fastjson.JSON;
import com.qf.entity.SysLog;
import com.qf.service.SysLogService;
import com.qf.utils.HttpContextUtils;
import com.qf.utils.IPUtils;
import com.qf.utils.R;
import com.qf.utils.ShiroUtils;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.lang.reflect.Method;
import java.util.Date;

@Aspect//切面
@Component//把该类放入spring容器中管理
public class MyLogAspect {

    @Resource
    private SysLogService sysLogService;

    //@Pointcut(value = "execution(* com.qf.service.impl.*.*(..))")
    //@Pointcut(value = "execution(* com.qf.controller.*.*(..))")//描述方法的

    //描述注解的 对被Mylog修饰的方法进行切面
    @Pointcut(value = "@annotation(com.qf.log.Mylog)")
    public void myPointcut(){}

    @AfterReturning(pointcut = "myPointcut()")
    public void after(JoinPoint joinPoint){//得到跟目标方法有关的信息

        MethodSignature signature = (MethodSignature) joinPoint.getSignature();

        Method method = signature.getMethod();

        Mylog mylog = method.getAnnotation(Mylog.class);

        //记录日志信息
        //操作人
        String uname = ShiroUtils.getCurrentUser().getUsername();
        //操作
        String opration = mylog.value();
        //调用的方法
        String methodName = joinPoint.getTarget().getClass()+"."+joinPoint.getSignature().getName();
        //参数
        String params = JSON.toJSONString(joinPoint.getArgs());
        //得到客户端IP地址
        String ip = IPUtils.getIpAddr(HttpContextUtils.getHttpServletRequest());
        SysLog sysLog  = new SysLog();
        sysLog.setCreateDate(new Date());
        sysLog.setIp(ip);
        sysLog.setMethod(methodName);
        sysLog.setParams(params);
        sysLog.setUsername(uname);
        sysLog.setOperation(opration);
        R r = sysLogService.saveLog(sysLog);
        System.out.println(r);
    }
}

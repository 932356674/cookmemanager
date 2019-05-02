package com.qf.controller;

import com.qf.service.SysUsersService;
import com.qf.utils.R;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
public class EchartsController {

    @Resource
    private SysUsersService sysUsersService;

    @RequestMapping("/sys/echarts/bar")
    public R bar(){
        return sysUsersService.findBarData();
    }



}

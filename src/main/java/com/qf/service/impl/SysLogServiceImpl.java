package com.qf.service.impl;

import com.qf.entity.SysLog;
import com.qf.mapper.SysLogMapper;
import com.qf.service.SysLogService;
import com.qf.utils.R;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class SysLogServiceImpl implements SysLogService {

    @Resource
    private SysLogMapper sysLogMapper;

    @Override
    public R saveLog(SysLog sysLog) {

        int i = sysLogMapper.insert(sysLog);

        if(i>0){
            return R.ok("日志存储成功");
        }
        return R.error("日志存储失败");
    }
}

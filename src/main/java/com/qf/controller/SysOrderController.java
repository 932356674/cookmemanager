package com.qf.controller;

import com.qf.log.Mylog;
import com.qf.service.OrderService;
import com.qf.utils.Pager;
import com.qf.utils.ResultData;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/sys")
@Api(value = "订单管理处理类",produces = "application/json")
public class SysOrderController {

    @Resource
    private OrderService orderService;

    @Mylog(value = "订单查询",description = "分页排序查询")
    @ApiOperation(value = "订单查询",notes = "分页排序查询")
    @RequestMapping(value = "/order/list",method = RequestMethod.GET)
    /**
     *pager :分页
     *String sort:排序字段
     *String order:排序方式
     */
    public ResultData orderList(Pager pager, String sort, String order){
        return orderService.findByPage(pager,sort,order);
    }

}

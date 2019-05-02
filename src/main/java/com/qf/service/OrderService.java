package com.qf.service;

import com.qf.utils.Pager;
import com.qf.utils.ResultData;

import java.util.List;
import java.util.Map;

public interface OrderService {

    ResultData findByPage(Pager pager, String sort, String order);

    List<Map<String,Object>> exportExcel();
}

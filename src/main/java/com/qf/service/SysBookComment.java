package com.qf.service;


import com.qf.utils.Pager;
import com.qf.utils.R;
import com.qf.utils.ResultData;

import java.util.List;
import java.util.Map;

public interface SysBookComment {

    public ResultData selectBookComment(Pager pager);

    public R del(List<Integer> ids);

    List<Map<String,Object>> exportExcel();



}

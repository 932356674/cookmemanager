package com.qf.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qf.entity.AliOrder;
import com.qf.entity.AliOrderExample;
import com.qf.mapper.AliOrderMapper;
import com.qf.service.OrderService;
import com.qf.utils.Pager;
import com.qf.utils.ResultData;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class OrderServiceImpl implements OrderService {

    @Resource
    private AliOrderMapper aliOrderMapper;

    @Override
    public ResultData findByPage(Pager pager, String sort, String order) {

        PageHelper.offsetPage(pager.getOffset(),pager.getLimit());
        AliOrderExample aliOrderExample = new AliOrderExample();
        if(sort!=null&&sort.equals("orderNum")){
            sort = "order_num";
        }
        aliOrderExample.setOrderByClause(sort+" "+order);
        List<AliOrder> orders = aliOrderMapper.selectByExample(aliOrderExample);
        PageInfo info = new PageInfo(orders);
        return new ResultData(info.getTotal(),info.getList());
    }

    @Override
    public List<Map<String, Object>> exportExcel() {
        return aliOrderMapper.findorderByExport();
    }
}

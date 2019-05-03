package com.qf.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qf.entity.Product;
import com.qf.entity.ProductExample;
import com.qf.mapper.ProductMapper;
import com.qf.service.ProductService;
import com.qf.utils.Pager;
import com.qf.utils.R;
import com.qf.utils.ResultData;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Resource
    private ProductMapper productMapper;


    @Override
    public ResultData findProduct(Pager pager,String search) {
        PageHelper.offsetPage(pager.getOffset(),pager.getLimit());
        ProductExample example=new ProductExample();
        ProductExample.Criteria criteria=example.createCriteria();
        if (search!=null&&!search.equals("")){
            criteria.andProductNameLike("%"+search+"%");
        }
        List<Product> list=productMapper.selectByExample(example);
        PageInfo info=new PageInfo(list);
        ResultData data=new ResultData(info.getTotal(),info.getList());
        return data;
    }

    @Override
    public R insertProduct(Product product) {
        int i=productMapper.insert(product);
        return i>0?R.ok():R.error("新增失败");
    }

    @Override
    public R findProduct(int id) {
        Product product=productMapper.selectByPrimaryKey(id);
        return R.ok().put("product",product);
    }

    @Override
    public R updateProduct(Product product) {
        int i=productMapper.updateByPrimaryKey(product);
        return i>0?R.ok():R.error("修改失败");
    }

    @Override
    public R deleteProduct(List<Integer> id) {
        int i=0;
        for (Integer integer : id) {
            i = productMapper.deleteByPrimaryKey(integer);
        }
        return i>0?R.ok():R.error("删除失败");
    }
}

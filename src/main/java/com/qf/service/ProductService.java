package com.qf.service;

import com.qf.entity.Product;
import com.qf.utils.Pager;
import com.qf.utils.R;
import com.qf.utils.ResultData;

import java.util.List;

public interface ProductService {

    public ResultData findProduct(Pager pager);

    public R insertProduct(Product product);

    public R findProduct(int id);

    public R updateProduct(Product product);

    public R deleteProduct (List<Integer> id);

}

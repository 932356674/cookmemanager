package com.qf.controller;

import com.qf.entity.Product;
import com.qf.service.ProductService;
import com.qf.utils.Pager;
import com.qf.utils.R;
import com.qf.utils.ResultData;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/sys")
public class ProductController {
    @Resource
    private ProductService productService;

    @RequestMapping("/product/list")
    public ResultData findProduct(Pager pager,String search){
        return productService.findProduct(pager,search);
    }

    @RequestMapping("/product/save")
    public R insertProduct(@RequestBody Product product){
        return productService.insertProduct(product);
    }

    @RequestMapping("/product/info/{productId}")
    public R findProduct(@PathVariable int productId){
        return productService.findProduct(productId);
    }

    @RequestMapping("/product/update")
    public R updateProduct(@RequestBody Product product){
        return productService.updateProduct(product);
    }

    @RequestMapping("/product/del")
    public R deleteProduct(@RequestBody List<Integer> id){
        return productService.deleteProduct(id);
    }

}

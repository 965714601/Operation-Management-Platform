package com.hrm.service;

import com.hrm.pojo.Product;

import java.util.List;

/**
 * @author zjw
 * @package backend
 * @Date 2021/7/13
 * @Time 15:06
 */
public interface ProductService {

    //根据product_id查找信息
    Product findById(int product_id);

    //更新产品剩余量
    int updateProductSurplus(Product product);

    //    根据类型获取该类型所有产品的基本信息
    List<Product> listProductsByType(String type);

    //增加product的信息
    int insertProduct(Product product);

    //删除product的信息
    int deleteProduct(Product product);

    //修改product的信息
    int updateProduct(Product product);
}

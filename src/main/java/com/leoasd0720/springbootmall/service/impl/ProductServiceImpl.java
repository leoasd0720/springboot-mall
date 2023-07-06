package com.leoasd0720.springbootmall.service.impl;

import com.leoasd0720.springbootmall.dao.ProductDao;
import com.leoasd0720.springbootmall.dto.ProductRequest;
import com.leoasd0720.springbootmall.model.Product;
import com.leoasd0720.springbootmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public Product getProductById(Integer productId) {
        return productDao.getProductById(productId);
    }

    @Override
    public Integer createProduct(ProductRequest productRequest) {
        return productDao.createProduct(productRequest);
    }
}

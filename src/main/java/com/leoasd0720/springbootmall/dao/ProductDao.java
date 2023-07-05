package com.leoasd0720.springbootmall.dao;

import com.leoasd0720.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);
}

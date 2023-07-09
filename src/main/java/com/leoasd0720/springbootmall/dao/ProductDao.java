package com.leoasd0720.springbootmall.dao;

import com.leoasd0720.springbootmall.dto.ProductRequest;
import com.leoasd0720.springbootmall.model.Product;

import java.util.List;

public interface ProductDao {

    List<Product> getProducts();
    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}

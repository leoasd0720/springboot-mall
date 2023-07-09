package com.leoasd0720.springbootmall.service;

import com.leoasd0720.springbootmall.dto.ProductRequest;
import com.leoasd0720.springbootmall.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> getProducts();

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}

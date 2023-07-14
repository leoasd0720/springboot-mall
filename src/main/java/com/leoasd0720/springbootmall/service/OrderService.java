package com.leoasd0720.springbootmall.service;

import com.leoasd0720.springbootmall.dto.CreateOrderRequest;

public interface OrderService {

    Integer createOrder (Integer userId, CreateOrderRequest createOrderRequest);
}

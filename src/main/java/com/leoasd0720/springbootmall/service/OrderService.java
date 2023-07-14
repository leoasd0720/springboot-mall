package com.leoasd0720.springbootmall.service;

import com.leoasd0720.springbootmall.dto.CreateOrderRequest;
import com.leoasd0720.springbootmall.model.Order;

public interface OrderService {

    Order getOrderById(Integer orderId);

    Integer createOrder (Integer userId, CreateOrderRequest createOrderRequest);
}

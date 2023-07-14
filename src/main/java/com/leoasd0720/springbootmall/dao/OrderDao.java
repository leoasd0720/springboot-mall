package com.leoasd0720.springbootmall.dao;

import com.leoasd0720.springbootmall.model.Order;
import com.leoasd0720.springbootmall.model.OrderItem;
import com.leoasd0720.springbootmall.model.Product;

import java.util.List;

public interface OrderDao {

    Order getOrderById(Integer orderId);

    List<OrderItem> getOrderItemsByOrderId(Integer orderId);

    Integer createOrder(Integer userId, Integer totalAmount);

    void createOrderItems(Integer orderId, List<OrderItem> orderItemList);
}

package com.hy.flowersweb.service;

import com.hy.flowersweb.entity.Orders;

import java.util.List;

/**
 * Create By hy on 2020/2/25.
 */
public interface OrdersService {
    List<Orders> ordersList();
    List<Orders> uOrdersList(Orders orders);
    int addOrders(Orders orders);
    int updateOrders(Orders orders);
    int delOrders(int order_number);
    Orders ordersDetail(int order_number);
}

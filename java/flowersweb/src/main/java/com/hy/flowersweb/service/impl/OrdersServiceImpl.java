package com.hy.flowersweb.service.impl;

import com.hy.flowersweb.dao.OrdersMapper;
import com.hy.flowersweb.entity.Orders;
import com.hy.flowersweb.entity.OrdersExample;
import com.hy.flowersweb.service.OrdersService;
import com.sun.org.apache.xpath.internal.operations.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Create By hy on 2020/2/27.
 */
@Service
public class OrdersServiceImpl implements OrdersService {
    @Autowired
    private OrdersMapper ordersMapper;

    @Override
    public List<Orders> ordersList() {
        OrdersExample example = new OrdersExample();
        List<Orders> ordersList = ordersMapper.selectByExample(example);
        return ordersList;
    }

    @Override
    public List<Orders> uOrdersList(Orders orders) {
        OrdersExample example = new OrdersExample();
        example.createCriteria().andUser_idEqualTo(orders.getUser_id());
        List<Orders> uOrdersList = ordersMapper.selectByExample(example);
        return uOrdersList;
    }

    @Override
    public int addOrders(Orders orders) {
        return ordersMapper.insertSelective(orders);
    }

    @Override
    public int updateOrders(Orders orders) {
        OrdersExample example = new OrdersExample();
        example.createCriteria().andOrder_numberEqualTo(orders.getOrder_number());
        return ordersMapper.updateByExampleSelective(orders,example);
    }

    @Override
    public int delOrders(int order_number) {
        return ordersMapper.deleteByPrimaryKey(order_number);
    }

    @Override
    public Orders ordersDetail(int order_number) {
        return ordersMapper.selectByPrimaryKey(order_number);
    }
}

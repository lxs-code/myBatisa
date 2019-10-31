package com.zking.my.service.impl;

import com.zking.my.mapper.OrderMapper;
import com.zking.my.model.Order;
import com.zking.my.service.IOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderImpl implements IOrder {
    @Autowired
    private OrderMapper orderMapper;
    @Override
    public Order load(Order oe) {
        return orderMapper.loadCasecade(oe);
    }
}

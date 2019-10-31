package com.zking.my.service.impl;

import com.zking.my.model.Order;
import com.zking.my.service.IOrder;
import com.zking.my.service.test21;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class OrderImplTest extends test21 {

@Autowired
    private IOrder ss;


private Order order;


    @Override
    public void before() {
        super.before();
        order=new Order();
    }

    @Test
    public void load() throws Exception {
        order.setOrderId(1);


        Order load = ss.load(order);
        System.out.println(
                load
        );
        System.out.println(load.getCustomer());
    }

}
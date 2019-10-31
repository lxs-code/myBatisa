package com.zking.my.service;

import com.zking.my.model.Order;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface IOrder {


    Order load(Order oe);

}

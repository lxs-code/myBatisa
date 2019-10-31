package com.zking.my.model;

import lombok.ToString;
import org.aspectj.weaver.ast.Or;

import java.util.ArrayList;
import java.util.List;

@ToString(exclude = {"orderList"})
public class Customer {
    private Integer customerId;

    private String customerName;


    private List<Order> orderList =new ArrayList<Order>();


    public Customer(Integer customerId, String customerName) {
        this.customerId = customerId;
        this.customerName = customerName;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }

    public Customer() {
        super();
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
}
package com.zking.my.mapper;

import com.zking.my.model.Customer;

import java.util.List;

public interface CustomerMapper {
    int deleteByPrimaryKey(Long customerId);

    int insert(Customer record);

    int insertSelective(Customer record);

    Customer selectByPrimaryKey(Long customerId);

    int updateByPrimaryKeySelective(Customer record);

    int updateByPrimaryKey(Customer record);



    Customer   namegetCust(Customer record);

    Customer   telgetCust(Customer record);


    List<Customer>   list(Customer record );
}
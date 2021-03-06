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

    List<Customer>  yz(Customer record);

    List<Customer>  yz1(Customer record);


    long selectSex();

    long selectSex1();

    long selectAge1();
    long selectAge2();
    long selectAge3();
    long selectAge4();




    /**
     * 查询
     * @param cust
     * @return
     */
    List<Customer> list2(Customer cust);

    List<Customer> list1(Customer cust);

    /**
     * 修改状态
     */
    int updeteMode(Customer cust);

}
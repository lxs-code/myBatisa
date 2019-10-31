package com.zking.my.service.impl;

import com.zking.my.mapper.CustomerMapper;
import com.zking.my.model.Customer;
import com.zking.my.service.ICust;
import com.zking.my.service.test21;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class CustImplTest extends test21 {
    @Autowired
    private ICust iCust;


    private  Customer customer;

@Before
public void before(){
    customer=new Customer();
}

    @Test
    public void load() throws Exception {
        customer.setCustomerId(1);
        Customer load = iCust.load(customer);
        System.out.println(load);
    }

    @Test
    public void loadCustomer() throws Exception {
        customer.setCustomerId(1);
        Customer load =   iCust.loadCustomer(customer);
        System.out.println(load);
    }

}
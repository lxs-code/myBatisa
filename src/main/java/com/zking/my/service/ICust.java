package com.zking.my.service;

import com.zking.my.model.Customer;
import com.zking.my.util.PageBean;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface ICust {

    @Transactional(readOnly = true)
    Customer load(Customer ds);


    @Transactional(readOnly = true)
    Customer loadCustomer(Customer customer);

    @Transactional(readOnly = true)
    long selectSex();
    long selectSex1();

    @Transactional(readOnly = true)
    long selectAge1();
    long selectAge2();
    long selectAge3();
    long selectAge4();


    @Transactional(readOnly = true)
    List<Customer> list2(Customer cust, PageBean page);

    @Transactional(readOnly = true)
    List<Customer> list1(Customer cust, PageBean page);
    int updateCust(Customer cust);
}

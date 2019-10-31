package com.zking.my.service;

import com.zking.my.model.Customer;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface ICust {

    @Transactional(readOnly = true)
    Customer load(Customer ds);


    @Transactional(readOnly = true)
    Customer loadCustomer(Customer customer);
}

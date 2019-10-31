package com.zking.my.service.impl;

import com.zking.my.mapper.CustomerMapper;
import com.zking.my.model.Customer;
import com.zking.my.service.ICust;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustImpl implements ICust {



    @Autowired
    private CustomerMapper customerMapper;
    @Override
    public Customer load(Customer ds) {

        return customerMapper.selectByPrimaryKey(ds.getCustomerId());
    }

    @Override
    public Customer loadCustomer(Customer customer) {
        return customerMapper.loadCustomer(customer.getCustomerId());
    }
}


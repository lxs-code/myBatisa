package com.zking.my.service.Impls;

import com.zking.my.mapper.CustomerMapper;
import com.zking.my.model.Customer;
import com.zking.my.service.Borrowing.ICustomer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ICustomerImpl implements ICustomer {


    @Autowired
    private CustomerMapper customerMapper;
    @Override
    public int adduser(Customer user) {
        return customerMapper.insertSelective(user);
    }

    @Override
    public Customer longuser(Customer user) {
        Customer users=new Customer();
if(user.getCustomerTel()==null||user.getCustomerTel().equals("")){
    users = customerMapper.namegetCust(user);
}else{
    users = customerMapper.telgetCust(user);
}

        return users;
    }
}

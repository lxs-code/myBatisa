package com.zking.my.service.Impls;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zking.my.mapper.CustomerMapper;
import com.zking.my.model.Customer;
import com.zking.my.service.Borrowing.ICustomer;
import com.zking.my.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
        Customer users = new Customer();
        if (user.getCustomerTel() == null || user.getCustomerTel().equals("")) {
            users = customerMapper.namegetCust(user);
        } else {
            users = customerMapper.telgetCust(user);
        }

        return users;
    }


    @Override
    public int uploadcu(Customer customer) {
        return customerMapper.updateByPrimaryKeySelective(customer);
    }

    @Override
    public List<Customer> list(Customer user, PageBean pageBean) {

        if (null != pageBean && pageBean.isPagination()) {
            PageHelper.startPage(pageBean.getPage(), pageBean.getRows());
        }
        List<Customer> list = customerMapper.list(user);

        if (null != pageBean && pageBean.isPagination()) {
            PageInfo pageInfo = new PageInfo(list);
            pageBean.setTotal(pageInfo.getTotal() + "");
        }
        return list;
    }


}

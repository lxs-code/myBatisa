package com.zking.my.service.Borrowing;

import com.zking.my.model.Customer;
import com.zking.my.util.PageBean;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Transactional
public interface ICustomer {
    /**
     * 用户注册
     * @param user
     * @return
     */
    int adduser(Customer user);

    /**
        * 用户登录
     * @param user
     * @return
             */
    Customer longuser(Customer user);




   List<Customer>  list(Customer user, PageBean pageBean);



}

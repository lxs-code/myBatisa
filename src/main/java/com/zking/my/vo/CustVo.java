package com.zking.my.vo;

import com.zking.my.model.Customer;

import java.util.List;

public class CustVo extends Customer {
    private List<Integer> count;

    public List<Integer> getCount() {
        return count;
    }

    public void setCount(List<Integer> count) {
        this.count = count;
    }


}

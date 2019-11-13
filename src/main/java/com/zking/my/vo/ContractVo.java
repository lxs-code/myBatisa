package com.zking.my.vo;

import com.zking.my.model.Contract;
import com.zking.my.model.Customer;
import com.zking.my.model.Ledger;

public class ContractVo {



    private Customer cust;
    private Ledger led;
    private Contract con;

    public Contract getCon() {
        return con;
    }

    public void setCon(Contract con) {
        this.con = con;
    }

    public Ledger getLed() {
        return led;
    }

    public void setLed(Ledger led) {
        this.led = led;
    }

    public Customer getCust() {
        return cust;
    }

    public void setCust(Customer cust) {
        this.cust = cust;
    }

//
//    public String getCustomerName() {
//        return customerName;
//    }
//
//    public void setCustomerName(String customerName) {
//        this.customerName = customerName;
//    }
//
//    public String getUsername() {
//        return userName;
//    }
//
//    public void setUsername(String userName) {
//        this.userName = userName;
//    }
//
//    public Date getContractTime() {
//        return contractTime;
//    }
//
//    public void setContractTime(Date contractTime) {
//        this.contractTime = contractTime;
//    }
}

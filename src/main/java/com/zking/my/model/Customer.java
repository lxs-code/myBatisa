package com.zking.my.model;


/**
 * 客户
 */
public class Customer {
    private Long customerId;

    private String customerTel;

    private String customerName;

    private String customerPassword;

    private String customerSalt;

    private Integer customerLevel;

    private String customerZname;

    private String customerSex;

    private Integer customerAge;

    private String customerIdNumber;

    private String customerIdAddress;

    private String customerBank;

    private String customerTime;

    private Double custmoerTotalMoney;

    private Double custmoerConsumptionMoney;

    private String custmoerMode;

    public Customer(Long customerId, String customerTel, String customerName, String customerPassword, String customerSalt, Integer customerLevel, String customerZname, String customerSex, Integer customerAge, String customerIdNumber, String customerIdAddress, String customerBank, String customerTime, Double custmoerTotalMoney, Double custmoerConsumptionMoney, String custmoerMode) {
        this.customerId = customerId;
        this.customerTel = customerTel;
        this.customerName = customerName;
        this.customerPassword = customerPassword;
        this.customerSalt = customerSalt;
        this.customerLevel = customerLevel;
        this.customerZname = customerZname;
        this.customerSex = customerSex;
        this.customerAge = customerAge;
        this.customerIdNumber = customerIdNumber;
        this.customerIdAddress = customerIdAddress;
        this.customerBank = customerBank;
        this.customerTime = customerTime;
        this.custmoerTotalMoney = custmoerTotalMoney;
        this.custmoerConsumptionMoney = custmoerConsumptionMoney;
        this.custmoerMode = custmoerMode;
    }

    public Customer() {
        super();
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getCustomerTel() {
        return customerTel;
    }

    public void setCustomerTel(String customerTel) {
        this.customerTel = customerTel;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerPassword() {
        return customerPassword;
    }

    public void setCustomerPassword(String customerPassword) {
        this.customerPassword = customerPassword;
    }

    public String getCustomerSalt() {
        return customerSalt;
    }

    public void setCustomerSalt(String customerSalt) {
        this.customerSalt = customerSalt;
    }

    public Integer getCustomerLevel() {
        return customerLevel;
    }

    public void setCustomerLevel(Integer customerLevel) {
        this.customerLevel = customerLevel;
    }

    public String getCustomerZname() {
        return customerZname;
    }

    public void setCustomerZname(String customerZname) {
        this.customerZname = customerZname;
    }

    public String getCustomerSex() {
        return customerSex;
    }

    public void setCustomerSex(String customerSex) {
        this.customerSex = customerSex;
    }

    public Integer getCustomerAge() {
        return customerAge;
    }

    public void setCustomerAge(Integer customerAge) {
        this.customerAge = customerAge;
    }

    public String getCustomerIdNumber() {
        return customerIdNumber;
    }

    public void setCustomerIdNumber(String customerIdNumber) {
        this.customerIdNumber = customerIdNumber;
    }

    public String getCustomerIdAddress() {
        return customerIdAddress;
    }

    public void setCustomerIdAddress(String customerIdAddress) {
        this.customerIdAddress = customerIdAddress;
    }

    public String getCustomerBank() {
        return customerBank;
    }

    public void setCustomerBank(String customerBank) {
        this.customerBank = customerBank;
    }

    public String getCustomerTime() {
        return customerTime;
    }

    public void setCustomerTime(String customerTime) {
        this.customerTime = customerTime;
    }

    public Double getCustmoerTotalMoney() {
        return custmoerTotalMoney;
    }

    public void setCustmoerTotalMoney(Double custmoerTotalMoney) {
        this.custmoerTotalMoney = custmoerTotalMoney;
    }

    public Double getCustmoerConsumptionMoney() {
        return custmoerConsumptionMoney;
    }

    public void setCustmoerConsumptionMoney(Double custmoerConsumptionMoney) {
        this.custmoerConsumptionMoney = custmoerConsumptionMoney;
    }

    public String getCustmoerMode() {
        return custmoerMode;
    }

    public void setCustmoerMode(String custmoerMode) {
        this.custmoerMode = custmoerMode;
    }
}
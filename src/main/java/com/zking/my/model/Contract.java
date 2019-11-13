package com.zking.my.model;

public class Contract {
    private Long contractId;
    private String  customerzname;
    private String customerBank;
    private double Money;
    private String contractTime;
    private Long productId;


    private Long adminId;

    private Long customerId;

    private Long contractContent;



    public String getCustomerzname() {
        return customerzname;
    }

    public void setCustomerzname(String customerzname) {
        this.customerzname = customerzname;
    }

    private  Customer customer;
    private   Apply apply;


    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Apply getApply() {
        return apply;
    }

    public void setApply(Apply apply) {
        this.apply = apply;
    }

    public Contract(Long contractId, Long adminId, Long customerId, Long contractContent, String contractTime) {
        this.contractId = contractId;
        this.adminId = adminId;
        this.customerId = customerId;
        this.contractContent = contractContent;
        this.contractTime = contractTime;
    }

    public Long getproductId() {
        return productId;
    }

    public void setproductId(Long productId) {
        this.productId = productId;
    }


    public Contract() {
        super();
    }

    public Long getContractId() {
        return contractId;
    }

    public void setContractId(Long contractId) {
        this.contractId = contractId;
    }

    public Long getAdminId() {
        return adminId;
    }

    public void setAdminId(Long adminId) {
        this.adminId = adminId;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public Long getContractContent() {
        return contractContent;
    }

    public void setContractContent(Long contractContent) {
        this.contractContent = contractContent;
    }

    public String getContractTime() {
        return contractTime;
    }

    public void setContractTime(String contractTime) {
        this.contractTime = contractTime;
    }

    public String  getcustomerBank() {
        return customerBank;
    }

    public void setcustomerBank(String customerBank) {
        this.customerBank = customerBank;
    }


    public double  getMoney() {
        return Money;
    }

    public void setMoney(double Money) {
        this.Money = Money;
    }
}
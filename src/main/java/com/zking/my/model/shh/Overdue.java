package com.zking.my.model.shh;

public class Overdue {
    private Integer oid;

    private Integer customerId;

    private String customerName;

    private Double oresponse;

    private Double oresidue;

    private Double overdue;

    private String onumber;

    public Overdue(Integer oid, Integer customerId, String customerName, Double oresponse, Double oresidue, Double overdue, String onumber) {
        this.oid = oid;
        this.customerId = customerId;
        this.customerName = customerName;
        this.oresponse = oresponse;
        this.oresidue = oresidue;
        this.overdue = overdue;
        this.onumber = onumber;
    }

    public Overdue() {
        super();
    }

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Double getOresponse() {
        return oresponse;
    }

    public void setOresponse(Double oresponse) {
        this.oresponse = oresponse;
    }

    public Double getOresidue() {
        return oresidue;
    }

    public void setOresidue(Double oresidue) {
        this.oresidue = oresidue;
    }

    public Double getOverdue() {
        return overdue;
    }

    public void setOverdue(Double overdue) {
        this.overdue = overdue;
    }

    public String getOnumber() {
        return onumber;
    }

    public void setOnumber(String onumber) {
        this.onumber = onumber;
    }
}
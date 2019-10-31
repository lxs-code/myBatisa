package com.zking.my.model;

public class Product {
    private Long proId;

    private String proName;

    private Float proMoney;

    private Integer proPeriods;

    public Product(Long proId, String proName, Float proMoney, Integer proPeriods) {
        this.proId = proId;
        this.proName = proName;
        this.proMoney = proMoney;
        this.proPeriods = proPeriods;
    }

    public Product() {
        super();
    }

    public Long getProId() {
        return proId;
    }

    public void setProId(Long proId) {
        this.proId = proId;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public Float getProMoney() {
        return proMoney;
    }

    public void setProMoney(Float proMoney) {
        this.proMoney = proMoney;
    }

    public Integer getProPeriods() {
        return proPeriods;
    }

    public void setProPeriods(Integer proPeriods) {
        this.proPeriods = proPeriods;
    }
}
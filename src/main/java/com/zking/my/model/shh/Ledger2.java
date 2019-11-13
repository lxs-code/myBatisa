package com.zking.my.model.shh;


public class Ledger2 {
    private int ledgerId;

    private int customerId;

    private int adminId;

    private int applyId;

    private String startTime;

    private String  endTime;

    private String deferTime;

    private String endReturntime;

    private Double applyMoney;

    private String ledgerInterest;

    public Ledger2(int ledgerId, int customerId, int adminId, int applyId, String startTime, String endTime, String deferTime, String endReturntime, Double applyMoney, String ledgerInterest) {
        this.ledgerId = ledgerId;
        this.customerId = customerId;
        this.adminId = adminId;
        this.applyId = applyId;
        this.startTime = startTime;
        this.endTime = endTime;
        this.deferTime = deferTime;
        this.endReturntime = endReturntime;
        this.applyMoney = applyMoney;
        this.ledgerInterest = ledgerInterest;
    }

    public Ledger2() {
        super();
    }

    public int getLedgerId() {
        return ledgerId;
    }

    public void setLedgerId(int ledgerId) {
        this.ledgerId = ledgerId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    public int getApplyId() {
        return applyId;
    }

    public void setApplyId(int applyId) {
        this.applyId = applyId;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getDeferTime() {
        return deferTime;
    }

    public void setDeferTime(String deferTime) {
        this.deferTime = deferTime;
    }

    public String getEndReturntime() {
        return endReturntime;
    }

    public void setEndReturntime(String endReturntime) {
        this.endReturntime = endReturntime;
    }

    public Double getApplyMoney() {
        return applyMoney;
    }

    public void setApplyMoney(Double applyMoney) {
        this.applyMoney = applyMoney;
    }

    public String getLedgerInterest() {
        return ledgerInterest;
    }

    public void setLedgerInterest(String ledgerInterest) {
        this.ledgerInterest = ledgerInterest;
    }
}
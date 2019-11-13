package com.zking.my.model.shh;

public class Repayment {
    private Long repayment_id;

    private Long customer_id;

    private Long apply_id;

    private String repayment_time;

    private Float repayment_money;

    private Float residue_money;

    private int ledger_id;
    private String repayment_times;
    private double apply_money;
    private int pro_periods;

    private Long admin_id;

    private String customer_name;

    public Repayment(Long repayment_id, Long customer_id, Long apply_id, String repayment_time, Float repayment_money, Float residue_money, Long admin_id,String customer_name) {
        this.repayment_id = repayment_id;
        this.customer_id = customer_id;
        this.apply_id = apply_id;
        this.repayment_time = repayment_time;
        this.repayment_money = repayment_money;
        this.residue_money = residue_money;
        this.admin_id = admin_id;
        this.customer_name = customer_name;
    }

    public int getLedger_id() {
        return ledger_id;
    }

    public void setLedger_id(int ledger_id) {
        this.ledger_id = ledger_id;
    }

    public String getRepayment_times() {
        return repayment_times;
    }

    public void setRepayment_times(String repayment_times) {
        this.repayment_times = repayment_times;
    }

    public double getApply_money() {
        return apply_money;
    }

    public void setApply_money(double apply_money) {
        this.apply_money = apply_money;
    }

    public int getPro_periods() {
        return pro_periods;
    }

    public void setPro_periods(int pro_periods) {
        this.pro_periods = pro_periods;
    }

    public Repayment() {
        super();
    }

    public Long getRepaymentId() {
        return repayment_id;
    }

    public void setRepaymentId(Long repayment_id) {
        this.repayment_id = repayment_id;
    }

    public Long getCustomerId() {
        return customer_id;
    }

    public void setCustomerId(Long customerId) {
        this.customer_id = customerId;
    }

    public Long getApplyId() {
        return apply_id;
    }

    public void setApplyId(Long applyId) {
        this.apply_id = applyId;
    }

    public String getRepaymentTime() {
        return repayment_time;
    }

    public void setRepaymentTime(String repaymentTime) {
        this.repayment_time = repaymentTime;
    }

    public Float getRepaymentMoney() {
        return repayment_money;
    }

    public void setRepaymentMoney(Float repaymentMoney) {
        this.repayment_money = repaymentMoney;
    }

    public Float getResidueMoney() {
        return residue_money;
    }

    public void setResidueMoney(Float residueMoney) {
        this.residue_money = residueMoney;
    }

    public Long getAdminId() {
        return admin_id;
    }

    public void setAdminId(Long adminId) {
        this.admin_id = adminId;
    }

    public String getCustomentName() {
        return customer_name;
    }

    public void setCustomentName(String CustomentName) {
        this.customer_name = CustomentName;
    }
}

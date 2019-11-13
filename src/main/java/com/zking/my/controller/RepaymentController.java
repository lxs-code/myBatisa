package com.zking.my.controller;

import com.zking.my.model.Apply;
import com.zking.my.model.Customer;
import com.zking.my.model.shh.Repayment;
import com.zking.my.service.Borrowing.IApple;
import com.zking.my.service.Borrowing.ICustomer;
import com.zking.my.service.Borrowing.IRepayment;
import com.zking.my.service.IApplyService;
import com.zking.my.util.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class RepaymentController {


    @Autowired
    private IRepayment iRepayment;
    @Autowired
    private ICustomer iCustomer;
    @Autowired
    private IApplyService iApplyService;

    @Autowired
    private IApple iApple;

    @RequestMapping("/getrepayment")
    @ResponseBody
    public JsonData  getrepayment(Repayment repayment){
JsonData jsonData=new JsonData();

        List<Repayment> repayments = iRepayment.selectRepayment(repayment);
        jsonData.setCode(0);
        jsonData.setResult(repayments);
        return  jsonData;
    }
    @RequestMapping("/hk")
    @ResponseBody
    public   void hk(Repayment repayment, Long  repayment_id, Float repayment_money,String repayment_times){
        repayment.setRepaymentId(repayment_id);
        Repayment repayment1 = iRepayment.selectByPrimaryKey(repayment);
        repayment.setPro_periods(repayment1.getPro_periods());
        repayment.setApply_money(repayment1.getApply_money());
        repayment.setLedger_id(repayment1.getLedger_id());
        int uprepaument = iRepayment.uprepaument(repayment);
        Repayment repayment2=new Repayment();
        String[] split = repayment_times.split("-");
        String  n=split[0];
        String  y=split[1];
        String  r=split[2];
        if(Integer.parseInt(y)<12){
            int c=  Integer.parseInt(y)+1;
           y=c+"";
        }else{
            int c=  Integer.parseInt(n)+1;
            n=c+"";
            y="1";
        }
        Apply apply=new Apply();
        apply.setApplyId(repayment1.getApplyId());
        String  da=n+"-"+y+"-"+r;
        repayment2.setRepaymentTime(da);
        repayment2.setApply_money(repayment1.getApply_money());
        repayment2.setResidueMoney(repayment1.getResidueMoney()-repayment_money);
        repayment2.setRepaymentMoney(repayment1.getRepaymentMoney());
        repayment2.setApplyId(repayment1.getApplyId());
        repayment2.setLedger_id(repayment1.getLedger_id());
        repayment2.setCustomerId(repayment1.getCustomerId());

        Apply getapply = iApplyService.getapply(apply);
int q=0;
if(repayment.getPro_periods()<  getapply.getProductId()){
 q=  repayment.getPro_periods()+1;
    repayment2.setPro_periods(q);
    iRepayment.crerepament(repayment2);
}

        Customer customer=new Customer();
        customer.setCustomerId(repayment1.getCustomerId());
        Customer getcustomer = iCustomer.getcustomer(customer);
        Customer customer1=new Customer();
        customer1.setCustomerId(getcustomer.getCustomerId());
        customer1.setCustmoerTotalMoney(getcustomer.getCustmoerTotalMoney()+repayment_money);
        iCustomer.uploadcu(customer1);
    };



}

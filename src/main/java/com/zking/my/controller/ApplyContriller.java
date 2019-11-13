package com.zking.my.controller;

import com.zking.my.controller.shh.HttpUtils;
import com.zking.my.mapper.ApplyMapper;
import com.zking.my.model.Apply;
import com.zking.my.model.Ua;
import com.zking.my.model.shh.*;
import com.zking.my.service.Borrowing.IApple;
import com.zking.my.service.IApplyService;
import com.zking.my.util.JsonData;
import com.zking.my.util.PageBean;
import org.apache.http.HttpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.*;

@Controller
@RequestMapping("/apply")
public class ApplyContriller {

    @Autowired
    HttpServletRequest request;

    @Autowired
    private IApple iApple;

    @Autowired
    private ApplyMapper applyMapper;
    @Autowired
    private IApplyService iApplyService;
    @RequestMapping("/createApply")
    @ResponseBody
    public JsonData creApp(Apply apply){
        JsonData jsonData = new JsonData();

        int apply1 = iApple.createApply(apply);

        if(apply1>0){
            jsonData.setMessage("等待审核！预计在1个工作日左右");
            jsonData.setResult(apply);
            jsonData.setCode(0);
        }else{
            jsonData.setMessage("提交失败");
            jsonData.setCode(0);
        }

        return  jsonData;
    }

    @RequestMapping("/getapplyas")
    @ResponseBody
    public JsonData getapply(Apply apply,PageBean pageBean,String customerName){
//        PageBean pageBean1=new PageBean();
        JsonData jsonData = new JsonData();
//
    List<Apply> apply1 = iApple.getApply(apply,pageBean);
        jsonData.setMessage("成功");
        jsonData.setResult(apply1);
        jsonData.setRows(pageBean.getRows());
        jsonData.setTotal(pageBean.getTotal());
        jsonData.setPage(pageBean.getPage());
        jsonData.setCode(0);


        return  jsonData;
    }

    @RequestMapping("/getcount")
    @ResponseBody
public  JsonData  getcount(){
    JsonData jsonData = new JsonData();
    List<Ua> getcoun = iApple.getcoun();
    jsonData.setMessage("成功");
    jsonData.setResult(getcoun);
    jsonData.setCode(0);
    return  jsonData;
}


    @RequestMapping("/feipei")
    @ResponseBody
    public  JsonData  feipei(Apply apply){
        JsonData jsonData = new JsonData();
        int upapply = iApple.upapply(apply);
        if(upapply>0){
            jsonData.setMessage("成功");
            jsonData.setCode(0);
        }else{
            jsonData.setMessage("失败");
            jsonData.setCode(1);
        }

//        jsonData.setResult(getcoun);

        return  jsonData;
    }

    @RequestMapping("/getminall")
    @ResponseBody
    public  JsonData  getapply(Apply apply,PageBean pageBean){
        JsonData jsonData = new JsonData();
        List<Apply> getapplymin = iApple.getapplymin(apply,pageBean);
        jsonData.setMessage("成功");
        jsonData.setCode(0);
        jsonData.setTotal(pageBean.getTotal());
        jsonData.setRows(pageBean.getRows());
        jsonData.setPage(pageBean.getPage());
        jsonData.setResult(getapplymin);
        return  jsonData;
    }
















    @RequestMapping("/abb")
    @ResponseBody
    public  JsonData select(PageBean pageBean,AppCusRoles app){
        JsonData jsonData=new JsonData();
        if(null==app.getCustomer_zname()){
            app.setCustomer_zname("");
        }
        List<AppCusRoles>list = iApplyService.select(pageBean,app);//pageBean
        jsonData.setResult(list);
        jsonData.setTotal(pageBean.getTotal());
        jsonData.setRows(pageBean.getRows());
        jsonData.setPage(pageBean.getPage());
        jsonData.setCode(0);
        jsonData.setMessage("成功");
        return jsonData;
    }

    @RequestMapping("/rep")
    @ResponseBody
    public  JsonData selectRep(PageBean pageBean,Repayment rep)throws Exception{
        JsonData jsonData=new JsonData();
        if(null==rep.getCustomentName()){
            rep.setCustomentName("");
        }
        List<Repayment>list = iApplyService.selectRep(pageBean,rep);//pageBean
        jsonData.setResult(list);
        jsonData.setTotal(pageBean.getTotal());
        jsonData.setRows(pageBean.getRows());
        jsonData.setPage(pageBean.getPage());
        return jsonData;
    }


    @RequestMapping("/ove")
    @ResponseBody
    public  JsonData selectOve(PageBean pageBean)throws Exception{
        JsonData jsonData=new JsonData();
        List<Overdue>list = iApplyService.selectOve(pageBean);//pageBean
        jsonData.setResult(list);
        jsonData.setTotal(pageBean.getTotal());
        jsonData.setRows(pageBean.getRows());
        jsonData.setPage(pageBean.getPage());
        return jsonData;
    }
    @RequestMapping("/two")
    @ResponseBody
    public  JsonData selectOvetwo(PageBean pageBean)throws Exception{
        JsonData jsonData=new JsonData();
        List<Overdue>list = iApplyService.selectOvetwo(pageBean);//pageBean
        jsonData.setResult(list);
        jsonData.setTotal(pageBean.getTotal());
        jsonData.setRows(pageBean.getRows());
        jsonData.setPage(pageBean.getPage());
        return jsonData;
    }
    @RequestMapping("/del")
    @ResponseBody
    public  JsonData del(){
        String applyId = request.getParameter("applyId");
        String money = request.getParameter("money");
        String customer_id = request.getParameter("customer_id");
        System.out.println(money);
        System.out.println(applyId);
        float as=Integer.parseInt(money);


        Apply app = new Apply();
        int a = Integer.parseInt(applyId);
        long ss = (long)a;
        app.setCustomerId((long)Integer.parseInt(customer_id));
        app.setApplyId(ss);
        app.setAction(4);
app.setTotalMoney(as);
        JsonData jsonData = new JsonData();
        int n  = iApplyService.upda(app);
        jsonData.setMessage("审核不通过");
        jsonData.setCode(1);
        jsonData.setCode(Integer.parseInt(applyId));
        return jsonData;
    }


    @RequestMapping("/dw")
    @ResponseBody
    public  JsonData dw(){
        JsonData jsonData = new JsonData();

        String customerName = request.getParameter("customerName");
        String onumber =  request.getParameter("onumber");
        System.out.println("客户名是："+customerName+"......电话号码是："+onumber);
        duanxin(customerName,onumber);
        jsonData.setMessage("短信已发送");
        jsonData.setCode(1);
        return jsonData;
    }






    @RequestMapping("/ins")
    @ResponseBody
    public  JsonData insert(AppCusRoles app)throws Exception{
        JsonData jsonData = new JsonData();
        Ledger2 ledger = new Ledger2();
        //设置参数
        ledger.setCustomerId(app.getCustomer_id());
        ledger.setApplyId(app.getApply_id());
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        Date ddd = new Date();
        ddd.setDate(8);
        String data = sdf.format(ddd);
        ledger.setStartTime(data);//贷款开始时间
        Date da = sdf.parse(data);
        Date newDate = stepMonth(da, app.getProduct_id());
        Date dd = stepMonth(newDate, 3);//最后的还款时间
        ledger.setEndTime(sdf.format(newDate));//贷款结束时间
        ledger.setDeferTime(sdf.format(dd));//最后还款时间
        ledger.setEndReturntime(sdf.format(dd));
        ledger.setApplyMoney(app.getMoney());
        ledger.setLedgerInterest("25");
        //增加到贷款分户表
        int n = iApplyService.insertLed(ledger);
        Apply apply = new Apply();
        //增加还款数据
        Repayment repayment = new Repayment();
        Long  dsa=(long)app.getApply_id();
        Apply apply1 = iApple.getApply(dsa);
        repayment.setCustomerId((long)app.getCustomer_id());//客户id
        repayment.setApplyId((long)app.getApply_id());//贷款id
        Date shi = sdf.parse(data);
        Date shijian = stepMonth(shi, 1);
        repayment.setRepaymentTime(sdf.format(shijian));//还款日期
//        double money1 = (Integer.parseInt(apply1.getInterest()));
//        int tian =app.getProduct_id();//分期期数
        System.out.println();//借款金额
//        double ss = money1/tian;
//        String sa = String.format("%.2f", ss);
//        double aa= Double.parseDouble(sa);
        repayment.setRepaymentMoney(apply1.getPerMoney());//还款金额
//        double jj = repayment.getResidueMoney()-aa;
        repayment.setResidueMoney(apply1.getTotalMoney());
        repayment.setApply_money(apply1.getMoney());//欠款
        Saa saa =  iApplyService.max();
        repayment.setLedger_id(saa.getSs());//贷款分户表id
        repayment.setPro_periods(1);//期数

        iApplyService.insertRep(repayment);
        //修改状态
        apply.setApplyId((long)app.getApply_id());
        apply.setAction(2);
        iApplyService.update(apply);
        jsonData.setResult(app);
        jsonData.setMessage("审核通过");
        return jsonData;
    }

    public static Date stepMonth(Date sourceDate, int month) {
        Calendar c = Calendar.getInstance();
        c.setTime(sourceDate);
        c.add(Calendar.MONTH, month);
        return c.getTime();
    }


    public  static void duanxin(String name,String model){
        String host = "http://tongzhi.market.alicloudapi.com";
        String path = "/sms/send/template/notify/70";
        String method = "POST";
        String appcode = "3f4ddebeb5cf43b1aa642c11633a576e";
        Map<String, String> headers = new HashMap<String, String>();
        //最后在header中的格式(中间是英文空格)为Authorization:APPCODE 83359fd73fe94948385f570e3c139105
        headers.put("Authorization", "APPCODE " + appcode);
        Map<String, String> querys = new HashMap<String, String>();
        //测试请用默认短信模板,默认模板不可修改,如需自定义短信内容测试或正式发送,请联系旺旺或QQ1246073271进行申请
        querys.put("content", "【渔人科技】#"+name+"#您在本平台有业务即将到期，请及时处理");
        querys.put("mobile", model);
        Map<String, String> bodys = new HashMap<String, String>();


        try {
            /**
             * 重要提示如下:
             * HttpUtils请从
             * https://github.com/aliyun/api-gateway-demo-sign-java/blob/master/src/main/java/com/aliyun/api/gateway/demo/util/HttpUtils.java
             * 下载
             *
             * 相应的依赖请参照
             * https://github.com/aliyun/api-gateway-demo-sign-java/blob/master/pom.xml
             */
            HttpResponse response = HttpUtils.doPost(host, path, method, headers, querys, bodys);
            System.out.println(response.toString());
            //获取response的body
            //System.out.println(EntityUtils.toString(response.getEntity()));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }







    @RequestMapping("/fj")
    @ResponseBody
public  JsonData fj(Apply apply, PageBean pageBean){
    JsonData jsonData = new JsonData();
    List<Apply> fj = iApple.fj(apply, pageBean);
    jsonData.setResult(fj);
    jsonData.setCode(0);
    jsonData.setTotal(pageBean.getTotal());
    jsonData.setRows(pageBean.getRows());
    jsonData.setMessage("成功");
    jsonData.setPage(pageBean.getPage());
    return  jsonData;
};


















}

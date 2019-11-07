package com.zking.my.controller;

import com.zking.my.model.Apply;
import com.zking.my.model.Ua;
import com.zking.my.service.Borrowing.IApple;
import com.zking.my.util.JsonData;
import com.zking.my.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ApplyContriller {


    @Autowired
    private IApple iApple;
    @RequestMapping("/createApply")
    @ResponseBody
    public JsonData creApp(Apply apply){

        System.out.println(apply.getProductId());
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



}

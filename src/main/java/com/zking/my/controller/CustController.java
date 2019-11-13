package com.zking.my.controller;

import com.zking.my.service.ICust;
import com.zking.my.util.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/cust")
public class CustController {


    @Autowired
    private ICust iCust;

    @RequestMapping("/nan")
    @ResponseBody
    public JsonData nan() {
        long list = iCust.selectSex();
        JsonData jsonData = new JsonData();
        jsonData.setResult(list);
        return  jsonData;
    }

    @RequestMapping("/nv")
    @ResponseBody
    public JsonData nv() {
        long list = iCust.selectSex1();
        JsonData jsonData = new JsonData();
        jsonData.setResult(list);
        return  jsonData;
    }

    @RequestMapping("/age1")
    @ResponseBody
    public JsonData age1() {
        long list = iCust.selectAge1();
        JsonData jsonData = new JsonData();
        jsonData.setResult(list);
        return  jsonData;
    }
    @RequestMapping("/age2")
    @ResponseBody
    public JsonData age2() {
        long list = iCust.selectAge2();
        JsonData jsonData = new JsonData();
        jsonData.setResult(list);
        return  jsonData;
    }
    @RequestMapping("/age3")
    @ResponseBody
    public JsonData age3() {
        long list = iCust.selectAge3();
        JsonData jsonData = new JsonData();
        jsonData.setResult(list);
        return  jsonData;
    }
    @RequestMapping("/age4")
    @ResponseBody
    public JsonData age4() {
        long list = iCust.selectAge4();
        JsonData jsonData = new JsonData();
        jsonData.setResult(list);
        return  jsonData;
    }

}

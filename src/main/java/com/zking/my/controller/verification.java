package com.zking.my.controller;

import com.zking.my.util.JsonData;
import com.zking.my.util.replace;
import com.zking.my.util.template;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class verification {


    @RequestMapping("/yzm")
    @ResponseBody
    public JsonData yzm(String sjh){
        String relpace = replace.relpace(sjh);
        JsonData jsonData = new JsonData();
        String getyzm = template.getyzm(relpace);
        jsonData.setResult(getyzm);
        jsonData.setCode(0);
        jsonData.setMessage("成功");
        return  jsonData;
    }


}

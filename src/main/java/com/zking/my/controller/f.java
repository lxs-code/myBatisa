package com.zking.my.controller;

import com.zking.my.util.JsonData;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class f {
    @RequestMapping("/cg")
    @ResponseBody
   public JsonData   cg(String out_trade_no,String total_amount,String trade_no){
        JsonData jsonData = new JsonData();
        System.out.println(out_trade_no);
        System.out.println(total_amount);
        System.out.println(trade_no);
        Map<String,String>  map=new HashMap<>();
        map.put("out_trade_no",out_trade_no);
        map.put("total_amount",total_amount);
        map.put("trade_no",trade_no);
        jsonData.setResult(map);
        return jsonData;
   }



}

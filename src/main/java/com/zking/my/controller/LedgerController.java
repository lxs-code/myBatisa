package com.zking.my.controller;

import com.zking.my.service.ILedger;
import com.zking.my.util.JsonData;
import com.zking.my.vo.LedgerVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
@Controller
@RequestMapping("/Led")
public class LedgerController {
    @Autowired
    private ILedger iLedger;

    @RequestMapping("/qn")
    @ResponseBody
    public JsonData qn() {
        List<LedgerVo> list = iLedger.selectqn();
        JsonData jsonData = new JsonData();
        jsonData.setResult(list);
        return  jsonData;
    }
    @RequestMapping("/jn")
    @ResponseBody
    public JsonData jn() {
        List<LedgerVo> list = iLedger.selectjn();
        JsonData jsonData = new JsonData();
        jsonData.setResult(list);
        return  jsonData;
    }





}

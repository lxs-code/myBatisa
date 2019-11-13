package com.zking.my.controller;

import com.zking.my.service.IContract;
import com.zking.my.util.JsonData;
import com.zking.my.util.PageBean;
import com.zking.my.vo.ConTVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/Con")
public class ContractController {

    @Autowired
    private IContract iContract;

    @RequestMapping("/list")
    @ResponseBody
    public JsonData list(PageBean pageBean){
        JsonData jsonData=new JsonData();
        List<ConTVo> list = iContract.list(pageBean);//pageBean
        jsonData.setResult(list);
        jsonData.setTotal(pageBean.getTotal());
        jsonData.setRows(pageBean.getRows());
        jsonData.setPage(pageBean.getPage());
        jsonData.setCode(0);
        jsonData.setMessage("成功");
        return jsonData;
    }


    @RequestMapping("/list1")
    @ResponseBody
    public JsonData list1(ConTVo conTVo){
        JsonData jsonData=new JsonData();
        ConTVo con = iContract.list1(conTVo);
        jsonData.setResult(con);
        return jsonData;
    }





}

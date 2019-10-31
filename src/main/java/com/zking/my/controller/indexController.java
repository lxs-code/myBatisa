package com.zking.my.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class indexController {


  @RequestMapping("/")
    public  String toIndex(){
      System.out.println("你妈的会死撒");
        return "index";
    }
}

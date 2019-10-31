package com.zking.my.controller;

import com.zking.my.model.Book;
import com.zking.my.util.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloWorld{

    @RequestMapping(value = "/add")
    public  void add(){
        System.out.println("add!!");
    }

    @RequestMapping(value = "/tors",method = RequestMethod.POST)
    @ResponseBody
    public JsonData toRs(Book bookName ,HttpServletRequest request){
        System.out.println(request.getParameter("bookName"));
        JsonData jsonData = new JsonData();
        jsonData.setCode(1);
        System.out.println(bookName.getBookName());
        jsonData.setMessage("成功");




        return jsonData;
    }




@RequestMapping(value = "/hello")
public String hello(String name, Book book, HttpServletRequest request){
    System.out.println("123");
    System.out.println("hello!!"+name);
//    System.out.println(book.getBookId());
//request.setAttribute("gsgsgs",name);



return "redirect:tors";
}







}

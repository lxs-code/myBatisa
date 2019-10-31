package com.zking.my.controller;

import com.zking.my.model.Book;
import com.zking.my.service.IBookService;
import com.zking.my.util.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/bk")
public class BookController {

    @Autowired
    private IBookService bookService;


    @ModelAttribute
    public void init(Model model) {
        System.out.println("into.....");
        Book book = new Book();
        model.addAttribute("book", book);
    }


    @RequestMapping("/toAdd")
    public String toAdd(Model model) {


        return "addBook";
    }


    @RequestMapping("/toedit")
    public String toedit(Model model, Book book) {
//        bookService.

        Book bb = bookService.load(book);
        System.out.println(bb);
        model.addAttribute("book", bb);


        return "editBook";
    }


    @RequestMapping("/add")
    public JsonData add(Model model, @Validated(value = Book.ValidateGrups.Add.class) Book book, BindingResult binding) {
        JsonData jsonData = new JsonData();
        System.out.println(book);

//        int n=  bookService.add(book);
//        System.out.println(n);
//        System.out.println(book);
        if (binding.hasErrors()) {
            System.out.println("验证不通过");
            List<FieldError> fieldErrors = binding.getFieldErrors();
            Map<String, String> errors = new HashMap<String, String>();
            for (FieldError d : fieldErrors) {
                String field = d.getField();
                String defaultMessage = d.getDefaultMessage();
                System.out.println(field + "," + defaultMessage);
                errors.put(field, defaultMessage);
            }
            jsonData.setCode(-1);
            jsonData.put("error", errors);
        } else {
            System.out.println("验证通过，增加成功");
        }
        System.out.println(jsonData);

        return jsonData;

    }


    @RequestMapping("/edit")
    @ResponseBody
    public JsonData edit(@Validated(value = Book.ValidateGrups.Edit.class) Book book, BindingResult binding, Model model) {
        JsonData jsonData = new JsonData();
        System.out.println(book.getBookId());
        int updete = bookService.updete(book);
        System.out.println(updete+"adjhsjkhdkaskd");
        if(binding.hasErrors()){
            System.out.println("验证不通过");
            List<FieldError> fieldErrors = binding.getFieldErrors();
            Map<String, String> errors = new HashMap<String, String>();
            for (FieldError d : fieldErrors) {
                String field = d.getField();
                String defaultMessage = d.getDefaultMessage();
                System.out.println(field + "," + defaultMessage);
                errors.put(field, defaultMessage);
            }
            jsonData.setCode(-1);
            jsonData.put("error", errors);
        } else {
            System.out.println("验证通过，修改");
        }
        System.out.println(jsonData);

return  jsonData;
    }


    @RequestMapping("/load/{bookId}")
    public JsonData load(@PathVariable Integer bookId) {
        JsonData jsonData = new JsonData();
        jsonData.setCode(1);
//        System.out.println("load" + bookId);
        jsonData.setMessage("成功");
        return jsonData;
    }





















}

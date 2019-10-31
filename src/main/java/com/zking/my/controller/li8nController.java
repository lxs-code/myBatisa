package com.zking.my.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import javax.servlet.http.HttpSession;
import java.util.Locale;
@Controller
public class li8nController {
@RequestMapping("/zh")
    public  String zh(HttpSession session){
        session.setAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME, Locale.CHINA);
     return  "jsp";
    }

    @RequestMapping("/en")
    public  String en(HttpSession session){
        session.setAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME, Locale.US);
        return  "jsp";
    }


}

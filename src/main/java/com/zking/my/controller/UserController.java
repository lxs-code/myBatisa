package com.zking.my.controller;

import com.zking.my.model.User;
import com.zking.my.util.JsonData;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserController {

    @ModelAttribute
    public void init(Model model) {
        System.out.println("init");
        User user = new User();
        model.addAttribute("user", user);
    }

    @RequestMapping("/index.shtml")
    public String toLogin(Model model) {
        System.out.println("toLogin");
        return "login";
    }

    @RequestMapping("/login")
    @ResponseBody
    public JsonData login(Model model, User user,HttpServletRequest request) {
JsonData jsdata=new JsonData();
        System.out.println(request.getParameter("readers"));
        UsernamePasswordToken token = new UsernamePasswordToken(user.getUsername(), user.getPassword());
        Subject subject = SecurityUtils.getSubject();
        String message = null;
        try {
            subject.login(token);
            jsdata.setCode(0);
            jsdata.setMessage("登录成功");
        } catch (UnknownAccountException e) {// 捕获未知用户名异常
            jsdata.setCode(1);
            jsdata.setMessage("帐号错误");
            message = "帐号错误";
        } catch (LockedAccountException e) {// 捕获错误登录过多的异常
            jsdata.setCode(1);
            jsdata.setMessage("帐号已锁定，请与管理员联系");
            message = "帐号已锁定，请与管理员联系";
        } catch (IncorrectCredentialsException e) {// 捕获密码错误异常
            jsdata.setCode(1);
            jsdata.setMessage("密码错误");
            message = "密码错误";
        } catch (ExcessiveAttemptsException e) {// 捕获错误登录过多的异常
            jsdata.setCode(1);
            jsdata.setMessage("多次登录尝试失败，请60秒后再试");
            message = "多次登录尝试失败，请60秒后再试";
        }

        if (null == message) {//JWT
            Session session = subject.getSession();//此session为org.apache.shiro.session.Session
            session.setAttribute("user", user);//登陆成功后要保存shiro的会话中，已备之后使用
            return jsdata;
        } else {
            model.addAttribute("message", message);
            return jsdata;
        }
    }


    @RequestMapping("/unauthorized")
    public String unauthorized(HttpServletRequest request) {
        String reqType = request.getHeader("reqType");
        if("axios".equals(reqType)){

        }
        return "unauthorized";
    }

    @RequestMapping("/abc")
    public String abc() {
        return "unauthorized";
    }
    @RequestMapping("/xyz")
    @ResponseBody
    public Map xyz() {
        return null;
    }

    @RequestMapping("/logout")
    public String logout() {
        return "login";
    }

}

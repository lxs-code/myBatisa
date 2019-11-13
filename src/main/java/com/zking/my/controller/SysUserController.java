package com.zking.my.controller;

import com.zking.my.model.SYSNode;
import com.zking.my.model.SYSRole;
import com.zking.my.model.SYSUser;
import com.zking.my.service.Borrowing.ISUser;
import com.zking.my.shiro.PasswordHelper;
import com.zking.my.util.JsonData;
import com.zking.my.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class SysUserController {

    @Autowired
    private ISUser isUser;

    @RequestMapping("/logs")
    @ResponseBody
    public JsonData longs(String username,String password ){
         SYSUser sysUser1=new SYSUser();
        JsonData jsonData = new JsonData();
        sysUser1.setUsername(username);
        sysUser1.setPassword(password);

        SYSUser sysUser = isUser.loadByUsername(sysUser1);

       if(null==sysUser){
           jsonData.setCode(1);
           jsonData.setMessage("账户不存在");
       }
        else if(sysUser.getLocked()==1){
            jsonData.setCode(1);
            jsonData.setMessage("账户被锁定");
        }
        else{
           isUser.loadByUsername(sysUser);
           boolean b = PasswordHelper.checkCredentials(password, sysUser.getSalt(), sysUser.getPassword());
           SYSRole sysRole = isUser.listPermissionsByUserName(sysUser);
           Map<String,Object>  map=new HashMap<String,Object>();
        if(b){
            map.put("role",sysRole);
            map.put("sysUser",sysUser);
            jsonData.setCode(0);
            jsonData.setMessage("成功");
            jsonData.setResult(map);
        }else{
            jsonData.setCode(1);
            jsonData.setMessage("失败");

        }
        }
        return jsonData;
    }


    @RequestMapping("/nodes")
    @ResponseBody
    public JsonData node(String username ){
        SYSUser sysUser1=new SYSUser();
        JsonData jsonData = new JsonData();
        sysUser1.setUsername(username);


        List<SYSNode> sysNodes = isUser.listRolesByUserName(sysUser1);
            jsonData.setCode(0);
            jsonData.setMessage("成功");
            jsonData.setResult(sysNodes);
        return jsonData;
    }


    @RequestMapping("/lists")
    @ResponseBody
    public JsonData list(SYSUser user,PageBean pageBean){

        JsonData jsonData=new JsonData();

        if(null==user.getUsername()||user.getUsername()==""){
            user.setUsername("");
        }
        List<SYSUser>list = isUser.list(user,pageBean);
        for (SYSUser user1:list){
            System.out.println(user1.getLocked());
        }

        jsonData.setResult(list);
        jsonData.setTotal(pageBean.getTotal());
        jsonData.setRows(pageBean.getRows());
        jsonData.setPage(pageBean.getPage());
        jsonData.setCode(0);
        jsonData.setMessage("成功");
        return jsonData;
    }

    @RequestMapping("/up")
    @ResponseBody
    public JsonData up(SYSUser user){
        JsonData jsonData=new JsonData();

        int n =isUser.up(user);
        if(n>0){
            jsonData.setCode(0);
            jsonData.setMessage("成功");

        }else{
            jsonData.setCode(1);
            jsonData.setMessage("失败");
        }


        return jsonData;
    }
}

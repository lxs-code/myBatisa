package com.zking.my.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.UUID;

@Controller
public class UpoloadCon {


    @Value("${dir}")
private  String saveDir;

    @RequestMapping("/toupload")
    public  String toUpload(){
        System.out.println("saveDir+"+this.saveDir);
        return  "upload";
    }


@PostMapping("/upload")
    public  String upload(MultipartFile img) throws Exception{
        System.out.println("saveDir+"+this.saveDir);
String   fileId=this.getFileId();
String path =this.saveDir+ File.separator+fileId;

File file=new File(path);

img.transferTo(file);

//向数据保存一条文件上传记录
    return  "redirect:toupload";
    }

    @PostMapping("/upload1")
    public  String upload1(MultipartFile[] imgs) throws Exception{


        System.out.println("nimade");

        MultipartFile img=null;

  for ( int  i=0;null!=imgs && i<imgs.length;i++){
      img=imgs[i];
      String   fileId=this.getFileId();
      String path =this.saveDir+ File.separator+fileId;
      File file=new File(path);
      img.transferTo(file);
  }

//向数据保存一条文件上传记录
        return  "redirect:toupload";
    }







private   String getFileId(){

        return UUID.randomUUID().toString().replace("-","");
}




}

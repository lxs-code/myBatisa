package com.zking.my.controller;

import com.zking.my.util.JsonData;
import com.zking.my.util.discern.FaceDetect;
import com.zking.my.util.discern.FaceMatch;
import com.zking.my.util.discern.Idcard;
import com.zking.my.util.replace;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.apache.logging.log4j.message.StringFormattedMessage;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
public class DiscernContriller {

String   sfz=null;

//    @RequestMapping("/sfz")
//    @ResponseBody
//    public JsonData  idcard(String Base1){
//
//
//        return jsonData;
//    }

    @RequestMapping("/facedetect")
    @ResponseBody
    public JsonData  facedetect(String Base1){

        String relpace = replace.relpace(Base1);
        sfz=relpace;
        JsonData jsonData = new JsonData();
        String detect = FaceDetect.detect(relpace);
        String aNull = detect.replace("null", "1");
        JSONObject json;
        json = JSONObject.fromObject(aNull);

        jsonData.setResult(json);
        jsonData.setMessage("成功");
        jsonData.setCode(1);


        return jsonData;
    }

    //身份证
    @RequestMapping("/facedetect1")
    @ResponseBody
    public JsonData  idcard1(String Base1){

        String relpace = replace.relpace(Base1);

        JsonData jsonData = new JsonData();
        String   ss=Idcard.Idcard(relpace);
        String aNull = ss.replace("null", "1");
        jsonData.setMessage("成功");
        jsonData.setCode(1);
        jsonData.setResult(ss);

        return jsonData;
    }


    //人脸对比
    @RequestMapping("/facedetect2")
    @ResponseBody
    public JsonData  match(String Base1,String Base2){

        String relpace1 = replace.relpace(Base1);
        String relpace2 = replace.relpace(Base2);

        JsonData jsonData = new JsonData();
        String   ss=FaceMatch.match(sfz,relpace1);


        String aNull = ss.replace("null", "1");
        jsonData.setMessage("成功");
        jsonData.setCode(1);
        jsonData.setResult(ss);
        System.out.println("xxx");
        System.out.println("xxx");
        System.out.println("xxx");
        System.out.println("xxx");     System.out.println("xxx");     System.out.println("xxx");
        System.out.println(sfz+123);
        System.out.println("xxx");
        System.out.println("xxx");
        System.out.println("xxx");
        System.out.println("xxx");     System.out.println("xxx");     System.out.println("xxx");


        System.out.println(relpace2+123456);
        System.out.println("xxx");
        System.out.println("xxx");
        System.out.println("xxx");
        System.out.println("xxx");     System.out.println("xxx");     System.out.println("xxx");
        return jsonData;
    }


}

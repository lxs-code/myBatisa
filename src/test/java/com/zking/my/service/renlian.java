package com.zking.my.service;

import com.zking.my.util.HttpUtils;
import org.apache.commons.codec.binary.Base64;
import org.apache.http.HttpResponse;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public class renlian {
    public static String getImgStr(String imgFile){
                 //将图片文件转化为字节数组字符串，并对其进行Base64编码处理


               InputStream in = null;
               byte[] data = null;
                //读取图片字节数组
                try
                {
                        in = new FileInputStream(imgFile);
                        data = new byte[in.available()];
                        in.read(data);
                      in.close();
                     }
               catch (IOException e)
               {
                        e.printStackTrace();
                    }
                 return new String(Base64.encodeBase64(data));
            }

    public static void main(String[] args) {


        String   imgfile1=renlian.getImgStr("D:\\1.jpg");
        String   imgfile2=renlian.getImgStr("D:\\2.jpg");
        System.out.println(imgfile1);


//        String host = "https://face.xiaohuaerai.com";
//        String path = "/face";
//        String method = "POST";
//        String appcode = "169ba0e6bc634ff0ac81a8d7ea02fa09";
//        Map<String, String> headers = new HashMap<String, String>();
//        //最后在header中的格式(中间是英文空格)为Authorization:APPCODE 83359fd73fe94948385f570e3c139105
//        headers.put("Authorization", "APPCODE " + appcode);
//        //根据API的要求，定义相对应的Content-Type
//        headers.put("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
//        Map<String, String> querys = new HashMap<String, String>();
//        Map<String, String> bodys = new HashMap<String, String>();
//        bodys.put("srca", imgfile1);
//        bodys.put("srcb", imgfile2);
//        bodys.put("type", "LIVE");
//
//
//        try {
//            /**
//             * 重要提示如下:
//             * HttpUtils请从
//             * https://github.com/aliyun/api-gateway-demo-sign-java/blob/master/src/main/java/com/aliyun/api/gateway/demo/util/HttpUtils.java
//             * 下载
//             *
//             * 相应的依赖请参照
//             * https://github.com/aliyun/api-gateway-demo-sign-java/blob/master/pom.xml
//             */
//            HttpResponse response = HttpUtils.doPost(host, path, method, headers, querys, bodys);
//
//
//            System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
//            System.out.println(response.toString()+"13456");
//            //获取response的body
//            //System.out.println(EntityUtils.toString(response.getEntity()));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }

}

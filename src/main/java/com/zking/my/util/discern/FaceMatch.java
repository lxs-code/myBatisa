package com.zking.my.util.discern;

import com.zking.my.util.discenrnUtil.GsonUtils;
import com.zking.my.util.discenrnUtil.HttpUtil;
import com.zking.my.util.discenrnUtil.SslTest;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
* 人脸对比
*/
public class FaceMatch {

    /**
    * 重要提示代码中所需工具类
    * FileUtil,Base64Util,HttpUtil,GsonUtils请从
    * https://ai.baidu.com/file/658A35ABAB2D404FBF903F64D47C1F72
    * https://ai.baidu.com/file/C8D81F3301E24D2892968F09AE1AD6E2
    * https://ai.baidu.com/file/544D677F5D4E4F17B4122FBD60DB82B3
    * https://ai.baidu.com/file/470B3ACCA3FE43788B5A963BF0B625F3
    * 下载
    */
    public static String match(String base1,String base2) {
        // 请求url
         String result=null;
        String url = "https://aip.baidubce.com/rest/2.0/face/v3/match";


        try {
            SslTest st = new SslTest();
            String a = st.getRequest( url,3000);
        } catch (Exception e) {
            e.printStackTrace();
        }




        try {


            List<Map<String, Object>> images = new ArrayList<>();

            Map<String, Object> map1 = new HashMap<>();
            map1.put("image", base1);
            map1.put("image_type", "BASE64");
            map1.put("face_type", "LIVE");
            map1.put("quality_control", "LOW");
            map1.put("liveness_control", "NONE");

            Map<String, Object> map2 = new HashMap<>();
            map2.put("image", base2);
            map2.put("image_type", "BASE64");
            map2.put("face_type", "LIVE");
            map2.put("quality_control", "LOW");
            map2.put("liveness_control", "NONE");

            images.add(map1);
            images.add(map2);

            String param = GsonUtils.toJson(images);


            // 注意这里仅为了简化编码每一次请求都去获取access_token，线上环境access_token有过期时间， 客户端可自行缓存，过期后重新获取。
            String accessToken = "24.13e61fab3161063c7bfe3ef6671cbd11.2592000.1574591185.282335-17562304 ";

             result = HttpUtil.post(url, accessToken, "application/json", param);
            System.out.println(result);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public static void main(String[] args) throws ParseException {
//        java.text.SimpleDateFormat format = new java.text.SimpleDateFormat("yyyy-MM-dd");
//
//        java.util.Date beginDate= format.parse("2007-12-24");
//
//        java.util.Date endDate= format.parse("2007-12-25");
//
//        long day=(endDate.getTime()-beginDate.getTime())/(24*60*60*1000);
//
//        System.out.println("相隔的天数="+day);
//        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
//        Date d1 = df.parse("2019-10-10");
//        Date d2 = df.parse("2000-11-19");
//        long diff = d1.getTime() - d2.getTime();//这样得到的差值是微秒级别
//        long days = diff / (1000 * 60 * 60 * 24);
//        System.out.println(days/365);
//        String da="20001213";
////
//        String n = da.substring(0, 4);
//        String y = da.substring(4, 6);
//        String r = da.substring(6, 8);
//        System.out.println(n+"-"+y+"-"+r);
        DateFormat df = new SimpleDateFormat("yyyyMMdd");
        long days;
        long day;
        String sa = "20001209";
        Date sb =  df.parse(sa);
        DateFormat dfa = new SimpleDateFormat("yyyy-MM-dd");
       String sc =  dfa.format(sb);
//            String  d1 = df.format(new Date());
//            Date d11 = df.parse(d1);
//            Date d2 = df.parse(sa);
//            long diff = d11.getTime() - d2.getTime();
//            days = diff / (1000 * 60 * 60 * 24);
//            day = days/365;

        System.out.println(sc);
//        DayCompare result = dayComparePrecise(fromDate, toDate);
//        double month = result.getMonth();
//        double year = result.getYear();
//        //返回2位小数，并且四舍五入
//        DecimalFormat df = new DecimalFormat("######0.0");
//        return df.format(year + month / 12);


    }
}
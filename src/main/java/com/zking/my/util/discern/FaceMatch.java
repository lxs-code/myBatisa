package com.zking.my.util.discern;

import com.zking.my.util.discenrnUtil.GsonUtils;
import com.zking.my.util.discenrnUtil.HttpUtil;
import com.zking.my.util.discenrnUtil.SslTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    public static void main(String[] args) {
//        String xsd = FaceMatch.match();
//        JSONObject js =new JSONObject(xsd);
//        Object object = js.get("result");
//        String result =object.toString();
//        JSONObject js1 =new JSONObject(result);
//        Object object2 = js1.get("score");
//        String xsdd =object2.toString();
//        System.out.println(xsdd);
//
//    	File file=new File("‪‪D:\\1.jpg");
//    	System.out.println(file.exists());
//    	if(!file.exists())
//    {
//        try {
//            file.createNewFile();
//        } catch (IOException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
//    }
}
}
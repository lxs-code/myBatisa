package com.zking.my.util.discern;

import com.zking.my.util.discenrnUtil.GsonUtils;
import com.zking.my.util.discenrnUtil.HttpUtil;
import com.zking.my.util.discenrnUtil.SslTest;

import java.util.HashMap;
import java.util.Map;

public class FaceDetect {
    public static String detect(String base64) {


        String result=null;
        // 请求url
        String url = "https://aip.baidubce.com/rest/2.0/face/v3/detect";

        try {
            SslTest st = new SslTest();
            String a = st.getRequest( url,3000);
        } catch (Exception e) {
            e.printStackTrace();
        }






        try {
//            String ss="D://6.jpg";
//
//            String location=ss.replace("//", "/");
            Map<String, Object> map = new HashMap<>();
            map.put("image", base64);
            map.put("face_field", "faceshape,facetype,beauty,eye_status");
            map.put("image_type", "BASE64");
            map.put("face_type","LIVE");


            String param = GsonUtils.toJson(map);

            // 注意这里仅为了简化编码每一次请求都去获取access_token，线上环境access_token有过期时间， 客户端可自行缓存，过期后重新获取。
            String accessToken = "24.13e61fab3161063c7bfe3ef6671cbd11.2592000.1574591185.282335-17562304";

            result = HttpUtil.post(url, accessToken, "application/json", param);

            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }




}

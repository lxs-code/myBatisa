package com.zking.my.util.discern;

import com.zking.my.util.discenrnUtil.HttpUtil;
import com.zking.my.util.discenrnUtil.SslTest;

import java.net.URLEncoder;

/**
 * 身份证识别
 */
public class Idcard {

    /**
     * 重要提示代码中所需工具类
     * FileUtil,Base64Util,HttpUtil,GsonUtils请从
     * https://ai.baidu.com/file/658A35ABAB2D404FBF903F64D47C1F72
     * https://ai.baidu.com/file/C8D81F3301E24D2892968F09AE1AD6E2
     * https://ai.baidu.com/file/544D677F5D4E4F17B4122FBD60DB82B3
     * https://ai.baidu.com/file/470B3ACCA3FE43788B5A963BF0B625F3
     * 下载
     */
    public static String Idcard(String   base1) {
        // 身份证识别url
        String idcardIdentificate = "https://aip.baidubce.com/rest/2.0/ocr/v1/idcard";





        try {
            SslTest st = new SslTest();
            String a = st.getRequest( idcardIdentificate,3000);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // 本地图片路径
//        String filePath = "d:\\s.jpg";
        String dds=null;
        try {
//            byte[] imgData = FileUtil.readFileByBytes(filePath);
//            String imgStr = Base64Util.encode(imgData);
            // 识别身份证正面id_card_side=front;识别身份证背面id_card_side=back;
            String params = "id_card_side=front&" + URLEncoder.encode("image", "UTF-8") + "="
                    + URLEncoder.encode(base1, "UTF-8");
            /**
             * 线上环境access_token有过期时间， 客户端可自行缓存，过期后重新获取。
             */
            String accessToken = "24.804c7780062af147c613b3135e5da2c7.2592000.1574671918.282335-17598158";
            String result = HttpUtil.post(idcardIdentificate, accessToken, params);
dds=result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dds;
    }
}
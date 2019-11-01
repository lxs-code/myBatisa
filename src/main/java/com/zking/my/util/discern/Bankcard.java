package com.zking.my.util.discern;

import com.zking.my.util.discenrnUtil.HttpUtil;

import java.net.URLEncoder;

/**
 * 银行卡识别
 */
public class Bankcard {

    /**
     * 重要提示代码中所需工具类
     * FileUtil,Base64Util,HttpUtil,GsonUtils请从
     * https://ai.baidu.com/file/658A35ABAB2D404FBF903F64D47C1F72
     * https://ai.baidu.com/file/C8D81F3301E24D2892968F09AE1AD6E2
     * https://ai.baidu.com/file/544D677F5D4E4F17B4122FBD60DB82B3
     * https://ai.baidu.com/file/470B3ACCA3FE43788B5A963BF0B625F3
     * 下载
     */
    public static String yhk(String Base64) {
        // 银行卡识别url
        String bankcardIdentificate = "https://aip.baidubce.com/rest/2.0/ocr/v1/bankcard";
        // 本地图片路径
//        String filePath = "d:\\we.jpg";
        String result=null;
        try {
//            byte[] imgData = FileUtil.readFileByBytes(Base64);
//            String imgStr = Base64Util.encode(imgData);
            String params = URLEncoder.encode("image", "UTF-8") + "=" + URLEncoder.encode(Base64, "UTF-8");
            /**
             * 线上环境access_token有过期时间， 客户端可自行缓存，过期后重新获取。
             */
            String accessToken = "24.804c7780062af147c613b3135e5da2c7.2592000.1574671918.282335-17598158";
             result = HttpUtil.post(bankcardIdentificate, accessToken, params);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
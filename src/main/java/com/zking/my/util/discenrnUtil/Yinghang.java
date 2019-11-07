package com.zking.my.util.discenrnUtil;

import net.sf.json.JSONObject;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Yinghang {

    /**
     *
     * @param name
     * @param sfz 身份证
     * @param phone 手机号
     * @param yhk  银行卡
     * @return
     * @throws Exception
     */

    public  static String yhk(String name,String sfz,String phone,String yhk) {
        //银行卡：6217995630010286420  身份证:431021200106221012 电话号:13327356680
        //&showapi_sign=25fdfe5d1245cebce085064c092d1f64
        //获取系统当前时间
//        String   name="申汇汇";
//        //6217995550019099717
//        String    yhk = "6236682960003186271";
//        String    sfz = "430521200012097379";
//        String   phone = "18897498270";
        //18897498270   15684984550
        System.out.println(name+"name");
        System.out.println(sfz+"sfz");
        System.out.println(phone+"phone");
        System.out.println(yhk+"yhk");
        long time=new Date().getTime();
        Date date=new Date(time);
        SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddhhmmss");
        String data = sdf.format(date);
        String  ssa=null;
        try {
                SslTest st = new SslTest();
                String a = st.getRequest("https://route.showapi.com/1072-5?acct_name="+name+"&acct_pan="+yhk+"&cert_id="+sfz+"&cert_type=01&needBelongArea=true&phone_num="+phone+"&showapi_appid=102131&showapi_timestamp="+data+"&showapi_sign=aef8b95ad7bb478191577e164f3a7888", 3000);



            URL u = new URL("https://route.showapi.com/1072-5?acct_name="+name+"&acct_pan="+yhk+"&cert_id="+sfz+"&cert_type=01&needBelongArea=true&phone_num="+phone+"&showapi_appid=102131&showapi_timestamp="+data+"&showapi_sign=aef8b95ad7bb478191577e164f3a7888");
            InputStream in = u.openStream();
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            try {
                byte buf[] = new byte[1024];
                int read = 0;
                while ((read = in .read(buf)) > 0) {
                    out.write(buf, 0, read);
                }
            } finally {
                if ( in != null) {
                    in .close();
                }
            }
            byte b[] = out.toByteArray();

ssa=new String(b, "utf-8");
            } catch (Exception e) {
                e.printStackTrace();
            }


        return  ssa;

    }

    public  static String sfz(String name,String sfz){

        String sssa=null;

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        try {
            URL u = new URL("http://route.showapi.com/1072-1?showapi_appid=102131&idcard="+sfz+"&name="+name+"&showapi_sign=aef8b95ad7bb478191577e164f3a7888");
            InputStream in = u.openStream();
            byte buf[] = new byte[1024];
            int read = 0;
            while ((read = in .read(buf)) > 0) {
                out.write(buf, 0, read);
            }
            if ( in != null) {
                in .close();
            }
            byte b[] = out.toByteArray();
            sssa=      new String(b, "utf-8");
        }catch (Exception e){

        }



        return  sssa;
    }


    public static void main(String[] args)throws Exception {
        String ss = "{result:{\"error_code\":0,\"error_msg\":\"SUCCESS\",\"log_id\":1010019979251,\"timestamp\":1572968912,\"cached\":0,\"result\":{\"face_num\":1,\"face_list\":[{\"face_token\":\"254f1082220946896587ccb11cac9394\",\"location\":{\"left\":109.52,\"top\":25.28,\"width\":115,\"height\":117,\"rotation\":-4},\"face_probability\":1,\"angle\":{\"yaw\":-8.87,\"pitch\":-1.5,\"roll\":-8.33},\"face_shape\":{\"type\":\"square\",\"probability\":0.53},\"face_type\":{\"type\":\"human\",\"probability\":1},\"beauty\":40.19,\"eye_status\":{\"left_eye\":1,\"right_eye\":1}}]}}}";
        JSONObject json;
        json = JSONObject.fromObject(ss);
        JSONObject resulta = json.getJSONObject("result");
        String result = resulta.getString("result");
        json = JSONObject.fromObject(result);
        String face_list = json.getString("face_list");
   String   dsa=   face_list.substring(1,face_list.length()-1);
        json = JSONObject.fromObject(dsa);
    String    rr=  json.getString("beauty");
//     s.substring(0,s.length()-1);

//        json = JSONObject.fromObject(face_list);

    }






}

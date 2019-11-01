package com.zking.my.util.discenrnUtil;

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

    public  static String yhk(String name,String sfz,String phone,String yhk)throws Exception{
        //银行卡：6217995630010286420  身份证:431021200106221012 电话号:13327356680
        //&showapi_sign=25fdfe5d1245cebce085064c092d1f64
        //获取系统当前时间
//        String   name="申汇汇";
//        //6217995550019099717
//        String    yhk = "6236682960003186271";
//        String    sfz = "430521200012097379";
//        String   phone = "18897498270";
        //18897498270   15684984550
        long time=new Date().getTime();
        Date date=new Date(time);
        SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddhhmmss");
        String data = sdf.format(date);
        URL u = new URL("https://route.showapi.com/1072-5?acct_name="+name+"&acct_pan="+yhk+"&cert_id="+sfz+"&cert_type=01&needBelongArea=true&phone_num="+phone+"&showapi_appid=99916&showapi_timestamp="+data+"&showapi_sign=f2e7d74cbbcc4d90923bbf28a899aa09");
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
        System.out.println(new String(b, "utf-8"));
        return  new String(b, "utf-8");

    }

    public  static String duanxin()throws Exception{
        String name ="。。。";
        String code="233333";
        String minute = "2";
        String phone = "15197923018";
        long time=new Date().getTime();
        Date date=new Date(time);
        SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddhhmmss");
        String data = sdf.format(date);
        int aaa = (int)((Math.random()*9+1)*100000);//随机验证码18573712836
        URL u = new URL("https://route.showapi.com/28-1?big_msg=1&content={'name':'"+name+"','code':'"+code+"','minute':'"+code+"'}&mobile="+phone+"&showapi_appid=103329&showapi_timestamp="+data+"&tNum=T170317005339&showapi_sign=7d9c8487421444988a8b87b90cc2e310");
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
        System.out.println(new String(b, "utf-8"));
        return  null;
    }








}

package com.zking.my.util;

public class replace {


    public  static  String relpace(String base64){




        String substring = base64.replace("data:image/png;base64,","");

      String    substring1 = substring.replace(" data:image/jpeg;base64,","");
        String sa=substring1.replace("\"","");
        return sa ;
    }


    public  static  String relpace2(String as){




        String substring = as.replace("住址","address");
        String      substring1=substring.replace("公民身份号码","code");
        String     substring2=substring1.replace("出生","birth");
        String    substring3=substring2.replace("姓名","name");
        String    substring4=substring3.replace("性别","sex");
        String    substring5=substring4.replace("民族","bation");
        String    substring6=substring5.replace("null", "1");
        return substring6 ;
    }
}

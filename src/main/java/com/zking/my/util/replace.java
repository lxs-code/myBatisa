package com.zking.my.util;

public class replace {


    public  static  String relpace(String base64){




        String substring = base64.replace("data:image/png;base64,","");

      String    substring1 = substring.replace(" data:image/jpeg;base64,","");
        String sa=substring1.replace("\"","");
        return sa ;
    }

}

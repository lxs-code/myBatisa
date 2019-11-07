package com.zking.my.util;

import net.sf.json.JSONObject;

public class getBetis {


    public   static  String  getbi(String  ss){
        JSONObject json;
        json = JSONObject.fromObject(ss);
        JSONObject resulta = json.getJSONObject("result");
        String result = resulta.getString("result");
        json = JSONObject.fromObject(result);
        String face_list = json.getString("face_list");
        String   dsa=   face_list.substring(1,face_list.length()-1);
        json = JSONObject.fromObject(dsa);
        String    rr=  json.getString("beauty");

        return rr;
    }
}

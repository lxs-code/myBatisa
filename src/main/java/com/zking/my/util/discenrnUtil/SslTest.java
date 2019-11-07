package com.zking.my.util.discenrnUtil;

import org.apache.commons.io.IOUtils;

import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;

public class SslTest {

    public String getRequest(String url,int timeOut) throws Exception{
        URL u = new URL(url);
        if("https".equalsIgnoreCase(u.getProtocol())){
            SslUtils.ignoreSsl();
        }
        URLConnection conn = u.openConnection();
        conn.setConnectTimeout(timeOut);
        conn.setReadTimeout(timeOut);
        return IOUtils.toString(conn.getInputStream());
    }

    public String postRequest(String urlAddress,String args,int timeOut) throws Exception{
        URL url = new URL(urlAddress);
        if("https".equalsIgnoreCase(url.getProtocol())){
            SslUtils.ignoreSsl();
        }
        URLConnection u = url.openConnection();
        u.setDoInput(true);
        u.setDoOutput(true);
        u.setConnectTimeout(timeOut);
        u.setReadTimeout(timeOut);
        OutputStreamWriter osw = new OutputStreamWriter(u.getOutputStream(), "UTF-8");
        osw.write(args);
        osw.flush();
        osw.close();
        u.getOutputStream();
        return IOUtils.toString(u.getInputStream());
    }

    public static void main(String[] args) {

    }

}

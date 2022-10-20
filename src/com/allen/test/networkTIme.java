package com.allen.test;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * @author ：jhys
 * @date ：Created in 2022/4/2 22:15
 * @Description ：
 */
public class networkTIme {
    public static void main(String[] args) {

        String webUrlb = "http://www.baidu.com";
        System.out.println(getNetworkTime(webUrlb) + " [百度]");

    }
    public static String getNetworkTime(String webUrl) {
        try {
            URL url = new URL(webUrl);
            URLConnection conn = url.openConnection();
            conn.connect();
            long dateL = conn.getDate();
            Date date = new Date(dateL);
            SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
            return dateFormat.format(date);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return "";
    }
}

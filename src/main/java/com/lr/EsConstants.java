package com.lr;

public class EsConstants {
    public  static String esClusterName= "es";
    public static  String esIndexName = "demo01";

    /**
     *  用户名:密码
     */
    public static String esSecurityUser = "elastic:changeme";

    public static String esAddress = "192.168.214.128:9300";
    public  static String esHost="192.168.214.128";
    public static  int esPort=9300;

    public  static  int  maxSize=10*10000;
    /**
     * timeout:TODO 超时时间毫秒
     */
    public static int timeout = 30 * 1000;
    public static String estype_userInfo="userInfo";
}

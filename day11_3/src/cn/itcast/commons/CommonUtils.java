package cn.itcast.commons;

import java.util.UUID;

public class CommonUtils {
    public static String uuid666(){
        return UUID.randomUUID().toString().replace("-","").toUpperCase();
    }
}

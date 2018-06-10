package cn.itcast.servlet;

import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Arrays;

public class Demo {

    /*
    * [-27, -68, -96, -28, -72, -119]
    * */
    @Test
    public void func1() throws UnsupportedEncodingException {
        String name="张三";
//        byte [] bytes=name.getBytes("utf-8");
//        System.out.println(Arrays.toString(bytes));
        String s=URLEncoder.encode(name,"UTF-8");
        System.out.println(s);

        s=URLDecoder.decode(s,"utf-8");
        System.out.println(s);
    }
}

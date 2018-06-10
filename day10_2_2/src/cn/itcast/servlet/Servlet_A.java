package cn.itcast.servlet;

import java.io.IOException;

public class Servlet_A extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

        String addr=request.getRemoteAddr();//客户端IP地址
        System.out.println(addr);
        System.out.println("请求方式："+request.getMethod());//获取请求方式
        String userAgent=request.getHeader("User-Agent");
        System.out.println(userAgent);
        if(userAgent.toLowerCase().contains("chrome")){
            System.out.println("你好："+addr+", 你用的是谷歌");
        }else if( userAgent.toLowerCase().contains("firefox")){
            System.out.println("你好："+addr+", 你用的是火狐");
        }else if( userAgent.toLowerCase().contains("msie")){
            System.out.println("你好："+addr+", 你用的是IE");
        }
    }
}

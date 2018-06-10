package cn.itcast.servlet;

import java.io.IOException;

public class Servlet_A extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

        String addr=request.getRemoteAddr();
        System.out.println("IP:"+addr);
        System.out.println("请求方式："+request.getMethod());
    }
}

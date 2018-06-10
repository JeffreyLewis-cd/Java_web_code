package cn.itcast.servlet;

import java.io.IOException;

public class ServletA extends javax.servlet.http.HttpServlet {
    public void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String username=request.getParameter("username");
        System.out.println(username);
    }

    public void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String name=request.getParameter("username");
//        byte [] b=name.getBytes("utf-8");
//        name=new String(b,"utf-8");
        System.out.println(name);
    }
}

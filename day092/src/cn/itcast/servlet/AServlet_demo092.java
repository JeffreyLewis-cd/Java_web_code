package cn.itcast.servlet;

import javax.servlet.ServletContext;
import java.io.IOException;

public class AServlet_demo092 extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

        /*存数据*/
        ServletContext application =this.getServletContext();
        application.setAttribute("name","张三02");
    }
}

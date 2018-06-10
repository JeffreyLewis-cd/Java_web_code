package cn.itcast.servlet;

import javax.servlet.ServletContext;
import java.io.IOException;
import java.io.PrintWriter;

public class Servlet_A extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {


        ServletContext app=this.getServletContext();
        Integer count=(Integer)app.getAttribute("count");
        if(null==count){
            app.setAttribute("count",1);
        }else{
            app.setAttribute("count",count+1);
        }
        System.out.println("day093_03_统计访问量"+count);

        /*向浏览器输出*/
        PrintWriter pw=response.getWriter();
        pw.print("<h1>"+count+"</h1>");
    }
}

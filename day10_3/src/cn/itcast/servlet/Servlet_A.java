package cn.itcast.servlet;

import java.io.IOException;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Map;

public class Servlet_A extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        String [] hobby=request.getParameterValues("hobby");
        System.out.println(username+','+password+","+ Arrays.toString(hobby));

        Enumeration names=request.getParameterNames();
        /*请求参数的名称*/
        while(names.hasMoreElements()){
            System.out.println(names.nextElement());
        }
        /*请求参数封装到map中*/
        Map<String,String[]> map=request.getParameterMap();
        System.out.println(map);
        for(String name:map.keySet()){
            String[] values=map.get(name);
            System.out.println(name+"="+Arrays.toString(values));

        }
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        System.out.println("GET:"+request.getParameter("aaa"));
        System.out.println("GET:"+request.getParameter("bbb"));
    }
}

package cn.itcast.servlet;


import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;

public class Servlet_A extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

/*        System.out.println("test_dep666");
        ClassLoader cl=this.getClass().getClassLoader();
        InputStream input=cl.getResourceAsStream("cn/itcast/servlet/a.txt");*/

        Class c = this.getClass();
        InputStream input = c.getResourceAsStream("/a.txt");

        /*读取输入流内容-转换成字符串*/
        String s = IOUtils.toString(input);

        System.out.println(s);
    }
}

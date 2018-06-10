package cn.itcast.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Servlet_C", urlPatterns = "/Servlet_C_url")
public class Servlet_C extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.getWriter().println(request.getScheme()+"</br>");//请求协议
        response.getWriter().println(request.getServerName()+"</br>");//服务器名称
        response.getWriter().println(request.getServerPort()+"</br>");//请求协议
        response.getWriter().println(request.getContextPath()+"</br>");//项目名称
        response.getWriter().println(request.getServletPath()+"</br>");//servlet路径
        response.getWriter().println(request.getQueryString()+"</br>");//参数部分
        response.getWriter().println(request.getRequestURI()+"</br>");//请求URI
        response.getWriter().println(request.getRequestURL()+"</br>");//请求URL
    }
}

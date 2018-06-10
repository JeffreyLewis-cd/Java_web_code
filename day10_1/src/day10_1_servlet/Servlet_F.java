package day10_1_servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Servlet_F",urlPatterns = "/day10_1_servlet/Servlet_F_url")
public class Servlet_F extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().print("hello response!");
        /*禁用浏览器缓存*/
        response.setHeader("Cache-control","no-cache");
        response.setHeader("pragma","no-cache");
        response.setDateHeader("expires",-1);

    }
}

package cn.itcast.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Servlet_B", urlPatterns = "/Servlet_B_url")
public class Servlet_B extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String referer=request.getHeader("Referer");
        System.out.println(referer);
        if(null==referer){
            System.out.println("hell0!");
        }
        else if(referer.contains("localhost")){
            response.sendRedirect("http://www.baidu.com");
        }
    }
}

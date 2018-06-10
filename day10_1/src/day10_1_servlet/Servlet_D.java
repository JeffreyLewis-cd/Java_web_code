package day10_1_servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "day10_1_servlet.Servlet_D",urlPatterns = "/day10_1_servlet/Servlet_D_url")
public class Servlet_D extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    /*定时刷新*/
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        PrintWriter writer=response.getWriter();
        writer.print("欢迎XXX回来, refresh in 5 seconds");

        response.setHeader("Refresh","10;URL=/day10_1_servlet/Servlet_E_url");
    }
}

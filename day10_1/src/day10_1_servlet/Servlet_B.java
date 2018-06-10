package day10_1_servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "day10_1_servlet.Servlet_B", urlPatterns = "/Servlet_B_url")
public class Servlet_B extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("servlet_B");
/*        response.setHeader("Location","/Servlet_C_url");
        response.setStatus(302);*/

        response.sendRedirect("/Servlet_C_url");
    }
}

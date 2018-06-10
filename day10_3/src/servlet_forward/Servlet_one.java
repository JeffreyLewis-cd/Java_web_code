package servlet_forward;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Servlet_one", urlPatterns = "/Servlet_one_url")
public class Servlet_one extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("one-servlet");
        response.setHeader("aaa","AAA");
//        response.getWriter().print("Oneservlet");

        request.setAttribute("username","zhang66");

        request.getRequestDispatcher("/Servlet_two_url").forward(request,response);
    }
}

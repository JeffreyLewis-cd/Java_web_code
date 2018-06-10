package servlet_include;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Servlet_include_one",urlPatterns = "/Servlet_include_one_url")
public class Servlet_include_one extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("one-servlet-include");
        response.setHeader("aaa","AAA");
        response.getWriter().print("One-servlet-include");

        request.getRequestDispatcher("/Servlet_include_two_url").include(request,response);
    }
}

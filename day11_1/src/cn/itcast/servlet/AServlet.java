package cn.itcast.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "AServlet", urlPatterns = "/AServlet_url")
public class AServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /*获取参数*/
        String s1=request.getParameter("num1");
        String s2=request.getParameter("num2");
        /*转换成int类型*/
        int num1=Integer.parseInt(s1);
        int num2=Integer.parseInt(s2);
        /*运算*/
        int sum=num1+num2;
        /*把结果保存到request域中*/
        request.setAttribute("result",sum);
        /*转发到result.jsp*/
        request.getRequestDispatcher("/plus/result.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}

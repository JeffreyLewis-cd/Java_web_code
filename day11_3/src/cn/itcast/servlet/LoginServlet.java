package cn.itcast.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class LoginServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        /*处理中文问题*/
        request.setCharacterEncoding("utf-8");
        String username=request.getParameter("username");
        String password=request.getParameter("password");

        /*校验用户名和密码*/
        if(!"itcast".equalsIgnoreCase(username)){//登录成功
            Cookie cookie=new Cookie("uname",username);
            cookie.setMaxAge(60*60*24);
            response.addCookie(cookie);

            HttpSession session=request.getSession();
            session.setAttribute("username",username);
            response.sendRedirect("/day11_3/session2/succ1.jsp"); //重定向
        }else{//登录失败
            request.setAttribute("msg","用户名或者密码错误！");
            RequestDispatcher rd=request.getRequestDispatcher("/session2/login.jsp"); //得到转发器
            rd.forward(request,response);//转发
        }
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}

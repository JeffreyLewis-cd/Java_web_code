package cn.itcast.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.util.Set;

@WebServlet(name = "Servlet_D",urlPatterns="/Servlet_D_092")
public class Servlet_D extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String path=this.getServletContext().getRealPath("/index.jsp");
        System.out.println(path);

        /*先获取资源路径，再创建输入流对象*/
        InputStream input=this.getServletContext().getResourceAsStream("/index.jsp");
        System.out.println(input);
        /*获取当前路径下所以资源的路径 */
        Set<String> paths=this.getServletContext().getResourcePaths("/WEB-INF");
        System.out.println(paths);
    }
}

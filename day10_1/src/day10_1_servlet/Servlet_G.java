package day10_1_servlet;

import org.apache.commons.io.IOUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

@WebServlet(name = "Servlet_G", urlPatterns="/Servlet_G_url")
public class Servlet_G extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

/*        String s = "Hello outputStream";
        byte[] bytes = s.getBytes();
        response.getOutputStream().write(bytes);*/

        /*响应字节数据-把图片读取到字节数组中*/
//        File path=new File("D:\\backupData\\images2\\planet02.jpg");

        String path="/test03.txt";

        FileInputStream in=new FileInputStream(path);
        System.out.println(in);
        byte[] bytes=IOUtils.toByteArray(in); //读取输入流内容的字节到字节数组中
        System.out.println(bytes);
        response.getOutputStream().write(bytes);
    }
}

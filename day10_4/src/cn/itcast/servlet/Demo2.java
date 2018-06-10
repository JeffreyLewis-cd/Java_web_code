package cn.itcast.servlet;

import org.apache.commons.io.IOUtils;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class Demo2 {
    @Test
    public void func1() throws IOException {
        ClassLoader c1=Demo2.class.getClassLoader();
        InputStream in=c1.getResourceAsStream("a.html");
        System.out.println(IOUtils.toString(in));
    }

    @Test
    public void func2() throws IOException{
        Class c=Demo2.class;
        InputStream in=c.getResourceAsStream("/a.html");
        System.out.println(IOUtils.toString(in));
    }
}

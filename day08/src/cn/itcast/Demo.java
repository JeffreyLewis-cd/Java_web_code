package cn.itcast;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        /*图片缓冲区*/
        BufferedImage bi=new BufferedImage(150,70,BufferedImage.TYPE_INT_RGB);
        /*绘制环境-这张图片的笔*/
        Graphics2D g2=(Graphics2D) bi.getGraphics();
        g2.setColor(Color.WHITE); //设置颜色
        g2.fillRect(0,0,150,70);//设置背景色
        g2.setColor(Color.RED);
        g2.drawRect(0,0,148,68);
        g2.setFont(new Font("宋体",Font.BOLD,18));//设置字体
        g2.setColor(Color.BLACK);//设置颜色
        g2.drawString("HelloWorld",25,40);//向图片上写字符串
        ImageIO.write(bi,"JPEG",new FileOutputStream("D:/backupData/bigData/Java/javaCode/aa.jpg"));



    }
}

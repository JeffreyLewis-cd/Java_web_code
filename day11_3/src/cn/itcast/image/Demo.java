package cn.itcast.image;

import org.junit.Test;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo {

    @Test
    public void func1() throws FileNotFoundException, IOException {
        VerifyCode code=new VerifyCode();
        BufferedImage image=code.createImage();

        ImageIO.write(image,"JPEG",new FileOutputStream("D:\\backupData\\bigData\\Java\\javaCode\\bbc.jpg"));
        System.out.println(code.getText());
    }
}

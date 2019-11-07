package com.itheima_08;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//- 把“E:\\itcast”这个文件夹复制到模块目录下
public class CopySingleFile {

    public static void main(String[] args) throws IOException {

        //源目录C:\Users\lee\Desktop\新建文件夹\Aquare\小学期
        //目标目录G:\idea2019\javaSeBase\字符流&字节缓冲流\myCharStream\src\com\itheima_08
        File src = new File("C:\\Users\\lee\\Desktop\\新建文件夹\\Aquare\\小学期");
        File des = new File("G:\\idea2019\\javaSeBase\\字符流&字节缓冲流\\myCharStream\\src\\com\\itheima_08");

        if (!src.isDirectory())
            System.exit(-1);

        File[] files = src.listFiles();
        for (File file : files) {
            System.out.println(file.getName());
        }
        System.out.println(src.getName());
        //System.out.println(des.getPath());
        File newDes=new File(des.getPath(),src.getName());
        System.out.println(newDes.getPath());
         if(!newDes.mkdir())
             System.exit(-1);

        for (File file : files) {
            FileOutputStream fos = new FileOutputStream(newDes.getPath() +"\\"+ file.getName());
            FileInputStream fis = new FileInputStream(file);
            int len;
            byte[] bytes = new byte[2048];
            while ((len = fis.read(bytes)) != -1) {

                fos.write(bytes, 0, len);

            }
            fis.close();
            fos.close();
        }


    }
}




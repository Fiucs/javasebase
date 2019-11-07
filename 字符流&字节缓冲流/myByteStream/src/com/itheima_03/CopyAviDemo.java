package com.itheima_03;

import java.io.*;

/*
    需求：
        把E:\\itcast\\字节流复制图片.avi 复制到模块目录下的 字节流复制图片.avi

    思路：
        1:根据数据源创建字节输入流对象
        2:根据目的地创建字节输出流对象
        3:读写数据，复制图片(一次读取一个字节数组，一次写入一个字节数组)
        4:释放资源

    四种方式实现复制视频，并记录每种方式复制视频的时间 29.8M
        1:基本字节流一次读写一个字节     182071毫秒
        2:基本字节流一次读写一个字节数组   324毫秒
        3:字节缓冲流一次读写一个字节           共耗时：636毫秒
        4:字节缓冲流一次读写一个字节数组        共耗时：99毫秒
        D:\JavaSE高级\09_字符流&字节缓冲流\视频
 */
public class CopyAviDemo {
    public static void main(String[] args) throws IOException {
        //记录开始时间
        long startTime = System.currentTimeMillis();

        //复制视频
        method1();

        //记录结束时间
        long endTime = System.currentTimeMillis();
        System.out.println("共耗时：" + (endTime - startTime) + "毫秒");
    }

    public static void method1() throws IOException {

        //D:\JavaSE高级\09_字符流&字节缓冲流\视频\01_字节缓冲流.avi

        FileInputStream fis=new FileInputStream("D:\\JavaSE高级\\09_字符流&字节缓冲流\\视频\\01_字节缓冲流.avi");

        FileOutputStream fos=new FileOutputStream("字符流&字节缓冲流\\myByteStream\\new.avi");

        int ch;
        while ((ch=fis.read())!=-1){
            fos.write(ch);

        }
        fis.close();
        fos.close();


    }
    public static void method2() throws IOException {

        //D:\JavaSE高级\09_字符流&字节缓冲流\视频\01_字节缓冲流.avi

        FileInputStream fis=new FileInputStream("D:\\JavaSE高级\\09_字符流&字节缓冲流\\视频\\01_字节缓冲流.avi");

        FileOutputStream fos=new FileOutputStream("字符流&字节缓冲流\\myByteStream\\new.avi");

        int len;
        byte [] by=new byte[1024];
        while ((len=fis.read(by))!=-1){
            fos.write(by,0,len);

        }
        fis.close();
        fos.close();


    }
    public static void method3() throws IOException {

        //D:\JavaSE高级\09_字符流&字节缓冲流\视频\01_字节缓冲流.avi

       BufferedInputStream bis= new BufferedInputStream(new FileInputStream("D:\\JavaSE高级\\09_字符流&字节缓冲流\\视频\\01_字节缓冲流.avi"));

    BufferedOutputStream bos  =new BufferedOutputStream(new FileOutputStream("字符流&字节缓冲流\\myByteStream\\new.avi"));

        int len;
       // byte [] by=new byte[4096];
        while ((len=bis.read())!=-1){
            bos.write(len);

        }
        bis.close();
        bos.close();


    }

    public static void method4() throws IOException {

        //D:\JavaSE高级\09_字符流&字节缓冲流\视频\01_字节缓冲流.avi

        BufferedInputStream bis= new BufferedInputStream(new FileInputStream("D:\\JavaSE高级\\09_字符流&字节缓冲流\\视频\\01_字节缓冲流.avi"));

        BufferedOutputStream bos  =new BufferedOutputStream(new FileOutputStream("字符流&字节缓冲流\\myByteStream\\new.avi"));

        int len;
         byte [] by=new byte[1024];
        while ((len=bis.read(by))!=-1){
            bos.write(by,0,len);

        }
        bos.flush();
        bis.close();
        bos.close();


    }






}

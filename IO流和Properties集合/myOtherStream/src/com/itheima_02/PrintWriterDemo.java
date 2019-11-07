package com.itheima_02;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/*
    字符打印流的构造方法：
        PrintWriter​(String fileName) ：使用指定的文件名创建一个新的PrintWriter，而不需要自动执行行刷新

        PrintWriter​(Writer out, boolean autoFlush)：创建一个新的PrintWriter
            out：字符输出流
            autoFlush： 一个布尔值，如果为真，则println ， printf ，或format方法将刷新输出缓冲区
 */
public class PrintWriterDemo {
    public static void main(String[] args) throws IOException {

        //需手动flush()
        PrintWriter pw = new PrintWriter(new FileWriter("IO流和Properties集合\\myOtherStream\\src\\com\\itheima_02\\print.txt",true));
        pw.println("阿斯玛丁顿");

        pw.println("没密码怕");
        pw.flush();//

        PrintWriter pw1=new PrintWriter(new FileWriter("IO流和Properties集合\\myOtherStream\\src\\com\\itheima_02\\print.txt",true),true);
        pw1.println("潖撒顶");




    }
}

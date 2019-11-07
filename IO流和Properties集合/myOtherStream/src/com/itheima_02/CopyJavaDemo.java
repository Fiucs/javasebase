package com.itheima_02;


import java.io.*;

/*
    需求：
        把模块目录下的PrintStreamDemo.java 复制到模块目录下的 Copy.java

    思路：
        1:根据数据源创建字符输入流对象
        2:根据目的地创建字符输出流对象
        3:读写数据，复制文件
        4:释放资源
 */
public class CopyJavaDemo {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("IO流和Properties集合\\myOtherStream\\myOtherStream.iml");
        PrintStream ps = new PrintStream(new FileOutputStream("IO流和Properties集合\\myOtherStream\\src\\com\\itheima_02\\myOtherStream.iml"));

        int len;
        byte [] bytes=new byte[1024];

        while ((len=fis.read(bytes))!=-1){

            ps.write(bytes,0,len);
        }

        fis.close();
        ps.close();



    }
}

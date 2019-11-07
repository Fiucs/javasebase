package com.itheima_02;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collections;

/*
    需求：
        把“E:\\itcast\\窗里窗外.txt”复制到模块目录下的“窗里窗外.txt”

        数据源：
            E:\\itcast\\窗里窗外.txt --- 读数据 --- InputStream --- FileInputStream
        目的地：
            myByteStream\\窗里窗外.txt --- 写数据 --- OutputStream --- FileOutputStream

    思路：
        1:根据数据源创建字节输入流对象
        2:根据目的地创建字节输出流对象
        3:读写数据，复制文本文件(一次读取一个字节，一次写入一个字节)
        4:释放资源
 */
public class CopyTxtDemo {
    public static void main(String[] args) throws IOException {

        File file=new File("name.txt");


        FileInputStream fis=new FileInputStream(file);//读
        FileOutputStream fos=new FileOutputStream("File类递归字节流\\myByteStream\\name.txt");//写流//创建新文件
        int len;

        byte []by=new byte[1024];

        while ((len=fis.read(by,0,by.length))!=-1){

            /* byte [] bytes=new;

            fos.write(bytes);*/
            System.out.println(new String(by,0,len));
            fos.write(by,0,len);//注意最后一写入的时候 长度不一定达到1024

        }

        fos.close();
        fis.close();




    }
}

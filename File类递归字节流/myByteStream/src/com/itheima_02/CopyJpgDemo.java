package com.itheima_02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
    需求：
        把E:\\itcast\\mn.jpg复制到模块目录下的mn.jpg

    思路：
        1:根据数据源创建字节输入流对象
        2:根据目的地创建字节输出流对象
        3:读写数据，复制图片(一次读取一个字节数组，一次写入一个字节数组)
        4:释放资源
 */
public class CopyJpgDemo {
    public static void main(String[] args) throws IOException {

        FileInputStream srcImage=new FileInputStream("File类递归字节流\\myByteStream\\mn.jpg");
        FileOutputStream desImage=new FileOutputStream("File类递归字节流\\myByteStream\\new.jpg");//不存在则创建新文件


        byte [] by=new byte[1024];
        int len;

        while ((len=srcImage.read(by,0,by.length))!=-1){

            desImage.write(by,0,len);

        }

        srcImage.close();
        desImage.close();




    }
}

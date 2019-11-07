package com.itheima_01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
    构造方法：
        FileOutputStream​(String name)：创建文件输出流以指定的名称写入文件
        FileOutputStream​(File file)：创建文件输出流以写入由指定的 File对象表示的文件

    写数据的三种方式：
        void write​(int b)：将指定的字节写入此文件输出流
        一次写一个字节数据

        void write​(byte[] b)：将 b.length字节从指定的字节数组写入此文件输出流
        一次写一个字节数组数据

        void write​(byte[] b, int off, int len)：将 len字节从指定的字节数组开始，从偏移量off开始写入此文件输出流
        一次写一个字节数组的部分数据
*/
public class FileOutputStreamDemo02 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("File类递归字节流\\myByteStream\\fos.txt", true);
        String str="绅士大盗";

            fos.write(str.getBytes());








    }
}

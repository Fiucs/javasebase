package com.itheima_01;

import java.io.FileOutputStream;
import java.io.IOException;

/*
    字节流写数据的两个小问题:
        1:字节流写数据如何实现换行呢？
            

        2:字节流写数据如何实现追加写入呢？
 */
public class FileOutputStreamDemo03 {
    public static void main(String[] args) throws IOException {
        //创建字节输出流对象
        FileOutputStream fos = new FileOutputStream("File类递归字节流\\myByteStream\\fos.txt",true);

        //写数据
        for (int i = 0; i < 2; i++) {
            fos.write("号\n".getBytes());
        }

        //释放资源
        fos.close();
    }





}

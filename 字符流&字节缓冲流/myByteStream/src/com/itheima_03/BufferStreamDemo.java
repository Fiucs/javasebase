package com.itheima_03;

import java.io.*;

/*
    字节缓冲流：
        BufferOutputStream
        BufferedInputStream

    构造方法：
        字节缓冲输出流：BufferedOutputStream​(OutputStream out)
        字节缓冲输入流：BufferedInputStream​(InputStream in)
 */
public class BufferStreamDemo {
    public static void main(String[] args) throws IOException {

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("字符流&字节缓冲流\\myByteStream\\jk.jpg"));
        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("字符流&字节缓冲流\\myByteStream\\mnew.jpg"));


        int len;
        byte [] by=new byte[1024];
        while ((len=bis.read(by))!=-1){

            bos.write(by,0,len);

        }

        bis.close();
        bos.close();



    }
}

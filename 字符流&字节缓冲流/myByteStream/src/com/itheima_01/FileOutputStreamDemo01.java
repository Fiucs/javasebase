package com.itheima_01;

import java.io.*;
import java.util.Map;

/*
    FileOutputStream：文件输出流用于将数据写入File
        FileOutputStream​(String name)：创建文件输出流以指定的名称写入文件
 */
public class FileOutputStreamDemo01 {
    public static void main(String[] args) throws IOException {

       /* BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("字符流&字节缓冲流\\myByteStream\\bos.txt"));

        //写数据
        bos.write("hhhhh\r\n".getBytes());
        bos.write("笑口常开\r\n".getBytes());
        bos.close();*/
        BufferedInputStream bis=new BufferedInputStream(new FileInputStream("字符流&字节缓冲流\\myByteStream\\bos.txt") );

        int ch;
        byte []by;
        while ((ch=bis.read())!=-1)
        {

            System.out.print(ch);
        }



  /*      byte [] by=new byte[1024];
        int len;
        while ((len=bis.read(by))!=-1)
        {
            System.out.println(new String(by,0,len));

        }*/

    }
    public static byte[] intToByteArray(int i) {
        byte[] result = new byte[4];
        result[0] = (byte)((i >> 24) & 0xFF);
        result[1] = (byte)((i >> 16) & 0xFF);
        result[2] = (byte)((i >> 8) & 0xFF);
        result[3] = (byte)(i & 0xFF);
        return result;
    }

}

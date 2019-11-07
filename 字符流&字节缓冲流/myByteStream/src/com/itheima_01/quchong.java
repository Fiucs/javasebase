package com.itheima_01;

import java.io.*;
import java.util.LinkedHashSet;

public class quchong {

    public static void main(String[] args) throws IOException {
      //  FileInputStream fis = new FileInputStream("字符流&字节缓冲流\\myByteStream\\bos.txt");//读
       // FileOutputStream fos = new FileOutputStream("字符流&字节缓冲流\\myByteStream\\new.txt");

        OutputStreamWriter fos = new OutputStreamWriter(new FileOutputStream("字符流&字节缓冲流\\myByteStream\\new.txt"));
        InputStreamReader fis =new InputStreamReader(new FileInputStream("字符流&字节缓冲流\\myByteStream\\bos.txt"));

        int len;
        LinkedHashSet<Character> lk = new LinkedHashSet<>();
       //1.Set List(contains)都可以
        while ((len=fis.read())!=-1)
        {

            lk.add((char)len);
        }
        for (Character s : lk) {

            fos.write(s);
        }
        fis.close();
        fos.close();
    }
}

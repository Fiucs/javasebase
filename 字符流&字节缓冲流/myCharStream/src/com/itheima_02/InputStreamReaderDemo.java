package com.itheima_02;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/*
    构造方法：
        InputStreamReader​(InputStream in)：创建一个使用默认字符集的InputStreamReader

    读数据的2种方式：
        int read​()：一次读一个字符数据
        int read​(char[] cbuf)：一次读一个字符数组数据
 */
public class InputStreamReaderDemo {
    public static void main(String[] args) throws IOException {

        InputStreamReader isr = new InputStreamReader(new FileInputStream("C:\\Users\\lee\\Desktop\\javase.txt"));



        int len;
 /*       char [] chr=new char[2048];

        while ((len=isr.read(chr))!=-1){

            System.out.print(new String(chr,0,len));


        }
*/


        while ((len=isr.read())!=-1){

            System.out.print((char) len);
        }
    }
}

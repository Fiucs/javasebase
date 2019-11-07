package com.itheima_04;

import java.io.*;

/*
    字符缓冲流：
        BufferedWriter：将文本写入字符输出流，缓冲字符，以提供单个字符，数组和字符串的高效写入，可以指定缓冲区大小，或者可以接受默认大小。默认值足够大，可用于大多数用途
        BufferedReader：从字符输入流读取文本，缓冲字符，以提供字符，数组和行的高效读取，可以指定缓冲区大小，或者可以使用默认大小。 默认值足够大，可用于大多数用途

    构造方法：
        BufferedWriter(Writer out)
        BufferedReader(Reader in)
 */
public class BufferedStreamDemo01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("字符流&字节缓冲流\\myCharStream\\students.txt"));

        BufferedWriter bw = new BufferedWriter(new FileWriter("字符流&字节缓冲流\\myCharStream\\new.txt"));

        int len;

        char [] chr=new char[2048];


        while ((len=br.read(chr))!=-1){
            System.out.print(new String(chr,0,len));
            bw.append(new String(chr), 0, len);



        }
        bw.append("阿三大苏打大苏打实打实的");
        br.close();
        bw.close();



    }
}

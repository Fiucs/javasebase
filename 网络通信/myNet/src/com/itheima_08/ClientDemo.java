package com.itheima_08;

import java.io.*;
import java.net.Socket;

/*
    客户端：数据来自于文本文件
 */
public class ClientDemo {
    public static void main(String[] args) throws IOException {

        BufferedReader br=new BufferedReader(new FileReader("javaSeBase.iml"));//打开文件

        Socket socket=new Socket("127.0.0.1",10000);//连接
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

        String s;
        while ((s=br.readLine())!=null)//s中没有回车了 被readLine读取了
        {

            bw.write(s);
            bw.newLine();
            bw.flush();

        }

        br.close();
        bw.close();
        socket.close();

    }
}

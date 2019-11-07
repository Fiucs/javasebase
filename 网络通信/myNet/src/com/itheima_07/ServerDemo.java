package com.itheima_07;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/*
    服务器：接收到的数据写入文本文件
 */
public class ServerDemo {
    public static void main(String[] args) throws IOException {

        //1.
        ServerSocket server=new ServerSocket(10000,20, InetAddress.getByName("127.0.0.1"));
        Socket sock = server.accept();


        BufferedReader br=new BufferedReader(new InputStreamReader(sock.getInputStream()));//包装输入流

        BufferedWriter bw=new BufferedWriter(new FileWriter("网络通信\\myNet\\src\\com\\itheima_07\\a.txt"));

        String s;
        while ((s=br.readLine())!=null){

            bw.write(s);
            bw.newLine();
            bw.flush();

        }
        bw.close();
        sock.close();
        server.close();


    }
}

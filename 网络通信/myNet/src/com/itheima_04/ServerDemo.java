package com.itheima_04;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
    TCP接收数据的步骤
        1:创建服务器端的Socket对象(ServerSocket)
        2:获取输入流，读数据，并把数据显示在控制台
        3:释放资源
 */
public class ServerDemo {
    public static void main(String[] args) throws IOException {


        //1:创建服务器端的Socket对象(ServerSocket)

        ServerSocket server=new ServerSocket(8888);

        //2:获取输入流，读数据，并把数据显示在控制台

        Socket sock = server.accept();//连接流
        System.out.println(sock.getRemoteSocketAddress().toString());

        InputStream getMessage = sock.getInputStream();//建立流

        byte[]bytes=new byte[1024];

       int len= getMessage.read(bytes);

        System.out.println(new String(bytes,0,len));




        sock.close();

        server.close();


    }
}

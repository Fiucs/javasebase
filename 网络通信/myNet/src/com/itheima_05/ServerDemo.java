package com.itheima_05;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/*
    服务器：接收数据，给出反馈
 */
public class ServerDemo {
    public static void main(String[] args) throws IOException {
        //创建服务器端的Socket对象(ServerSocket)

        ServerSocket server=new ServerSocket(8888);

        //监听客户端连接，返回一个Socket对象
        Socket client=server.accept();

        InputStream bis = client.getInputStream();
        //获取输入流，读数据，并把数据显示在控制台
        byte[]byter=new byte[1024];
        int len = bis.read(byter);
        System.out.println("客户端说:"+new String(byter,0,len));

        //给出反馈

        OutputStream bos=client.getOutputStream();
        bos.write("已收到，准备断开，保重".getBytes());


        //释放资源
        bis.close();
        bos.close();
        client.close();
        server.close();
		
    }
}

package com.itheima_05;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/*
    客户端：发送数据，接收服务器反馈
 */
public class ClientDemo {
    public static void main(String[] args) throws IOException {
        //创建客户端的Socket对象(Socket)

        Socket client=new Socket("127.0.0.1",8888);
		
        //获取输出流，写数据

        OutputStream bos=client.getOutputStream();

        bos.write("前方危险，小心度过，收到请回答".getBytes());


        //接收服务器反馈
        InputStream is=client.getInputStream();
        byte[]bytes=new byte[1024];
        int len = is.read(bytes);
        System.out.println("服务器:"+new String(bytes,0,len));

        //释放资源
        bos.close();
        is.close();
        client.close();

    }
}

package com.itheima_02;

import java.io.IOException;
import java.net.*;

/*
    UDP发送数据的步骤
        1:创建发送端的Socket对象(DatagramSocket)
        2:创建数据，并把数据打包
        3:调用DatagramSocket对象的方法发送数据
        4:关闭发送端
 */
public class SendDemo {
    public static void main(String[] args) throws IOException {

        DatagramSocket socket=new DatagramSocket(8889, InetAddress.getByName("127.0.0.1"));
        byte []bytes="早上好啊！！！".getBytes();

         DatagramPacket data=new DatagramPacket(bytes,bytes.length,InetAddress.getByName("127.0.0.1"),8888);

         socket.send(data);

         socket.close();
        while (true);

    }
}

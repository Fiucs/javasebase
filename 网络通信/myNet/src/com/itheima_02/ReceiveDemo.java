package com.itheima_02;

import java.io.IOException;
import java.net.*;

/*
    UDP接收数据的步骤
        1:创建接收端的Socket对象(DatagramSocket)
        2:创建一个数据包，用于接收数据
        3:调用DatagramSocket对象的方法接收数据
        4:解析数据包，并把数据在控制台显示
        5:关闭接收端
 */
public class ReceiveDemo {
    public static void main(String[] args) throws IOException {

       // 1:创建接收端的Socket对象(DatagramSocket)


        DatagramSocket socket=new DatagramSocket(8888,InetAddress.getByName("127.0.0.1"));


        //2:创建一个数据包，用于接收数据


        byte []bytes = new byte[1024];

        DatagramPacket data=new DatagramPacket(bytes,bytes.length);

        socket.receive(data);
        socket.close();
        System.out.println(new String(bytes,0,data.getLength()));

        while (true);
    }
}

package com.itheima_03;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketAddress;

/*
    UDP接收数据：
        因为接收端不知道发送端什么时候停止发送，故采用死循环接收
 */
public class ReceiveDemo {
    public static void main(String[] args) throws IOException {
        //创建接收端的Socket对象(DatagramSocket)
        DatagramSocket socket=new DatagramSocket(8888);
		
        //创建一个数据包，用于接收数据
        byte[]bytes=new byte[1024];

        //调用DatagramSocket对象的方法接收数据
        while (true) {
            DatagramPacket data = new DatagramPacket(bytes, bytes.length);


            socket.receive(data);
            String s=new String(bytes, 0, data.getLength());
            if (s.equals("886"))
                break;
            System.out.println(s);

            SocketAddress address = data.getSocketAddress(); //发送短地址
            DatagramPacket da=new DatagramPacket("sadasdasd".getBytes(),"sadasdasd".getBytes().length,address);

            socket.send(da);

        }


			
        //解析数据包，并把数据在控制台显示
        socket.close();

        //关闭接收端
		
    }
}

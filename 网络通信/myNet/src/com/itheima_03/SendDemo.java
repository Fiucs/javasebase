package com.itheima_03;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

/*
    UDP发送数据：
        数据来自于键盘录入，直到输入的数据是886，发送数据结束
 */
public class SendDemo {
    public static void main(String[] args) throws IOException {
        //创建发送端的Socket对象(DatagramSocket)

        DatagramSocket socke=new DatagramSocket();///绑定 随机 可用端口

        //创建数据，并把数据打包
        Scanner s=new Scanner(System.in);
        String str;
        byte [] bytes=new byte[1024];
        DatagramPacket data=new DatagramPacket(bytes,bytes.length, InetAddress.getByName("127.0.0.1"),8888);

        byte [] b2=new byte[1024];
        DatagramPacket d2=new DatagramPacket(b2,b2.length);
        while (!(str=s.nextLine()).equals("886")){
            data.setData(str.getBytes());
            socke.send(data);

            socke.receive(d2);
            System.out.println(new String(b2,0,d2.getLength()));

        }

        data.setData(str.getBytes());
        socke.send(data);

        socke.close();



        //调用DatagramSocket对象的方法发送数据

		
        //关闭发送端

    }
}

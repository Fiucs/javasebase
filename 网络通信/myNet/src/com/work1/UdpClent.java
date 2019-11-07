package com.work1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;
import java.util.Arrays;

public class UdpClent {

    public static void main(String[] args) throws IOException {

        DatagramSocket socket=new DatagramSocket();
        //发送
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));//从键盘读取

        byte[]bytes=new byte[1024];
        DatagramPacket datas = new DatagramPacket(bytes, bytes.length, InetAddress.getByName("127.0.0.1"),8888);//fa

        byte[]byter=new byte[1024];
        DatagramPacket datar = new DatagramPacket(byter, byter.length);//fa




        while (true) {

            Arrays.fill(bytes,(byte)0);
            System.out.print("请输入一个数：");
            String s = br.readLine();
            datas.setData(s.getBytes());
            socket.send(datas);//发送了

            //接受
            Arrays.fill(byter,(byte)0);
            socket.receive(datar);

            System.out.println(new String(byter,0,datar.getLength()));



        }


    }


}

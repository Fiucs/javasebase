package com.work1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketAddress;

public class UdpServer {


    public static void main(String[] args) throws IOException {
    //接受
        DatagramSocket sock=new DatagramSocket(8888, InetAddress.getByName("127.0.0.1"));//绑定本地端口

        byte []byter=new byte[1024];
        byte []bytes=new byte[1024];
        DatagramPacket datar=new DatagramPacket(byter,byter.length);//接受
        boolean b;//true 是水仙花
        DatagramPacket datas=new DatagramPacket(bytes,bytes.length);//发送

        while (true) {

            sock.receive(datar);
            String s=new String(byter,0,datar.getLength());//得到数字
            System.out.println(datar.getSocketAddress());
            SocketAddress sa = datar.getSocketAddress();//获取 ip+端口
            datas.setSocketAddress(sa);//设置ip +端口

             if(checkIsShuixianhua(s))
             {
                 //是
                 String st=s+" "+"是水仙花数";
                 datas.setData(st.getBytes());

                 sock.send(datas);
             }
             else {

                 String st=s+" "+"不是水仙花数";
                 datas.setData(st.getBytes());
                 sock.send(datas);
             }



        }




    }

    public static boolean checkIsShuixianhua(String s) {

        int num=Integer.parseInt(s);//得到原数字
        int sum=0;
        String[] split = s.split("");

        for (String s1 : split) {
            int temp=Integer.parseInt(s1);//得到每位数

            sum+=(int)Math.pow(temp,split.length);

        }
        return sum == num;


    }



}

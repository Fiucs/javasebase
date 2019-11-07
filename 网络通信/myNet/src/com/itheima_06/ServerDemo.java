package com.itheima_06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/*
    服务器：接收到的数据在控制台输出
 */
public class ServerDemo {
    public static void main(String[] args) throws IOException {

        ServerSocket server=new ServerSocket(8888);


        Socket client = server.accept();
        BufferedReader br=new BufferedReader(new InputStreamReader(client.getInputStream()));
        String s;

        while ((s=br.readLine())!=null)
        {
            System.out.println(s);

        }
        client.close();
        server.close();


    }
}

package com.work2;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {


    public static void main(String[] args) throws IOException {

        ServerSocket server=new ServerSocket(8888);
        OperatData op = new OperatData();

        while (true) {

            Socket s = server.accept();//获取一个连接流
            op.setLists(s);
            System.out.println(op.getLists());

            SerReceiv serReceiv = new SerReceiv(s,op);
          //  SerSend  serSend=new SerSend(s,op);

            new Thread(serReceiv,"线程1").start();//创建一个 接受线程

           // new Thread(serSend,"线程2").start();//创建一个 发送线程


        }

    }
}

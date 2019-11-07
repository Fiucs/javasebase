package com.work2;

import java.awt.event.KeyAdapter;
import java.io.*;
import java.net.Socket;

public class Client extends KeyAdapter {


    public static void main(String[] args) throws IOException {

        //1.
        Socket socket=new Socket("127.0.0.1",8888);
        System.out.println(socket);
       // new Thread(new sendMesgage(socket),"发送线程").start();//发送线程
        new Thread(new receieveMsg(socket),"接受线程").start();//接受线程
        //

        BufferedWriter bw;
        BufferedReader br;//读取键盘
        bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));//写流
        br = new BufferedReader(new InputStreamReader(System.in));//键盘


        String str;
        while((str=br.readLine())!=null)
        {

            bw.write(str);
            bw.newLine();
            bw.flush();
        }



    }
}

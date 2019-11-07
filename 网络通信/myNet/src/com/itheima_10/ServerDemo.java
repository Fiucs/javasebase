package com.itheima_10;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/*
    服务器：接收到的数据写入文本文件，给出反馈，代码用线程进行封装，为每一个客户端开启一个线程
 */
public class ServerDemo {
    public static void main(String[] args) throws IOException {

        //1.
        ServerSocket server=new ServerSocket(10000);//服务端

        while (true) {

                Socket socket = server.accept();//创建套接字 在线程中解决

                new Thread(){
                    @Override
                    public void run() {
                        try {
                            BufferedReader br=new BufferedReader(new InputStreamReader(socket.getInputStream()));//读流
                            int count=0;
                            File file=new File("网络通信\\myNet\\src\\com\\itheima_10\\myNet.iml");

                            while (file.exists())
                            {

                                file=new File("网络通信\\myNet\\src\\com\\itheima_10\\myNet"+count+".iml");
                                count++;
                            }
                            BufferedWriter bw=new BufferedWriter(new FileWriter(file));//写流

                            String s;
                            while ((s=br.readLine())!=null){

                                bw.write(s);
                                bw.newLine();
                                bw.flush();

                            }

                            //反馈给客户端

                            BufferedWriter bwc=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
                            bwc.write("文件上传成功");
                            bwc.newLine();
                            bwc.flush();

                            bwc.close();
                            socket.close();


                        } catch (IOException e) {
                            e.printStackTrace();
                        }


                    }
                }.start();


        }

    }
}

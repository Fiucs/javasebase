package com.itheima_06;

import java.io.*;
import java.net.Socket;

/*
    客户端：数据来自于键盘录入，直到输入的数据是886，发送数据结束
 */
public class ClientDemo {
    public static void main(String[] args) throws IOException {

        Socket socket=new Socket("127.0.0.1",8888);//构造时连接

        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));//包装 输出流

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));



        String s;
        while ((s=br.readLine())!=null){
            System.out.println(s);
            if(s.equals("886"))
                break;
            bw.write(s);//注意readline以'\n'为分隔符 所欲需要在末尾添加 '\n'
            bw.newLine();
            bw.flush();

        }

        socket.close();


    }
}

package com.itheima_04;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/*
    TCP发送数据的步骤
        1:创建客户端的Socket对象(Socket)
        2:获取输出流，写数据
        3:释放资源
 */
public class ClientDemo {
    public static void main(String[] args) throws IOException {


        //1:创建客户端的Socket对象(Socket)
        //构造时尝试连接
        Socket socket=new Socket("127.0.0.1",8888);


        //        2:获取输出流，写数据
        OutputStream os = socket.getOutputStream();

        os.write("你好653351号".getBytes());
//        3:释放资源
        socket.close();

    }
}

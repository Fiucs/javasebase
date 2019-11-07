package com.work2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class receieveMsg  implements Runnable {
    private Socket s;

    public receieveMsg(Socket socket) {
        this.s=socket;

    }

    @Override
    public void run() {
        BufferedReader br=null;
        String str;

        try {
            br=new BufferedReader(new InputStreamReader(s.getInputStream()));


                while ((str = br.readLine()) != null)
                    synchronized (this) {
                    System.out.println("服务器：" + str);
                    }


            //不断读取
        } catch (IOException e) {
            e.printStackTrace();
        }






    }
}

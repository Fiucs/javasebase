package com.work2;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class SerSend implements Runnable{

    private OperatData op;
    private Socket s;

    public SerSend( Socket s,OperatData op) {
        this.op = op;
        this.s = s;
    }

    @Override
    public void run() {
       // Socket s, BufferedWriter bw
        while (true) {
            try {

                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
                this.op.sendMsg(this.s, bw);//调用send函数

            } catch (IOException e) {
                e.printStackTrace();
            }


        }

    }




}

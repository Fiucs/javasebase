package com.work2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class SerReceiv implements Runnable {

    private OperatData op;
    private Socket s;

    public SerReceiv(Socket socket,OperatData ope) {
        this.s=socket;
        this.op=ope;
    }

    @Override
    public void run() {

        BufferedReader br;
    while (true) {
        try {
            br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            op.readMsg(s, br);

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    }





}

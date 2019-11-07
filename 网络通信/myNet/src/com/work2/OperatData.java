package com.work2;

import java.io.*;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class OperatData {
    private String commonMsg="-1";//公共存数据
    private String socketFlag="-1";//ip+port 标识
    private  boolean flag=false;// sendMsg wait
    private List<Socket> lists=new ArrayList<>();

   // private Socket s;//套接字


    public void setLists(Socket socket) {
        this.lists.add(socket);
    }

    public OperatData(){
        // this.s=socket;
    }


    //写操作
    public synchronized void sendMsg(Socket s, BufferedWriter bw){

  /*      if(!flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }*/
        String ipport=s.getRemoteSocketAddress().toString();

        if(!(ipport.equals(socketFlag) && commonMsg.equals("-1") && socketFlag.equals("-1")))
        {

            try {
                System.out.println(commonMsg);

                bw.write(socketFlag+"端:"+commonMsg);
                bw.newLine();
                bw.flush();

                try {
                    Thread.sleep(800);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }



    }


    public List<Socket> getLists() {
        return lists;
    }

    //读操作
    public  void readMsg(Socket s,BufferedReader br){

        String str;

        try {

            if((str=br.readLine())==null)
                return;
            //notifyAll();
           // flag=true;
            //this.commonMsg=str;
            //this.socketFlag=s.getRemoteSocketAddress().toString();
            System.out.println("read:"+str+"sock:"+s.getRemoteSocketAddress().toString());

            for (Socket list : lists) {
                if (!list.getRemoteSocketAddress().toString().equals(s.getRemoteSocketAddress().toString())) {
                    BufferedWriter b1 = new BufferedWriter(new OutputStreamWriter(list.getOutputStream()));

                    b1.write(str);
                    b1.newLine();
                    b1.flush();

                }

            }

        } catch (IOException e) {
            e.printStackTrace();
        }


    }


}

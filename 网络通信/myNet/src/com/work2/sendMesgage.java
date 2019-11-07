package com.work2;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.*;
import java.net.Socket;

public class sendMesgage extends KeyAdapter implements Runnable{

    private Socket s;
    private boolean flag=false;

    private JPasswordField jp=new JPasswordField(20);


    public sendMesgage(Socket socket) {

        this.s=socket;
    }


  /*  @Override
    public void keyPressed(KeyEvent e1) {
        System.out.println("输入请按kongge：");

        if(e1.getKeyCode()==KeyEvent.VK_SPACE)
        {

            BufferedWriter bw;
            BufferedReader br;//读取键盘
            BufferedReader br1;
            try {

                bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));//写流
                br = new BufferedReader(new InputStreamReader(System.in));//键盘


                String str;


                while (true) {

                   // System.out.println("输入请按enter：");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    str = br.readLine();
                    if (str.equals("886"))
                        break;

                    bw.write(str);
                    bw.newLine();
                    bw.flush();


                }

                s.close();



            } catch(IOException e){
                e.printStackTrace();
            }


        }




    }*/





    @Override
    public void run() {
        //发送

      //  System.out.println("输入请按enter：");


        BufferedWriter bw;
        BufferedReader br;//读取键盘
        BufferedReader br1;
        try {

            bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));//写流
            br = new BufferedReader(new InputStreamReader(System.in));//键盘


            String str;


                while (true) {


                        System.out.println("输入：");

                        str = br.readLine();
                    System.out.println(1);
                        if (str.equals("886"))
                            break;
                        bw.write(str);
                    System.out.println(2);
                       // bw.newLine();
                        bw.flush();
                    System.out.println(3);


            }

                s.close();



            } catch(IOException e){
                e.printStackTrace();
            }



    }
}

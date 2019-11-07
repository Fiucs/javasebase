package com.itheima_01;

public class MyThread extends Thread {


    public void run(){

        for (int i = 0; i < 100; i++) {
            System.out.println(i);

        }

    }

}

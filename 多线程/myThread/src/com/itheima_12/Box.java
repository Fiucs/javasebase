package com.itheima_12;

public class Box {
    private int milk;

    private boolean state=false;//true 代表奶箱有奶 false 代表没有

    public  synchronized void put(int milk){

        if(state)
        {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        this.milk=milk;
        System.out.println("送奶工人送第"+this.milk+"瓶奶");
        state=true;
        notifyAll();

    }

    public synchronized void get(){

        if(!state)
        {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("我拿到第"+this.milk+"瓶奶");

        state=false;
        notifyAll();


    }


}

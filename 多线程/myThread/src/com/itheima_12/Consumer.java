package com.itheima_12;

public class Consumer implements Runnable {

    private  Box b;

    public Consumer(Box b) {
        this.b = b;
    }

    public void getMilk(){

        while (true) {
            b.get();

         }
    }

    @Override
    public void run() {

        getMilk();

    }
}

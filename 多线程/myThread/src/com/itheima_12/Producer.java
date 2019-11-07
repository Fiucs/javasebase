package com.itheima_12;

public class Producer implements Runnable {

    private Box b;

    public Producer(Box b) {
        this.b = b;
    }

    public void produce(){

        for (int i = 1; i <=10 ; i++) {
            b.put(i);
        }
    }


    @Override
    public void run() {
        produce();

    }
}

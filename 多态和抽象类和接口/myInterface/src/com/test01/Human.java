package com.test01;

public class Human implements Speak,Run {

    @Override
    public void speak() {
        System.out.println("我说人话");
    }

    @Override
    public void run() {
        System.out.println("人跑得很快");
    }
}

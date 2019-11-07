package com.test01;

public class Parrot implements Fly,Speak {
    @Override
    public void fly() {
        System.out.println("我是鹦鹉，我爱飞翔");
    }

    @Override
    public void speak() {
        System.out.println("我是鹦鹉，我爱说话");
    }
}

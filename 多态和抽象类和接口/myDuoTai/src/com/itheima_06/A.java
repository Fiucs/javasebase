package com.itheima_06;

public class A extends Dog{
    public A() {
    }

    public A(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("我是Animald的孙子，Dog的儿子");
    }
    public void print(){

        System.out.println("我是AAAAAAAAAAAAA");
    }
}

package com.itheima_03;

/*
    抽象类
 */
public abstract class Animal {

    private int age = 20;
    private final String city = "北京";

    public Animal() {}//构造方法  用于子类访问抽象类时 初始化数据

    public Animal(int age) {
        this.age = age;
    }//


    public void show() {
        age = 40;
        System.out.println(age);
//        city = "上海";
        System.out.println(city);
    }

    public abstract void eat();

}

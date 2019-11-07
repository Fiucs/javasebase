package com.itheima_02;

public interface Inter {
    public int num = 10;
    public final int num2 = 20;
//    public static final int num3 = 30;
    int num3 = 30;

//    public Inter() {}

//    public void show() {}

    public abstract void method();//接口里的非静态成员方法都是抽象的
    void show();//
    public static void method1(){//静态方法是老大，，，，

        System.out.println("我是Inter里的静态方法");

    }

}

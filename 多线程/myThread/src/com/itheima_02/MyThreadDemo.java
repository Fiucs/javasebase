package com.itheima_02;

/*
    Thread类中获取和设置线程名称的方法
        void setName(String name)：将此线程的名称更改为等于参数 name
        String getName()：返回此线程的名称
 */
public class MyThreadDemo {
    public static void main(String[] args) {
        MyThread my1 = new MyThread();
        //MyThread my2 = new MyThread();
        MyThread my2 = new MyThread("阿尔法");


        my1.setName("贝塔");
        //my2.setName("舒克");

        my1.start();
		my2.start();
		System.out.println(my1.getName());

    }
}

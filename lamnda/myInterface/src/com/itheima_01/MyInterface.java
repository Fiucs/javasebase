package com.itheima_01;

public interface MyInterface
{
    public void show1();
     void show2();
    default void show3()//可用于更新
    {

        System.out.println("sho23");

    }

}

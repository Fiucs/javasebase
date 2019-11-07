package com.itheima_07;

public interface Inter {
    void show();

    public default void show3(){

        System.out.println("show3");//默认方法
    }
}

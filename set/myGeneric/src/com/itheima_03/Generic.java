package com.itheima_03;

public class Generic {
/*    public void show(String s) {
        System.out.println(s);
    }

    public void show(Integer i) {
        System.out.println(i);
    }

    public void show(Boolean b) {
        System.out.println(b);
    }
    */
    //截下来 泛型方法

    public <T> void show(T t){

        System.out.println(t);
    }




}
package com.itheima_01;

import java.util.ArrayList;
import java.util.Collection;

/*
    创建Collection集合的对象
        多态的方式
        ArrayList()
 */
public class CollectionDemo01 {
    public static void main(String[] args) {

        Collection <String>c=new ArrayList<String>();

        System.out.println(c.size());
        c.add("Hello");
        c.add("World");
        System.out.println(c);


    }
}
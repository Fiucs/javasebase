package com.itheima_06;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/*
    练习1：我有一个ArrayList<Integer>集合，现在我想在这个集合中添加一个字符串数据，如何实现？
 */
public class ReflectTest01 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        ArrayList<Integer> list=new ArrayList<>();
        /*list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

*/
       // list.add("asd");
        //得到类
        Class<? extends ArrayList> aClass = list.getClass();
        System.out.println(aClass);


        Method add = aClass.getDeclaredMethod("add", Object.class);//泛型的父类为 Object

        add.invoke(list,"abc");

        System.out.println(list);

    }
}

package com.itheima_03;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/*
    通过反射实现如下的操作：
        Student s = new Student("林青霞",30,"西安");
        System.out.println(s);
 */
public class ReflectDemo02 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> sc = Class.forName("com.itheima_02.Student");

        Constructor<?> dr = sc.getDeclaredConstructor(String.class, int.class, String.class);

        Object o = dr.newInstance("来来来",55,"下啊");

        System.out.println(o);
       // System.out.println(int.class+"::::"+Integer.class);
        //int::::class java.lang.Integer

    }
}

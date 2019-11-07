package com.itheima_05;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/*
     练习：通过反射实现如下操作
        Student s = new Student();
        s.method1();
        s.method2("林青霞");
        String ss = s.method3("林青霞",30);
        System.out.println(ss);
        s.function();
 */
public class ReflectDemo02 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        Class<?> aClass = Class.forName("com.itheima_02.Student");
        Constructor<?> dscp = aClass.getDeclaredConstructor();
        Object o = dscp.newInstance();

        Method method1 = aClass.getDeclaredMethod("method1");
        method1.invoke(o);


        Method method2 = aClass.getDeclaredMethod("method2", String.class);
        method2.invoke(o,"六么没");


        Method method3 = aClass.getDeclaredMethod("method3", String.class, int.class);
        Object wwe = method3.invoke(o, "WWE", 10);
        System.out.println(wwe);

        Method function = aClass.getDeclaredMethod("function");
        function.setAccessible(true);
        function.invoke(o);



    }
}

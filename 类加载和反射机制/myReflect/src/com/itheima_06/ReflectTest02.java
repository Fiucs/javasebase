package com.itheima_06;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/*
    练习2：通过反射运行配置文件中指定类的指定方法
 */
public class ReflectTest02 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        Properties pro = new Properties();
            //"类加载和反射机制\\myReflect\\class.txt"
        pro.load(new FileReader("类加载和反射机制\\myReflect\\class.txt"));

        String className1 = pro.getProperty("className1");//主要操作 map键值对
        String methodName1 = pro.getProperty("methodName1");

        Class<?> aClass = Class.forName(className1);
        Constructor<?> constructor = aClass.getConstructor();

        Object o = constructor.newInstance();
        Method method = aClass.getDeclaredMethod(methodName1);

        method.invoke(o);


    }
}

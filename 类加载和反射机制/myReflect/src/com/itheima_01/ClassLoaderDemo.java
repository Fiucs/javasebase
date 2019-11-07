package com.itheima_01;

import com.itheima_02.ReflectDemo;
import com.sun.jdi.Bootstrap;

/*
    ClassLoader 中的两个方法
        static ClassLoader getSystemClassLoader​()：返回用于委派的系统类加载器
        ClassLoader getParent​()：返回父类加载器进行委派
 */

        //Bootstrap class loader所有的父类
        //Platformclass loader 平台类加载器可以看到所有平台类
        // System class loader：它也被称为应用程序类加载器
public class ClassLoaderDemo {
    public static void main(String[] args) {

        ClassLoader pcl = ClassLoader.getPlatformClassLoader();



        System.out.println(pcl);

        System.out.println(pcl.getName()+" "+pcl.getParent());




    }
}

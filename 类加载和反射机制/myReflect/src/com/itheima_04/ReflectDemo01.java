package com.itheima_04;

import java.lang.reflect.Field;

/*
    反射获取成员变量并使用
 */
public class ReflectDemo01 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {

        Class<?> aClass = Class.forName("com.itheima_02.Student");

        System.out.println("/返回所有公共成员变量对象的数组");
        Field[] fields = aClass.getFields();//getFields()//返回所有公共成员变量对象的数组
        for (Field field : fields) {
            System.out.println(field);
        }

        System.out.println("getDeclaredFields()返回所有成员变量对象的数组");
        Field[] declaredFields = aClass.getDeclaredFields();//getDeclaredFields()返回所有成员变量对象的数组
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);

        }

        System.out.println("Field getField(String name) | 返回单个公共成员变量对象 ");

        Field address = aClass.getField("address");
        System.out.println(address);
        System.out.println("| Field getDeclaredField(String name) | 返回单个成员变量对象           |");

        Field age = aClass.getDeclaredField("age");//age为protected权限
        System.out.println(age);



    }
}

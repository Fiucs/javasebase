package com.itheima_03;

import com.itheima_02.Student;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/*
    通过反射实现如下的操作：
        Student s = new Student("林青霞");
        System.out.println(s);
 */
public class ReflectDemo03 {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<Student> sc = Student.class;
        //获取 类私有构造方法
        Constructor<Student> cspn = sc.getDeclaredConstructor(String.class);
        //jvm 进行了检查
//Exception in thread "main" java.lang.IllegalAccessException:
// class com.itheima_03.ReflectDemo03
// cannot access a member of class com.itheima_02.Student with modifiers "private"
        cspn.setAccessible(true);//暴力反射  jvm不检测 成员的权限
        Student s = cspn.newInstance("当当当");

        System.out.println(s);

    }
}

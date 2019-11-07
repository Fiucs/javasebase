package com.itheima_03;

import com.itheima_02.Student;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/*
    反射获取构造方法并使用
    public
    private
    protected
 */
public class ReflectDemo01 {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<Student> sc = Student.class;

        Constructor<?>[] c1 = sc.getConstructors();//公共构造方法对象的数组
        for (Constructor<?> constructor : c1) {
            System.out.println(constructor);
        }

        Constructor<Student> dc = sc.getDeclaredConstructor();//根据字段获取类的构造对象 这里是无参数
        System.out.println(dc);


        Constructor<?>[] c2 = sc.getDeclaredConstructors();//所有公共构造方法对象的数组
       //System.out.println(c2);
        System.out.println("----------------------");
        for (Constructor<?> constructor : c2) {
            System.out.println(constructor);
        }
        Constructor<Student> csw = sc.getConstructor();//无参 公共构造方法对象

        //Constructor 的 newInstace 反射机制创建对象
        Student student = csw.newInstance();


    }
}

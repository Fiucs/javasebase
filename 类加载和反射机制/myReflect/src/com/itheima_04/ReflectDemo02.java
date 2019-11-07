package com.itheima_04;

import com.itheima_02.Student;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/*
    练习：通过反射实现如下操作
        Student s = new Student();
        s.name = "林青霞";
        s.age = 30;
        s.address = "西安";
        System.out.println(s);
 */
public class ReflectDemo02 {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {

        //Filed 类下  void set(Object obj,Object value) | 给obj对象的成员变量赋值为value |

        //1.获取类对象
        //2.获取类构造方法对象(有参或无参)
        //3.反射 创建实例


        //4.set 设置值
            //4.1获取字段
            //4.2 设置是否检查 变量权限
            //4.3 seet 设置值

        Class<Student> sc = Student.class;
        Constructor<Student> csp = sc.getDeclaredConstructor();
        Student student = csp.newInstance();//t通过构造对象 来 创建实例

        //4.set 设置值
        //4.1获取字段 属性
        Field fname = sc.getDeclaredField("name");
        //4.2 设置是否检查 变量权限
           //
        fname.setAccessible(true);
        System.out.println(fname.get(student)+"属性名："+fname.getName());

            fname.set(student,"天天快递");
        System.out.println(student);
            //
        Field fage = sc.getDeclaredField("age");
        fage.setAccessible(true);
        fage.set(student,10);
        System.out.println(student);
            //
        Field faddress = sc.getDeclaredField("address");
        faddress.setAccessible(true);
        faddress.set(student,"极大规模集成电路");
        System.out.println(student);


        //4.3 seet 设置值



    }
}
//Student{name='天天快递', age=0, address='null'}
//Student{name='天天快递', age=10, address='null'}
//Student{name='天天快递', age=10, address='极大规模集成电路'}
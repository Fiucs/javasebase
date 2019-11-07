package com.itheima_05;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/*
    反射获取成员方法并使用
 */
public class ReflectDemo01 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {

    ///Method[] getMethods() 返回一个包含 方法对象的数组
   //Method[] getDeclaredMethods()          | 返回所有成员方法对象的数组，不包括继承的
   //  | Method getMethod(String name, Class<?>... parameterTypes)    | 返回单个公共成员方法对象                   |
  //  | Method getDeclaredMethod(String name, Class<?>... parameterTypes) | 返回单个成员方法对象

        Class<?> aClass = Class.forName("com.itheima_02.Student");


        Method[] methodspb = aClass.getMethods();//返回所有公共成员方法对象的数组，包括继承的


        Method[] methodspr = aClass.getDeclaredMethods();//所有成员方法 不包括继承


        Method method1 = aClass.getMethod("method1");//公共 method 对象

        Method function = aClass.getDeclaredMethod("function");//私有 method 对象
        //注意设置检查
//cannot access a member of class com.itheima_02.Student with modifiers "private"
        Constructor<?> cstr = aClass.getDeclaredConstructor();
        Object o = cstr.newInstance();

        method1.invoke(o);//结果
        //public void method1() {
        //        System.out.println("method");
        //    }


        function.setAccessible(true);
        function.invoke(o);//function无参

        Method method3 = aClass.getDeclaredMethod("method3",String.class,int.class);//注意带参方法要 给参数类型
        method3.setAccessible(true);
        System.out.println(method3.invoke(o,"wo",8));


    }
}

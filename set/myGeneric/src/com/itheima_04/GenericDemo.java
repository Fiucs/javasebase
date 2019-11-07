package com.itheima_04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
    测试类
 */
public class GenericDemo {
    public static void main(String[] args) {


        //集合中的 泛型不存在继承关系  （Object 与 String）

        //
        List<String>list=new ArrayList<String>();

        List<?>list1=null;//无边界 通配符 对list不能直接add
        //List<?>list1=new AarrayList<>();//对list不能直接add

        list.add("asdasd");
        //list1.add(null);

        list1=list;//list1 指向 list
        System.out.println(list1);

        List<? extends Number>list3=new ArrayList<Integer>();
        //list3.add(33);
        //带通配符的 泛型 不能直接往里面添加元素


        list.add("你好");
        list.add("我好");
        list.add("大家好");

        //一般用于 匹配读的类型
        prints(list);

        List<Character>lis4=new ArrayList<Character>();
        lis4.add('a');
        lis4.add('b');
        lis4.add('c');
        prints(lis4);
        print(lis4);


    }

    public static  void  prints(List<? extends Object > list){

//static 方法里不能声明泛型
        //try catch 中不能使用泛型
        for (Object o : list) {
            System.out.println(o);
        }

    }
    public static <T>  void  print(T t) {

        System.out.println(t);


    }
}

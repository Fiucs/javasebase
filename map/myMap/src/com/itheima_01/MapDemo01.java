package com.itheima_01;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


/*
    Map集合概述
        Interface Map<K,V>	K：键的类型；V：值的类型
        将键映射到值的对象；不能包含重复的键；每个键可以映射到最多一个值
        举例：学生的学号和姓名
              itheima001	林青霞
              itheima002	张曼玉
              itheima003	王祖贤

    创建Map集合的对象
        多态的方式
        具体的实现类HashMap
 */
public class MapDemo01 {
    public static void main(String[] args) {
        Map<String,String> mapMap=new HashMap<String, String>();

        mapMap.put("1","临清下");//去重
        mapMap.put("1","下");
        //mapMap.put("1","临清"); 键相同时 最后一次的 put的值会覆盖前面的值



        Set<String> set = mapMap.keySet();//键找值
        for (String s : set) {
            String value=mapMap.get(s);
            System.out.println(s+" "+value);
        }

        System.out.println("---------------------");


        mapMap.put("阿三打","abc");
        mapMap.put("3","临清下");
        mapMap.put("2","下");
        for (String s : set) {
            String value=mapMap.get(s);
            System.out.println(s+" "+value);
        }//从结果来看  默认按照键升序排序 字符串类型是这样的   comprable??

    }
}

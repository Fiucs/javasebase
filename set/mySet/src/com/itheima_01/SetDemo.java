package com.itheima_01;

import java.util.HashSet;
import java.util.Set;

/*
    Set集合特点
        不包含重复元素的集合
        没有带索引的方法，所以不能使用普通for循环遍历
 */
public class SetDemo {
    public static void main(String[] args) {


        Set <String> set= new HashSet<String>();

        set.add("a");
        set.add("bb");//不能确保有序
        set.add("c");
        set.add("d");

        for (String s : set) {
            System.out.println(s);

        }


    }
}

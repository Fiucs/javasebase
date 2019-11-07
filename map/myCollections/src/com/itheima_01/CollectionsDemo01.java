package com.itheima_01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
    Collections类的概述
        是针对集合操作的工具类

    Collections类的常用方法
        public static <T extends Comparable<? super T>> void sort​(List<T> list)：将指定的列表按升序排序
        public static void reverse​(List<?> list)：反转指定列表中元素的顺序
        public static void shuffle​(List<?> list)：使用默认的随机源随机排列指定的列表
 */
public class CollectionsDemo01 {
    public static void main(String[] args) {

        List<Integer> list=new ArrayList<>();


        list.add(100);
        list.add(90);
        list.add(80);
        list.add(70);
        list.add(10);
        list.add(111);
        list.add(5050);

        Collections.sort(list);//自然升序
        System.out.println(list);

        Collections.reverse(list);
        System.out.println(list);//list reverse

        Collections.shuffle(list);//默认源 乱序
        System.out.println(list);




        
    }
}

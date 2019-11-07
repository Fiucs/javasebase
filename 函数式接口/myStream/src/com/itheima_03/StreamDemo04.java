package com.itheima_03;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Stream;

/*
    Stream<T> sorted​()：返回由此流的元素组成的流，根据自然顺序排序
    Stream<T> sorted​(Comparator comparator)：返回由该流的元素组成的流，根据提供的Comparator进行排序
        Comparator接口中的方法	int compare​(T o1, T o2)
 */
public class StreamDemo04 {
    public static void main(String[] args) {
        //创建一个集合，存储多个字符串元素
        ArrayList<String> list = new ArrayList<String>();

        list.add("linqingxia");
        list.add("zhangmanyu");
        list.add("wangzuxian");
        list.add("liuyan");
        list.add("zhangmin");
        list.add("zhangwuji");

        //需求1：按照字母顺序把数据在控制台输出
        list.stream().sorted().forEach(s -> System.out.println(s));

       // list.stream().sorted((o1, o2) -> o1.compareTo(o2)).forEach(s -> System.out.println(s));
        //linqingxia
        //liuyan
        //wangzuxian
        //zhangmanyu
        //zhangmin
        //zhangwuji

        //需求2：按照字符串长度把数据在控制台输出

       // Stream<String> sorted = list.stream().sorted(Comparator.comparingInt(String::length).thenComparing(o -> o));

        Stream<String> sorted = list.stream().sorted((o1, o2) -> {
            int num1=o1.length()-o2.length();
            return num1==0?o1.compareTo(o2):num1;

        });
        System.out.println("//需求2：按照字符串长度把数据在控制台输出");
        sorted.forEach(s -> System.out.println(s));

    }
}

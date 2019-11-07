package com.itheima_03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.IntStream;

/*
    <R> Stream<R> map​(Function mapper)：返回由给定函数应用于此流的元素的结果组成的流
        Function接口中的方法		R apply​(T t)
    IntStream mapToInt​(ToIntFunction mapper)：返回一个IntStream其中包含将给定函数应用于此流的元素的结果
        IntStream：表示原始 int 流
        ToIntFunction接口中的方法	 int applyAsInt​(T value)
 */
public class StreamDemo05 {
    public static void main(String[] args) {
        //创建一个集合，存储多个字符串元素
        ArrayList<String> list = new ArrayList<String>();

        list.add("10");
        list.add("20");
        list.add("30");
        list.add("40");
        list.add("50");

        //需求：将集合中的字符串数据转换为整数之后在控制台输出
        //Function
        list.stream().map(s -> Integer.parseInt(s)).forEach(System.out::println);
        IntStream intStream = list.stream().mapToInt(Integer::parseInt);
        intStream.forEach(s-> System.out.println(s));
        HashMap<String,String>map=new HashMap<>();
        map.put("10","9.11");

        //Set<Map.Entry<String, String>> set = map.entrySet();

       // IntStream intStream1 = set.stream().mapToInt(Integer::parseInt, Double::parseDouble);


    }
}

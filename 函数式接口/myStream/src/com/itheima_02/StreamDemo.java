package com.itheima_02;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
    Stream流的常见生成方式
        1:Collection体系的集合可以使用默认方法stream​()生成流
            default Stream<E> stream​()
        2:Map体系的集合间接的生成流
        3:数组可以通过Stream接口的静态方法of​(T... values)生成流
 */
public class StreamDemo {
    public static void main(String[] args) {

        //collection的子类
        List<Character> list=new ArrayList<>();
        Stream<Character> streamc = list.stream();

        Set<String> sets=new TreeSet<>();

        Stream<String> stringStream=sets.stream();

        //Map 简介转换 为Stream()流

        Map<String,Integer> map=new HashMap<String, Integer>();

        //转key Stream

        Stream<String> streamkey=map.keySet().stream();

        //转 values Stream

        Stream<Integer> streamValue=map.values().stream();
        //转 键值对 stream
        Stream<Map.Entry<String,Integer>> streamkv=map.entrySet().stream();



        int [] a={1,2,3,4,5,6,7};
        String [] strings={"asd","阿三打","aaaaa","bbbbb"};
       // Stream<Integer> a1 = Stream.of(a);

        Stream<String> strings1 = Stream.of(strings);//方法1
        Stream<String> stream = Arrays.stream(strings);//方法2
        stream.forEach(s -> System.out.println(s));


        List<Integer> li = Arrays.stream(a).boxed().collect(Collectors.toList());
        Stream<int[]> a1 = Stream.of(a);//生成的时数组引用流
        Stream<Integer> li1 = Arrays.stream(a).boxed();//生成的数组流

        // System.out.println(a1);
        //Stream.of(a).filter()

        Stream.of(strings).forEach(s -> System.out.println(s));

      //  Stream<Integer> a2=Stream.of(1,2,3,4,5,6);

      //  a2.forEach(i-> System.out.println(i));


    }
}

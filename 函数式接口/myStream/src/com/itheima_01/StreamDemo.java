package com.itheima_01;

import java.util.ArrayList;

/*
    需求：按照下面的要求完成集合的创建和遍历
        1:创建一个集合，存储多个字符串元素
        2:把集合中所有以"张"开头的元素存储到一个新的集合
        3:把"张"开头的集合中的长度为3的元素存储到一个新的集合
        4:遍历上一步得到的集合
 */
public class StreamDemo {
    public static void main(String[] args) {
        //创建一个集合，存储多个字符串元素
        ArrayList<String> list = new ArrayList<String>();
        //1.0
        list.add("林青霞");
        list.add("张曼玉");
        list.add("王祖贤");
        list.add("柳岩");
        list.add("张敏");
        list.add("张无忌");

        //2.0
        ArrayList<String> list1=new ArrayList<>();

        for (String s : list) {

           if(s.contains("张"))
               list1.add(s);

        }

        //3:把"张"开头的集合中的长度为3的元素存储到一个新的集合
        ArrayList<String>list2 = new ArrayList<>();

        for (String s : list1) {
            if (s.length()==3)
                list2.add(s);
        }

        // 4:遍历上一步得到的集合

        for (String s : list2) {
            System.out.println(s);
        }

//stream流方式

        System.out.println("------------------------------");
        list.stream().filter(s -> s.startsWith("张")).filter(s -> s.length()==3).forEach(s -> System.out.println(s));
        //stram不是list的方法




    }

}

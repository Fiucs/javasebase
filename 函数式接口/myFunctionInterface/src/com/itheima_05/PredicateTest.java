package com.itheima_05;

import java.util.ArrayList;
import java.util.function.Predicate;

/*
    String[] strArray = {"林青霞,30", "柳岩,34", "张曼玉,35", "貂蝉,31", "王祖贤,33"};
    字符串数组中有多条信息，请通过Predicate接口的拼装将符合要求的字符串 筛选到集合 ArrayList中，并遍历ArrayList集合
    要求：同时满足如下要求
        1:姓名长度大于2
        2:年龄大于33
    分析:
        1:有两个判断条件,所以需要使用两个Predicate接口,对条件进行判断
        2:必须同时满足两个条件,所以可以使用and方法连接两个判断条件
 */
public class PredicateTest {
    public static void main(String[] args) {
        String[] strArray = {"林青霞,30", "柳岩,34", "张曼玉,35", "貂蝉,31", "王祖贤,33"};

       ArrayList<String> list= method(strArray,s -> s.split(",")[0].length()>2 && Integer.parseInt(s.split(",")[1])>30);
        System.out.println(list);

       list.clear();
       list=method(strArray,s -> s.split(",")[0].length()>2,s -> Integer.parseInt(s.split(",")[1])>30);
        System.out.println(list);


    }
    private static ArrayList<String> method(String []str,Predicate<String> pre){

        ArrayList<String> list=new ArrayList<>();

        for (String s : str) {

            if(pre.test(s))
                list.add(s);
        }
        return list;

    }
    private static ArrayList<String> method(String []str,Predicate<String> pre1,Predicate<String> pre2){

        ArrayList<String> list =new ArrayList<>();

        for (String s : str) {
            if(pre1.and(pre2).test(s))
                list.add(s);
        }
        return list;


    }




}

package com.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class ContChar {
    //3、现给出以下字符串的“hello”、“wedu”、“lambda”、"functioninterface"、“basketball”、“haha”
    //要求设计方法完成将字符长度超过5（包含5个）的字符串统计出来

    public static void main(String[] args) {

        String []strArry={"hello","wedu","lambda","functioninterface","basketball","haha"};

        List<String> list=getSstr(strArry).get();
        System.out.println(list);

        List<String> list1=getSstr2(strArry,s -> s.length()>=5 );
        System.out.println(list1);

    }

    //1.supplier接口

    public static Supplier<List<String>> getSstr(String [] s){
        List<String> list=new ArrayList<String>();
        return ()->{
            for (String s1 : s) {
                    if (s1.length()>=5)
                        list.add(s1);

            }return list;

        };

    }

    public static List<String> getSstr2(String []s, Predicate<String> pre){

        List<String> list=new ArrayList<>();
        for (String s1 : s) {
            if(pre.test(s1))
                list.add(s1);
        }
        return list;


    }



}

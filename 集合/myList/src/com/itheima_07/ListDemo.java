package com.itheima_07;

import java.util.Iterator;
import java.util.LinkedList;

/*
    List集合常用子类：ArrayList，LinkedList
        ArrayList：底层数据结构是数组，查询快，增删慢
        LinkedList：底层数据结构是链表，查询慢，增删快

    练习：
        分别使用ArrayList和LinkedList完成存储字符串并遍历
 */
public class ListDemo {
    public static void main(String[] args) {


        LinkedList<String> lkist=new LinkedList<String>();

        lkist.add("hello");
        lkist.add("he");
        lkist.add("is");
        lkist.add("ok");

        Iterator <String> it=lkist.iterator();

        while( it.hasNext())
       {

           System.out.println(it.next());//遍历
       }
        System.out.println("--------------------");
        for (String s : lkist) {
            System.out.println(s);

        }



    }



}



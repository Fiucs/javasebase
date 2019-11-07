package com.itheima_04;

import java.util.LinkedHashSet;
import java.util.LinkedList;

/*
    LinkedHashSet集合特点
        1:哈希表和链表实现的Set接口，具有可预测的迭代次序
        2:由链表保证元素有序，也就是说元素的存储和取出顺序是一致的
        3:由哈希表保证元素唯一，也就是说没有重复的元素
 */
public class LinkedHashSetDemo {
    public static void main(String[] args) {

        LinkedHashSet <String> linkedHashSet=new LinkedHashSet<String>();


        linkedHashSet.add("lele");

        linkedHashSet.add("ko");
        linkedHashSet.add("detel");

        for (String s : linkedHashSet) {
            System.out.println(s);
        }

    }
}

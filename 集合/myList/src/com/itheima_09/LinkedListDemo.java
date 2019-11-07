package com.itheima_09;

import java.util.LinkedList;

/*
    LinkedList集合的特有功能：
        public void addFirst(E e)：在该列表开头插入指定的元素
        public void addLast(E e)：将指定的元素追加到此列表的末尾

        public E getFirst()：返回此列表中的第一个元素
        public E getLast()：返回此列表中的最后一个元素

        public E removeFirst()：从此列表中删除并返回第一个元素
        public E removeLast()：从此列表中删除并返回最后一个元素
 */
public class LinkedListDemo {
    public static void main(String[] args) {

        LinkedList<String> lkist=new LinkedList<String>();

        lkist.add("hello");
        lkist.add("he");
        lkist.add("is");
        lkist.add("ok");

        lkist.addFirst("2019");
        lkist.addLast("2020");
        System.out.println(lkist);

        System.out.println(lkist.getFirst());
        System.out.println(lkist.getLast());


    }
}

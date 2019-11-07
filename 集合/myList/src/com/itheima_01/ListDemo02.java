package com.itheima_01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
    List集合特有方法：
        void add(int index,E element)：在此集合中的指定位置插入指定的元素
        E remove(int index)：删除指定索引处的元素，返回被删除的元素
        E set(int index,E element)：修改指定索引处的元素，返回被修改的元素
        E get(int index)：返回指定索引处的元素
 */
public class ListDemo02 {
    public static void main(String[] args) {
        //创建集合对象
        List <String> list=new ArrayList<String>();


        //添加元素
        list.add("hello");
        list.add("world");
        list.add("java");
        list.add(1,"ddddd");
        list.remove(3);
        list.set(0,"hsk");


        //输出集合对象
        System.out.println(list);
        System.out.println(list.get(2));
        Iterator it=list.iterator();
        while (it.hasNext()){

            System.out.println(it.next());
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));

        }

    }
}

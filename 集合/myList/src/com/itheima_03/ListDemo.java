package com.itheima_03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/*
    需求：
        我有一个集合：List<String> list = new ArrayList<String>();
        里面有三个元素：list.add("hello");list.add("world");list.add("java");
        遍历集合，得到每一个元素，看有没有"world"这个元素，如果有，我就添加一个"javaee"元素，请写代码实现
 */
public class ListDemo {
    public static void main(String[] args) {
        //创建集合对象
        List<String> list = new ArrayList<String>();

        //添加元素
        list.add("hello");
        list.add("world");
        list.add("java");

        Iterator it=list.iterator();
/*
        while (it.hasNext()){

            String str=it.next().toString();//
            //modCound在add中++了    与exceptedcound在比较函数 check里未++ 所以抛出异常
            if(str.equals("java"))
                list.add("abcde");

        }
*/


/*
        for (int i = list.size()-1; i>=0; i++) {
            if(list.get(i).toString().equals("java"))//get方法未检查 上面两个值
                list.add("ABC的额");

        }*///倒叙遍历 不行
        for (int i = list.size()-1; i>=0; i--) {
            if(list.get(i).toString().equals("world"))//get方法未检查 上面两个值
            {
                list.add(i,"ABC的额");
                System.out.println(list.get(i));

            }
        }

        list.add(4,"ABC的额");
        System.out.println(list);



        
    }
}

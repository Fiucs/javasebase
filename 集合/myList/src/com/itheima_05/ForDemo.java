package com.itheima_05;

import java.util.ArrayList;
import java.util.List;

/*
    增强for：简化数组和Collection集合的遍历
        实现Iterable接口的类允许其对象成为增强型 for语句的目标
        它是JDK5之后出现的，其内部原理是一个Iterator迭代器

    格式：
        for(元素数据类型 变量名 : 数组或者Collection集合) {
            //在此处使用变量即可，该变量就是元素
        }
 */
public class ForDemo {
    public static void main(String[] args) {

        List<String> list=new ArrayList<String>();

        list.add("阿三打");
        list.add("擦啊啊");
        list.add("a阿斯顿撒");
        for (String s : list) {
            System.out.println(s);

        }

        
    }
}

package com.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.function.Supplier;

public class SupplierTest {
    //1、编程完成指定个数的随机整数，并放入集合
    //思路：
    //题目需求最终将产生的整数放入集合中，说明要求返回一个list集合对象,说明我们选择的函数式接口是有返回值的

    public static void main(String[] args) {
//方法一 运用 supplier 的T get()方法

        //方法二 用 Function 的 R accept(V v)方法
        Scanner s=new Scanner(System.in);
        System.out.println("请输入 需要产生的随机数个数");
        int n=s.nextInt();
        List <Integer> list=getNumList(n,()->{
            Random random=new Random();
            return random.nextInt(10);

        });
        System.out.println(list);
    }

    public static List<Integer> getNumList(int num, Supplier<Integer> sup){

        //T get()
        ArrayList<Integer> list=new ArrayList<>();
        int n=sup.get();
        for (int i = 0; i<num; ) {
            if (!list.contains(n=sup.get()))
            {

                list.add(n);
                i++;
            }
        }
        return list;

    }

}

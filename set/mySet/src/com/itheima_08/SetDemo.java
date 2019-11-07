package com.itheima_08;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/*
    需求：
        编写一个程序，获取10个1-20之间的随机数，要求随机数不能重复，并在控制台输出

    思路：
        1:创建Set集合对象
        2:创建随机数对象
        3:判断集合的长度是不是小于10
            是：产生一个随机数，添加到集合
            回到3继续
        4:遍历集合
 */
public class SetDemo {
    public static void main(String[] args) {

        Set<Integer> set=new HashSet<Integer>();

        makeRandom(set);

        for (Integer integer : set) {
            System.out.print(integer+" ");
        }
        System.out.println();

        
    }

    public static void makeRandom(Set<Integer> set){
        Random r=new Random();
        if (set.size()>=10)//size 从0开始
        {
            return;
        }
        else {

            set.add(r.nextInt(20)+1);
            makeRandom(set);


        }



    }
}

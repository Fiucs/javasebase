package com.itheima_02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
    需求：
        创建一个存储学生对象的集合，存储3个学生对象，使用程序实现在控制台遍历该集合

    思路：
        1:定义学生类
        2:创建List集合对象
        3:创建学生对象
        4:把学生添加到集合
        5:遍历集合(迭代器方式，for循环方式)
 */
public class ListDemo {
    public static void main(String[] args) {
        List<Student> list=new ArrayList<Student>();

        Student s1=new Student("asd",18);
        Student s2=new Student("萨达萨达",28);
        Student s3=new Student("啊实打实的",38);

        list.add(s1);
        list.add(s2);
        list.add(s3);
        Iterator it=list.iterator();
        while (it.hasNext()){

            System.out.println(it.next());
        }


    }
}

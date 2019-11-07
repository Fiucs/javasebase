package com.itheima_03;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
    需求：
        创建一个存储学生对象的集合，存储3个学生对象，使用程序实现在控制台遍历该集合

    思路：
        1:定义学生类
        2:创建Collection集合对象
        3:创建学生对象
        4:把学生添加到集合
        5:遍历集合(迭代器方式)
 */
public class CollectionDemo {
    public static void main(String[] args) {
        Collection <Student> c=new ArrayList<Student>();

        Student s1=new Student("爱吃的",12);
        Student s2=new Student("asd",19);
        Student s3=new Student("阿三打",52);

        c.add(s1);
        c.add(s2);
        c.add(s3);
        //遍历
        Iterator<Student> it = c.iterator();

        while (it.hasNext())
        {
            System.out.println(it.next());
        }

    }
}

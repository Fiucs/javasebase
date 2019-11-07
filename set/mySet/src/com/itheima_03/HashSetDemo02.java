package com.itheima_03;

import java.util.HashSet;

/*
    需求：
        创建一个存储学生对象的集合，存储3个学生对象，使用程序实现在控制台遍历该集合
        要求：学生对象的成员变量值相同，我们就认为是同一个对象

    思路：
        1:定义学生类
        2:创建HashSet集合对象
        3:创建学生对象
        4:把学生添加到集合
        5:遍历集合(增强for)
 */
public class HashSetDemo02 {
    public static void main(String[] args) {

        HashSet<Student> set = new HashSet<Student>();

        Student s1 = new Student("乐乐", 7);
        Student s2 = new Student("lee", 17);
        Student s3 = new Student("乐乐", 7);
        Student s4 = new Student("乐堡", 15);

        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);

        //重写equals 和hashset方法
        for(Student s:set){
            System.out.println(s.getName()+" ,"+s.getAge());
        }


    }
}

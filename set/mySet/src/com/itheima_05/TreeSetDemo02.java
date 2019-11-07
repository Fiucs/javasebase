package com.itheima_05;

import java.util.TreeSet;

/*
    存储学生对象并遍历，创建集合使用无参构造方法
    要求：按照年龄从小到大排序，年龄相同时，按照姓名的字母顺序排序
 */
public class TreeSetDemo02 {
    public static void main(String[] args) {

      TreeSet <Student> ts= new TreeSet<Student>();//需要实现 comparable类
     //treeSet带参构造方法使用比较器
        Student s1 = new Student("撒旦", 150);
        Student s2 = new Student("西恩", 41);
        Student s3 = new Student("欧拉", 15);
        Student s4 = new Student("拉什", 89);
        Student s5 = new Student("拉", 89);
        Student s6 = new Student("拉", 89);


        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);
        ts.add(s6);

        for (Student t : ts) {
            System.out.println(t.getName()+":"+t.getAge());

        }


    }
}

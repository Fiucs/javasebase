package com.itheima_06;

import java.util.Comparator;
import java.util.TreeSet;

/*
    存储学生对象并遍历，创建TreeSet集合使用带参构造方法
    要求：按照年龄从小到大排序，年龄相同时，按照姓名的字母顺序排序
 */
public class TreeSetDemo {
    public static void main(String[] args) {

        TreeSet <Student> ts=new TreeSet<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int num=o1.getAge()-o2.getAge();//从小到大

                return num==0?o1.getName().compareTo(o2.getName()):num;

            }
        });

        Student s1 = new Student("撒旦", 150);
        Student s2 = new Student("西恩", 25);
        Student s3 = new Student("欧拉", 15);
        Student s4 = new Student("拉什", 89);
        Student s5 = new Student("拉", 89);
        Student s6 = new Student("拉", 89);//去重


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

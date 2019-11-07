package com.itheima_07;

import java.util.Comparator;
import java.util.TreeSet;

/*
    需求：
        用TreeSet集合存储多个学生信息(姓名，语文成绩，数学成绩)，并遍历该集合
        要求：按照总分从高到低出现

    思路：
        1:定义学生类
        2:创建TreeSet集合对象，通过比较器排序进行排序
        3:创建学生对象
        4:把学生对象添加到集合
        5:遍历集合
 */
public class TreeSetDemo {

    public static int getSum(Student s){


        return s.getChinese()+s.getMath();

    }

    public static void main(String[] args) {
        //总分从高到低
        Student s1 = new Student("zs", 95, 88);
        Student s2 = new Student("ls", 125, 140);
        Student s3 = new Student("ww", 140, 125);
        Student s4 = new Student("da", 112, 130);
        Student s5 = new Student("da", 112, 130);

        System.out.println("-------------------------比较器 comparator---------------------------");
        TreeSet <Student> ts=new TreeSet<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                        int num=getSum(o2)-getSum(o1);//总分排序 主
                        int num2=o2.getMath()-o1.getMath();//数学从高到底 次

                return num==0?num2:num;



            }
        });


        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);

        for (Student s:ts) {
            System.out.println(s.getName()+" 总分:"+getSum(s)+" 数学："+s.getMath()+" 语文:"+s.getChinese());
        }

        System.out.println("--------------------------自然排序 compare To---------------------------");

        TreeSet<Student> ts1=new TreeSet<Student>();

        ts1.add(s1);
        ts1.add(s2);
        ts1.add(s3);
        ts1.add(s4);
        ts1.add(s5);



        for (Student s:ts1) {
            System.out.println(s.getName()+" 总分:"+getSum(s)+" 数学："+s.getMath()+" 语文:"+s.getChinese());
        }
    }
}

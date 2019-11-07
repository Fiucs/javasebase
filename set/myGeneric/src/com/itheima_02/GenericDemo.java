package com.itheima_02;

/*
    测试类
 */
public class GenericDemo {
    public static void main(String[] args) {

        Student s1 = new Student();

        Teacher t1=new Teacher();



        Generic<String,Integer> g=new Generic<String,Integer>();

        g.setE(100);
        g.setT("水电煤");

        System.out.println(g.getT()+" "+g.getE());

    }
}

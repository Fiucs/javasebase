package com.itheima_03;

import java.io.Serializable;

public class Student implements Serializable {

    public static final long serialVersionUID =52L;//确保序列化 id一致 解决类文件改动问题
    private  String name;//private transient int age 修饰的成员变量不被序列化
    private  int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student() {
    }

 /*   @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

package com.itheima_05;

public class Student implements Comparable <Student>{
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

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

    @Override
    public int compareTo(Student s) {
        //1.按照年龄比较 从小到大
        //2.年龄相同 按名字比较
        int num=this.age-s.getAge();

        int num2=num==0?this.name.compareTo(s.getName()):num ;
        return num2;



    }
}

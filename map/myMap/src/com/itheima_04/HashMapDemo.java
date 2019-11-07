package com.itheima_04;

import java.util.HashMap;
import java.util.Set;

/*
    需求：
        创建一个HashMap集合，键是学生对象(Student)，值是居住地 (String)。存储多个键值对元素，并遍历。
        要求保证键的唯一性：如果学生对象的成员变量值相同，我们就认为是同一个对象

    思路：
        1:定义学生类
        2:创建HashMap集合对象
        3:创建学生对象
        4:把学生添加到集合
        5:遍历集合
        6:在学生类中重写两个方法
            hashCode()
            equals()
 */
public class HashMapDemo {
    public static void main(String[] args) {

        Student s1= new Student("布林", 18);
        Student s2= new Student("鼎嗯~ o(*￣▽￣*)o", 88);
        Student s3= new Student("克哈", 38);

        Student s4= new Student("布林", 18);
        HashMap<Student, String> hm = new HashMap<Student, String>();

        hm.put(s1,"001");
        hm.put(s4,"004");
        hm.put(s2,"002");
        hm.put(s3,"003");//////map去重 但是 对象equals，hashcode未重写时，比较的是对象所在地址值
        Set<Student> set = hm.keySet();
        System.out.println("方式一 键找值");
        for (Student s : set) {
            String str=hm.get(s);
            System.out.println(s+" "+str);


        }

        
    }
}

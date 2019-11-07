package com.itheima_03;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
    需求：
        创建一个HashMap集合，键是学号(String)，值是学生对象(Student)。存储三个键值对元素，并遍历

    思路：
        1:定义学生类
        2:创建HashMap集合对象
        3:创建学生对象
        4:把学生添加到集合
        5:遍历集合
            方式1：键找值
            方式2：键值对对象找键和值
 */
public class HashMapDemo {
    public static void main(String[] args) {
        Student s1= new Student("布林", 18);
        Student s2= new Student("鼎嗯~ o(*￣▽￣*)o", 88);
        Student s3= new Student("克哈", 38);

        Student s4= new Student("布林", 18);
        HashMap<String, Student> hm = new HashMap<String, Student>();

        hm.put("1001",s1);
        hm.put("1002",s1);
        hm.put("1003",s3);
        hm.put("1004",s4);

        Set<String> set = hm.keySet();
        System.out.println("方式一 键找值");
        for (String s : set) {
            Student st=hm.get(s);
            System.out.println(s+" "+st.toString());


        }
        System.out.println("---------------");

        Set<Map.Entry<String,Student>> sm=hm.entrySet();//key value为键值对  而 Entry 是一个Set[Entry].由
        //Entry组成的集合
        //Entry 接口是泛型定义  <K,V>---接受两种数据类型 及定义一些方法

        for (Map.Entry<String, Student> se : sm) {

            String key=se.getKey();
            Student s=se.getValue();
            System.out.println(key+"  "+s);

        }



    }
}

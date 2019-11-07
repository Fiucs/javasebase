package com.itheima_06;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/*
    需求：
        把ArrayList集合中的学生数据写入到文本文件。要求：每一个学生对象的数据作为文件中的一行数据
        格式：学号,姓名,年龄,居住地	举例：itheima001,林青霞,30,西安

    思路：
        1:定义学生类
        2:创建ArrayList集合
        3:创建学生对象
        4:把学生对象添加到集合中
        5:创建字符缓冲输出流对象
        6:遍历集合，得到每一个学生对象
        7:把学生对象的数据拼接成指定格式的字符串
        8:调用字符缓冲输出流对象的方法写数据
        9:释放资源
 */
public class ArrayListToFileDemo {
    public static void main(String[] args) throws IOException {

        ArrayList<Student> list=new ArrayList<Student>();
        Student s1 = new Student("2019101", "至尊宝", 500, "花果山");
        Student s2 = new Student("2019102", "紫霞仙子", 1000,"天庭");
        Student s3 = new Student("2019103", "牛魔王", 400, "牛魔山");
        Student s4 = new Student("2019104", "二师兄", 800, "高老庄");
        Student s5 = new Student("2019105", "沙师弟", 700, "通天河");
        Student s6 = new Student("2019106", "唐僧", 21, "大唐");
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);
        list.add(s6);

        //System.out.println(s1.getName());
        BufferedWriter bw = new BufferedWriter(new FileWriter("字符流&字节缓冲流\\myCharStream\\src\\com\\itheima_06\\person.txt"));

        for (Student student : list) {
            bw.write(student.getSid()+","+student.getName()+","+student.getAge()+","+student.getAddress()+"\n");
        }
        bw.flush();
        bw.close();


    }
}

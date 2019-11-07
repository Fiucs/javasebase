package com.itheima_06;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/*
    需求：把文本文件中的数据读取到集合中，并遍历集合。要求：文件中每一行数据是一个学生对象的成员变量值
          举例：itheima001,林青霞,30,西安

    思路：
        1:定义学生类
        2:创建字符缓冲输入流对象
        3:创建ArrayList集合对象
        4:调用字符缓冲输入流对象的方法读数据
        5:把读取到的字符串数据用split()进行分割，得到一个字符串数组
        6:创建学生对象
        7:把字符串数组中的每一个元素取出来对应的赋值给学生对象的成员变量值
        8:把学生对象添加到集合
        9:释放资源
        10:遍历集合
 */
public class FileToArrayListDemo {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("字符流&字节缓冲流\\myCharStream\\src\\com\\itheima_06\\person.txt"));
        String s;
        String[]ls;
        ArrayList<Student> list=new ArrayList<>();
        while ((s=br.readLine())!=null && (ls=s.split(",")).length==4){

            list.add(new Student(ls[0],ls[1],Integer.parseInt(ls[2]),ls[3]));
        }
        for (Student student : list) {
            System.out.println(student);

        }
        br.close();


    }
}

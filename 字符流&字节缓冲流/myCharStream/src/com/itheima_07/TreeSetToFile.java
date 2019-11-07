package com.itheima_07;


import java.io.*;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

//键盘录入5个学生信息(姓名,语文成绩,数学成绩,英语成绩)。要求按照成绩总分从高到低写入文本文件
//格式：姓名,语文成绩,数学成绩,英语成绩 举例：林青霞,98,99,100
public class TreeSetToFile {

    public static void main(String[] args) throws IOException {
        TreeSet<Student> tset=new TreeSet<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int sum1=o1.getChinese()+o1.getMath()+o1.getEnglish();
                int sum2=o2.getChinese()+o2.getMath()+o2.getEnglish();
                int num=sum2-sum1;
                int num2=num==0?o2.getChinese()-o1.getChinese():num;//总成绩 相同按语文成绩从高到低
                int num3=num2==0?o2.getMath()-o1.getMath():num2;//语文成绩相同 按数学成绩从高到底

                return num3==0?o1.getName().compareTo(o2.getName()):num3;
            }
        });

        getInfo(tset);//录入

        BufferedWriter bw = new BufferedWriter(new FileWriter("字符流&字节缓冲流\\myCharStream\\src\\com\\itheima_07\\res.txt"));
        for (Student s : tset) {

            bw.write(s.getName()+" "+s.getChinese()+" "+s.getMath()+" "+s.getEnglish());
            bw.newLine();

        }
        bw.flush();
        bw.close();
        BufferedReader br = new BufferedReader(new FileReader("G:\\idea2019\\javaSeBase\\字符流&字节缓冲流\\myCharStream\\src\\com\\itheima_07\\res.txt"));
        String s;
        while ((s=br.readLine())!=null){

            System.out.println(s.length());
        }


    }


    public static void getInfo(TreeSet<Student> tset){

        Scanner s=new Scanner(System.in);
        for (int i=0;i<5;i++){

            System.out.println("输入姓名:");
            String name=s.nextLine();
            System.out.println("请输入语文成绩");
            int gradeOfChinese=s.nextInt();
            System.out.println("请输入数学成绩");
            int gradeOfMath=s.nextInt();
            System.out.println("请输入英语成绩");
            int gradeOfEnglish=s.nextInt();
            s.nextLine();
            tset.add(new Student(name,gradeOfChinese,gradeOfMath,gradeOfEnglish));

        }




    }


}

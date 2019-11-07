package com.employee;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Demo1 {
    private  ArrayList list;
    public static void main(String[] args) throws ParseException {

        Demo1 demo1=new Demo1();
        demo1.list=new ArrayList();//保存员工对象

        String fmt1="yyyy-MM-dd HH:mm:ss";
        String fmt2="yyyy年MM月dd日 HH时mm分ss秒";
        String name,startTime,endTime;
        Scanner s=new Scanner(System.in);
        for (int i = 0; i < 1; i++) //录入信息
        {


            System.out.println("输入员工姓名:");
            name=s.nextLine();
            System.out.println("输入员工上班时间:格式为yyyy-MM-dd HH:mm:ss");
            startTime=s.nextLine();
//            System.out.println(startTime);
            Date st=DateUtils.stringToDate(startTime,fmt1);
            System.out.println("输入员工下班时间:格式为yyyy-MM-dd HH:mm:ss");
            endTime=s.nextLine();
            Date et=DateUtils.stringToDate(endTime,fmt1);
            Employee e=new Employee(name,st,et);
            demo1.list.add(e);

        }

        //打印信息

        for (int i = 0; i < 1; i++) {
            Employee e=(Employee)demo1.list.get(i);//得到对象
            System.out.println(e);

        }


    }

}

package com.itheima_03;

import java.util.Calendar;
import java.util.Scanner;

/*
    需求：
        获取任意一年的二月有多少天

    思路：
        1:键盘录入任意的年份
        2:设置日历对象的年、月、日
            年：来自于键盘录入
            月：设置为3月，月份是从0开始的，所以设置的值是2
            日：设置为1日
        3:3月1日往前推一天，就是2月的最后一天
        4:获取这一天输出即可
 */
public class CalendarTest {
    public static void main(String[] args) {
        //
        Scanner s=new Scanner(System.in);

        System.out.println("请输入年份");
        int year=s.nextInt();

        Calendar c=Calendar.getInstance();

        for (int i = 2008; i <= 2020; i++) {



            c.set(i, 3 - 1, 1);//月分从 0-11
            c.add(Calendar.DATE, -1);

            System.out.println(i + "年的二月份有" + c.get(Calendar.DAY_OF_MONTH) + "天");
        }


    }
}

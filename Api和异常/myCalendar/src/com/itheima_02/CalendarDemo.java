package com.itheima_02;


import java.util.Calendar;

/*
    public abstract void add​(int field, int amount):根据日历的规则，将指定的时间量添加或减去给定的日历字段
    public final void set​(int year,int month,int date):设置当前日历的年月日
 */
public class CalendarDemo {
    public static void main(String[] args) {
        //获取日历类对象
        Calendar c = Calendar.getInstance();
        //add方法 三年前的今天
       // c.add(Calendar.YEAR,-3);
        //public int get​(int field):返回给定日历字段的值


/*
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH) + 1;
        int date = c.get(Calendar.DATE);
        int week=c.get(Calendar.DAY_OF_WEEK);
        System.out.println(year + "年" + month + "月" + date + "日"+"星期"+week);*/


        //十年后的五天前

       // c.add(Calendar.YEAR,10);
        c.add(Calendar.DATE,-5);

        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH) + 1;
        int date = c.get(Calendar.DATE);
        int week=c.get(Calendar.DAY_OF_WEEK);
        System.out.println(year + "年" + month + "月" + date + "日"+"星期"+week);



        c.set(2080,(10-1),11);
         year = c.get(Calendar.YEAR);
         month = c.get(Calendar.MONTH) + 1;
         date = c.get(Calendar.DATE);
         week=c.get(Calendar.DAY_OF_WEEK);
        System.out.println(year + "年" + month + "月" + date + "日"+"星期"+week);



    }
}

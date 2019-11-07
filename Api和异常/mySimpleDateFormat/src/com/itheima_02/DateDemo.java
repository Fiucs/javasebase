package com.itheima_02;


import java.text.ParseException;
import java.util.Date;

/*
    测试类
 */
public class DateDemo {
    public static void main(String[] args) throws ParseException {
        Date date=new Date();
        String s1=DateUtils.dateToString(date,"yyyy-MM-dd HH:mm:ss");
        System.out.println(s1);

        String s2=DateUtils.dateToString(date,"E");
        System.out.println(s2);

        Date date1=DateUtils.stringToDate("1970-1-1 8:0:0","yyyy-MM-dd HH:mm:ss");
        System.out.println(date1);
        
    }
}

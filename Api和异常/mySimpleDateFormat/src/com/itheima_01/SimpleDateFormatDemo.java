package com.itheima_01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
    构造方法：

        public SimpleDateFormat​(String pattern):构造一个SimpleDateFormat使用给定的模式和默认的日期格式

    格式化：从 Date 到 String
        public final String format(Date date)：将日期格式化成日期/时间字符串

    解析：从 String 到 Date
        public Date parse​(String source)：从给定字符串的开始解析文本以生成日期
 */
public class SimpleDateFormatDemo {
    public static void main(String[] args) throws ParseException {

       // public SimpleDateFormat​():构造一个SimpleDateFormat，使用默认模式和日期格式
        Date d=new Date();
       // SimpleDateFormat sdf=new SimpleDateFormat();
        //Date 到 String
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日E HH:mm:ss");
        String s=sdf.format(d);
        System.out.println(s);
        //String 到Date

        String strd="2020年1月1日周六 18:10:10";
        Date date1=sdf.parse(strd);
        System.out.println(date1);

    }
}

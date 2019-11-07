package com.itheima;

import java.util.Date;

/*
    public long getTime():获取的是日期对象从1970年1月1日 00:00:00到现在的毫秒值
    public void setTime(long time):设置时间，给的是毫秒值
 */
public class DateDemo02 {
    public static void main(String[] args) {

        //long getTime​() 返回自1970年1月1日以来
        // ，由 Date对象表示的00:00:00 GMT的毫秒数。

        Date date1=new Date();
        System.out.println(date1.getTime()*1.0/1000/60/60/24/365);


        //void setTime​(long time)
        // 将此 Date对象设置为1970年1月1日00:00:00 GMT后的
        // time毫秒的时间点
        long time=1000*60*60;
        date1.setTime(time);
        System.out.println(date1);
        time=System.currentTimeMillis();
        date1.setTime(time);
        System.out.println(date1);

    }
}

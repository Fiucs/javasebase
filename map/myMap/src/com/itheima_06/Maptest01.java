package com.itheima_06;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Maptest01 {


    public static void main(String[] args) {

        Map<String,String> map=new HashMap<String, String>();//容器
        map.put("Tom","c");
        map.put("John","python");
        map.put("Susan","web");
        map.put("Jerry","mysql");
        map.put("Lucy","linux");
        map.put("Kevin","python");

        System.out.println("-------------原始表------------");
        System.out.println("--老师---课程");
        for (String teacher : map.keySet()) {

            System.out.println(" "+teacher+"  "+map.get(teacher));

        }

        System.out.println("-------------+新老师 Allen jdbc--Lucy改教java------------");
        map.put("Allen","jdbc");
        map.put("Lucy","java");
        System.out.println("--老师---改后后课程");
        for (String teacher : map.keySet()) {

            System.out.println(" "+teacher+"  "+map.get(teacher));

        }

        System.out.println("教学python的老师");

        Set<Map.Entry<String, String>> se = map.entrySet();


        for (Map.Entry<String, String> ms : se) {
            String course=ms.getValue();
            String teacher=ms.getKey();
            if(course.equals("python"))
            {

                System.out.print(teacher+"  ");

            }

        }



    }

}

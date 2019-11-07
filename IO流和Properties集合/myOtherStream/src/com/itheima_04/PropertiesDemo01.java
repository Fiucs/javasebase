package com.itheima_04;

import java.util.Map;
import java.util.Properties;
import java.util.Set;

/*
    Properties作为Map集合的使用
 */
public class PropertiesDemo01 {
    public static void main(String[] args) {

        Properties pro=new Properties();

        pro.put("特普利", 1);
        pro.put("坎普",2);
        pro.put("威尔金斯",3);
        pro.put("哈达迪",4);

        Set<Map.Entry<Object, Object>> entries = pro.entrySet();

        for (Map.Entry<Object, Object> entry : entries) {

            System.out.println((String)entry.getKey()+" "+ (Integer)entry.getValue());
        }


    }
}

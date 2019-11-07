package com.itheima_01;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
    Map集合的基本功能：
        V put(K key,V value)：添加元素
        V remove(Object key)：根据键删除键值对元素
        void clear()：移除所有的键值对元素
        boolean containsKey(Object key)：判断集合是否包含指定的键
        boolean containsValue(Object value)：判断集合是否包含指定的值(自学)
        boolean isEmpty()：判断集合是否为空
        int size()：集合的长度，也就是集合中键值对的个数
 */
public class MapDemo02 {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<String, String>();
        map.put("阿三打","abc");
        map.put("A","asd");
        map.put("B","aqwe");
        map.put("C","fgh");
        map.put("D","jkll");
        //map.put("E");

        //map.remove("A","s");
        map.remove("A");

        Set<Map.Entry<String, String>> e = map.entrySet();
        for (Map.Entry<String, String> me : e) {
            String key=me.getKey();
            String value=me.getValue();
            System.out.println("key:"+key+"  value:"+value);

        }

        System.out.println(map.containsKey("阿三打"));
        System.out.println(map.containsKey("fgh"));

        System.out.println(map.containsValue("阿三打"));
        System.out.println(map.containsValue("abc"));

        System.out.println("清除前"+map.isEmpty());
        map.clear();
        System.out.println("清除后"+map.isEmpty());



    }
}

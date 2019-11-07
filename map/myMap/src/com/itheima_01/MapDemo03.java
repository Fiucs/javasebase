package com.itheima_01;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
    Map集合的获取功能：
        V get(Object key):根据键获取值
        Set<K> keySet():获取所有键的集合
        Collection<V> values():获取所有值的集合
 */
public class MapDemo03 {
    public static void main(String[] args) {
        Map<Integer,Integer> map=new HashMap<Integer, Integer>();
        map.put(0,0);
        map.put(1,1);
        map.put(2,2);
        map.put(3,3);
        map.put(4,4);
        map.put(5,5);

       // Set<Integer> set=map.keySet();键 的集合
        Collection <Integer> c=map.values();
        for (Integer o : c) {
            System.out.println(o);

        }


    }
}

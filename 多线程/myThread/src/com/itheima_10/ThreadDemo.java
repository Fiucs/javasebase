package com.itheima_10;

import java.util.*;

/*
    线程安全的类：
        StringBuffer
        Vector
        Hashtable
 */
public class ThreadDemo {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer();
//都是同步方法
        ///public synchronized int length() {
//        return count;
//    }
        Vector<String> v=new Vector<>();
        //同理

        Hashtable<String,String> ht=new Hashtable<>();
        //同理

        List<String> list = Collections.synchronizedList(new ArrayList<>());
        //返回线程安全的list 可替代 vector

    }
}

package com.itheima_06;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

/*
    Arrays工具类中有一个静态方法：
        public static <T> List<T> asList​(T... a)：返回由指定数组支持的固定大小的列表

    List接口中有一个静态方法：
        public static <E> List<E> of​(E... elements)：返回包含任意数量元素的不可变列表

    Set接口中有一个静态方法：
        public static <E> Set<E> of​(E... elements) ：返回一个包含任意数量元素的不可变集合
 */
public class ArgsDemo02 {
    public static void main(String[] args) {

        List <String> list= Arrays.asList("c++","is","the","best","c++");
        //不可增加，删除 可修改。

        list.set(0,"py");
        System.out.println(list);

        List <String> list1=List.of("c++","is","the","best","c++");
        //不可增删改
        System.out.println(list);

       // Set <String> set=Set.of("c++","is","the","best","c++");//不可重复
        //不可增删改
       // System.out.println(set);

        Set <String> set1=Set.of("c++","is","the","best");

        System.out.println(set1);





    }
}

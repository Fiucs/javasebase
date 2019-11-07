package com.itheima_05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
    需求：创建一个HashMap集合，存储三个键值对元素，每一个键值对元素的键是String，值是ArrayList，
         每一个ArrayList的元素是String，并遍历

    思路：
        1:创建HashMap集合
        2:创建ArrayList集合，并添加元素
        3:把ArrayList作为元素添加到HashMap集合
        4:遍历HashMap集合

    给出如下的数据:
        第一个ArrayList集合的元素：(三国演义)
  		    诸葛亮
  		    赵云
        第二个ArrayList集合的元素：(西游记)
  		    唐僧
  		    孙悟空
        第三个ArrayList集合的元素：(水浒传)
  		    武松
  		    鲁智深
*/
public class HashMapIncludeArrayListDemo {
    public static void main(String[] args) {
        HashMap<String, ArrayList> ma = new HashMap<String, ArrayList>();

        ArrayList<String> arr1 = new ArrayList<>();
        arr1.add("诸葛亮");
        arr1.add("黄忠");
        ma.put("三国演义",arr1);
        ArrayList<String> arr2 = new ArrayList<>();
        arr2.add("六耳猕猴");
        arr2.add("大圣");
        ma.put("西游戏",arr2);
        ArrayList<String> arr3 = new ArrayList<>();
        arr3.add("武松");
        arr3.add("林冲");
        ma.put("水浒传",arr3);

        Set<Map.Entry<String, ArrayList>> set=ma.entrySet();
        for (Map.Entry<String, ArrayList> me : set) {
            String key=me.getKey();
            System.out.print(key+" :");
            ArrayList<String> arr=me.getValue();
            for (String str : arr) {
                System.out.print(str+ "  ");

            }
            System.out.println();


        }




    }
}

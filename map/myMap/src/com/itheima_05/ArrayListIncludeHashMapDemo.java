package com.itheima_05;

import java.util.ArrayList;
import java.util.HashMap;

/*
    需求：
        创建一个ArrayList集合，存储三个元素，每一个元素都是HashMap，每一个HashMap的键和值都是String，并遍历

    思路：
        1:创建ArrayList集合
        2:创建HashMap集合，并添加键值对元素
        3:把HashMap作为元素添加到ArrayList集合
        4:遍历ArrayList集合

    给出如下的数据:
        第一个HashMap集合的元素：
  		    孙策		大乔
  		    周瑜		小乔
        第二个HashMap集合的元素：
  		    郭靖		黄蓉
  		    杨过		小龙女
        第三个HashMap集合的元素：
  		    令狐冲	任盈盈
  		    林平之	岳灵珊
 */
public class ArrayListIncludeHashMapDemo {
    public static void main(String[] args) {
        ArrayList<HashMap<String,String>> am= new ArrayList<HashMap<String, String>>();

        HashMap<String,String> map=new HashMap<String, String>();

        map.put("风清扬","斌凉席");
        map.put("不惊鱼","透心凉");

        am.add(map);


        HashMap<String,String> map1=new HashMap<String, String>();

        map1.put("黄老机","非秦天");
        map1.put("六五年","杨禹承");
        map1.put("甜涩口","库勘验");


        am.add(map1);

        HashMap<String,String> map2=new HashMap<String, String>();
        map2.put("欧佩克","董荷华");
        map2.put("四级东","戏金蟾");
        map2.put("zxc","zxczz");
        am.add(map2);

        for (HashMap<String, String> map3 : am) {
            System.out.println("''''''''''''");
            for (String s : map3.keySet()) {
                System.out.println(s+" "+ map3.get(s));

            }

        }



    }
}

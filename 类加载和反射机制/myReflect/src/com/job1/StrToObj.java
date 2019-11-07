package com.job1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StrToObj {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException, NoSuchFieldException {
        String string = "id:100001,title:美联储加息,content:据路透社透露，美国有望在下一个月调整利率,author:张三";

        String[] split = string.split(",");
/*        System.out.println(Arrays.toString(split));
        System.out.println(split.length);
        HashMap<String, Object> map = new HashMap<String, Object>();*/
/*        for (int i = 0; i < split.length; ) {
            String[] s1 = split[i].split(":");

            if (split[i+1].split(":").length == 1 ) {

                if (s1.length > 1)
                    map.put(s1[0], s1[1]);
                else {
                    map.put(s1[0], ","+map.get(s1[0]) + "" + s1[0]);
                    i++;
                }

            } else {

                map.put(s1[0], s1[1]);
                i++;
            }


        }*/

        //如果 content里的是中文逗号， 非 英文 ,
        //可用下面的方式
        Map<String, Object> collect = Stream.of(split).collect(Collectors.toMap(o -> o.split(":")[0], o -> o.split(":")[1]));

        Class<? extends News> aClass = News.class;
        Constructor<? extends News> c = aClass.getDeclaredConstructor();
        News news = c.newInstance();
        for (String s : collect.keySet()) {
            Field df = aClass.getDeclaredField(s);
            df.setAccessible(true);
            df.set(news,collect.get(s));

        }

        System.out.println(news);



    }
}
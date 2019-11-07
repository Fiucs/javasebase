package com.itheima_04;


import java.util.Properties;

/*
    Properties作为集合的特有方法：
        Object setProperty(String key, String value)：设置集合的键和值，都是String类型，底层调用Hashtable方法put
        String getProperty(String key)：使用此属性列表中指定的键搜索属性
        Set<String> stringPropertyNames()：从该属性列表中返回一个不可修改的键集，其中键及其对应的值是字符串
 */
public class PropertiesDemo02 {
    public static void main(String[] args) {
        Properties pro = new Properties();
        pro.setProperty("詹姆斯","老汉");
        pro.setProperty("科比","凌晨四点的夜景");
        pro.setProperty("林书豪","林疯狂");
        pro.setProperty("易建联","大梁");

        System.out.println(pro.getProperty("科比"));

        for (String s:pro.stringPropertyNames()) {
            System.out.println(s);


        }



    }
}

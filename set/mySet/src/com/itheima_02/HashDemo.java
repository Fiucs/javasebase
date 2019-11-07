package com.itheima_02;

/*
    哈希值：
        是JDK根据对象的地址或者字符串或者数字算出来的int类型的数值

    Object类中有一个方法可以获取对象的哈希值
        public int hashCode()：返回对象的哈希码值
 */
public class HashDemo {
    public static void main(String[] args) {

        //同一对象 hashcode相同
        Student s1=new Student("林青霞去",50);
        System.out.println(s1.hashCode());
        System.out.println(s1.hashCode());

        //重写 hashCode()可改变hashCode值
        //不同对象 默认不同
        Student s2=new Student("林青霞去",50);
        System.out.println(s2.hashCode());
        System.out.println(s2.hashCode());

        System.out.println("---------------------");
        System.out.println("重地".hashCode());
        System.out.println("通话".hashCode());
        System.out.println("通去".hashCode());











    }
}

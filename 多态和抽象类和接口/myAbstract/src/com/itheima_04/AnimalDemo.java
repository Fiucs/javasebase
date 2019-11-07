package com.itheima_04;
/*
    测试类
 */
public class AnimalDemo {
    public static void main(String[] args) {
        //创建对象，按照多态的方式
        Cat a = new Cat();//向上转型
        a.setName("加菲");
        a.setAge(5);
        System.out.println(a.getName()+","+a.getAge());
        a.eat();
        System.out.println("--------");

        a = new Cat("加菲",5);
        System.out.println(a.getName()+","+a.getAge());
        a.eat();

        Dog d=new Dog("边境牧羊犬",1);
        System.out.println(d.getName()+","+d.getAge());
        d.eat();



    }
}

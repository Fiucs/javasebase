package com.itheima_03;
/*
    测试类
 */
public class AnimalDemo {
    public static void main(String[] args) {
        //创建对象，调用方法
        Jumpping j = new Cat();
        j.jump();//多态实现
        System.out.println("--------");

        Animal a = new Cat();
        a.setName("加菲");
        a.setAge(5);
        System.out.println(a.getName()+","+a.getAge());
        a.eat();
//        a.jump();

        a = new Cat("加菲",5);
        System.out.println(a.getName()+","+a.getAge());
        a.eat();
        System.out.println("--------");

        Cat c = new Cat();//实现类
        c.setName("加菲");
        c.setAge(5);
        System.out.println(c.getName()+","+c.getAge());
        c.eat();
        c.jump();

        System.out.println("--------");
        Dog d=new Dog("边牧",1);
        System.out.println(d.getName()+","+d.getAge());
        d.eat();
        d.jump();





    }
}

package com.itheima_05;
/*
    测试类
 */
public class PersonDemo {
    public static void main(String[] args) {
        //创建对象
        PingPangPlayer ppp = new PingPangPlayer();
        ppp.setName("易建联");
        ppp.setAge(37);
        System.out.println(ppp.getName()+","+ppp.getAge());
        ppp.eat();
        ppp.study();
        ppp.speak();
        System.out.println("--------");

        BasketballPlayer bp = new BasketballPlayer();
        bp.setName("姚明");
        bp.setAge(35);
        System.out.println(bp.getName()+","+bp.getAge());
        bp.eat();
        bp.study();
    }
}

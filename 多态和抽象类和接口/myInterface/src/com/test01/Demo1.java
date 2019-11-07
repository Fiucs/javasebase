package com.test01;

public class Demo1 {

    public static void main(String[] args) {


        Ostrich o=new Ostrich();
        o.run();
        System.out.println("----------");

        Parrot p=new Parrot();
        p.fly();
        p.speak();

        System.out.println("----------");
        Human h=new Human();
        h.speak();
        h.run();


    }






}

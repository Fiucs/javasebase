package com.itheima_03;

public class FinallyTest {
    static int a=10;
    static int b=0;
    public static void main(String[] args) {
        System.out.println("main方法开始");

        System.out.println(method1());

    }
    public static int method1(){

        System.out.println("method1程序开始");

        try {
            int i=10/0;
            a=20;
             b=1;
            return b;
        } catch (Exception e) {
//            e.printStackTrace();
            System.out.println("aaaaaaaaaa");
            a=30;
            b=2;
            return b;

        } finally {
            System.out.println("bbbbbbbbbbbbb");//准确来说先执行普通语句 一直执行到return之前  最后执行return语句
            //但是 finally的return优先级大于 try  和catch
            System.out.println(a);
            a=40;
            b=3;
            System.out.println(a);
            return b;
        }


    }
}

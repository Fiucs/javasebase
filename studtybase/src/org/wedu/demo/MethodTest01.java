package org.wedu.demo;

public class MethodTest01 {
    public static void main(String[] args) {
        System.out.println("----------void method-------------");
        method01();
        method02();
        System.out.println("----------have args method------------");
        System.out.println("较大值为："+method03(100,100));

    }

    public static int  method03(int a,int b ){

        return a>=b?a:b;
    }

    public static void method01(){

        System.out.println("方法一");


    }
    public static void method02(){

        System.out.println("方法二--");


    }


}

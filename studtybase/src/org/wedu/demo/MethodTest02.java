package org.wedu.demo;


//多个方法 在同一个类中 方法名相同 (参数类型 不同，参数个数不同，参数顺序不同)可构成重载
public class MethodTest02 {
    public static void main(String[] args) {
        boolean b = method1();
        System.out.println(method1(2.5,2));


    }

    public static boolean method1(){
        System.out.println("method 1");
        return true;
    }
    public static boolean method1(int num,int num1){
        return num==num1;
    }
/*    public static boolean method1(byte num,int num1){
        return num==num1;
    }*/
    public static boolean method1(float num,long num1){
        return num==(float)num1;
    }
    public static boolean method1(double num,long num1){
        return num==(double)num1;
    }

/*    public static boolean method1(short num ,int num1){
        return num==num1;
    }
    public static boolean method1(short num ,long num1){
        return num==num1;
    }*/
    public static boolean method1(int num ,long num1){
        return num==num1;
    }

}

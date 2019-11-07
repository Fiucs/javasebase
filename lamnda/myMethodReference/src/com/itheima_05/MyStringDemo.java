package com.itheima_05;

/*
    练习
        1:定义一个接口(MyString)，里面定义一个抽象方法：
            String mySubString(String s,int x,int y);
        2:定义一个测试类(MyStringDemo)，在测试类中提供两个方法
            一个方法是：useMyString(MyString my)
            一个方法是主方法，在主方法中调用useMyString方法
 */
public class MyStringDemo {
    public static void main(String[] args) {

       // useMyString((s,a,b)->s.substring(a,b));//用类的实例方法 写的lambda表达式

       // useMyString(String::substring);//s为 String实例   a,b 为s.substring(int begin,int end)的参数

        String s="33333";

        useMyString(s::substring);


    }

    public static void useMyString(MyString my){
      //  String s = my.mySubString("It's My World", 5, 13);//电梯门 左闭右开
        System.out.println(my.mySubString(2,5));

    }

}

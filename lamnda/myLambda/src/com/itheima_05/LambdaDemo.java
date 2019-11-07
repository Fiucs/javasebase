package com.itheima_05;

/*
    Lambda表达式的省略模式
 */
public class LambdaDemo {
    public static void main(String[] args) {

        useAddable((int a,int b)->{

            return a+b;
        });
        //Lambda表达式的省略模式
        //参数类型 可省略 （all 省略）

        useAddable(( a, b)->{

            return a+b;
        });


        //如果参数有且一个参数 可省小括号和类型

        useFlyable(s->{
            System.out.println(s);
        });

        //如果代码快语句只有一条 可省略大括号  语句分号
        useFlyable(s-> System.out.println(s));

        //如果有return1可以省略

        useAddable((x,y)->x+y);




    }

    private static void useFlyable(Flyable f) {
        f.fly("风和日丽，晴空万里");
    }

    private static void useAddable(Addable a) {
        int sum = a.add(10, 20);
        System.out.println(sum);
    }
}

package com.itheima_06;

/*
    Lambda表达式的注意事项
 */
public class LambdaDemo {
    public static void main(String[] args) {

        //1. 使用lamada 的接口中只有一个抽象方法

        useInter(()->{
            System.out.println("你好");
        });

        //必须有上下文环境 才能推导出lambda对应接口


        //局部变量的 找寻lambda的对应接口
        Runnable r=()-> System.out.println("没有Lamada环境");
        new Thread(r).start();

        //根据形参 得到lambda匹配的接口
        new Thread(()-> System.out.println("有环境乐乐")).start();



    }

    private static void useInter(Inter i) {
        i.show();
    }
}

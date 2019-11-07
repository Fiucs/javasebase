package com.itheima_02;

/*
    需求：
        1:定义一个接口(Printable)：里面定义一个抽象方法：void printInt(int i);
        2:定义一个测试类(PrintableDemo)，在测试类中提供两个方法
            一个方法是：usePrintable(Printable p)
            一个方法是主方法，在主方法中调用usePrintable方法
 */
public class PrintableDemo {
    public static void main(String[] args) {

        //useConveter(s -> Integer.parseInt(s));
        useConveter(Integer::parseInt);//Lambda表达式被类方法替代时 参数全部传递给静态方法作为参数


    }

    public static void useConveter(Conveter c){

        c.conVeter("99999");
    }

}

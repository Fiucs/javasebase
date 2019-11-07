package com.itheima_07;

/*
    Lambda表达式和匿名内部类的区别
 */
public class LambdaDemo {
    public static void main(String[] args) {
    //- 匿名内部类：编译之后，产生一个单独的.class字节码文件
        //  - Lambda表达式：编译之后，没有一个单独的.class字节码文件。对应的字节码会在运行的时候动态生成

    }

    private static void useStudent(Student s) {
        s.study();
    }

    private static void useAnimal(Animal a) {
        a.method();
    }

    private static void useInter(Inter i) {
        i.show();
    }
}

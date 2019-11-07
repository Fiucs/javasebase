package com.itheima_02;

/*
    需求：
        1:定义一个接口Inter，里面有三个方法：一个是抽象方法，一个是默认方法，一个是静态方法
            void show();
            default void method(){ }
            public static void test(){ }
        2:定义接口的一个实现类：
            InterImpl
        3:定义测试类：
            InterDemo
            在主方法中，按照多态的方式创建对象并使用
 */
public class InterDemo {
    public static void main(String[] args) {
    Eatable e=new EatImpl();
    useEable(e);


    //匿名内部类
        useEable(new Eatable() {
            @Override
            public void eat() {
                System.out.println("吃苹果了");
            }
        });

        //接口中有且只有一个方法
        useEable(()->{
            System.out.println("吃香蕉了");
        });





    }

    private  static void useEable(Eatable e) {
        e.eat();

    }
}

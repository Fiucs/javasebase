package com.itheima_03;

/*
    测试类
 */
public class GenericDemo {
    public static void main(String[] args) {


        //泛型方法 与 方法重载区别和相同点

        Generic g=new Generic();

        g.show(1);
        g.show("sa");
        g.show('A');
        g.show(true);
    }
}

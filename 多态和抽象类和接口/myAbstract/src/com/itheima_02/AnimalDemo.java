package com.itheima_02;

/*
    测试类
 */
public class AnimalDemo {
    public static void main(String[] args) {
//        Animal a = new Animal();
        Animal a = new Cat();//抽象类必须被继承并实例化抽象方法
        // 不能直接实例化。用多态的方法是调用函数
        a.eat();
        a.sleep();

      /*  Animal d=new Dog();*///抽象类 不能被实例化
    }

}

package com.itheima_06;

/*
    测试类
 */
public class AnimalDemo {
    public static void main(String[] args) {
        //创建猫类对象进行测试
 /*       Animal a = new Cat();
        a.setName("加菲");
        a.setAge(5);
        System.out.println(a.getName() + "," + a.getAge());
        a.eat();

        a = new Cat("加菲", 5);
        System.out.println(a.getName() + "," + a.getAge());
        a.eat();
*/
        Animal a=new A();

        a.setName("AAAA");
        a.setAge(18);

        System.out.println(a.getName()+","+a.getAge());

        if(a instanceof Cat)  //a Animal的引用 指向 A的对象。而 A类继承自Dog类
            //A instanceof B      ps:A是一个对象     B是类。判断规则：A是B类的对象或A是B类子类的对象
        {
            a=new Dog();
            a.setName("DOGGGGGGG");
            a.setAge(88);


        }
        System.out.println(a.getName()+","+a.getAge());






    }
}

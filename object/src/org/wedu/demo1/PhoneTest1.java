package org.wedu.demo1;

public class PhoneTest1 {
    public static void main(String[] args) {
        Phone p1=new Phone();
        Phone p2=p1;
        System.out.println(p1.brand);
        System.out.println(p1.price);
        System.out.println(p1.phoneNum);

        System.out.println(p2.brand);
        p1.call(p2.phoneNum);//方法区 （常量，类属性static定义的 ）线程共享

    }
}

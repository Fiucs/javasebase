package org.wedu.homework;

public class CatDogTest {

    public static void main(String[] args) {
        Cat c1=new Cat("花色","中华狸猫");
        Dog d1=new Dog("橘色","中华田园犬");
        c1.eat();
        d1.eat();
        c1.catchMounse();
        d1.lookHome();
    }
}

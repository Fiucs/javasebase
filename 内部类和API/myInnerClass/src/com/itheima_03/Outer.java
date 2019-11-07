package com.itheima_03;

public class Outer {

    private int num = 10;

    //局部内部类  外部无法直接访问，但是外部可以通过调用方法来调用
    public void method() {
        int num2 = 20;
        class Inner {
            private void show() {
                System.out.println(num);//可以访问外部类成员变量，方法内的局部变量
                System.out.println(num2);
            }
        }

        Inner i = new Inner();
        i.show();

    }

}

package com.itheima_01;

@FunctionalInterface
public interface MyInterface {
    void show();

    //boolean equals(Object o);
    boolean equals(Object o);//Object

    String toString();//Object

    public int hashCode();//Object

/*    public default void notify() {

    }*/  // Object final 方法不行


}

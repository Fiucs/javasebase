package com.itheima_02;

public class Generic <T,E> {

    private T t;
    private E e;

    public Generic() {
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public E getE() {
        return e;
    }

    public void setE(E e) {
        this.e = e;
    }
}

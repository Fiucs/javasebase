package org.wedu.demo1;

public class Cat {
    private String name;//private 修饰的变量只能在本类使用
    private int age;

    //无参数 构造方法 没有显示定义时 系统会提供默认的构造方法
    public Cat(){

    }
    public Cat(String name,int age){

        this.name=name;
        this.age=age;

    }



//封装
    //1.将类中属性私有化
    //2.为私有属性提供公共方法
    public String getName(){
        return this.name;
    }
    public void setName(String name){


        this.name=name;

    }
    public int getAge(){
        return age;
    }
    public void setAget(int age){
        if (age<20)
        this.age=age;
        else
            System.out.println("年龄不合法");
    }

    public void show(){
        System.out.println(this.name+" " +" is " +this.age+" yeas old");
    }

}

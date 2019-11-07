package org.wedu.demo1;

public class Student {
    String name;
    int age;
    static  String place;
    public void study(){
        System.out.println(this.name+"在学习");
    }
    public void doHomeWork(){
        System.out.println(name+"在做作业");
    }
    public Student(){
        place="中国";

    }

}
//父类           ||           接口
// |            ||             |
//子类  类        ||           类实现接口
package org.wedu.homework;

public class Coder {
    private String name;
    private int id;
    private double salary;

    public Coder(){}
    public Coder(String name,int id,double salary){
        this.name=name;
        this.id=id;
        this.salary=salary;

    }
    public void set(String name,int id,double salary){
        this.name=name;
        this.id=id;
        this.salary=salary;

    }
    public void setName(String name){this.name=name;}

    public void setId(int id){this.id=id;}
    public void setSalary(double salary){this.salary=salary;}

    public void work(){

        System.out.println("工号为"+this.id+"基本工资为"+this.salary
                +"的程序员正努力写代码");
    }







}

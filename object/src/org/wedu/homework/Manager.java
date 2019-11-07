package org.wedu.homework;
//定义项目经理类Manager。属性：姓名name，工号id，工资salary，奖金bonus。行为：工作work()
//定义程序员类Coder。属性：姓名name，工号id，工资salary。行为：工作work()
public class Manager {

    private String name;
    private int id;
    private double salary;
    private double bonuse;

    public Manager(){}
    public Manager(String name,int id,double salary,double bonuse){
        this.name=name;
        this.id=id;
        this.salary=salary;
        this.bonuse=bonuse;

    }
    public String getName(){return this.name;}
    public int getId(){return this.id;}
    public double getSalary(){return this.salary;}
    public double getBonus(){return this.salary;}
    public void setName(String name){this.name=name;}

    public void setId(int id){this.id=id;}
    public void setSalary(double salary){this.salary=salary;}
    public void setBonus(double bonuse){this.bonuse=bonuse;}

    public void set(String name,int id,double salary,double bonuse){
        this.name=name;
        this.id=id;
        this.salary=salary;
        this.bonuse=bonuse;
    }
    public void work(){

        System.out.println("工号为"+this.id+"基本工资为"+this.salary+"奖金为"+this.bonuse
            +"的项目经理正在努力的做着管理工作,分配任务,检查员工提交上来的 代码.....");
    }



}

package com.itheima_07;

public class Student implements Comparable <Student>{
    private String name;
    private int chinese;
    private int math;

    public Student()  {
    }

    public Student(String name, int chinese, int math) {
        this.name = name;
        this.chinese = chinese;
        this.math = math;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChinese() {
        return chinese;
    }

    public void setChinese(int chinese) {
        this.chinese = chinese;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getSum(Student s){
        return s.getChinese()+s.getMath();
    }

    @Override
    public int compareTo(Student o) {

        int num=getSum(o)-getSum(this);
        int num2=o.getChinese()-this.getChinese();

        return num==0?num2:num;

    }
}

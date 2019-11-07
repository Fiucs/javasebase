package com.homeworld;

public class Student  {

    private double height;
    private double weigth;
    private int year;

    public Student(double height, double weigth, int year) throws StudentMsgException {

        if(140.0<=height &&height<=220 && weigth>=40 && weigth<=100 && year>=20 && year<=35) {
            this.height = height;
            this.weigth = weigth;
            this.year = year;
        }
        else {
            throw new StudentMsgException("输入有误");
        }
    }

    public Student() {
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if(140.0<=height &&height<=220.0)
        this.height = height;
        else
            throw new StudentMsgException("身高不合法(140~220cm)");
    }

    public double getWeigth() {
        return weigth;
    }

    public void setWeigth(double weigth)throws  StudentMsgException {
        if(weigth>=40.0 && weigth<=100.0)
        this.weigth = weigth;
        else
            throw new StudentMsgException("体重不合法(40~100kg)");
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year)throws  StudentMsgException {
        if(year>=20 && year<=35)
        this.year = year;
        else
            throw  new StudentMsgException("年龄不合法 （20~35）");
    }

    @Override
    public String toString() {
        return "Student{" +
                "height=" + height +
                ", weigth=" + weigth +
                ", year=" + year +
                '}';
    }
}

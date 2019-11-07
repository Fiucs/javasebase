package com.homework;

public class GamePlayer {
    private String name;
    private int age;//年龄18及以上
    private int grade;//等级
    private  String rank;//段位
    private int rankindex;//段位对应的次序
    //private int index;//记录下标

    public GamePlayer() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<18)
            throw new AgeException("年龄小于18，禁止注册信息");
        else
        this.age = age;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "GamePlayer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                ", rank='" + rank + '\'' +
                '}';
    }

    public int getRankindex() {
        return rankindex;
    }

    public void setRankindex(int rankindex) {
        this.rankindex = rankindex;
    }
}

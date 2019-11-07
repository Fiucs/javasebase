package com.itheima_04;

import java.util.Scanner;

public class Teachertest {
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);

        System.out.println("请输入学生分数");
        int score =s.nextInt();

        Teacher teacher=new Teacher();

        try {
            teacher.chechScore(score);
        } catch (ScoreException e) {
            e.printStackTrace();
        }
    }
}

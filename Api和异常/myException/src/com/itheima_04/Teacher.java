package com.itheima_04;

public class Teacher {


    public void chechScore(int score)throws ScoreException{
        if(score<0 || score>100){

            //throw  new ScoreException();
            throw  new ScoreException("分数应该在0-100分之间");

        }
        else
            System.out.println("分数正常");

    }
}

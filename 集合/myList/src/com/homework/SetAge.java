package com.homework;

import java.util.Scanner;

public class SetAge {

    public static void setAge(GamePlayer g){
        Scanner s=new Scanner(System.in);

        System.out.println("请重新输入年龄");
        int age=s.nextInt();
        try {
            g.setAge(age);

        }catch (AgeException e){
            e.printStackTrace();
            setAge(g);

        }




    }
}

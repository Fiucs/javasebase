package com.homeworld;

import java.util.Scanner;

public class Demon1 {

    public static void main(String[] args) {

        Student s1=new Student();
        int count=0;
        recordInfo(s1);
        System.out.println(s1);

    }


    public static void recordInfo(Student s1) {


        Scanner s = null;
        double height, weight;
        int year;


        while (s1.getYear()==0 || s1.getHeight()==0 || s1.getWeigth()==0) {

            System.out.println(s1);

            if (s1.getHeight() ==0) {
                try {
                    s = new Scanner(System.in);
                    System.out.println("请输入身高(140~220cm)");
                    height = s.nextDouble();
                    s1.setHeight(height);

                } catch (StudentMsgException e) {
                    e.printStackTrace();

                    continue;


                }
            }


            if ( s1.getWeigth()==0 ) {
                try {
                    System.out.println("请输入体重(40~100kg)");
                    weight = s.nextDouble();
                    s1.setWeigth(weight);

                } catch (StudentMsgException e) {
                    e.printStackTrace();
                    continue;

                }
            }


            if (s1.getYear()==0) {
                try {
                    System.out.println("请输入年龄(20~35岁)");
                    year = s.nextInt();
                    s1.setYear(year);

                } catch (Exception e) {
                    e.printStackTrace();
                    continue;

                }
            }


        }


    }


        }




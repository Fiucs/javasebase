package org.wedu.demo;

import java.util.Random;
import java.util.Scanner;

public class MethodHomeWork {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("--------------find minValue--------------------");
        System.out.println(findMinValue(9.9,00.1));
        System.out.println("--------------find minValue of 3 nums--------------------");
        System.out.println(findMInValue(10,2,99));
       /* System.out.println("--------------print graph--------------------");
        printGrah();*/
        System.out.println("--------------printMultiTable-------------------");
/*
        System.out.println("输入1~9之间的整数：");
        printMultiTable(s.nextInt());*/
        System.out.println("--------------print nums inorder-------------------");
       /* int []array1=new int[3];
        for (int i=0;i<3;i++)
        {
            System.out.println("请输入第"+(i+1)+"个整数");
            array1[i]=s.nextInt();
        }
        printNumInorder(array1[0],array1[1],array1[2]);*/
        System.out.println("--------------get absnum-------------------");
        System.out.println(getAbsNum(-0.99));
        System.out.println("--------------四舍五入-------------------");
        System.out.println(sishewuru(4.4));
        System.out.println(sishewuru(4.5));
        System.out.println("--------------抽奖-------------------");
        getRandomPrice(new int[]{2,588,888,1000,10000});
    }

    /*一个大V直播抽奖，奖品是现金红包，分别有{2,588,888,1000,10000}五个奖金。请使用代码模拟抽
 奖，打印出每个奖项，奖项的出现顺序要随机且不重复。打印效果如下：（随机顺序，不一定是下面的
 顺序）*/
    public static void getRandomPrice(int [] arr){
        Random r=new Random();
        int []tempArray=new int[]{-1,-1,-1,-1,-1};
        int count=0;//控制 抽奖不重复次数
        int temp;
        while (count<tempArray.length)
        {
            temp=r.nextInt(5);//得到随机数
            int i;
            for(i=0;i<tempArray.length;i++){
                if(arr[temp]==tempArray[i])
                    break;
            }
            System.out.println(i);
            if(i==arr.length)
            {
                System.out.println(arr[temp]+"元的奖金被抽出");
                tempArray[count]=arr[temp];
                count++;
            }

        }

    }
    public static int sishewuru(double num){
        return (int)(num+0.5);



    }




    public static double getAbsNum(double num){
        return num<0?(0-num):num;

    }
    public static void printNumInorder(int a,int b,int c){
        int max,mid,min;
        max=a>b?a:b;
        max=max>c?max:c;//a最
        min=a<b?a:b;
        min=min<c?min:c;
        if(a<max && a>=min)
            mid=a;
        else if(b<max && b>=min)
            mid=b;
        else
            mid=c;

        System.out.println(max+" "+mid+" "+min);


    }
    public static void printMultiTable(int n){
        for (int row=1;row<=n;row++)
        {
            for (int cow=1;cow<=row;cow++)
            {
                System.out.print(cow+"*"+row+"="+cow*row+" ");
            }
            System.out.println();

        }



    }
    public static void  printGrah(){
        Scanner s=new Scanner(System.in);
        System.out.println("输入行数：");
        int row=s.nextInt();
        System.out.println("输入列数：");
        int cow=s.nextInt();
        for (int i=0;i<row;i++)
        {
            for(int j=0;j<cow;j++)
            {
                System.out.print("@");
            }
            System.out.println();

        }

    }
    public static double findMinValue(double a,double b){

        return a<b?a:b;


    }
    public static int findMInValue(int a,int b,int c){
        a=a>b?a:b;
        return  a>c?a:c;

    }
}

package org.wedu.demo;

import java.util.Arrays;
import java.util.Scanner;

public class DebugHomeWork {
    public static void main(String[] args) {
        System.out.println("-------------1------------------");
//        loseWeightIf();
        System.out.println("-------------2------------------");
        passSeven(100);
        System.out.println("-------------3不死神rabit------------------");
        rabitsIncrease(20);
        System.out.println("-------------4百钱买白鸡------------------");
        chikenPm();
        System.out.println("-------------5数组元素求和------------------");
        shuzuqiuhe();
        System.out.println("-------------6-----------------");
        compareArry(new int[]{5,4,3,2,1},new int[]{1,2,3,4,5});
        System.out.println("---------2.8查找元素在数组中出现的索引位置---------------");
//        findIndexOfValue();
        System.out.println("----------2.9--数组元素反转【应用】------------");
        int array1[]=new int[]{1,2,3,4,5,6,7,8,9,10};
        reversrArray(array1);
        System.out.println("----------------2.10评委打分---------------------");
//        giveScores();
        System.out.println("----------------杨辉三角【应用】---------------------");
        printGrahp(10);

    }


/*  1
    1 1
    1 2 1
    1 3 3 1
    1 4 6 4 1*/

    public static void printGrahp(int n){

        int row=0,cow=0;
        int [][]arr=new int [n][];
        for (row=0;row<n;row++)
        {
            arr[row]=new int[row+1];
            for (cow=0;cow<=row;cow++)
            {
                if(cow==0 ||cow==row)
                {
                    arr[row][cow]=1;
                    System.out.print(1+" ");

                }
                else {
                    arr[row][cow]=arr[row-1][cow]+arr[row-1][cow-1];
                    System.out.print(arr[row][cow]+" ");

                }

            }
            System.out.println();
        }





        }
    //在编程竞赛中，有6个评委为参赛的选手打分，分数为0-100的整数分。 选手的最后得分为：去掉一个
    //最高分和一个最低分后 的4个评委平均值 (不考虑小数部分)。
    public static void giveScores(){
        Scanner s=new Scanner(System.in);
        int n=6;
        int temp;
        int []arr=new int[n];
        for (int i=0;i<n;){
            System.out.println("请第"+(i+1)+"位评委打分(分数在0~100):");
            temp=s.nextInt();
            if (temp>=0 && temp<=100) {
                arr[i] = temp;
                i++;
            }

        }
        //选出最大 最小值 下标遍历数组 比较找出最大 最小值

        int maxSub=0,minSub=0,sum=0;
        for (int i = 0; i < arr.length ;i++) {
            if(arr[i] >arr[maxSub] )
                maxSub=i;
            if(arr[i]<arr[minSub])
                minSub=i;
            sum+=arr[i];

        }
        int averageScore;
        averageScore=(sum-arr[maxSub]-arr[minSub])/4;
        System.out.println("最后得分:"+averageScore);

    }


    //2.9--数组元素反转【应用】
    public static void reversrArray(int [] arr){
        int temp;
        for (int i = 0,j=arr.length-1;i<j ; i++,j--) {
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;

        }
        System.out.println(Arrays.toString(arr));
    }

//2.8查找元素在数组中出现的索引位置
    public static void findIndexOfValue(){
        int []arr = {19, 28, 37, 46, 50};
        Scanner s=new Scanner(System.in);
        System.out.println("请输入要查询位置的数字");
        int num=s.nextInt();
        int i;
        for (i = 0; i < arr.length; i++) {
            if(arr[i]==num)
                break;

        }
        if(i==arr.length){
            System.out.println("数字未找到");

        }
        else {
            System.out.println("数字位置为:"+i);
        }

    }

    //定义一个方法，用于比较两个数组的内容是否相同

    public static void compareArry(int [] arr1,int [] arr2)
    {
        int begin=0;//下标

        if(arr1.length!=arr1.length)
        {
            System.out.println("两数组长度不等");
            return;
        }
    /*    Arrays.sort(arr1);
        Arrays.sort(arr2);*/
        while (begin<arr1.length)
        {
            if(arr1[begin]==arr2[begin]){
                begin++;

            }
            else
                break;

        }
        if(begin==arr1.length)
        {
            System.out.println("相等");
        }
        else {
            System.out.println("不相等");
        }


    }
    //有这样的一个数组，元素是{68,27,95,88,171,996,51,210}。求出该数组中满足要求的元素和， 要求
    //是：求和的元素个位和十位都不能是7，并且只能是偶数
    public static void shuzuqiuhe(){

        int arr[]={68,27,95,88,171,996,51,210};
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]/10 !=7 && arr[i]%10!=7 && arr[i]%2==0){
                sum+=arr[i];

            }

        }
        System.out.println("满足条件的数字和"+sum);




    }


// 鸡公 5         鸡母  3          鸡雏3只1元

    public static void chikenPm(){

        int jigong=0;
        int jimu=0;
        int jitong=0;
        int sum=0;
        for (jigong = 0;  jigong<20; jigong++) {
             for (jimu=0;jimu<33;jimu++)
             {

                    jitong=100-jigong-jimu;
                     sum=jigong*5+jimu*3+jitong/3;
                     if(sum==100 && jitong%3==0 &&(jigong+jimu+jitong)==100)
                     {

                         System.out.println("jigong"+jigong+"jimu"+jimu+"jitong"+jitong);

                     }


             }

             }

        }

//    有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，
//假如兔子都不死，问第二十个月的兔子对数为多少？
// 1 1  2   3      5 斐波拉切


    public static void rabitsIncrease(int month){

        int value=1;
        int arr[]=new int [month];
        for (int i = 0; i <month; i++) {
            if(i<2)
                arr[i]=1;
            else {
                arr[i]=arr[i-1]+arr[i-2];

            }


        }





        System.out.println(Arrays.toString(arr));
        System.out.println(arr[month-1]);



    }

    public static void passSeven(int n){
        //找出7 的倍数 或含7的数字
        //判断十位 各位是否等于7，，判断对7求余是否等于0
        System.out.print("逢7过的数字为:"+" ");
        for (int i=1;i<n;i++){
            if(i%7==0 || i%10==7 ||i/10==7)
                System.out.print(i+" ");

        }
        System.out.println();



    }
    public static void loseWeightIf(){
        Scanner s=new Scanner(System.in);
        System.out.println("减肥计划---输入1---7数字");
        //周一：跑步 周二：游泳 周三：慢走 周四：动感单车 周五：拳击
        //周六：爬山 周日：好好吃一顿
        int num=s.nextInt();
        if(num==1)
        {
            System.out.println("跑步");
        }
        else if(num==2){
            System.out.println("游泳");
        }
        else if(num==3){
            System.out.println("慢走");
        }
        else if(num==4){System.out.println("动感单车");}
        else if(num==5){System.out.println("拳击");}
        else if(num==6){System.out.println("爬山");}
        else if(num==7){System.out.println("吃火锅");}
        else {
            System.out.println("输入错误");
        }

    }
    public static void loseWeightSwitch(){


    }

}

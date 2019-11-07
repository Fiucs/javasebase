package org.wedu.demo;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayHomeWork {
    public static void main(String[] args) {

        //testOneToSix();

        testSeven();
        testEight();
    }

    public static void testEight(){
        System.out.println("put odd to left,even to right");
        int [] array={72,89,65,87,91,82,71,93,76,68,88};
        int [] newArray=new int[array.length];
        int left=0,right=array.length-1;
        for (int i=0;i<array.length;i++) {
            if(array[i]%2!=0) {
                newArray[left] = array[i];
                left++;
            }
            else
            {
                newArray[right]=array[i];
                right--;
            }


        }
        System.out.println(Arrays.toString(newArray));



    }
    public static void testSeven(){
        System.out.println("--------analysis stock---------");
        double [] array={10.4/100,-3/100,-6.2/100,1.2/100,-6.1/100,-19/100,-3.8/100,0.9/100,-4.5/100,5.5/100};
        int countBenefit=0;
        int countLoss=0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]>0)
                countBenefit++;
            else
                countLoss++;

        }
        System.out.println("benefit stocks:"+countBenefit+" "+"loss money:"+countLoss);

    }

    public static void testOneToSix(){


        System.out.println("-------------1.----------------");
        int []array01={5,10,1,5,18,9};
        for (int i = 0; i < array01.length; i++) {
            System.out.print(array01[i]+" ");

        }
        System.out.println();
        System.out.println("-------------2.----------------");
        double [] array02={12.9,53.54,75.0,99.1,3.14};
        double minValue=array02[0];
        for (double v : array02) {
            if(v<minValue)
                minValue=v;
        }
        System.out.println("minvalue is "+ minValue);
        System.out.println("-------------3.----------------");
        int [] array03=new int[6];
        for (int i = 0; i < array03.length; i++) {
            array03[i]=(int)(Math.random()*100);

        }
        int sum=0;
        for (int i : array03) {
            sum+=i;

        }
        System.out.println("长度为6的数组的所有值和为:"+sum);
        System.out.println("-------------4.----------------");
        int []array04={1,2,5,8,0};
        int num=0;
        for (int i = 0; i < array04.length; i++) {
            num=num*10+array04[i];


        }
        System.out.println(num);
        System.out.println("-------------5.定义一个数组来存储10个学生的成绩计算并输出学生的平均成绩。----------------");
        int [] array05={72,89,65,87,91,82,71,93,76,68};
        sum=0;
        for (int i = 0; i < array05.length; i++) {
            sum+=array05[i];

        }
        System.out.println((double)(sum)/array05.length);
        System.out.println("-------------6.----------------");
        /*把数字放入数组序列中，生成一个新的数组，并且数组的元素依旧是从小到大排列
        的。执行效果如下：*/
        int [] array06={12,14,23,45,66,68,70,77,90,91};
        Scanner s=new Scanner(System.in);
        System.out.println("请输入一个要插入的数字整数");
        num=s.nextInt();
        int index=0;

        int []arrayTemp=new int[array06.length+1];
        while (num>array06[index]){
            index++;//找到 输入的数字的位置


        }
        for (int i = 0; i < arrayTemp.length;) {
            if(i<index)
            {
                arrayTemp[i]=array06[i];
                i++;
            }
            else if(i==index)
            {
                arrayTemp[i]=num;

                i++;
            }
            else{
                arrayTemp[i]=array06[i-1];
                i++;

            }

        }

        System.out.println(Arrays.toString(arrayTemp));

    }




}

package org.wedu.demo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class ArrayTest02 {
    public static void main(String[] args) {

    callName();



    }



    public static  void callName(){
        //1.开始点名 2.录入姓名 2.退出

        Scanner input =new Scanner(System.in);
        String [] nameList=new String[52];
        Random r=new Random();
        int i=0;

        while (true){
            System.out.println("请输入数字 1，开始点名 2.录入名字 3.自动录入 4.退出");

            String keyWord=input.next();
            char []charArr=keyWord.toCharArray();

            if(charArr.length>1) {
                System.out.println("请重新输入");
                continue;
            }
            if(charArr[0] <'1' || charArr[0] >'4') {


                System.out.println("请重写输入");

                continue;
            }

           String key=charArr[0]+"";
            switch (key)
            {
                case "1":
                    System.out.println(nameList[r.nextInt(52)]);

                    break;
                case "2":
                    if(i>=52)
                    {
                        System.out.println("名字已经录完了");
                        break;
                    }
                    System.out.println("请输入姓名");
                    nameList[i]=input.next();

                    i++;
                    break;
                case "3":
                try (BufferedReader br=new BufferedReader(new FileReader("name.txt"))){
                    if(i>=52)
                    {
                        System.out.println("名字已经录完了");
                        break;
                    }
                    String name;

                    while ((name=br.readLine())!=null)
                    {
                        nameList[i]=name;
                        i++;
                    }



                }
                catch (FileNotFoundException e){
                    e.printStackTrace();

                }
                catch (IOException e){
                    e.printStackTrace();

                }

                    break;
                case "4":
                    return;


                default:
                    System.out.println("输入错误");



            }





        }








    }

    public static  void test01(){

    int [] array1=new int[3];
    array1[0]=100;//ctrl+d 复制当前行到下一行
    array1[1]=110;//shift + enter 光标直接移到下一行
    array1[2]=111;//shift + enter 光标直接移到下一行


    //itar 直接写出 for循环
        for(int i = array1.length - 1; i >= 0; i--) {
        int i1 = array1[i];

             }
    }
}

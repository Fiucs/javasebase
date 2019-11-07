package test;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) throws IOException {
        //question1();
       // question2();
       // question3();

        //System.out.println(isZhishu(11));
       // question4();
        System.out.println(test());


    }

    static int test()
    {
        int x = 1;
        try
        {
            x++;
            return x;//x加的值会保存成一个临时变量  return返回的其实是 临时变量
        }
        finally
        {
            ++x;
            return x;//x加的值会保存成一个临时变量 return返回的其实是 临时变量
        }
    }


    public static void question1(){

        System.out.println("1.\t编程完成map集合的遍历");
        HashMap<String, String> map = new HashMap<>();
        map.put("1","a");
        map.put("2","b");
        map.put("3","c");

        for (String s : map.keySet()) {
            System.out.println(s+": "+map.get(s));
        }



    }
    public static void question2()throws IOException {
        System.out.println("、编程通过IO流完成对java 第15章  15_类加载器&反射&模" +
                "块化中文件加中第一个视频文件----01_类加载.avi的复制");
        BufferedInputStream bis=new BufferedInputStream(new FileInputStream("D:\\JavaSE高级\\15_类加载器&反射&模块化\\视频\\01_类加载.avi"));
        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("algorithm\\src\\test\\01_类加载.avi"));

        int len;
        byte [] by=new byte[2048];
        while ((len=bis.read(by))!=-1)
        {
            bos.write(by,0,len);
        }
        bis.close();
        bos.close();

    }
    public static void question3(){
        System.out.println("3.\t在一个字符串中找到出现指定次数的字符并通过控制台输出。");
        System.out.println("请输入字符串");
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        System.out.println("请输入字母出现的次数");
        int num=s.nextInt();

        //str="abaccdeff";
        String[] split = str.split("");

        HashMap<String,Integer> map=new HashMap<>();

        for (String s1 : split) {
            if (map.get(s1)!=null)
                map.put(s1,map.get(s1)+1);
            else
                map.put(s1,1);
        }
        //得到含次数的 字母 map



        //输出
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue()==num)
                System.out.println(entry.getKey());

        }


    }
    public static void question4(){
        System.out.println("给定一个正整数，编写程序" +
                "计算有多少对质数的和等于输入的这个正整数，并输出结果。输入值小于1000。");
        System.out.println("请输入数字");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();

        int count=0;//记录次数
        for (int i = 1; i <=n/2 ; i++) {
            int other=n-i;
            if(isZhishu(i)&&isZhishu(other)) {
                count++;
                System.out.println(i+","+other);
            }
        }
        System.out.println(n+"的质数对有"+count+"个");

    }


    public static boolean isZhishu(int n){

        if( n==1 )
            return true;
        for (int i = 2; i <n; i++) {
            if (n%i==0)
            {
                return false;
            }
        }
        return true;
    }



}

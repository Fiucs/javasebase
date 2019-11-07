package com.itheima_02;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
    Java 中的异常被分为两大类：编译时异常和运行时异常，也被称为受检异常和非受检异常
    所有的 RuntimeException 类及其子类的实例被称为运行时异常，其他的异常都是编译时异常

    编译时异常：必须显示处理，否则程序就会发生错误，无法通过编译
    运行时异常：无需显示处理，也可以和编译时异常一样处理
 */
public class ExceptionDemo03 {
    public static void main(String[] args) {

	method();
	method2();

    }

    public  static void method(){
        //运行时异常

        try {
            int []arr={1,2,3};
            System.out.println(arr[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }
    public  static void method2(){
        try {
            String s="2018-08-08";
            SimpleDateFormat sfm=new SimpleDateFormat("yyyy-MM-dd");
            Date d=sfm.parse(s);
            System.out.println(d);
        } catch (ParseException e)//又可能出问题
        {
            e.printStackTrace();
        }


    }

}

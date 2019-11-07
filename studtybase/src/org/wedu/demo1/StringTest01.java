package org.wedu.demo1;

import java.util.Random;
import java.util.Scanner;

public class StringTest01 {

    public static void main(String[] args) {
        userLogin();
    }

    public static void userLogin(){
        Scanner s=new Scanner(System.in);
        String name;
        String passwd;
        String icd="QWERTYUIOPLMNBVCXZASDFGHJKqwertyuioplmnbvcxzasdfghjk1234567890";
        String checkQRinput;
        String checkQR="";
        Random r=new Random();
        char [] checkArray=icd.toCharArray();
        for (int i = 0; i <3; i++) {
            checkQR="";
            for(int j=0;j<4;j++)
            {
                checkQR+=checkArray[r.nextInt(checkArray.length)];

            }
            /*checkQR=String.valueOf(checkArray);*/

            if(i!=0)

                System.out.println("还剩"+(3-i)+"次输入机会");
            System.out.println("请输入用户名");
            name=s.next();
            System.out.println("请输入密码");
            passwd=s.next();
            System.out.println("请输入验证码"+checkQR);
            checkQRinput=s.next();

            if(name.equals("Lee") && passwd.equals("12345") )
            {
                while (true) {
                    if( checkQR.equals(checkQRinput)) {
                        System.out.println("登陆成功");
                        return;
                    }
                    else {
                        System.out.println("验证码输入错误");
                        System.out.println("请输入验证码"+checkQR);
                        checkQRinput=s.next();
                    }
                }

            }
            else
            System.out.println("用户名或密码输入错误");

        }

        System.out.println("登录失败 ，三次输入机会用完");

    }
}

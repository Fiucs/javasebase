package com.classWork1;

import java.io.*;
import java.util.Scanner;

public class RegisterAndLogin {

   public static Scanner s=new Scanner(System.in);
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        while (true) {
            System.out.println("请输入需要操作的序号：1:注册 2:登录");
            int choose = s.nextInt();
            s.nextLine();

            switch (choose) {
                case 1:
                    //注册逻辑
                    regist();
                    break;
                case 2:
                    //登录逻辑
                    login();
                    break;
            }

        }


    }

    /**
     * 登录
     *///需要抛出异常
    public static void login() throws ClassNotFoundException {

        System.out.println("请输入用户名");


        String name=s.nextLine();
        System.out.println("请输入密码");
        String passwd=s.nextLine();
        try {
            if(Check.userNamePasswd(name,passwd))
            {
                System.out.println("登录成功");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }catch (MyMesseageException e){
            e.printStackTrace();
        }

        System.out.println("虎牙一哈");


    }

    /**
     * 注册方法
     */
    public static void regist() throws IOException, ClassNotFoundException {

     //   BufferedWriter br=new BufferedWriter(new FileWriter("字符流&字节缓冲流\\myCharStream\\src\\com\\classWork1\\name&passwd.txt",true));

        File file=new File("字符流&字节缓冲流\\myCharStream\\src\\com\\classWork1\\name&passwd.txt");
        ObjectOutputStream oos=null;
        System.out.println(file.length());
        while (true) {

            if(!file.exists()||file.length()==0)//文件不存在 ，或文件内容为空
            {

                System.out.println("请输入用户名");
                String name = s.nextLine();

                System.out.println("请输入密码");
                String passwd = s.nextLine();
               // oos.writeObject(new User(name,passwd));
                oos=new ObjectOutputStream(new FileOutputStream(file,true));
                oos.writeObject(new User(name,passwd));
            }
            else {

                System.out.println("请输入用户名");
                String name = s.nextLine();
                if (Check.userNamePasswd(name)) {
                    System.out.println("用户名已存在");
                    continue;

                }
                System.out.println("请输入密码");
                String passwd = s.nextLine();

                oos=new MyObjectOutputStream(new FileOutputStream(file,true));
                oos.writeObject(new User(name,passwd));

            }

            //br.write(name + " " + passwd);
            //br.newLine();
            break;
        }
       // br.close();

        oos.close();

    }
}

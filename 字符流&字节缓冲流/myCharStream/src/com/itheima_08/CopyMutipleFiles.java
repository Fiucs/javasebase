package com.itheima_08;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class CopyMutipleFiles {

    //法一 先判断是否是目录再遍历目录


    //法二


        //src D:\\AddonPeds 3.0.1.汉化版

        //des 目标目录G:\idea2019\javaSeBase\字符流&字节缓冲流\myCharStream\src\com\itheima_08
    public static void main(String[] args) throws IOException {
        File file = new File("G:\\课件和资料\\java20198\\软件测试");
        File des=new File("C:\\Users\\lee\\Desktop\\新建文件夹 (2)\\test");

       /*     File newFile = new File(des, file.getName());
            if (!newFile.mkdir())
                System.out.println(newFile.getAbsolutePath() + " " + " 目录创建失败");
            copyMutipleFiles1(file, newFile);*/

       copyMutipleFiles2(file,des);



    }

    //只能复制目录
    public static void copyMutipleFiles1(File src,File des) throws IOException {
        File[] files = src.listFiles();
        if(files==null)
            return;

        else {

            for (File file1 : files) {

                if (file1.isDirectory()){
                    File newDes=new File(des,file1.getName());
                   // System.out.println(newDes.getPath());
                    if(!newDes.mkdir())
                        System.out.println("错误");
                    copyMutipleFiles1(file1,newDes);
                }
                else
                    //System.out.println(file1.getPath());
                {
                    System.out.println(src.getPath());
                    FileOutputStream fos = new FileOutputStream(des.getPath() +"\\"+ file1.getName());
                    FileInputStream fis = new FileInputStream(file1);
                    int len;
                    byte[] bytes = new byte[2048];
                    while ((len = fis.read(bytes)) != -1) {

                        fos.write(bytes, 0, len);

                    }
                    fis.close();
                    fos.close();

                }

            }


        }





    }


    public static void copyMutipleFiles2(File src,File des) throws IOException{

        //1.判断 是否是目录
            //是  创建目录 遍历 并递归调用

            //不是 直接复制文件

        if(src.isDirectory()){

            File newDes = new File(des, src.getName());
            if(!newDes.exists())
                newDes.mkdir();
            File[] files = src.listFiles();//获得该目录下所有内容

            for (File file : files) {//遍历

                copyMutipleFiles2(file,newDes);

            }

        }else{
            //复制文件
            FileOutputStream fos = new FileOutputStream(des.getPath() +"\\"+ src.getName());
            FileInputStream fis = new FileInputStream(src);
            int len;
            byte[] bytes = new byte[2048];
            while ((len = fis.read(bytes)) != -1) {

                fos.write(bytes, 0, len);

            }
            fis.close();
            fos.close();



        }






    }
}

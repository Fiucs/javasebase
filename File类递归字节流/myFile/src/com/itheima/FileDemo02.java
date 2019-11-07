package com.itheima;

import java.io.File;
import java.io.IOException;

/*
    File类创建功能：
        public boolean createNewFile()：当具有该名称的文件不存在时，创建一个由该抽象路径名命名的新空文件

        public boolean mkdir()：创建由此抽象路径名命名的目录
        public boolean mkdirs()：创建由此抽象路径名命名的目录，包括任何必需但不存在的父目录
 */
public class FileDemo02 {
    public static void main(String[] args) throws IOException {
        //需求1：我要在E:\\itcast目录下创建一个文件java.txt
        File file1=new File("File类递归字节流\\myFile\\java.txt");
        System.out.println(file1.delete());

        //需求2：我要在E:\\itcast目录下创建一个目录JavaSE
        File file2 = new File("File类递归字节流\\myFile\\java1111");
        System.out.println( file2.mkdir());


        //需求3：我要在E:\\itcast目录下创建一个多级目录JavaWEB\\HTML
        File file3= new File("File类递归字节流\\myFile\\javaSEW\\java.txt");//路径必须存在 才能创建文件
        System.out.println(file3.createNewFile());


        //需求4：我要在E:\\itcast目录下创建一个文件javase.txt

    }
}

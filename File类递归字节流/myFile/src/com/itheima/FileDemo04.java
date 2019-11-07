package com.itheima;

import java.io.File;
import java.io.IOException;

/*
    File类的判断和获取功能：
        public boolean isDirectory()：测试此抽象路径名表示的File是否为目录
        public boolean isFile()：测试此抽象路径名表示的File是否为文件
        public boolean exists()：测试此抽象路径名表示的File是否存在

        public String getAbsolutePath()：返回此抽象路径名的绝对路径名字符串
        public String getPath()：将此抽象路径名转换为路径名字符串
        public String getName()：返回由此抽象路径名表示的文件或目录的名称

        public String[] list()：返回此抽象路径名表示的目录中的文件和目录的名称字符串数组
        public File[] listFiles()：返回此抽象路径名表示的目录中的文件和目录的File对象数组
 */
public class FileDemo04 {
    public static void main(String[] args) throws IOException {

        File file2 = new File("File类递归字节流\\myFile\\java.txt");
        System.out.println(file2.createNewFile());
        File file3 = new File("File类递归字节流");
        System.out.println(file2);
        System.out.println(file2.isDirectory()+" "+file3.isDirectory());

        System.out.println(file2.getAbsolutePath());
        System.out.println(file2.getPath());
        System.out.println(file2.getName());

        System.out.println(file3.list());
        System.out.println(file3.listFiles());



       
    }
}

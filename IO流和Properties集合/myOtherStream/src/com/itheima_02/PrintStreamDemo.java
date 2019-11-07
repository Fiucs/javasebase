package com.itheima_02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/*
    打印流的特点：
        只负责输出数据，不负责读取数据
        有自己的特有方法

    字节打印流
        PrintStream​(String fileName)：使用指定的文件名创建新的打印流
 */
public class PrintStreamDemo {
    public static void main(String[] args) throws FileNotFoundException {


        ////PrintStream(String fileName)：使用指定的文件名创建新的打印流
        PrintStream ps = new PrintStream(new FileOutputStream("IO流和Properties集合\\myOtherStream\\src\\com\\itheima_02\\print.txt"));
      //  PrintStream ps = new PrintStream("IO流和Properties集合\\myOtherStream\\src\\com\\itheima_02\\print.txt");
        ps.println("china");
        ps.println("我爱你你中国");
        ps.close();
        



    }
}

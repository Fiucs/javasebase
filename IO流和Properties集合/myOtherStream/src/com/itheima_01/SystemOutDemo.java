package com.itheima_01;

import com.itheima_02.PrintStreamDemo;

import java.io.PrintStream;

/*
    public static final PrintStream out：标准输出流。通常该流对应于显示输出或由主机环境或用户指定的另一个输出目标
 */
public class SystemOutDemo {
    public static void main(String[] args) {

        PrintStream ps=System.out;

        ps.println("好的");
        System.out.println();
    }
}

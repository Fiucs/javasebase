package com.itheima_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
    public static final InputStream in：标准输入流。通常该流对应于键盘输入或由主机环境或用户指定的另一个输入源
 */
public class SystemInDemo {
    public static void main(String[] args) throws IOException {

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        String s=input.readLine();
        System.out.println(s);
         s=input.readLine();
        System.out.println(s);


    }
}

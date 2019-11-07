package com.itheima_01;

import javax.sound.midi.Soundbank;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/*
    编码：
        byte[] getBytes()：使用平台的默认字符集将该 String编码为一系列字节，将结果存储到新的字节数组中
        byte[] getBytes(String charsetName)：使用指定的字符集将该 String编码为一系列字节，将结果存储到新的字节数组中

    解码：
        String(byte[] bytes)：通过使用平台的默认字符集解码指定的字节数组来构造新的 String
        String(byte[] bytes, String charsetName)：通过指定的字符集解码指定的字节数组来构造新的 String
 */
public class StringDemo {
    public static void main(String[] args) throws UnsupportedEncodingException {
        //定义一个字符串
        String s = "在啊";

        byte[] by1 = s.getBytes();//[-26, -74, -109, -18, -123, -98, -26, -75, -105]
        byte [] by2 =s.getBytes("GBK");//[-28, -72, -83, -27, -101, -67]
        byte [] by3 =s.getBytes("UTF-8");//[-26, -74, -109, -18, -123, -98, -26, -75, -105]

       //System.out.println(new String(by1));
      //  System.out.println(new String(by2));

        System.out.println(Arrays.toString(by1));
        System.out.println(Arrays.toString(by2));
        System.out.println(Arrays.toString(by3));

      //  System.out.println(new String(by2,"GBK"));



    }
}

package com.itheima_04;


import java.io.*;
import java.util.Date;
import java.util.Properties;

/*
    Properties和IO流结合的方法：
        void load(Reader reader)：
            从输入字符流读取属性列表（键和元素对）

        void store(Writer writer, String comments)：
            将此属性列表（键和元素对）写入此 Properties表中，以适合使用 load(Reader)方法的格式写入输出字符流
 */
public class PropertiesDemo03 {
    public static void main(String[] args) throws IOException {
        Properties pro = new Properties();
        //把集合中的数据保存到文件
        BufferedWriter bw=new BufferedWriter(new FileWriter("IO流和Properties集合\\myOtherStream\\fw.txt"));
        pro.setProperty("詹姆斯","湖人");
        pro.setProperty("戴维斯","湖人");
        pro.setProperty("霍华德","湖人");
        pro.store(bw,null);


        //把文件中的数据加载到集合


        BufferedReader br=new BufferedReader(new FileReader("IO流和Properties集合\\myOtherStream\\fw.txt"));

        pro.load(br);
        br.close();
        for (Object o : pro.keySet()) {
            System.out.println((String)o+" "+pro.getProperty((String)o));
        }



    }

}

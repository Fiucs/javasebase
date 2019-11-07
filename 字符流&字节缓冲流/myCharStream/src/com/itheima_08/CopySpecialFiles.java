package com.itheima_08;

import java.io.*;

public class CopySpecialFiles {

    public static void main(String[] args) throws IOException {

        File src=new File("G:\\课件和资料\\java20198\\zuoye");
        File des=new File("字符流&字节缓冲流\\myCharStream\\src\\com\\itheima_08");


        copySpecialFiles(src,des);
    }


    public static void copySpecialFiles(File src,File des) throws IOException {
        if(!src.exists())
            return;

        if(src.isDirectory())

        {
            //是目录则创建目录
            File newDes=new File(des,src.getName());//获取当前文件的路径

            if(!newDes.mkdir())
                System.out.println("目录创建失败");

            File[] files = src.listFiles();//列出所有目录下所有文件

            for (File file : files) {

                copySpecialFiles(file,newDes);
            }



        }

        else {
            //拷贝操作    （只拷贝.java结尾的文件）
            FileInputStream fis = new FileInputStream(src);//读




            //1.split 分割
            String s=src.getName().toLowerCase();
            String [] ss=s.split("\\.");

            if(ss.length==2 && ss[1].equals("java"))
            {
                System.out.println(src.getName());
                PrintStream ps=new PrintStream(new FileOutputStream(des+"\\"+src.getName()));//写 打印流//构造方法直接复制源文件到新的位置
                int len;
                byte[] bytes = new byte[2048];
                while ((len = fis.read(bytes)) != -1) {

                    ps.write(bytes, 0, len);

                }


                ps.close();
            }
            fis.close();


            //2. 正则表达式

        }





    }



}

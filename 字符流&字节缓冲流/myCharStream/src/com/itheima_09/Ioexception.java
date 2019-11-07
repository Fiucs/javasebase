package com.itheima_09;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ioexception {

    public static void main(String[] args) {

    }


//不处理 抛出异常
    public static void method01() throws IOException {

        FileReader fr=new FileReader("fade.txt");
        FileWriter fw=new FileWriter("fade.txt");

        char [] chars=new char[1024];
        int len;
        while ((len=fr.read(chars))!=-1){

            fw.write(chars,0,len);

        }
        fr.close();
        fw.close();

    }

    //try ..catch()..finally
    public  static void method02(){

        FileReader fr=null;
        FileWriter fw=null;

        try {
             fr=new FileReader("fade.txt");
             fw=new FileWriter("fade.txt");

            char [] chars=new char[1024];
            int len;
            while ((len=fr.read(chars))!=-1){

                fw.write(chars,0,len);

            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            if(fr!=null){

                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(fw!=null){
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }


        }


    }

    //JDK7  比较简洁
    public static void method03() throws IOException {

        try (FileReader fr=new FileReader("fade.txt");
             FileWriter fw=new FileWriter("fade.txt");){


            char [] chars=new char[1024];
            int len;
            while ((len=fr.read(chars))!=-1){

                fw.write(chars,0,len);

            }
        }
        catch (IOException e){
            e.printStackTrace();
        }


    }


}

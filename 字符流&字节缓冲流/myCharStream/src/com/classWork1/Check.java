package com.classWork1;

import java.io.*;

public class Check {
    //"字符流&字节缓冲流\\myCharStream\\src\\com\\classWork1\\name&passwd.txt"
    public static boolean userNamePasswd(String name,String passwd) throws IOException, ClassNotFoundException {
        BufferedReader br=new BufferedReader(new FileReader("字符流&字节缓冲流\\myCharStream\\src\\com\\classWork1\\name&passwd.txt"));

        FileInputStream fis=new FileInputStream("字符流&字节缓冲流\\myCharStream\\src\\com\\classWork1\\name&passwd.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        String s;
        //(s=br.readLine())!=null
        while (fis.available()>0)
        {
           // String [] s1=s.split(" ");
            User u=(User) ois.readObject();
      /*      if(s1.length==2 && s1[0].equals(name))
                if(s1[1].equals(passwd))
                    return true;
                else
                    throw new MyMesseageException("用户名存在，密码错误");*/

            if(u.getName().equals(name)){
                if(u.getPasswd().equals(passwd))
                    return true;
                else
                    throw new MyMesseageException("用户名存在，密码错误");

            }


        }

        throw new MyMesseageException("用户名不存在");



    }
    public static boolean userNamePasswd(String name) throws IOException, ClassNotFoundException {
       // BufferedReader br=new BufferedReader(new FileReader("字符流&字节缓冲流\\myCharStream\\src\\com\\classWork1\\name&passwd.txt"));

        FileInputStream fis=new FileInputStream("字符流&字节缓冲流\\myCharStream\\src\\com\\classWork1\\name&passwd.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        String s;
        //(s=br.readLine())!=null
        while (fis.available()>0)
        {
            /*String [] s1=s.split(" ");
            if(s1.length==2 && s1[0].equals(name))
                return true;
*/
            User u=(User)ois.readObject();
            if(u.getName().equals(name))
                return true;
        }


       return false;


    }





    }


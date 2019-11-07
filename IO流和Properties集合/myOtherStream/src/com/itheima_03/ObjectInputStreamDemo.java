package com.itheima_03;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/*
    构造方法：
        ObjectInputStream​(InputStream in)：创建从指定的InputStream读取的ObjectInputStream

    反序列化对象的方法：
        Object readObject​()：从ObjectInputStream读取一个对象
 */
public class ObjectInputStreamDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        FileInputStream fis=new FileInputStream("IO流和Properties集合\\myOtherStream\\src\\com\\itheima_03\\os.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Student s=null;
        //(s=(Student) ois.readObject())!=null
        while (fis.available()>0)//有问题 抛出异常 EOFException 包含 null
        {
            s=(Student) ois.readObject();
            System.out.println(s);

        }


    }
}

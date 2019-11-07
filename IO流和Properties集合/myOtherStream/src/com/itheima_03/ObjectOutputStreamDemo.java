package com.itheima_03;

import java.io.*;

/*
    对象序列化流
        构造方法：
            ObjectOutputStream​(OutputStream out)：创建一个写入指定的OutputStream的ObjectOutputStream

        序列化对象的方法：
            void writeObject​(Object obj)：将指定的对象写入ObjectOutputStream
 */

//NotSerializableException  类的序列化由实现java.io.Serializable接口的类启用。 不实现此接口的类将不会使任何状态序列化或反序列化。
public class ObjectOutputStreamDemo {
    public static void main(String[] args) throws IOException {


        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("G:\\idea2019\\javaSeBase\\IO流和Properties集合\\myOtherStream\\src\\com\\itheima_03\\os.txt"));

        Student s = new Student("撒大", 66);

        oos.writeObject(s);
        Student s1=new Student("撒旦",77);

        oos.writeObject(s1);
        //oos.writeObject(null);//加入 null 不然报错IOEOF  错误
        Student s2=new Student("撒1旦",77);

        oos.writeObject(s2);


        oos.close();
    }
}

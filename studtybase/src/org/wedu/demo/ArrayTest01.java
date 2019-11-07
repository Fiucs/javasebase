package org.wedu.demo;

public class ArrayTest01 {
    public static void main(String[] args) {
        //什么是数组
        arrayTest01();


    }


    public static void arrayTest01(){




   /*     ctrl + shift+/ 区域注释
    ctrl + / 单行注释
*/
    //第一种数据类型 定义
/*    int [] array1;
    boolean [] array2;
    char [] array3;
    //第二种定义方式
    String array4 [];*/
//数组初始化 即分配空间
        //第一种初始化方式 动态初始化 只给长度 系统给出默认值
        // int [] array =new int [3]
        int lens=50;
        int [] array1=new int [lens];
        for (int i=0;i<array1.length;i++)
            array1[i]=i+1;

        for (int i=0;i<50;i++)
            System.out.print(array1[i]+" ");
        System.out.println();

        boolean [] array2=new boolean [10];
        array2[0]=true;
        array2[1]=false;
        //byte short int long 默认0
        //float double 默认为 0.0
        //char 为 空字符  boolean 为 false
        //引用数据类型 为 null

        //成员变量 存储在栈空间 其（引用数据类型时）指向堆空间或常量池



    }

}

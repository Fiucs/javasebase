package org.wedu.demo;

public class ArrayTest03 {
    public static void main(String[] args) {
        System.out.println("----------------static or dynamic define--------------");
        base01();
        System.out.println("----------------find special num-----------------------");
        findSpecialNum();
    }

    public static void base01(){

        String str1="阿斯达阿斯达萨达撒旦"+9527;
        String [] strArray={"Anti","Fake","Naughty"};
        String [] strArray1=new String[] {"Coco","Sina","Facebook","Twiter"};

        System.out.println("字符数组长度:"+strArray.length);
        System.out.println("字符串长度:"+str1.length());




    }
    public static void findSpecialNum(){

        int [] array01={10,9,2,23,32,4,65,101,55};

        int minValue=array01[0];
        int maxValue=array01[0];
        for (int i : array01) {
            if(i<minValue)
                minValue=i;
            if(i>maxValue)
                maxValue=i;

        }
        System.out.println("minValue:"+minValue+"\n"+"maxValue"+maxValue);


    }


}

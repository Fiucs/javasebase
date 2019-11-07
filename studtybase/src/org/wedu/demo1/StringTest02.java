package org.wedu.demo1;import java.util.Scanner;
public class StringTest02 {
    public static void main(String[] args) {
        //countCaseNum();
       reverseStr();
        //strinGBuilder();
        concatStr("qwer");
    }

    public static void countCaseNum() {
        int upperCaseNum = 0;
        int lowerCaseNum = 0;
        int num = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("请输入要统计的字符串");
        String str = input.next();
        char[] strArray = str.toCharArray();
        for (int i = 0; i < str.toCharArray().length; i++) {
            if (strArray[i] <= 'z' && strArray[i] >= 'a') lowerCaseNum++;
            if (strArray[i] <= 'Z' && strArray[i] >= 'A') upperCaseNum++;
            if (strArray[i] <= '9' && strArray[i] >= '0') num++;
        }
        System.out.println("大写字母出现：" + upperCaseNum + "  小写字母出现：" + lowerCaseNum + " 数字出现次数" + num);
    }

    public static void concatStr(String s) {

     StringBuilder s1=new StringBuilder();
        s1.append( "[");
        for(int i=0; i<s.length(); i++) {
            if(i==s.length()-1) {
                s1.append(s.charAt(i));

            } else {
                s1.append(s.charAt(i));
                s1.append( ", ");
            }
        }
        s1.append( "]");

        System.out.println(s1);

    }
    public  static  void reverseStr(){
        Scanner input = new Scanner(System.in);
        System.out.println("请输入要的字符串");
        String str = input.next();
        StringBuilder newStr=new StringBuilder(str);
//        for (int i=str.length()-1;i>=0;i--)
//        {
//            newStr+=str.charAt(i);
//
//        }
        newStr.reverse();
        System.out.println("newStr:"+newStr);


    }
    //StringBuilder 线程不安全 但是更快
    public  static  void strinGBuilder(){
        //java.lang
        //创建字符串 内容可变 default:16

        //StringBuilder​() 构造一个没有字符的字符串构建器，初始容量为16个字符。
        //StringBuilder​(int capacity) 构造一个没有字符的字符串构建器，以及由 capacity参数指定的初始容量。
        //StringBuilder​(CharSequence seq) 构造一个字符串构建器，其中包含与指定的 CharSequence相同的字符。
        //StringBuilder​(String str) 构造一个初始化为指定字符串内容的字符串构建器。

        //append(),delect(int start int end),insert(),length(),reverse()
    StringBuilder strb=new StringBuilder("Hello world");
        System.out.println(strb);
        strb.append(" you are beautiful");
        System.out.println(strb);
        strb.delete(11,strb.length());// [start,end)前闭后开取值
        System.out.println(strb);
        strb.insert(10,"hhhh");//在10位置元素之前添加
        System.out.println(strb);

    }
    //所以方法与StringBuilder 类相同 但是线程安全 慢些
    public  static  void strinGBuffer(){


    }


}
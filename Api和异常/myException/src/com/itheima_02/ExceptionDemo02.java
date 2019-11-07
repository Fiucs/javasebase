package com.itheima_02;

/*
    public String getMessage():返回此 throwable 的详细消息字符串
    public String toString():返回此可抛出的简短描述
    public void printStackTrace():把异常的错误信息输出在控制台
 */
public class ExceptionDemo02 {
    public static void main(String[] args) {
        System.out.println("开始");
        method();
        System.out.println("结束");
    }

    public static void method() {
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[3]); 
            System.out.println("这里能够访问到吗");
        } catch (ArrayIndexOutOfBoundsException e) {
            //System.out.println("说组下标越界了");
            e.printStackTrace();
           // System.out.println(e.getMessage());
           // System.out.println(e.toString());
        }
    }
}

//    public class Throwable{


//  private String detailMessage;
//
//    public String getMessage() {
//
//
//        return detailMessage;
//    }
//     }
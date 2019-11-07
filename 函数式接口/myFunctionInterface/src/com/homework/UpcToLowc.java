package com.homework;

import java.util.function.Function;
import java.util.function.Supplier;

public class UpcToLowc {
    //将一串英文字母的字符串（包含大写和小写字母）转成小写输入
    public static void main(String[] args) {
        Supplier<String> s0 = conver("AbcDDefGG");
        System.out.println(s0.get());
        // T get()方法 不行

        String s1=conver("aAaaaAbbBBB",s -> s.toLowerCase());
        System.out.println(s1);
    }

//方法一 函数时接口作为返回值类型 R  apply(T t)
// T get()方法 不行
    public static Supplier<String> conver(String str){

        return ()->str.toLowerCase();

    }
//方法二
    public static String conver(String str,Function<String,String> fun){

        return  fun.apply(str);

    }

}

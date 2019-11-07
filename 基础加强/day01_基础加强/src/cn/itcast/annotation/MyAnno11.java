package cn.itcast.annotation;

/**
 * 本质
 * public interface cn.itcast.annotation.MyAnno11 extends java.lang.annotation.Annotation {
 * }
 */

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**

 元注解：用于描述注解的注解
 * @Target：描述注解能够作用的位置
 * @Retention：描述注解被保留的阶段------------ 源码 class runtime
 * @Documented：描述注解是否被抽取到api文档中
 * @Inherited：描述注解是否被子类继承


 *
 */




@Target({ElementType.TYPE,ElementType.METHOD,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@MyAnno11(show = 2,b=false,str = "1")
public @interface MyAnno11 {


    //属性列表？？？
    int show()default 1;//show=1   当成属性来赋值
    String show1()default "a";

    //枚举
    Person per()default Person.P1;
    MyAnno2 my()default @MyAnno2;
    String [] str()default {"ab"};

    // 报错void show3();
    boolean b();


}

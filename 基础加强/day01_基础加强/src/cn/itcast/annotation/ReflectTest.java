package cn.itcast.annotation;

import cn.itcast.annotation.demo.Check;

import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * 框架类
 */

@MyAnno11(b=false)
@Pro(className = "cn.itcast.annotation.Demo1",methodName = "show")
public class ReflectTest {
    public static void main(String[] args) throws Exception {

        /*
            前提：不能改变该类的任何代码。可以创建任意类的对象，可以执行任意方法
         */


        //1.解析注解
        //1.1获取该类的字节码文件对象
       // Class<ReflectTest> reflectTestClass = ReflectTest.class;
        Class<ReflectTest> reflectTestClass = ReflectTest.class;
        //2.0 获取内存中注解的子类实现（编译器自动完成）对象
        Pro an = reflectTestClass.getAnnotation(Pro.class);


        System.out.println(Pro.class.getName());//方式二获取包名



        MyAnno11 anno11 = reflectTestClass.getAnnotation(MyAnno11.class);
        System.out.println(anno11.b());
        //3.0
        //调用抽象方法 获取返回值
        String className = an.className();
        String methodName = an.methodName();

        System.out.println(className+" "+methodName);

       // ClassLoader classLoader = reflectTestClass.getClass().getClassLoader();

        Class<?> aClass = Class.forName(className);
        Object o = aClass.newInstance();
        Method dm = aClass.getDeclaredMethod(methodName);
        dm.invoke(o);


    }
}

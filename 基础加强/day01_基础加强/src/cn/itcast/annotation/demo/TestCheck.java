package cn.itcast.annotation.demo;
/**
 *
 */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * 简单的测试框架
 *
 * 当主方法执行后，会自动自行被检测的所有方法(加了Check注解的方法)，判断方法是否有异常，记录到文件中
 */
public class TestCheck {


    /**
     * 主函数
     *
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException, InvocationTargetException, IllegalAccessException {
 /*       //1.创建计算器对象
        Calculator c = new Calculator();
        //2.获取字节码文件对象
        Class cls = c.getClass();
        //3.获取所有方法
        Method[] methods = cls.getMethods();

        int number = 0;//出现异常的次数
        BufferedWriter bw = new BufferedWriter(new FileWriter("bug.txt"));


        for (Method method : methods) {
            //4.判断方法上是否有Check注解
            if(method.isAnnotationPresent(Check.class)){
                //5.有，执行
                try {
                    method.invoke(c);
                } catch (Exception e) {
                    //6.捕获异常

                    //记录到文件中
                    number ++;

                    bw.write(method.getName()+ " 方法出异常了");
                    bw.newLine();
                    bw.write("异常的名称:" + e.getCause().getClass().getSimpleName());
                    bw.newLine();
                    bw.write("异常的原因:"+e.getCause().getMessage());
                    bw.newLine();
                    bw.write("--------------------------");
                    bw.newLine();

                }
            }
        }

        bw.write("本次测试一共出现 "+number+" 次异常");

        bw.flush();
        bw.close();



    }*/

        Calculator c = new Calculator();

        Class<? extends Calculator> cls = c.getClass();

        Method[] dm = cls.getDeclaredMethods();

        BufferedWriter bw=new BufferedWriter(new FileWriter("基础加强\\day01_基础加强\\src\\cn\\itcast\\annotation\\demo\\bug.txt"));

        int count=0;//异常出现的次数

        for (Method method : dm) {
            if(method.isAnnotationPresent(Check.class))
            {
                try {
                   /* if(method.getName().equals("multi"))
                        method.invoke(c,2,2);
                    else*/
                    method.invoke(c);

                    System.out.println(method.getName());
                } catch (Exception e) {

                    bw.write(method.getName()+"方法出现了异常:\n");
                    bw.write("异常名称："+e.getCause().getClass().getSimpleName()+"\n");
                    bw.write("异常原因"+e.getCause().getMessage()+"\n");
                    count++;
                    //e.printStackTrace();
                }
            }

        }
        bw.write("本次此测试共出现："+count+"异常");
        bw.close();

        //判断 方法上是否有注解


    }
}
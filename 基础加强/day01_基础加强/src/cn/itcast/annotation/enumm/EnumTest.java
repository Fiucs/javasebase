package cn.itcast.annotation.enumm;

/**
 * 枚举  列出所有有限的类
 * 季节 春，夏，秋，冬
 * 星期
 *
 * JDK1.5之前 ：
 * 1./
 *      建立一个类
 *       1.1构造方法为 private 确保 指创建一次 且 类中属性不能修改
 *       1.2创建成员变量（final）  通过new 类 赋值
 *       private final sex;
 *       public final static male=new Season("male“);
 *
 * JDK1.5之后 才出现enum类型
 */
public class EnumTest {

    public static void main(String[] args) {
        System.out.println(Season.SPRING);

        System.out.println(Season.valueOf("SPRING"));//获取值

    }

}

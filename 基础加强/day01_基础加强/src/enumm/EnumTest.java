package enumm;

/**
 * 枚举：
 * 类中包含的对象   确定的 有限
 * 季节 性别 星期  订单的状态
 * 如何定义一个枚举类：
 *  1.5
 *    1 构造方法的私有化
 *    2 创建一个成员变量（对象的类型），并通过new创建赋值
 *  1.5之后   定义了enum
 *  public enum 枚举类名{
 *
 *  }
 *  Enum中常见的方法
 *  toString​()
 *  valueOf()
 *  values()
 *
 *  枚举类中实现接口
 *  需要在每一个枚举对象中实现接口中的方法
 */
public class EnumTest {


    public static void main(String[] args) {
        //new Gender();


 /*       Gender male = Gender.male;
        Gender female = Gender.female;
        System.out.println(male.getDesc());
        System.out.println(female.getDesc());*/

        Gender1 male = Gender1.male;
        Gender1 female = Gender1.female;

        System.out.println(male.getDesc());
        System.out.println(female.getDesc());

        Season spring = Season.SPRING;
        Season summer = Season.SUMMER;
        System.out.println(summer);
       // System.out.println(Season.class.getSuperclass());

        System.out.println("========================");
        Season spring1 = Season.valueOf("AUTUMN");//获取枚举类型 冬天
       // Season.SPRING;
        System.out.println(spring1);

        System.out.println("-----------------------");
        Season[] values = Season.values();//获取所有 枚举类型
        for (Season s:values){
            s.show();
        }




    }
}

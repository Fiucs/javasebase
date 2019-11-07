package org.wedu.homework;
///定义一个女朋友类。女朋友的属性包含：姓名，身高，体重。行为包含：洗衣服wash()，做饭cook()。
//另外定义一个用于展示三个属性值的show()方法。请在测试类中通过有参构造方法创建对象并赋值，然
//后分别调用展示方法、洗衣服方法和做饭方法
public class GirlFriend {
        private String name;
        private double height;
        private double weight;

        public void wash(){
            System.out.println(this.name+"正在"+"洗衣服");
        }
        public void cook(){

            System.out.println(this.name+"正在"+"做饭");
        }
    //显示 姓名 身高  体重
        public void show(){
            System.out.println("他的女朋友是"+this.name+"身高是"+this.height+"米 "+"体重是"+this.weight+"kg");

        }

        public String getName(){
            return this.name;
        }
        public double getHeight(){
            return this.height;
    }
        public double getWeight(){
            return this.weight;
    }

        public void setInfomation(String name,double height,double weight){
            this.name=name;
            this.height=height;
            this.weight=weight;

        }
        public GirlFriend(){}
        public GirlFriend(String name,double height,double weight){
            this.name=name;
            this.height=height;
            this.weight=weight;


        }





}

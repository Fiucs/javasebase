package org.wedu.demo1;

public class Phone {
    String brand;//字符串
    int price;
    int phoneNum;
    public void call(int phoneNum){

        System.out.println("给"+phoneNum+"打电话");
    }
    public void sendMessges(){
        System.out.println("我的手机是"+brand);
    }
    public Phone(){
        brand="华为P30";
        price=6600;
        phoneNum=95530002;


    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", phoneNum=" + phoneNum +
                '}';
    }
}

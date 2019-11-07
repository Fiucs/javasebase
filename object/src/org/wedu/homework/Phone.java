package org.wedu.homework;


import java.util.Objects;

//定义手机类，手机有品牌(brand),价格(price)和颜色(color)三个属性，有打电话call()和sendMessage()
//两个功能。
public class Phone {
    private String brand;
    private  int price ;
    private  String color;

    public Phone(){}
    public Phone(String brand,int price,String color){

        this.brand=brand;
        this.price=price;
        this.color=color;

    }
    public void set(String brand,int price,String color){
        this.brand=brand;
        this.price=price;
        this.color=color;

    }
    public String getBrand(){


        return this.brand;
    }
    public String getColor(){
        return this.color;
    }
    public int getPrice(){
        return this.price;
    }

    public void call(){
        System.out.println("正在使用价格为"+this.price+"元的"+this.color+"手机"+this.brand+"打电话'''");
    }
    public void sendMessage(){
        System.out.println("正在使用价格为"+this.price+"元的"+this.color+"手机"+this.brand+"发短信'''");
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }

/*    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phone phone = (Phone) o;
        return price == phone.price &&
                Objects.equals(brand, phone.brand) &&
                Objects.equals(color, phone.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, price, color);
    }*/
}

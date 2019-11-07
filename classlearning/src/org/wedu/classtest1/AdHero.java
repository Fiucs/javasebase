package org.wedu.classtest1;

import java.net.CacheRequest;

public class AdHero extends Hero {
    String method;
    int damage;

    public static void main(String[] args) {
    AdHero ad=new AdHero();
    Hero h1=new Hero();
    Hero h2=new Hero();
    h1.name="男刀";
    h2.name="女刀";

    ad.attack();
    ad.attack(h1);
    ad.attack(h1,h2);
    ad.attack(h1,h2,h1);
    }

    //方法重载 overload
    public void attack(){
        System.out.println("没有发起任何攻击");
    }
    public void attack(Hero h1){
        System.out.println(h1.name+"来支援了");

    }

    public void attack(Hero h1,Hero h2){
        System.out.println(h1.name+" "+"killed"+" "+h2.name+" "+name);


    }
    //参数列表的的形式传参数（类型...n）

    public void attack(Hero...h){

        for (int i = 0; i < h.length; i++) {
            System.out.println(name+"正在追"+h[i].name);

        }

    }


}

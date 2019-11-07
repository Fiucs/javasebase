package com.itheima_03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/*
    需求：
        通过程序实现斗地主过程中的洗牌，发牌和看牌。要求：对牌进行排序

    思路：
        1:创建HashMap，键是编号，值是牌
        2:创建ArrayList，存储编号
        3:创建花色数组和点数数组
        4:从0开始往HashMap里面存储编号，并存储对应的牌。同时往ArrayList里面存储编号
        5:洗牌(洗的是编号)，用Collections的shuffle()方法实现
        6:发牌(发的也是编号，为了保证编号是排序的，创建TreeSet集合接收)
        7:定义方法看牌(遍历TreeSet集合，获取编号，到HashMap集合找对应的牌)
        8:调用看牌方法
 */
public class PokerDemo {
    public static void main(String[] args) {

        HashMap<Integer, String> hm = new HashMap<>();//存编号-牌
        ArrayList<Integer> number = new ArrayList<>();//村编号

        String []value={"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        String []color={"♦", "♣", "♥", "♠"};

        int index=0;
        for (String v : value) {
            for (String c : color) {
                hm.put(index,c+v);
                number.add(index);
                index++;

            }

        }
        //加大王
        hm.put(index,"小王");
        number.add(index);
        index++;
        hm.put(index,"大王");
        number.add(index);

        System.out.println("源牌");
        for (Integer i : hm.keySet()) {
            System.out.print(hm.get(i)+" ");
        }
        System.out.println();

        /////////////洗牌 对arr洗牌
        Collections.shuffle(number);
        //1.treeMap存牌

        //2.treeSet 存牌

        //3.arrayList存牌

        ArrayList<Integer> dipai = new ArrayList<>();
        ArrayList<Integer> oneMan = new ArrayList<>();
        ArrayList<Integer> secondMan = new ArrayList<>();
        ArrayList<Integer> thirdMan = new ArrayList<>();


        for (int i = 0; i < number.size(); i++) {
            if(i<3)
            {
                dipai.add(number.get(i));

            }
            else if(i%3==0){
                oneMan.add(number.get(i));
            }
            else if(i%3==1)
            {
                secondMan.add(number.get(i));
            }
            else {
                thirdMan.add(number.get(i));
            }


        }
        Collections.sort(dipai);
        Collections.sort(oneMan);
        Collections.sort(secondMan);
        Collections.sort(thirdMan);
        System.out.println(dipai.size()+" "+oneMan.size()+" "+ " "+secondMan.size()+" "+thirdMan.size());

        //看牌
        shouPoker("底牌",hm,dipai);
        shouPoker("我",hm,oneMan);
        shouPoker("你",hm,secondMan);
        shouPoker("他",hm,thirdMan);


    }
    public static void shouPoker(String name,HashMap<Integer,String> hm,ArrayList<Integer> list){

        System.out.println(name+"  :");
        for (Integer i : list) {
            System.out.print(hm.get(i)+" ");

        }
        System.out.println();


    }



}

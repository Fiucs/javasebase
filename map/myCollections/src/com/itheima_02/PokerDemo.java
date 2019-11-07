package com.itheima_02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
    需求：
        通过程序实现斗地主过程中的洗牌，发牌和看牌

    思路：
        1:创建一个牌盒，也就是定义一个集合对象，用ArrayList集合实现
        2:往牌盒里面装牌
        3:洗牌，也就是把牌打撒，用Collections的shuffle()方法实现
        4:发牌，也就是遍历集合，给三个玩家发牌
        5:看牌，也就是三个玩家分别遍历自己的牌
 */
public class PokerDemo {

    public static void main(String[] args) {
        //牌52张  3张为额外牌  每人13张牌

        ArrayList<String> list=addPokers();//装牌
        list=shufflePoker(list);//洗牌
        System.out.println(list.size());
        ArrayList<ArrayList<String>>arr=pushPokers(list);//发牌

       // for (ArrayList<String> list1 : arr) {}
          /*  System.out.println(arr);*/
        for (int i = 0; i < arr.size(); i++) {
            if(i==0)
            {
                Collections.sort(arr.get(i));

                System.out.println("底牌:"+arr.get(i).toString());

            }
            if(i==1) {
                Collections.sort(arr.get(i));
                System.out.println("我:" + arr.get(i).toString());

            }
                if(i==2) {
                    Collections.sort(arr.get(i));
                    System.out.println("你:" + arr.get(i).toString());
                }
            if(i==3) {
                Collections.sort(arr.get(i));
                System.out.println("他:" + arr.get(i).toString());
            }
        }

    }


    public static ArrayList<ArrayList<String>> pushPokers(ArrayList list){
        ArrayList<ArrayList<String>> aalist=new ArrayList<ArrayList<String>>();
        ArrayList <String> extraPokers=new ArrayList<>();
        ArrayList <String> oneMan=new ArrayList<>();
        ArrayList <String> secondMan=new ArrayList<>();
        ArrayList <String> thirdMan=new ArrayList<>();
        System.out.println(list);
        int index=0;//从0开始
        for (index=0; index <3 ; index++) {
            extraPokers.add((String) list.get(index));

        }
        for (index=3;index<list.size();index++)
        {
            if(index%3==0)
            oneMan.add((String) list.get(index));
            if(index%3==1)
            secondMan.add((String) list.get(index));
            if(index%3==2)
            thirdMan.add((String) list.get(index));
        }
        aalist.add(extraPokers);
        aalist.add(oneMan);
        aalist.add(secondMan);
        aalist.add(thirdMan);

            return aalist;



    }

    public static ArrayList<String> shufflePoker(ArrayList<String> list){
        Collections.shuffle(list);

        return list;

    }


    public static ArrayList<String> addPokers(){
        String [] color={"♦", "♣", "♥", "♠"};
        String src="2,3,4,5,6,7,8,9,10,j,q,k,A";
        String[] split = src.split(",");
        ArrayList<String> arr=new ArrayList<>();//存牌  四张存
        //存牌
        //System.out.println(split);
        for (String s : split) {
            for (String c:color) {
                arr.add(c+s);
            }

        }
        arr.add("大王");
        arr.add("小王");
        //System.out.println(arr);

        return arr;


    }



}

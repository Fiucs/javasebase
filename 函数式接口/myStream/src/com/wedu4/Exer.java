package com.wedu4;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exer {



    public static void main(String[] args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        Trader brian = new Trader("Brian","Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );
        ////找出2011年发生的所有交易，并按交易额排序
        transactions.stream().filter(o->o.getYear()==2011).sorted(((o1, o2) -> o2.getValue()-o1.getValue())).forEach(o-> System.out.println(o));


        //交易员在哪些不同的城市工作过

        System.out.println("--------/交易员在哪些不同的城市工作过-----------");
      transactions.stream().map(o->o.getTrader().getCity()).distinct().forEach(System.out::println);


        //查找所有来自剑桥的交易员，并按姓名排序
        System.out.println("----------//查找所有来自剑桥的交易员，并按姓名排序-----------");
        transactions.stream().filter(o->o.getTrader().getCity().equals("Cambridge")).sorted((o1, o2) -> o1.getTrader().getName().compareTo(o2.getTrader().getName()))
                .forEach(System.out::println);
        //返回所有交易员的姓名字符串，并按字母顺序排序
        System.out.println("---------- //返回所有交易员的姓名字符串，并按字母顺序排序----------");
        transactions.stream().map(o->o.getTrader().getName()).distinct().sorted().forEach(System.out::println);

        //有没有交易员在米兰工作的？
        System.out.println("//有没有交易员在米兰工作的？");
        transactions.stream().filter(o->o.getTrader().getCity().equals("Milan")).map(o->o.getTrader().getName()).distinct().forEach(System.out::println);

        //打印生活在剑桥的交易员的所有交易额
        System.out.println("//打印生活在剑桥的交易员的所有交易额");
        transactions.stream().filter(o->o.getTrader().getCity().equals("Cambridge"))
                .forEach(System.out::println);
        HashMap<String,Integer> map1=new HashMap<>();

         transactions.stream().filter(o -> o.getTrader().getCity().
                equals("Cambridge"));
  /*          if (map1.get(o.getTrader().getName()) == null)
                map1.put(o.getTrader().getName(), o.getValue());
            else
                map1.put(o.getTrader().getName(), map1.get(o.getTrader().getName()) + o.getValue());
            return map1;
  */
    //    System.out.println(cambridge1.collect(Collectors.toList()));

        Integer cambridge = transactions.stream().filter(o -> o.getTrader().getCity().equals("Cambridge")).
                map(o -> o.getValue()).reduce(0, (a, b) -> a + b);
        System.out.println(cambridge);


        transactions.stream().filter(o->o.getTrader().getCity().equals("Cambridge")).map(Transaction::getValue).forEach(System.out::println);


        //所有交易中，最高的交易额是多少
        System.out.println("///所有交易中，最高的交易额是多少");

        transactions.stream().map(o->o.getValue()).sorted((o1, o2) -> o2-o1).limit(1).forEach(System.out::println);

        int max = transactions.stream().map(o -> o.getValue()).max((o1, o2) -> o1 - o2).get();
        System.out.println(max);

        int integer1 = transactions.stream().map(o -> o.getValue()).reduce(0,Integer::max);
        System.out.println(integer1);

        //找到交易额最小的交易
        System.out.println("//找到交易额最小的交易");
        transactions.stream().sorted((o1, o2) -> o1.getValue()-o2.getValue()).limit(1).forEach(System.out::println);

        int min = transactions.stream().mapToInt(Transaction::getValue).min().getAsInt();
        System.out.println(min);
    }
    //找出2011年发生的所有交易，并按交易额排序

    //交易员在哪些不同的城市工作过

    //查找所有来自剑桥的交易员，并按姓名排序

    //返回所有交易员的姓名字符串，并按字母顺序排序

    //有没有交易员在米兰工作的？

    //打印生活在剑桥的交易员的所有交易额

    //所有交易中，最高的交易额是多少

    //找到交易额最小的交易
}

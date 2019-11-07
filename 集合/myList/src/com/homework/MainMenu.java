package com.homework;

import com.itheima_06.Student;

import java.util.*;

public class MainMenu {



    public static void main(String[] args) {

        ArrayList list=new ArrayList();
        System.out.println("-----------玩家信息录入程序---------");
        Scanner s=new Scanner(System.in);
        while (true){
            System.out.println("---请选择操作-----1.录入信息----2.查看信息----3修改信息----4.退出菜单---");
            int chose=s.nextInt();
            switch (chose){
                case 1:

                    inputInfo(list);

                    break;
                case 2:
                    showtInfo(list);
                    break;
                case 3:
                    break;
                case 4:
                    System.out.println("退出系统成功");
                    return;
                default:
                    System.out.println("选择操作不合法，请重新输入");
                    break;

            }



        }


    }

    public static void inputInfo(ArrayList list) {

        Scanner s = new Scanner(System.in);
        System.out.println("请输入玩家姓名");
        String name = s.nextLine();

        System.out.println("请输入玩家年龄");
        int age = s.nextInt();
        //判断年龄合不合法不合法则重新输入
        GamePlayer g = new GamePlayer();
        try {

            g.setAge(age);
            g.setName(name);

        } catch (AgeException e) {

            e.printStackTrace();
            return;

        }
        while (true) {
            System.out.println("请输入玩家段位(青铜，白银，黄金，钻石，王者)");
            String rank = s.next();
            s.nextLine();
            if (rank.equals("青铜") || rank.equals("白银") || rank.equals("黄金") || rank.equals("钻石") || rank.equals("王者"))
            {
                if (rank.equals("青铜")) {
                    g.setRankindex(1);
                    g.setRank(rank);
                    break;
                } else if (rank.equals("白银")) {

                    g.setRankindex(2);
                    g.setRank(rank);
                    break;
                } else if (rank.equals("黄金")) {
                    g.setRankindex(3);
                    g.setRank(rank);
                    break;


                } else if (rank.equals("钻石")) {

                    g.setRankindex(4);
                    g.setRank(rank);
                    break;


                } else {

                    g.setRankindex(5);
                    g.setRank(rank);
                    break;


                }

            }
        }


            System.out.println("请输入玩家等级");
            int grade = s.nextInt();
            g.setGrade(grade);

            list.add(g);


        }




    public static void printList(ArrayList list){

        System.out.println("姓名         等级       段位");
        for (Object o : list) {

            GamePlayer g=(GamePlayer)o;
            System.out.println(g.getName()+"       "+g.getGrade()+"          "+g.getRank());


        }




    }
    public static void showtInfo(ArrayList list){
        Scanner s=new Scanner(System.in);


        while (true) {
            System.out.println("请选择查看方式，1.按段位升序排序---2.按段位降序排序");
            int num=s.nextInt();
            switch (num){

                case 1:
                    //升序
                    Collections.sort(list, new Comparator<GamePlayer>() {
                        @Override
                        public int compare(GamePlayer o1, GamePlayer o2) //升序 重写compare比较函数
                        {
                            if(o1.getRankindex()>=o2.getRankindex())
                                return 1;
                            else
                                return -1;
                        }
                    });

                    printList(list);
                    return;
                case 2:

                    Collections.sort(list, new Comparator<GamePlayer>()
                    {

                        public int compare(GamePlayer o1,GamePlayer o2)//降序
                        {
                            if(o1.getRankindex()>=o2.getRankindex())
                                return -1;
                            else
                                return 1;
                        }


                    });
                   printList(list);

                    //降序
                    return;
                default:
                    System.out.println("输入有误");


            }
        }


    }



}

package com.itheima_04;

/*
    void join()：等待这个线程死亡
 */
public class ThreadJoinDemo {
    public static void main(String[] args) {
        ThreadJoin tj1 = new ThreadJoin();
        ThreadJoin tj2 = new ThreadJoin();
        ThreadJoin tj3 = new ThreadJoin();

        tj1.setName("康熙");
        tj2.setName("四阿哥");
        tj3.setName("八阿哥");

        tj1.start();//join的作用
        try {
            tj1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        tj2.start();
        tj3.start();
        System.out.println("主线程已完成");
    }
}
//没有join
//1.主线程已完成
//四阿哥:0
//康熙:0
//八阿哥:0
//康熙:1
//四阿哥:1
//康熙:2

//有join
//.......
//康熙:93
//康熙:94
//康熙:95
//康熙:96
//康熙:97
//康熙:98
//康熙:99     //康熙线程已执行完成
//主线程已完成
//四阿哥:0
//八阿哥:0
//八阿哥:1
//四阿哥:1
//......
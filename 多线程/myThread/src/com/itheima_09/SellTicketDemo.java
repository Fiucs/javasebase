package com.itheima_09;

/*
    卖票案例
    //解决方案  同步锁   synchronized（obj）{} 同步代码块
    //
  - 好处：解决了多线程的数据安全问题

  - 弊端：当线程很多时，因为每个线程都会去判断同步上的锁，这是很耗费资源的，无形中会降低程序的运行效率

  //同步普通方法 锁加到this上
  速度优于同步代码块方法，非最佳方法
    //同步静态方法 所加到的是类名.class


 */
public class SellTicketDemo {
    public static void main(String[] args) {
        SellTicket st = new SellTicket();

        Thread t1 = new Thread(st, "窗口1");
        Thread t2 = new Thread(st, "窗口2");
        Thread t3 = new Thread(st, "窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}

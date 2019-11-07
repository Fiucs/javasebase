package com.itheima_09;

public class SellTicket implements Runnable {
    private static int tickets = 100;//成员变量 堆空间
    private Object obj = new Object();

    @Override
    public void run() {

/*        while (true) {

               同步静态方法 //synchronized (SellTicket.class) {
        同步普通方法 // synchronized (this) {
              //同步代码块  synchronized (obj) {
                    if (tickets > 0) {
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println(Thread.currentThread().getName() + "正在出售第" + tickets + "张票");
                        tickets--;
                    }
                }
		}*/
            while (true) {
                sellTickets();//同步方法
            }

    }

	public  static  synchronized void sellTickets(){

        if (tickets > 0) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "正在出售第" + tickets + "张票");
            tickets--;
        }


    }

}
            
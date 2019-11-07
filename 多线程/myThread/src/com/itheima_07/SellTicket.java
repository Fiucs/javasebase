package com.itheima_07;

public class SellTicket implements Runnable {
    private int tickets = 100;

    @Override
    public void run() {
        while (true) {
            if (tickets > 0) {
                try {
                    Thread.sleep(111);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //1，2，3线程可能同时进来

                //然后


                System.out.println(Thread.currentThread().getName() + "正在出售第" + tickets + "张票");
                //然后1，2，3线程可能执行完输出语句后 tickes值相同

                tickets--;
                //可能  1，2对tickets-2操作后 其值变为-1
			}
        }
    }
}
//窗口3正在出售第7张票
//窗口1正在出售第7张票
//窗口2正在出售第7张票
//窗口1正在出售第4张票
//窗口2正在出售第3张票
//窗口3正在出售第2张票
//窗口1正在出售第1张票
//窗口3正在出售第0张票
//窗口2正在出售第-1张票

//原因 线程执行的随机性

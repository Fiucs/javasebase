package job2;

public class Operator {
    private int num;

    public Operator(int num) {
        this.num = num;
    }


    public synchronized void addOne(){


        if(num<100) {
            num++;
            notifyAll();

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("老板采购了一个苹果" + "库存为:" + num);

        }
       else {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }
    //1. 程序员 朝九晚五  ||可以有时间和朋友打篮球
    //2.有能力来一场说走就走的旅行

    //3.在自己家养条宠物狗


    public synchronized void reduceOne(){

        if(num>0) {

            num--;
            notifyAll();

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("顾客买了一个苹果" + "库存为:" + num);

        }
        else {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }



    }



}

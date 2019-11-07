package job1;

public class Operate {
    private int count;
    boolean state=false;//false 1打印  true2打印
    public Operate(int count) {
        this.count = count;
    }

/*
    public synchronized void addNum1(){

                if(state)
                {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName() + "打印: " + count);
                count++;
                state=true;
                notifyAll();




    }*/
    public synchronized void addNum2(){
        if(!state)
        {
            try {
                state=true;
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        System.out.println(Thread.currentThread().getName()+"打印: "+count);
        count++;
        state=false;
        notifyAll();

    }


    public int getCount() {
        return count;
    }

}

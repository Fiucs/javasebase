package job1;

public class Thread1 implements Runnable {

    private Operate o;

    public Thread1(Operate o) {
        this.o = o;
    }

    @Override
    public void run() {

        while (o.getCount()<100)
        {
            o.addNum2();

        }

    }


}

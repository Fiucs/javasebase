package job1;

import java.util.Random;

public class Thread2 implements Runnable {

    private Operate o;

    public Thread2(Operate o) {
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

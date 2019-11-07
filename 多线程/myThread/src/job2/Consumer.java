package job2;

public class Consumer implements Runnable {

    private  Operator o;

    public Operator getO() {
        return o;
    }

    public Consumer(Operator o) {
        this.o = o;
    }

    @Override
    public void run() {

        while (true){
            o.reduceOne();

        }
    }




}

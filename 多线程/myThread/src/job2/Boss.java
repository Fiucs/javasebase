package job2;

public class Boss implements Runnable{
    private Operator o;

    public Boss(Operator o) {
        this.o = o;
    }

    @Override
    public void run() {

        while (true){

            o.addOne();
        }
    }





}

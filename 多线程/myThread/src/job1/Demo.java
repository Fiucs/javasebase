package job1;

public class Demo {
    public static void main(String[] args) {

        Operate operate=new Operate(1);

        Thread1 th1=new Thread1(operate);
        Thread2 th2=new Thread2(operate);

        Thread t1=new Thread(th1,"线程1");
        Thread t2=new Thread(th2,"线程2");

        t1.start();
        t2.start();


    }
}

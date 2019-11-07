package job2;

public class Demo {
    public static void main(String[] args) {

        Operator o=new Operator(0);

        Boss boss=new Boss(o);
        Consumer consumer=new Consumer(o);

        Thread thb=new Thread(boss,"水果老板");
        Thread thc=new Thread(consumer,"顾客");

        thb.start();
        thc.start();
    }
}

package callbackfunction;

public class Callback1 {
    public static void main(String[] args) {


        SonClass s1=new SonClass();

        mmethod1(s1);

        System.out.println("主函数执行完毕");
    }

    public static void mmethod1(SonClass s){

        s.mth1(System.out::println);

    }




}
class SonClass{

    public static void mth1(CallResult callResult){

        callResult.callResult("任务完成 来自回调函数");//接口调用回调 通知主函数
        System.out.println("callReslt执行完毕");

    }



}

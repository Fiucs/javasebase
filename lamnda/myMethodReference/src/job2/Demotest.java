package job2;

public class Demotest {

    public static void main(String[] args) {


        reversStr(StringBuilder::reverse,"I love china ");


    }

    public static void reversStr(ReverseIner ri,String s){

        StringBuilder sb =ri.method(new StringBuilder(s));
        System.out.println(sb);

    }




}

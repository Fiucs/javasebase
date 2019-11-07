import java.util.LinkedHashSet;

public class rmIntSameElements {

    public static void main(String[] args) {


        int num=987667335;
        System.out.println(num);
        num=rmIntSameElements(num);

        System.out.println(num);
    }


    public static int rmIntSameElements( int num){

        String str=String.valueOf(num);
        char [] charry=str.toCharArray();//转 char[]
        LinkedHashSet lkset=new LinkedHashSet();
        for (int i =charry.length-1; i >=0 ; i--) {
            lkset.add(charry[i]);
        }
        StringBuilder s=new StringBuilder();
        for (Object o : lkset) {
            s.append((char)o);

        }

        return Integer.parseInt(String.valueOf(s));
    }

}

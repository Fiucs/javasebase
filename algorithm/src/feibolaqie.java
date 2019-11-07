public class feibolaqie {
    public static void main(String[] args) {


        System.out.println(fb(100));

    }

    public static int fb(int n){

        if (n<=2)
            return 1;

        else
            return fb(n-1)+fb(n-2);



    }
}

public class FullPamutation {

    //abcd
        //abdc
      //acbd
        //acdb
      //adcb
        //adbc
    public static void main(String[] args) {

        char [] chr="abcd".toCharArray();
        fullPamutation(chr,0,chr.length-1);
    }

    public static void fullPamutation(char [] chr,int begin,int end){

        if(begin==end) {
            System.out.println(String.valueOf(chr));
            return;
        }
        else {
            //一开始 begin=0  end =length-1

            for (int i =begin; i < chr.length; i++) {

                swag(chr,begin,i);//交换

                fullPamutation(chr,begin+1,end);

                swag(chr,begin,i);

            }




        }

    }
    public static void swag(char [] chr,int i,int j){
        char temp=chr[i];
        chr[i]=chr[j];
        chr[j]=temp;

    }

}

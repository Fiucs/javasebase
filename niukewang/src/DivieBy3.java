import java.math.BigInteger;
import java.util.Scanner;

//题目描述
//小Q得到一个神奇的数列: 1, 12, 123,...12345678910,1234567891011...。
//
//并且小Q对于能否被3整除这个性质很感兴趣。
//
//小Q现在希望你能帮他计算一下从数列的第l个到第r个(包含端点)有多少个数可以被3整除。
//
//输入描述:
//输入包括两个整数l和r(1 <= l <= r <= 1e9), 表示要求解的区间两端。

//输入 2 5
//      输出 3

//发现规律为  位数为 1  4  7 10 .。。。。时不可除尽
// 对三取余=1 时不满足条件 1+(n-1)*3=an
public class DivieBy3 {

    public static void main(String args[]){
        System.out.println("请输入区间 如:2 5");
        Scanner s=new Scanner(System.in);
        int arr[]=new int[2];
        int i=0;
        while (i<2&& s.hasNextInt())
        {

            arr[i++]=s.nextInt();
        }
        int count=0;
////        for (int j = arr[0]; j <=arr[1] ; j++) {
////            if(j%3!=1)
////                count++;
////
////        }
//
//        System.out.println(count);

        System.out.println(findRes(arr[0],arr[1]));

    }

    public  static int findRes(int start,int end){

        int num1= (int) Math.ceil((start-1)/3.0);
        System.out.println(num1);
        int num2= (int) Math.ceil(end/3.0);
        System.out.println(num2);
        return (end-start+1)-(num2-num1);


    }


}

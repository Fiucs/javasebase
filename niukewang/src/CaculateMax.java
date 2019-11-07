import java.util.Arrays;
import java.util.Scanner;

public class CaculateMax {
//题目描述
//今天上课，老师教了小易怎么计算加法和乘法，乘法的优先级大于加法，但是如果一个运算加了括号，那么它的优先级是最高的。例如：
//1+2*3=7
//1*(2+3)=5
//1*2*3=6
//(1+2)*3=9
//现在小易希望你帮他计算给定3个数a，b，c，在它们中间添加"+"， "*"， "("， ")"符号，能够获得的最大值。

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        int i=0;
        int [] arr =new int[3];
            while (i<3&& s.hasNextInt())
            {

                arr[i++]=s.nextInt();
            }
                Arrays.sort(arr);
                if(arr[0]==1)
                    System.out.println((arr[0]+arr[1])*arr[2]);
                else
                    System.out.println(arr[0]*arr[1]*arr[2]);



//            int tmp=0;
//            int sum=0;
//        for (int j = 0; j < 2 ;j++)//j=0  括号在前  j=1 在后
//        {
//
//            for (int k = 0; k <2 ; k++)//+  *
//            {
//
//                if(j==0 && k==0)
//                    sum=arr[0]+arr[1];
//                else if(j == 0 && k==1)
//                    sum=arr[0]*arr[1];
//                else
//                    sum=arr[0];
//
//                for (int l = 0; l <2 ; l++) {
//                    int sum1=sum;
//                    if(j==0 && l==0)
//                    {
//                        sum1=sum1+arr[2];
//
//                    }
//                    else if(j==0 && l==1)
//                    {
//                        sum1=sum1*arr[2];
//
//                    }
//                    else if(j==1 && l==0)
//                    {
//                        if(k==0)
//                        sum1=sum1+(arr[1]+arr[2]);
//                        else
//                            sum1=sum1*(arr[1]+arr[2]);
//                    }
//                    else
//                    {
//                        if(k==0)
//                        sum1=sum1+(arr[1]*arr[2]);
//                        else
//                            sum1=sum1*(arr[1]*arr[2]);
//                    }
//
//                    if(sum1>tmp)
//                    {
//                        tmp=sum1;
//
//                    }
//
//
//
//
//                }
//
//            }
//
//        }
//
//        System.out.println(tmp);
//
//
    }
}

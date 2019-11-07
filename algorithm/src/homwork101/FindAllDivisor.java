package homwork101;


import java.util.ArrayList;
import java.util.List;

//1、一个正整数，如果恰好等于除它本身外的所有因子之和，这个数就称为“完数”。
//例如6=1＋2＋3，编程找出1000以内的所有完数。
public class FindAllDivisor {

    public static void main(String[] args) {

        for (int i = 0; i < 1000; i++) {
            if (findAllDivisor(i)){
                System.out.println(i);
            }

        }
    }


    public static boolean findAllDivisor(int num){

        if(num==0 || num==1)
            return false;
       int sum=0;

        for (int i=1;i<=Math.sqrt(num);i++)
        {

            if(num%i==0) {

                if(i==1)
                    sum+=1;
                else {
                    if(i!=num/i)
                    {
                        sum=i+num/i+sum;
                    }
                    else
                        sum+=i;
                }
            }

        }

        if(sum==num)
        {

            return true;
        }

        return false;


    }



}

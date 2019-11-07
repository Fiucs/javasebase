package org.wedu.demo;

public class TwodArray {
    public static void main(String[] args) {
        printGraph();

    }
    public static void printGraph() {
        //打印10行杨辉三角   arr[i][j]
        //1.打印 1
        //2.打印 1，1  第n行有n个数
        //3.打印 1，2，1   从第三行开始 非首位元素 的value=arr[n-1][i]+arr[n-1][i-1]
        //4.打印 1，3，3，1
        //5.打印 1，4，6，4，1
        int n = 10;
        int[][] arr = new int[n][];
        int row = 0, cow = 0;
        for (row=0; row < n; row++) {
            arr[row]=new int[row+1];
            for (cow = 0;  cow<= row; cow++) {
                //打印首尾

                    if(cow==0 ||cow==row)
                    {
                        arr[row][cow]=1;
                        System.out.print(arr[row][cow]+" ");
                    }

                    else {
                        arr[row][cow] = arr[row - 1][cow] + arr[row - 1][cow - 1];
                        System.out.print(arr[row][cow] + " ");

                    }
            }
            System.out.println();

        }


    }



}

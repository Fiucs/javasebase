import java.net.DatagramSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class InsertSort {
    public static void main(String[] args) throws SocketException {

        int [] arr={5,1,5,11,8,2,44,15};
        insertSort(arr);
        //char a='1';
        List<Integer> collect = Arrays.stream(arr).boxed().collect(Collectors.toList());//转listt
        System.out.println(collect);

        String []strarr={"asd","信息","啊啊啊"};
        List<String> collect1 = Arrays.stream(strarr).collect(Collectors.toList());//转List

        List<DatagramSocket> sockets = new ArrayList<>(Arrays.asList(new DatagramSocket(),
                                                                    new DatagramSocket(),
                                                                    new DatagramSocket()));

        sockets.add(new DatagramSocket());
        sockets.stream().map(socket -> socket.getLocalPort()+ "  "+socket.getLocalAddress())
                .forEach(System.out::println);

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        Object[] objects = list.toArray();//
       // Integer [] ints=new Integer[list.size()];
        Integer[] integers = list.toArray(new Integer[list.size()]);
        int[] ints = Arrays.stream(integers).mapToInt(Integer::intValue).toArray();
     /*   int a=3;
        int b=3;
        System.out.println();
*/



    }


    //插入排序（Insertion-Sort）的算法描述是一种简单直观的排序算法。它的工作原理是通过构建有序序列，对于未排序数据，在已排序序列中从后向前扫描，找到相应位置并插入。插入排序在实现上，
    // 通常采用in-place排序（即只需用到O(1)的额外空间的排序），
    // 因而在从后向前扫描过程中，需要反复把已排序元素逐步向后挪位，为最新元素提供插入空间

    //通常将下标为i(i=0)的元素设定为已排序序列 i+1为待插入序列

    public static void insertSort(int [] arr){


        int temp;
        int j;
        for (int i = 1; i < arr.length; i++)//控制需要排序的趟数为 n-1次  从下标1 开始到length
        {
            temp=arr[i];

          /*  for (j = i-1; j >=0 && temp<arr[j]; j--)//每趟的比较次数
            {
                arr[j+1]=arr[j];//往后移一位

            }
            arr[j+1]=temp;//此时j 已经--了*/

          for(j=i;j>0&&temp<arr[j-1];j--)
          {
              arr[j]=arr[j-1];
          }
            arr[j]=temp;


        }

        System.out.println(Arrays.toString(arr));



    }
}

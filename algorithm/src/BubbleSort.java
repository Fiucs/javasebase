import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {

        int [] arr={9,5,1,11,56,23,14,};
        bubbleSort(arr);

    }

    public static void bubbleSort(int [] arr){

/*        一种排序的方式，对要进行排序的数据中相邻的数据进行两两比较，将较大的数据放在后面，
        依次对所有的数据进行操作，直至所有数据按要求完成排序
                * 如果有n个数据进行排序，总共需要比较n-1次*/

        //1.控制趟数
        //2。两两比较 到末尾
        int temp;
        for (int i=0;i<arr.length-1;i++)
        {
            for (int j=0;j<arr.length-1-i;j++)  //从下标为 0开始 两两比较  直到 选出最大的数值
            {
                temp=arr[j];
                if(arr[j]>arr[j+1])
                {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }

            }

        }

        System.out.println(Arrays.toString(arr));


    }

}

import java.util.Arrays;

public class SelectSort {
    public static void main(String[] args) {

        int [] arr={5,22,22,4,10,17,8,1,1};
        SelectSort(arr);

    }


    //简单选择排序
    //共需要n-1次选择

    //每一次选一个最小的数 放到这趟选择的开始位置
    //
    public static void SelectSort(int [] arr){


        int temp;
        int index=0;
        for (int i = 0; i < arr.length-1; i++) {


            for (int j=i+1;j<arr.length;j++)
            {
                if(arr[j]<arr[index])
                {
                    index=j;
                }

            }
            //此时得到最小元素的 下标index了
            //与开始的元素交换位置
            temp=arr[i];
            arr[i]=arr[index];
            arr[index]=temp;



        }

        System.out.println(Arrays.toString(arr));

    }
}

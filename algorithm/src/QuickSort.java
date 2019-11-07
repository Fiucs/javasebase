import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int [] arr={5,1,5,11,8,2,44,15};
        quickSort(0,arr.length-1,arr);
        System.out.println(Arrays.toString(arr));

    }

//快速排序使用分治法来把一个串（list）分为两个子串（sub-lists）。具体算法描述如下：
//
//从数列中挑出一个元素，称为 “基准”（pivot）；
//重新排序数列，所有元素比基准值小的摆放在基准前面，所有元素比基准值大的摆在基准的后面（相同的数可以到任一边）。在这个分区退出之后，该基准就处于数列的中间位置。这个称为分区（partition）操作；
//递归地（recursive）把小于基准值元素的子数列和大于基准值元素的子数列排序。

    //基准通常选第一个元素
    //从右边找一个 比基准小的，从左边找一个比基准大的 若找到了就交换左右两个元素位置。直到左右两个下标flag在某位置处相遇，
    // 把该位置元素与基准 交换位置

    //然后调用递归思想进行分治 ，排序
    public static void quickSort(int lft,int rgt,int arr[]){


        if(lft>rgt)//进入这层递归时 判断left 与right的大小 递归退出跳
        {
            return;
        }
        int left=lft,right=rgt;//右边末尾位置;//左边起始位置
        int temp=arr[lft];//左边第一个元素为基准
        int tp;//用于元素交换时的临时变量
        while (left<right)
        {
            while (temp <= arr[right] && right>left)//找到了右边的比基准小的元素 right>left防止未找到的情况
                right--;
            while (temp >= arr[left] && right>left)//找到了比左边的比基准大的元素
                left++;
            //进行位置的交换
            if(left<right) {
                tp = arr[left];
                arr[left] = arr[right];
                arr[right] = tp;
            }
        }
        //此时 左右的引索 相等 （碰头了）
        //交换与基准元素

        arr[lft]=arr[left];
        arr[left]=temp;

        //一下 为递归调用
        quickSort(lft,right-1,arr);//左边归序
        quickSort(right+1,rgt,arr);//右边归序


    }
}

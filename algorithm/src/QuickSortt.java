

public class QuickSortt {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int []array1= {5,1,5,11,8,2,44,15};
		quickSort(0, array1.length-1, array1);
		printRes(array1);

	}
	
	
	
	
public static void quickSort(int left,int right,int []arr) {
	
	
	if(left > right)
		return ;
	//注意 为防止 lft溢出 递归终止条件在temp前面
	int lft=left;
	int rgt=right;
	int temp=arr[lft],tp;
	
	
	
	while (lft<rgt) {
		
		//从右到左 找比基准小的
		while(arr[rgt]>=temp && rgt>lft)
			rgt--;
		while (arr[lft]<=temp && rgt>lft) {
			lft++;
			
		}
		if(lft<rgt)
		{
			tp=arr[lft];
			arr[lft]=arr[rgt];
			arr[rgt]=tp;
		}
		
		
	}
	
	arr[left]=arr[rgt];
	arr[rgt]=temp;
	quickSort(left, rgt-1, arr);//在基准数左边进行排序
	quickSort(rgt+1, right, arr);//      右边
	
	
}
public static void printRes(int [] arr) {
	for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i] +" ");
		
	}
	
	System.out.print("\n");
}

}

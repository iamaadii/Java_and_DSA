package binary_search;

public class PositionOfAnElementInInfiniteSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3, 5, 7, 9, 10, 90,
                100, 130, 140, 160, 170};
		System.out.println(fun(arr,10));

	}
	
	static int fun(int[] arr,int target)
	{
		int start=0;
		int end=1;
		
		while(target>arr[end])
		{
			int new_start=end+1;
			end=end+(end-start+1)*2;
			start=new_start;
		}
		return searching(arr,target,start,end);
	}
	
	static int searching(int[] arr,int target,int start,int end)
	{
		while(start<=end)
		{
			int mid=start+(end-start)/2;
			if(target>arr[mid])
				start=mid+1;
			else if(target<arr[mid])
				end=mid-1;
			else
				return mid;
		}
		return -1;
	}

}

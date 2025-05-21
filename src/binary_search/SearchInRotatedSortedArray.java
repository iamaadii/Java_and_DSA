//leet-code problem No: 33

package binary_search;

public class SearchInRotatedSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {4,5,6,7,0,1,2};
		System.out.println(search(arr,0));

	}
	
	static int search(int[] arr,int target)
	{
		int pivot=findPivot(arr);
		
		int ans=-1;
		ans=binarySearch(arr,0,pivot,target);
		if(ans==-1)
			ans=binarySearch(arr,pivot+1,arr.length-1,target);
		
		return ans;
	}
	
	static int findPivot(int[] arr)
	{
		int start=0;
		int end=arr.length-1;
		
		while(start<=end)
		{
			int mid=start+(end-start)/2;
			
			if((mid<end) && (arr[mid]>arr[mid+1]))
				return mid;
			
			else if(mid>start && arr[mid]<arr[mid-1])
				return mid-1;
			
			if(arr[start]<=arr[mid])
				start=mid+1;
			
			else
				end=mid+1;
		}
		return -1;		
	}
	
	static int binarySearch(int[] arr,int start,int end,int target)
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

//leet-code problem no: 34

package binary_search;

import java.util.Arrays;

public class FirstAndLastIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {5,7,7,7,7,8,9,10};
		System.out.println(Arrays.toString(searchRange(arr,8)));

	}

	static int[] searchRange(int[] arr, int target) {
        int start=-1;
        int end=-1;
        int a = search(arr,target,true);
        int b=search(arr,target,false);

        start=a;
        end=b;

        return new int[] {start,end};
    }

    static int search(int[] arr,int target,boolean findStartIndex)
    {
            int ans=-1;
            int start = 0;
	        int end = arr.length - 1;

	        while(start <= end) {
	            int mid = start + (end - start) / 2;
	            if (target < arr[mid]) {
	                end = mid - 1;
	            } else if (target > arr[mid]) {
	                start = mid + 1;
	            } else {
	                ans=mid;
                    if(findStartIndex==true)
                        end=mid-1;
                    else
                        start=mid+1;
	            }
	        }
	        return ans;
    }

}

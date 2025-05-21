// ceiling : smallest element in the array which is >= target

package binary_search;

public class Ceiling {

	public static void main(String[] args) {
		int[] arr = {2,3,5,9,14,16,18};
		System.out.println(fun(arr,85));
	}
	
	static int fun(int[] arr,int target)
	{
		// but what if the target is greater than the greatest number in the array
		if(target>arr[arr.length-1])
			return -1;
		
		int start = 0;
	    int end = arr.length - 1;

	    while(start <= end) {
		    int mid = start + (end - start) / 2;
	
		    if (target < arr[mid]) {
		        end = mid - 1;
		    } 
		    else if (target > arr[mid]) {
		        start = mid + 1;
		    } 
		    else {
		        if(arr[mid]>=target)
		       	 return arr[mid];
		    }
	  }
	     
	  int res = arr[0];
	  for(int i=0;i<arr.length;i++)
	  {
		  if(arr[i]>=target)
		  {
	   		 res=arr[i];
	    	 break;
		  } 	 	
	  }
	  return res;
	}
	
}

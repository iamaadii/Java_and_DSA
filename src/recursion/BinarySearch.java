package recursion;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr= {11,22,34,56,78,79,89,99,110};
        System.out.println(fun(arr,0,arr.length-1,22));
    }
    
    static int fun(int[] arr,int start,int end,int target) {
    	if(start>end) {
    		return -1;
    	}
    	else {
	        int mid=start+(end-start)/2;
	        if(arr[mid]==target) { //base condition
	            return mid;
	        }
	        else if(target>arr[mid]) {
	            return fun(arr,mid+1,end,target); //divide & conquer recurrence relation 
	        }
	        else {
	            return fun(arr,start,mid-1,target); //divide & conquer recurrence relation 
	        }
    	}
    }

}

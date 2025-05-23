package binary_search;

public class ToCheckAscendingAndDescending {

	public static void main(String[] args) {
        int[] arr = {18,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1};
        int target = 7;
        System.out.println(orderAgnosticBS(arr, target));
    }
	

	 static int orderAgnosticBS(int[] arr, int target) {
	        int start = 0;
	        int end = arr.length - 1;

	        // find whether the array is sorted in ascending or descending
	        boolean isAsc = arr[start] < arr[end];

	        while(start <= end) {
	            int mid = start + (end - start) / 2;

	            if (arr[mid] == target) {
	                return mid;
	            }

	            if (isAsc) {
	                if (target < arr[mid]) {
	                    end = mid - 1;
	                } else {
	                    start = mid + 1;
	                }
	            } else {
	                if (target > arr[mid]) {
	                    end = mid - 1;
	                } else {
	                    start = mid + 1;
	                }
	            }
	        }
	        return -1;
	    }

}

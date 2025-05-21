//leet-code problem no: 410 

package binary_search;

public class SplitArrayLargestSum {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		System.out.println(splitArray(arr,1));
	}
	
	static int splitArray(int[] arr, int m) {
		int start=0;
		int end=0;
		
		for(int i=0;i<arr.length;i++) {
			start=Math.max(start, arr[i]);
			end=end+arr[i];
		}
		
		//apply binary search
		while(start<end) {
			int mid = start+(end-start)/2;
			
			//calculate how many pieces u can divide this array with this max sum. 
			int count=1;
			int sum=0;
			for(int num:arr) {
				if(sum+num>mid) {
					 // you cannot add this in this subarray, make new one
                    // say you add this num in new subarray, then sum = num
					sum=num;
					count++;
				}
				else {
					sum=sum+num;
				}
			}
			
			if(count>m) {
				start=mid+1;
			}
			else {
				end=mid;
			}
		}
		return end;
	}

}

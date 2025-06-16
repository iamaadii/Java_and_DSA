package bitwise_operator;

public class FindUniqueNumber {

	public static void main(String[] args) {
		int[] arr= {2,3,3,4,2,6,4};
		System.out.println(fun(arr));
		
		int[] nums= {1,2,1,2,1,3,2};
		System.out.println(fun1(nums));
	}
	
	static int fun(int[] arr) {
		int unique=0;
		for(int element:arr) {
			unique=unique^element;
		}
		return unique;
	}
	
	static int fun1(int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			String binary = Integer.toBinaryString(arr[i]);
		}
	}

}

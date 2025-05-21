package sorting;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
		int[] arr= {4,5,1,2,3};
		sorting(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	static void sorting(int[] arr)
	{
		for(int i=0;i<arr.length-1;i++) {
			int max=0;
			for(int j=1;j<arr.length-i;j++) {
				if(arr[j]>arr[max]) {
					max=j;
				}
			}
			int temp=arr[max];
			arr[max]=arr[arr.length-i-1];
			arr[arr.length-i-1]=temp;
		}
	}
}

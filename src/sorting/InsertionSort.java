package sorting;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr= {0,-23,56,18};
		sorting(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	static void sorting(int[] arr)
	{
		for(int i=0;i<arr.length-1;i++) {
				int j=i+1;
				while(j>0) {
					if(arr[j-1]>arr[j]) {
						int temp=arr[j-1];
						arr[j-1] = arr[j];
						arr[j] = temp;
					}
					else
						break;
					
					j--;
			}
		}
	}
}

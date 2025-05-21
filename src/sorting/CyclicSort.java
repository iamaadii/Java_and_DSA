package sorting;

import java.util.Arrays;

public class CyclicSort {
	
	public static void main(String[] args) {
		int[] arr= {5,4,3,2,1};
		sorting(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	static void sorting(int[] arr){
		
		int i=0;
		while(i<arr.length) { 
			if(arr[i]-1 != i) {
				int temp=arr[arr[i]-1];
				arr[arr[i]-1]=arr[i];
				arr[i]=temp;
			}
			else {
				i++;
			}
		}
	}
}

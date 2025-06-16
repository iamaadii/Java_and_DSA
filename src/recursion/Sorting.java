package recursion;

import java.util.Arrays;

public class Sorting {

	public static void main(String[] args) {
		int[] arr = {13,5,1,0};
		int[] res = bubbleSort(arr,arr.length-1,0);
		System.out.println(Arrays.toString(res));
		
		int[] arr1 = {4,3,2,1};
		selectionSort(arr1, arr1.length-1, 0,0);
		System.out.println(Arrays.toString(arr1));
		
		
		//by creating a new array
		int[] arr2 = {8,3,4,12,5,6};
		int[] res2 = mergeSort1(arr2);
		System.out.println(Arrays.toString(res2));
		
		
		//without creating new array
		int[] arr3 = {5,4,3,2,1};
		mergeSort2(arr3,0,arr3.length-1);
		System.out.println(Arrays.toString(arr3));
		
		int[] arr4 = {12,9,75,32,56};
		quickSort(arr4,0,arr4.length-1);
		System.out.println(Arrays.toString(arr4));
		
	}
	
	static int[] bubbleSort(int[] arr,int row,int col) {
		if(row==0) {
			return arr;
		}
		if(col<row) {
			if(arr[col]>arr[col+1]) {
				int temp=arr[col];
				arr[col] = arr[col+1];
				arr[col+1] = temp;
			}
			return bubbleSort(arr,row,col+1);
		}
		else {
			return bubbleSort(arr,row-1,0);
		}
	}
	
	static void selectionSort(int[] arr,int row,int col,int max) {
		if(row==0) {
			return;
		}
		
		if(col<row) {
			if(arr[col+1]>arr[max]) {
				selectionSort(arr, row, col+1, col+1);
			}else {
				selectionSort(arr, row, col+1, max);
			}
		}
		else {
			int temp = arr[max];
			arr[max] = arr[row];
			arr[row] = temp;
			selectionSort(arr, row-1, 0,0);
		}
	}
	
	static int[] mergeSort1(int[] arr) {
		if(arr.length==1) {
			return arr;
		}
		int mid = arr.length/2;
		int[] left = mergeSort1(Arrays.copyOfRange(arr,0,mid));
		int[] right = mergeSort1(Arrays.copyOfRange(arr,mid,arr.length));
		return merge1(left, right);
	}
	static int[] merge1(int[] first,int[] second) {
		int[] mix = new int[first.length + second.length]; 
		int i = 0;
		int j = 0;
		int k = 0;	
		while(i<first.length && j<second.length) {
			if(first[i]<second[j]) {
				mix[k] = first[i];
				i++;
			}
			else {
				mix[k] = second[j];
				j++;
			}
			k++;
		}		
		while(i<first.length) {
			mix[k] = first[i];
			i++;
			k++;
		}	
		while(j<second.length) {
			mix[k] = second[j];
			j++;
			k++;
		}	
		return mix;
	}
	
	static void mergeSort2(int[] arr,int start,int end) {
		if(end-start==0) {
			return;
		}
		
		int mid = start+(end-start)/2;
		mergeSort2(arr,start,mid);
		mergeSort2(arr,mid+1,end);
		
		merge2(arr,start,mid,end);
		
	}
	
	static void merge2(int[] arr,int start,int mid,int end) {
		int[] mix = new int[end-start+1]; 
		int i = start;
		int j = mid+1;
		int k = 0;
		
		while(i<=mid && j<=end) {
			if(arr[i]<arr[j]) {
				mix[k] = arr[i];
				i++;
			}
			else {
				mix[k] = arr[j];
				j++;
			}
			k++;
		}
		
		while(i<=mid) {
			mix[k] = arr[i];
			i++;
			k++;
		}
		
		while(j<=end) {
			mix[k] = arr[j];
			j++;
			k++;
		}
		
		for(int l=0;l<mix.length;l++) {
			arr[start+l] = mix[l];
		}
	}
	
	static void quickSort(int[] arr,int low,int high) {
		
		if(low>=high) {
			return;
		}
		
		int start = low;
		int end = high;
		int mid = start+(end-start)/2;
		int pivot = arr[mid];
		
		while(start<=end) {
			while (arr[start] < pivot) {
	            start++;
	        }
	        while (arr[end] > pivot) {
	            end--;
	        }

	        if (start <= end) {
	            int temp = arr[start];
	            arr[start] = arr[end];
	            arr[end] = temp;
	            start++;
	            end--;
	        }
		}
		
		quickSort(arr,low,end);
		quickSort(arr,start,high);
	}

}

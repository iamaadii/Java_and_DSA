package recursion.lecture3;

import java.util.ArrayList;

public class ArrayQuestions {

	public static void main(String[] args) {
		int[] arr= {7,9,23,23,17,45};
		System.out.println(isSorted(arr, 0));
		System.out.println(findIndex(arr, 0, 17));
		
		System.out.println(findAllIndex1(arr, 23, 0, new ArrayList<>()));
		
		ArrayList<Integer> result = findAllIndex2(arr, 23, 0);
		System.out.println(result);
	}
	
	static boolean isSorted(int[] arr,int i) {
		
		if(i==arr.length-1) {
			return true;
		}
		
		if(arr[i]>arr[i+1]) {
			return false;
		}
		return isSorted(arr, i+1);
	}
	
	static int findIndex(int[] arr,int index,int key) {
		if(index==arr.length) {
			return -1;
		}
		
		else if(arr[index]==key) {
			return index;
		}
		else {
			return findIndex(arr, index+1,key);
		}
	}
	
	static ArrayList<Integer> findAllIndex1(int[] arr,int target,int index,ArrayList<Integer> list) {
		if(index==arr.length) {
			return list;
		}
		
		if(arr[index]==target) {
			list.add(index);
		}
		
		return findAllIndex1(arr, target, index+1, list);
	}
	
	static ArrayList<Integer> findAllIndex2(int[] arr,int target,int index){
		ArrayList<Integer> list = new ArrayList<>();
		
		if(index==arr.length) {
			return list;
		}
		
		if(arr[index]==target) {
			list.add(index);
		}
		
		ArrayList<Integer> ansFromBelowCalls = findAllIndex2(arr, target, index+1); 
		list.addAll(ansFromBelowCalls);
		
		return list;
	}
}

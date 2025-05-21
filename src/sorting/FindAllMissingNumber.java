// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
// Asked in Google

package sorting;

import java.util.ArrayList;

class FindAllMissingNumber {
	public static void main(String[] args) {
		int arr[]={4,3,2,7,8,2,3,1};
		System.out.println(fun(arr));
	}
	
    static ArrayList<Integer> fun(int[] arr) {
    	ArrayList<Integer> list = new ArrayList<>();

        int i=0;
        while(i<arr.length){
            if(arr[arr[i]-1]!=arr[i])
            {
                int temp=arr[arr[i]-1];
                arr[arr[i]-1]=arr[i];
                arr[i]=temp;
            }
            else
            {
                i++;
            }
        }

        for(int j=0;j<arr.length;j++){
            if(arr[j]!=j+1){
                list.add(j+1);
            }
        }
        return list;
    }
}
package array_and_arrayList;

import java.util.Arrays;

public class PassingStringArrayInFunction {

	public static void main(String[] args) {
		
		String[] arr= {"Aditya","Aman","Ajay"};
		System.out.println(Arrays.toString(arr));
		fun(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	static void fun(String[] a)
	{
		a[1]="Shankar";
	}

}

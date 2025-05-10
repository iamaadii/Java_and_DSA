package array_and_arrayList;

import java.util.Arrays;

public class PassingIntegerArrayInFunction {

	public static void main(String[] args) {
		
		int[] arr= {34,45,85};
		System.out.println(Arrays.toString(arr));
		fun(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	static void fun(int[] a)
	{
		a[1]=985;
	}

}

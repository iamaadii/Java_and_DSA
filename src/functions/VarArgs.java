package functions;
import java.util.Arrays;

public class VarArgs {

	public static void main(String[] args) 
	{		
		fun1(10,20,40);
		
		//var-args always will always pass at the end 
		fun2(10,20,"aditya","ajay","aman"); 
	}
	
	static void fun1(int ...num)
	{
		// num stores data in the for of array of integers
		System.out.println(Arrays.toString(num));
	}
	
	static void fun2(int a,int b,String ...arr)
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(Arrays.toString(arr));
	}
}

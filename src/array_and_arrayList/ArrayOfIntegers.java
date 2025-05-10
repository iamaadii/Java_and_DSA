package array_and_arrayList;
import java.util.*;

public class ArrayOfIntegers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[3];
		
		//inputs using for loop
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("Enter data : ");
			arr[i]=sc.nextInt();
		}
		
		//output using for loop
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		//output using enhanced for loop
		for(int num:arr)
		{
			System.out.print(num+" ");
		}
		System.out.println();
		
		//output in one line
		System.out.println(Arrays.toString(arr));
	}
}


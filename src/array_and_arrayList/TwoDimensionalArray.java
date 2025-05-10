package array_and_arrayList;
import java.util.*;

public class TwoDimensionalArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr= new int[3][2];
		
		//taking input
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
		 		System.out.print("Enter data : ");
				arr[i][j] = sc.nextInt();
			}	
		}
		
		//output using for-loop
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
				System.out.print(arr[i][j]+" ");
			System.out.println();
		}
		System.out.println();
		
		// output in one-line
		for(int i=0;i<arr.length;i++)
			System.out.println(Arrays.toString(arr[i]));
		System.out.println();
		
		// using enhanced for-loop
		for(int[] num : arr)
			System.out.println(Arrays.toString(num));
	}
}



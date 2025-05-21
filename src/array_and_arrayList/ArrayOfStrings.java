package array_and_arrayList;
import java.util.*;

public class ArrayOfStrings {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] arr = new String[2];
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("Enter string : ");
			arr[i]=sc.next();
		}
		
		arr[1]="Aditya";//modifying
		
		System.out.println(Arrays.toString(arr));
		
		//output using for-each loop
		for(String res:arr){
			System.out.print(res+" ");
		}
		
	}

}

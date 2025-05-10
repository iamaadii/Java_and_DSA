package array_and_arrayList;
import java.util.*;

public class MultiDimensionalArrayList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
		
		//initialization
		for(int i=0;i<3;i++)
			arr.add(new ArrayList<>());
		
		System.out.println(arr);
		
		//add elements
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
				arr.get(i).add(sc.nextInt());
		}
		
		System.out.println(arr);
	}
}


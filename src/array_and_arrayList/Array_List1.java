package array_and_arrayList;
import java.util.ArrayList;

public class Array_List1 {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		
		//to add
		arr.add(56);
		arr.add(75);
		arr.add(52);
		arr.add(62);
		arr.add(92);
		System.out.println(arr);
		
		//for getting value at some index
		System.out.println(arr.get(0));
		
		//to check whether some element is present or not
		System.out.println(arr.contains(75));
		
		//to modify value of any index
		arr.set(0, 784);
		System.out.println(arr);
		
		//removing element through index
		arr.remove(0);
		System.out.println(arr);	
	}
}


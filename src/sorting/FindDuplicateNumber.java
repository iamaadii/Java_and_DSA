//leet-code : 287

package sorting;
import java.util.ArrayList;

public class FindDuplicateNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {3,1,3,4,2};
		fun(arr);

	}
	
	static void fun(int[] arr) {
		ArrayList<Integer> list=new ArrayList<>();
		int res=0;
		for(int i=0;i<arr.length;i++) {
			if(list.contains(arr[i])) {
				res=arr[i];
			}
			else {
				list.add(arr[i]);
			}	
		}	
		System.out.println(res);
		
    }
}

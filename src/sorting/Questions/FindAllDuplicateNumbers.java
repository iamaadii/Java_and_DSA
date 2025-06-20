// leet-code : 

package sorting.Questions;
import java.util.*;

public class FindAllDuplicateNumbers {

	public static void main(String[] args) {
		int arr[]={4,3,2,7,8,2,3,1};		
		ArrayList<Integer> res=new ArrayList<>();
		
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
                res.add(arr[j]);
            }
        }
        System.out.println(res);
	}

}

//leet-code: 645

package sorting.Questions;
import java.util.*;

public class SetMismatch {
	public static void main(String[] args) 
    {
        int arr[]={1,2,2,4};
        int[] res=new int[2];
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
                res[0]=arr[j];
                res[1]=j+1;
            }
        }
        System.out.println(Arrays.toString(res));
    }
}

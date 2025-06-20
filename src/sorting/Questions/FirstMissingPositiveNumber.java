// leet-code : 41

package sorting.Questions;

public class FirstMissingPositiveNumber {

	public static void main(String[] args) {
		int[] arr={3,4,-1,1};
		System.out.println(fun(arr));
	}

	static int fun(int[] arr) {
        int i=0;
        while(i<arr.length){
         int correct=arr[i]-1;
         if(arr[i]>0 && arr[i]<=arr.length && arr[correct]!=arr[i]){
             int temp=arr[correct];
             arr[correct]=arr[i];
             arr[i]=temp;
         }
         else{
             i++;
         }
        }
        
        for(int j=0;j<arr.length;j++){
            if(arr[j]!=j+1){
                return j+1;
            }
        }
        return arr.length+1;
    }

}

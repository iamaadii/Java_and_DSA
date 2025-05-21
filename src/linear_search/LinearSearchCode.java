package linear_search;

public class LinearSearchCode {

	public static void main(String[] args) {
		int[] arr= {52,65,85,75};
		int target=54;
		System.out.print(fun(arr,target));

	}
	
	static int fun(int[] a,int target)
	{
		int i=0;
		for(i=0;i<a.length;i++)
		{
			if(a[i]==target)
				return i;
		}
		return -1;
	}

}

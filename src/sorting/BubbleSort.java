package sorting;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		
		boolean swapped=true;
		int[] arr= {-1,7,-32,89};
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=1;j<arr.length-i;j++)
			{
				if(arr[j]<arr[j-1])
				{
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
					swapped=true;
				}
			}
			
			if(swapped==false)
				break;
		}
		
		System.out.println(Arrays.toString(arr));

	}

}

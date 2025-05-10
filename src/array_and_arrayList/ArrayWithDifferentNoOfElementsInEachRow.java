package array_and_arrayList;

public class ArrayWithDifferentNoOfElementsInEachRow {

	public static void main(String[] args) {
		
		int[][] arr = {
						{1,3,45,5},
						{2},
						{4,56,7}
					};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}




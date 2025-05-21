package binary_search;

import java.util.Arrays;

public class SeachInSortedMatrix {

	public static void main(String[] args) {
		int[][] arr = {
				{1, 2, 3},
			    {4, 5, 6},
			    {7, 8, 9},
			    {10, 11, 12}
        };

        System.out.println(Arrays.toString(search(arr, 12)));
	}

	static int[] search(int[][] matrix, int target) {
		int r = matrix.length - 1;
        int c = 0;

        while (c < matrix.length && r >= 0) {
            if (matrix[r][c] == target) {
                return new int[]{r, c};
            }
            if (matrix[r][c] < target) {
                c++;
            } else {
                r--;
            }
        }
        return new int[]{-1, -1};
    }
}

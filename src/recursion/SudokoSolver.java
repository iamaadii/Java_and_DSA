package recursion;

import java.util.Arrays;

public class SudokoSolver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {
				{5,3,0,0,7,0,0,0,0},
				{6,0,0,1,9,5,0,0,0},
				{0,9,8,0,0,0,0,6,0},
				{8,0,0,0,6,0,0,0,3},
				{4,0,0,8,0,3,0,0,1},
				{7,0,0,0,2,0,0,0,6},
				{0,6,0,0,0,0,2,8,0},
				{0,0,0,4,1,9,0,0,5},
				{0,0,0,0,8,0,0,7,9},
		};
		if (solve(0, 0, arr)) {
            for (int[] row : arr) {
                System.out.println(Arrays.toString(row));
            }
        } else {
            System.out.println("No solution exists.");
        }
	}
	
	static boolean solve(int row,int col,int[][] arr) {
		
		if(col==arr.length) {
			return solve(row+1, 0, arr);
		}
		
		if(row==arr.length) {
			return true;  
		}
		
		if (arr[row][col] != 0) {
            return solve(row, col + 1, arr);
        }
		
		for (int num = 1; num <= 9; num++) {
            if (isSafe(num, row, col, arr)) {
                arr[row][col] = num;
                if (solve(row, col + 1, arr)) {
                    return true;
                }
                else {
                	arr[row][col] = 0; // backtrack
                }
            }
        }
		return false;
		
	}
	
	static boolean isSafe(int num,int row,int col,int[][] arr) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i][col]==num || arr[row][i]==num) {
				return false;
			}
		}
		
		int sqrt =(int)(Math.sqrt(arr.length));
		int new_row = row - row%sqrt; 
		int new_col = col - col%sqrt;
		
		for(int i=new_row;i<new_row+sqrt;i++) {
			for(int j=new_col;j<new_col+sqrt;j++) {
				if(arr[i][j]==num) {
					return false;
				}
			}
		}
		return true;		
	}

}

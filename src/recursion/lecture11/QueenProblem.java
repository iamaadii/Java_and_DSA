package recursion.lecture11;
import java.util.*;

public class QueenProblem {

	public static void main(String[] args) {
		boolean[][] board = new boolean[4][4];
		System.out.println(nQueen(board, 0));	
	}
	
	static int nQueen(boolean[][] board,int row) {
		
		if(row==board.length) {
			display(board);
			System.out.println();
			return 1;
		}
		
		int count=0;
		for(int col=0;col<board.length;col++) {
			
			//place the queen if it is safe
			if(safe(board,row,col)) {
				board[row][col]=true;
				count=count+nQueen(board, row+1);
				board[row][col]=false; //backtracking
			}
		}
		return count;
	}
	
	static boolean safe(boolean[][] board,int row,int column) {
		//vertical row
		for(int i=0;i<row;i++) {
			if(board[i][column]) {
				return false;
			}
		}
		
		// upper-right diagonal
		for(int i = row - 1, j = column + 1; i >= 0 && j < board.length; i--, j++) {
		    if(board[i][j]) return false;
		}
		
		// upper-left diagonal
		for(int i = row - 1, j = column - 1; i >= 0 && j >= 0; i--, j--) {
		    if(board[i][j]) return false;
		}
		return true;
	}
	
	static void display(boolean[][] board) {
		for(boolean[] arr:board) {
			for(boolean element:arr) {
				System.out.print(element ? "Q " : "X ");
			}
			System.out.println();
		}
	}
}

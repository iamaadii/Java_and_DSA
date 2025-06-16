package recursion;

public class NightProblem {

	public static void main(String[] args) {
		boolean[][] board = new boolean[2][2];
		nKnight(board, 0,0,2);	
	}
	
	static void nKnight(boolean[][] board,int row,int col,int knights) {
		
		if(knights==0) {
			display(board);
			System.out.println();
			return;
		} 
		
		if(row==board.length) {
			return;
		}
		 
		if(col==board.length) {
			nKnight(board, row+1, 0, knights);
			return;
		}
		
		if(safe(board,row,col)) {
			board[row][col]=true;
			nKnight(board, row,col+1,knights-1);
			board[row][col]=false; //backtracking
		}	
		nKnight(board, row,col+1,knights);
	}
	
	static boolean safe(boolean[][] board,int row,int col) {
		int[][] moves = {
	            {-2, -1}, {-2, +1},
	            {-1, -2}, {-1, +2}
	        };

	        for (int[] move : moves) {
	            int r = row + move[0];
	            int c = col + move[1];
	            if (isValid(board, r, c) && board[r][c]) {
	                return false;
	            }
	        }
	        return true;
	}
	
	static boolean isValid(boolean[][] board, int r,int c) {
		return r >= 0 && r < board.length && c >= 0 && c < board.length;
	}
	
	static void display(boolean[][] board) {
		for(boolean[] arr:board) {
			for(boolean element:arr) {
				System.out.print(element ? "N " : "- ");
			}
			System.out.println();
		}
	}

}

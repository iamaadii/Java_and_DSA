package recursion;

import java.util.*;

public class MazeProblem {

	public static void main(String[] args) {
		System.out.println(countingPaths(3, 3));
		System.out.println(completePaths("", 3, 3));
		System.out.println(diagonallyPath("", 3, 3));
		
		
		boolean[][] arr = {
				{true,true,true},
				{true,false,true},
				{true,true,true}
		};
		mazeWithObstacles("", 0, 0, arr);
		System.out.println();
				
		boolean[][] arr1 = {
				{true,true,true},
				{true,true,true},
				{true,true,true}
		};
		int[][] path = {
				{0,0,0},
				{0,0,0},
				{0,0,0}
		};
		allPaths("", 0, 0, arr1,path,1);
	}
	
	static int countingPaths(int row,int column) {
		if(row==1 || column==1) {
			return 1;
		}
		
		int left = countingPaths(row-1, column);
		int right = countingPaths(row, column-1);
		
		return left+right;
	}
	
	static List<String> completePaths(String res,int row,int column) {
		if(row==1 && column==1) {
			List<String> l = new ArrayList<>();
			l.add(res);
			return l;
		}
		
		List<String> temp = new ArrayList<>();
		
		if(row>1) {
			List<String> downwards = completePaths(res+'D',row-1, column);
			temp.addAll(downwards);
		}
		
		if(column>1) {
			List<String> right = completePaths(res+'R',row, column-1);
			temp.addAll(right);
		}
		return temp;
	}
	
	static List<String> diagonallyPath(String res,int row,int column) {
		if(row==1 && column==1) {
			List<String> l = new ArrayList<>();
			l.add(res);
			return l;
		}
		
		List<String> temp = new ArrayList<>();
		
		if(row>1) {
			List<String> downwards = diagonallyPath(res+'V',row-1, column);
			temp.addAll(downwards);
		}
		
		if(column>1) {
			List<String> right = diagonallyPath(res+'H',row, column-1);
			temp.addAll(right);
		}
		
		if(row>1 && column>1) {
			List<String> right = diagonallyPath(res+'D',row-1 , column-1);
			temp.addAll(right);
		}
		
		return temp;
	}
	
	static void mazeWithObstacles(String res,int row,int column,boolean[][] maze) {
		if(maze[row][column]==false) {
			return;
		}
		
		if(row==maze.length-1 && column==maze.length-1) {
			System.out.println(res);
			return;
		}
		
		if(row<maze.length-1) {
			mazeWithObstacles(res+'D', row+1, column, maze);
		}
		if(column<maze.length-1) {
			mazeWithObstacles(res+'R', row, column+1, maze);
		}
	}
	
	static void allPaths(String res,int row,int column,boolean[][] maze,int[][] path,int step) {
		if(maze[row][column]==false) {
			return;
		}
		
		if(row==maze.length-1 && column==maze.length-1) {
			path[row][column] = step;
			for(int[] arr:path) {
				System.out.println(Arrays.toString(arr));
			}
			System.out.println(res+"\n");
			return;
		}
		
		maze[row][column] = false;
		path[row][column] = step;
		if(row<maze.length-1) {
			allPaths(res+'D', row+1, column, maze,path,step+1);
		}
		if(column<maze.length-1) {
			allPaths(res+'R', row, column+1, maze,path,step+1);
		}
		if(row>0) {
			allPaths(res+'U', row-1, column, maze,path,step+1);
		}
		if(column>0) {
			allPaths(res+'L', row, column-1, maze,path,step+1);
		}
		maze[row][column] = true;
		path[row][column] = 0;
		
	}
}

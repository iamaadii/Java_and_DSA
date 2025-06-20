package recursion.lecture4;

public class PatternPrinting {

	public static void main(String[] args) {
		fun1(4,0);
		fun2(4,0);
	}
	
	static void fun1(int row, int col) {
		//base condition
		if(row==0) {
			return; 
		}
		if(col<row) {
			System.out.print("* ");
			fun1(row, col+1);
		}	
		else{
			System.out.println();
			fun1(row-1, 0);
		}
	}
	
	static void fun2(int row, int col) {
		//base condition
		if(row==0) {
			return; 
		}
		if(col < row) {
			fun2(row, col+1);
			System.out.print("* ");
		}	
		else{
			fun2(row-1, 0);
			System.out.println();
		}
	}

}

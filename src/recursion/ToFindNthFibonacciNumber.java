package recursion;

public class ToFindNthFibonacciNumber {

	public static void main(String[] args) {
		System.out.println(fun(5));
		System.out.println(fibFormulae(50));
	}
	
	static int fun(int n) {
		if(n==0 || n==1) { //base condition
			return n;
		}
		return fun(n-1) + fun(n-2);	//linear recurrence relation
	}
	
	static int fibFormulae(int n) {
		return (int) ((Math.pow((1+Math.sqrt(5))/2,n) - Math.pow((1-Math.sqrt(5))/2,n)) / Math.sqrt(5));
	}
}

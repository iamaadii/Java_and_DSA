package conditional_and_loops;

public class Fibonacci_Number {

	public static void main(String[] args) {
		
		int a = 0;
		int b = 1;
		int n = 7;
		
		for(int i=3;i<=n;i++)
		{
			int temp=b;
			b=a+b;
			a=temp;
		}
		
		System.out.println("Value of "+ n+"th term is "+b);
	}

}

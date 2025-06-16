package bitwise_operator;

public class EvenOdd {

	public static void main(String[] args) {
		fun(20);
	}
	
	static void fun(int n)
	{
		if((n&1) == 0)
			System.out.println("Even");
		else
			System.out.println("Odd");
	}

}

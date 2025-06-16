package bitwise_operator;

public class Swap_to_numbers {

	public static void main(String[] args) {
		int a = 5;
		int b = 3;
		a = a^b;
		b = a^b;
		a = a^b;
		System.out.println(a+" "+b);
	}
}

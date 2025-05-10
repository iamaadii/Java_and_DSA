package functions;
import java.util.Scanner;

public class PrimeNumberChecker {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		System.out.println(isPrime(num));

	}
	
	static boolean isPrime(int num)
	{
		if(num<1) {
			return false;
		}
		
		int count=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				count++;
			}
		}
		
		if(count==2)
			return true;
		else
			return false;
	}

}

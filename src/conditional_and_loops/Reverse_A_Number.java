package conditional_and_loops;

public class Reverse_A_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 123456;
		int rev=0;
		
		while(num>0) {
			int rem = num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		
		System.out.println(rev);
	}

}

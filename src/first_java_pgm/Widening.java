package first_java_pgm;

public class Widening {

	public static void main(String[] args) {

		// widening,automatic,implicit type-conversion
		float f = 10;
		System.out.println(f);
		
		int i = 'A';
		System.out.println(i);
		
		byte a = 10;
		byte b = 20;
		int c = a*b; // here java automatically assigns value to an integer
		System.out.println(c);
		
	}

}

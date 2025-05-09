package first_java_pgm;

public class Narrowing {

	public static void main(String[] args) {

		// narrowing,explicit type-conversion
		
		int a = 257;
		byte b = (byte)257;
		System.out.println(b); // 257 % 256 = 1 as max. no of value byte can store in 256
		
		double d = 100.04;
		long l = (long)d;
		int i = (int)(d);
		
		System.out.println(l);
		System.out.println(i);
		
	}

}

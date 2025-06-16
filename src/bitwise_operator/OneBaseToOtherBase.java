package bitwise_operator;

public class OneBaseToOtherBase {

	public static void main(String[] args) {
		decimalToBinary(18);
		decimaltoOctal(10);
		binarytoDecimal("1111");
	}
	
	static void decimalToBinary(int n) {
	    if (n == 0) {
	        System.out.println("0");
	        return;
	    }
	    String binary = "";
	    while (n > 0) {
	        binary = (n % 2) + binary;
	        n = n / 2;
	    }
	    System.out.println(binary);
	}

	static void decimaltoOctal(int n) {
		if (n == 0) {
	        System.out.println("0");
	        return;
	    }
	    String s = "";
	    while (n > 0) {
	        s = (n % 8) + s;
	        n = n / 8;
	    }
	    System.out.println(s);
	 }
	
	static void binarytoDecimal(String s) {
		int value=0;
		for(int i=s.length()-1;i>=0;i--) {
			value = (int) (value+(s.charAt(i)-48)*Math.pow(2, s.length()-1-i));
		}
		System.out.println(value);
	}
	
	
}

/*
gives you the number of digits required to represent a positive integer n 
in base b
 
Works only for positive integers.
For number = 0, it will throw an error (log(0) is undefined).
*/

package bitwise_operator;

public class NoOfDigits {

	public static void main(String[] args) {
		int  number = 10;
		int base = 2;
		
		int digit = (int)(Math.log(number)/Math.log(base))+1;
		System.out.println(digit);
	}

}

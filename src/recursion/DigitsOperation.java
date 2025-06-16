package recursion;

public class DigitsOperation {

	public static void main(String[] args) {
		System.out.println(sumOfDigits(1342));
		System.out.println(productOfDigits(142));
		System.out.println(reverseNumber(1824));
		System.out.println(isPalindrome(12321));
		System.out.println(noOfZeroes(1302104,0));
	}
	
	static int sumOfDigits(int n) {
		if(n==0) {
			return 0;
		}
		return n%10 + sumOfDigits(n/10);
	}
	
	static int productOfDigits(int n) {
		if(n==0) {
			return 1;
		}
		return n%10 * productOfDigits(n/10);
	}
	
	static int reverseNumber(int n) {
		int totalDigits = (int)Math.log10(n)+1;
		return helper(n,totalDigits);
	}
	
	static int helper(int n,int digits) {
		if(n%10==n) {
			return n;
		}
		return (n%10) * (int)(Math.pow(10, digits-1)) + helper(n/10,digits-1);
	}
	
	static boolean isPalindrome(int n) {
		return n==reverseNumber(n);
	}
	
	static int noOfZeroes(int n,int count) {
		if(n==0) {
			return count;
		}
		if(n%10==0) {
			return noOfZeroes(n/10, count+1);
		}
		return noOfZeroes(n/10,count);
		
	}
}

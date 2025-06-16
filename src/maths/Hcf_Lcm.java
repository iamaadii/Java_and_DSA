// hCF/GCD = minimum value of equation ax+by where x and y are integers..... largest number that divides both.
// LCM(a,b) = minimum number divisible by both a and b.

//formulae a*b = LCM(a,b) * HCF(a,b)

package maths;

public class Hcf_Lcm {

	public static void main(String[] args) {
		System.out.println(usingDivisionMethod(18, 12));
		System.out.println(usingEuclidian(12,18));
		System.out.println(lcm(9,18));
	}
	
	static int usingDivisionMethod(int a,int b) {
		while (b != 0) {
	        int rem = a % b;
	        a = b;
	        b = rem;
	    }
	    return a; 
	}

	static int usingEuclidian(int a,int b) {
		if(b==0) {
			return a;
		}
		return usingEuclidian(b,a%b);
	}
	
	static int lcm(int a,int b) {
		int hcf = usingEuclidian(a, b);
		int f = a/hcf;
		int g = b/hcf;
		
		return f*g*hcf;
	}

}

package maths;

public class FactorsOfaNumber {

	public static void main(String[] args) {
		factors(36);
	}
	
	//time-complexity = O(sqrt(n))
	static void factors(int n) {
		for(int i=1;i<=Math.sqrt(n);i++) {
			if(n%i==0) {
				if(n/i==i) {
					System.out.print(i);
				}
				else {
					System.out.println(i+" "+n/i);
				}
			}
		}
	}

}

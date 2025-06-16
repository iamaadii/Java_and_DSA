package maths;

public class ToCheckPrimeNumber {

	public static void main(String[] args) {
		
		System.out.println(ofaNumber(36));
		
		int a=2;
		int b=40;
		boolean[] primes = new boolean[b+1];
		betweenTwoNumber(a,b, primes);
	}
	
	//time complexity = O(sqrt(n))
	static Boolean ofaNumber(int n) {
		if(n<=1) {
			return false;
		}
		
		int i=2;
		while(i<=Math.sqrt(n)) {
			if(n%i==0) {
				return false;
			}
			i++;
		}
		return true;
	}

	//false in array primes means number is prime
	// time complexity = N*log(log(N))
	static void betweenTwoNumber(int a,int b,boolean[] primes) {
		for(int i=a;i*i<=b;i++) {
			if(!primes[i]) {
				for(int j=i*2;j<=b;j=j+i) {
					primes[j]=true;
				}
			}
		}
		
		for(int i=a;i<=b;i++) {
			if(!primes[i]) {
				System.out.print(i+" ");
			}
		}
	}
}

package maths;

public class SquareRootOfaNumber {

	public static void main(String[] args) {
		int decimal = 3;
		sqrt(40,decimal);
		usingNewtonRapshonMethod(28);
	}
	
	//time complexity O(log N)
	static void sqrt(int n,int decimal) {
		int start = 0;
		int end = n;
		double root = 0.0;
		
		while(start<=end) {
			int mid = start+(end-start)/2;
			
			if(mid*mid==n) {
				root=mid;
				break;
			}
			else if(mid*mid>n) {
				end=mid-1;
			}
			else {
				start = mid+1;
			}
		}
		
		double inc = 0.1;
		for(int i=0;i<decimal;i++) {
			while(root*root<n) {
				root=root+inc;
			}
			root=root-inc;
			inc=inc/10;
		}
		
		System.out.println(root);
		System.out.printf("%.3f\n", root);
	}
	
	
	static void usingNewtonRapshonMethod(double n) {
		double x = n;
		double ans = 0.0;
		
		while(true) {
			ans = 0.5*(x+(n/x));
			
			if(Math.abs(ans-x) < 0.01) {
				break;
			}
			
			x=ans;
		}
		System.out.println(ans);
	}

}

package patterns;

public class Main {

	public static void main(String[] args) {
//		fun1(5);
//		fun2(5);
//		fun3(5);
//		fun4(5);
//		fun5(5);
//		fun6(5);
//		fun7(4);
//		fun8(4);
//		fun9(4);
//		fun10(6);
//		fun11(5);
//		fun12(5);
		fun13(5);
	}
	
	static void fun1(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	static void fun2(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	
	static void fun3(int n) {
		for(int i=1;i<2*n;i++) {
			if(i<=n) {
				for(int j=1;j<=i;j++) {
					System.out.print("* ");
				}
				System.out.println();
			}
			
			else {
				for(int k=1;k<=2*n-i;k++) {
					System.out.print("* ");
				}
				System.out.println();
			}
		}
	}
	
	static void fun4(int n) {
		for(int i=1;i<=n;i++) {
			for(int space=1;space<=n-i;space++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static void fun5(int n) {
		for(int i=1;i<2*n;i++) {
			if(i<=5) {
				for(int space=1;space<=n-i;space++) {
					System.out.print(" ");
				}
				for(int j=1;j<=i;j++) {
					System.out.print("* ");
				}
				System.out.println();
			}
			
			else {
				for(int space=1;space<=i-n;space++) {
					System.out.print(" ");
				}
				for(int j=1;j<=2*n-i;j++) {
					System.out.print("* ");
				}
				System.out.println();
			}
		}
	}
	
	static void fun6(int n) {
		for(int i=1;i<=n;i++) {
			for(int space=1;space<=n-i;space++) {
				System.out.print(" ");
			}
			
			for(int j=i;j>=1;j--) {
				System.out.print(j);
			}
			
			for(int j=2;j<=i;j++) {
				System.out.print(j);
			}
			
			System.out.println();
		}
	}
	
	static void fun7(int n) {
		for(int i=1;i<2*n;i++) {
			if(i<=n) {
				for(int space=1;space<=n-i;space++) {
					System.out.print("  ");
				}
				
				for(int j=i;j>=1;j--) {
					System.out.print(j+" ");
				}
				
				for(int j=2;j<=i;j++) {
					System.out.print(j+" ");
				}
				System.out.println();
			}
			
			else {
				for(int space=1;space<=i-n;space++) {
					System.out.print("  ");
				}
				
				for(int j=2*n-i;j>=1;j--) {
					System.out.print(j+" ");
				}
				
				for(int j=2;j<=2*n-i;j++) {
					System.out.print(j+" ");
				}				
				System.out.println();
			}
		}
	}
	
	static void fun8(int n) {  
		for(int i=1;i<2*n;i++) {
			for(int j=1;j<2*n;j++) {
				int top = i;
				int bottom = 2*n-i;
				int left = j;
				int right = 2*n-j;
				
				int element = n*2-3-Math.min(Math.min(top, bottom), Math.min(right, left));
				System.out.print(element+" ");
			}
			System.out.println();
		}
	}
	
	static void fun9(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			for(int space=1;space<=2*n-2*i;space++) {
				System.out.print(" ");
			}
			for(int j=i;j>=1;j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
	static void fun10(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=0;j<i;j++) {
				char c = (char)(j+65+n-i);
				System.out.print(c+" ");
			}
			System.out.println();
		}
	}
	
	static void fun11(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=0;j<=n-i;j++) {
				char c = (char)(65+n-i-j);
				System.out.print(c+" ");
			}
			System.out.println();
		}
	}
	
	static void fun12(int n) {
		int temp=96;
		for(int i=1;i<=5;i++){    
		    for(int j=1;j<=i;j++){
		        temp=temp+1;
		        if(temp%2==0){
		            int a = temp-32;
		            char b = (char)a;
		            System.out.print(b);
		        }
		        else{
		        char c = (char)temp;
		        System.out.print(c);
		        }
		    }
		    System.out.println();
		}
	}
	
	static void fun13(int n) {
		int temp=64;
		for(int i=1;i<=5;i++){
		    for(int j=1;j<=i;j++){
		        temp=temp+1;
		        char c = (char)temp;
		        System.out.print(c);
		    }
		    System.out.println();
		}	
	}

}

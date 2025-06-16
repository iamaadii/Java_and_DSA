package bitwise_operator;

public class Find_Nth_Magic_Number {

	public static void main(String[] args) {
		fun(6);
		fun1(3);
	}
	
	static void fun(int n) {
		String s = Integer.toBinaryString(n);
		int sum=0;
		for(int i=s.length()-1;i>=0;i--) {
			sum = (int) (sum+(s.charAt(i)-48)*Math.pow(5, s.length()-i));
		}
		System.out.println(sum);
	}
	
	static void fun1(int n) {
		double sum = 0;
		int j=1;
		while(n>0) {
			int lastdigit = n&1;
			sum = sum+lastdigit*Math.pow(5,j);
			j++;
			n=n>>1;
		}
		System.out.println(sum);
	}

}

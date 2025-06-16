package bitwise_operator;

public class Find_Xor_From_a_To_b {

	public static void main(String[] args) {
		int a=3;
		int b=9;
		int ans = xor(b)^xor(a-1);
		System.out.println(ans);
	}
	
	static int xor(int a) {
		int res=0;
		if(a%4==0) {
			return a;
		}
		if(a%4==1) {
			return 1;
		}
		if(a%4==2) {
			return a+1;
		}
		
		return 0;
	}

}

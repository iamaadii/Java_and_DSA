package bitwise_operator;

public class FindPower {

	public static void main(String[] args) {
		int base = 3;
		int num = 6;
		int ans = 1;
		while(num>0) {
			if((num&1)==0) {
				base=base*base;
			}
			else {
				ans=ans*base;
				base=base*base;
			}
			num=num>>1;
		}
		System.out.println(ans);
	}

}

package bitwise_operator;

public class ToCheckPowerOf2 {

	public static void main(String[] args) {
		int n=34;
		int count=0;
		while(n>0) {
			if((n&1)==1) {
				count++;
			}
			n=n>>1;
		}
		if(count==1) {
			System.out.println("power of 2");
		}
		else {
			System.out.println("not a power of 2");
		}
	}

}

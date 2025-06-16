package bitwise_operator;

public class BitManipulation {

	public static void main(String[] args) {
		get_ith_Bit(21,3);
		set_ith_Bit(86,4);
		resest_ith_Bit(86,5);
		rightMostSetBit(10);
	}
	
	static void get_ith_Bit(int n,int pos) {
		int mask = 1<<(pos-1);
		int num = n & mask;
		if(num==0) {
			System.out.println("position "+pos+" bit is 0");
		}
		else {
			System.out.println("position "+pos+" bit is 1");
		}
	}
	
	static void set_ith_Bit(int n,int pos) {
		int mask = 1<<(pos-1);
		int new_number = n | mask; //0->1 and 1->1
		System.out.println(new_number);
	}
	
	static void resest_ith_Bit(int n,int pos) {
		int mask = ~(1 << pos);
        int new_number = n&  mask; //1->0 and 0->0
		System.out.println(new_number);
	}
	
	static void rightMostSetBit(int n) { //number = first bit 1
		int number = n & -n;
		System.out.println(number);
	}

}

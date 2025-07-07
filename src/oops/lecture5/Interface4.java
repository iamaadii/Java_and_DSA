package oops.lecture5;

class Aman{
	interface Nested{
		boolean isOdd(int num);
	}
}

public class Interface4 implements Aman.Nested{

	@Override
	public boolean isOdd(int num) {
		return (num&1)==1;
	}
	
	public static void main(String[] args) {
		Interface4 obj = new Interface4();
		System.out.println(obj.isOdd(7));
	}
}

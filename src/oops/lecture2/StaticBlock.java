// here execution always starts from the static properties and it will run only once the static properties 

package oops.lecture2;

public class StaticBlock {
	
	static int a=4;
	static int b;
	
	static {
		System.out.println("hello from static block");
		b=a+1;
	}

	public static void main(String[] args) {
		
		StaticBlock obj1 = new StaticBlock();
		System.out.println(StaticBlock.a + "  " + StaticBlock.b);
		
		StaticBlock.b+=3;
		System.out.println(StaticBlock.a + "  " + StaticBlock.b);
				
		StaticBlock obj2 = new StaticBlock();
		System.out.println(StaticBlock.a + "  " + StaticBlock.b);
	}

}

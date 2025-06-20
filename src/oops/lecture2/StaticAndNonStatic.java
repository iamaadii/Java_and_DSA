package oops.lecture2;

public class StaticAndNonStatic {

	public static void main(String[] args) {
//		fun1(); // We cannot access a non-static members from static part without creating the object of class
		
		StaticAndNonStatic obj = new StaticAndNonStatic();
		obj.fun1();
	}
	
	void fun1() {
		System.out.println("Hello from fun1");
		fun2(); // we can call static method from non-static without creating their object		
	}
	
	static void fun2() {
		System.out.println("Hello from fun2");
	}

}

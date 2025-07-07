package oops.lecture5;

interface A{
	void fun1();
}

interface B extends A{
	void fun2();
}

public class Interface3 implements B  {

	@Override
	public void fun1() {
		System.out.println("from fun1()");	
	}

	@Override
	public void fun2() {
		System.out.println("from fun2()");
	}

	public static void main(String[] args) {
		Interface3 obj = new Interface3();
		obj.fun1();
		obj.fun2();
	}
}

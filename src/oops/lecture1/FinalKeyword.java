package oops.lecture1;


class A{
	final int num = 10;
	String name;
	
	public A(String name) {
		this.name=name;
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Object is destroyed");
	}
}

public class FinalKeyword {

	public static void main(String[] args) {
		final A kunal = new A("kunal");
		kunal.name = "other name";
		System.out.println(kunal.name);
		
		// when a non-primitive is final we cannot reassign it
//		kunal = new A("aman");
		
		
		A obj;
		for (int i = 0; i < 320000; i++) {
          obj = new A("Random name");
		}
			
	}

}

package oops.lecture2;


public class InnerClasses {
	
	static class Test{
		String name;
		public Test(String name) {
			this.name=name;
		}
	}

	public static void main(String[] args) {
		Test a = new Test("Aditya");
		Test b = new Test("Ajay");
		
		System.out.println(a.name);
		System.out.println(b.name);
	}

}

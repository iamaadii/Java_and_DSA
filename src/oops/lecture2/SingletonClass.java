package oops.lecture2;


class Main1{
	//This prevents any other class from creating an object using new Main1(). 
	//It restricts instantiation to inside the class only.
	private Main1() {
		
	}
	
	//This variable holds the single object of class Main1.
	private static Main1 instance;
	
	public static Main1 getInstance() {
		if(instance==null) {
			instance=new Main1();
		}
		return instance;
	}
}

public class SingletonClass {

	public static void main(String[] args) {
		
		//all 3 reference variable pointing to just one object
		Main1 obj1 = Main1.getInstance();
		Main1 obj2 = Main1.getInstance();
		Main1 obj3 = Main1.getInstance();
		
		System.out.println(obj1 == obj2); // true
		System.out.println(obj2 == obj3); // true 
	}

}

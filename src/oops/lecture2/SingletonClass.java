package oops.lecture2;


class Main1{
	private Main1() {
		
	}
	
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
	}

}

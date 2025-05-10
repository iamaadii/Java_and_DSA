package functions;

public class Without_Argument_With_ReturnType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(greet1());
		System.out.println(greet2());
	}
	
	// single return value
	static String greet1()
	{
		return "hello";
	}
	
	// multiple return value
	static String greet2()
	{
		return "hello "+"namaste";
	}
	
	

}

// It occurs at compile time
// function with same name but either with different 
//number of arguments or different data type of argument

package functions;

public class Method_Overloading {

	public static void main(String[] args) {
		fun(10);
		fun(10,20);
	}
	
	static void fun(int a) {
		System.out.println(a);
	}
	
	static void fun(int a,int b) {
		System.out.println(a);
		System.out.println(b);
	}	
}


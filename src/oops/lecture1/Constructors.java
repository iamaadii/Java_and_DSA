package oops.lecture1;
class Students{
	String name;
	int age;
	
	//here internally "this" will be replaced with the reference variable of that object
	Students(String name,int age){
		this.name=name;
		this.age=age;
	}
	
	// It's a way for calling one constructor from another
	// internally : new Students("Aman",22);
	Students(){
		this("Default person",22);
	}
	
	//assigning value of one object to another object by passing reference variable
	Students(Students other){
		this.name=other.name;
		this.age=other.age;
	}
	
	void greeting() {
		System.out.println("Namaste from "+this.name);
	}
	
}

public class Constructors {

	public static void main(String[] args) {
		
		Students aditya = new Students("Aditya Patel",19); //parameterized constructor
		System.out.println(aditya.name);
		System.out.println(aditya.age);
		aditya.greeting();
				
		Students defaultperson = new Students(); //default constructor
		System.out.println(defaultperson.name);
		System.out.println(defaultperson.age);
		defaultperson.greeting();
		
		Students random = new Students(aditya);
		System.out.println(random.name);
		System.out.println(random.age);
		random.greeting();
		
	}

}

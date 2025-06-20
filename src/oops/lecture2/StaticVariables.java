package oops.lecture2;

class Human{
	String name;
	int age;
	static int population;  //it will be common for all the objects
	
	public Human(String name,int age) {
		this.name=name;
		this.age=age;
		Human.population+=1;
		//this.population+=1; //it will also work but it is not adviceble to use it 
	}
}

public class StaticVariables {

	public static void main(String[] args) {
		Human obj1 = new Human("Aditya", 18);		
		Human obj2 = new Human("Ajay", 19);
		
		System.out.println(Human.population);
		
		//Below both statements will also work but it's not advicable to use it
//		System.out.println(obj1.population);
//		System.out.println(obj2.population);
	}

}

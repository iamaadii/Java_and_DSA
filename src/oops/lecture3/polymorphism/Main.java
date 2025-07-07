package oops.lecture3.polymorphism;

class Shape{
	void area() {
		System.out.println("from shape area()");
	}
}


class Square extends Shape{
	void area() {
		System.out.println("from square area()");
	}
}
class Circle extends Shape{
	void area() {
		System.out.println("from circle area()");
	}
}

public class Main {

	public static void main(String[] args) {
		Shape obj1 = new Shape();
		obj1.area();
		
		// here which method will be called depends on the object and this is also known as up-casting
		Shape obj2 = new Square(); 
		obj2.area();
	}

}

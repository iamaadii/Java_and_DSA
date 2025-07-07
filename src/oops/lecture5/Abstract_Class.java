package oops.lecture5;

abstract class Parent {

	abstract void career(String name);
}


class Child extends Parent{

	@Override
	void career(String name) {
		System.out.println("My aim is to become a " + name);
	}
	
}

public class Abstract_Class{
	public static void main(String[] args) {
		Child obj = new Child();
		obj.career("Engineer");
	}
}

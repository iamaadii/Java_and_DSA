package oops.lecture1;

class Student{
	String name;
	int rollno;
	float marks=90;
}


public class ClassAndObjects {

	public static void main(String[] args) {
		
		Student aditya = new Student(); // creating instance/object of the class Student
		System.out.println(aditya.name);
		System.out.println(aditya.rollno);
		System.out.println(aditya.marks);
		
		aditya.name = "Aditya Patel";
		aditya.rollno = 33;
		aditya.marks = 56.5f;
		System.out.println(aditya.name);
		System.out.println(aditya.rollno);
		System.out.println(aditya.marks);
	}

}

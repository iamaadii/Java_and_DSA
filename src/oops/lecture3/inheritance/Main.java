package oops.lecture3.inheritance;

class Box1{
	double l;
	double h;
	double w;
	
	public Box1() {
		this.l=-1;
		this.h=-1;
		this.w=-1;
	}
	
	Box1(double l,double h,double w){
		this.l=l;
		this.w=w;
		this.h=h;
	}
}

class BoxWeight extends Box1{
	double weight;
	
	public BoxWeight() {
		this.weight=-1;
	}
	
	public BoxWeight(double l,double h,double w,double weight) {
		super(l,h,w); // it is used to call the parent class constructor from child class
		this.weight=weight;
	}
}

public class Main {
	public static void main(String[] args) {
		
		BoxWeight obj1 = new BoxWeight();
		System.out.println(obj1.l+" "+obj1.h+" "+obj1.w+" "+obj1.weight);
		
		BoxWeight obj2 = new BoxWeight(1,2,3,4);
		System.out.println(obj2.l+" "+obj2.h+" "+obj2.w+" "+obj2.weight);
		
		Box1 obj3 = new BoxWeight(3,4,5,6);
		System.out.println(obj3.l+" "+obj3.h+" "+obj3.w);
		
		
		//type of the reference variable determines what members can be accessed that's 
		// why here we cannot accessed weight because it is not a member of Box1 class
//		System.out.println(obj3.weight); 
		
		//BoxWeight obj4 = new Box1(3,4,5); it will give error
	
	}
}
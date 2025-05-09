package conditional_and_loops;

public class Largest_Of_Three_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10;
		int b=20;
		int c=30;
		
		int max=10;
		
		if(b>max) {
			max=b;
		}
		if(c>max) {
			max=c;
		}
		
		System.out.println("largest number : "+max);
		
		
		//through inbuilt function
		int maximum = Math.max(450,Math.max(240,130));
		System.out.println("maximum : "+ maximum);
	}

}

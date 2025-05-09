package conditional_and_loops;

public class Count_Occurence_Of_Each_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 552451;
		int count=0;
		
		while(num>0) {
			int rem=num%10;
			if(rem==5) {
				count++;
			}
			num=num/10;
		}
		
		System.out.println("Occurence of 5 is "+ count);
	}

}
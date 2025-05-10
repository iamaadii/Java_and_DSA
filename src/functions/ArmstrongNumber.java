package functions;

public class ArmstrongNumber {

	public static void main(String[] args) {
		fun(153);
	}
	
	static void fun(int num)
	{
		int sum=0;
		int temp=num;
		
		while(num>0)
		{
			int rem = num % 10;
			sum=sum+(rem*rem*rem);
			num=num/10;
		}
		
		if(temp==sum) {
			System.out.println("Its a armstrong number");
		}
		else {
			System.out.println("Its not a armstrong number");			
		}
	}

}

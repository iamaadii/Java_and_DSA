package conditional_and_loops;
import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any operator : ");
		char op = sc.next().charAt(0);
		
		int a=24,b=4,res=0;
		
		switch(op) 
		{	
			case '+':
				res=a+b;
				break;
				
			case '-':
				res=a-b;
				break;
				
			case '*':
				res=a*b;
				break;
			
			default:
				System.out.println("Invalid operator");
		}
		
		System.out.println("Result : "+res);

	}

}

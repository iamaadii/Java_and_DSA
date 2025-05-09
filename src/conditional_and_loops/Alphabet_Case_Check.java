package conditional_and_loops;
import java.util.Scanner;

public class Alphabet_Case_Check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string : ");
		char c = sc.next().trim().charAt(0);
		
		if(c>='a' && c<='z') {
			System.out.println("lowercase");
		}
		if(c>='A' && c<='Z') {
			System.out.println("Uppercase");
		}
	}

}

package string;
import java.util.Scanner;

public class Pallindrome {

	public static void main(String[] args) {
		String a = "Madam".toLowerCase();
		
		if(fun(a)) {
			System.out.println("Pallindrome");
		}
		else {
			System.out.println("Not pallindrome");
		}

	}
	
	static Boolean fun(String s) {
		int i=0;
		int j=s.length()-1;
		
		if(s==null)
			return true; 
		
		while(i<=j) {
			if(s.charAt(i) != s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
}

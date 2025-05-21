package string;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {
		String a = "Aditya Patel";
		System.out.println(Arrays.toString(a.toCharArray()));
		System.out.println(a.length());
		System.out.println(a.charAt(0));
		System.out.println(a.toLowerCase());
		System.out.println(a.toUpperCase());
		System.out.println(a.indexOf('d'));
		System.out.println("         uhfddb   ".strip());
		System.out.println(Arrays.toString(a.split(" ")));
	}

}

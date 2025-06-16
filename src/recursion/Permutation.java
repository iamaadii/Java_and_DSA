package recursion;

import java.util.ArrayList;

public class Permutation {

	public static void main(String[] args) {
		fun1("","abc");
		System.out.println(fun2("", "abc"));
		System.out.println(count("", "abcd"));
	}
	
	static void fun1(String res,String s) {
		if(s.isEmpty()) {
			System.out.println(res);
			return;
		}
		
		char ch = s.charAt(0);
		for(int i=0;i<res.length()+1;i++) {
			String f = res.substring(0, i); //here i will not be include
			String l = res.substring(i,res.length());
			
			fun1(f+ch+l,s.substring(1));
		}
	}
	
	static ArrayList<String> fun2(String res,String s) {
		if(s.isEmpty()) {
			ArrayList<String> list = new ArrayList<>();
			list.add(res);
			return list;
		}
		
		ArrayList<String> result = new ArrayList<>();

		char ch = s.charAt(0);
		for(int i=0;i<res.length()+1;i++) {
			String f = res.substring(0, i); //here i will not be include
			String l = res.substring(i,res.length());
			
			ArrayList<String> temp = fun2(f+ch+l,s.substring(1));
			result.addAll(temp);
		}
		return result;
	}
	
	static int count(String res,String s) {
		if(s.isEmpty()) {
			ArrayList<String> list = new ArrayList<>();
			list.add(res);
			return 1;
		}
		
		int count=0;
		
		char ch = s.charAt(0);
		for(int i=0;i<res.length()+1;i++) {
			String f = res.substring(0, i); //here i will not be include
			String l = res.substring(i,res.length());
			
			int temp = count(f+ch+l,s.substring(1));
			count+=temp;
		}
		return count;
	}
}

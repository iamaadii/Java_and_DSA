package recursion.lecture7;

import java.util.ArrayList;

import array_and_arrayList.Array_List;

public class Subsequence {

	public static void main(String[] args) {
		subseq1("","abc");
		System.out.println(subseq2("", "abc"));
		subseqAscii("", "ab");
	}
	
	static void subseq1(String res, String s) {
		if(s.isEmpty()) {
			System.out.println(res);
			return;
		}
		subseq1(res+s.charAt(0), s.substring(1));
		subseq1(res, s.substring(1));
	}
	
	static ArrayList<String> subseq2(String res, String s) {
		if(s.isEmpty()) {
			ArrayList<String> list = new ArrayList<>();
			list.add(res);
			return list;
		}
		ArrayList<String> left = subseq2(res+s.charAt(0), s.substring(1));
		ArrayList<String> right = subseq2(res, s.substring(1));
		left.addAll(right);
		return left;
	}
	
	static void subseqAscii(String res, String s) {
		if(s.isEmpty()) {
			System.out.println(res);
			return;
		}
		
		char ch = s.charAt(0);
		subseqAscii(res+ch, s.substring(1));
		subseqAscii(res+(ch+0), s.substring(1));
		subseqAscii(res, s.substring(1));
	}
}

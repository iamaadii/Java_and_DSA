package recursion.lecture9;

import java.util.*;

public class LetterCombinationOfPhoneNumber {

	public static void main(String[] args) {
		System.out.println(fun("",""));
//		fun("","123");
	}
	
	static List<String> fun(String res,String s){
		if(s.isEmpty()) {
			List<String> l = new ArrayList<>();
			l.add(res);
			return l;
		}
		
		List<String> temp = new ArrayList<>();
		int digit = s.charAt(0) - '0';
		
		if(digit==7) {
			int i = (digit-2)*3;
			while(i<=digit*3-3) {
				List<String> l1 = fun(res+(char)('a'+i),s.substring(1));
				temp.addAll(l1);
				i++;
			}
		}
			
		else if(digit==9) {
			int i = (digit-2)*3 + 1;
			while(i<=digit*3-2) {
				List<String> l1 = fun(res+(char)('a'+i),s.substring(1));
				temp.addAll(l1);
				i++;
			}
		}
		
		else if(digit==8) {
			int i = (digit-2)*3 + 1;
			while(i<=digit*3-3) {
				List<String> l1 = fun(res+(char)('a'+i),s.substring(1));
				temp.addAll(l1);
				i++;
			}
		}
		
		else if(digit>=2 && digit<=6) {
			int i = (digit-2)*3;
			while(i<digit*3-3) {
				List<String> l1 = fun(res+(char)('a'+i),s.substring(1));
				temp.addAll(l1);
				i++;
			}
		}
		else {
			List<String> l1 = fun(res,s.substring(1));
			temp.addAll(l1);
		}
		return temp;
	}

}

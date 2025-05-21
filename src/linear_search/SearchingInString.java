package linear_search;

public class SearchingInString {

	public static void main(String[] args) {
		String str = "Aditya";
		System.out.println(fun(str,'d'));

	}
	
	static boolean fun(String s, char c) {
		for(int i=0;i<s.length();i++) {
			if(c==s.charAt(i))
				return true;
		}
		return false;
	}

}

package recursion;

public class StringOperation {

	public static void main(String[] args) {
		System.out.println(skipaCharacter("aadaca",0,new StringBuilder()));
		System.out.println(skipApple("I am eating apple right now"));
		System.out.println(skipApp("I am eating applc right now"));
	}
	
	static String skipaCharacter(String s,int index,StringBuilder res) {
		if(index==s.length()) {
			return res.toString();
		}
		
		if(s.charAt(index) != 'a') {
			res.append(s.charAt(index));
		}
		return skipaCharacter(s, index+1, res);
		
	}
	
	static String skipApple(String s) {
		if(s.isEmpty()) {
			return "";
		}
		
		if(s.startsWith("apple")) {
			return skipApple(s.substring(5));
		}
		else {
			return s.charAt(0) + skipApple(s.substring(1));
		}
	}
	
	
	static String skipApp(String s) { //skip "app" when it not starts with apple 
		if(s.isEmpty()) {
			return "";
		}
		
		if(s.startsWith("app") && !s.startsWith("apple") ) {
			return skipApp(s.substring(3));
		}
		else {
			return s.charAt(0) + skipApp(s.substring(1));
		}
	}
}

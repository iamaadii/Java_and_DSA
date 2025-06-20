package recursion.lecture9;

import java.util.*;

public class NumberOfDiceRollsWithTargetSum {

	public static void main(String[] args) {
		System.out.println(fun("", 3));

	}
	
	static List<String> fun(String res , int target){
		if(target==0) {
			List<String> l = new ArrayList<>();
			l.add(res);
			return l;
		}
		
		List<String> temp = new ArrayList<>();
		for(int i=1;i<=6 && i<=target;i++) {
			List<String> l = fun(res+i,target-i);
			temp.addAll(l);
		}
		return temp;
	}

}

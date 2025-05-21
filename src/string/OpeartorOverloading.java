package string;
import java.util.*;

public class OpeartorOverloading {

	public static void main(String[] args) {
		System.out.println('a' + 'b');
        System.out.println("a" + "b");
        System.out.println('a' + 3);
        System.out.println((char)('a' + 3));
        System.out.println("a" + 1);
        
        System.out.println("Kunal" + new ArrayList<>());
        System.out.println("Kunal " + new Integer(56));
        System.out.println(new Integer(56) + "" + new ArrayList<>());
	}

}

package functions;

public class Block_Scope {
		
	public static void main(String[] args) 
	{
		int a = 10;
	    int b = 20;
	    {
	        //int a = 78; // cannot initialize it again
	        a = 100; // reassign the origin reference variable to some other value
	        System.out.println(a);
	        int c = 99; // values initialized in this block, will remain in block
	    }
	    
	    int c = 900; //can initialized it outside the block
	    //c=700; // cannot reuse it
	    System.out.println(a);
	    //System.out.println(c); // cannot use outside the block
	}
}



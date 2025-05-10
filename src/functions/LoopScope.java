package functions;

public class LoopScope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10;
		
		for(int i=0;i<5;i++)
		{
//			int a=20; //cannot re-initailized it again 
			a=100; // can use it again
		}
		
		System.out.println(a);

	}
}

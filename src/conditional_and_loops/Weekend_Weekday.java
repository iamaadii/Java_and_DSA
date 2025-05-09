package conditional_and_loops;

public class Weekend_Weekday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int day=1;
		
		switch(day)
		{
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
				System.out.println("weekday");
				break;
			case 6:
			case 7:
				System.out.println("Weekend");
				break;
		}
		
		switch(day)
		{
			case 1,2,3,4,5 -> {
				System.out.print("Week"); 
				System.out.println("Day");
			}
			
			case 6,7 -> System.out.println("Weekend");
		}
		
	}

}

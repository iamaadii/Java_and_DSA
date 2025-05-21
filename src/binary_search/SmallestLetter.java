package binary_search;

public class SmallestLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[] arr= {'c','f','j'};
		System.out.println(nextGreatestLetter(arr,'a'));

	}

	 static char nextGreatestLetter(char[] letters, char target) {

	     int start = 0;
	     int end = letters.length - 1;

	     while(start <= end) {
	            // find the middle element
	        int mid = start + (end - start) / 2;
	        if (target < letters[mid]) {
	            end = mid - 1;
	         } else {
	            start = mid + 1;
	         }
	     }
	     return letters[start % letters.length];
	 }
}

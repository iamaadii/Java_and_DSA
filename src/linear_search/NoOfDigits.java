package linear_search;

public class NoOfDigits {

	public static void main(String[] args) {
        System.out.println(digits(-345678));
        System.out.println(digits2(345678));
    }
    
    static int digits2(int num) {
        if (num < 0) {
            num = num * -1;
        }
        return (int)(Math.log10(num)) + 1;
    }

    // count number of digits in a number
    static int digits(int num) {
        if (num == 0) {
            return 1;
        }
        
        if(num<0)
        	num = num*-1;

        int count = 0;
        while (num > 0) {
        	int rem=num%10;
            count++;
            num = num / 10;
        }
        return count;
    }


}
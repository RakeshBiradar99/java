package rakesh;
import java.util.Scanner;
public class oddoreven {
		  public static void main(String args[])
	  {
	    int n;
	    System.out.println("Enter a number:");
	    Scanner sc = new Scanner(System.in);
	    n = sc.nextInt();

	    /* If number is divisible by 2 then it's an even number
	     * else odd number*/
	    if ( n % 2 == 0 )
	        System.out.println("Entered number is even");
	     else
	        System.out.println("Entered number is odd");
	  }
	}

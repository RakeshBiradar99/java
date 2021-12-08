package rakesh;

public class fibanoci {
	  public static void main(String[] args) {

		    int i = 1, n = 20, f1= 0, f2 = 1;
		    System.out.println("Fibonacci Series " + n + " is:");

		    while (i <= n) {
		      System.out.print(f1 + ", ");

		      int f = f1+ f2;
		      f1 = f2;
		      f2 = f;

		      i++;
		    }
		  }
}

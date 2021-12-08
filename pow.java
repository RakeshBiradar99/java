package rak;

public class pow {

		  public static void main(String[] args) {
		 
		    int p = 3;
		    int n = 4;
		    int r = 1;
		    System.out.print(n +" raised to power " + p +" is : ");
		 
		    while (p > 0) {
		      
		      r= r * n;
		     
		      p--;
		    }
		    System.out.print(r);
		  }
		
}


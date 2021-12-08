package rak;

public class arithmatic {
	
	public static void main(String args[])
	   {
	      try{
	         int num1=20, num2=0;
	         int res=num1/num2;
	         System.out.println ("Result: "+res);
	      }
	      catch(ArithmeticException e){
	         System.out.println ("You Shouldn't divide a number by zero");
	      }
	   }
		  }
		

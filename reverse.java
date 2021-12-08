package rak;
import java.util.*;
public class reverse {
	
	public static void main(String args[]) {
	String word, rev="";
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the string to reverse");
	word=sc.nextLine();
	int length=word.length();
	for(int i=length-1;i>=0;i--)
	  rev=rev+word.charAt(i);
	System.out.println("Reversed string: "+rev);
	}
	}


package rak;
import java.util.Scanner;
public class countvow {
	
	   public static void main(String args[]){
	     char array[]= {'a','b','c','r','u'};
	     int count=0;
	     int length=array.length;
	      for (int i=0 ; i<length; i++){
	        
	         if(array[i]== 'a'|| array[i] == 'e'|| array[i] == 'i' || array[i] == 'o' ||array[i] == 'u'){
	            count ++;
	         }
	      }
	      System.out.println("Number of vowels in the given sentence is "+count);
	   }
	}


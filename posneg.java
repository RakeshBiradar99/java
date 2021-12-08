package rakesh;
import java.util.Scanner;
public class posneg {
	public static void main(String[] args) 
    {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want to check:");
        number = sc.nextInt();
        
        if(number > 0)
        {
            System.out.println(number+" is positive number");
        }
        else if(number < 0)
        {
            System.out.println(number+" is negative number");
        }
        else
        {
            System.out.println(number+" is neither positive nor negative");
        }
    }
}

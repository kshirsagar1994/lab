//Write a Java method to find the smallest number among three numbers. 

package Labwork30march;
import java.util.Scanner;
public class SmallestNumber {
	
	
	
	 public static void main(String[] args)
	    {
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Input the first number: ");
	        double a = sc.nextDouble();
	        
	        System.out.print("Input the Second number: ");
	        double b = sc.nextDouble();
	        
	        System.out.print("Input the third number: ");
	        double c = sc.nextDouble();
	        
	        System.out.print("The smallest value is " + smallest(a, b, c)+"\n" );
	    }

	   public static double smallest(double a, double b, double c)
	    {
	        return Math.min(Math.min(a, b), c);
	    }
}

/*You are given a class AdvancedArithmetic which contains a method signature int divisor_sum(int n). You need to 
 * write another class called MyCalculator which implements the method. divisorSum method just takes an integer as 
 * input and return the sum of all its divisors. For example divisors of 6 are 1, 2, 3 and 6, so divisor_sum should 
 * return 12. The value of n will be at most 1000.
   Read the partially completed code in the editor and complete it. You just need to write the MyCalculator class only. 
   Your class shouldn't be public
*/


package Labwork30march;
import java.util.Scanner;
//public class AdvancedArithmetic {
		
	interface AdvancedArithmetic {
	  int divisor_sum(int n);

		public static void main(String[] args) {
		    System.out.println("Enter n: ");
		    Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
			MyCalculator c = new MyCalculator();
			System.out.println(c.divisor_sum(n) + "\n");
		}
	}


	class MyCalculator implements AdvancedArithmetic{
	    
	    public int divisor_sum(int n){
	        int sum1 = 1;
	        for (int i=2;i<=n;i++){
	            if (n%i == 0){
	                sum1 = sum1 + i;
	            }
	        }
	        return sum1;
	  }
}


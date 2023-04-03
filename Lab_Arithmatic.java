/*A class named Arithmetic with a method named add that takes integers as parameters and
returns an integer denoting their sum. 2. A class named Adder that inherits from a superclass named Arithmetic.

Input Format
test your submission by calling the add method on an Adder object and passing it integer parameters.
*/

package inheritance;
// class assignment pgm of inheritance 
class Arithmatic1 {
	 public int add(int a, int b) {
	        return a + b;
	    }
	}

	class Adder extends Arithmatic1 {
	    // This class inherits the add method from Arithmetic
	}

	public class Lab_Arithmatic {
	    public static void main(String[] args) {
	        Adder adder = new Adder();
	        int sum = adder.add(21, 50);
	        System.out.println("The Sum is: " + sum);
	    }	
}

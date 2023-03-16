// Q.2 Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.

class calculator{

public static void main(String args[]) {

	int a=10;
	int b=5;
	int add, sub, mul, div;
	
	System.out.println("The value of A:"+a);
	System.out.println("The value of B:"+b);


	add = a + b;
	mul = a * b; 
	div = a / b;
	sub = a - b;

	System.out.println("The addition of A and B is :"+add );
	System.out.println("The multiplication of A and B is :"+mul );
	System.out.println("The substraction of A and B is :"+div );
	System.out.println("The division of A and B is :"+sub );

}
}
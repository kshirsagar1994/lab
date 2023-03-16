// Q3. Write a Java program to swap two variables.

class swap{

public static void main(String args[]) {

	int a=10;
	int b=20;
	int temp;

	System.out.println("before swap the value of A is: 10");
	System.out.println("before swap the value of B is: 20");

     temp = a;
     a = b;
     b = temp;

	System.out.println("After swap the value of A is: "+a);
	System.out.println("After swap the value of B is: "+b);

}
}
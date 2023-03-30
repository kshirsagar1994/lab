package Labwork30march;

public class Student {
	
		// Instance variables
	    String name;
	    int rollNo;
	    String className;
	    char division;

	 // Constructor to initialize the instance variables
	    public Student(String name, int rollNo, String className, char division) {
	        this.name = name;
	        this.rollNo = rollNo;
	        this.className = className;
	        this.division = division;
	    }

	    public static void main(String[] args) {
	    	// Creating an object of the Student class and passing the values
	        Student student1 = new Student("ak", 07, "Cyber security", 'A');
	     // Printing the student details
	        System.out.println("Student Details:");
	        System.out.println("\tName: " + student1.name);
	        System.out.println("\tRoll No: " + student1.rollNo);
	        System.out.println("\tClass: " + student1.className);
	        System.out.println("\tDivision: " + student1.division);
	    }
	}

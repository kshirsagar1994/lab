//Create a new class Student(id,name,roll) where the values are going to get stored in an arraylist and 

//compared according to the roll no and print the sorted list.
package Collection;
import java.util.*;

//public class LAB_Student implements Comparable<LAB_Student> {
public class LAB_Student {
	
	private int id;
	private String name;
	private int roll;
	
	public LAB_Student(int id, String name, int roll) 
	{
		this.id=id;
		this.name=name;
		this.roll=roll;
		
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public int getRoll() {
		return roll;
	}
	
	public static void main(String[] args) {
	
		// creating the list of students
        List<LAB_Student> students = new ArrayList<>();
        
        // add some students to the list
        students.add(new LAB_Student(1, "Ajay", 2));
        students.add(new LAB_Student(2, "Susmit", 4));
        students.add(new LAB_Student(3, "Prajwal", 5));
        students.add(new LAB_Student(4, "Aishwarya", 1));
        students.add(new LAB_Student(5, "Priyanka", 3));
        
        // sort the list by roll number using a comparator
        Comparator<LAB_Student> byRoll = Comparator.comparing(LAB_Student::getRoll);
        
        // sort the list according to roll number
        Collections.sort(students, byRoll);
        
        // print the sorted list
        for (LAB_Student student : students) 
        {
            System.out.println("ID: " + student.getId() + ", Name: " + student.getName() + ", Roll: " + student.getRoll());
        }
	}
		/*
	@Override
	public int compareTo(LAB_Student o) {
		
		return 0;
		*/
	
}


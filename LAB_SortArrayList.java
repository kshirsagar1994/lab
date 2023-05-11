//WAP where the type of arraylist is of type String, take the input from the user using Scanner and print it in ascending order.

package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LAB_SortArrayList {
	public static void main(String[] args) {
		//crate an array list
		ArrayList<String> arrList=new ArrayList<String>();
		
		//get the input from user 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		
		while (sc.hasNextLine()) 
		{
			String input = (sc.nextLine());
			
			if (input.isEmpty()) 
			{
				break;
			}
			arrList.add(input);
		}
		sc.close();		
		
		// Sort the array list in ascending order
        Collections.sort(arrList);

        // Print the sorted array list
        System.out.println("Sorted Array List: " + arrList);
	}

}

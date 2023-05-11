//Write a Java program to join two array lists.

package Collection;

import java.util.ArrayList;
import java.util.List;

public class LAB_JoinArrayList {
	public static void main(String[] args) {
		
		 // Create the first array list
        List<String> List1 = new ArrayList<String>();
        List1.add("vine disel");
        List1.add("james bond");
        
        // Create the second array list
        List<String> List2 = new ArrayList<String>();
        List2.add("The Racer");
        List2.add("The Agent");
        
        // Join the two array lists
        List<String> joinedArrayList = new ArrayList<String>();
        joinedArrayList.addAll(List1);
        joinedArrayList.addAll(List2);
        
     // Print the joined array list
        System.out.println("Joined Array List: " + joinedArrayList);
	}

}

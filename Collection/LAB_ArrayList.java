//Write a Java program to print all the elements of an ArrayList using the elements' position.

package Collection;
import java.util.ArrayList;

public class LAB_ArrayList {
	public static void main(String[] args) {
		
		//create a Array List
		ArrayList<String> list1=new ArrayList<String>();
		list1.add("John Wick");
		list1.add("Fast X");
		list1.add("Transformet");
		
		//print the element of the array_list using position
		
		for(int i=0;i<list1.size();i++)
		{
			System.out.println("Element position is:"+ i + ": " + list1.get(i));
		}	
	}
}

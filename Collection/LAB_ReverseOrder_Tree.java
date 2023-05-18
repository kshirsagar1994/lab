//Write a Java program to create a reverse order view of the elements contained in 
//a given tree set using descending iterator.

package Collection;
import java.util.TreeSet;
import java.util.Iterator;


public class LAB_ReverseOrder_Tree {
	public static void main(String[] args) {
		TreeSet<String> ts=new TreeSet<String>();
		ts.add("Ajay");
		ts.add("Asihwarya");
		ts.add("kshirsagar");
		ts.add("Patil");
		
		//// create a descending iterator
	    Iterator<String> descendingIterator = ts.descendingIterator();
	    
	    // print the elements in reverse order
	    System.out.println("Elements in reverse order:");
	    while (descendingIterator.hasNext())
	    {
	    	System.out.println(descendingIterator.next());
	    }
	}
}

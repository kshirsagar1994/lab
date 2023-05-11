//Write a Java program to join two array lists.

package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class LAB_ReverseArrayList {
	public static void main(String[] args) {
		
		//create a arrya list
		ArrayList<String> ArrList=new ArrayList<String>();
		ArrList.add("John Wick");
		ArrList.add("Fast X");
		ArrList.add("Transformet");
		
		//reverse the array list in decending order 
		Collections.sort(ArrList, Collections.reverseOrder());
		
		//print reverse array list 
		System.out.println("The Reverse Array List is:"+ArrList);
		
	}
}

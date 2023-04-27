package String;

public class StringManipulationLab {
	
	public static void main(String[] args) {
        String welcome = "Welcome to Java World";
        
        // Returns the character at 5th position and display it.
        char charAt5 = welcome.charAt(4);
        System.out.println("Character at 5th position: " + charAt5);
        
        // Compares the above String with “Welcome” lexicographically ignoring case differences and display the result.
        int comparisonResult = welcome.compareToIgnoreCase("Welcome");
        System.out.println("Comparison result: " + comparisonResult);
        
        // Concatenates “- Let us learn” to the above string and display it.
        String concatenated = welcome.concat("- Let us learn");
        System.out.println("Concatenated string: " + concatenated);
        
        // Returns the position of the first occurrence of character ‘a’ and display it.
        int indexOfA = welcome.indexOf('a');
        System.out.println("Index of first occurrence of 'a': " + indexOfA);
        
        // Replaces all the occurrences of ‘a’ character with the new ‘e’ and display it.
        String replaced = welcome.replace('a', 'e');
        System.out.println("Replaced string: " + replaced);
        
        // Returns string between 4th position and 10th position and display it.
        String substring = welcome.substring(3, 10);
        System.out.println("Substring between 4th and 10th position: " + substring);
        
        // Returns the lowercase of the string and display it.
        String lowercase = welcome.toLowerCase();
        System.out.println("Lowercase string: " + lowercase);
    }

}

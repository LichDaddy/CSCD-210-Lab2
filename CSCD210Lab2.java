import java.util.Scanner;

public class CSCD210Lab2{
	public static final int YEAR = 2020;
	
	public static void main(String [] args){
	
		// Scanner instantiation // 
		Scanner userInput = new Scanner(System.in);

		// Start of Name Section // 
		System.out.print("Please enter your full name: ");
		String name = userInput.nextLine();

        // charAt gets the character at the specified index
		// This will get the first letter of the users name	
		char firstLetter = name.charAt(0);	
		
		// This will get the last letter of the users name 
		char lastLetter = name.charAt( (name.length()) - 1 );
		
		// This is to get the middle names of the user 
        // these find the substrings of the first and last blank
        String whiteSpace = " ";
		int firstBlank = name.indexOf(whiteSpace);
		int lastBlank = name.lastIndexOf(whiteSpace);
		
        // grabs the substring of the position of indexes passed in the parameters
		String middleName = name.substring(firstBlank, lastBlank);
	    // End of Name Section // 
	
		// Birth Year Section // 
		System.out.print("Please enter your birth year: ");
		int birthYear = Integer.parseInt(userInput.nextLine());

		// Start of Char Section // 
		// We will get the letter to replace from our user
		System.out.print("Please enter a single letter: ");
		String character = userInput.nextLine();
		char single = character.charAt(0);

		
		// This will get the name with '$' symbols in it
		String moneyName = name.replace(single, '$');		
		
		// Start of HashCode section // 
		// hashCode equation 
		int hCode = CSCD210Lab2.YEAR + birthYear + name.hashCode();	

		// outputs section // 
		System.out.println(); // endl

		// start of name section //
		System.out.print("The first letter of your name: ");
		System.out.println(firstLetter);
		
		System.out.print("The last letter of your name: ");
		System.out.println(lastLetter);		
		
		System.out.print("Your middle name is:");
		System.out.println(middleName);	
	
		// start of hashCode section // 
		System.out.print("The hashCode of your name added to the year of 2020 and your birth year of " + birthYear + " is: ");
		System.out.println(hCode); // endl
		
		// start of character replace section //
		System.out.printf("Replacing all the characters of " + single + " in your name becomes: %s\n", moneyName);

		System.out.println(); // endl
		System.out.print("Have a nice day!");
		System.out.println(); // endl
		
		// closing the input stream //
		userInput.close();	
	} 

} 
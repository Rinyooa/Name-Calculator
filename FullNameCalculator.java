/**Student Name: First Last

*Date Completed: 04/18/2022

*Project No. and Page No. in the book: Chapter 4 PPII

*Extra Credit: No

*Project Description: Utilized necessary while loops, for loops, and if statements to create a program that can retrieve the user's full name to 
*implement the number of letters in the user's name as a variable for amount of numbers the user can enter to do addition, as well as giving the user the option to exit the loop.

**/

package namecalculator;

import java.util.Scanner;

public class FullNameCalculator {
	public static void main(String []args) {
		// declared necessary variables
		final String MESSAGE = "~~~~~Welcome to Blue Bird System!!~~~~~", EXIT_MESSAGE = "Thank you for using the system. Come back soon.";
		String fullName = "temp" ; 
		int nameLength, numEntered, sum = 0, numOfLetters= 0, numOfColumn=1;
		
		//using the while loop to ensure user has a means to leave program at the start of initialization
		while(!fullName.equalsIgnoreCase("quit")) { 
			
			
			Scanner scan = new Scanner(System.in); //scan put inside of loop so that it can be reinitialized each time
			
			
			System.out.println();
			System.out.println(MESSAGE);
			System.out.println();
			System.out.println("Please enter your full name, and enter \"Quit or quit\" to quit:");	
			
		//retrieving user input as well as obtaining the length of user's name	
		fullName = scan.nextLine(); 
		nameLength = fullName.length();

		// using a for loop and if statement to set necessary parameters to count only letters in the name and ignore empty space 
		for (int i = 0; i < nameLength; i++ ) {
			if (fullName.charAt(i) != ' ') 
				numOfLetters++;				
		} 
		
		//making sure it breaks out of the while loop if user enters quit
		if (fullName.equalsIgnoreCase("quit"))
			break;
			
		
		System.out.println("Please enter " + numOfLetters + " numbers and the total will be calculated"); 
		
		//using while loop to create an area where user can input numbers to be summed up
		while (numOfColumn <= numOfLetters) {
			System.out.print("number " + numOfColumn + " : "); 
			numEntered = scan.nextInt();
			numOfColumn++;
			sum += numEntered;	
		}
		
		//Displaying results to user
		System.out.println();
		System.out.println("Good day, " + fullName + "! You have entered " + numOfLetters + " numbers");
		System.out.println("The total of all the numbers is " + sum);
		
		//reinitializing variables that were incremented
		numOfLetters = 0;
		numOfColumn = 1;
		sum = 0;
		
	
		}	System.out.println(EXIT_MESSAGE); //exit message displayed when user input equals "quit"
	}		
}

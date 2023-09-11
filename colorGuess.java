/*
 * Class: CMSC203 
 * Instructor: Professor Khandan Monshi
 * Description: (A game that generates a rand num and makes user guess for color)
 * Due: 9/12/2023
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment 
 * independently. I have not copied the code from a student or any source. I have not given my code to any student.
 * Print your Name here: Josue Castro
*/
import java.util.Scanner;
import java.util.Random;
// ^ The Scanner allows for us to read input
public class colorGuess 
{
	public static void main(String[] args) 
	{
		// Constant strings defined below
		final String COLOR_RED = "red", COLOR_GREEN = "green", COLOR_BLUE = "blue", COLOR_ORANGE = "orange", COLOR_YELLOW = "yellow";
		// These strings are the ones the user will input to. No need for constant.
		String name, description, dueDate, guessColor, mcNum, colorAssignment = "";
		
		// The integer below will keep track for guesses that were right out of 10
		// NOTE: Since we know the loop ends at 10 rounds no need to create integer for 10
		int correctGuess = 0;
		
		// Scanner allows for user input
		Scanner input = new Scanner(System.in);
		// Asking user for input in which we will display later ends at line 38
		System.out.println("Enter your name:");
		name = input.nextLine();
		
		System.out.println("What is your MC M#");
		mcNum = input.nextLine();
		
		System.out.println("Describe yourself:");
		description = input.nextLine();
			
		System.out.println("Due Date: ");
		dueDate = input.nextLine();
			
		System.out.println("CMSC203 Assigment 1: Test your ESP skills!");
		// Creates a random number, we will use this for the game
		Random random = new Random();		
		// Start of for loop. Does not include number 11 since its less than
		for (int i = 1; i < 12; i++)
		{	

			// using without ln so round and the number i are on the same line
			System.out.print("Round ");
			System.out.println(i + "\n");
			System.out.println("I am thinking of a color.");
			System.out.println("Is it Red, Green, Blue, Orange or Yellow?");
			System.out.println("Enter your guess: ");
			guessColor = input.nextLine().toLowerCase();
			
			// Creates a random number, we will use this for the game
			// The random number generator is in so for each iteration its a different number
			int guess = random.nextInt(6);
			switch(guess) 
			{
				case 1:
					colorAssignment = COLOR_RED;
					break;
				case 2:
					colorAssignment = COLOR_GREEN;
					break;
				case 3:
					colorAssignment = COLOR_BLUE;
					break;
				case 4:
					colorAssignment = COLOR_ORANGE;
					break;
				case 5:
					colorAssignment = COLOR_YELLOW;
					break;
				default:
					// This is one out of two input validation, if for whatever reason any different input will result in asking for a re-input 
					while (!(guessColor.equalsIgnoreCase("red")) && !(guessColor.equalsIgnoreCase("green")) && !(guessColor.equalsIgnoreCase("blue")) && !(guessColor.equalsIgnoreCase("orange")) && !(guessColor.equalsIgnoreCase("yellow")))
					{
						System.out.println("You entered an incorrect color. Is it Red, Green, Blue, Orange or Yellow?");
						System.out.println("Enter your guess again");
						guessColor = input.nextLine().toLowerCase();
					}
					// This if is here to ensure the computer color is displayed, need this in default to make sure color is displayed
					if(guessColor.equals(colorAssignment))
					{
						System.out.println("I was thinking of " + colorAssignment);
						correctGuess++;
					}
					else if(!guessColor.equals(colorAssignment)) 
					{
						System.out.println("I was thinking of " + colorAssignment);
					}
					// This continue makes it so the input will be applied to the same iteration, and will ignore anything after in the for loop found in chapter 4.8.
					continue;
			}
			// End of case and below is start for input valid given user typed in a valid color
			// 2 out of 2 input valid this one is outside to ensure right color is typed and make sure's no issue with case sensitivity.
			while (!(guessColor.equalsIgnoreCase("red")) && !(guessColor.equalsIgnoreCase("green")) && !(guessColor.equalsIgnoreCase("blue")) && !(guessColor.equalsIgnoreCase("orange")) && !(guessColor.equalsIgnoreCase("yellow")))
			{
				System.out.println("You entered an incorrect color. Is it Red, Green, Blue, Orange or Yellow?");
				System.out.println("Enter your guess again");
				guessColor = input.nextLine().toLowerCase();
			}
			// This if, tells users the color it was thinking of and the guess was right will add 1 to correctGuess if else nothing is added since we are fixed on 10 rounds
			if(guessColor.equals(colorAssignment))
			{
				System.out.println("I was thinking of " + colorAssignment);
				correctGuess++;
			}
			else if(!guessColor.equals(colorAssignment)) 
			{
				System.out.println("I was thinking of " + colorAssignment);
			}
		}	
		//^^^ End of for loop
		
		// The code below will display the information that the user inputed for the first three questions and how much out of 10 they got right
		System.out.println("Game Over\n");
		System.out.println("You guessed " + correctGuess + " out of 11 colors correctly.");
		System.out.println("User Name: " + name);
		System.out.println("MC M#: " + mcNum);
		System.out.println("User Description: " + description);
		System.out.println("Due Date: " + dueDate);
	    // Closes scanner :)
		input.close();		
	}
}
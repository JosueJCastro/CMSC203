import java.util.Scanner;
public class MovieDriver {

	/*
	 * Create a new object of type Scanner that reads from the keyboard
	Create a new movie object
	Prompt the user to enter the title of a movie 
	Read in the line that the user types
	Set the title in the movie object
	Prompt the user to enter the movie’s rating
	Read in the line that the user types
	Set the rating in the movie object
	Prompt the user to enter the number of tickets sold at a (unnamed) theater
	Read in the integer that the user types
	Set the number of tickets sold in the movie object
	Print out the information using the movie’s toString method

	 */
	public static void main(String[] args) 
	{
		Movie m1 = new Movie();
			
		Scanner input = new Scanner(System.in);
		String repeat = "";
		
		do {
		System.out.println("Enter a title of a movie");
		m1.setTitle(input.nextLine());
		
		System.out.println("Enter the users rating");
		m1.setRating(input.nextLine());
		
		System.out.println("Enter number of tickets sold at the theater");
		m1.setSoldTickets(input.nextInt());
		
		System.out.print(m1);
		
		System.out.println("\n");
		System.out.println("Do you wanna go again? (y or n)");
		input.nextLine();
		repeat = input.nextLine();
		} while(repeat.equalsIgnoreCase("y"));
		
		
			System.out.println("goodbye");
		
	}
}

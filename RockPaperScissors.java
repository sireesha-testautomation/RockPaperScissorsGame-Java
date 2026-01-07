import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {


	    while(true)  // To repeat the game until the user doesn't want to play the game
	    {
		// Take user choice
		
		System.out.println("Enter your choice");
		System.out.println("0: Rock, 1:Paper, 2: Scissors");
		Scanner scanner = new Scanner(System.in);
		int userChoice = scanner.nextInt();
		System.out.println("User choice is " + userChoice);

		if(userChoice<0 | userChoice>2) //if user input is not valid
			
			System.out.println("Invalid input, Please enter from 0 to 2");	
		
		else  //if user input is not invalid
			
		{ 
			
		//Computer choice
		int compChoice = new Random().nextInt(3); // Generate random number between 0 and 2
		System.out.println("computer choice is " + compChoice);
		
		if(userChoice==compChoice) //if it is tie
		{
			System.out.println("Its a tie, do you want to continue, Enter yes");
			String input = scanner.next();
			if(input.equalsIgnoreCase("no"))
			{	System.out.println("Well played bye");
			    System.exit(0); // To exit the program if user doesn't want to continue
			}
		}
		
		else if((userChoice==0&&compChoice==1) || (userChoice==1&&compChoice==2) || (userChoice==2&&compChoice==0))//if computer wins
			{
			System.out.println("Computer wins, do you want to continue, Enter yes");
			String input = scanner.next();
			if(input.equalsIgnoreCase("no"))
				{System.out.println("Well played bye");
			    System.exit(0);
				}
			}
		
		else 
		{
			System.out.println("User wins, do you want to continue, Enter yes"); //if user wins
			String input = scanner.next();
			if(input.equalsIgnoreCase("no"))
			{	System.out.println("Well played bye");
			 System.exit(0);
			 
			}
		 }
		} 
	}
	   
	}
}

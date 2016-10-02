package com.seerocode;

import java.util.Random; //Capital R!
import java.util.Scanner;

public class GuessMyNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Initialize new random. Sort of like the format of Scanner except no parameter
		Random random = new Random(); 
		
		//Initialize random number variable
		int number;
		//Declare variable to store guess outside of do loop so it can be called outside and inside
		int userGuess;
		
		/**
		 *  Do/while loop tests at the end instead of beginning like with while statements.
		 *  Loop keeps running as long as userGuess does not equal number.
		 * 
		 *  Variable "number" has a random integer between 1 and 100
		 *  The if/else statement checks the user's guess to see if it equals the random number
		 *  and reruns the game if it does not.
		 */
		do {
			//"number" returns the next random integer between 1 and 100.
			number = random.nextInt(100) + 1;
			//Outputs
			System.out.println("I am thinking of a number between 1 and 100 (including both). Can you guess what it is?");
			System.out.println("Type a number: ");
			userGuess = sc.nextInt();
			System.out.printf("Your guess is: %d\n", userGuess);
			
			//Check guess with if/else if
			if (userGuess == number) 
				System.out.println("Wow, you're good! You guessed my number!"
						+ "The number I was thinking of is: " + number
						+ "\nYou were off by: " + (number - userGuess)
						+ "\nSee you later!\n");
			else if (userGuess > number)
				System.out.println("Too high! " 
						+ "The number I was thinking of is: " + number
						+ "\nYou were off by: " + (number - userGuess)
						+ "\nLet's try again!\n");
			else if (userGuess < number)
				System.out.println("Too low! " 
						+ "The number I was thinking of is: " + number
						+ "\nYou were off by: " + (number - userGuess)
						+ "\nLet's try again!\n");
		
		} 
		//Do the above while the guess does not equal the random number
		while (userGuess != number); 
		
	}

}

package com.seerocode;

import java.util.Random; //Capital R!
import java.util.Scanner;

public class GuessMyNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Initialize new random. Sort of like the format of Scanner except no System.in for the parameter.
		Random random = new Random(); 
		
		//Initialize random number variable. The value for variable named "number" will be the next random integer between 1 and 100.
		int number = random.nextInt(100) + 1;
		//Declare variable to store guess. Outside of do loop so it can be called outside and inside as well.
		int userGuess;
		
		//A do loop (test at end instead of beginning like with while) to do the following:  
		do {
			//Outputs
			System.out.println("I am thinking of a number between 1 and 100 (including both). Can you guess what it is?");
			System.out.println("Type a number: ");
			//Initialize userGuess variable
			userGuess = sc.nextInt();
			System.out.printf("Your guess is: %d\n", userGuess);
			
			//Validate guess with if/else if
			if (userGuess == number) 
				System.out.println("Wow, you're good! You guessed my number!"
						+ "The number I was thinking of is: " + number
						+ "\nYou were off by: " + (number - userGuess)
						+ "\nLet's try again!\n");
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

package com.seerocode;

import java.util.Random; //Capital R!
import java.util.Scanner;

public class GuessMyNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Initialize new random. Sort of like the format of Scanner except no System.in for the parameter.
		Random random = new Random(); 
		
		//Use nextInt(100) to generate a random number between (and including) 0 and 99. The + 1 makes this between 0 and 100.
		//This reads as: the value for variable named "number" will be the next random integer between 1 and 100.
		int number = random.nextInt(100) + 1;
		//Declared outside of do loop so it can be used outside and inside as well
		int userGuess;
		
		//A do loop (test at end instead of beginning like with while) to do the following  
		do {
			//Outputs and input
			System.out.println("I am thinking of a number between 1 and 100 (including both). Can you guess what it is?");
			System.out.println("Type a number: ");
			//Initialize userGuess variable
			userGuess = sc.nextInt();
			System.out.printf("Your guess is: %d\n", userGuess);
			
			//Validate guess withh if/else if
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
		//while the guess does not equal the random number
		while (userGuess != number); 
		
	}

}

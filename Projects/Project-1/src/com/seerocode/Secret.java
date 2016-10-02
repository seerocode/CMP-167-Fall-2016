package com.seerocode;

import java.util.Scanner;

public class Secret {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //Creates a new scanner
		
		System.out.print("Type in your secret message: ");
		//Characters entered are stored in the message variable 
		String message = sc.nextLine(); 
		
		//Prints the amount of characters in the user's input message
		System.out.printf("Your secret message has %d characters.\n", message.length()); 
		
		//Computes secret number 
		int secretNumber = (message.length() * 2) + 7; 
		
		//Prints answer to computation for secretNumber variable. 
		//Or could just compute the secret number in the print statement, but creating a variable allows it to be reused
		//in case you want to use that secret number elsewhere
		System.out.printf("Your secret number is %d.", secretNumber); 

	}

}

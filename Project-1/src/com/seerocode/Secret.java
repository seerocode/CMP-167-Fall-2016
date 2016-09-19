package com.seerocode;

import java.util.Scanner;

public class Secret {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //Creates a new scanner
		
		System.out.print("Type in your secret message: ");
		String message = sc.nextLine(); //Characters entered are stored in the message variable and goes to the next line
		
		System.out.printf("The secret message has %d characters.\n", message.length()); //Prints the amount of characters in the user's input message
		
		int secretNumber = (message.length() * 2) + 7; //Computes secret number 
		
		System.out.printf("Your secret number is %d.", secretNumber); 

	}

}

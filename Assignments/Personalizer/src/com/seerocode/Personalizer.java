package com.seerocode;

import java.util.Scanner;

public class Personalizer {

	private static String firstName;
	private static String lastName;

	public Personalizer(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	//Overrides .toString which would otherwise return classname + "@" + a hashcode for constructor
	public String toString() {
        return this.firstName + " " + this.lastName;
    }
	
	//Method returns Sir or Madam depending on user input (ignores casing)
	public static String salutation(String sirOrMadam) {
		if (sirOrMadam.equalsIgnoreCase("Sir")) {
			return "Dear Sir";
		}else if (sirOrMadam.equalsIgnoreCase("Madam")) {
			return "Dear Madam";
		}else {
			return "Please type Sir or Madam";
		}
	}
	
	//Method prints "Good Day" to console
	public static void greeting() {
		System.out.print("Good Day");
	}
	
	//Method returns the length of the first and last name inputs
	public static int lengthOfNames() {
		return firstName.length() + lastName.length();
	}
	
	//Method returns "short" or "long" depending on the value returned in lengthOfNames
	public static String shortLong() {
		if (lengthOfNames() < 8) {
			return "short";
		}
		else {
			return "long";
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Inputs
		System.out.println("What is the first name?");
		String firstName = sc.nextLine();
	    
	    System.out.println("What is the last name?");
	    String lastName = sc.nextLine();
	    
	    //Initializes Personalizer constructor and passes previous inputs to parameters
		Personalizer letter = new Personalizer(firstName, lastName);
		
		System.out.println("Should we address this to Sir or Madam?");
		String sirOrMadam = sc.nextLine();
		
		//While loop for checking input validation if user enters anything other than sir or madam
		while ( !sirOrMadam.equalsIgnoreCase("Madam") && !sirOrMadam.equalsIgnoreCase("Sir") ) {
			System.out.println("Please type Sir or Madam");
			sirOrMadam = sc.nextLine();
		}
		
		sc.close();
		
		//Prints letter based on previous inputs
		System.out.println(salutation(sirOrMadam) + ":");
		greeting();
		System.out.print(", " + letter.toString());
		System.out.println(" is a very " + shortLong() + " name. " + "It has " + lengthOfNames() + " characters. ");
		System.out.println("Sincerely,");
		System.out.println("Your Java Developer Rosemarie");
		
	}
	

}